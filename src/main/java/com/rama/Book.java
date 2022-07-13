package com.rama;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Version("v1")
@Group("cache.rama.com")
public class Book extends CustomResource<BookSpec, BookStatus> implements Namespaced {}

