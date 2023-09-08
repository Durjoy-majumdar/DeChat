package com.tencent.p014mm.plugin.appbrand.service;

import di3.C7335d;

/* renamed from: com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService */
public interface IBSPatchJNIService extends C7335d {

    /* renamed from: com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService$ConstantsIncrementalMergeResult */
    public interface ConstantsIncrementalMergeResult {
        public static final int FAIL_ALLOC = -3;
        public static final int FAIL_DECOMPRESS = -4;
        public static final int FAIL_OVERFLOW = -5;
        public static final int FAIL_READ_DIFF_FILE = -7;
        public static final int FAIL_READ_OLD_FILE = -6;
        public static final int FATAL = 1;

        /* renamed from: OK */
        public static final int f80567OK = 0;
    }

    int bspatch(String str, String str2, String str3);
}
