package hg0;

import com.tencent.p014mm.modelsimple.C40371t;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f40.C86718e;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import ob0.y$$c;
import ob0.y$$d;
import qe3.C89631w;
import te3.C64518l92;

/* renamed from: hg0.p0 */
public class C59889p0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C114799u f170963d;

    /* renamed from: e */
    public C11385n f170964e = null;

    /* renamed from: hg0.p0$a */
    public class C59890a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f170965d;

        /* renamed from: hg0.p0$a$a */
        public class C59891a implements C11385n {
            public C59891a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105919d("MicroMsg.NetSceneGetSuggestAlias", "summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C59889p0 p0Var = C59889p0.this;
                    p0Var.doScene(p0Var.dispatcher(), C59889p0.this.f170964e);
                    return;
                }
                C59889p0 p0Var2 = C59889p0.this;
                p0Var2.f170964e.onSceneEnd(i, i2, "", p0Var2);
            }
        }

        public C59890a(int i) {
            this.f170965d = i;
        }

        public void run() {
            new C40371t(this.f170965d).doScene(C59889p0.this.dispatcher(), new C59891a());
        }
    }

    /* renamed from: hg0.p0$b */
    public static class C59892b extends C117746w {

        /* renamed from: a */
        public final C59886d0 f170968a = new C59886d0();

        /* renamed from: b */
        public final C46054e0 f170969b = new C46054e0();

        public int getOptions() {
            return 1;
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f170968a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f170969b;
        }

        public int getType() {
            return 429;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/getsuggestalias";
        }
    }

    public C59889p0(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        C59892b bVar = new C59892b();
        this.f170963d = bVar;
        C59886d0 d0Var = (C59886d0) bVar.getReqObj();
        C64518l92 l922 = d0Var.f170957a;
        l922.f184060e = str;
        l922.f184061f = str2;
        l922.f184062g = str3;
        l922.f184063h = str4;
        l922.f184064i = str5;
        l922.f184065j = str6;
        l922.f184066n = i;
        l922.f184067o = LocaleUtil.getApplicationLanguage();
        C64518l92 l923 = d0Var.f170957a;
        C86709a0.m107523b();
        l923.f184068p = C86718e.m107547e();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f170964e = nVar;
        return dispatch(gVar, this.f170963d, this);
    }

    public int getType() {
        return 429;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 4 && i3 == -102) {
            int i4 = uVar.getReqObj().getRsaInfo().f296014c;
            Log.m105919d("MicroMsg.NetSceneGetSuggestAlias", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", Integer.valueOf(i4));
            C86709a0.m107525e().postToWorker(new C59890a(i4));
            return;
        }
        this.f170964e.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}
