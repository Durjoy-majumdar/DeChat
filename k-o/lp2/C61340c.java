package lp2;

import android.os.Bundle;
import android.util.Log;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import lp2.C61333b;
import np2.C100150a;
import op2.C100371a;
import pp2.C62489a;
import qp2.C101232a;
import rx3.C13598b0;
import te3.C101820nt3;
import te3.C49335eu3;

/* renamed from: lp2.c */
public final class C61340c {

    /* renamed from: lp2.c$a */
    public static final class C61341a extends C87413o implements C32226l<C61333b.C61334a<Response>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WeakReference<C32226l<C61333b.C61334a<Response>, C13598b0>> f174494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61341a(WeakReference<C32226l<C61333b.C61334a<Response>, C13598b0>> weakReference) {
            super(1);
            this.f174494d = weakReference;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
            C61333b.C61334a aVar = (C61333b.C61334a) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
            C87412m.m108594g(aVar, "r");
            C32226l lVar = this.f174494d.get();
            if (lVar != null) {
                lVar.invoke(aVar);
            }
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
            return b0Var;
        }
    }

    /* renamed from: lp2.c$b */
    public static final class C61342b extends C87413o implements C32226l<C61333b.C61334a<Response>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C61333b.C61334a<Response>, C13598b0> f174495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61342b(C32226l<? super C61333b.C61334a<Response>, C13598b0> lVar) {
            super(1);
            this.f174495d = lVar;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$2");
            C61333b.C61334a aVar = (C61333b.C61334a) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$2");
            C87412m.m108594g(aVar, "r");
            this.f174495d.invoke(aVar);
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$2");
            return b0Var;
        }
    }

    /* renamed from: lp2.c$c */
    public static final class C61343c implements C100371a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C61333b.C61334a<Response>, C13598b0> f174496a;

        /* renamed from: b */
        public final /* synthetic */ Response f174497b;

        public C61343c(C32226l<? super C61333b.C61334a<Response>, C13598b0> lVar, Response response) {
            this.f174496a = lVar;
            this.f174497b = response;
        }

        /* renamed from: b */
        public final void mo86295b(Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
            if (bundle == null) {
                this.f174496a.invoke(new C61333b.C61334a(-1, -1, "no response!", this.f174497b));
                SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
                return;
            }
            byte[] byteArray = bundle.getByteArray("resp_pb_bytes");
            if (byteArray != null) {
                try {
                    this.f174497b.parseFrom(byteArray);
                } catch (Throwable unused) {
                }
            }
            int i = bundle.getInt("resp_error_type", -1);
            int i2 = bundle.getInt("resp_error_code", -1);
            String string = bundle.getString("resp_error_msg", "");
            C32226l<C61333b.C61334a<Response>, C13598b0> lVar = this.f174496a;
            C87412m.m108593f(string, "errMsg");
            lVar.invoke(new C61333b.C61334a(i, i2, string, this.f174497b));
            SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
        }
    }

    /* renamed from: a */
    public static final <Response extends C49335eu3> void m71953a(C101820nt3 nt32, int i, String str, C32226l<? super C61333b.C61334a<Response>, C13598b0> lVar, Response response, boolean z) {
        SnsMethodCalculate.markStartTimeMs("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
        C87412m.m108594g(nt32, "request");
        C87412m.m108594g(str, "cgiUrl");
        C87412m.m108594g(lVar, "cgiCallback");
        if (response == null) {
            SnsMethodCalculate.markEndTimeMs("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
            return;
        }
        nt32.toString();
        C32226l aVar = z ? new C61341a(new WeakReference(lVar)) : new C61342b(lVar);
        try {
            C100150a aVar2 = new C100150a();
            aVar2.mo139441d(new C61344d());
            aVar2.mo139440c(new C61343c(aVar, response));
            C62489a a = aVar2.mo139438a();
            if (a != null) {
                Bundle bundle = new Bundle();
                bundle.putString("req_pb_class_name", nt32.getClass().getName());
                bundle.putString("resp_pb_class_name", response.getClass().getName());
                try {
                    bundle.putByteArray("req_pb_bytes", nt32.toByteArray());
                } catch (Throwable unused) {
                }
                bundle.putInt("funcId", i);
                bundle.putString("cgiUrl", str);
                ((C101232a) a).mo140693c(bundle);
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
        SnsMethodCalculate.markEndTimeMs("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
    }
}
