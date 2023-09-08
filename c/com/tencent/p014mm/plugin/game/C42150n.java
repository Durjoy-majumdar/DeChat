package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import oy1.C11781a;
import qo3.C89779i0;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.n */
public class C42150n implements C11781a {

    /* renamed from: a */
    public final /* synthetic */ C48478n.C48482g f113601a;

    /* renamed from: b */
    public final /* synthetic */ C89779i0 f113602b;

    public C42150n(C41877l lVar, C48478n.C48482g gVar, C89779i0 i0Var) {
        this.f113601a = gVar;
        this.f113602b = i0Var;
    }

    /* renamed from: a */
    public void mo11674a(String str) {
        C48478n.C48482g gVar = this.f113601a;
        if (gVar != null) {
            gVar.mo5395a(str);
        }
        C2039g2.m1988b(new n$$a(this.f113602b));
    }

    /* renamed from: b */
    public void mo11675b(String str, String str2) {
        C48478n.C48482g gVar = this.f113601a;
        if (gVar != null) {
            gVar.mo5397v(str, str2);
        }
    }

    /* renamed from: c */
    public void mo11676c() {
        C2039g2.m1988b(new n$$b(this.f113602b));
    }

    public void onCancel() {
        C48478n.C48482g gVar = this.f113601a;
        if (gVar != null) {
            gVar.onCancel();
        }
    }

    public void onSuccess() {
    }
}
