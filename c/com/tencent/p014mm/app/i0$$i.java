package com.tencent.p014mm.app;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.tencent.mm.app.i0$$i */
public class i0$$i implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f235813a;

    public i0$$i(C80600i0 i0Var, String str) {
        this.f235813a = str;
    }

    public boolean accept(File file, String str) {
        if (!str.startsWith(this.f235813a)) {
            if (!str.startsWith("java_" + this.f235813a)) {
                StringBuilder sb = new StringBuilder();
                sb.append("NativeCrash_");
                sb.append(this.f235813a);
                return str.startsWith(sb.toString());
            }
        }
    }
}
