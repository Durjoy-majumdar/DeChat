package zn0;

import android.content.Context;
import android.os.Looper;
import ao0.C79611d;
import ao0.C79613f;
import ao0.C79614g;
import bo0.C79743f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: zn0.c */
public class C91803c extends C82268c {
    public static final int CTRL_INDEX = 317;
    public static final String NAME = "getWifiList";

    /* renamed from: zn0.c$a */
    public class C91804a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f262884d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f262885e;

        /* renamed from: f */
        public final /* synthetic */ int f262886f;

        /* renamed from: g */
        public final /* synthetic */ Context f262887g;

        public C91804a(AtomicBoolean atomicBoolean, C82381f fVar, int i, Context context) {
            this.f262884d = atomicBoolean;
            this.f262885e = fVar;
            this.f262886f = i;
            this.f262887g = context;
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.JsApiGetWifiList", "onTimerExpired");
            Log.m105924i("MicroMsg.WiFiManagerWrapper", "releaseGetWiFiListCallback");
            C79614g.f233466g = null;
            if (!this.f262884d.get()) {
                C91803c.m115318w(C91803c.this, this.f262885e, this.f262886f, this.f262887g, C79614g.m96680a(true));
                this.f262884d.set(true);
                return false;
            }
            Log.m105924i("MicroMsg.JsApiGetWifiList", "onTimerExpired, hasCallback");
            return false;
        }
    }

    /* renamed from: zn0.c$b */
    public class C91805b implements C79611d {

        /* renamed from: a */
        public final /* synthetic */ MTimerHandler f262889a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f262890b;

        /* renamed from: c */
        public final /* synthetic */ C82381f f262891c;

        /* renamed from: d */
        public final /* synthetic */ int f262892d;

        /* renamed from: e */
        public final /* synthetic */ Context f262893e;

        public C91805b(MTimerHandler mTimerHandler, AtomicBoolean atomicBoolean, C82381f fVar, int i, Context context) {
            this.f262889a = mTimerHandler;
            this.f262890b = atomicBoolean;
            this.f262891c = fVar;
            this.f262892d = i;
            this.f262893e = context;
        }

        /* renamed from: a */
        public void mo125654a(C79613f fVar) {
            Log.m105924i("MicroMsg.JsApiGetWifiList", "onGetWiFiList");
            this.f262889a.stopTimer();
            Log.m105924i("MicroMsg.WiFiManagerWrapper", "releaseGetWiFiListCallback");
            C79614g.f233466g = null;
            if (!this.f262890b.get()) {
                C91803c.m115318w(C91803c.this, this.f262891c, this.f262892d, this.f262893e, fVar);
                this.f262890b.set(true);
                return;
            }
            Log.m105924i("MicroMsg.JsApiGetWifiList", "onGetWiFiList, hasCallback");
        }
    }

    /* renamed from: zn0.c$c */
    public static class C91806c extends C82919r2 {
        private static final int CTRL_INDEX = 321;
        private static final String NAME = "onGetWifiList";
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x017c  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m115318w(zn0.C91803c r18, com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r19, int r20, android.content.Context r21, ao0.C79613f r22) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            r0 = r22
            r18.getClass()
            java.lang.String r4 = r0.f233458a
            java.lang.String r5 = "ok"
            boolean r4 = r4.equals(r5)
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 12010(0x2eea, float:1.683E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "errno"
            java.lang.String r9 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r10 = "MicroMsg.AppBrandJsApi"
            java.lang.String r11 = "errCode"
            java.lang.String r12 = "MicroMsg.JsApiGetWifiList"
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r15 = 1
            if (r4 == 0) goto L_0x0194
            java.lang.String r4 = "onGetWifiList size:%d"
            java.lang.Object[] r13 = new java.lang.Object[r15]     // Catch:{ JSONException -> 0x0163 }
            java.util.List<ao0.e> r15 = r0.f233459b     // Catch:{ JSONException -> 0x0163 }
            java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ JSONException -> 0x0163 }
            int r15 = r15.size()     // Catch:{ JSONException -> 0x0163 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ JSONException -> 0x0163 }
            r16 = 0
            r13[r16] = r15     // Catch:{ JSONException -> 0x0163 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r13)     // Catch:{ JSONException -> 0x0163 }
            java.util.List<ao0.e> r4 = r0.f233459b     // Catch:{ JSONException -> 0x0163 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ JSONException -> 0x0163 }
            int r4 = r4.size()     // Catch:{ JSONException -> 0x0163 }
            if (r4 != 0) goto L_0x00f3
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0163 }
            r13 = 23
            if (r4 < r13) goto L_0x009a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.LocationUtil.isGpsEnable()     // Catch:{ JSONException -> 0x0163 }
            if (r4 != 0) goto L_0x009a
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x0163 }
            r0.<init>()     // Catch:{ JSONException -> 0x0163 }
            r4 = 12006(0x2ee6, float:1.6824E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0163 }
            r0.put(r11, r4)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r4 = "fail:may be not open GPS"
            r5 = 1505003(0x16f6eb, float:2.108958E-39)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x0163 }
            if (r13 == 0) goto L_0x0084
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ JSONException -> 0x0163 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0163 }
            r15 = 0
            r14[r15] = r13     // Catch:{ JSONException -> 0x0163 }
            r13 = 1
            r14[r13] = r4     // Catch:{ JSONException -> 0x0163 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r14)     // Catch:{ JSONException -> 0x0163 }
        L_0x0084:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0163 }
            r0.put(r8, r5)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r0 = r1.mo115114o(r4, r0)     // Catch:{ JSONException -> 0x0163 }
            r2.mo109647a(r3, r0)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r0 = "wifiList is empty, may be not open GPS"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ JSONException -> 0x0163 }
            goto L_0x01da
        L_0x009a:
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            r13 = r21
            boolean r4 = p225rc.C89922k.m112465b(r13, r2, r4)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r13 = "checkLocation:%b"
            r17 = r6
            r15 = 1
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ JSONException -> 0x0161 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)     // Catch:{ JSONException -> 0x0161 }
            r16 = 0
            r6[r16] = r15     // Catch:{ JSONException -> 0x0161 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r6)     // Catch:{ JSONException -> 0x0161 }
            if (r4 != 0) goto L_0x00f5
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x0161 }
            r0.<init>()     // Catch:{ JSONException -> 0x0161 }
            r4 = 12012(0x2eec, float:1.6832E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0161 }
            r0.put(r11, r4)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r4 = "fail:may be not obtain GPS Perrmission"
            r5 = 1505004(0x16f6ec, float:2.10896E-39)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x0161 }
            if (r6 == 0) goto L_0x00dd
            r6 = 2
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x0161 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0161 }
            r14 = 0
            r13[r14] = r6     // Catch:{ JSONException -> 0x0161 }
            r6 = 1
            r13[r6] = r4     // Catch:{ JSONException -> 0x0161 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r13)     // Catch:{ JSONException -> 0x0161 }
        L_0x00dd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0161 }
            r0.put(r8, r5)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r0 = r1.mo115114o(r4, r0)     // Catch:{ JSONException -> 0x0161 }
            r2.mo109647a(r3, r0)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r0 = "wifiList is empty, may be not obtain GPS Perrmission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x01da
        L_0x00f3:
            r17 = r6
        L_0x00f5:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ JSONException -> 0x0161 }
            r4.<init>()     // Catch:{ JSONException -> 0x0161 }
            r4.put(r11, r14)     // Catch:{ JSONException -> 0x0161 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x0161 }
            if (r6 == 0) goto L_0x010d
            r6 = 2
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x0161 }
            r6 = 0
            r13[r6] = r14     // Catch:{ JSONException -> 0x0161 }
            r6 = 1
            r13[r6] = r5     // Catch:{ JSONException -> 0x0161 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r13)     // Catch:{ JSONException -> 0x0161 }
        L_0x010d:
            r4.put(r8, r14)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r4 = r1.mo115114o(r5, r4)     // Catch:{ JSONException -> 0x0161 }
            r2.mo109647a(r3, r4)     // Catch:{ JSONException -> 0x0161 }
            java.lang.String r4 = "onGetWifiList %s"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x0161 }
            r5 = 0
            r6[r5] = r0     // Catch:{ JSONException -> 0x0161 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r4, r6)     // Catch:{ JSONException -> 0x0161 }
            zn0.c$c r4 = new zn0.c$c     // Catch:{ JSONException -> 0x0161 }
            r4.<init>()     // Catch:{ JSONException -> 0x0161 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ JSONException -> 0x0161 }
            r5.<init>()     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0161 }
            r6.<init>()     // Catch:{ JSONException -> 0x0161 }
            java.util.List<ao0.e> r0 = r0.f233459b     // Catch:{ JSONException -> 0x0161 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ JSONException -> 0x0161 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x0161 }
        L_0x0139:
            boolean r13 = r0.hasNext()     // Catch:{ JSONException -> 0x0161 }
            if (r13 == 0) goto L_0x014d
            java.lang.Object r13 = r0.next()     // Catch:{ JSONException -> 0x0161 }
            ao0.e r13 = (ao0.C79612e) r13     // Catch:{ JSONException -> 0x0161 }
            org.json.JSONObject r13 = r13.mo109754b()     // Catch:{ JSONException -> 0x0161 }
            r6.put(r13)     // Catch:{ JSONException -> 0x0161 }
            goto L_0x0139
        L_0x014d:
            java.lang.String r0 = "wifiList"
            r5.put(r0, r6)     // Catch:{ JSONException -> 0x0161 }
            r4.mo115161k(r2)     // Catch:{ JSONException -> 0x0161 }
            r6 = 0
            r4.f242409h = r6     // Catch:{ JSONException -> 0x0161 }
            r4.mo115165o(r5)     // Catch:{ JSONException -> 0x0161 }
            r4.mo115158h()     // Catch:{ JSONException -> 0x0161 }
            goto L_0x01da
        L_0x0161:
            r0 = move-exception
            goto L_0x0166
        L_0x0163:
            r0 = move-exception
            r17 = r6
        L_0x0166:
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r6, r5)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r11, r7)
            java.lang.String r5 = "fail:parse json err"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r6 == 0) goto L_0x0187
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r17
            r13 = 1
            r6[r13] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r6)
        L_0x0187:
            r6 = r17
            r0.put(r8, r6)
            java.lang.String r0 = r1.mo115114o(r5, r0)
            r2.mo109647a(r3, r0)
            goto L_0x01da
        L_0x0194:
            r4 = 0
            r13 = 1
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.String r13 = r0.f233458a
            r5[r4] = r13
            java.lang.String r4 = "error, mErrorMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r4, r5)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r4.put(r11, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "fail:"
            r5.append(r7)
            java.lang.String r0 = r0.f233458a
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            if (r0 != 0) goto L_0x01c0
            java.lang.String r0 = "fail:internal error"
        L_0x01c0:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 == 0) goto L_0x01d0
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r7 = 0
            r5[r7] = r6
            r7 = 1
            r5[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r5)
        L_0x01d0:
            r4.put(r8, r6)
            java.lang.String r0 = r1.mo115114o(r0, r4)
            r2.mo109647a(r3, r0)
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.C91803c.m115318w(zn0.c, com.tencent.mm.plugin.appbrand.jsapi.f, int, android.content.Context, ao0.f):void");
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiGetWifiList", "mContext is null, invoke fail!");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 12010);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:context is null");
            }
            hashMap.put("errno", 4);
            fVar.mo109647a(i, mo115114o("fail:context is null", hashMap));
        } else if (!C91807d.f262895g) {
            Log.m105920e("MicroMsg.JsApiGetWifiList", "not invoke startWifi");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 12000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505001, "fail:not invoke startWifi");
            }
            hashMap2.put("errno", 1505001);
            fVar.mo109647a(i, mo115114o("fail:not invoke startWifi", hashMap2));
        } else {
            C79614g.m96681b(context);
            if (!C79743f.m96882b()) {
                Log.m105920e("MicroMsg.JsApiGetWifiList", "wifi is disable,invoke fail!");
                HashMap hashMap3 = new HashMap();
                hashMap3.put("errCode", 12005);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1505002, "fail:wifi is disable");
                }
                hashMap3.put("errno", 1505002);
                fVar.mo109647a(i, mo115114o("fail:wifi is disable", hashMap3));
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C91804a(atomicBoolean, fVar, i, context), false);
            C91805b bVar = new C91805b(mTimerHandler, atomicBoolean, fVar, i, context);
            Log.m105924i("MicroMsg.WiFiManagerWrapper", "getWifiListAsync");
            C79614g.f233462c = null;
            if (!C79614g.f233460a || !C79743f.m96882b()) {
                C79613f fVar2 = new C79613f();
                if (C79614g.f233460a) {
                    fVar2.f233458a = "wifi is disable";
                } else {
                    fVar2.f233458a = "sdk not init";
                }
                bVar.mo125654a(fVar2);
            } else {
                Log.m105924i("MicroMsg.WiFiManagerWrapper", "getWifiListAsync, startScan");
                C79743f.m96884d();
                C79614g.f233466g = bVar;
            }
            long j = 10000;
            if (jSONObject != null) {
                j = jSONObject.optLong("timeout", 10000);
            }
            Log.m105924i("MicroMsg.JsApiGetWifiList", "invoke, getWifiListAsyncTimeoutMills: " + j);
            mTimerHandler.startTimer(j);
        }
    }
}
