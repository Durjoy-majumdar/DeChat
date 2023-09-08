package com.tencent.p014mm.plugin.appbrand.report.model;

import c30.C104288c;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82872p6;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82082h;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82090l;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C82878f0;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83003a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83009b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83021n;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83026s;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83030y;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fm0.C86927b;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.regex.Pattern;
import ll0.C109395k;
import nm0.C89031i;
import ol0.C117797d;
import ol0.C117799e;
import ol0.C117807h;
import ol0.C117810i;
import ol0.C117827o;
import ol0.C117830p0;
import ol0.C117867z;
import p329d3.C86167d;
import sl0.C90220f;
import sl0.C90225m;
import sn0.C90259e;
import ul0.C90695c;
import xk0.C91268g;
import xk0.C91279p;
import zt3.C119143b;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.m */
public final class C84158m {

    /* renamed from: a */
    public static final Set<String> f245696a = new HashSet(Arrays.asList(new String[]{C117797d.NAME, C117799e.NAME, C117807h.NAME, C117810i.NAME, C82082h.NAME, C90695c.NAME, C90220f.NAME, C82086j.NAME, C86927b.NAME, C91268g.NAME, C82088k.NAME, "getCurrentRoute", C117827o.NAME, C83021n.NAME, C83026s.NAME, "getSystemInfo", "hideToast", C117867z.NAME, "onAccelerometerChange", "onCompassChange", C109395k.C109398d.NAME, "onMapRegionChange", "onSocketClose", "onSocketError", "onSocketMessage", "onSocketOpen", C90259e.C90264e.NAME, C90259e.C90263d.NAME, C90259e.C90262c.NAME, "onVideoTimeUpdate", C82090l.NAME, C90225m.NAME, C83030y.NAME, "reportIDKey", "reportKeyValue", C89031i.NAME, C83003a0.NAME, C83009b0.NAME, "showModal", "showToast", "syncAudioEvent", C91279p.NAME, C117830p0.NAME, C82872p6.NAME}));

    /* renamed from: b */
    public static final ExecutorService f245697b = new C84159a("AppBrandJsApiInvokeReportWorker", 1, 1, new LinkedBlockingDeque());

    /* renamed from: c */
    public static final C84163d f245698c = new C84163d((C84159a) null);

    /* renamed from: d */
    public static final Pattern f245699d = Pattern.compile(".*\"errMsg\":\"[^:]+:([^\"]+)\".*");

    /* renamed from: e */
    public static boolean f245700e = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.m$a */
    public class C84159a extends C119143b {
        public C84159a(String str, int i, int i2, BlockingQueue blockingQueue) {
            super(str, i, i2, blockingQueue);
        }

        /* renamed from: b */
        public void mo72173b(Runnable runnable, Throwable th) {
            if (runnable instanceof C84162c) {
                ((ConcurrentLinkedQueue) C84158m.f245698c.f245710a).offer((C84162c) runnable);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.m$b */
    public static final class C84160b {

        /* renamed from: a */
        public static final Set<String> f245701a = new HashSet();

        /* renamed from: b */
        public static final Set<String> f245702b = new C84161a();

        /* renamed from: com.tencent.mm.plugin.appbrand.report.model.m$b$a */
        public class C84161a extends HashSet<String> {
            public C84161a() {
                add(C82878f0.NAME);
            }
        }

        static {
            InputStream inputStream;
            boolean z = false;
            try {
                inputStream = MMApplicationContext.getContext().getAssets().open("15007_api_list.txt");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", e, "open read 15007_api_list.txt", new Object[0]);
                inputStream = null;
            }
            if (inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (!Util.isNullOrNil(readLine)) {
                            f245701a.add(readLine);
                        }
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", e2, "readLine()", new Object[0]);
                    } catch (Throwable th) {
                        Util.qualityClose(bufferedReader);
                        Util.qualityClose(inputStreamReader);
                        throw th;
                    }
                }
                Util.qualityClose(bufferedReader);
                Util.qualityClose(inputStreamReader);
            }
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || new Random().nextInt(1000000) % 1000000 < 100) {
                z = true;
            }
            C84158m.f245700e = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.m$c */
    public static final class C84162c implements Runnable {

        /* renamed from: d */
        public String f245703d;

        /* renamed from: e */
        public String f245704e;

        /* renamed from: f */
        public String f245705f;

        /* renamed from: g */
        public String f245706g;

        /* renamed from: h */
        public int f245707h;

        /* renamed from: i */
        public long f245708i;

        /* renamed from: j */
        public String f245709j;

        /* renamed from: a */
        public final String mo116834a(C104288c cVar) {
            C104289g gVar = new C104289g();
            try {
                String str = this.f245705f;
                char c = 65535;
                if (str.hashCode() == -1701611132) {
                    if (str.equals(JsApiChooseImage.NAME)) {
                        c = 0;
                    }
                }
                if (c == 0) {
                    gVar.put("sizeType", cVar.optString("sizeType"));
                }
            } catch (C79923f e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", e, "get keyParam error!", new Object[0]);
            }
            try {
                return URLEncoder.encode(gVar.toString(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x027e A[Catch:{ f -> 0x02de }] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x027f A[Catch:{ f -> 0x02de }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x028b A[Catch:{ f -> 0x02de }] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x028c A[Catch:{ f -> 0x02de }] */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x02f7  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0305  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x034d  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x037a  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x037c  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0391  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x039f  */
        /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r44 = this;
                r1 = r44
                java.lang.String r0 = "src"
                java.lang.String r2 = "url"
                java.util.HashSet<java.lang.String> r3 = xb3.C91163e.f261395a
                java.lang.String r3 = r1.f245705f
                java.lang.String r4 = r1.f245709j
                java.lang.String r5 = "apiName"
                gy3.C87412m.m108594g(r3, r5)
                java.util.HashSet<java.lang.String> r5 = xb3.C91163e.f261395a
                boolean r3 = r5.contains(r3)
                r6 = 2
                r7 = 1
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                java.lang.String r10 = ""
                if (r3 != 0) goto L_0x0026
                goto L_0x00b9
            L_0x0026:
                if (r4 == 0) goto L_0x00b9
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>(r4)
                java.lang.String r4 = "errMsg"
                java.lang.String r11 = r3.optString(r4, r10)
                java.lang.String r3 = "errorMsg"
                gy3.C87412m.m108593f(r11, r3)
                char[] r12 = new char[r7]
                r3 = 58
                r12[r8] = r3
                r13 = 0
                r14 = 2
                r15 = 2
                r16 = 0
                java.util.List r3 = z04.C112550d0.m153784T(r11, r12, r13, r14, r15, r16)
                int r4 = r3.size()
                if (r4 == r6) goto L_0x004e
                goto L_0x00b9
            L_0x004e:
                java.lang.Object r4 = r3.get(r8)
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r3 = r3.get(r7)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "onCallback: "
                r11.append(r12)
                r11.append(r4)
                java.lang.String r12 = ", "
                r11.append(r12)
                r11.append(r3)
                java.lang.String r11 = r11.toString()
                java.lang.String r13 = "WcPayReport"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r11)
                boolean r5 = r5.contains(r4)
                if (r5 == 0) goto L_0x00b9
                java.util.HashSet<java.lang.String> r5 = xb3.C91163e.f261396b
                boolean r5 = r5.contains(r3)
                if (r5 == 0) goto L_0x00b9
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r11 = "report jsapi callback error: "
                r5.append(r11)
                r5.append(r4)
                r5.append(r12)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r5)
                xb3.h r5 = xb3.C15635h.f42265a
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "AppBrand-"
                r11.append(r12)
                r11.append(r4)
                java.lang.String r4 = r11.toString()
                java.lang.String r11 = "1"
                r5.mo14381b(r4, r11, r3)
            L_0x00b9:
                java.lang.String r3 = r1.f245703d
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = com.tencent.p014mm.plugin.appbrand.C81682d.m100224d(r3)
                java.lang.String r4 = "MicroMsg.AppBrand.JsApiInvokeReportProtocol"
                if (r3 != 0) goto L_0x00cb
                java.lang.String r0 = "statObject is Null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x0546
            L_0x00cb:
                java.util.Set<java.lang.String> r5 = com.tencent.p014mm.plugin.appbrand.report.model.C84158m.f245696a
                java.lang.String r11 = r1.f245705f
                java.util.HashSet r5 = (java.util.HashSet) r5
                boolean r5 = r5.contains(r11)
                if (r5 == 0) goto L_0x00d9
                goto L_0x0546
            L_0x00d9:
                java.lang.String r5 = r1.f245706g
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                java.lang.String r11 = "shareAppMessage"
                java.lang.String r12 = "get keyParam error!"
                java.lang.String r13 = "UTF-8"
                if (r5 != 0) goto L_0x025b
                java.lang.String r5 = r1.f245705f
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x025b
                java.lang.String r5 = r1.f245706g     // Catch:{ f -> 0x0252 }
                c30.d r14 = new c30.d     // Catch:{ f -> 0x0252 }
                r14.<init>((java.lang.String) r5)     // Catch:{ f -> 0x0252 }
                java.lang.String r5 = r1.mo116834a(r14)     // Catch:{ f -> 0x0252 }
                org.json.JSONObject r15 = r14.f234147a     // Catch:{ f -> 0x024f }
                boolean r15 = r15.has(r2)     // Catch:{ f -> 0x024f }
                if (r15 == 0) goto L_0x0153
                java.lang.String r15 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r6 = "openLink"
                boolean r6 = r15.equals(r6)     // Catch:{ f -> 0x024f }
                if (r6 != 0) goto L_0x014d
                java.lang.String r6 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r15 = "redirectTo"
                boolean r6 = r6.equals(r15)     // Catch:{ f -> 0x024f }
                if (r6 != 0) goto L_0x014d
                java.lang.String r6 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r15 = "navigateTo"
                boolean r6 = r6.equals(r15)     // Catch:{ f -> 0x024f }
                if (r6 != 0) goto L_0x014d
                java.lang.String r6 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r15 = "request"
                boolean r6 = r6.equals(r15)     // Catch:{ f -> 0x024f }
                if (r6 != 0) goto L_0x014d
                java.lang.String r6 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r15 = "connectSocket"
                boolean r6 = r6.equals(r15)     // Catch:{ f -> 0x024f }
                if (r6 != 0) goto L_0x014d
                java.lang.String r6 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r15 = "uploadFile"
                boolean r6 = r6.equals(r15)     // Catch:{ f -> 0x024f }
                if (r6 != 0) goto L_0x014d
                java.lang.String r6 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r15 = "downloadFile"
                boolean r6 = r6.equals(r15)     // Catch:{ f -> 0x024f }
                if (r6 == 0) goto L_0x0153
            L_0x014d:
                java.lang.String r0 = r14.optString(r2)     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x0153:
                java.lang.String r2 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r6 = "authorize"
                boolean r2 = r2.equals(r6)     // Catch:{ f -> 0x024f }
                if (r2 == 0) goto L_0x0199
                java.lang.String r0 = "scope"
                java.lang.String r0 = r14.optString(r0)     // Catch:{ Exception -> 0x0189 }
                c30.b r2 = new c30.b     // Catch:{ Exception -> 0x0189 }
                r2.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0189 }
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ f -> 0x024f }
                r0.<init>()     // Catch:{ f -> 0x024f }
                r6 = 0
            L_0x016f:
                org.json.JSONArray r14 = r2.f308642a     // Catch:{ f -> 0x024f }
                int r14 = r14.length()     // Catch:{ f -> 0x024f }
                if (r6 >= r14) goto L_0x0183
                org.json.JSONArray r14 = r2.f308642a     // Catch:{ f -> 0x024f }
                java.lang.String r14 = r14.optString(r6)     // Catch:{ f -> 0x024f }
                r0.add(r14)     // Catch:{ f -> 0x024f }
                int r6 = r6 + 1
                goto L_0x016f
            L_0x0183:
                java.lang.String r0 = r0.toString()     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x0189:
                r0 = move-exception
                java.lang.String r2 = "Exception %s"
                java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ f -> 0x024f }
                java.lang.String r0 = r0.getMessage()     // Catch:{ f -> 0x024f }
                r6[r8] = r0     // Catch:{ f -> 0x024f }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r6)     // Catch:{ f -> 0x024f }
                goto L_0x0546
            L_0x0199:
                java.lang.String r2 = r1.f245705f     // Catch:{ f -> 0x024f }
                boolean r2 = r2.equals(r11)     // Catch:{ f -> 0x024f }
                if (r2 == 0) goto L_0x01b7
                java.lang.String r0 = r14.toString()     // Catch:{ UnsupportedEncodingException -> 0x01af }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException -> 0x01af }
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r13)     // Catch:{ UnsupportedEncodingException -> 0x01af }
                goto L_0x024d
            L_0x01af:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ f -> 0x024f }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r10, r2)     // Catch:{ f -> 0x024f }
                goto L_0x024c
            L_0x01b7:
                java.lang.String r2 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r6 = "requestPayment"
                boolean r2 = r2.equals(r6)     // Catch:{ f -> 0x024f }
                if (r2 == 0) goto L_0x01cb
                java.lang.String r0 = "package"
                java.lang.String r0 = r14.optString(r0)     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x01cb:
                java.lang.String r2 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r6 = "reportSubmitForm"
                boolean r2 = r2.equals(r6)     // Catch:{ f -> 0x024f }
                if (r2 == 0) goto L_0x01e0
                java.lang.String r0 = r1.f245703d     // Catch:{ f -> 0x024f }
                com.tencent.mm.plugin.appbrand.q1 r0 = com.tencent.p014mm.plugin.appbrand.C84072q1.m103587b(r0)     // Catch:{ f -> 0x024f }
                java.lang.String r0 = r0.f245457a     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x01e0:
                java.lang.String r2 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r6 = "makePhoneCall"
                boolean r2 = r2.equals(r6)     // Catch:{ f -> 0x024f }
                if (r2 == 0) goto L_0x01f2
                java.lang.String r0 = "phoneNumber"
                java.lang.String r0 = r14.optString(r0)     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x01f2:
                java.lang.String r2 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r6 = "chooseVideo"
                boolean r2 = r2.equals(r6)     // Catch:{ f -> 0x024f }
                if (r2 == 0) goto L_0x0203
                java.lang.String r0 = "maxDuration"
                java.lang.String r0 = r14.optString(r0)     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x0203:
                java.lang.String r2 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r6 = "updateHTMLWebView"
                boolean r2 = r2.equals(r6)     // Catch:{ f -> 0x024f }
                if (r2 == 0) goto L_0x0227
                java.lang.String r2 = r14.optString(r0)     // Catch:{ f -> 0x024f }
                java.lang.String r0 = r14.optString(r0)     // Catch:{ Exception -> 0x021b }
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r13)     // Catch:{ Exception -> 0x021b }
                goto L_0x024d
            L_0x021b:
                r0 = move-exception
                java.lang.String r0 = r0.toString()     // Catch:{ f -> 0x0225 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ f -> 0x0225 }
                r0 = r2
                goto L_0x024d
            L_0x0225:
                r0 = move-exception
                goto L_0x0255
            L_0x0227:
                java.lang.String r0 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r2 = "showKeyboard"
                boolean r0 = r0.equals(r2)     // Catch:{ f -> 0x024f }
                if (r0 == 0) goto L_0x0239
                java.lang.String r0 = "confirmType"
                java.lang.String r0 = r14.optString(r0)     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x0239:
                java.lang.String r0 = r1.f245705f     // Catch:{ f -> 0x024f }
                java.lang.String r2 = "setAudioState"
                boolean r0 = r0.equals(r2)     // Catch:{ f -> 0x024f }
                if (r0 == 0) goto L_0x024c
                java.lang.String r0 = "volume"
                java.lang.String r0 = r14.optString(r0)     // Catch:{ f -> 0x024f }
                goto L_0x024d
            L_0x024c:
                r0 = r10
            L_0x024d:
                r2 = r0
                goto L_0x025d
            L_0x024f:
                r0 = move-exception
                r2 = r10
                goto L_0x0255
            L_0x0252:
                r0 = move-exception
                r2 = r10
                r5 = r2
            L_0x0255:
                java.lang.Object[] r6 = new java.lang.Object[r8]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r12, r6)
                goto L_0x025d
            L_0x025b:
                r2 = r10
                r5 = r2
            L_0x025d:
                java.lang.String r0 = r1.f245709j
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r14 = 7
                r17 = 5
                if (r0 != 0) goto L_0x02e4
                java.lang.String r0 = r1.f245705f
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0271
                goto L_0x02e4
            L_0x0271:
                java.lang.String r0 = r1.f245705f     // Catch:{ f -> 0x02de }
                r18 = -1
                int r15 = r0.hashCode()     // Catch:{ f -> 0x02de }
                r6 = -316023509(0xffffffffed29dd2b, float:-3.2856464E27)
                if (r15 == r6) goto L_0x027f
                goto L_0x0289
            L_0x027f:
                java.lang.String r6 = "getLocation"
                boolean r0 = r0.equals(r6)     // Catch:{ f -> 0x02de }
                if (r0 == 0) goto L_0x0289
                r18 = 0
            L_0x0289:
                if (r18 == 0) goto L_0x028c
                goto L_0x02e4
            L_0x028c:
                java.lang.String r0 = r1.f245709j     // Catch:{ f -> 0x02de }
                c30.d r6 = new c30.d     // Catch:{ f -> 0x02de }
                r6.<init>((java.lang.String) r0)     // Catch:{ f -> 0x02de }
                java.lang.String r0 = "%s;%s;%s;%s;%s;%s;%s"
                java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ f -> 0x02de }
                java.lang.String r14 = "latitude"
                java.lang.String r14 = r6.optString(r14)     // Catch:{ f -> 0x02de }
                r15[r8] = r14     // Catch:{ f -> 0x02de }
                java.lang.String r14 = "longitude"
                java.lang.String r14 = r6.optString(r14)     // Catch:{ f -> 0x02de }
                r15[r7] = r14     // Catch:{ f -> 0x02de }
                java.lang.String r14 = "speed"
                java.lang.String r14 = r6.optString(r14)     // Catch:{ f -> 0x02de }
                r16 = 2
                r15[r16] = r14     // Catch:{ f -> 0x02de }
                java.lang.String r14 = "accuracy"
                java.lang.String r14 = r6.optString(r14)     // Catch:{ f -> 0x02de }
                r20 = 3
                r15[r20] = r14     // Catch:{ f -> 0x02de }
                java.lang.String r14 = "altitude"
                java.lang.String r14 = r6.optString(r14)     // Catch:{ f -> 0x02de }
                r19 = 4
                r15[r19] = r14     // Catch:{ f -> 0x02de }
                java.lang.String r14 = "verticalAccuracy"
                java.lang.String r14 = r6.optString(r14)     // Catch:{ f -> 0x02de }
                r15[r17] = r14     // Catch:{ f -> 0x02de }
                java.lang.String r14 = "horizontalAccuracy"
                java.lang.String r6 = r6.optString(r14)     // Catch:{ f -> 0x02de }
                r14 = 6
                r15[r14] = r6     // Catch:{ f -> 0x02de }
                java.lang.String r0 = java.lang.String.format(r0, r15)     // Catch:{ f -> 0x02de }
                r6 = r0
                goto L_0x02e5
            L_0x02de:
                r0 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r8]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r12, r6)
            L_0x02e4:
                r6 = r10
            L_0x02e5:
                java.lang.String r0 = r1.f245704e
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0305
                java.lang.String r0 = r1.f245704e
                java.lang.String r12 = ".html"
                boolean r0 = r0.contains(r12)
                if (r0 == 0) goto L_0x0305
                java.lang.String r0 = r1.f245704e
                int r12 = r0.lastIndexOf(r12)
                int r12 = r12 + 5
                java.lang.String r0 = r0.substring(r8, r12)
                r12 = r0
                goto L_0x0306
            L_0x0305:
                r12 = r10
            L_0x0306:
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ UnsupportedEncodingException -> 0x0310 }
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r13)     // Catch:{ UnsupportedEncodingException -> 0x0310 }
                r14 = r0
                goto L_0x0319
            L_0x0310:
                r0 = move-exception
                java.lang.Object[] r14 = new java.lang.Object[r8]
                java.lang.String r15 = "encode page path error!"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r15, r14)
                r14 = r10
            L_0x0319:
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ UnsupportedEncodingException -> 0x0323 }
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r13)     // Catch:{ UnsupportedEncodingException -> 0x0323 }
                r7 = r0
                goto L_0x032c
            L_0x0323:
                r0 = move-exception
                java.lang.Object[] r15 = new java.lang.Object[r8]
                java.lang.String r7 = "encode keyParam path error!"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r7, r15)
                r7 = r10
            L_0x032c:
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ UnsupportedEncodingException -> 0x0335 }
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r13)     // Catch:{ UnsupportedEncodingException -> 0x0335 }
                goto L_0x033e
            L_0x0335:
                r0 = move-exception
                java.lang.Object[] r13 = new java.lang.Object[r8]
                java.lang.String r15 = "encode keyResult path error!"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r15, r13)
                r0 = r10
            L_0x033e:
                java.lang.String r13 = r1.f245705f
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
                java.lang.String r15 = r1.f245709j
                boolean r22 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r22 == 0) goto L_0x034d
                goto L_0x0362
            L_0x034d:
                java.util.regex.Pattern r8 = com.tencent.p014mm.plugin.appbrand.report.model.C84158m.f245699d
                java.util.regex.Matcher r8 = r8.matcher(r15)
                boolean r15 = r8.matches()
                if (r15 == 0) goto L_0x0362
                r15 = 1
                java.lang.String r8 = r8.group(r15)
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            L_0x0362:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r8 == 0) goto L_0x0369
                goto L_0x037c
            L_0x0369:
                java.lang.String r8 = "ok"
                boolean r8 = r10.startsWith(r8)
                if (r8 == 0) goto L_0x0372
                goto L_0x037c
            L_0x0372:
                java.lang.String r8 = "fail"
                boolean r8 = r10.startsWith(r8)
                if (r8 == 0) goto L_0x037c
                r8 = 2
                goto L_0x037d
            L_0x037c:
                r8 = 1
            L_0x037d:
                java.lang.String r15 = r3.f245534g
                java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
                android.content.Context r23 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r23 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r23)
                r24 = r11
                int r11 = r3.f245533f
                if (r11 != 0) goto L_0x0395
                r11 = 1000(0x3e8, float:1.401E-42)
                r3.f245533f = r11
            L_0x0395:
                java.lang.String r11 = r1.f245703d
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r11 = com.tencent.p014mm.plugin.appbrand.C81682d.m100225e(r11)
                if (r11 != 0) goto L_0x039f
                goto L_0x0546
            L_0x039f:
                r25 = r0
                java.lang.String r0 = r1.f245703d
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r0)
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
                r26 = r7
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r7 = r11.f261072r
                int r7 = r7.pkgVersion
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r11 = r11.f261072r
                int r11 = r11.f238585d
                r21 = 1
                int r11 = r11 + 1
                r27 = r14
                java.lang.String r14 = r1.f245703d
                int r14 = com.tencent.p014mm.plugin.appbrand.report.C84240s.m103839e(r14)
                r28 = r4
                int r4 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
                r29 = 14
                r30 = 13
                r31 = 12
                r32 = 11
                r33 = 10
                r34 = 9
                r35 = 8
                r36 = 20
                r37 = 19
                r38 = 18
                r39 = 17
                r40 = 16
                r41 = 15
                r42 = r0
                r0 = 21
                r43 = r5
                r5 = 1
                if (r4 > r5) goto L_0x0456
                java.lang.Object[] r4 = new java.lang.Object[r0]
                int r0 = r3.f245533f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r21 = 0
                r4[r21] = r0
                r4[r5] = r15
                java.lang.String r0 = r1.f245703d
                r5 = 2
                r4[r5] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                r5 = 3
                r4[r5] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
                r5 = 4
                r4[r5] = r0
                r4[r17] = r12
                r5 = 6
                r4[r5] = r23
                r5 = 7
                r4[r5] = r13
                r4[r35] = r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                r4[r34] = r0
                int r0 = r1.f245707h
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4[r33] = r0
                r4[r32] = r9
                r0 = r13
                long r12 = r1.f245708i
                java.lang.Long r2 = java.lang.Long.valueOf(r12)
                r4[r31] = r2
                r4[r30] = r9
                r4[r29] = r10
                int r2 = r3.f245535h
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r41] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
                r4[r40] = r2
                r4[r39] = r6
                r4[r38] = r43
                r2 = r42
                java.lang.String r5 = r2.f234838r
                r4[r37] = r5
                java.lang.String r5 = r2.f234837q
                r4[r36] = r5
                java.lang.String r5 = "jsapi invoke fields, scene : %s, sceneNote %s, appId %s, appVersion %d, appState %d, pagePath %s, networkType %s, functionName %s, keyParam %s, result %d, permissionValue %d, errorCode %d, costTime %s, errCode %d, errMsg %s, usedState %d, appType %d, keyResult %s, keyRequest %s, instanceId:%s, sessionId:%s"
                r6 = r28
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r4)
                goto L_0x0459
            L_0x0456:
                r0 = r13
                r2 = r42
            L_0x0459:
                r4 = 23
                java.lang.Object[] r5 = new java.lang.Object[r4]
                int r6 = r3.f245533f
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r12 = 0
                r5[r12] = r6
                r6 = 1
                r5[r6] = r15
                java.lang.String r6 = r1.f245703d
                r12 = 2
                r5[r12] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r7 = 3
                r5[r7] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
                r7 = 4
                r5[r7] = r6
                r5[r17] = r27
                r6 = 6
                r5[r6] = r23
                r6 = 7
                r5[r6] = r0
                r5[r35] = r26
                java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
                r5[r34] = r6
                int r6 = r1.f245707h
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5[r33] = r6
                r5[r32] = r9
                long r6 = r1.f245708i
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r5[r31] = r6
                r5[r30] = r9
                r5[r29] = r10
                int r6 = r3.f245535h
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5[r41] = r6
                int r6 = r3.f245531d
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5[r40] = r6
                java.lang.String r3 = r3.f245532e
                r5[r39] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
                r5[r38] = r3
                r5[r37] = r25
                r5[r36] = r43
                java.lang.String r3 = r2.f234838r
                r6 = 21
                r5[r6] = r3
                r3 = 22
                java.lang.String r2 = r2.f234837q
                r5[r3] = r2
                r2 = r24
                boolean r2 = r0.startsWith(r2)
                java.util.Set<java.lang.String> r3 = com.tencent.p014mm.plugin.appbrand.report.model.C84158m.C84160b.f245702b
                java.lang.String r6 = r1.f245705f
                java.util.HashSet r3 = (java.util.HashSet) r3
                boolean r3 = r3.contains(r6)
                if (r2 == 0) goto L_0x04ee
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.String r10 = r7.mo175909s(r5)
                r8 = 13542(0x34e6, float:1.8976E-41)
                r11 = 0
                r12 = 0
                r13 = 1
                r9 = r3
                r7.mo175915y(r8, r9, r10, r11, r12, r13)
                goto L_0x04ff
            L_0x04ee:
                com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.String r13 = r6.mo175909s(r5)
                com.tencent.mm.plugin.appbrand.report.a r7 = com.tencent.p014mm.plugin.appbrand.report.C55548a.f158170a
                r8 = 13542(0x34e6, float:1.8976E-41)
                r10 = 0
                r11 = 0
                r12 = 1
                r9 = r3
                r7.mo77079c(r8, r9, r10, r11, r12, r13)
            L_0x04ff:
                java.util.Set<java.lang.String> r6 = com.tencent.p014mm.plugin.appbrand.report.model.C84158m.C84160b.f245701a
                java.util.HashSet r6 = (java.util.HashSet) r6
                boolean r0 = r6.contains(r0)
                if (r0 == 0) goto L_0x0534
                if (r2 == 0) goto L_0x051a
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 15761(0x3d91, float:2.2086E-41)
                java.lang.String r10 = r7.mo175909s(r5)
                r11 = 0
                r12 = 0
                r9 = r3
                r7.mo160132i(r8, r9, r10, r11, r12)
                goto L_0x0534
            L_0x051a:
                com.tencent.mm.plugin.appbrand.report.a r7 = com.tencent.p014mm.plugin.appbrand.report.C55548a.f158170a
                r8 = 15761(0x3d91, float:2.2086E-41)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r4)
                java.lang.String r13 = r0.mo175909s(r2)
                java.lang.String r0 = "getStringFromMutilObj(*vals)"
                gy3.C87412m.m108593f(r13, r0)
                r10 = 0
                r11 = 0
                r12 = 0
                r9 = r3
                r7.mo77079c(r8, r9, r10, r11, r12, r13)
            L_0x0534:
                boolean r0 = com.tencent.p014mm.plugin.appbrand.report.model.C84158m.f245700e
                if (r0 == 0) goto L_0x0546
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 27220(0x6a54, float:3.8143E-41)
                java.lang.String r10 = r7.mo175909s(r5)
                r11 = 0
                r12 = 0
                r9 = r3
                r7.mo160132i(r8, r9, r10, r11, r12)
            L_0x0546:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84158m.C84162c.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.m$d */
    public static final class C84163d implements C86167d<C84162c> {

        /* renamed from: a */
        public final Queue<C84162c> f245710a = new ConcurrentLinkedQueue();

        public C84163d(C84159a aVar) {
        }
    }
}
