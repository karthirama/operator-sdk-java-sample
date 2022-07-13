package com.rama;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.DeleteControl;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

public class BookReconciler implements Reconciler<Book> { 
  private final KubernetesClient client;

  public BookReconciler(KubernetesClient client) {
    this.client = client;
  }

  // TODO Fill in the rest of the reconciler

  @Override
  public UpdateControl<Book> reconcile(Book resource, Context context) {
    System.out.println("Inside update control method");
    return UpdateControl.noUpdate();
  }

  public DeleteControl cleanup(Book resource, Context context) {
    System.out.println("Inside cleanup method");
    return DeleteControl.defaultDelete();
}
}

