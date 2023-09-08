package lp2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C101820nt3;
import te3.C49335eu3;

/* renamed from: lp2.b */
public final class C61333b {

    /* renamed from: lp2.b$a */
    public static final class C61334a<Response> {

        /* renamed from: a */
        public final int f174481a;

        /* renamed from: b */
        public final int f174482b;

        /* renamed from: c */
        public final String f174483c;

        /* renamed from: d */
        public final Response f174484d;

        public C61334a(int i, int i2, String str, Response response) {
            C87412m.m108594g(str, "errMsg");
            this.f174481a = i;
            this.f174482b = i2;
            this.f174483c = str;
            this.f174484d = response;
        }

        /* renamed from: a */
        public final int mo86289a() {
            SnsMethodCalculate.markStartTimeMs("getErrCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            int i = this.f174482b;
            SnsMethodCalculate.markEndTimeMs("getErrCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return i;
        }

        /* renamed from: b */
        public final int mo86290b() {
            SnsMethodCalculate.markStartTimeMs("getErrType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            int i = this.f174481a;
            SnsMethodCalculate.markEndTimeMs("getErrType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return i;
        }

        /* renamed from: c */
        public final Response mo86291c() {
            SnsMethodCalculate.markStartTimeMs("getResp", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            Response response = this.f174484d;
            SnsMethodCalculate.markEndTimeMs("getResp", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return response;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                return true;
            } else if (!(obj instanceof C61334a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                return false;
            } else {
                C61334a aVar = (C61334a) obj;
                if (this.f174481a != aVar.f174481a) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    return false;
                } else if (this.f174482b != aVar.f174482b) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    return false;
                } else if (!C87412m.m108589b(this.f174483c, aVar.f174483c)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    return false;
                } else {
                    boolean b = C87412m.m108589b(this.f174484d, aVar.f174484d);
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
                    return b;
                }
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            int hashCode = ((((this.f174481a * 31) + this.f174482b) * 31) + this.f174483c.hashCode()) * 31;
            Response response = this.f174484d;
            int hashCode2 = hashCode + (response == null ? 0 : response.hashCode());
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return hashCode2;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            String str = "CgiResult(errType=" + this.f174481a + ", errCode=" + this.f174482b + ", errMsg=" + this.f174483c + ", resp=" + this.f174484d + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            return str;
        }
    }

    /* renamed from: lp2.b$b */
    public static final class C61335b extends C87413o implements C32226l<C61334a<Response>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C32226l<C61334a<Response>, C13598b0>> f174485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61335b(WeakReference<C32226l<C61334a<Response>, C13598b0>> weakReference) {
            super(1);
            this.f174485d = weakReference;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
            C61334a aVar = (C61334a) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
            C87412m.m108594g(aVar, "r");
            C32226l lVar = this.f174485d.get();
            if (lVar != null) {
                lVar.invoke(aVar);
            }
            String str = lVar == null ? "null" : "func";
            Log.m105924i("CgiRequestHelper", "callback ref is invoke " + str);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$1");
            return b0Var;
        }
    }

    /* renamed from: lp2.b$c */
    public static final class C61336c extends C87413o implements C32226l<C61334a<Response>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C61334a<Response>, C13598b0> f174486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61336c(C32226l<? super C61334a<Response>, C13598b0> lVar) {
            super(1);
            this.f174486d = lVar;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
            C61334a aVar = (C61334a) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
            C87412m.m108594g(aVar, "r");
            this.f174486d.invoke(aVar);
            Log.m105924i("CgiRequestHelper", "callback no weak ref is invoke!");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
            return b0Var;
        }
    }

    /* renamed from: lp2.b$d */
    public static final class C61337d implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C61338e f174487d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C61334a<Response>, C13598b0> f174488e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f174489f;

        public C61337d(C61338e eVar, C32226l<? super C61334a<Response>, C13598b0> lVar, C47350c cVar) {
            this.f174487d = eVar;
            this.f174488e = lVar;
            this.f174489f = cVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$3");
            this.f174487d.setHasCallbackToQueue(true);
            C32226l<C61334a<Response>, C13598b0> lVar = this.f174488e;
            if (str == null) {
                str = "";
            }
            C47465a aVar = this.f174489f.f127056b.f127083a;
            lVar.invoke(new C61334a(i, i2, str, aVar instanceof C49335eu3 ? (C49335eu3) aVar : null));
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$3");
        }
    }

    /* renamed from: lp2.b$e */
    public static final class C61338e extends C117747y {

        /* renamed from: d */
        public C11385n f174490d;

        /* renamed from: e */
        public final /* synthetic */ int f174491e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f174492f;

        /* renamed from: lp2.b$e$a */
        public static final class C61339a implements C1311n {

            /* renamed from: d */
            public final /* synthetic */ C61338e f174493d;

            public C61339a(C61338e eVar) {
                this.f174493d = eVar;
            }

            public final void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
                SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1$doScene$wrapCallback$1");
                Log.m105924i("CgiRequestHelper", "IOnGYNetEnd() called with: errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
                C61338e eVar = this.f174493d;
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getSceneCallback", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
                C11385n nVar = eVar.f174490d;
                SnsMethodCalculate.markEndTimeMs("getSceneCallback", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
                if (nVar != null) {
                    nVar.onSceneEnd(i2, i3, str, this.f174493d);
                }
                SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1$doScene$wrapCallback$1");
            }
        }

        public C61338e(int i, C47350c cVar) {
            this.f174491e = i;
            this.f174492f = cVar;
        }

        public int doScene(C114770g gVar, C11385n nVar) {
            SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
            this.f174490d = nVar;
            int dispatch = dispatch(gVar, this.f174492f, new C61339a(this));
            SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
            return dispatch;
        }

        public int getType() {
            SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
            int i = this.f174491e;
            SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
            return i;
        }
    }

    /* renamed from: a */
    public static final <Response extends C49335eu3> void m71949a(C101820nt3 nt32, int i, String str, C32226l<? super C61334a<Response>, C13598b0> lVar, Response response, boolean z) {
        SnsMethodCalculate.markStartTimeMs("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper");
        C87412m.m108594g(nt32, "request");
        C87412m.m108594g(str, "cgiUrl");
        C87412m.m108594g(lVar, "cgiCallback");
        Log.m105924i("CgiRequestHelper", "requestCgi() called with: request = " + nt32 + ", funcId = " + i + ' ' + z);
        try {
            C32226l bVar = z ? new C61335b(new WeakReference(lVar)) : new C61336c(lVar);
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127066a = nt32;
            bVar2.f127067b = response;
            bVar2.f127068c = str;
            bVar2.f127069d = i;
            C47350c a = bVar2.mo72403a();
            C61338e eVar = new C61338e(i, a);
            eVar.doScene(C86709a0.m107524d().f256809d, new C61337d(eVar, bVar, a));
        } catch (Throwable th) {
            Log.m105920e("CgiRequestHelper", "requestCgi error: request = " + nt32 + ", funcId = " + i + ' ' + th);
        }
        SnsMethodCalculate.markEndTimeMs("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper");
    }
}
