package us2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import org.json.JSONObject;
import qo3.C101218e0;
import qs2.C101271i0;
import rx3.C13598b0;
import vr2.C102260r;
import yo2.C102889a;

/* renamed from: us2.g */
public final class C102078g {

    /* renamed from: a */
    public static final C102078g f300591a = new C102078g();

    /* renamed from: us2.g$a */
    public static final class C90732a implements C102889a.C102892c {

        /* renamed from: a */
        public final String f260606a;

        /* renamed from: b */
        public final Context f260607b;

        /* renamed from: c */
        public final boolean f260608c;

        /* renamed from: d */
        public final WeakReference<C32228q<String, String, Map<String, ? extends Object>, C13598b0>> f260609d;

        /* renamed from: us2.g$a$a */
        public static final class C14384a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Context f39956d;

            public C14384a(Context context) {
                this.f39956d = context;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$GeoCallbackToJS$onGeoCallback$1$1");
                Context context = this.f39956d;
                SnsMethodCalculate.markStartTimeMs("gotoSystemAppMgrUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
                C87412m.m108594g(context, "context");
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
                intent.addFlags(268435456);
                if (Util.isIntentAvailable(context, intent, true)) {
                    try {
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/RequestGeoLocationHelper", "gotoSystemAppMgrUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/RequestGeoLocationHelper", "gotoSystemAppMgrUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e) {
                        Log.printErrStackTrace("RequestGeoLocationHelper", e, "", new Object[0]);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("gotoSystemAppMgrUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$GeoCallbackToJS$onGeoCallback$1$1");
            }
        }

        public C90732a(String str, C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar, Context context, boolean z) {
            this.f260606a = str;
            this.f260607b = context;
            this.f260608c = z;
            this.f260609d = new WeakReference<>(qVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc A[Catch:{ all -> 0x0147 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x010f A[Catch:{ all -> 0x0147 }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0124 A[Catch:{ all -> 0x0147 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo124866a(java.util.Map<java.lang.String, ? extends java.lang.Object> r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                java.lang.String r2 = "getTAG"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper"
                java.lang.String r4 = "RequestGeoLocationHelper"
                java.lang.String r5 = "onGeoCallback"
                java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$GeoCallbackToJS"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                java.lang.String r7 = "value"
                gy3.C87412m.m108594g(r1, r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)     // Catch:{ all -> 0x0147 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x0147 }
                java.lang.String r7 = "onGeoCallback is called!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)     // Catch:{ all -> 0x0147 }
                java.lang.String r7 = r0.f260606a     // Catch:{ all -> 0x0147 }
                java.lang.ref.WeakReference<fy3.q<java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, rx3.b0>> r8 = r0.f260609d     // Catch:{ all -> 0x0147 }
                java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0147 }
                fy3.q r8 = (fy3.C32228q) r8     // Catch:{ all -> 0x0147 }
                if (r7 == 0) goto L_0x0153
                if (r8 == 0) goto L_0x0153
                java.lang.String r9 = "ret"
                java.lang.Object r9 = r1.get(r9)     // Catch:{ all -> 0x0147 }
                r10 = 0
                java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0147 }
                boolean r11 = gy3.C87412m.m108589b(r9, r11)     // Catch:{ all -> 0x0147 }
                java.lang.String r12 = ""
                if (r11 == 0) goto L_0x00d0
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x0147 }
                r9.<init>()     // Catch:{ all -> 0x0147 }
                android.content.Context r11 = r0.f260607b     // Catch:{ all -> 0x0147 }
                r13 = 0
                if (r11 == 0) goto L_0x0074
                java.lang.String r14 = "getLandingPageData"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r3)     // Catch:{ all -> 0x0147 }
                boolean r15 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI     // Catch:{ all -> 0x0147 }
                if (r15 == 0) goto L_0x0060
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r11 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI) r11     // Catch:{ all -> 0x0147 }
                qs2.i0 r11 = r11.mo132541n8()     // Catch:{ all -> 0x0147 }
                goto L_0x0070
            L_0x0060:
                boolean r15 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity     // Catch:{ all -> 0x0147 }
                if (r15 == 0) goto L_0x006b
                com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity r11 = (com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity) r11     // Catch:{ all -> 0x0147 }
                qs2.i0 r11 = r11.mo133148T0()     // Catch:{ all -> 0x0147 }
                goto L_0x0070
            L_0x006b:
                qs2.i0 r11 = new qs2.i0     // Catch:{ all -> 0x0147 }
                r11.<init>()     // Catch:{ all -> 0x0147 }
            L_0x0070:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r3)     // Catch:{ all -> 0x0147 }
                goto L_0x0075
            L_0x0074:
                r11 = r13
            L_0x0075:
                java.lang.String r14 = "snsid"
                if (r11 == 0) goto L_0x007f
                java.lang.String r15 = r11.mo140741h()     // Catch:{ all -> 0x0147 }
                goto L_0x0080
            L_0x007f:
                r15 = r13
            L_0x0080:
                if (r15 != 0) goto L_0x0083
                r15 = r12
            L_0x0083:
                r9.put(r14, r15)     // Catch:{ all -> 0x0147 }
                java.lang.String r14 = "uxinfo"
                if (r11 == 0) goto L_0x008f
                java.lang.String r13 = r11.mo140745l()     // Catch:{ all -> 0x0147 }
            L_0x008f:
                if (r13 != 0) goto L_0x0092
                goto L_0x0093
            L_0x0092:
                r12 = r13
            L_0x0093:
                r9.put(r14, r12)     // Catch:{ all -> 0x0147 }
                java.lang.String r12 = "scene"
                if (r11 == 0) goto L_0x009f
                int r10 = r11.mo140742i()     // Catch:{ all -> 0x0147 }
            L_0x009f:
                r9.put(r12, r10)     // Catch:{ all -> 0x0147 }
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x0147 }
                r10.<init>()     // Catch:{ all -> 0x0147 }
                java.lang.String r11 = "name"
                java.lang.String r12 = "system"
                r10.put(r11, r12)     // Catch:{ all -> 0x0147 }
                java.lang.String r11 = "status"
                java.lang.String r12 = "ok"
                r10.put(r11, r12)     // Catch:{ all -> 0x0147 }
                java.lang.String r11 = "extInfo"
                r9.put(r11, r10)     // Catch:{ all -> 0x0147 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0147 }
                java.lang.String r10 = "obj.toString()"
                gy3.C87412m.m108593f(r9, r10)     // Catch:{ all -> 0x0147 }
                java.lang.String r10 = "location_ad_auth_report"
                vr2.C102260r.m134858a(r10, r9)     // Catch:{ all -> 0x0147 }
                goto L_0x0141
            L_0x00d0:
                r10 = 1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0147 }
                boolean r9 = gy3.C87412m.m108589b(r9, r10)     // Catch:{ all -> 0x0147 }
                if (r9 == 0) goto L_0x0141
                boolean r9 = r0.f260608c     // Catch:{ all -> 0x0147 }
                if (r9 == 0) goto L_0x0141
                android.content.Context r13 = r0.f260607b     // Catch:{ all -> 0x0147 }
                if (r13 == 0) goto L_0x0141
                android.content.res.Resources r9 = r13.getResources()     // Catch:{ all -> 0x0147 }
                if (r9 == 0) goto L_0x00f5
                r10 = 2131833957(0x7f113465, float:1.930101E38)
                java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x0147 }
                if (r9 != 0) goto L_0x00f3
                goto L_0x00f5
            L_0x00f3:
                r14 = r9
                goto L_0x00f6
            L_0x00f5:
                r14 = r12
            L_0x00f6:
                android.content.res.Resources r9 = r13.getResources()     // Catch:{ all -> 0x0147 }
                if (r9 == 0) goto L_0x0108
                r10 = 2131833973(0x7f113475, float:1.9301043E38)
                java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x0147 }
                if (r9 != 0) goto L_0x0106
                goto L_0x0108
            L_0x0106:
                r15 = r9
                goto L_0x0109
            L_0x0108:
                r15 = r12
            L_0x0109:
                android.content.res.Resources r9 = r13.getResources()     // Catch:{ all -> 0x0147 }
                if (r9 == 0) goto L_0x011c
                r10 = 2131831713(0x7f112ba1, float:1.929646E38)
                java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x0147 }
                if (r9 != 0) goto L_0x0119
                goto L_0x011c
            L_0x0119:
                r16 = r9
                goto L_0x011e
            L_0x011c:
                r16 = r12
            L_0x011e:
                android.content.res.Resources r9 = r13.getResources()     // Catch:{ all -> 0x0147 }
                if (r9 == 0) goto L_0x0131
                r10 = 2131821426(0x7f110372, float:1.9275595E38)
                java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x0147 }
                if (r9 != 0) goto L_0x012e
                goto L_0x0131
            L_0x012e:
                r17 = r9
                goto L_0x0133
            L_0x0131:
                r17 = r12
            L_0x0133:
                r18 = 0
                us2.g$a$a r9 = new us2.g$a$a     // Catch:{ all -> 0x0147 }
                r9.<init>(r13)     // Catch:{ all -> 0x0147 }
                r20 = 0
                r19 = r9
                nj3.C76879j.m92709C(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0147 }
            L_0x0141:
                java.lang.String r9 = "GEO"
                r8.invoke(r7, r9, r1)     // Catch:{ all -> 0x0147 }
                goto L_0x0153
            L_0x0147:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                java.lang.String r1 = "there is a exception in onGeoCallback"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            L_0x0153:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: us2.C102078g.C90732a.mo124866a(java.util.Map):void");
        }
    }

    /* renamed from: a */
    public static final void m134486a(String str, C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar) {
        SnsMethodCalculate.markStartTimeMs("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
        if (mmkv == null) {
            SnsMethodCalculate.markEndTimeMs("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        boolean z = mmkv.getBoolean("canAutoFillData", false);
        Log.m105924i("RequestGeoLocationHelper", "getCanAutoFillData() called " + z);
        HashMap hashMap = new HashMap();
        hashMap.put("ret", "0");
        hashMap.put("status", z ? "true" : "false");
        if (qVar != null) {
            qVar.invoke(str, "ok", hashMap);
        }
        SnsMethodCalculate.markEndTimeMs("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    /* renamed from: c */
    public static final void m134487c(String str, String str2, Context context, boolean z, boolean z2, C32224a<C13598b0> aVar, C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar) {
        Context context2 = context;
        boolean z3 = z;
        SnsMethodCalculate.markStartTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        if (context2 == null) {
            SnsMethodCalculate.markEndTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
        if (mmkv == null) {
            SnsMethodCalculate.markEndTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        int i = 0;
        if (mmkv.getBoolean("canRequestLBS", false)) {
            JSONObject jSONObject = new JSONObject();
            C102078g gVar = f300591a;
            C101271i0 b = gVar.mo141572b(context2);
            String h = b != null ? b.mo140741h() : null;
            String str3 = "";
            if (h == null) {
                h = str3;
            }
            jSONObject.put("snsid", h);
            String l = b != null ? b.mo140745l() : null;
            if (l != null) {
                str3 = l;
            }
            jSONObject.put("uxinfo", str3);
            if (b != null) {
                i = b.mo140742i();
            }
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "ad");
            jSONObject2.put("status", "ok");
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "obj.toString()");
            C102260r.m134858a("location_ad_auth_report", jSONObject3);
            if (aVar != null) {
                aVar.invoke();
            }
            gVar.mo141573d(str, str2, context, z2, qVar);
        } else {
            SnsMethodCalculate.markStartTimeMs("showLBSAuthDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            C101218e0 e0Var = new C101218e0(context2, 1, 0);
            e0Var.mo140667n(context2.getString(C0966R.string.f7926wf), context2.getString(C0966R.string.a18));
            e0Var.mo140668o(0);
            C8477a0 a0Var = new C8477a0();
            String str4 = str;
            C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar2 = qVar;
            C102082l lVar = r0;
            C14385k kVar = new C14385k(qVar2, str4, e0Var);
            C102082l lVar2 = new C102082l(aVar, str4, str2, context, z2, qVar2, e0Var);
            C102079h hVar = new C102079h(z3, kVar, a0Var, e0Var);
            C102080i iVar = new C102080i(z3, lVar, a0Var, e0Var);
            e0Var.f296373D = hVar;
            e0Var.f296374E = iVar;
            if (z3) {
                e0Var.mo140665l(new C102081j(a0Var, lVar, kVar));
            }
            e0Var.mo140663j(C85868k2.m106137b(context).inflate(C0966R.C0971layout.f359986cu0, (ViewGroup) null));
            e0Var.mo140655A();
            SnsMethodCalculate.markEndTimeMs("showLBSAuthDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        }
        SnsMethodCalculate.markEndTimeMs("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    /* renamed from: e */
    public static final void m134488e(String str, String str2, C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar) {
        SnsMethodCalculate.markStartTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        boolean b = C87412m.m108589b(str, "true");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
        if (mmkv == null) {
            SnsMethodCalculate.markEndTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        mmkv.putBoolean("canAutoFillData", b);
        Log.m105924i("RequestGeoLocationHelper", "setCanAutoFillData() called " + b);
        HashMap hashMap = new HashMap();
        hashMap.put("ret", "0");
        if (qVar != null) {
            qVar.invoke(str2, "ok", hashMap);
        }
        SnsMethodCalculate.markEndTimeMs("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    /* renamed from: b */
    public final C101271i0 mo141572b(Context context) {
        SnsMethodCalculate.markStartTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        C87412m.m108594g(context, "<this>");
        C101271i0 n8 = context instanceof SnsAdNativeLandingPagesUI ? ((SnsAdNativeLandingPagesUI) context).mo132541n8() : context instanceof VideoFullScreenActivity ? ((VideoFullScreenActivity) context).mo133148T0() : new C101271i0();
        SnsMethodCalculate.markEndTimeMs("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        return n8;
    }

    /* renamed from: d */
    public final void mo141573d(String str, String str2, Context context, boolean z, C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar) {
        SnsMethodCalculate.markStartTimeMs("requestSystemLbs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        C90732a aVar = new C90732a(str, qVar, context, z);
        SnsMethodCalculate.markStartTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        C102889a aVar2 = null;
        if (context != null) {
            try {
                aVar2 = new C102889a(context, aVar);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        } else {
            SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        }
        if (aVar2 != null) {
            SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            try {
                Log.m105918d("GeoClientRequester", "the geo request is called, and the getType is " + str2);
                aVar2.f303701c.removeCallbacks(aVar2.f303704f);
                aVar2.f303701c.postDelayed(aVar2.f303704f, 20000);
                aVar2.f303703e = str2;
                if (aVar2.mo142610e()) {
                    SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                    if (str2 == null) {
                        str2 = "";
                    }
                    AdLandingPagesProxy.getInstance().geoLocation(str2, aVar2);
                    SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                }
            } catch (Throwable unused2) {
            }
            SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        }
        SnsMethodCalculate.markEndTimeMs("requestSystemLbs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }
}
