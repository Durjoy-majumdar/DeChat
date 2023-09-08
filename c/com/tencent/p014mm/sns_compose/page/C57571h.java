package com.tencent.p014mm.sns_compose.page;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import p175j0.C60647d0;

/* renamed from: com.tencent.mm.sns_compose.page.h */
public final class C57571h implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C0125s f164859a;

    /* renamed from: b */
    public final /* synthetic */ C103764p f164860b;

    public C57571h(C0125s sVar, C103764p pVar) {
        this.f164859a = sVar;
        this.f164860b = pVar;
    }

    public void dispose() {
        this.f164859a.getLifecycle().removeObserver(this.f164860b);
    }
}
