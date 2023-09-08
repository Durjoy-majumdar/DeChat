package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import l33.C109247e;
import w33.C111730z;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$$b */
public final /* synthetic */ class NewVoipMgr$$b implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ NewVoipMgr f317135d;

    public /* synthetic */ NewVoipMgr$$b(NewVoipMgr newVoipMgr) {
        this.f317135d = newVoipMgr;
    }

    public final Object invoke(Object obj) {
        NewVoipMgr newVoipMgr = this.f317135d;
        Boolean bool = (Boolean) obj;
        newVoipMgr.getClass();
        if (bool.booleanValue()) {
            C111730z zVar = C111730z.f334576a;
            C111730z.f334575H = Util.nowMilliSecond();
        } else {
            C111730z.f334574G += Util.milliSecondsToNow(C111730z.f334575H);
            C111730z.f334575H = 0;
        }
        if (C109247e.vx0().f333459s != 0) {
            if (bool.booleanValue()) {
                C109247e.xx0().f317332a.mo152670o(true);
            } else {
                C109247e.xx0().f317332a.mo152670o(false);
            }
        }
        newVoipMgr.mo152437N0(bool.booleanValue() ? 6 : 5);
        return null;
    }
}
