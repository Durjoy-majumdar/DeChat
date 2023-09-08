package com.tencent.p014mm.plugin.location.p069ui.impl;

import cc0.C92411b;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import p702ts.C118505d;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$j */
public class b1$$j implements C92411b.C92412a {

    /* renamed from: d */
    public final /* synthetic */ C94163b1 f272005d;

    public b1$$j(C94163b1 b1Var) {
        this.f272005d = b1Var;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        float f3 = f;
        float f4 = f2;
        if (!z) {
            return false;
        }
        Log.m105918d("MicroMsg.ViewMapUI", "onGetLocation flong " + f + " flat " + f4);
        double d4 = (double) f4;
        if (d4 == 0.0d && ((double) f3) == 0.0d) {
            return true;
        }
        Log.m105918d("MicroMsg.ViewMapUI", "myLocation " + this.f272005d.f271952h.f271930e + " " + this.f272005d.f271952h.f271931f);
        Log.m105918d("MicroMsg.ViewMapUI", "location my show");
        C94163b1 b1Var = this.f272005d;
        LocationInfo locationInfo = b1Var.f271952h;
        locationInfo.f271930e = d4;
        double d5 = (double) f3;
        locationInfo.f271931f = d5;
        C118505d dVar = new C118505d(d4, d5);
        dVar.f354674f = locationInfo.f271929d;
        b1Var.f271955n.mo108054a(dVar, b1Var.f271965x);
        this.f272005d.mo129374G(d5, d4, i, d);
        return true;
    }
}
