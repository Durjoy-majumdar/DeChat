package com.tencent.matrix.hook;

/* renamed from: com.tencent.matrix.hook.a */
public abstract class C80379a {

    /* renamed from: a */
    public C80380a f235272a = C80380a.UNCOMMIT;

    /* renamed from: com.tencent.matrix.hook.a$a */
    public enum C80380a {
        UNCOMMIT,
        COMMIT_SUCCESS,
        COMMIT_FAIL_ON_LOAD_LIB,
        COMMIT_FAIL_ON_CONFIGURE,
        COMMIT_FAIL_ON_HOOK
    }

    /* renamed from: a */
    public abstract String mo111834a();

    /* renamed from: b */
    public abstract boolean mo111835b();

    /* renamed from: c */
    public abstract boolean mo111836c(boolean z);
}
