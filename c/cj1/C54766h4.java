package cj1;

import b50.C54424j;
import com.tencent.p014mm.autogen.mmdata.rpt.LivePlayReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C58111e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.C64412h61;

/* renamed from: cj1.h4 */
public final class C54766h4 {

    /* renamed from: a */
    public static final C54766h4 f153491a = new C54766h4();

    /* renamed from: b */
    public static long f153492b;

    /* renamed from: c */
    public static int f153493c;

    /* renamed from: d */
    public static C64412h61 f153494d;

    /* renamed from: e */
    public static int f153495e;

    /* renamed from: f */
    public static final MTimerHandler f153496f = new MTimerHandler("FinderLiveReporterTimer", (MTimerHandler.CallBack) C54767a.f153497d, true);

    /* renamed from: cj1.h4$a */
    public static final class C54767a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public static final C54767a f153497d = new C54767a();

        public final boolean onTimerExpired() {
            C54766h4.f153491a.mo75670a(true);
            Log.m105924i("MicroMsg.FinderLiveReporter", "cleanClientStatus");
            synchronized (C54424j.f152652a) {
                C54424j.f152653b.clear();
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo75670a(boolean z) {
        LinkedList linkedList;
        boolean z2 = z;
        long currentTimeMillis = System.currentTimeMillis() - f153492b;
        synchronized (C54424j.f152652a) {
            linkedList = new LinkedList(C54424j.f152653b);
        }
        f153492b = System.currentTimeMillis();
        Log.m105924i("MicroMsg.FinderLiveReporter", "doLivePlayReport qosInfoQueue.size:" + linkedList.size() + " liveStarted:" + z2);
        if (!Util.isNullOrNil((List) linkedList)) {
            LivePlayReportStruct livePlayReportStruct = new LivePlayReportStruct();
            livePlayReportStruct.f156422L = currentTimeMillis / ((long) 1000);
            long j = 2;
            livePlayReportStruct.f156421K = 2;
            Iterator it = linkedList.iterator();
            while (true) {
                long j2 = 1;
                if (!it.hasNext()) {
                    break;
                }
                C58111e eVar = (C58111e) it.next();
                if (Util.isNullOrNil(livePlayReportStruct.f156426d)) {
                    livePlayReportStruct.f156426d = livePlayReportStruct.mo86045b("LiveId", String.valueOf(eVar.f166200a), true);
                }
                if (livePlayReportStruct.f156427e == 0) {
                    livePlayReportStruct.f156427e = (long) eVar.f166205f;
                }
                if (livePlayReportStruct.f156428f == 0) {
                    livePlayReportStruct.f156428f = (long) eVar.f166206g;
                }
                if (livePlayReportStruct.f156439q == 0) {
                    livePlayReportStruct.f156439q = (long) eVar.f166217r;
                }
                if (livePlayReportStruct.f156445w == 0) {
                    long j3 = (long) eVar.f166222w;
                    livePlayReportStruct.f156445w = j3;
                    livePlayReportStruct.mo86047d("LiveStartPlayTimeSec", j3);
                }
                if (livePlayReportStruct.f156411A == 0) {
                    livePlayReportStruct.f156411A = (long) eVar.f166191A;
                }
                if (Util.isNullOrNil(livePlayReportStruct.f156412B)) {
                    String str = eVar.f166192B;
                    if (str == null) {
                        str = "";
                    }
                    livePlayReportStruct.f156412B = livePlayReportStruct.mo86045b("CdnSvrIp", str, true);
                }
                if (livePlayReportStruct.f156413C == 0) {
                    livePlayReportStruct.f156413C = (long) eVar.f166193C;
                }
                if (livePlayReportStruct.f156425O == 0) {
                    int i = eVar.f166201b;
                    livePlayReportStruct.f156425O = i == 1 ? 1 : i == 0 ? j : 0;
                }
                livePlayReportStruct.f156424N = (long) eVar.f166204e;
                int i2 = eVar.f166202c;
                if (i2 != 1) {
                    j2 = i2 == 1 ? j : 0;
                }
                livePlayReportStruct.f156423M = j2;
                livePlayReportStruct.f156429g += (long) eVar.f166207h;
                livePlayReportStruct.f156430h += (long) eVar.f166208i;
                livePlayReportStruct.f156431i += (long) eVar.f166209j;
                livePlayReportStruct.f156432j += (long) eVar.f166210k;
                livePlayReportStruct.f156433k += (long) eVar.f166211l;
                livePlayReportStruct.f156436n += (long) eVar.f166214o;
                livePlayReportStruct.f156441s += (long) eVar.f166219t;
                long j4 = livePlayReportStruct.f156446x + ((long) eVar.f166223x);
                livePlayReportStruct.f156446x = j4;
                livePlayReportStruct.mo86046c("FirstFrameTimeMs", j4);
                livePlayReportStruct.f156447y += (long) eVar.f166224y;
                livePlayReportStruct.f156448z += (long) eVar.f166225z;
                livePlayReportStruct.f156414D = livePlayReportStruct.mo86045b("CpuUsageProcess", livePlayReportStruct.f156414D + ((long) eVar.f166194D), true);
                livePlayReportStruct.f156415E = livePlayReportStruct.mo86045b("CpuUsageDevice", livePlayReportStruct.f156415E + ((long) eVar.f166195E), true);
                livePlayReportStruct.f156434l = livePlayReportStruct.f156434l + ((long) eVar.f166212m);
                livePlayReportStruct.f156435m = livePlayReportStruct.f156435m + ((long) eVar.f166213n);
                livePlayReportStruct.f156437o = livePlayReportStruct.f156437o + ((long) eVar.f166215p);
                livePlayReportStruct.f156438p += (long) eVar.f166216q;
                long j5 = eVar.f166220u;
                livePlayReportStruct.f156442t = j5;
                livePlayReportStruct.mo86046c("TotalPlayTimeMs", j5);
                long j6 = livePlayReportStruct.f156443u + eVar.f166221v;
                livePlayReportStruct.f156443u = j6;
                livePlayReportStruct.mo86046c("TotalWaitTimeMs", j6);
                long j7 = livePlayReportStruct.f156440r;
                long j8 = (long) eVar.f166218s;
                if (j7 < j8) {
                    j7 = j8;
                }
                livePlayReportStruct.f156440r = j7;
                long j9 = livePlayReportStruct.f156431i;
                long j15 = (long) eVar.f166209j;
                int i3 = (j9 > j15 ? 1 : (j9 == j15 ? 0 : -1));
                livePlayReportStruct.f156417G = i3 < 0 ? j15 : j9;
                long j16 = livePlayReportStruct.f156432j;
                long j17 = (long) eVar.f166210k;
                int i4 = (j16 > j17 ? 1 : (j16 == j17 ? 0 : -1));
                livePlayReportStruct.f156419I = i4 < 0 ? j17 : j16;
                if (i3 > 0) {
                    j9 = j15;
                }
                livePlayReportStruct.f156418H = j9;
                if (i4 > 0) {
                    j16 = j17;
                }
                livePlayReportStruct.f156419I = j16;
                j = 2;
            }
            livePlayReportStruct.f156416F = (long) f153493c;
            livePlayReportStruct.f156429g = (long) (((float) livePlayReportStruct.f156429g) / ((float) linkedList.size()));
            livePlayReportStruct.f156430h = (long) (((float) livePlayReportStruct.f156430h) / ((float) linkedList.size()));
            livePlayReportStruct.f156431i = (long) (((float) livePlayReportStruct.f156431i) / ((float) linkedList.size()));
            livePlayReportStruct.f156432j = (long) (((float) livePlayReportStruct.f156432j) / ((float) linkedList.size()));
            livePlayReportStruct.f156433k = (long) (((float) livePlayReportStruct.f156433k) / ((float) linkedList.size()));
            livePlayReportStruct.f156436n = (long) (((float) livePlayReportStruct.f156436n) / ((float) linkedList.size()));
            livePlayReportStruct.f156441s = (long) (((float) livePlayReportStruct.f156441s) / ((float) linkedList.size()));
            long size = (long) (((float) livePlayReportStruct.f156446x) / ((float) linkedList.size()));
            livePlayReportStruct.f156446x = size;
            livePlayReportStruct.mo86046c("FirstFrameTimeMs", size);
            livePlayReportStruct.f156447y = (long) (((float) livePlayReportStruct.f156447y) / ((float) linkedList.size()));
            livePlayReportStruct.f156448z = (long) (((float) livePlayReportStruct.f156448z) / ((float) linkedList.size()));
            if (z2) {
                livePlayReportStruct.f156420J = 0;
            } else {
                livePlayReportStruct.f156420J = 1;
            }
            livePlayReportStruct.mo86054n();
            f153493c = 0;
        }
    }

    /* renamed from: b */
    public final void mo75671b() {
        f153493c++;
    }
}
