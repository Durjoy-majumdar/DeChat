package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.vfs.C86013q1;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.FileUnlink */
public final class FileUnlink {
    static {
        C88957l.m111079o("appbrandcommon", FileUnlink.class.getClassLoader());
    }

    public static native int unlink(String str);

    public static int vfsUnlink(String str) {
        return unlink(C86013q1.m106448i(str, true));
    }
}
