package lo2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ao2.C79617c;
import co2.C92428a;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import eb0.C31543z5;
import f40.C86709a0;
import java.util.HashMap;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C49492g0;
import vr2.C102236a0;
import vr2.C102260r;
import zt3.C119157j;

/* renamed from: lo2.a */
public class C99516a {

    /* renamed from: a */
    public static HashMap<Long, Long> f291746a = new HashMap<>();

    /* renamed from: lo2.a$a */
    public interface C99517a {
        /* renamed from: a */
        void mo133816a(long j, int i, boolean z, String str);
    }

    /* renamed from: lo2.a$b */
    public static class C99518b implements C11385n {

        /* renamed from: d */
        public C99517a f291747d;

        /* renamed from: e */
        public int f291748e;

        /* renamed from: f */
        public long f291749f;

        /* renamed from: g */
        public String f291750g;

        /* renamed from: lo2.a$b$a */
        public class C99519a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f291751d;

            /* renamed from: e */
            public final /* synthetic */ int f291752e;

            /* renamed from: f */
            public final /* synthetic */ C117747y f291753f;

            public C99519a(int i, int i2, C117747y yVar) {
                this.f291751d = i;
                this.f291752e = i2;
                this.f291753f = yVar;
            }

            public void run() {
                C49492g0 g0Var;
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
                try {
                    if (this.f291751d == 0 && this.f291752e == 0 && (g0Var = (C49492g0) ((C47350c) this.f291753f.getReqResp()).f127056b.f127083a) != null) {
                        String valueOf = String.valueOf(g0Var.f133754d);
                        Log.m105924i("ADAppointment.AdAppointmentHelper", "parseResp status=" + valueOf);
                        C99518b bVar = C99518b.this;
                        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        String str = bVar.f291750g;
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        C99518b bVar2 = C99518b.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        long j = bVar2.f291749f;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        C79617c.m96686e(str, C99516a.m129867d(j), valueOf);
                        C99518b bVar3 = C99518b.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        C99517a aVar = bVar3.f291747d;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        C99518b bVar4 = C99518b.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        long j2 = bVar4.f291749f;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        C99518b bVar5 = C99518b.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        int i = bVar5.f291748e;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                        aVar.mo133816a(j2, i, true, valueOf);
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
                        return;
                    }
                } catch (Throwable th) {
                    Log.m105920e("ADAppointment.AdAppointmentHelper", "parseResp exp=" + th.toString());
                }
                C99518b bVar6 = C99518b.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                C99517a aVar2 = bVar6.f291747d;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                C99518b bVar7 = C99518b.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                long j3 = bVar7.f291749f;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                C99518b bVar8 = C99518b.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                int i2 = bVar8.f291748e;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                aVar2.mo133816a(j3, i2, false, "-1");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
            }
        }

        public C99518b(String str, long j, int i, C99517a aVar) {
            this.f291750g = str;
            this.f291749f = j;
            this.f291748e = i;
            this.f291747d = aVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
            Log.m105924i("ADAppointment.AdAppointmentHelper", "parseResp, snsId=" + this.f291750g + ", appointmentId=" + this.f291749f + ", opType=" + this.f291748e + ", errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
            if (this.f291747d == null) {
                Log.m105920e("ADAppointment.AdAppointmentHelper", "parseResp callback==null");
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C99519a(i, i2, yVar));
            C86709a0.m107524d().mo123470p(5159, this);
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        }
    }

    /* renamed from: a */
    public static void m129864a(long j, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("doNotifyMsgClickReport", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", "");
            jSONObject.put("uxinfo", str);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 9);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appointmentId", j);
            jSONObject2.put("type", i);
            jSONObject.put("extInfo", jSONObject2);
            C102260r.m134858a("general_msg_ad_general_service_msg_click", jSONObject.toString());
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.AdAppointmentHelper", "doCancelReport, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doNotifyMsgClickReport", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }

    /* renamed from: b */
    public static void m129865b(Context context, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("doSnsAdNotifyMsgClick", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        Log.m105924i("ADAppointment.AdAppointmentHelper", "doSnsAdNotifyMsgClick, param=" + str);
        if (context == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("doSnsAdNotifyMsgClick", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            long optLong = jSONObject.optLong("appointmentId");
            String optString = jSONObject.optString("uxInfo");
            if (optInt == 0) {
                C102260r.m134847P(jSONObject.optLong("canvasId"), C102260r.m134878r(optString), "", 32);
                m129864a(optLong, optString, 0);
            } else if (optInt == 1) {
                m129869f(context, jSONObject.optString("h5Url"), optString);
                m129864a(optLong, optString, 1);
            } else if (optInt == 2) {
                String optString2 = jSONObject.optString("weappUserName");
                String optString3 = jSONObject.optString("weappPath");
                String optString4 = jSONObject.optString("weappVersion");
                jSONObject.optString("miniProgramType");
                m129868e(optString2, optString3, optString4, optString, str2);
                m129864a(optLong, optString, 2);
            }
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.AdAppointmentHelper", "doSnsAdNotifyMsgClick, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doSnsAdNotifyMsgClick", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }

    /* renamed from: c */
    public static String m129866c(String str, C92428a aVar) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("getLocalCacheStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("getLocalCacheStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
            return "0";
        }
        long e = (long) C31543z5.m39455e();
        long j = aVar.f264489n;
        if (j == 0 || j >= e) {
            String d = m129867d(aVar.f264476a);
            str2 = MMApplicationContext.isMainProcess() ? C79617c.m96684c(str, d) : AdLandingPagesProxy.getInstance().getAdValue(str, d);
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            } else {
                String str4 = str2;
                str2 = "0";
                str3 = str4;
            }
        } else {
            Log.m105924i("ADAppointment.AdAppointmentHelper", "getLocalCacheState, expireTime=" + aVar.f264489n + ", serverTime=" + e);
            str3 = "";
            str2 = "1000";
        }
        Log.m105918d("ADAppointment.AdAppointmentHelper", "getLocalCacheState, cacheStatus=" + str3 + ", state=" + str2 + ", id=" + aVar.f264476a + ", snsId=" + str);
        SnsMethodCalculate.markEndTimeMs("getLocalCacheStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        return str2;
    }

    /* renamed from: d */
    public static String m129867d(long j) {
        SnsMethodCalculate.markStartTimeMs("getStatusKey", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        String str = "appointment_status_" + j;
        SnsMethodCalculate.markEndTimeMs("getStatusKey", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        return str;
    }

    /* renamed from: e */
    public static void m129868e(String str, String str2, String str3, String str4, String str5) {
        String str6 = str4;
        SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        try {
            String t = C102260r.m134880t(str4);
            String C = C102260r.m134834C(str4);
            String str7 = C102236a0.m134765q0(0) + XVFSFile.PATH_SEPARATOR + str6 + XVFSFile.PATH_SEPARATOR + C94866e1.Mx0() + XVFSFile.PATH_SEPARATOR + System.currentTimeMillis() + XVFSFile.PATH_SEPARATOR + str5;
            String b = C102260r.m134860b(str2, true);
            C102236a0.m134761o0(str, b, str3, t, C, str7, str4, 1215);
            StringBuilder sb = new StringBuilder();
            sb.append("jumpWeApp userName=");
            String str8 = str;
            sb.append(str);
            sb.append(", path=");
            sb.append(b);
            sb.append(", ver=");
            sb.append(str3);
            sb.append(", scene=");
            sb.append(1215);
            sb.append(", uxinfo=");
            sb.append(str6);
            sb.append(", sceneNote=");
            sb.append(str7);
            Log.m105924i("ADAppointment.AdAppointmentHelper", sb.toString());
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.AdAppointmentHelper", "jumpWeApp, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }

    /* renamed from: f */
    public static void m129869f(Context context, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
        try {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str2)) {
                str = C102236a0.m134734b(str, str2);
                C102236a0.m134736c(intent, str2);
            }
            intent.putExtra("KRightBtn", false);
            SnsAdClick snsAdClick = new SnsAdClick(0, 9, 0, 3, 0);
            Bundle bundle = new Bundle();
            bundle.putParcelable("KSnsAdTag", snsAdClick);
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("KAnsUxInfo", str2);
            }
            intent.putExtra("jsapiargs", bundle);
            intent.putExtra("rawUrl", str);
            intent.putExtra("useJs", true);
            intent.putExtra("stastic_scene", 15);
            C102236a0.m134732a(intent, 87);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            Log.m105924i("ADAppointment.AdAppointmentHelper", "jumpWebUI, url=" + str);
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.AdAppointmentHelper", "jumpWebUI, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
    }
}
