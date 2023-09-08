package com.tencent.p014mm.plugin.game;

import android.content.Context;
import oy1.C11785d;
import qo3.C89779i0;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.l$$b */
public final /* synthetic */ class l$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C41877l f112830d;

    /* renamed from: e */
    public final /* synthetic */ C11785d f112831e;

    /* renamed from: f */
    public final /* synthetic */ Context f112832f;

    /* renamed from: g */
    public final /* synthetic */ C48478n.C48482g f112833g;

    /* renamed from: h */
    public final /* synthetic */ C89779i0 f112834h;

    public /* synthetic */ l$$b(C41877l lVar, C11785d dVar, Context context, C48478n.C48482g gVar, C89779i0 i0Var) {
        this.f112830d = lVar;
        this.f112831e = dVar;
        this.f112832f = context;
        this.f112833g = gVar;
        this.f112834h = i0Var;
    }

    public final void run() {
        C41877l lVar = this.f112830d;
        C11785d dVar = this.f112831e;
        Context context = this.f112832f;
        C48478n.C48482g gVar = this.f112833g;
        C89779i0 i0Var = this.f112834h;
        lVar.getClass();
        dVar.mo11683b(context, new C42150n(lVar, gVar, i0Var));
    }
}
