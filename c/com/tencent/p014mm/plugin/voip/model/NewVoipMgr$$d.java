package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import z33.C112604l;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$$d */
public final /* synthetic */ class NewVoipMgr$$d implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ NewVoipMgr f317136d;

    public /* synthetic */ NewVoipMgr$$d(NewVoipMgr newVoipMgr) {
        this.f317136d = newVoipMgr;
    }

    public final Object invoke(Object obj) {
        NewVoipMgr newVoipMgr = this.f317136d;
        Boolean bool = (Boolean) obj;
        if (newVoipMgr.f317093h == null) {
            Log.m105924i("MicroMsg.Voip.NewVoipMgr", "onSensorEvent, voipUI is null, ignore");
            return -1L;
        } else if ((!newVoipMgr.f317101r && !C112604l.m153984g(newVoipMgr.f317090e.f337213a)) || C112604l.m153983f(newVoipMgr.f317090e.f337213a)) {
            return -1L;
        } else {
            Log.m105925i("MicroMsg.Voip.NewVoipMgr", "onSensorEvent, isOn: %s", bool);
            newVoipMgr.f317093h.setScreenEnable(bool.booleanValue());
            newVoipMgr.f317094i = bool.booleanValue();
            return Long.valueOf(Util.currentTicks());
        }
    }
}
