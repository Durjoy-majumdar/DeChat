package com.tencent.p014mm.plugin.appbrand.jsapi.liteapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp */
public class JsApiOpenLiteApp extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    private static final String NAME = "openLiteApp";

    /* renamed from: g */
    public boolean f11413g = false;

    /* renamed from: h */
    public C81925i2 f11414h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$OpenLiteAppData */
    public static class OpenLiteAppData implements Parcelable {
        public static final Parcelable.Creator<OpenLiteAppData> CREATOR = new C1717a();

        /* renamed from: d */
        public Bundle f11415d;

        /* renamed from: e */
        public Boolean f11416e;

        /* renamed from: f */
        public Boolean f11417f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$OpenLiteAppData$a */
        public class C1717a implements Parcelable.Creator<OpenLiteAppData> {
            public Object createFromParcel(Parcel parcel) {
                return new OpenLiteAppData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenLiteAppData[i];
            }
        }

        public OpenLiteAppData(Parcel parcel) {
            this.f11415d = parcel.readBundle();
            boolean z = true;
            this.f11416e = Boolean.valueOf(parcel.readByte() != 0);
            this.f11417f = Boolean.valueOf(parcel.readByte() == 0 ? false : z);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f11415d);
            parcel.writeByte(this.f11416e.booleanValue() ? (byte) 1 : 0);
            parcel.writeByte(this.f11417f.booleanValue() ? (byte) 1 : 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$a */
    public static class C1718a implements C80916r<IPCVoid, IPCVoid> {
        private C1718a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13513Wx(7, (WxaLiteAppStartReport) null);
            return new IPCVoid();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$b */
    public static class C1719b implements C80916r<Bundle, IPCString> {
        private C1719b() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            return new IPCString(((C14088e) C86312j.m106911c(C14088e.class)).mo13504K8(bundle.getString("path"), bundle.getString("appId"), bundle.getString("signatureKey")));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$c */
    public static class C1720c implements C80883e<OpenLiteAppData, IPCBoolean> {
        private C1720c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            OpenLiteAppData openLiteAppData = (OpenLiteAppData) obj;
            Log.m105926v("MicroMsg.JsApiOpenLiteApp", "OpenLiteApp in mm process");
            Boolean[] boolArr = {Boolean.TRUE};
            try {
                ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), openLiteAppData.f11415d, openLiteAppData.f11416e.booleanValue(), openLiteAppData.f11417f.booleanValue(), new C1726c(this, boolArr));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenLiteApp", e, "OpenLiteApp exception", new Object[0]);
                boolArr[0] = Boolean.FALSE;
            }
            gVar.mo894a(new IPCBoolean(boolArr[0].booleanValue()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x014d A[SYNTHETIC, Splitter:B:59:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0175 A[Catch:{ JSONException -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0183 A[Catch:{ JSONException -> 0x006e }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r30, org.json.JSONObject r31, int r32) {
        /*
            r29 = this;
            r1 = r29
            r0 = r31
            r2 = r32
            java.lang.String r3 = "isRedirect"
            r4 = r30
            com.tencent.mm.plugin.appbrand.i2 r4 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r4
            java.lang.Class<tt.e> r5 = p244tt.C14088e.class
            java.lang.String r6 = "enterType"
            java.lang.String r7 = "minVersion"
            java.lang.String r8 = "isOpenWithNewTab"
            java.lang.String r9 = "isForbidRightGesture"
            java.lang.String r10 = "isTransparent"
            java.lang.String r11 = "page"
            java.lang.String r12 = "syncCheckUpdate"
            java.lang.String r13 = "checkUpdate"
            java.lang.String r14 = "MicroMsg.JsApiOpenLiteApp"
            java.lang.String r15 = ""
            r30 = r15
            java.lang.String r15 = "heightPercent"
            r16 = r14
            java.lang.String r14 = "isHalfScreen"
            r17 = r3
            java.lang.String r3 = "query"
            r18 = r6
            java.lang.String r6 = "appId"
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "invalid_data"
            java.lang.String r0 = r1.mo115109j(r0)
            r4.mo109647a(r2, r0)
            goto L_0x01f5
        L_0x0040:
            r1.f11414h = r4
            r19 = r5
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r20 = r7
            boolean r21 = r0.has(r6)     // Catch:{ JSONException -> 0x01e0 }
            if (r21 != 0) goto L_0x005c
            java.lang.String r0 = "invalid_appId"
            java.lang.String r0 = r1.mo115109j(r0)     // Catch:{ JSONException -> 0x01e0 }
            r4.mo109647a(r2, r0)     // Catch:{ JSONException -> 0x01e0 }
            goto L_0x01f5
        L_0x005c:
            java.lang.String r7 = r0.getString(r6)     // Catch:{ JSONException -> 0x01e0 }
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x01e0 }
            boolean r22 = r0.has(r13)     // Catch:{ JSONException -> 0x01e0 }
            if (r22 == 0) goto L_0x0073
            boolean r13 = r0.getBoolean(r13)     // Catch:{ JSONException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r0 = move-exception
            r3 = r32
            goto L_0x01e2
        L_0x0073:
            r13 = 1
        L_0x0074:
            boolean r22 = r0.has(r12)     // Catch:{ JSONException -> 0x006e }
            if (r22 == 0) goto L_0x007f
            boolean r12 = r0.getBoolean(r12)     // Catch:{ JSONException -> 0x006e }
            goto L_0x0080
        L_0x007f:
            r12 = 0
        L_0x0080:
            boolean r22 = r0.has(r3)     // Catch:{ JSONException -> 0x006e }
            if (r22 == 0) goto L_0x0091
            org.json.JSONObject r22 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r2 = r22.toString()     // Catch:{ JSONException -> 0x006e }
            r5.putString(r3, r2)     // Catch:{ JSONException -> 0x006e }
        L_0x0091:
            boolean r2 = r0.has(r11)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r3 = "path"
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = r0.getString(r11)     // Catch:{ JSONException -> 0x006e }
            r5.putString(r3, r2)     // Catch:{ JSONException -> 0x006e }
            goto L_0x00a3
        L_0x00a1:
            r2 = r30
        L_0x00a3:
            boolean r11 = r0.has(r10)     // Catch:{ JSONException -> 0x006e }
            if (r11 == 0) goto L_0x00b6
            boolean r10 = r0.getBoolean(r10)     // Catch:{ JSONException -> 0x006e }
            if (r10 == 0) goto L_0x00b6
            java.lang.String r10 = "transparent"
            r11 = 1
            r5.putBoolean(r10, r11)     // Catch:{ JSONException -> 0x006e }
        L_0x00b6:
            boolean r10 = r0.has(r9)     // Catch:{ JSONException -> 0x006e }
            if (r10 == 0) goto L_0x00c9
            boolean r9 = r0.getBoolean(r9)     // Catch:{ JSONException -> 0x006e }
            if (r9 == 0) goto L_0x00c9
            java.lang.String r9 = "forbidRightGesture"
            r10 = 1
            r5.putBoolean(r9, r10)     // Catch:{ JSONException -> 0x006e }
            goto L_0x00ca
        L_0x00c9:
            r10 = 1
        L_0x00ca:
            boolean r9 = r0.has(r14)     // Catch:{ JSONException -> 0x006e }
            if (r9 == 0) goto L_0x00d7
            boolean r9 = r0.getBoolean(r14)     // Catch:{ JSONException -> 0x006e }
            r5.putBoolean(r14, r9)     // Catch:{ JSONException -> 0x006e }
        L_0x00d7:
            boolean r9 = r0.has(r15)     // Catch:{ JSONException -> 0x006e }
            if (r9 == 0) goto L_0x00e4
            double r10 = r0.getDouble(r15)     // Catch:{ JSONException -> 0x006e }
            r5.putDouble(r15, r10)     // Catch:{ JSONException -> 0x006e }
        L_0x00e4:
            boolean r9 = r0.has(r8)     // Catch:{ JSONException -> 0x006e }
            if (r9 == 0) goto L_0x00f3
            boolean r8 = r0.getBoolean(r8)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r9 = "openWithNewTab"
            r5.putBoolean(r9, r8)     // Catch:{ JSONException -> 0x006e }
        L_0x00f3:
            r8 = r20
            boolean r9 = r0.has(r8)     // Catch:{ JSONException -> 0x006e }
            if (r9 == 0) goto L_0x0139
            java.lang.String r8 = r0.getString(r8)     // Catch:{ JSONException -> 0x006e }
            di3.d r9 = di3.C86312j.m106911c(r19)     // Catch:{ JSONException -> 0x006e }
            tt.e r9 = (p244tt.C14088e) r9     // Catch:{ JSONException -> 0x006e }
            com.tencent.liteapp.storage.WxaLiteAppInfo r9 = r9.mo13509NR(r7)     // Catch:{ JSONException -> 0x006e }
            if (r9 == 0) goto L_0x0139
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ JSONException -> 0x006e }
            r10.<init>()     // Catch:{ JSONException -> 0x006e }
            java.lang.String r11 = r9.f339295i     // Catch:{ JSONException -> 0x006e }
            r10.putString(r3, r11)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r3 = r9.f339290d     // Catch:{ JSONException -> 0x006e }
            r10.putString(r6, r3)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r3 = "signatureKey"
            java.lang.String r6 = r9.f339294h     // Catch:{ JSONException -> 0x006e }
            r10.putString(r3, r6)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN     // Catch:{ JSONException -> 0x006e }
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$b> r6 = com.tencent.p014mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp.C1719b.class
            android.os.Parcelable r3 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r3, r10, r6)     // Catch:{ JSONException -> 0x006e }
            com.tencent.mm.ipcinvoker.type.IPCString r3 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r3     // Catch:{ JSONException -> 0x006e }
            java.lang.String r3 = r3.f10315d     // Catch:{ JSONException -> 0x006e }
            boolean r3 = r1.mo1708w(r8, r3)     // Catch:{ JSONException -> 0x006e }
            if (r3 == 0) goto L_0x0139
            r3 = r18
            r8 = 1
            r9 = 1
            goto L_0x013d
        L_0x0139:
            r9 = r12
            r8 = r13
            r3 = r18
        L_0x013d:
            boolean r6 = r0.has(r3)     // Catch:{ JSONException -> 0x006e }
            r10 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r11 = 2130772182(0x7f0100d6, float:1.7147475E38)
            java.lang.String r12 = "currentAnimOut"
            java.lang.String r13 = "nextAnimIn"
            if (r6 == 0) goto L_0x0175
            java.lang.String r3 = r0.getString(r3)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r6 = "modal"
            boolean r6 = r3.equals(r6)     // Catch:{ JSONException -> 0x006e }
            if (r6 == 0) goto L_0x0166
            r3 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r5.putInt(r13, r3)     // Catch:{ JSONException -> 0x006e }
            r3 = 2130772172(0x7f0100cc, float:1.7147455E38)
            r5.putInt(r12, r3)     // Catch:{ JSONException -> 0x006e }
            goto L_0x017b
        L_0x0166:
            java.lang.String r6 = "push"
            boolean r3 = r3.equals(r6)     // Catch:{ JSONException -> 0x006e }
            if (r3 == 0) goto L_0x017b
            r5.putInt(r13, r11)     // Catch:{ JSONException -> 0x006e }
            r5.putInt(r12, r10)     // Catch:{ JSONException -> 0x006e }
            goto L_0x017b
        L_0x0175:
            r5.putInt(r13, r11)     // Catch:{ JSONException -> 0x006e }
            r5.putInt(r12, r10)     // Catch:{ JSONException -> 0x006e }
        L_0x017b:
            r3 = r17
            boolean r6 = r0.has(r3)     // Catch:{ JSONException -> 0x006e }
            if (r6 == 0) goto L_0x0189
            boolean r0 = r0.getBoolean(r3)     // Catch:{ JSONException -> 0x006e }
            r1.f11413g = r0     // Catch:{ JSONException -> 0x006e }
        L_0x0189:
            kj2.d r0 = kj2.C117407d.INSTANCE
            r3 = 20980(0x51f4, float:2.9399E-41)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r0.mo160131h(r3, r6)
            r23 = 1293(0x50d, double:6.39E-321)
            r25 = 89
            r27 = 1
            r22 = r0
            r22.mo182089r(r23, r25, r27)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "open liteapp:"
            r0.append(r3)
            r0.append(r7)
            java.lang.String r3 = ", page:"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCVoid r2 = new com.tencent.mm.ipcinvoker.type.IPCVoid
            r2.<init>()
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$a> r3 = com.tencent.p014mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp.C1718a.class
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98749b(r0, r2, r3)
            di3.d r0 = di3.C86312j.m106911c(r19)
            tt.e r0 = (p244tt.C14088e) r0
            android.content.Context r6 = r4.getContext()
            com.tencent.mm.plugin.appbrand.jsapi.liteapp.a r10 = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.a
            r3 = r32
            r10.<init>(r1, r4, r3)
            r2 = r5
            r5 = r0
            r7 = r2
            r5.mo13510OP(r6, r7, r8, r9, r10)
            goto L_0x01f5
        L_0x01e0:
            r0 = move-exception
            r3 = r2
        L_0x01e2:
            r2 = r16
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = r30
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r6, r5)
            java.lang.String r0 = "fail"
            java.lang.String r0 = r1.mo115109j(r0)
            r4.mo109647a(r3, r0)
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public final boolean mo1708w(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        while (i < min) {
            if (split[i].equals(split2[i])) {
                i++;
            } else if (split[i].length() > split2[i].length()) {
                return true;
            } else {
                return split[i].length() >= split2[i].length() && split[i].compareTo(split2[i]) > 0;
            }
        }
        return false;
    }
}
