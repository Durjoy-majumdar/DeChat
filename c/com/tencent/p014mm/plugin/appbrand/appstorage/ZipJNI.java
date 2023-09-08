package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.vfs.C86013q1;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.ZipJNI */
public class ZipJNI {
    public static final int ERR_ILLEGAL_PATH = 1;
    public static final int ERR_ZIP_FILE_NOT_FOUND = 2;
    public static final int UNZ_BADZIPFILE = -103;
    public static final int UNZ_CRCERROR = -105;
    public static final int UNZ_END_OF_LIST_OF_FILE = -100;
    public static final int UNZ_ERRNO = -1;
    public static final int UNZ_ERR_OPEN_WRITE = -106;
    public static final int UNZ_INTERNALERROR = -104;
    public static final int UNZ_OK = 0;
    public static final int UNZ_PARAMERROR = -102;

    static {
        C88957l.m111079o("appbrandcommon", ZipJNI.class.getClassLoader());
    }

    public static native int unzip(String str, String str2, String str3);

    public static int vfsUnzip(String str, String str2, String str3) {
        return unzip(C86013q1.m106448i(str, false), C86013q1.m106448i(str2, true), str3);
    }
}
