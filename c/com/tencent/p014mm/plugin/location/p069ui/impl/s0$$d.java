package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.p014mm.plugin.location.model.LocationInfo;
import fy3.C32227p;
import ht1.C98522w3;
import java.io.Serializable;
import p702ts.C118505d;
import t22.C101715i;
import x22.C102551u;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$d */
public final /* synthetic */ class s0$$d implements C32227p {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272029d;

    public /* synthetic */ s0$$d(C94167s0 s0Var) {
        this.f272029d = s0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        C94167s0 s0Var = this.f272029d;
        double floatValue = (double) ((Float) obj).floatValue();
        double floatValue2 = (double) ((Float) obj2).floatValue();
        Serializable serializable = s0Var.f271982E;
        if (serializable == C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER || serializable == C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS) {
            s0Var.f271983F = false;
            LocationInfo locationInfo = s0Var.f271951g;
            locationInfo.f271930e = floatValue;
            locationInfo.f271931f = floatValue2;
            s0Var.f271953i.f271972f.getIController().setZoom(s0Var.f271959r);
            s0Var.mo129383u(s0Var.f271951g);
            C102551u uVar = s0Var.f271979B;
            LocationInfo locationInfo2 = s0Var.f271951g;
            uVar.getClass();
            uVar.f301953e = locationInfo2.f271930e;
            uVar.f301954f = locationInfo2.f271931f;
            LocationInfo locationInfo3 = s0Var.f271951g;
            if (C101715i.m133627d(locationInfo3.f271930e, locationInfo3.f271931f)) {
                LocationInfo locationInfo4 = s0Var.f271951g;
                C118505d dVar = new C118505d(locationInfo4.f271930e, locationInfo4.f271931f);
                dVar.f354674f = locationInfo4.f271929d;
                s0Var.f271955n.mo108054a(dVar, s0Var.f271965x);
            }
        }
        return Boolean.TRUE;
    }
}
