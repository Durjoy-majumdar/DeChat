package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.vfs.C86013q1;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.FileStat */
public class FileStat {
    static {
        C88957l.m111079o("appbrandcommon", FileStat.class.getClassLoader());
    }

    public static native int stat(String str, FileStructStat fileStructStat);

    public static int vfsStat(String str, FileStructStat fileStructStat) {
        return stat(C86013q1.m106448i(str, false), fileStructStat);
    }
}
