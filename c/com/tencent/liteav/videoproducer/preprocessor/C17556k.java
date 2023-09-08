package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.beauty.C17125a;
import com.tencent.liteav.beauty.p305b.C104508n;
import com.tencent.liteav.videoproducer.preprocessor.C17548h;
import java.util.List;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.k */
final /* synthetic */ class C17556k implements Runnable {

    /* renamed from: a */
    private final C17548h f47711a;

    /* renamed from: b */
    private final List f47712b;

    private C17556k(C17548h hVar, List list) {
        this.f47711a = hVar;
        this.f47712b = list;
    }

    /* renamed from: a */
    public static Runnable m17747a(C17548h hVar, List list) {
        return new C17556k(hVar, list);
    }

    public final void run() {
        C17548h hVar = this.f47711a;
        List list = this.f47712b;
        if (list == null || list.isEmpty()) {
            hVar.mo20821c(C17548h.C17552b.f47696e);
            return;
        }
        C104508n nVar = (C104508n) hVar.mo20815a(C17548h.C17552b.f47696e);
        nVar.mo147184a();
        nVar.mo147186a(list);
        C17125a.m16956h(hVar.f47667a);
    }
}
