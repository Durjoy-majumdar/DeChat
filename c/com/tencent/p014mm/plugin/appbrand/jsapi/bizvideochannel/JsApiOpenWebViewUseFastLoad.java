package com.tencent.p014mm.plugin.appbrand.jsapi.bizvideochannel;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import e00.C7578x;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad */
public final class JsApiOpenWebViewUseFastLoad extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 764;
    private static final String NAME = "openWebViewUseFastLoad";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/bizvideochannel/JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad */
    public static final class OpenWebViewUseFastLoad extends MainProcessTask {
        public static final C1651a CREATOR = new C1651a((C8480h) null);

        /* renamed from: f */
        public JSONObject f11290f;

        /* renamed from: g */
        public boolean f11291g;

        /* renamed from: h */
        public String f11292h = "";

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad$a */
        public static final class C1651a implements Parcelable.Creator<OpenWebViewUseFastLoad> {
            public C1651a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                OpenWebViewUseFastLoad openWebViewUseFastLoad = new OpenWebViewUseFastLoad();
                openWebViewUseFastLoad.mo1551g(parcel);
                return openWebViewUseFastLoad;
            }

            public Object[] newArray(int i) {
                return new OpenWebViewUseFastLoad[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            String str;
            String str2 = "";
            if (parcel == null || (str = parcel.readString()) == null) {
                str = str2;
            }
            this.f11290f = new JSONObject(str);
            boolean z = true;
            if (parcel == null || parcel.readInt() != 1) {
                z = false;
            }
            this.f11291g = z;
            String readString = parcel != null ? parcel.readString() : null;
            if (readString != null) {
                str2 = readString;
            }
            this.f11292h = str2;
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            if (this.f11291g) {
                Log.m105924i("MicroMsg.JsApiOpenWebViewUseFastLoad", "alvinluo openWebViewUseFastLoad success");
                return;
            }
            Log.m105921e("MicroMsg.JsApiOpenWebViewUseFastLoad", "alvinluo openWebViewUseFastLoad failed %s", this.f11292h);
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C45696d.class;
            if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(5)) {
                Log.m105920e("MicroMsg.JsApiOpenWebViewUseFastLoad", "alvinluo openWebViewUseFastLoad abtest closed");
                this.f11291g = false;
                this.f11292h = "abtest closed";
                mo114394b();
                return;
            }
            HashMap hashMap = new HashMap();
            ((C45696d) C86709a0.m107533q(cls)).pr0(MMApplicationContext.getContext(), this.f11290f, hashMap);
            this.f11291g = C87412m.m108589b(hashMap.get("success"), Boolean.TRUE);
            Object obj = hashMap.get("desc");
            this.f11292h = obj != null ? (String) obj : "";
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str;
            C87412m.m108594g(parcel, "parcel");
            JSONObject jSONObject = this.f11290f;
            if (jSONObject == null || (str = jSONObject.toString()) == null) {
                str = "";
            }
            parcel.writeString(str);
            parcel.writeInt(this.f11291g ? 1 : 0);
            parcel.writeString(this.f11292h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad$a */
    public static final class C1652a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f11293d;

        /* renamed from: e */
        public final /* synthetic */ String f11294e;

        /* renamed from: f */
        public final /* synthetic */ String f11295f;

        /* renamed from: g */
        public final /* synthetic */ double f11296g;

        /* renamed from: h */
        public final /* synthetic */ String f11297h;

        /* renamed from: i */
        public final /* synthetic */ boolean f11298i;

        /* renamed from: j */
        public final /* synthetic */ boolean f11299j;

        /* renamed from: n */
        public final /* synthetic */ int f11300n;

        /* renamed from: o */
        public final /* synthetic */ boolean f11301o;

        /* renamed from: p */
        public final /* synthetic */ int f11302p;

        /* renamed from: q */
        public final /* synthetic */ boolean f11303q;

        /* renamed from: r */
        public final /* synthetic */ boolean f11304r;

        /* renamed from: s */
        public final /* synthetic */ String f11305s;

        public C1652a(C82381f fVar, String str, String str2, double d, String str3, boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5, String str4) {
            this.f11293d = fVar;
            this.f11294e = str;
            this.f11295f = str2;
            this.f11296g = d;
            this.f11297h = str3;
            this.f11298i = z;
            this.f11299j = z2;
            this.f11300n = i;
            this.f11301o = z3;
            this.f11302p = i2;
            this.f11303q = z4;
            this.f11304r = z5;
            this.f11305s = str4;
        }

        public final void run() {
            Context context;
            C82381f fVar = this.f11293d;
            if (fVar != null && (context = fVar.getContext()) != null) {
                String str = this.f11294e;
                String str2 = this.f11295f;
                double d = this.f11296g;
                String str3 = this.f11297h;
                boolean z = this.f11298i;
                boolean z2 = this.f11299j;
                int i = this.f11300n;
                boolean z3 = this.f11301o;
                int i2 = this.f11302p;
                boolean z4 = this.f11303q;
                boolean z5 = this.f11304r;
                String str4 = this.f11305s;
                boolean equals = str.equals("portrait");
                C7335d c = C86312j.m106911c(C7578x.class);
                C87412m.m108593f(c, "getService(IHalfScreenService::class.java)");
                C87412m.m108593f(str2, "url");
                boolean z6 = z4;
                C7578x.C7579a.m7714a((C7578x) c, context, str2, (MMWebView) null, new C44361u((float) d, str3, z, z2, i, z3, i2, false, false, 0, false, z6, z5, str4, equals, 1920, (C8480h) null), 4, (Object) null).show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fe  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r29, org.json.JSONObject r30, int r31) {
        /*
            r28 = this;
            r0 = r28
            r15 = r29
            r1 = r30
            r14 = r31
            java.lang.Class<ex0.d> r2 = ex0.C45696d.class
            r13 = 1
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r4 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.String r5 = r30.toString()
            goto L_0x0016
        L_0x0015:
            r5 = r4
        L_0x0016:
            r12 = 0
            r3[r12] = r5
            java.lang.String r11 = "MicroMsg.JsApiOpenWebViewUseFastLoad"
            java.lang.String r5 = "alvinluo openWebViewUseFastLoad data: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r5, r3)
            k40.a r3 = f40.C86709a0.m107533q(r2)
            ex0.d r3 = (ex0.C45696d) r3
            r5 = 5
            boolean r3 = r3.mo70957E5(r5)
            if (r3 != 0) goto L_0x0041
            java.lang.String r1 = "alvinluo openWebViewUseFastLoad abtest closed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            java.lang.String r1 = "fail: abtest closed"
            java.lang.String r1 = r0.mo115109j(r1)
            java.lang.String r2 = "makeReturnJson(\"fail: abtest closed\")"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo1678w(r15, r14, r1)
            return
        L_0x0041:
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = "fail: invalid param"
            java.lang.String r1 = r0.mo115109j(r1)
            java.lang.String r2 = "makeReturnJson(\"fail: invalid param\")"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo1678w(r15, r14, r1)
            return
        L_0x0052:
            java.lang.String r3 = "url"
            java.lang.String r5 = r1.optString(r3)
            gy3.C87412m.m108593f(r5, r3)
            int r3 = r5.length()
            if (r3 != 0) goto L_0x0064
            r3 = 1
            goto L_0x0065
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 == 0) goto L_0x0076
            java.lang.String r1 = "fail: invalid url"
            java.lang.String r1 = r0.mo115109j(r1)
            java.lang.String r2 = "makeReturnJson(\"fail: invalid url\")"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo1678w(r15, r14, r1)
            return
        L_0x0076:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            k40.a r3 = f40.C86709a0.m107533q(r2)
            ex0.d r3 = (ex0.C45696d) r3
            boolean r3 = r3.mo70989eQ(r5)
            java.lang.String r6 = "halfScreen"
            boolean r6 = r1.optBoolean(r6)
            java.lang.String r7 = "immersiveUIStyle"
            boolean r9 = r1.optBoolean(r7, r12)
            java.lang.String r8 = "openType"
            java.lang.String r13 = "success"
            if (r6 == 0) goto L_0x0113
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            java.lang.String r4 = "heightPercent"
            double r6 = r1.optDouble(r4, r2)
            java.lang.String r2 = "reuseWebView"
            boolean r17 = r1.optBoolean(r2, r12)
            java.lang.String r2 = "showMenu"
            boolean r18 = r1.optBoolean(r2, r12)
            java.lang.String r2 = "showRefreshIcon"
            boolean r19 = r1.optBoolean(r2, r12)
            java.lang.String r2 = "showTitle"
            r4 = 1
            boolean r16 = r1.optBoolean(r2, r4)
            java.lang.String r2 = "extData"
            java.lang.String r20 = r1.optString(r2)
            java.lang.String r2 = "hexBackgroundColor"
            java.lang.String r21 = r1.optString(r2)
            java.lang.String r2 = "backMode"
            int r22 = r1.optInt(r2)
            int r23 = r1.optInt(r8)
            java.lang.String r2 = "pageOrientation"
            java.lang.String r3 = r1.optString(r2)
            com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad$a r24 = new com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad$a
            r1 = r24
            r2 = r29
            r25 = 1
            r4 = r5
            r5 = r6
            r7 = r20
            r8 = r17
            r17 = r9
            r9 = r18
            r0 = r10
            r10 = r22
            r26 = r11
            r11 = r17
            r18 = 0
            r12 = r23
            r27 = r13
            r13 = r19
            r14 = r16
            r15 = r21
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r24)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6 = r27
            r0.put(r6, r1)
            r3 = r28
            r9 = r29
            r10 = r31
        L_0x0110:
            r5 = 1
            goto L_0x01cf
        L_0x0113:
            r17 = r9
            r0 = r10
            r26 = r11
            r6 = r13
            r18 = 0
            if (r3 == 0) goto L_0x017d
            java.lang.String r3 = "item_show_type"
            boolean r3 = r1.has(r3)
            if (r3 != 0) goto L_0x013a
            java.lang.String r0 = "fail: invalid item_show_type"
            r3 = r28
            java.lang.String r0 = r3.mo115109j(r0)
            java.lang.String r1 = "makeReturnJson(\"fail: invalid item_show_type\")"
            gy3.C87412m.m108593f(r0, r1)
            r9 = r29
            r10 = r31
            r3.mo1678w(r9, r10, r0)
            return
        L_0x013a:
            r3 = r28
            r9 = r29
            r10 = r31
            java.lang.String r5 = "scene"
            boolean r5 = r1.has(r5)
            if (r5 != 0) goto L_0x0158
            java.lang.String r0 = "fail: invalid scene"
            java.lang.String r0 = r3.mo115109j(r0)
            java.lang.String r1 = "makeReturnJson(\"fail: invalid scene\")"
            gy3.C87412m.m108593f(r0, r1)
            r3.mo1678w(r9, r10, r0)
            return
        L_0x0158:
            boolean r5 = r1.has(r8)
            if (r5 != 0) goto L_0x016d
            java.lang.String r0 = "fail: invalid openType"
            java.lang.String r0 = r3.mo115109j(r0)
            java.lang.String r1 = "makeReturnJson(\"fail: invalid openType\")"
            gy3.C87412m.m108593f(r0, r1)
            r3.mo1678w(r9, r10, r0)
            return
        L_0x016d:
            k40.a r2 = f40.C86709a0.m107533q(r2)
            ex0.d r2 = (ex0.C45696d) r2
            if (r9 == 0) goto L_0x0179
            android.content.Context r4 = r29.getContext()
        L_0x0179:
            r2.pr0(r4, r1, r0)
            goto L_0x0110
        L_0x017d:
            r3 = r28
            r9 = r29
            r10 = r31
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "rawUrl"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            int r2 = com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.f240314o
            java.lang.String r2 = "appbrand_report_key_target_url"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "Intent().putExtra(Consta…Y_LAUNCH_TARGET_URL, url)"
            gy3.C87412m.m108593f(r1, r2)
            r2 = 76
            java.lang.String r5 = "geta8key_scene"
            r1.putExtra(r5, r2)
            if (r9 == 0) goto L_0x01a9
            java.lang.String r2 = r29.getAppId()
            goto L_0x01aa
        L_0x01a9:
            r2 = r4
        L_0x01aa:
            java.lang.String r5 = "geta8key_open_webview_appid"
            r1.putExtra(r5, r2)
            r2 = r17
            r1.putExtra(r7, r2)
            java.lang.String r2 = "convertActivityFromTranslucent"
            r5 = 1
            r1.putExtra(r2, r5)
            if (r9 == 0) goto L_0x01c1
            android.content.Context r2 = r29.getContext()
            goto L_0x01c2
        L_0x01c1:
            r2 = r4
        L_0x01c2:
            java.lang.String r7 = "webview"
            java.lang.String r8 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r2, r7, r8, r1, r4)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r6, r1)
        L_0x01cf:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            java.lang.String r2 = "desc"
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x01e4
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01e6
        L_0x01e4:
            java.lang.String r0 = ""
        L_0x01e6:
            if (r1 == 0) goto L_0x01fe
            java.lang.String r0 = "alvinluo openWebViewUseFastLoad success"
            r1 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = "ok"
            java.lang.String r0 = r3.mo115109j(r0)
            java.lang.String r1 = "makeReturnJson(\"ok\")"
            gy3.C87412m.m108593f(r0, r1)
            r3.mo1678w(r9, r10, r0)
            goto L_0x0226
        L_0x01fe:
            r1 = r26
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r18] = r0
            java.lang.String r4 = "alvinluo openWebViewUseFastLoad failed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fail: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r3.mo115109j(r0)
            java.lang.String r1 = "makeReturnJson(\"fail: $errMsg\")"
            gy3.C87412m.m108593f(r0, r1)
            r3.mo1678w(r9, r10, r0)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.bizvideochannel.JsApiOpenWebViewUseFastLoad.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public final void mo1678w(C82381f fVar, int i, String str) {
        if (fVar != null) {
            fVar.mo109647a(i, str);
        }
    }
}
