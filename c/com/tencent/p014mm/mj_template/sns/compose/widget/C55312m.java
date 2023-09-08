package com.tencent.p014mm.mj_template.sns.compose.widget;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import p175j0.C60647d0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.m */
public final class C55312m implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C0125s f157533a;

    /* renamed from: b */
    public final /* synthetic */ C103764p f157534b;

    public C55312m(C0125s sVar, C103764p pVar) {
        this.f157533a = sVar;
        this.f157534b = pVar;
    }

    public void dispose() {
        this.f157533a.getLifecycle().removeObserver(this.f157534b);
    }
}
