package com.tencent.p014mm.plugin.base.stub;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83581k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import k20.C9556a;
import ke3.C88144b;
import kr0.C88273g1;
import kr0.C88274h0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p210o.C11323a;
import p763ym.C79138l;
import p823sg.C101611g;
import p823sg.C101614i;
import p823sg.C90193h;
import te3.C52064y4;
import te3.vj4;
import te3.wj4;
import wc3.C90945m;
import yo0.C91535b;

/* renamed from: com.tencent.mm.plugin.base.stub.h */
public class C85083h {

    /* renamed from: a */
    public static Map<String, C85082d> f247920a = new HashMap();

    /* renamed from: b */
    public static Intent f247921b;

    /* renamed from: c */
    public static final Set<Long> f247922c = new HashSet();

    /* renamed from: d */
    public static int f247923d = -1;

    /* renamed from: e */
    public static C114668z.C104589a f247924e = null;

    /* renamed from: f */
    public static Boolean f247925f = null;

    /* renamed from: g */
    public static boolean f247926g = false;

    /* renamed from: h */
    public static long f247927h = 0;

    /* renamed from: i */
    public static boolean f247928i = true;

    /* renamed from: j */
    public static final String[] f247929j = {"sdk_openAppProfile", "sdk_openFeedback", "sdk_openGrowthCare", C83581k.NAME};

    /* renamed from: k */
    public static final C101611g<String, Long> f247930k = new C101614i(50);

    /* renamed from: com.tencent.mm.plugin.base.stub.h$a */
    public class C85084a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ int f247931d;

        /* renamed from: e */
        public final /* synthetic */ String f247932e;

        /* renamed from: f */
        public final /* synthetic */ int f247933f;

        /* renamed from: g */
        public final /* synthetic */ String f247934g;

        /* renamed from: h */
        public final /* synthetic */ String f247935h;

        /* renamed from: i */
        public final /* synthetic */ int f247936i;

        /* renamed from: j */
        public final /* synthetic */ boolean f247937j;

        /* renamed from: n */
        public final /* synthetic */ MatrixCursor f247938n;

        /* renamed from: o */
        public final /* synthetic */ CountDownLatch f247939o;

        /* renamed from: com.tencent.mm.plugin.base.stub.h$a$a */
        public class C85085a implements C11323a<WxaAttributes, Void> {
            public C85085a(C85084a aVar) {
            }

            public Object apply(Object obj) {
                WxaAttributes wxaAttributes = (WxaAttributes) obj;
                C88273g1 g1Var = C88273g1.OPEN_SDK_API_PRELOAD;
                Class cls = C88274h0.class;
                if (wxaAttributes == null) {
                    return null;
                }
                try {
                    if (wxaAttributes.mo113940m2().mo113970a()) {
                        ((C88274h0) C86312j.m106911c(cls)).mo113303QK(g1Var);
                        return null;
                    } else if (wxaAttributes.mo113940m2().mo113971b()) {
                        ((C88274h0) C86312j.m106911c(cls)).mo113305TH(g1Var);
                        return null;
                    } else {
                        ((C88274h0) C86312j.m106911c(cls)).mo113299AC(g1Var);
                        return null;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WXBizLogic", e, "prefetchWxaAttrs-preloadEnv", new Object[0]);
                    return null;
                }
            }
        }

        public C85084a(int i, String str, int i2, String str2, String str3, int i3, boolean z, MatrixCursor matrixCursor, CountDownLatch countDownLatch) {
            this.f247931d = i;
            this.f247932e = str;
            this.f247933f = i2;
            this.f247934g = str2;
            this.f247935h = str3;
            this.f247936i = i3;
            this.f247937j = z;
            this.f247938n = matrixCursor;
            this.f247939o = countDownLatch;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Class cls = C91535b.class;
            Log.m105925i("MicroMsg.WXBizLogic", "doMiniProgramTranslateLink, %d, %d, %s, cgiType=%d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(this.f247931d));
            if (i == 0 && i2 == 0) {
                C85083h.m104913b(true, this.f247931d);
                String str2 = ((wj4) cVar.f127056b.f127083a).f144097f;
                Uri parse = Uri.parse(str2);
                parse.getQueryParameter("appid");
                String queryParameter = parse.getQueryParameter("userName");
                String queryParameter2 = parse.getQueryParameter("path");
                long safeParseLong = Util.safeParseLong(parse.getQueryParameter("validTime"));
                String str3 = this.f247932e;
                int i3 = this.f247933f;
                String str4 = this.f247934g;
                String str5 = this.f247935h;
                int i4 = this.f247936i;
                if (!Util.isNullOrNil(str3)) {
                    String j = C85083h.m104921j(str3, i3, str4, str5, i4);
                    C85082d dVar = new C85082d();
                    dVar.f247918b = System.currentTimeMillis();
                    dVar.f247917a = str2;
                    if (safeParseLong > 0) {
                        dVar.f247919c = safeParseLong * 1000;
                    }
                    ((HashMap) C85083h.f247920a).put(j, dVar);
                }
                if (this.f247931d != 1) {
                    return 0;
                }
                ((C91535b) C86312j.m106911c(cls)).mo125308za(queryParameter, queryParameter2);
                if (this.f247937j) {
                    MatrixCursor matrixCursor = this.f247938n;
                    CountDownLatch countDownLatch = this.f247939o;
                    ((C91535b) C86312j.m106911c(cls)).Pc0(queryParameter, queryParameter2, C88273g1.OPEN_SDK_API_PRELOAD).mo114038a(new C85090k(matrixCursor, countDownLatch)).mo123065b(new C85089j(countDownLatch));
                } else {
                    ((C91535b) C86312j.m106911c(cls)).mo125307lO(queryParameter, new C85085a(this));
                }
                return 0;
            }
            C85083h.m104913b(false, this.f247931d);
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.h$b */
    public class C85086b implements PendingIntent.OnFinished {
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            Log.m105924i("MicroMsg.WXBizLogic", "safeStartWXBizEntry use PendingIntent onSendFinished resultCode: " + i + ", resultData: " + str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.h$c */
    public class C85087c implements Runnable {
        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r14 = this;
                java.lang.Class<com.tencent.mm.plugin.base.stub.h> r0 = com.tencent.p014mm.plugin.base.stub.C85083h.class
                monitor-enter(r0)
                java.lang.String r1 = "MicroMsg.WXBizLogic"
                java.lang.String r2 = "Safe Launch WXBizEntry checkStartWXBizEntry"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ all -> 0x0095 }
                android.content.Intent r1 = com.tencent.p014mm.plugin.base.stub.C85083h.f247921b     // Catch:{ all -> 0x0095 }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)
                goto L_0x0094
            L_0x0011:
                java.lang.String r2 = "__BIZ_ENTRY_ENTER_ID"
                r3 = 0
                long r1 = r1.getLongExtra(r2, r3)     // Catch:{ all -> 0x0095 }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0095 }
                long r3 = r3 - r1
                android.content.Intent r1 = com.tencent.p014mm.plugin.base.stub.C85083h.f247921b     // Catch:{ all -> 0x0095 }
                boolean r1 = com.tencent.p014mm.plugin.base.stub.C85083h.m104923l(r1)     // Catch:{ all -> 0x0095 }
                if (r1 != 0) goto L_0x0093
                long r1 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0095 }
                r5 = 5000(0x1388, double:2.4703E-320)
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 >= 0) goto L_0x0093
                java.lang.String r1 = "MicroMsg.WXBizLogic"
                java.lang.String r2 = "Safe Launch WXBizEntry checkStartWXBizEntry startActivity costTime %d"
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0095 }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0095 }
                r4 = 0
                r6[r4] = r3     // Catch:{ all -> 0x0095 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r6)     // Catch:{ all -> 0x0095 }
                android.content.Intent r1 = com.tencent.p014mm.plugin.base.stub.C85083h.f247921b     // Catch:{ all -> 0x0095 }
                java.lang.String r2 = "__BIZ_ENTRY_FROM_RETRY"
                r1.putExtra(r2, r5)     // Catch:{ all -> 0x0095 }
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0095 }
                android.content.Intent r2 = com.tencent.p014mm.plugin.base.stub.C85083h.f247921b     // Catch:{ all -> 0x0095 }
                k20.a r3 = new k20.a     // Catch:{ all -> 0x0095 }
                r3.<init>()     // Catch:{ all -> 0x0095 }
                r3.mo10233c(r2)     // Catch:{ all -> 0x0095 }
                java.lang.Object[] r7 = r3.mo10232b()     // Catch:{ all -> 0x0095 }
                java.lang.String r8 = "com/tencent/mm/plugin/base/stub/WXBizLogic"
                java.lang.String r9 = "doCheckStartWXBizEntry"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "Undefined"
                java.lang.String r12 = "startActivity"
                java.lang.String r13 = "(Landroid/content/Intent;)V"
                r6 = r1
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0095 }
                java.lang.Object r2 = r3.mo10231a(r4)     // Catch:{ all -> 0x0095 }
                android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x0095 }
                r1.startActivity(r2)     // Catch:{ all -> 0x0095 }
                java.lang.String r7 = "com/tencent/mm/plugin/base/stub/WXBizLogic"
                java.lang.String r8 = "doCheckStartWXBizEntry"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "Undefined"
                java.lang.String r11 = "startActivity"
                java.lang.String r12 = "(Landroid/content/Intent;)V"
                r6 = r1
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0095 }
                monitor-enter(r0)     // Catch:{ all -> 0x0095 }
                r1 = 0
                com.tencent.p014mm.plugin.base.stub.C85083h.f247921b = r1     // Catch:{ all -> 0x0090 }
                monitor-exit(r0)     // Catch:{ all -> 0x0095 }
                r1 = 30
                com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r1)     // Catch:{ all -> 0x0095 }
                goto L_0x0093
            L_0x0090:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0095 }
                throw r1     // Catch:{ all -> 0x0095 }
            L_0x0093:
                monitor-exit(r0)
            L_0x0094:
                return
            L_0x0095:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.C85083h.C85087c.run():void");
        }
    }

    /* renamed from: a */
    public static void m104912a(Activity activity) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", C90945m.f260967a);
        intent.putExtra("showShare", false);
        C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m104913b(boolean z, int i) {
        if (i == 1 || i == 2) {
            m104926o(z ? 11 : 12);
        } else if (i == 3) {
            m104926o(z ? 14 : 15);
        }
    }

    /* renamed from: c */
    public static boolean m104914c(String str, String str2, String str3, String str4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        if (!Util.isNullOrNil(str4)) {
            String[] split = str4.split("\\?");
            if (split.length > 0) {
                sb.append(split[0]);
            }
        }
        String sb4 = sb.toString();
        long currentTimeMillis = System.currentTimeMillis();
        C101611g<String, Long> gVar = f247930k;
        if (gVar.checkAndUpTime(sb4)) {
            long longValue = currentTimeMillis - gVar.get(sb4).longValue();
            if (longValue < j) {
                Log.m105929w("MicroMsg.WXBizLogic", "checkIfCanPreloadMiniProgram cannot preload, key:%s, interval duration:%d , intervalDuration:%d", sb4, Long.valueOf(longValue), Long.valueOf(j));
                return false;
            }
        }
        Log.m105925i("MicroMsg.WXBizLogic", "checkIfCanPreloadMiniProgram can preload, key:%s, currentTimeMillis:%d , intervalDuration:%d", sb4, Long.valueOf(currentTimeMillis), Long.valueOf(j));
        gVar.put(sb4, Long.valueOf(currentTimeMillis));
        return true;
    }

    /* renamed from: d */
    public static void m104915d() {
        if (f247924e == null) {
            C68755l lVar = new C68755l();
            f247924e = lVar;
            lVar.alive();
        }
        if (f247921b != null && C86709a0.m107522a() && m104922k()) {
            MMHandlerThread.postToMainThreadDelayed(new C85087c(), 50);
        }
    }

    /* renamed from: e */
    public static MatrixCursor m104916e(Context context, String str, int i, String str2, String str3, int i2, int i3, boolean z) {
        String str4 = str2;
        int i4 = i3;
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
            Log.m105920e("MicroMsg.WXBizLogic", "doMiniProgramTranslateLink:packageName or signature null");
            return null;
        }
        LinkedList<C52064y4> linkedList = new LinkedList<>();
        C52064y4 y4Var = new C52064y4();
        Log.m105925i("MicroMsg.WXBizLogic", "doMiniProgramTranslateLink package name = %s, cgiType=%d", str4, Integer.valueOf(i3));
        y4Var.f145107e = str4;
        y4Var.f145106d = str3;
        linkedList.add(y4Var);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new vj4();
        bVar.f127067b = new wj4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/translatelink";
        bVar.f127069d = 1200;
        C47350c a = bVar.mo72403a();
        vj4 vj4 = (vj4) a.f127055a.f127080a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str5 = "";
        sb.append(1 == i4 ? "&preload=1" : str5);
        vj4.f143527d = sb.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(vj4.f143527d);
        if (2 == i4) {
            str5 = "&jsForReport=1";
        }
        sb4.append(str5);
        vj4.f143527d = sb4.toString();
        int i5 = i;
        vj4.f143528e = i5;
        vj4.f143530g = linkedList;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"downloadUrl", "fileMd5", "expireTime", "extraBytes"});
        C85084a aVar = r1;
        MatrixCursor matrixCursor2 = matrixCursor;
        C85084a aVar2 = new C85084a(i3, str, i5, str2, str3, i2, z, matrixCursor, countDownLatch);
        C89144l0.m111429e(a, aVar, false);
        if (z) {
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.m105920e("MicroMsg.WXBizLogic", e.getMessage());
            }
        }
        if (z) {
            return matrixCursor2;
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m104917f(Context context, String[] strArr, String[] strArr2) {
        String str;
        String str2;
        String str3 = "";
        if (context == null) {
            Log.m105920e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        String str4 = null;
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            String str5 = strArr2[0];
            Signature[] a = C6647c.m6936a(context, str5);
            if (a != null) {
                str4 = C90193h.m112878f(a[0].toByteArray());
            }
            String str6 = str4;
            str4 = str5;
            str = str6;
        }
        Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed packageName = %s, sig = %s", str4, str);
        if (strArr == null || strArr.length < 2) {
            Log.m105920e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        String str7 = strArr[0];
        if (Util.isNullOrNil(str7)) {
            Log.m105920e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        String str8 = strArr[1];
        if (Util.isNullOrNil(str8)) {
            Log.m105920e("MicroMsg.WXBizLogic", "username isEmpty");
            return false;
        }
        String str9 = strArr[2];
        if (Util.isNullOrNil(str9)) {
            Log.m105920e("MicroMsg.WXBizLogic", "eventId isEmpty");
            return false;
        }
        if (strArr.length > 3) {
            String str10 = strArr[3];
        }
        try {
            str2 = URLEncoder.encode(str8, "UTF-8");
            try {
                str3 = URLEncoder.encode(str9, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e = e;
                Log.m105920e("MicroMsg.WXBizLogic", e.getMessage());
                String format = String.format("%s?appid=%s&username=%s&eventId=%s", new Object[]{"weixin://dl/channels/openEvent/", str7, str2, str3});
                Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, username = %s, eventId = %s", str7, str8, str9);
                Intent intent = new Intent(context, WXBizEntryActivity.class);
                intent.setData(Uri.parse(format));
                intent.addFlags(268435456);
                intent.putExtra("key_app_id", str7);
                intent.putExtra("key_package_name", str4);
                intent.putExtra("translate_link_scene", 1);
                intent.putExtra("key_package_signature", str);
                intent.putExtra("key_command_id", 41);
                m104929r(intent, context);
                return true;
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            str2 = str3;
            Log.m105920e("MicroMsg.WXBizLogic", e.getMessage());
            String format2 = String.format("%s?appid=%s&username=%s&eventId=%s", new Object[]{"weixin://dl/channels/openEvent/", str7, str2, str3});
            Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, username = %s, eventId = %s", str7, str8, str9);
            Intent intent2 = new Intent(context, WXBizEntryActivity.class);
            intent2.setData(Uri.parse(format2));
            intent2.addFlags(268435456);
            intent2.putExtra("key_app_id", str7);
            intent2.putExtra("key_package_name", str4);
            intent2.putExtra("translate_link_scene", 1);
            intent2.putExtra("key_package_signature", str);
            intent2.putExtra("key_command_id", 41);
            m104929r(intent2, context);
            return true;
        }
        String format22 = String.format("%s?appid=%s&username=%s&eventId=%s", new Object[]{"weixin://dl/channels/openEvent/", str7, str2, str3});
        Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, username = %s, eventId = %s", str7, str8, str9);
        Intent intent22 = new Intent(context, WXBizEntryActivity.class);
        intent22.setData(Uri.parse(format22));
        intent22.addFlags(268435456);
        intent22.putExtra("key_app_id", str7);
        intent22.putExtra("key_package_name", str4);
        intent22.putExtra("translate_link_scene", 1);
        intent22.putExtra("key_package_signature", str);
        intent22.putExtra("key_command_id", 41);
        m104929r(intent22, context);
        return true;
    }

    /* renamed from: g */
    public static boolean m104918g(Context context, String[] strArr, String[] strArr2) {
        String str;
        String str2;
        Context context2 = context;
        String[] strArr3 = strArr;
        String[] strArr4 = strArr2;
        if (context2 == null) {
            Log.m105920e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        String str3 = null;
        if (strArr4 == null || strArr4.length <= 0) {
            str = null;
        } else {
            String str4 = strArr4[0];
            Signature[] a = C6647c.m6936a(context2, str4);
            if (a != null) {
                str3 = C90193h.m112878f(a[0].toByteArray());
            }
            String str5 = str3;
            str3 = str4;
            str = str5;
        }
        Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed packageName = %s, sig = %s", str3, str);
        if (strArr3 == null || strArr3.length < 3) {
            Log.m105920e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        String str6 = strArr3[0];
        if (Util.isNullOrNil(str6)) {
            Log.m105920e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        String str7 = strArr3[1];
        if (Util.isNullOrNil(str7)) {
            Log.m105920e("MicroMsg.WXBizLogic", "feedID isEmpty");
            return false;
        }
        String str8 = strArr3[2];
        if (Util.isNullOrNil(str8)) {
            Log.m105920e("MicroMsg.WXBizLogic", "nonceID isEmpty");
            return false;
        }
        String str9 = "";
        String str10 = strArr3.length > 3 ? strArr3[3] : str9;
        boolean equals = str10.equals("true");
        try {
            str2 = URLEncoder.encode(str7, "UTF-8");
            try {
                str9 = URLEncoder.encode(str8, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e = e;
                Log.printErrStackTrace("MicroMsg.WXBizLogic", e, str9, new Object[0]);
                String format = String.format("weixin://dl/channels/feed/?appid=%s&feedID=%s&nonceID=%s&nonGetRelatedList=%d", new Object[]{str6, str2, str9, Integer.valueOf(equals ? 1 : 0)});
                Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, feedID = %s, nonceID = %s, nonGetRelatedList", str6, str7, str8, str10);
                Intent intent = new Intent(context2, WXBizEntryActivity.class);
                intent.setData(Uri.parse(format));
                intent.addFlags(268435456);
                intent.putExtra("key_app_id", str6);
                intent.putExtra("key_package_name", str3);
                intent.putExtra("translate_link_scene", 1);
                intent.putExtra("key_package_signature", str);
                intent.putExtra("key_command_id", 36);
                m104929r(intent, context2);
                return true;
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            str2 = str9;
            Log.printErrStackTrace("MicroMsg.WXBizLogic", e, str9, new Object[0]);
            String format2 = String.format("weixin://dl/channels/feed/?appid=%s&feedID=%s&nonceID=%s&nonGetRelatedList=%d", new Object[]{str6, str2, str9, Integer.valueOf(equals ? 1 : 0)});
            Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, feedID = %s, nonceID = %s, nonGetRelatedList", str6, str7, str8, str10);
            Intent intent2 = new Intent(context2, WXBizEntryActivity.class);
            intent2.setData(Uri.parse(format2));
            intent2.addFlags(268435456);
            intent2.putExtra("key_app_id", str6);
            intent2.putExtra("key_package_name", str3);
            intent2.putExtra("translate_link_scene", 1);
            intent2.putExtra("key_package_signature", str);
            intent2.putExtra("key_command_id", 36);
            m104929r(intent2, context2);
            return true;
        }
        String format22 = String.format("weixin://dl/channels/feed/?appid=%s&feedID=%s&nonceID=%s&nonGetRelatedList=%d", new Object[]{str6, str2, str9, Integer.valueOf(equals ? 1 : 0)});
        Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, feedID = %s, nonceID = %s, nonGetRelatedList", str6, str7, str8, str10);
        Intent intent22 = new Intent(context2, WXBizEntryActivity.class);
        intent22.setData(Uri.parse(format22));
        intent22.addFlags(268435456);
        intent22.putExtra("key_app_id", str6);
        intent22.putExtra("key_package_name", str3);
        intent22.putExtra("translate_link_scene", 1);
        intent22.putExtra("key_package_signature", str);
        intent22.putExtra("key_command_id", 36);
        m104929r(intent22, context2);
        return true;
    }

    /* renamed from: h */
    public static boolean m104919h(Context context, String[] strArr, String[] strArr2) {
        String str;
        String str2;
        String str3 = "";
        if (context == null) {
            Log.m105920e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        String str4 = null;
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            String str5 = strArr2[0];
            Signature[] a = C6647c.m6936a(context, str5);
            if (a != null) {
                str4 = C90193h.m112878f(a[0].toByteArray());
            }
            String str6 = str4;
            str4 = str5;
            str = str6;
        }
        Log.m105925i("MicroMsg.WXBizLogic", "finderOpenLive packageName = %s, sig = %s", str4, str);
        if (strArr == null || strArr.length < 3) {
            Log.m105920e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        String str7 = strArr[0];
        if (Util.isNullOrNil(str7)) {
            Log.m105920e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        String str8 = strArr[1];
        if (Util.isNullOrNil(str8)) {
            Log.m105920e("MicroMsg.WXBizLogic", "feedID isEmpty");
            return false;
        }
        String str9 = strArr[2];
        if (Util.isNullOrNil(str9)) {
            Log.m105920e("MicroMsg.WXBizLogic", "nonceID isEmpty");
            return false;
        }
        try {
            str2 = URLEncoder.encode(str8, "UTF-8");
            try {
                str3 = URLEncoder.encode(str9, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e = e;
                Log.printErrStackTrace("MicroMsg.WXBizLogic", e, str3, new Object[0]);
                String format = String.format("weixin://dl/channels/live/?appid=%s&feedID=%s&nonceID=%s", new Object[]{str7, str2, str3});
                Log.m105925i("MicroMsg.WXBizLogic", "finderOpenLive: appid = %s, feedID = %s, nonceID = %s", str7, str8, str9);
                Intent intent = new Intent(context, WXBizEntryActivity.class);
                intent.setData(Uri.parse(format));
                intent.addFlags(268435456);
                intent.putExtra("key_app_id", str7);
                intent.putExtra("key_package_name", str4);
                intent.putExtra("translate_link_scene", 1);
                intent.putExtra("key_package_signature", str);
                intent.putExtra("key_command_id", 35);
                m104929r(intent, context);
                return true;
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            str2 = str3;
            Log.printErrStackTrace("MicroMsg.WXBizLogic", e, str3, new Object[0]);
            String format2 = String.format("weixin://dl/channels/live/?appid=%s&feedID=%s&nonceID=%s", new Object[]{str7, str2, str3});
            Log.m105925i("MicroMsg.WXBizLogic", "finderOpenLive: appid = %s, feedID = %s, nonceID = %s", str7, str8, str9);
            Intent intent2 = new Intent(context, WXBizEntryActivity.class);
            intent2.setData(Uri.parse(format2));
            intent2.addFlags(268435456);
            intent2.putExtra("key_app_id", str7);
            intent2.putExtra("key_package_name", str4);
            intent2.putExtra("translate_link_scene", 1);
            intent2.putExtra("key_package_signature", str);
            intent2.putExtra("key_command_id", 35);
            m104929r(intent2, context);
            return true;
        }
        String format22 = String.format("weixin://dl/channels/live/?appid=%s&feedID=%s&nonceID=%s", new Object[]{str7, str2, str3});
        Log.m105925i("MicroMsg.WXBizLogic", "finderOpenLive: appid = %s, feedID = %s, nonceID = %s", str7, str8, str9);
        Intent intent22 = new Intent(context, WXBizEntryActivity.class);
        intent22.setData(Uri.parse(format22));
        intent22.addFlags(268435456);
        intent22.putExtra("key_app_id", str7);
        intent22.putExtra("key_package_name", str4);
        intent22.putExtra("translate_link_scene", 1);
        intent22.putExtra("key_package_signature", str);
        intent22.putExtra("key_command_id", 35);
        m104929r(intent22, context);
        return true;
    }

    /* renamed from: i */
    public static boolean m104920i(Context context, String[] strArr, String[] strArr2) {
        String str;
        String str2;
        if (context == null) {
            Log.m105920e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        String str3 = null;
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            String str4 = strArr2[0];
            Signature[] a = C6647c.m6936a(context, str4);
            if (a != null) {
                str3 = C90193h.m112878f(a[0].toByteArray());
            }
            String str5 = str3;
            str3 = str4;
            str = str5;
        }
        Log.m105925i("MicroMsg.WXBizLogic", "finderStartLive packageName = %s, sig = %s", str3, str);
        if (strArr == null || strArr.length < 2) {
            Log.m105920e("MicroMsg.WXBizLogic", "args is null or params num is not enough");
            return false;
        }
        String str6 = strArr[0];
        if (Util.isNullOrNil(str6)) {
            Log.m105920e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        String str7 = strArr[1];
        if (Util.isNullOrNil(str7)) {
            Log.m105920e("MicroMsg.WXBizLogic", "liveJsonInfo isEmpty");
            return false;
        }
        String str8 = "";
        if (strArr.length > 2) {
            str2 = strArr[2];
            if (C86709a0.m107522a()) {
                ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(str6, true);
            }
            Log.m105925i("MicroMsg.WXBizLogic", "openid = %s", str2);
        } else {
            str2 = str8;
        }
        try {
            str8 = URLEncoder.encode(str7, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.m105920e("MicroMsg.WXBizLogic", e.getMessage());
        }
        String format = String.format("weixin://dl/channels/startLive/?appid=%s&liveInfoData=%s&openId=%s", new Object[]{str6, str8, str2});
        Log.m105925i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, encodeLiveInfo = %s, openId = %s", str6, str8, str2);
        Intent intent = new Intent(context, WXBizEntryActivity.class);
        intent.setData(Uri.parse(format));
        intent.addFlags(268435456);
        intent.putExtra("key_app_id", str6);
        intent.putExtra("key_package_name", str3);
        intent.putExtra("translate_link_scene", 1);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_command_id", 39);
        m104929r(intent, context);
        return true;
    }

    /* renamed from: j */
    public static String m104921j(String str, int i, String str2, String str3, int i2) {
        return MD5Util.getMD5String(String.format("%s_%d_%s_%s_%d", new Object[]{str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2)}));
    }

    /* renamed from: k */
    public static boolean m104922k() {
        int i = f247923d;
        if (i != -1) {
            return i == 1;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_jump_biz_entry_retry, 1);
        f247923d = Qe;
        Log.m105925i("MicroMsg.WXBizLogic", "reTryOpenWXBizEntry open %d", Integer.valueOf(Qe));
        return f247923d == 1;
    }

    /* renamed from: l */
    public static synchronized boolean m104923l(Intent intent) {
        boolean contains;
        synchronized (C85083h.class) {
            long longExtra = intent.getLongExtra("__BIZ_ENTRY_ENTER_ID", 0);
            Log.m105919d("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry isInConsumedSet %d", Long.valueOf(longExtra));
            contains = ((HashSet) f247922c).contains(Long.valueOf(longExtra));
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x028e, code lost:
        if ((java.lang.System.currentTimeMillis() - r1.f247919c) > r1.f247918b) goto L_0x0293;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a A[SYNTHETIC, Splitter:B:80:0x011a] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0183  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.MatrixCursor m104924m(android.content.Context r21, java.lang.String[] r22, java.lang.String[] r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r1 = r21
            r0 = r22
            r2 = r23
            java.lang.String r3 = "utf-8"
            r9 = 0
            java.lang.String r4 = "MicroMsg.WXBizLogic"
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return r9
        L_0x0014:
            r10 = 0
            if (r2 == 0) goto L_0x002d
            int r5 = r2.length
            if (r5 <= 0) goto L_0x002d
            r2 = r2[r10]
            android.content.pm.Signature[] r5 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r1, r2)
            r5 = r5[r10]
            byte[] r5 = r5.toByteArray()
            java.lang.String r5 = p823sg.C90193h.m112878f(r5)
            r11 = r2
            r12 = r5
            goto L_0x002f
        L_0x002d:
            r11 = r9
            r12 = r11
        L_0x002f:
            r13 = 2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r10] = r11
            r14 = 1
            r2[r14] = r12
            java.lang.String r5 = "launchMiniProgram packageName = %s, sig = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
            if (r0 == 0) goto L_0x039a
            int r2 = r0.length
            if (r2 >= r13) goto L_0x0043
            goto L_0x039a
        L_0x0043:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalAppbrand
            boolean r2 = r2.checkAvailable(r1)
            if (r2 != 0) goto L_0x004c
            return r9
        L_0x004c:
            r8 = r0[r10]
            java.lang.String r2 = ""
            if (r27 != 0) goto L_0x0056
            r5 = r0[r14]
            r7 = r5
            goto L_0x0057
        L_0x0056:
            r7 = r2
        L_0x0057:
            r6 = 3
            if (r26 == 0) goto L_0x005c
            r5 = 3
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            int r15 = r0.length
            if (r15 <= r13) goto L_0x0063
            r15 = r0[r13]
            goto L_0x0064
        L_0x0063:
            r15 = r2
        L_0x0064:
            int r9 = r0.length
            if (r9 <= r6) goto L_0x006e
            r9 = r0[r6]
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r10)
            goto L_0x006f
        L_0x006e:
            r9 = 0
        L_0x006f:
            int r6 = r0.length
            r13 = 4
            if (r6 <= r13) goto L_0x0110
            r0 = r0[r13]
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            if (r6 != 0) goto L_0x00eb
            java.lang.String r6 = "extdata %s"
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            r13[r10] = r0     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r6, r13)     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r3)     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            c30.g r6 = new c30.g     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            r6.<init>((java.lang.String) r0)     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            java.lang.String r0 = "invokeData"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            java.lang.String r3 = java.net.URLEncoder.encode(r0, r3)     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            java.lang.String r0 = "pathType"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ f -> 0x00e9, UnsupportedEncodingException -> 0x00e7 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r10)     // Catch:{ f -> 0x00e9, UnsupportedEncodingException -> 0x00e7 }
            java.lang.String r0 = "runtimeAppid"
            java.lang.String r13 = r6.optString(r0)     // Catch:{ f -> 0x00e9, UnsupportedEncodingException -> 0x00e7 }
            java.lang.String r0 = "runtimeTicket"
            java.lang.String r16 = r6.optString(r0)     // Catch:{ f -> 0x00e2, UnsupportedEncodingException -> 0x00dd }
            java.lang.String r0 = "runtimeSessionId"
            java.lang.String r6 = r6.optString(r0)     // Catch:{ f -> 0x00da, UnsupportedEncodingException -> 0x00d7 }
            java.lang.String r0 = "invokeData = %s, pathType:%d, runtimeAppid:%s, runtimeTicket:%s, runtimeSessionId:%s"
            r14 = 5
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            r1[r10] = r3     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            r17 = 1
            r1[r17] = r14     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            r14 = 2
            r1[r14] = r13     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            r14 = 3
            r1[r14] = r16     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            r14 = 4
            r1[r14] = r6     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r1)     // Catch:{ f -> 0x00d5, UnsupportedEncodingException -> 0x00d3 }
            goto L_0x010d
        L_0x00d3:
            r0 = move-exception
            goto L_0x00fc
        L_0x00d5:
            r0 = move-exception
            goto L_0x0108
        L_0x00d7:
            r0 = move-exception
            r6 = r2
            goto L_0x00fc
        L_0x00da:
            r0 = move-exception
            r6 = r2
            goto L_0x0108
        L_0x00dd:
            r0 = move-exception
            r6 = r2
            r16 = r6
            goto L_0x00fc
        L_0x00e2:
            r0 = move-exception
            r6 = r2
            r16 = r6
            goto L_0x0108
        L_0x00e7:
            r0 = move-exception
            goto L_0x00f8
        L_0x00e9:
            r0 = move-exception
            goto L_0x0104
        L_0x00eb:
            java.lang.String r0 = "extdata is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ f -> 0x0102, UnsupportedEncodingException -> 0x00f6 }
            r3 = r2
            r6 = r3
            r13 = r6
            r16 = r13
            goto L_0x010d
        L_0x00f6:
            r0 = move-exception
            r3 = r2
        L_0x00f8:
            r6 = r2
            r13 = r6
            r16 = r13
        L_0x00fc:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
            goto L_0x010d
        L_0x0102:
            r0 = move-exception
            r3 = r2
        L_0x0104:
            r6 = r2
            r13 = r6
            r16 = r13
        L_0x0108:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
        L_0x010d:
            r1 = r16
            goto L_0x0114
        L_0x0110:
            r1 = r2
            r3 = r1
            r6 = r3
            r13 = r6
        L_0x0114:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r0 != 0) goto L_0x0133
            java.lang.String r2 = java.net.URLEncoder.encode(r15)     // Catch:{ Exception -> 0x0120 }
            r15 = 1
            goto L_0x0130
        L_0x0120:
            r0 = move-exception
            r14 = r0
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.String r14 = r14.getMessage()
            r0[r10] = r14
            java.lang.String r14 = "encode path failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r14, r0)
        L_0x0130:
            r0 = r2
            r2 = 1
            goto L_0x0135
        L_0x0133:
            r2 = 1
            r0 = r15
        L_0x0135:
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r10] = r8
            r15[r2] = r7
            r2 = 2
            r15[r2] = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r14 = 3
            r15[r14] = r2
            java.lang.String r2 = "launchMiniProgram, appid = %s, username = %s, path = %s, type = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r15)
            if (r27 == 0) goto L_0x0166
            r19 = 600000(0x927c0, double:2.964394E-318)
            java.lang.String r15 = "preloadEnv"
            r16 = r8
            r17 = r7
            r18 = r0
            boolean r2 = m104914c(r15, r16, r17, r18, r19)
            if (r2 != 0) goto L_0x0181
            java.lang.String r0 = "launchMiniProgram, preload miniProgram environment is too often, preload fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r1 = 0
            return r1
        L_0x0166:
            if (r24 == 0) goto L_0x0181
            r19 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.String r15 = "preload"
            r16 = r8
            r17 = r7
            r18 = r0
            boolean r2 = m104914c(r15, r16, r17, r18, r19)
            if (r2 != 0) goto L_0x0181
            java.lang.String r0 = "launchMiniProgram, preload miniProgram is too often, preload fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r1 = 0
            return r1
        L_0x0181:
            if (r27 != 0) goto L_0x01ac
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r10] = r8
            r14 = 1
            r2[r14] = r7
            r14 = 2
            r2[r14] = r0
            r14 = 3
            r2[r14] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3 = 4
            r2[r3] = r0
            r3 = 5
            r2[r3] = r13
            r0 = 6
            r2[r0] = r1
            r0 = 7
            r2[r0] = r6
            java.lang.String r0 = "weixin://dl/jumpWxa/?appid=%s&userName=%s@app&path=%s&invokeData=%s&pathType=%d&runtimeAppid=%s&runtimeTicket=%s&runtimeSessionId=%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r2 = r0
            r1 = 1
            goto L_0x01b9
        L_0x01ac:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r10] = r8
            java.lang.String r2 = "weixin://dl/preloadWxa/?appid=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r2 = r0
        L_0x01b9:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r10] = r2
            java.lang.String r1 = "url format = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            if (r24 == 0) goto L_0x01d3
            r3 = 1
            r7 = 1
            r1 = r21
            r4 = r11
            r5 = r12
            r6 = r9
            r8 = r25
            android.database.MatrixCursor r0 = m104916e(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x01d3:
            if (r27 == 0) goto L_0x026e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 != 0) goto L_0x0267
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 == 0) goto L_0x01e3
            goto L_0x0267
        L_0x01e3:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            te3.y4 r1 = new te3.y4
            r1.<init>()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r10] = r11
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r3[r5] = r6
            java.lang.String r5 = "doPreloadMiniProgramTranslateLink package name = %s, cgiType=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            r1.f145107e = r11
            r1.f145106d = r12
            r0.add(r1)
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.vj4 r3 = new te3.vj4
            r3.<init>()
            r1.f127066a = r3
            te3.wj4 r3 = new te3.wj4
            r3.<init>()
            r1.f127067b = r3
            java.lang.String r3 = "/cgi-bin/mmbiz-bin/translatelink"
            r1.f127068c = r3
            r3 = 1200(0x4b0, float:1.682E-42)
            r1.f127069d = r3
            ob0.c r1 = r1.mo72403a()
            ob0.c$c r3 = r1.f127055a
            pe3.a r3 = r3.f127080a
            te3.vj4 r3 = (te3.vj4) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "&preloadWxaEnv=1"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.f143527d = r2
            r5 = 1
            r3.f143528e = r5
            r3.f143530g = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r10] = r2
            java.lang.String r2 = "alvinluo doPreloadMiniProgramTranslateLink link: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r0)
            android.database.MatrixCursor r9 = new android.database.MatrixCursor
            java.lang.String r0 = "downloadUrl"
            java.lang.String r2 = "fileMd5"
            java.lang.String r3 = "expireTime"
            java.lang.String r4 = "extraBytes"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r3, r4}
            r9.<init>(r0)
            com.tencent.mm.plugin.base.stub.i r0 = new com.tencent.mm.plugin.base.stub.i
            r6 = 3
            r0.<init>(r6)
            ob0.C89144l0.m111429e(r1, r0, r10)
            goto L_0x026d
        L_0x0267:
            java.lang.String r0 = "doPreloadMiniProgramTranslateLink:packageName or signature null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r9 = 0
        L_0x026d:
            return r9
        L_0x026e:
            r1 = 1
            r6 = 3
            java.lang.String r0 = m104921j(r2, r1, r11, r12, r9)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r1 = f247920a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.remove(r0)
            r1 = r0
            com.tencent.mm.plugin.base.stub.d r1 = (com.tencent.p014mm.plugin.base.stub.C85082d) r1
            if (r1 == 0) goto L_0x0291
            long r13 = java.lang.System.currentTimeMillis()
            r23 = r7
            long r6 = r1.f247919c
            long r13 = r13 - r6
            long r5 = r1.f247918b
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0294
            goto L_0x0293
        L_0x0291:
            r23 = r7
        L_0x0293:
            r1 = 0
        L_0x0294:
            if (r1 == 0) goto L_0x02d0
            java.lang.String r0 = r1.f247917a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02d0
            java.lang.String r0 = "sdk launch wxminiprogram use cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r14 = r1.f247917a
            r16 = 1
            java.lang.String r0 = wc3.C90945m.f260967a
            int r18 = qe3.C12212g.m11775a()
            byte[] r0 = new byte[r10]
            r15 = 0
            r17 = 0
            r19 = r0
            r20 = r2
            wc3.C90945m.m114063m(r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 1
            r7 = 2
            r0 = 0
            r1 = r21
            r4 = r11
            r5 = r12
            r13 = 3
            r6 = r9
            r14 = r23
            r15 = r8
            r8 = r0
            m104916e(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0353
        L_0x02d0:
            r14 = r23
            r15 = r8
            r13 = 3
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.base.stub.WXBizEntryActivity> r1 = com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity.class
            r3 = r21
            r0.<init>(r3, r1)
            android.net.Uri r1 = android.net.Uri.parse(r2)
            r0.setData(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "key_app_id"
            r0.putExtra(r1, r15)
            java.lang.String r1 = "key_user_name"
            r0.putExtra(r1, r14)
            java.lang.String r1 = "key_package_name"
            r0.putExtra(r1, r11)
            java.lang.String r2 = "translate_link_scene"
            r5 = 1
            r0.putExtra(r2, r5)
            java.lang.String r2 = "key_package_signature"
            r0.putExtra(r2, r12)
            java.lang.String r6 = "key_translate_link_type"
            r0.putExtra(r6, r9)
            java.lang.String r6 = "key_command_id"
            if (r26 == 0) goto L_0x031d
            java.lang.String r7 = "key_launch_mini_program_is_used_token"
            r0.putExtra(r7, r5)
            java.lang.String r7 = "key_launch_mini_program_token"
            r0.putExtra(r7, r14)
            r7 = 29
            r0.putExtra(r6, r7)
            goto L_0x0322
        L_0x031d:
            r7 = 19
            r0.putExtra(r6, r7)
        L_0x0322:
            eb0.v0 r6 = eb0.C86493v0.m107224d()
            java.lang.String r7 = "key_data_center_session_id"
            eb0.v0$c r6 = r6.mo120947c(r7, r5)
            r6.mo120962i(r1, r11)
            r6.mo120962i(r2, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = "key_launch_miniprogram_type"
            r6.mo120962i(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r10] = r11
            r1[r5] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r5 = 2
            r1[r5] = r2
            java.lang.String r2 = "doLaunchProgram sava packagename and signature to data center, package: %s, sig: %s, type = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            m104926o(r5)
            m104929r(r0, r3)
        L_0x0353:
            boolean r0 = f247926g
            r1 = 0
            if (r0 == 0) goto L_0x0361
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = f247927h
            long r3 = r3 - r5
            goto L_0x0362
        L_0x0361:
            r3 = r1
        L_0x0362:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x036f
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x036e
            goto L_0x036f
        L_0x036e:
            r1 = r3
        L_0x036f:
            r3 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x037a
            r0 = 20
            m104926o(r0)
        L_0x037a:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 19218(0x4b12, float:2.693E-41)
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r10] = r15
            r5 = 1
            r4[r5] = r11
            r5 = 2
            r4[r5] = r12
            r4[r13] = r14
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r4[r2] = r1
            r0.mo160131h(r3, r4)
            r1 = 0
            return r1
        L_0x039a:
            r1 = r9
            java.lang.String r0 = "args is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.C85083h.m104924m(android.content.Context, java.lang.String[], java.lang.String[], boolean, boolean, boolean, boolean):android.database.MatrixCursor");
    }

    /* renamed from: n */
    public static boolean m104925n(Context context, String[] strArr, String[] strArr2) {
        String str;
        if (context == null) {
            Log.m105920e("MicroMsg.WXBizLogic", "openQRCodePay context is null");
            return false;
        }
        String str2 = null;
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            String str3 = strArr2[0];
            Signature[] a = C6647c.m6936a(context, str3);
            if (a != null) {
                str2 = C90193h.m112878f(a[0].toByteArray());
            }
            String str4 = str2;
            str2 = str3;
            str = str4;
        }
        Log.m105925i("MicroMsg.WXBizLogic", "openQRCodePay packageName = %s, sig = %s", str2, str);
        if (strArr == null || strArr.length < 2) {
            Log.m105920e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        String str5 = strArr[0];
        if (Util.isNullOrNil(str5)) {
            Log.m105920e("MicroMsg.WXBizLogic", "openQRCodePay appId is null");
            return false;
        }
        String str6 = strArr[1];
        if (Util.isNullOrNil(str6)) {
            Log.m105920e("MicroMsg.WXBizLogic", "openQRCodePay codeContent is null");
            return false;
        }
        String str7 = strArr[2];
        if (Util.isNullOrNil(str7)) {
            Log.m105920e("MicroMsg.WXBizLogic", "extraMsg is null");
        }
        Intent intent = new Intent(context, WXBizEntryActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("key_app_id", str5);
        intent.putExtra("key_package_name", str2);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_command_id", 38);
        intent.putExtra("key_qr_code_pay_code_centent", str6);
        intent.putExtra("key_qr_code_pay_extra_msg", str7);
        m104929r(intent, context);
        return true;
    }

    /* renamed from: o */
    public static void m104926o(int i) {
        C115669n.INSTANCE.idkeyStat(1194, (long) i, 1, false);
    }

    /* renamed from: p */
    public static void m104927p(int i) {
        C115669n.INSTANCE.idkeyStat(1674, (long) i, 1, false);
    }

    /* renamed from: q */
    public static void m104928q(int i) {
        C115669n.INSTANCE.mo175911u(1405, i);
    }

    /* renamed from: r */
    public static synchronized void m104929r(Intent intent, Context context) {
        synchronized (C85083h.class) {
            m104930s(intent);
            if (Build.VERSION.SDK_INT < 29 || !m104933v()) {
                Log.m105924i("MicroMsg.WXBizLogic", "safeStartWXBizEntry use startActivity");
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/WXBizLogic", "safeStartWXBizEntry", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/base/stub/WXBizLogic", "safeStartWXBizEntry", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                try {
                    Log.m105924i("MicroMsg.WXBizLogic", "safeStartWXBizEntry use PendingIntent");
                    PendingIntent.getActivity(context, -1, intent, 201326592).send(context, 4, (Intent) null, new C85086b(), (Handler) null);
                } catch (Exception e) {
                    Log.m105925i("MicroMsg.WXBizLogic", "safeStartWXBizEntry use PendingIntent exception:%s", e);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/base/stub/WXBizLogic", "safeStartWXBizEntry", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/base/stub/WXBizLogic", "safeStartWXBizEntry", "(Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
    }

    /* renamed from: s */
    public static synchronized void m104930s(Intent intent) {
        synchronized (C85083h.class) {
            if (m104922k()) {
                m104926o(31);
                long currentTimeMillis = System.currentTimeMillis();
                Log.m105925i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry saveWXBizEntryIntent enterId=%d", Long.valueOf(currentTimeMillis));
                intent.putExtra("__BIZ_ENTRY_ENTER_ID", currentTimeMillis);
                f247921b = intent;
                if (f247924e == null) {
                    C68755l lVar = new C68755l();
                    f247924e = lVar;
                    lVar.alive();
                }
            }
        }
    }

    /* renamed from: t */
    public static void m104931t(Context context, WXLaunchWxaRedirectingPage.Req req, String str, int i, String str2) {
        WXLaunchWxaRedirectingPage.Resp resp = new WXLaunchWxaRedirectingPage.Resp(Bundle.EMPTY);
        resp.invokeTicket = req.invokeTicket;
        resp.callbackActivity = req.callbackActivity;
        resp.errCode = i;
        resp.errStr = str2;
        Bundle bundle = new Bundle();
        resp.toBundle(bundle);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        MMessageActV2.send(context, args);
        if (context instanceof WXBizEntryActivity) {
            ((WXBizEntryActivity) context).finish();
        }
    }

    /* renamed from: u */
    public static void m104932u() {
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_opensdk_content_provider_use_getcallingpackage, 1);
            f247928i = Qe != 0;
            Log.m105925i("MicroMsg.WXBizLogic", "alvinluo updateGetCallingPackageStatus config: %d, %b", Integer.valueOf(Qe), Boolean.valueOf(f247928i));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WXBizLogic", e, "alvinluo updateGetCallingPackageStatus exception", new Object[0]);
            f247928i = true;
        }
    }

    /* renamed from: v */
    public static boolean m104933v() {
        if (f247925f == null) {
            f247925f = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_opensdk_launch_wxbizentry_use_penddingIntent, 1) == 1);
        }
        Log.m105925i("MicroMsg.WXBizLogic", "usePendingIntentOpenWxBizEntryActivity:%s", f247925f);
        return f247925f.booleanValue();
    }
}
