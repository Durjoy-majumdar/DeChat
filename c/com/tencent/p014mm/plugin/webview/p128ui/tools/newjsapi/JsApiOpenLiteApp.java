package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fm0.C86943h0;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p244tt.C14088e;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenLiteApp */
public final class JsApiOpenLiteApp extends C15053a {

    /* renamed from: d */
    public static final JsApiOpenLiteApp f23345d = new JsApiOpenLiteApp();

    /* renamed from: e */
    public static final int f23346e = C86943h0.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23347f = "openLiteApp";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenLiteApp$OpenLiteAppData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenLiteApp$OpenLiteAppData */
    public static final class OpenLiteAppData implements Parcelable {
        public static final C6391a CREATOR = new C6391a((C8480h) null);

        /* renamed from: d */
        public Bundle f23348d = new Bundle();

        /* renamed from: e */
        public boolean f23349e;

        /* renamed from: f */
        public boolean f23350f;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenLiteApp$OpenLiteAppData$a */
        public static final class C6391a implements Parcelable.Creator<OpenLiteAppData> {
            public C6391a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new OpenLiteAppData(parcel);
            }

            public Object[] newArray(int i) {
                return new OpenLiteAppData[i];
            }
        }

        public OpenLiteAppData(Parcel parcel) {
            C87412m.m108594g(parcel, "src");
            Bundle readBundle = parcel.readBundle();
            this.f23348d = readBundle == null ? new Bundle() : readBundle;
            boolean z = true;
            this.f23349e = parcel.readByte() != 0;
            this.f23350f = parcel.readByte() == 0 ? false : z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeBundle(this.f23348d);
            parcel.writeByte(this.f23349e ? (byte) 1 : 0);
            parcel.writeByte(this.f23350f ? (byte) 1 : 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenLiteApp$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenLiteApp$OpenLiteAppData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenLiteApp$a */
    public static final class C6392a implements C80883e<OpenLiteAppData, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle;
            OpenLiteAppData openLiteAppData = (OpenLiteAppData) obj;
            Log.m105926v("MicroMsg.JsApiOpenLiteApp", "OpenLiteApp in mm process");
            C8477a0 a0Var = new C8477a0();
            a0Var.f27482d = true;
            if (openLiteAppData != null) {
                try {
                    bundle = openLiteAppData.f23348d;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.JsApiOpenLiteApp", e, "OpenLiteApp exception", new Object[0]);
                    a0Var.f27482d = false;
                }
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            C87412m.m108592e(bundle2, "null cannot be cast to non-null type android.os.Bundle");
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle2, openLiteAppData.f23349e, openLiteAppData.f23350f, new C6559s1(a0Var));
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(a0Var.f27482d));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x016a A[SYNTHETIC, Splitter:B:57:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0192 A[Catch:{ Exception -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a7 A[Catch:{ Exception -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01aa A[Catch:{ Exception -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ad A[Catch:{ Exception -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d0 A[Catch:{ Exception -> 0x028f }, LOOP:0: B:76:0x01ce->B:77:0x01d0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fb A[Catch:{ Exception -> 0x028f }, LOOP:1: B:84:0x01f9->B:85:0x01fb, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r28, t83.C13851h1 r29) {
        /*
            r27 = this;
            r1 = r28
            r2 = r29
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r3 = "MicroMsg.JsApiOpenLiteApp"
            java.lang.String r0 = "OpenLiteApp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.String r4 = "appId"
            java.lang.Object r0 = r0.get(r4)
            r5 = 0
            r6 = 0
            if (r0 != 0) goto L_0x003c
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.f38996i
            r3.append(r2)
            java.lang.String r2 = ": fail expected appId"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo10774a(r1, r2, r5)
            return r6
        L_0x003c:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r0, r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "enterType"
            java.lang.String r8 = "minVersion"
            java.lang.String r9 = "isOpenWithNewTab"
            java.lang.String r10 = "isForbidRightGesture"
            java.lang.String r11 = "isTransparent"
            java.lang.String r12 = "syncCheckUpdate"
            java.lang.String r13 = "checkUpdate"
            java.lang.String r14 = "page"
            java.lang.Class<tt.e> r15 = p244tt.C14088e.class
            java.lang.String r5 = "heightPercent"
            java.lang.String r6 = "isHalfScreen"
            java.lang.String r1 = "query"
            r17 = r7
            java.lang.String r7 = ""
            r18 = r7
            r7 = 1
            r19 = r15
            java.lang.Object[] r15 = new java.lang.Object[r7]
            r16 = 0
            r15[r16] = r0
            java.lang.String r7 = "OpenLiteApp appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r7, r15)
            org.json.JSONObject r7 = r2.f38991d
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            r15.putString(r4, r0)
            boolean r4 = r7.has(r14)     // Catch:{ Exception -> 0x0291 }
            if (r4 == 0) goto L_0x0095
            java.lang.String r4 = r7.getString(r14)     // Catch:{ Exception -> 0x0291 }
            java.lang.String r14 = "params.getString(ILiteAppConstants.PAGE)"
            gy3.C87412m.m108593f(r4, r14)     // Catch:{ Exception -> 0x0291 }
            java.lang.String r14 = "path"
            r15.putString(r14, r4)     // Catch:{ Exception -> 0x0291 }
            goto L_0x0097
        L_0x0095:
            r4 = r18
        L_0x0097:
            boolean r14 = r7.has(r13)     // Catch:{ Exception -> 0x0291 }
            if (r14 == 0) goto L_0x00a2
            boolean r13 = r7.getBoolean(r13)     // Catch:{ Exception -> 0x0291 }
            goto L_0x00a3
        L_0x00a2:
            r13 = 1
        L_0x00a3:
            boolean r14 = r7.has(r12)     // Catch:{ Exception -> 0x0291 }
            if (r14 == 0) goto L_0x00ae
            boolean r12 = r7.getBoolean(r12)     // Catch:{ Exception -> 0x0291 }
            goto L_0x00af
        L_0x00ae:
            r12 = 0
        L_0x00af:
            boolean r14 = r7.has(r1)     // Catch:{ Exception -> 0x0291 }
            if (r14 == 0) goto L_0x00c8
            org.json.JSONObject r14 = r7.getJSONObject(r1)     // Catch:{ Exception -> 0x0291 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0291 }
            r20 = r12
            java.lang.String r12 = "params.getJSONObject(ILi…nstants.QUERY).toString()"
            gy3.C87412m.m108593f(r14, r12)     // Catch:{ Exception -> 0x0291 }
            r15.putString(r1, r14)     // Catch:{ Exception -> 0x0291 }
            goto L_0x00cc
        L_0x00c8:
            r20 = r12
            r14 = r18
        L_0x00cc:
            boolean r1 = r7.has(r11)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x00df
            boolean r1 = r7.getBoolean(r11)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x00df
            java.lang.String r1 = "transparent"
            r11 = 1
            r15.putBoolean(r1, r11)     // Catch:{ Exception -> 0x0291 }
        L_0x00df:
            boolean r1 = r7.has(r10)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x00f2
            boolean r1 = r7.getBoolean(r10)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x00f2
            java.lang.String r1 = "forbidRightGesture"
            r10 = 1
            r15.putBoolean(r1, r10)     // Catch:{ Exception -> 0x0291 }
            goto L_0x00f3
        L_0x00f2:
            r10 = 1
        L_0x00f3:
            boolean r1 = r7.has(r6)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x0100
            boolean r1 = r7.getBoolean(r6)     // Catch:{ Exception -> 0x0291 }
            r15.putBoolean(r6, r1)     // Catch:{ Exception -> 0x0291 }
        L_0x0100:
            boolean r1 = r7.has(r5)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x010d
            double r11 = r7.getDouble(r5)     // Catch:{ Exception -> 0x0291 }
            r15.putDouble(r5, r11)     // Catch:{ Exception -> 0x0291 }
        L_0x010d:
            boolean r1 = r7.has(r9)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x011c
            boolean r1 = r7.getBoolean(r9)     // Catch:{ Exception -> 0x0291 }
            java.lang.String r5 = "openWithNewTab"
            r15.putBoolean(r5, r1)     // Catch:{ Exception -> 0x0291 }
        L_0x011c:
            boolean r1 = r7.has(r8)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x0154
            java.lang.String r1 = r7.getString(r8)     // Catch:{ Exception -> 0x0291 }
            java.lang.String r5 = "params.getString(\"minVersion\")"
            gy3.C87412m.m108593f(r1, r5)     // Catch:{ Exception -> 0x0291 }
            di3.d r5 = di3.C86312j.m106911c(r19)     // Catch:{ Exception -> 0x0291 }
            tt.e r5 = (p244tt.C14088e) r5     // Catch:{ Exception -> 0x0291 }
            com.tencent.liteapp.storage.WxaLiteAppInfo r5 = r5.mo13509NR(r0)     // Catch:{ Exception -> 0x0291 }
            if (r5 == 0) goto L_0x0154
            di3.d r6 = di3.C86312j.m106911c(r19)     // Catch:{ Exception -> 0x0291 }
            tt.e r6 = (p244tt.C14088e) r6     // Catch:{ Exception -> 0x0291 }
            java.lang.String r8 = r5.f339295i     // Catch:{ Exception -> 0x0291 }
            java.lang.String r9 = r5.f339290d     // Catch:{ Exception -> 0x0291 }
            java.lang.String r5 = r5.f339294h     // Catch:{ Exception -> 0x0291 }
            java.lang.String r5 = r6.mo13504K8(r8, r9, r5)     // Catch:{ Exception -> 0x0291 }
            r6 = r27
            boolean r1 = r6.mo7410e(r1, r5)     // Catch:{ Exception -> 0x028f }
            if (r1 == 0) goto L_0x0156
            r5 = r17
            r1 = 1
            r13 = 1
            goto L_0x015a
        L_0x0154:
            r6 = r27
        L_0x0156:
            r5 = r17
            r1 = r20
        L_0x015a:
            boolean r8 = r7.has(r5)     // Catch:{ Exception -> 0x028f }
            r9 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r11 = 2130772182(0x7f0100d6, float:1.7147475E38)
            java.lang.String r12 = "currentAnimOut"
            java.lang.String r10 = "nextAnimIn"
            if (r8 == 0) goto L_0x0192
            java.lang.String r5 = r7.getString(r5)     // Catch:{ Exception -> 0x028f }
            java.lang.String r7 = "modal"
            boolean r7 = r5.equals(r7)     // Catch:{ Exception -> 0x028f }
            if (r7 == 0) goto L_0x0183
            r5 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r15.putInt(r10, r5)     // Catch:{ Exception -> 0x028f }
            r5 = 2130772172(0x7f0100cc, float:1.7147455E38)
            r15.putInt(r12, r5)     // Catch:{ Exception -> 0x028f }
            goto L_0x0198
        L_0x0183:
            java.lang.String r7 = "push"
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x0198
            r15.putInt(r10, r11)     // Catch:{ Exception -> 0x028f }
            r15.putInt(r12, r9)     // Catch:{ Exception -> 0x028f }
            goto L_0x0198
        L_0x0192:
            r15.putInt(r10, r11)     // Catch:{ Exception -> 0x028f }
            r15.putInt(r12, r9)     // Catch:{ Exception -> 0x028f }
        L_0x0198:
            java.lang.String r5 = "sourceType"
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f38983a     // Catch:{ Exception -> 0x028f }
            java.lang.String r8 = "liteAppId"
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x028f }
            boolean r8 = r7 instanceof java.lang.String     // Catch:{ Exception -> 0x028f }
            if (r8 == 0) goto L_0x01aa
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x028f }
            goto L_0x01ab
        L_0x01aa:
            r7 = 0
        L_0x01ab:
            if (r7 != 0) goto L_0x01b0
            java.lang.String r7 = "web"
        L_0x01b0:
            r15.putString(r5, r7)     // Catch:{ Exception -> 0x028f }
            org.json.JSONObject r5 = r2.f38991d     // Catch:{ Exception -> 0x028f }
            java.lang.String r7 = "enableSourceActions"
            org.json.JSONArray r5 = r5.optJSONArray(r7)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x01de
            int r7 = r5.length()     // Catch:{ Exception -> 0x028f }
            if (r7 <= 0) goto L_0x01de
            int r7 = r5.length()     // Catch:{ Exception -> 0x028f }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x028f }
            int r8 = r5.length()     // Catch:{ Exception -> 0x028f }
            r9 = 0
        L_0x01ce:
            if (r9 >= r8) goto L_0x01d9
            java.lang.String r10 = r5.optString(r9)     // Catch:{ Exception -> 0x028f }
            r7[r9] = r10     // Catch:{ Exception -> 0x028f }
            int r9 = r9 + 1
            goto L_0x01ce
        L_0x01d9:
            java.lang.String r5 = "enableActions"
            r15.putStringArray(r5, r7)     // Catch:{ Exception -> 0x028f }
        L_0x01de:
            org.json.JSONObject r5 = r2.f38991d     // Catch:{ Exception -> 0x028f }
            java.lang.String r7 = "enableSourceViews"
            org.json.JSONArray r5 = r5.optJSONArray(r7)     // Catch:{ Exception -> 0x028f }
            if (r5 == 0) goto L_0x0209
            int r7 = r5.length()     // Catch:{ Exception -> 0x028f }
            if (r7 <= 0) goto L_0x0209
            int r7 = r5.length()     // Catch:{ Exception -> 0x028f }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x028f }
            int r8 = r5.length()     // Catch:{ Exception -> 0x028f }
            r9 = 0
        L_0x01f9:
            if (r9 >= r8) goto L_0x0204
            java.lang.String r10 = r5.optString(r9)     // Catch:{ Exception -> 0x028f }
            r7[r9] = r10     // Catch:{ Exception -> 0x028f }
            int r9 = r9 + 1
            goto L_0x01f9
        L_0x0204:
            java.lang.String r5 = "enableViews"
            r15.putStringArray(r5, r7)     // Catch:{ Exception -> 0x028f }
        L_0x0209:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r7 = ","
            r5.append(r7)
            r5.append(r4)
            r5.append(r7)
            r5.append(r14)
            r5.append(r7)
            r5.append(r13)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 20980(0x51f4, float:2.9399E-41)
            java.lang.String r5 = r5.toString()
            r7.kvStat(r8, r5)
            r21 = 1293(0x50d, double:6.39E-321)
            r23 = 89
            r25 = 1
            r20 = r7
            r20.mo175913w(r21, r23, r25)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "open liteapp:"
            r5.append(r7)
            r5.append(r0)
            java.lang.String r0 = ", page:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ", query"
            r5.append(r0)
            r5.append(r14)
            java.lang.String r0 = ", checkUpdate:"
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = ", syncCheckUpdate:"
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            di3.d r0 = di3.C86312j.m106911c(r19)
            r20 = r0
            tt.e r20 = (p244tt.C14088e) r20
            r4 = r28
            android.content.Context r0 = r4.f38998a
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.t1 r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t1
            r3.<init>(r4, r2)
            r21 = r0
            r22 = r15
            r23 = r13
            r24 = r1
            r25 = r3
            r20.mo13510OP(r21, r22, r23, r24, r25)
            r1 = 1
            goto L_0x02b9
        L_0x028f:
            r0 = move-exception
            goto L_0x0294
        L_0x0291:
            r0 = move-exception
            r6 = r27
        L_0x0294:
            r4 = r28
            r1 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r7 = r18
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r7, r5)
            t83.g r0 = r4.f39001d
            java.lang.String r3 = r2.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.f38996i
            r4.append(r2)
            java.lang.String r2 = ": fail"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r4 = 0
            r0.mo10774a(r3, r2, r4)
        L_0x02b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenLiteApp.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23346e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23347f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7410e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x00ef
            int r1 = r7.length()
            r2 = 1
            if (r1 != 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            if (r1 == 0) goto L_0x0011
            goto L_0x00ef
        L_0x0011:
            if (r8 == 0) goto L_0x00ee
            int r1 = r8.length()
            if (r1 != 0) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r1 == 0) goto L_0x0020
            goto L_0x00ee
        L_0x0020:
            z04.k r1 = new z04.k
            java.lang.String r3 = "\\."
            r1.<init>((java.lang.String) r3)
            java.util.List r7 = r1.mo90760e(r7, r0)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x005a
            int r1 = r7.size()
            java.util.ListIterator r1 = r7.listIterator(r1)
        L_0x0039:
            boolean r4 = r1.hasPrevious()
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r1.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 != 0) goto L_0x0039
            int r1 = r1.nextIndex()
            int r1 = r1 + r2
            java.util.List r7 = sx3.C110818d0.m150947s0(r7, r1)
            goto L_0x005c
        L_0x005a:
            sx3.f0 r7 = sx3.C64186f0.f181907d
        L_0x005c:
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.Object[] r7 = r7.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r7, r1)
            java.lang.String[] r7 = (java.lang.String[]) r7
            z04.k r4 = new z04.k
            r4.<init>((java.lang.String) r3)
            java.util.List r8 = r4.mo90760e(r8, r0)
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x00a1
            int r3 = r8.size()
            java.util.ListIterator r3 = r8.listIterator(r3)
        L_0x0080:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r4 = r3.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0094
            r4 = 1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            if (r4 != 0) goto L_0x0080
            int r3 = r3.nextIndex()
            int r3 = r3 + r2
            java.util.List r8 = sx3.C110818d0.m150947s0(r8, r3)
            goto L_0x00a3
        L_0x00a1:
            sx3.f0 r8 = sx3.C64186f0.f181907d
        L_0x00a3:
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.Object[] r8 = r8.toArray(r3)
            gy3.C87412m.m108592e(r8, r1)
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r1 = r7.length
            int r3 = r8.length
            int r1 = java.lang.Math.min(r1, r3)
            r3 = 0
        L_0x00b5:
            if (r3 >= r1) goto L_0x00ed
            r4 = r7[r3]
            r5 = r8[r3]
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x00c4
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00c4:
            r1 = r7[r3]
            int r1 = r1.length()
            r4 = r8[r3]
            int r4 = r4.length()
            if (r1 <= r4) goto L_0x00d3
            return r2
        L_0x00d3:
            r1 = r7[r3]
            int r1 = r1.length()
            r4 = r8[r3]
            int r4 = r4.length()
            if (r1 >= r4) goto L_0x00e2
            goto L_0x00ed
        L_0x00e2:
            r7 = r7[r3]
            r8 = r8[r3]
            int r7 = r7.compareTo(r8)
            if (r7 <= 0) goto L_0x00ed
            r0 = 1
        L_0x00ed:
            return r0
        L_0x00ee:
            return r2
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.JsApiOpenLiteApp.mo7410e(java.lang.String, java.lang.String):boolean");
    }
}
