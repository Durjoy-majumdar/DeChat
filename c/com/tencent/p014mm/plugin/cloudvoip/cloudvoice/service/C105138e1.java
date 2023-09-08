package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105134d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C47350c;
import pe3.C47465a;
import te3.C48780ay1;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e1 */
public class C105138e1 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C105134d1.C105136b f312165a;

    /* renamed from: b */
    public final /* synthetic */ String f312166b;

    /* renamed from: c */
    public final /* synthetic */ C105134d1 f312167c;

    public C105138e1(C105134d1 d1Var, C105134d1.C105136b bVar, String str) {
        this.f312167c = d1Var;
        this.f312165a = bVar;
        this.f312166b = str;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C48780ay1 ay12 = (C48780ay1) aVar;
            C105132c1 c1Var = new C105132c1();
            c1Var.f312154a = ay12.f130845d;
            c1Var.f312156c = Util.currentTicks();
            c1Var.f312155b = (long) ay12.f130847f;
            Log.m105925i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: getSession sessionKey: %s", c1Var);
            ((ConcurrentHashMap) this.f312167c.f312158a).put(this.f312166b, c1Var);
            this.f312167c.mo149446a(0, 0, "", c1Var, true, this.f312165a);
            return;
        }
        Log.m105920e("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: get sessionkey fail,errType:" + i + ",errCode:" + i2);
        this.f312167c.mo149446a(i, i2, str, (C105132c1) null, false, this.f312165a);
    }
}
