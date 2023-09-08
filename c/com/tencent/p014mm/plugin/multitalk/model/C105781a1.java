package com.tencent.p014mm.plugin.multitalk.model;

import android.widget.ImageView;
import di3.C86312j;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.multitalk.model.a1 */
public final class C105781a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f314570d;

    /* renamed from: e */
    public final /* synthetic */ C105808j f314571e;

    public C105781a1(ImageView imageView, C105808j jVar) {
        this.f314570d = imageView;
        this.f314571e = jVar;
    }

    public final void run() {
        ((C76705f) C86312j.m106911c(C76705f.class)).zv0(this.f314570d, this.f314571e.getUsername());
        this.f314571e.mo150772b();
    }
}
