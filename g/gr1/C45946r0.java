package gr1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CopyOnWriteArrayList;
import te3.C49704hh0;
import te3.C51058r50;
import te3.C64728tj0;
import tf0.C64916p1;
import up1.C37521f;
import zt3.C119157j;

/* renamed from: gr1.r0 */
public final class C45946r0 {

    /* renamed from: a */
    public static final C45946r0 f123945a = new C45946r0();

    /* renamed from: b */
    public static final CopyOnWriteArrayList<C64728tj0> f123946b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public static final CopyOnWriteArrayList<C64728tj0> f123947c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public static final CopyOnWriteArrayList<C64728tj0> f123948d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public static final CopyOnWriteArrayList<C64728tj0> f123949e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public static final CopyOnWriteArrayList<C51058r50> f123950f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    public static final CopyOnWriteArrayList<C51058r50> f123951g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    public static C49704hh0 f123952h;

    /* renamed from: i */
    public static Runnable f123953i;

    /* renamed from: j */
    public static C45947a f123954j = new C45947a();

    /* renamed from: k */
    public static boolean f123955k = true;

    /* renamed from: gr1.r0$a */
    public static final class C45947a implements C114668z {
        public void onAppBackground(String str) {
            C45946r0 r0Var = C45946r0.f123945a;
            Log.m105924i("Finder.FinderNetworkStatusStatistic", "stopRecordNetWorkStatus recordNetworkStatusRunnable:" + C45946r0.f123953i);
            C45946r0.f123953i = null;
        }

        public void onAppForeground(String str) {
            C45946r0.f123945a.mo71350d();
        }
    }

    /* renamed from: gr1.r0$b */
    public static final class C45948b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C45948b f123956d = new C45948b();

        public C45948b() {
            super(0);
        }

        public Object invoke() {
            return "type=" + NetStatusUtil.getNetType(MMApplicationContext.getContext());
        }
    }

    /* renamed from: gr1.r0$c */
    public static final class C45949c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f123957d;

        public C45949c(long j) {
            this.f123957d = j;
        }

        public final void run() {
            int i;
            Class cls = C64916p1.class;
            Runnable runnable = C45946r0.f123953i;
            if (runnable != null) {
                long j = this.f123957d;
                C45946r0 r0Var = C45946r0.f123945a;
                Log.m105924i("Finder.FinderNetworkStatusStatistic", "recordFinderNetWorkStatus");
                CdnLogic.DownloadInfo recentDownloadInfo = CdnLogic.getRecentDownloadInfo(251, CdnLogic.kMediaTypeAppVideo, 5);
                if (recentDownloadInfo.recvedBytes <= 0) {
                    i = 0;
                } else {
                    C51058r50 r502 = new C51058r50();
                    r502.f140695d = recentDownloadInfo.recvedBytes;
                    r502.f140696e = recentDownloadInfo.transforMS;
                    long currentTimeMillis = System.currentTimeMillis();
                    r502.f140697f = currentTimeMillis - (recentDownloadInfo.endTickcount - recentDownloadInfo.beginTickcount);
                    r502.f140698g = currentTimeMillis;
                    r502.f140699h = ((C64916p1) C86312j.m106911c(cls)).mo76703jw();
                    StringBuilder sb = new StringBuilder();
                    sb.append("addFinderNetworkInfo info:");
                    sb.append(r502);
                    sb.append(" size:");
                    CopyOnWriteArrayList<C51058r50> copyOnWriteArrayList = C45946r0.f123950f;
                    sb.append(copyOnWriteArrayList.size());
                    Log.m105924i("Finder.FinderNetworkStatusStatistic", sb.toString());
                    if (copyOnWriteArrayList.size() > 24) {
                        i = 0;
                        copyOnWriteArrayList.remove(0);
                    } else {
                        i = 0;
                    }
                    copyOnWriteArrayList.add(r502);
                }
                Log.m105924i("Finder.FinderNetworkStatusStatistic", "recordWechatNetWorkStatus");
                CdnLogic.DownloadInfo recentDownloadInfo2 = CdnLogic.getRecentDownloadInfo(i, i, 5);
                if (recentDownloadInfo2.recvedBytes > 0) {
                    C51058r50 r503 = new C51058r50();
                    r503.f140695d = recentDownloadInfo2.recvedBytes;
                    r503.f140696e = recentDownloadInfo2.transforMS;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    r503.f140697f = currentTimeMillis2 - (recentDownloadInfo2.endTickcount - recentDownloadInfo2.beginTickcount);
                    r503.f140698g = currentTimeMillis2;
                    r503.f140699h = ((C64916p1) C86312j.m106911c(cls)).mo76703jw();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("addWechatNetworkInfo info:");
                    sb4.append(r503);
                    sb4.append(" size:");
                    CopyOnWriteArrayList<C51058r50> copyOnWriteArrayList2 = C45946r0.f123951g;
                    sb4.append(copyOnWriteArrayList2.size());
                    Log.m105924i("Finder.FinderNetworkStatusStatistic", sb4.toString());
                    if (copyOnWriteArrayList2.size() > 24) {
                        copyOnWriteArrayList2.remove(0);
                    }
                    copyOnWriteArrayList2.add(r503);
                }
                ((C119157j) C119157j.f356862d).mo183878i(runnable, j);
            }
        }
    }

    /* renamed from: a */
    public final void mo71347a(C64728tj0 tj02, int i) {
        C87412m.m108594g(tj02, "info");
        StringBuilder sb = new StringBuilder();
        sb.append("addDownloadNetworkInfo info:");
        sb.append(tj02);
        sb.append(" size:");
        CopyOnWriteArrayList<C64728tj0> copyOnWriteArrayList = f123946b;
        sb.append(copyOnWriteArrayList.size());
        sb.append(" maxLimitCount:");
        sb.append(i);
        Log.m105924i("Finder.FinderNetworkStatusStatistic", sb.toString());
        if (i != 0 && copyOnWriteArrayList.size() > i) {
            copyOnWriteArrayList.remove(0);
        }
        copyOnWriteArrayList.add(tj02);
    }

    /* renamed from: b */
    public final void mo71348b(C64728tj0 tj02) {
        C87412m.m108594g(tj02, "info");
        StringBuilder sb = new StringBuilder();
        sb.append("addNetworkInfoToFinderState info:");
        sb.append(tj02);
        sb.append(" size:");
        CopyOnWriteArrayList<C64728tj0> copyOnWriteArrayList = f123947c;
        sb.append(copyOnWriteArrayList.size());
        Log.m105924i("Finder.FinderNetworkStatusStatistic", sb.toString());
        copyOnWriteArrayList.add(tj02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0103  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C49704hh0 mo71349c() {
        /*
            r12 = this;
            java.lang.String r0 = "Finder.FinderNetworkStatusStatistic"
            te3.hh0 r1 = new te3.hh0
            r1.<init>()
            java.lang.String r2 = qe3.C89625d.f257839e
            r1.f134640j = r2
            java.lang.String r2 = p156gj.C87200o.f252873f
            r1.f134641n = r2
            java.lang.String r2 = qe3.C89625d.f257836b
            r1.f134639i = r2
            java.lang.String r2 = qe3.C89625d.f257837c
            r1.f134638h = r2
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeString(r2)
            r1.f134635e = r2
            java.lang.Class<tf0.p1> r2 = tf0.C64916p1.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0030 }
            tf0.p1 r2 = (tf0.C64916p1) r2     // Catch:{ all -> 0x0030 }
            int r2 = r2.mo76703jw()     // Catch:{ all -> 0x0030 }
            r1.f134634d = r2     // Catch:{ all -> 0x0030 }
            goto L_0x0045
        L_0x0030:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "generateClientStatus e:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
        L_0x0045:
            r2 = 2
            int r2 = com.tencent.mars.cdn.CdnLogic.getRecentAverageSpeed(r2)
            r1.f134636f = r2
            java.util.LinkedList<te3.tj0> r2 = r1.f134637g
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r3 = f123946b
            r2.addAll(r3)
            java.util.LinkedList<te3.tj0> r2 = r1.f134649v
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r3 = f123948d
            r2.addAll(r3)
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r2 = f123949e
            java.util.Iterator r2 = r2.iterator()
        L_0x0060:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r2.next()
            te3.tj0 r3 = (te3.C64728tj0) r3
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r4 = f123948d
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008d
            java.lang.Object r5 = r4.next()
            r6 = r5
            te3.tj0 r6 = (te3.C64728tj0) r6
            long r6 = r6.f185579d
            long r8 = r3.f185579d
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0089
            r6 = 1
            goto L_0x008a
        L_0x0089:
            r6 = 0
        L_0x008a:
            if (r6 == 0) goto L_0x0072
            goto L_0x008e
        L_0x008d:
            r5 = 0
        L_0x008e:
            te3.tj0 r5 = (te3.C64728tj0) r5
            if (r5 == 0) goto L_0x0098
            java.util.LinkedList<te3.tj0> r3 = r1.f134652y
            r3.add(r5)
            goto L_0x0060
        L_0x0098:
            java.util.LinkedList<te3.tj0> r4 = r1.f134652y
            r4.add(r3)
            goto L_0x0060
        L_0x009e:
            java.util.LinkedList<java.lang.String> r2 = r1.f134642o
            java.lang.String r3 = "h264"
            r2.add(r3)
            java.lang.Class<rz.q> r2 = p682rz.C36594q.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.q r2 = (p682rz.C36594q) r2
            r3 = 4
            boolean r2 = r2.mo60733UY(r3)
            f123955k = r2
            if (r2 == 0) goto L_0x00bd
            java.util.LinkedList<java.lang.String> r2 = r1.f134642o
            java.lang.String r3 = "h265"
            r2.add(r3)
        L_0x00bd:
            boolean r2 = gr1.C59686x0.f170506a
            if (r2 == 0) goto L_0x00c8
            java.util.LinkedList<java.lang.String> r2 = r1.f134642o
            java.lang.String r3 = "h266"
            r2.add(r3)
        L_0x00c8:
            java.util.LinkedList<te3.r50> r2 = r1.f134647t
            java.util.concurrent.CopyOnWriteArrayList<te3.r50> r3 = f123950f
            r2.addAll(r3)
            java.util.LinkedList<te3.r50> r2 = r1.f134648u
            java.util.concurrent.CopyOnWriteArrayList<te3.r50> r3 = f123951g
            r2.addAll(r3)
            int r2 = r1.f134634d
            if (r2 != 0) goto L_0x00fd
            int r2 = r1.f134636f
            if (r2 != 0) goto L_0x00fd
            te3.hh0 r2 = f123952h
            if (r2 == 0) goto L_0x00fd
            gy3.C87412m.m108591d(r2)
            int r2 = r2.f134634d
            if (r2 == 0) goto L_0x00fd
            te3.hh0 r2 = f123952h
            gy3.C87412m.m108591d(r2)
            int r2 = r2.f134636f
            if (r2 == 0) goto L_0x00fd
            te3.hh0 r1 = f123952h
            gy3.C87412m.m108591d(r1)
            java.lang.String r2 = "generateClientStatus resume from cache."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            goto L_0x00ff
        L_0x00fd:
            f123952h = r1
        L_0x00ff:
            int r2 = r1.f134634d
            if (r2 != 0) goto L_0x0113
            ft1.a r3 = ft1.C59319a.f169618b
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            gr1.r0$b r9 = gr1.C45946r0.C45948b.f123956d
            r10 = 28
            r11 = 0
            java.lang.String r4 = "finder_nettype_error"
            o40.C11348f.C11349a.m11178b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0113:
            te3.gh0 r2 = new te3.gh0
            r2.<init>()
            int r3 = gr1.C59686x0.f170509d
            r2.f134048d = r3
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "power"
            java.lang.Object r3 = r3.getSystemService(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.os.PowerManager"
            gy3.C87412m.m108592e(r3, r4)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            boolean r3 = r3.isPowerSaveMode()
            r2.f134049e = r3
            r1.f134653z = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "generateClientStatus netType: "
            r2.append(r3)
            int r3 = r1.f134634d
            r2.append(r3)
            java.lang.String r3 = " bandwidthKbps:"
            r2.append(r3)
            int r3 = r1.f134636f
            r2.append(r3)
            java.lang.String r3 = " lastVideosDownloadInfo:"
            r2.append(r3)
            java.util.LinkedList<te3.tj0> r3 = r1.f134637g
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " last_preload_download_info:"
            r2.append(r3)
            java.util.LinkedList<te3.tj0> r3 = r1.f134649v
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " recent_finder_download_speed:"
            r2.append(r3)
            java.util.LinkedList<te3.r50> r3 = r1.f134647t
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " recent_wechat_download_speed:"
            r2.append(r3)
            java.util.LinkedList<te3.r50> r3 = r1.f134648u
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C45946r0.mo71349c():te3.hh0");
    }

    /* renamed from: d */
    public final void mo71350d() {
        C37521f.f99374d.getClass();
        long intValue = (long) C37521f.f99321W6.mo60266n().intValue();
        if (f123953i != null) {
            Log.m105924i("Finder.FinderNetworkStatusStatistic", "startRecordNetWorkStatus return for started.");
            return;
        }
        f123953i = new C45949c(intValue);
        if (intValue < 0) {
            Log.m105924i("Finder.FinderNetworkStatusStatistic", "startRecordNetWorkStatus return for delayMs:" + intValue);
            return;
        }
        Log.m105924i("Finder.FinderNetworkStatusStatistic", "startRecordNetWorkStatus delayMs:" + intValue + " recordNetworkStatusRunnable:" + f123953i);
        Runnable runnable = f123953i;
        if (runnable != null) {
            ((C119157j) C119157j.f356862d).mo183878i(runnable, intValue);
        }
    }
}
