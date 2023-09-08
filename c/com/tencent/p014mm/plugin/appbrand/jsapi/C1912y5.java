package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8479f0;
import gy3.C87412m;
import ob0.C47350c;
import p225rc.g$$f;
import pe3.C47465a;
import te3.C50063k04;
import te3.C50201l04;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.y5 */
public final class C1912y5 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C1915z5 f11772a;

    /* renamed from: b */
    public final /* synthetic */ C82554k f11773b;

    /* renamed from: c */
    public final /* synthetic */ int f11774c;

    /* renamed from: d */
    public final /* synthetic */ C8479f0<String> f11775d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.y5$a */
    public static final class C1913a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C1915z5 f11776a;

        /* renamed from: b */
        public final /* synthetic */ C82554k f11777b;

        /* renamed from: c */
        public final /* synthetic */ int f11778c;

        public C1913a(C1915z5 z5Var, C82554k kVar, int i) {
            this.f11776a = z5Var;
            this.f11777b = kVar;
            this.f11778c = i;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i(this.f11776a.f11780g, "sendRedCoverAppMsg errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                if ((cVar != null ? cVar.f127056b.f127083a : null) instanceof C50201l04) {
                    C47465a aVar = cVar.f127056b.f127083a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendShareCoverMsgResp");
                    C50201l04 l042 = (C50201l04) aVar;
                    String str2 = this.f11776a.f11780g;
                    Log.m105924i(str2, "send result: " + l042.f137124d);
                    if (l042.f137124d == 0) {
                        this.f11777b.mo109647a(this.f11778c, this.f11776a.mo115109j("ok"));
                    } else {
                        this.f11777b.mo109647a(this.f11778c, this.f11776a.mo115109j("fail:send fail"));
                    }
                }
            } else {
                Log.m105920e(this.f11776a.f11780g, "send error");
                this.f11777b.mo109647a(this.f11778c, this.f11776a.mo115109j("fail:send error"));
            }
        }
    }

    public C1912y5(C1915z5 z5Var, C82554k kVar, int i, C8479f0<String> f0Var) {
        this.f11772a = z5Var;
        this.f11773b = kVar;
        this.f11774c = i;
        this.f11775d = f0Var;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1915z5 z5Var = this.f11772a;
        if (i != z5Var.f11781h) {
            return false;
        }
        if (i2 != -1) {
            this.f11773b.mo109647a(this.f11774c, z5Var.mo115109j("fail:cancel"));
            return true;
        } else if (intent == null) {
            return true;
        } else {
            C8479f0<String> f0Var = this.f11775d;
            C82554k kVar = this.f11773b;
            int i3 = this.f11774c;
            C50063k04 k042 = new C50063k04();
            k042.f136500d = (String) f0Var.f27484d;
            k042.f136501e = intent.getStringExtra("Select_Conv_User");
            String str = z5Var.f11780g;
            Log.m105924i(str, "do send redcover appmsg: " + ((String) f0Var.f27484d) + ", " + k042.f136501e);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 6446;
            bVar.f127068c = "/cgi-bin/micromsg-bin/sendsharecovermsg";
            bVar.f127066a = k042;
            bVar.f127067b = new C50201l04();
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C1913a(z5Var, kVar, i3));
            return true;
        }
    }
}
