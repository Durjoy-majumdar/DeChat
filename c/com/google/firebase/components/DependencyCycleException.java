package com.google.firebase.components;

import java.util.List;

public class DependencyCycleException extends DependencyException {

    /* renamed from: d */
    public final List<Component<?>> f339214d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r4.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Dependency cycle detected: "
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = r2.concat(r0)
            goto L_0x001e
        L_0x0019:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x001e:
            r3.<init>(r0)
            r3.f339214d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.DependencyCycleException.<init>(java.util.List):void");
    }
}
