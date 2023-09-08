package zn0;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import ao0.C79610c;
import ao0.C79614g;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86917b;
import java.util.Map;
import p225rc.C89922k;

/* renamed from: zn0.a */
public class C91797a extends C82268c {
    public static final int CTRL_INDEX = 316;
    public static final String NAME = "connectWifi";

    /* renamed from: zn0.a$a */
    public class C91798a implements C79610c {

        /* renamed from: a */
        public final /* synthetic */ boolean f262878a;

        /* renamed from: b */
        public final /* synthetic */ Context f262879b;

        /* renamed from: c */
        public final /* synthetic */ C82381f f262880c;

        /* renamed from: d */
        public final /* synthetic */ int f262881d;

        public C91798a(boolean z, Context context, C82381f fVar, int i) {
            this.f262878a = z;
            this.f262879b = context;
            this.f262880c = fVar;
            this.f262881d = i;
        }
    }

    /* renamed from: zn0.a$b */
    public class C91799b extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262883d;

        public C91799b(C91797a aVar, C82381f fVar) {
            this.f262883d = fVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105918d("MicroMsg.JsApiConnectWifi", "remove listener");
            C79614g.f233463d = null;
            C83231l.m102144e(this.f262883d.getAppId(), this);
        }
    }

    /* renamed from: zn0.a$c */
    public static class C91800c extends C82919r2 {
        private static final int CTRL_INDEX = 322;
        private static final String NAME = "onWifiConnected";
    }

    /* renamed from: zn0.a$d */
    public static class C91801d extends C82919r2 {
        private static final int CTRL_INDEX = 322;
        private static final String NAME = "onWifiConnectedWithPartialInfo";
    }

    /* renamed from: w */
    public static Pair m115314w(C91797a aVar, Context context, C82381f fVar, Map map, boolean z) {
        aVar.getClass();
        if (!z) {
            if (Build.VERSION.SDK_INT < 23 || LocationUtil.isGpsEnable()) {
                boolean b = C89922k.m112465b((Activity) context, fVar, "android.permission.ACCESS_FINE_LOCATION");
                Log.m105925i("MicroMsg.JsApiConnectWifi", "fixErrInfo, checkLocation:%b", Boolean.valueOf(b));
                if (!b) {
                    map.put("errCode", 12012);
                    Log.m105920e("MicroMsg.JsApiConnectWifi", "fixErrInfo, may be not obtain GPS Perrmission");
                    return new Pair("fail:may be not obtain GPS Perrmission", C86917b.f252301x);
                }
            } else {
                map.put("errCode", 12006);
                Log.m105920e("MicroMsg.JsApiConnectWifi", "fixErrInfo, may be not open GPS");
                return new Pair("fail:may be not open GPS", C86917b.f252300w);
            }
        }
        map.put("errCode", 12010);
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x062c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ee  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r38, org.json.JSONObject r39, int r40) {
        /*
            r37 = this;
            r7 = r37
            r8 = r38
            r0 = r39
            r9 = r40
            java.lang.String r10 = "enableNetwork"
            java.lang.String r11 = "doConnectWifiFallbackLogic"
            android.content.Context r4 = r38.getContext()
            r12 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2 = 12010(0x2eea, float:1.683E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.String r14 = "errCode"
            java.lang.String r13 = "errno"
            java.lang.String r15 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r5 = "MicroMsg.AppBrandJsApi"
            java.lang.String r2 = "MicroMsg.JsApiConnectWifi"
            if (r4 != 0) goto L_0x0056
            java.lang.String r0 = "mContext is null, invoke fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r14, r6)
            java.lang.String r2 = "fail:context is null"
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 == 0) goto L_0x004b
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r4 = 1
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r15, r3)
        L_0x004b:
            r0.put(r13, r1)
            java.lang.String r0 = r7.mo115114o(r2, r0)
            r8.mo109647a(r9, r0)
            return
        L_0x0056:
            boolean r1 = zn0.C91807d.f262895g
            if (r1 != 0) goto L_0x0095
            java.lang.String r0 = "not invoke startWifi"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r14, r1)
            r1 = 1505001(0x16f6e9, float:2.108956E-39)
            java.lang.String r2 = "fail:not invoke startWifi"
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 == 0) goto L_0x0086
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r3[r6] = r4
            r4 = 1
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r15, r3)
        L_0x0086:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r13, r1)
            java.lang.String r0 = r7.mo115114o(r2, r0)
            r8.mo109647a(r9, r0)
            return
        L_0x0095:
            ao0.C79614g.m96681b(r4)
            li0.b r1 = r38.getAppState()
            li0.b r12 = li0.C88508b.FOREGROUND
            if (r1 == r12) goto L_0x00e5
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            li0.b r1 = r38.getAppState()
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "current state :%s isn't foreground"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 12011(0x2eeb, float:1.6831E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r14, r1)
            r1 = 1505021(0x16f6fd, float:2.108984E-39)
            java.lang.String r2 = "fail:weapp in background"
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 == 0) goto L_0x00d6
            r12 = 2
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r3[r6] = r4
            r4 = 1
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r15, r3)
        L_0x00d6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r13, r1)
            java.lang.String r0 = r7.mo115114o(r2, r0)
            r8.mo109647a(r9, r0)
            return
        L_0x00e5:
            r12 = 2
            if (r0 == 0) goto L_0x00f0
            java.lang.String r1 = "maunal"
            r12 = 0
            boolean r1 = r0.optBoolean(r1, r12)
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            java.lang.String r12 = ""
            if (r1 == 0) goto L_0x0240
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.WIFI_SETTINGS"
            r0.<init>(r1)
            r1 = 1
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r4, r0, r1)
            java.lang.String r11 = "fail:open settings fail"
            r39 = r11
            if (r10 == 0) goto L_0x0202
            java.lang.String r10 = "use manual"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            k20.a r10 = new k20.a     // Catch:{ Exception -> 0x01bb }
            r10.<init>()     // Catch:{ Exception -> 0x01bb }
            r10.mo10233c(r0)     // Catch:{ Exception -> 0x01bb }
            java.lang.Object[] r0 = r10.mo10232b()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r16 = "com/tencent/mm/plugin/appbrand/jsapi/wifi/JsApiConnectWifi"
            java.lang.String r17 = "invoke"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V"
            java.lang.String r19 = "Undefined"
            java.lang.String r21 = "startActivity"
            java.lang.String r22 = "(Landroid/content/Intent;)V"
            r11 = r12
            r20 = 2
            r12 = r4
            r24 = r11
            r11 = r13
            r13 = r0
            r8 = r14
            r14 = r16
            r9 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r21
            r19 = r22
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x01ae }
            r12 = 0
            java.lang.Object r0 = r10.mo10231a(r12)     // Catch:{ Exception -> 0x01ae }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x01ae }
            r4.startActivity(r0)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r10 = "com/tencent/mm/plugin/appbrand/jsapi/wifi/JsApiConnectWifi"
            java.lang.String r13 = "invoke"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            r0 = r4
            r4 = 1
            r1 = r10
            r12 = r2
            r10 = 2
            r2 = r13
            r13 = r3
            r3 = r14
            r14 = 1
            r4 = r15
            r25 = r5
            r15 = 0
            r5 = r16
            r26 = r6
            r6 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01a8 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x01a8 }
            r0.<init>()     // Catch:{ Exception -> 0x01a8 }
            r0.put(r8, r13)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r1 = "ok"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x01a8 }
            if (r2 == 0) goto L_0x018a
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0186 }
            r2[r15] = r13     // Catch:{ Exception -> 0x0186 }
            r2[r14] = r1     // Catch:{ Exception -> 0x0186 }
            r6 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r2)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x018c
        L_0x0186:
            r0 = move-exception
            r6 = r25
            goto L_0x01a1
        L_0x018a:
            r6 = r25
        L_0x018c:
            r0.put(r11, r13)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = r7.mo115114o(r1, r0)     // Catch:{ Exception -> 0x01a0 }
            r13 = r8
            r5 = r9
            r8 = r38
            r9 = r40
            r8.mo109647a(r9, r0)     // Catch:{ Exception -> 0x019e }
            goto L_0x0201
        L_0x019e:
            r0 = move-exception
            goto L_0x01c8
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            r13 = r8
            r5 = r9
        L_0x01a3:
            r8 = r38
        L_0x01a5:
            r9 = r40
            goto L_0x01c8
        L_0x01a8:
            r0 = move-exception
            r13 = r8
            r5 = r9
            r6 = r25
            goto L_0x01a3
        L_0x01ae:
            r0 = move-exception
            r12 = r2
            r26 = r6
            r13 = r8
            r10 = 2
            r14 = 1
            r15 = 0
            r8 = r38
            r6 = r5
            r5 = r9
            goto L_0x01a5
        L_0x01bb:
            r0 = move-exception
            r26 = r6
            r24 = r12
            r11 = r13
            r13 = r14
            r10 = 2
            r14 = 1
            r12 = r2
            r6 = r5
            r5 = r15
            r15 = 0
        L_0x01c8:
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r3 = r24
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r26
            r0.put(r13, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x01ee
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r2 = 1505022(0x16f6fe, float:2.108985E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1[r15] = r3
            r1[r14] = r39
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r1)
            goto L_0x01f1
        L_0x01ee:
            r2 = 1505022(0x16f6fe, float:2.108985E-39)
        L_0x01f1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r11, r1)
            r1 = r39
            java.lang.String r0 = r7.mo115114o(r1, r0)
            r8.mo109647a(r9, r0)
        L_0x0201:
            return
        L_0x0202:
            r1 = r39
            r12 = r2
            r6 = r5
            r11 = r13
            r5 = r15
            r2 = 1505022(0x16f6fe, float:2.108985E-39)
            r10 = 2
            r14 = 1
            r15 = 0
            java.lang.String r0 = "jump2SysWifiSettingsIntent is unavailable"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0224
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0[r15] = r3
            r0[r14] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r0)
        L_0x0224:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r3.put(r11, r2)     // Catch:{ Exception -> 0x022d }
            goto L_0x0238
        L_0x022d:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r15] = r2
            java.lang.String r2 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r0)
        L_0x0238:
            java.lang.String r0 = r7.mo115115p(r1, r3)
            r8.mo109647a(r9, r0)
            return
        L_0x0240:
            r1 = r6
            r3 = r12
            r12 = r2
            r6 = r5
            r2 = r11
            r11 = r13
            r13 = r14
            r5 = r15
            r14 = 2
            r15 = 0
            boolean r18 = bo0.C79743f.m96882b()
            if (r18 != 0) goto L_0x028a
            java.lang.String r0 = "wifi is disable"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 12005(0x2ee5, float:1.6823E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r13, r1)
            java.lang.String r1 = "fail:wifi is disable"
            r2 = 1505002(0x16f6ea, float:2.108957E-39)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 == 0) goto L_0x027b
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r15] = r4
            r4 = 1
            r3[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r3)
        L_0x027b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r11, r2)
            java.lang.String r0 = r7.mo115114o(r1, r0)
            r8.mo109647a(r9, r0)
            return
        L_0x028a:
            r18 = 101(0x65, float:1.42E-43)
            java.lang.String r14 = "fail:invalid data"
            java.lang.String r15 = "params is invalid"
            if (r0 == 0) goto L_0x064a
            r19 = r10
            java.lang.String r10 = "SSID"
            boolean r21 = r0.has(r10)
            if (r21 != 0) goto L_0x029f
            goto L_0x064a
        L_0x029f:
            ao0.b r1 = ao0.C79609b.f233451a
            r1.getClass()
            java.lang.String r1 = "acceptIncompleteWiFiInfo"
            r21 = r2
            r2 = 0
            boolean r22 = r0.optBoolean(r1, r2)
            zn0.a$a r23 = new zn0.a$a
            r1 = r23
            r27 = r21
            r2 = r37
            r9 = r3
            r3 = r22
            r21 = r11
            r11 = r5
            r5 = r38
            r28 = r6
            r6 = r40
            r1.<init>(r3, r4, r5, r6)
            ao0.C79614g.f233463d = r23
            zn0.a$b r1 = new zn0.a$b
            r1.<init>(r7, r8)
            java.lang.String r2 = r38.getAppId()
            com.tencent.p014mm.plugin.appbrand.C83231l.m102140a(r2, r1)
            java.lang.String r1 = r0.optString(r10)
            java.lang.String r2 = "BSSID"
            java.lang.String r2 = r0.optString(r2)
            java.lang.String r3 = "password"
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r4 = "timeout"
            r5 = -1
            r10 = r3
            long r3 = r0.optLong(r4, r5)
            java.lang.String r5 = "forceNewApi"
            r6 = 0
            boolean r0 = r0.optBoolean(r5, r6)
            boolean r5 = r1.equals(r9)
            if (r5 == 0) goto L_0x0334
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r15)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 12008(0x2ee8, float:1.6827E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r13, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x0321
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r5 = 0
            r1[r5] = r2
            r6 = 1
            r1[r6] = r14
            r2 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r11, r1)
        L_0x0321:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r3 = r21
            r0.put(r3, r1)
            java.lang.String r0 = r7.mo115114o(r14, r0)
            r4 = r40
            r8.mo109647a(r4, r0)
            return
        L_0x0334:
            r5 = 0
            r6 = 1
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r5] = r1
            r8[r6] = r2
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r6 = 2
            r8[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r6 = 3
            r8[r6] = r5
            java.lang.String r5 = "ssid:%s, bSsid:%s timeoutMs: %d, forceNewApi: %b is connecting"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r8)
            java.lang.ref.WeakReference<bo0.a> r5 = ao0.C79614g.f233461b
            if (r5 == 0) goto L_0x036f
            java.lang.Object r5 = r5.get()
            bo0.a r5 = (bo0.C79729a) r5
            if (r5 == 0) goto L_0x036f
            int r8 = r5.f233686i
            if (r8 == r6) goto L_0x0367
            r6 = 2
            if (r8 != r6) goto L_0x0365
            goto L_0x0367
        L_0x0365:
            r6 = 0
            goto L_0x0368
        L_0x0367:
            r6 = 1
        L_0x0368:
            if (r6 != 0) goto L_0x036f
            java.lang.String r6 = "duplicated request"
            r5.mo109859a(r6)
        L_0x036f:
            bo0.a r5 = new bo0.a
            ao0.c r6 = ao0.C79614g.f233463d
            android.content.Context r8 = ao0.C79614g.f233464e
            r5.<init>(r6, r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "ssid:"
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = " bssid:"
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "MicroMsg.WiFiConnector"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r8 = -1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x039f
            r5.f233687j = r3
        L_0x039f:
            boolean r0 = r5.f233689l
            if (r0 == 0) goto L_0x03c2
            java.lang.String r0 = "connect, use WifiConnector29Impl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            bo0.e r29 = bo0.C79735e.f233694a
            android.content.Context r0 = r5.f233679b
            bo0.c r6 = new bo0.c
            r6.<init>(r5)
            r30 = r0
            r31 = r1
            r32 = r2
            r33 = r10
            r34 = r3
            r36 = r6
            r29.mo109867a(r30, r31, r32, r33, r34, r36)
            goto L_0x0642
        L_0x03c2:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x03ca
            r2 = 0
            goto L_0x03cb
        L_0x03ca:
            r2 = 2
        L_0x03cb:
            int r0 = r1.length()
            r3 = 0
            if (r0 > 0) goto L_0x03d3
            goto L_0x040f
        L_0x03d3:
            android.net.wifi.WifiConfiguration r0 = new android.net.wifi.WifiConfiguration
            r0.<init>()
            java.util.BitSet r4 = r0.allowedAuthAlgorithms
            r4.clear()
            java.util.BitSet r4 = r0.allowedGroupCiphers
            r4.clear()
            java.util.BitSet r4 = r0.allowedKeyManagement
            r4.clear()
            java.util.BitSet r4 = r0.allowedPairwiseCiphers
            r4.clear()
            java.util.BitSet r4 = r0.allowedProtocols
            r4.clear()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "\""
            r4.append(r8)
            r4.append(r1)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r0.SSID = r4
            r4 = 1
            r0.hiddenSSID = r4
            if (r2 == 0) goto L_0x0439
            r4 = 2
            if (r2 == r4) goto L_0x0411
        L_0x040f:
            r4 = r3
            goto L_0x0443
        L_0x0411:
            int r4 = r10.length()
            if (r4 == 0) goto L_0x043f
            java.lang.String r4 = "[0-9A-Fa-f]{64}"
            boolean r4 = r10.matches(r4)
            if (r4 == 0) goto L_0x0422
            r0.preSharedKey = r10
            goto L_0x043f
        L_0x0422:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r8 = 34
            r4.append(r8)
            r4.append(r10)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r0.preSharedKey = r4
            goto L_0x043f
        L_0x0439:
            java.util.BitSet r4 = r0.allowedKeyManagement
            r8 = 0
            r4.set(r8)
        L_0x043f:
            r4 = 2
            r0.status = r4
            r4 = r0
        L_0x0443:
            java.util.List r0 = bo0.C79734d.m96872b()
            if (r0 == 0) goto L_0x046c
            java.util.Iterator r0 = r0.iterator()
        L_0x044d:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x046c
            java.lang.Object r8 = r0.next()
            android.net.wifi.WifiConfiguration r8 = (android.net.wifi.WifiConfiguration) r8
            java.lang.String r9 = r8.SSID
            java.lang.String r9 = bo0.C79744g.m96886b(r9)
            int r9 = r9.compareTo(r1)
            if (r9 != 0) goto L_0x044d
            int r9 = bo0.C79744g.m96885a(r8)
            if (r9 != r2) goto L_0x044d
            r3 = r8
        L_0x046c:
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r8 = 0
            r0[r8] = r4
            r8 = 1
            r0[r8] = r3
            java.lang.String r8 = "connect, config exists: %b, oldConfig exists: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r0)
            java.lang.String r8 = "MicroMsg.wifi_event"
            if (r4 == 0) goto L_0x0637
            java.lang.String r9 = "addNetwork"
            r10 = -1
            java.lang.String r11 = "MicroMsg.WifiManagerInternalWrapper"
            if (r3 == 0) goto L_0x0505
            int r0 = r1.length()
            if (r0 > 0) goto L_0x048d
            r13 = 0
            goto L_0x04d2
        L_0x048d:
            java.util.List r0 = bo0.C79734d.m96872b()
            if (r0 == 0) goto L_0x04cc
            java.util.Iterator r12 = r0.iterator()
            r13 = 0
        L_0x0498:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x04cd
            java.lang.Object r0 = r12.next()
            android.net.wifi.WifiConfiguration r0 = (android.net.wifi.WifiConfiguration) r0
            java.lang.String r14 = r0.SSID
            java.lang.String r14 = bo0.C79744g.m96886b(r14)
            int r14 = r14.compareTo(r1)
            if (r14 != 0) goto L_0x0498
            int r14 = bo0.C79744g.m96885a(r0)
            if (r14 != r2) goto L_0x0498
            int r0 = r0.networkId
            android.net.wifi.WifiManager r14 = bo0.C79743f.f233719a     // Catch:{ all -> 0x04bf }
            boolean r0 = r14.removeNetwork(r0)     // Catch:{ all -> 0x04bf }
            goto L_0x04ca
        L_0x04bf:
            r0 = move-exception
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.String r14 = "removeNetwork"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r14, r15)
            r0 = 0
        L_0x04ca:
            r13 = r13 | r0
            goto L_0x0498
        L_0x04cc:
            r13 = 0
        L_0x04cd:
            if (r13 == 0) goto L_0x04d2
            bo0.C79743f.m96883c()
        L_0x04d2:
            if (r13 == 0) goto L_0x04d9
            bo0.C79743f.m96883c()
            r0 = 1
            goto L_0x04da
        L_0x04d9:
            r0 = 0
        L_0x04da:
            if (r0 != 0) goto L_0x0505
            java.lang.String r0 = "connect, forgotWifi fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            int r0 = r4.networkId
            if (r0 >= 0) goto L_0x04f7
            android.net.wifi.WifiManager r0 = bo0.C79743f.f233719a     // Catch:{ all -> 0x04ec }
            int r0 = r0.addNetwork(r4)     // Catch:{ all -> 0x04ec }
            goto L_0x04f4
        L_0x04ec:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r9, r2)
            r0 = -1
        L_0x04f4:
            r4.networkId = r0
            goto L_0x04f8
        L_0x04f7:
            r0 = -1
        L_0x04f8:
            r4.networkId = r0
            if (r0 != r10) goto L_0x0505
            java.lang.String r0 = "connect, addConfig fail, use oldConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r1 = 1
            r5.f233688k = r1
            r4 = r3
        L_0x0505:
            int r0 = r4.networkId
            if (r0 != r10) goto L_0x0520
            if (r0 >= 0) goto L_0x051d
            android.net.wifi.WifiManager r0 = bo0.C79743f.f233719a     // Catch:{ all -> 0x0512 }
            int r0 = r0.addNetwork(r4)     // Catch:{ all -> 0x0512 }
            goto L_0x051a
        L_0x0512:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r9, r2)
            r0 = -1
        L_0x051a:
            r4.networkId = r0
            goto L_0x051e
        L_0x051d:
            r0 = -1
        L_0x051e:
            r4.networkId = r0
        L_0x0520:
            int r0 = r4.networkId
            if (r0 == r10) goto L_0x0632
            if (r0 == r10) goto L_0x05e1
            android.net.ConnectivityManager r0 = r5.f233685h
            if (r0 != 0) goto L_0x052c
            goto L_0x05e1
        L_0x052c:
            java.lang.String r0 = "android.net.wifi.WifiManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x05ab }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x05ab }
            r2 = 29
            if (r1 < r2) goto L_0x0557
            r1 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)     // Catch:{ Exception -> 0x0553 }
            int r0 = r4.networkId     // Catch:{ Exception -> 0x0553 }
            android.net.wifi.WifiManager r2 = bo0.C79743f.f233719a     // Catch:{ all -> 0x0548 }
            r3 = 1
            boolean r0 = r2.enableNetwork(r0, r3)     // Catch:{ all -> 0x0548 }
            goto L_0x05e2
        L_0x0548:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0553 }
            r2 = r19
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r2, r3)     // Catch:{ Exception -> 0x05a9 }
            goto L_0x05e1
        L_0x0553:
            r0 = move-exception
            r2 = r19
            goto L_0x05b0
        L_0x0557:
            r2 = r19
            r1 = r27
            bo0.a$b r3 = r5.f233681d     // Catch:{ Exception -> 0x05a9 }
            if (r3 != 0) goto L_0x0566
            bo0.a$b r3 = new bo0.a$b     // Catch:{ Exception -> 0x05a9 }
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x05a9 }
            r5.f233681d = r3     // Catch:{ Exception -> 0x05a9 }
        L_0x0566:
            java.lang.String r3 = "android.net.wifi.WifiManager$ActionListener"
            bo0.a$b r9 = r5.f233681d     // Catch:{ Exception -> 0x05a9 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x05a9 }
            java.lang.ClassLoader r10 = r3.getClassLoader()     // Catch:{ Exception -> 0x05a9 }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x05a9 }
            r12 = 0
            r13[r12] = r3     // Catch:{ Exception -> 0x05a9 }
            java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r10, r13, r9)     // Catch:{ Exception -> 0x05a9 }
            java.lang.String r9 = "android.net.wifi.WifiManager$ActionListener"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ Exception -> 0x05a9 }
            java.lang.String r10 = "connect"
            r12 = 2
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x05a9 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05a9 }
            r14 = 0
            r13[r14] = r12     // Catch:{ Exception -> 0x05a9 }
            r12 = 1
            r13[r12] = r9     // Catch:{ Exception -> 0x05a9 }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r13)     // Catch:{ Exception -> 0x05a9 }
            android.net.wifi.WifiManager r9 = bo0.C79743f.f233719a     // Catch:{ Exception -> 0x05a9 }
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x05a9 }
            int r12 = r4.networkId     // Catch:{ Exception -> 0x05a9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x05a9 }
            r13 = 0
            r10[r13] = r12     // Catch:{ Exception -> 0x05a9 }
            r12 = 1
            r10[r12] = r3     // Catch:{ Exception -> 0x05a9 }
            r0.invoke(r9, r10)     // Catch:{ Exception -> 0x05a9 }
            r0 = 1
            goto L_0x05e2
        L_0x05a9:
            r0 = move-exception
            goto L_0x05b0
        L_0x05ab:
            r0 = move-exception
            r2 = r19
            r1 = r27
        L_0x05b0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "connectWifi fail since "
            r3.append(r9)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = ", try fallback"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            int r0 = r4.networkId
            android.net.wifi.WifiManager r1 = bo0.C79743f.f233719a     // Catch:{ all -> 0x05da }
            r3 = 1
            boolean r0 = r1.enableNetwork(r0, r3)     // Catch:{ all -> 0x05da }
            goto L_0x05e2
        L_0x05da:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r2, r3)
        L_0x05e1:
            r0 = 0
        L_0x05e2:
            if (r0 == 0) goto L_0x062c
            java.lang.String r0 = "CONNECTING"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r1 = 1
            r5.mo109861c(r1)
            r5.f233682e = r4
            boolean r0 = r5.f233683f
            if (r0 != 0) goto L_0x0623
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.net.wifi.supplicant.STATE_CHANGE"
            r0.addAction(r1)
            java.lang.String r1 = "android.net.wifi.STATE_CHANGE"
            r0.addAction(r1)
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.setPriority(r1)
            bo0.b r1 = new bo0.b
            r1.<init>(r5)
            r5.f233684g = r1
            android.content.Context r2 = r5.f233679b
            r2.registerReceiver(r1, r0)
            r1 = 1
            r5.f233683f = r1
            java.lang.String r0 = "startMonitorWiFiEvent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0624
        L_0x0623:
            r1 = 1
        L_0x0624:
            android.os.Handler r0 = r5.f233680c
            long r2 = r5.f233687j
            r0.sendEmptyMessageDelayed(r1, r2)
            goto L_0x0642
        L_0x062c:
            java.lang.String r0 = "connect, connectWifi fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0637
        L_0x0632:
            java.lang.String r0 = "connect, addConfig fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x0637:
            java.lang.String r0 = "fail to connect wifi:invalid network id"
            r1 = 0
            r5.mo109860b(r1, r0)
            java.lang.String r0 = "connect args wrong FAIL."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x0642:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            ao0.C79614g.f233461b = r0
            return
        L_0x064a:
            r2 = r6
            r4 = r9
            r3 = r11
            r11 = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r15)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r13, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x066d
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r6 = 0
            r1[r6] = r5
            r5 = 1
            r1[r5] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r11, r1)
        L_0x066d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0.put(r3, r1)
            java.lang.String r0 = r7.mo115114o(r14, r0)
            r8.mo109647a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.C91797a.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
