package com.tencent.p014mm.model.gdpr;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C46888b;
import ob0.C47350c;
import pe3.C47465a;
import te3.C48939c12;
import te3.C49335eu3;
import te3.t55;

/* renamed from: com.tencent.mm.model.gdpr.d */
public class C40343d implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C46888b f108428a;

    /* renamed from: b */
    public final /* synthetic */ C40344e f108429b;

    public C40343d(C40344e eVar, C46888b bVar) {
        this.f108429b = eVar;
        this.f108428a = bVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar = cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0 && ((C49335eu3) aVar) != null) {
            C48939c12 c122 = (C48939c12) aVar;
            if (c122.f131441d == null) {
                t55 t55 = new t55();
                c122.f131441d = t55;
                t55.f141978d = -1;
            }
            C40344e eVar = this.f108429b;
            Log.m105925i("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d)", eVar.f108430a.f10391d, eVar.f108431b, Integer.valueOf(c122.f131441d.f141978d), Integer.valueOf(c122.f131442e));
            if (c122.f131441d.f141978d != 0) {
                this.f108429b.f108432c.mo1216a(0);
                this.f108428a.mo72091a(Boolean.FALSE);
            } else if (c122.f131442e <= 0) {
                this.f108428a.mo72093c(Boolean.TRUE);
            } else {
                this.f108429b.f108432c.mo1216a(0);
                this.f108428a.mo72091a(Boolean.FALSE);
            }
        } else {
            C40344e eVar2 = this.f108429b;
            Log.m105921e("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d %s)", eVar2.f108430a.f10391d, eVar2.f108431b, Integer.valueOf(i2), Integer.valueOf(i), str);
            this.f108429b.f108432c.mo1216a(0);
            this.f108428a.mo72091a(Boolean.FALSE);
        }
    }
}
