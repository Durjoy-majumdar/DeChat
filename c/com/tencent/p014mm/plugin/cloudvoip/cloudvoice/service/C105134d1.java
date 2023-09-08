package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C47350c;
import te3.C48780ay1;
import te3.C52321zx1;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d1 */
public class C105134d1 {

    /* renamed from: a */
    public final Map<String, C105132c1> f312158a = new ConcurrentHashMap(1);

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d1$a */
    public class C105135a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C105136b f312159d;

        /* renamed from: e */
        public final /* synthetic */ int f312160e;

        /* renamed from: f */
        public final /* synthetic */ int f312161f;

        /* renamed from: g */
        public final /* synthetic */ String f312162g;

        /* renamed from: h */
        public final /* synthetic */ C105132c1 f312163h;

        /* renamed from: i */
        public final /* synthetic */ boolean f312164i;

        public C105135a(C105134d1 d1Var, C105136b bVar, int i, int i2, String str, C105132c1 c1Var, boolean z) {
            this.f312159d = bVar;
            this.f312160e = i;
            this.f312161f = i2;
            this.f312162g = str;
            this.f312163h = c1Var;
            this.f312164i = z;
        }

        public void run() {
            this.f312159d.mo149449a(this.f312160e, this.f312161f, this.f312162g, this.f312163h, this.f312164i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d1$b */
    public interface C105136b {
        /* renamed from: a */
        void mo149449a(int i, int i2, String str, C105132c1 c1Var, boolean z);
    }

    /* renamed from: a */
    public final void mo149446a(int i, int i2, String str, C105132c1 c1Var, boolean z, C105136b bVar) {
        C105181w.INSTANCE.mo149500g(new C105135a(this, bVar, i, i2, str, c1Var, z));
    }

    /* renamed from: b */
    public void mo149447b(String str, String str2, C105136b bVar) {
        C105132c1 c1Var = (C105132c1) ((ConcurrentHashMap) this.f312158a).get(str);
        if (c1Var == null || !c1Var.mo149444a()) {
            ((ConcurrentHashMap) this.f312158a).remove(str);
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127066a = new C52321zx1();
            bVar2.f127067b = new C48780ay1();
            bVar2.f127069d = 2985;
            bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getcloudimsession";
            bVar2.f127070e = 0;
            bVar2.f127071f = 0;
            C47350c a = bVar2.mo72403a();
            C52321zx1 zx12 = (C52321zx1) a.f127055a.f127080a;
            zx12.f146266d = str;
            zx12.f146267e = str2;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C105138e1(this, bVar, str));
            return;
        }
        Log.m105918d("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: has valid sessionKey");
        if (bVar != null) {
            mo149446a(0, 0, "", c1Var, false, bVar);
        }
    }
}
