package com.tencent.liteav.base;

import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.a */
final /* synthetic */ class C80202a implements Callable {

    /* renamed from: a */
    private static final C80202a f234750a = new C80202a();

    private C80202a() {
    }

    /* renamed from: a */
    public static Callable m97551a() {
        return f234750a;
    }

    public final Object call() {
        return PathUtils.setPrivateDataDirectorySuffixInternal();
    }
}
