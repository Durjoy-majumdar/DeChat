package com.tencent.matrix.resource;

import java.io.File;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.resource.e */
public final class C80527e {
    /* renamed from: a */
    public static final void m98125a(File file) {
        if (file.isDirectory()) {
            return;
        }
        if (!file.exists()) {
            file.mkdirs();
            return;
        }
        throw new IllegalStateException("Path " + file.getAbsolutePath() + " is pointed to an existing element but it is not a directory.");
    }

    /* renamed from: b */
    public static final void m98126b(String str) {
        C118672d.m167353c("Matrix.MemoryUtil", str, new Object[0]);
    }
}
