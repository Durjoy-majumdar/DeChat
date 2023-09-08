package com.tencent.p014mm.plugin.game;

import android.content.Context;
import oy1.C11785d;
import qo3.C89779i0;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.l$$d */
public final /* synthetic */ class l$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C41877l f112835d;

    /* renamed from: e */
    public final /* synthetic */ C11785d f112836e;

    /* renamed from: f */
    public final /* synthetic */ Context f112837f;

    /* renamed from: g */
    public final /* synthetic */ C89779i0 f112838g;

    /* renamed from: h */
    public final /* synthetic */ C48478n.C48481f f112839h;

    /* renamed from: i */
    public final /* synthetic */ int f112840i;

    /* renamed from: j */
    public final /* synthetic */ C48478n.C13793h f112841j;

    public /* synthetic */ l$$d(C41877l lVar, C11785d dVar, Context context, C89779i0 i0Var, C48478n.C48481f fVar, int i, C48478n.C13793h hVar) {
        this.f112835d = lVar;
        this.f112836e = dVar;
        this.f112837f = context;
        this.f112838g = i0Var;
        this.f112839h = fVar;
        this.f112840i = i;
        this.f112841j = hVar;
    }

    public final void run() {
        C41877l lVar = this.f112835d;
        C11785d dVar = this.f112836e;
        Context context = this.f112837f;
        C89779i0 i0Var = this.f112838g;
        C48478n.C48481f fVar = this.f112839h;
        int i = this.f112840i;
        C48478n.C13793h hVar = this.f112841j;
        lVar.getClass();
        dVar.mo11683b(context, new C42018m(lVar, i0Var, fVar, i, hVar));
    }
}
