package lp2;

import android.os.Bundle;
import android.util.Log;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lp2.C61333b;
import op2.C100372b;
import pp2.C47518b;
import qp2.C101232a;
import rx3.C13598b0;
import te3.C101820nt3;
import te3.C49335eu3;
import z04.C112551y;

/* renamed from: lp2.d */
public final class C61344d implements C100372b {

    /* renamed from: lp2.d$a */
    public static final class C61345a extends C87413o implements C32226l<C61333b.C61334a<C49335eu3>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C47518b f174498d;

        /* renamed from: e */
        public final /* synthetic */ C61344d f174499e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61345a(C47518b bVar, C61344d dVar, int i) {
            super(1);
            this.f174498d = bVar;
            this.f174499e = dVar;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
            C61333b.C61334a aVar = (C61333b.C61334a) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            C47518b bVar = this.f174498d;
            Bundle bundle = new Bundle();
            try {
                C49335eu3 eu32 = (C49335eu3) aVar.mo86291c();
                if (eu32 != null) {
                    bundle.putByteArray("resp_pb_bytes", eu32.toByteArray());
                }
            } catch (Throwable unused) {
            }
            bundle.putInt("resp_error_type", aVar.mo86290b());
            bundle.putInt("resp_error_code", aVar.mo86289a());
            SnsMethodCalculate.markStartTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            String str = aVar.f174483c;
            SnsMethodCalculate.markEndTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            bundle.putString("resp_error_msg", str);
            ((C101232a) bVar).mo140694d(bundle);
            this.f174499e.getClass();
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            aVar.mo86290b();
            aVar.mo86289a();
            SnsMethodCalculate.markStartTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            SnsMethodCalculate.markEndTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
            return b0Var;
        }
    }

    /* renamed from: a */
    public Bundle mo67224a(C47518b bVar, Bundle bundle) {
        C47518b bVar2 = bVar;
        Bundle bundle2 = bundle;
        SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
        if (bundle2 == null) {
            SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return null;
        } else if (bVar2 == null) {
            SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
            return null;
        } else {
            String string = bundle2.getString("req_pb_class_name", "");
            C87412m.m108593f(string, "params.getString(\"req_pb_class_name\", \"\")");
            String string2 = bundle2.getString("resp_pb_class_name", "");
            C87412m.m108593f(string2, "params.getString(\"resp_pb_class_name\", \"\")");
            byte[] byteArray = bundle2.getByteArray("req_pb_bytes");
            int i = bundle2.getInt("funcId", -1);
            String string3 = bundle2.getString("cgiUrl", "");
            if (C112551y.m153811k(string) || C112551y.m153811k(string2) || byteArray == null) {
                SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
                return null;
            }
            try {
                Object newInstance = Class.forName(string).newInstance();
                C101820nt3 nt32 = newInstance instanceof C101820nt3 ? (C101820nt3) newInstance : null;
                if (nt32 == null) {
                    SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
                    return null;
                }
                Object newInstance2 = Class.forName(string2).newInstance();
                C49335eu3 eu32 = newInstance2 instanceof C49335eu3 ? (C49335eu3) newInstance2 : null;
                if (eu32 == null) {
                    SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
                    return null;
                }
                nt32.parseFrom(byteArray);
                C87412m.m108593f(string3, "cgiUrl");
                try {
                    C61333b.m71949a(nt32, i, string3, new C61345a(bVar2, this, i), eu32, false);
                } catch (Throwable th) {
                    th = th;
                }
                Bundle bundle3 = new Bundle();
                SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
                return bundle3;
            } catch (Throwable th4) {
                th = th4;
                Log.getStackTraceString(th);
                Bundle bundle32 = new Bundle();
                SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
                return bundle32;
            }
        }
    }
}
