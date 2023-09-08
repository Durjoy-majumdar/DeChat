package ks2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64175a0;
import z04.C112550d0;
import z04.C91602g0;

/* renamed from: ks2.f */
public final class C99181f {

    /* renamed from: a */
    public static final C99181f f290857a = new C99181f();

    /* renamed from: b */
    public static final ConcurrentLinkedDeque<C99178a> f290858b = new ConcurrentLinkedDeque<>();

    /* renamed from: c */
    public static final Object f290859c = new Object();

    /* renamed from: d */
    public static String f290860d = "";

    /* renamed from: e */
    public static final Object f290861e = new Object();

    /* renamed from: f */
    public static int f290862f = -1;

    /* renamed from: ks2.f$a */
    public static final class C99182a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f290863d;

        /* renamed from: e */
        public final /* synthetic */ int f290864e;

        /* renamed from: f */
        public final /* synthetic */ int f290865f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99182a(String str, int i, int i2) {
            super(0);
            this.f290863d = str;
            this.f290864e = i;
            this.f290865f = i2;
        }

        public Object invoke() {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$callbackToUI$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$callbackToUI$1");
            Object d = C99181f.m129202d();
            String str3 = this.f290863d;
            int i = this.f290864e;
            int i2 = this.f290865f;
            synchronized (d) {
                try {
                    C99181f fVar = C99181f.f290857a;
                    C99178a b = C99181f.m129200b(fVar, str3);
                    if (b != null) {
                        C99181f.m129205g(fVar, b, C99179b.CallbackToUI);
                        SnsMethodCalculate.markStartTimeMs("getCallbackUIQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                        C61156c cVar = b.f290832l;
                        SnsMethodCalculate.markEndTimeMs("getCallbackUIQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                        cVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("setPendingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                        cVar.f174104a = i;
                        SnsMethodCalculate.markEndTimeMs("setPendingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                        SnsMethodCalculate.markStartTimeMs("getCallbackUIQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                        C61156c cVar2 = b.f290832l;
                        SnsMethodCalculate.markEndTimeMs("getCallbackUIQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                        cVar2.getClass();
                        SnsMethodCalculate.markStartTimeMs("setDownloadingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                        cVar2.f174105b = i2;
                        SnsMethodCalculate.markEndTimeMs("setDownloadingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                        Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "callbackToUI:" + str3 + ", pendingListSize:" + i + ", downloadingQueueSize:" + i2);
                        C13598b0 b0Var = C13598b0.f38549a;
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$callbackToUI$1");
                    }
                } finally {
                    str = "invoke";
                    str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$callbackToUI$1";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$callbackToUI$1");
            return b0Var2;
        }
    }

    /* renamed from: ks2.f$b */
    public static final class C99183b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f290866d;

        /* renamed from: e */
        public final /* synthetic */ int f290867e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99183b(String str, int i) {
            super(0);
            this.f290866d = str;
            this.f290867e = i;
        }

        public Object invoke() {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFinished$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFinished$1");
            Object d = C99181f.m129202d();
            String str3 = this.f290866d;
            int i = this.f290867e;
            synchronized (d) {
                try {
                    C99181f fVar = C99181f.f290857a;
                    C99178a b = C99181f.m129200b(fVar, str3);
                    if (b != null) {
                        C99181f.m129205g(fVar, b, C99179b.CdnDownloadFinished);
                        SnsMethodCalculate.markStartTimeMs("setCdnRetCode", "com.tencent.mm.plugin.sns.report.Data");
                        b.f290827g = i;
                        SnsMethodCalculate.markEndTimeMs("setCdnRetCode", "com.tencent.mm.plugin.sns.report.Data");
                        Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "downloadFinished:" + str3 + ", retCode:" + i);
                        C13598b0 b0Var = C13598b0.f38549a;
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFinished$1");
                    }
                } finally {
                    str = "invoke";
                    str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFinished$1";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFinished$1");
            return b0Var2;
        }
    }

    /* renamed from: ks2.f$c */
    public static final class C99184c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f290868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99184c(String str) {
            super(0);
            this.f290868d = str;
        }

        public Object invoke() {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$loadHitCache$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$loadHitCache$1");
            Object d = C99181f.m129202d();
            String str3 = this.f290868d;
            synchronized (d) {
                try {
                    C99181f fVar = C99181f.f290857a;
                    C99178a b = C99181f.m129200b(fVar, str3);
                    if (b != null) {
                        C99181f.m129205g(fVar, b, C99179b.HitCache);
                        Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "loadHitCache data:" + b);
                        C13598b0 b0Var = C13598b0.f38549a;
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$loadHitCache$1");
                    }
                } finally {
                    str = "invoke";
                    str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$loadHitCache$1";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$loadHitCache$1");
            return b0Var2;
        }
    }

    /* renamed from: ks2.f$d */
    public static final class C99185d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f290869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99185d(String str) {
            super(0);
            this.f290869d = str;
        }

        public Object invoke() {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2");
            Object d = C99181f.m129202d();
            String str3 = this.f290869d;
            synchronized (d) {
                try {
                    C99181f fVar = C99181f.f290857a;
                    C99178a b = C99181f.m129200b(fVar, str3);
                    if (b != null) {
                        C99181f.m129205g(fVar, b, C99179b.ShowBitmapSuccess);
                        C99181f.m129204f(fVar, b);
                        C64175a0.m75511s(C99181f.m129203e(), new C99201u(b));
                        C13598b0 b0Var = C13598b0.f38549a;
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2");
                    }
                } finally {
                    str = "invoke";
                    str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2");
            return b0Var2;
        }
    }

    /* renamed from: ks2.f$e */
    public static final class C99186e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f290870d;

        /* renamed from: e */
        public final /* synthetic */ int f290871e;

        /* renamed from: f */
        public final /* synthetic */ String f290872f;

        /* renamed from: g */
        public final /* synthetic */ boolean f290873g;

        /* renamed from: h */
        public final /* synthetic */ String f290874h;

        /* renamed from: i */
        public final /* synthetic */ boolean f290875i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99186e(String str, int i, String str2, boolean z, String str3, boolean z2) {
            super(0);
            this.f290870d = str;
            this.f290871e = i;
            this.f290872f = str2;
            this.f290873g = z;
            this.f290874h = str3;
            this.f290875i = z2;
        }

        public Object invoke() {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
            Object d = C99181f.m129202d();
            String str3 = this.f290870d;
            int i = this.f290871e;
            String str4 = this.f290872f;
            boolean z = this.f290873g;
            String str5 = this.f290874h;
            boolean z2 = this.f290875i;
            synchronized (d) {
                try {
                    C99181f fVar = C99181f.f290857a;
                    SnsMethodCalculate.markStartTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    boolean i2 = fVar.mo138549i();
                    SnsMethodCalculate.markEndTimeMs("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    if (i2) {
                        SnsMethodCalculate.markStartTimeMs("access$getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        C99178a l = fVar.mo138551l(str3);
                        SnsMethodCalculate.markEndTimeMs("access$getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        if (l != null) {
                            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                        } else {
                            C99178a aVar = r3;
                            C99178a aVar2 = new C99178a(str3, i, str4, z, C99179b.Unknown, str5);
                            if (C99181f.m129203e().contains(l)) {
                                Log.m105928w("MicroMsg.Image.SnsImageLoadReporter", "startLoad already contain snsid:" + str5 + " mediaId:" + str3);
                                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                            } else {
                                SnsMethodCalculate.markStartTimeMs("setAd", "com.tencent.mm.plugin.sns.report.Data");
                                aVar.f290829i = z2;
                                SnsMethodCalculate.markEndTimeMs("setAd", "com.tencent.mm.plugin.sns.report.Data");
                                long currentTicks = Util.currentTicks();
                                SnsMethodCalculate.markStartTimeMs("setStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
                                aVar.f290835o = currentTicks;
                                SnsMethodCalculate.markEndTimeMs("setStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
                                SnsMethodCalculate.markStartTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                                String str6 = C99181f.f290860d;
                                SnsMethodCalculate.markEndTimeMs("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                                SnsMethodCalculate.markStartTimeMs("setSession", "com.tencent.mm.plugin.sns.report.Data");
                                C87412m.m108594g(str6, "<set-?>");
                                aVar.f290836p = str6;
                                SnsMethodCalculate.markEndTimeMs("setSession", "com.tencent.mm.plugin.sns.report.Data");
                                C99181f.m129203e().add(aVar);
                                Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "startLoad snsId:" + str5 + ", mediaId:" + str3 + ", requestType:" + i + ", fromScene:" + str4 + ", isBatchDownload:" + z + ", isAd:" + z2 + ", reportDataList.size:" + C99181f.m129203e().size());
                                C13598b0 b0Var = C13598b0.f38549a;
                                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
                            }
                        }
                    }
                } finally {
                    str = "invoke";
                    str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startLoad$1");
            return b0Var2;
        }
    }

    /* renamed from: a */
    public static final void m129199a(C99181f fVar, boolean z) {
        ConcurrentLinkedDeque<C99178a> concurrentLinkedDeque;
        SnsMethodCalculate.markStartTimeMs("access$checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        fVar.getClass();
        SnsMethodCalculate.markStartTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        ConcurrentLinkedDeque<C99178a> concurrentLinkedDeque2 = f290858b;
        if (concurrentLinkedDeque2.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        } else {
            long currentTicks = Util.currentTicks();
            int max = Math.max(50, concurrentLinkedDeque2.size());
            Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "checkFlushReport, size:" + concurrentLinkedDeque2.size() + ", limit:" + max);
            if (concurrentLinkedDeque2.size() > max) {
                SnsMethodCalculate.markEndTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            } else {
                do {
                    concurrentLinkedDeque = f290858b;
                    C99178a aVar = (C99178a) C110818d0.m150915M(concurrentLinkedDeque);
                    concurrentLinkedDeque.removeFirst();
                    if (aVar != null) {
                        if (z) {
                            fVar.mo138553q(aVar, C99179b.LoadCancelByExit);
                        }
                        fVar.mo138552n(aVar);
                    }
                } while (concurrentLinkedDeque.size() > 0);
                Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "checkFlushReport cost:" + Util.ticksToNow(currentTicks));
                SnsMethodCalculate.markEndTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: b */
    public static final C99178a m129200b(C99181f fVar, String str) {
        String str2;
        String str3;
        C99178a aVar;
        SnsMethodCalculate.markStartTimeMs("access$checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        fVar.getClass();
        SnsMethodCalculate.markStartTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f290859c) {
            try {
                C99181f fVar2 = f290857a;
                aVar = null;
                if (fVar2.mo138549i()) {
                    C99178a l = fVar2.mo138551l(str);
                    if (l == null) {
                        if (C112550d0.m153803w(str, "_", false, 2, (Object) null)) {
                            Iterator it = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null).iterator();
                            if (it.hasNext()) {
                                aVar = fVar2.mo138551l((String) it.next());
                                SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        aVar = l;
                    }
                }
            } finally {
                str2 = "checkReportData";
                str3 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static final void m129201c(C99181f fVar) {
        SnsMethodCalculate.markStartTimeMs("access$endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        fVar.getClass();
        SnsMethodCalculate.markStartTimeMs("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f290861e) {
            try {
                Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "endSession:" + f290860d);
                f290860d = "";
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th) {
                SnsMethodCalculate.markEndTimeMs("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                throw th;
            }
        }
        SnsMethodCalculate.markEndTimeMs("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        SnsMethodCalculate.markEndTimeMs("access$endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: d */
    public static final /* synthetic */ Object m129202d() {
        SnsMethodCalculate.markStartTimeMs("access$getDataListLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        Object obj = f290859c;
        SnsMethodCalculate.markEndTimeMs("access$getDataListLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return obj;
    }

    /* renamed from: e */
    public static final /* synthetic */ ConcurrentLinkedDeque m129203e() {
        SnsMethodCalculate.markStartTimeMs("access$getReportDataList$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        ConcurrentLinkedDeque<C99178a> concurrentLinkedDeque = f290858b;
        SnsMethodCalculate.markEndTimeMs("access$getReportDataList$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return concurrentLinkedDeque;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m129204f(C99181f fVar, C99178a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$reportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        fVar.mo138552n(aVar);
        SnsMethodCalculate.markEndTimeMs("access$reportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: g */
    public static final /* synthetic */ void m129205g(C99181f fVar, C99178a aVar, C99179b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        fVar.mo138553q(aVar, bVar);
        SnsMethodCalculate.markEndTimeMs("access$updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: h */
    public static final void m129206h(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("callbackToUI", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C87412m.m108594g(str, "mediaId");
        C61926c.m72661F("SnsImageLoadReporter", new C99182a(str, i, i2));
        SnsMethodCalculate.markEndTimeMs("callbackToUI", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: j */
    public static final void m129207j(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("downloadFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C87412m.m108594g(str, "mediaId");
        C61926c.m72661F("SnsImageLoadReporter", new C99183b(str, i));
        SnsMethodCalculate.markEndTimeMs("downloadFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: m */
    public static final void m129208m(String str) {
        SnsMethodCalculate.markStartTimeMs("loadHitCache", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C87412m.m108594g(str, "mediaId");
        C61926c.m72661F("SnsImageLoadReporter", new C99184c(str));
        SnsMethodCalculate.markEndTimeMs("loadHitCache", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: o */
    public static final void m129209o(String str) {
        SnsMethodCalculate.markStartTimeMs("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "showBitmapSuccess media:" + str);
        C61926c.m72661F("SnsImageLoadReporter", new C99185d(str));
        SnsMethodCalculate.markEndTimeMs("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: p */
    public static final void m129210p(String str, String str2, int i, String str3, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C87412m.m108594g(str2, "mediaId");
        C87412m.m108594g(str3, "fromScene");
        C61926c.m72661F("SnsImageLoadReporter", new C99186e(str2, i, str3, z, str, z2));
        SnsMethodCalculate.markEndTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    /* renamed from: i */
    public final boolean mo138549i() {
        String str;
        String str2;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f290861e) {
            try {
                z = f290860d.length() > 0;
            } finally {
                str = "checkSessionValid";
                str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter";
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        }
        return z;
    }

    /* renamed from: k */
    public final String mo138550k(String str) {
        SnsMethodCalculate.markStartTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        if (str == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            return "";
        } else if (str.length() <= 2) {
            SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(C91602g0.m114943k0(str));
            sb.append('*');
            sb.append(str.length());
            sb.append('*');
            sb.append(C91602g0.m114945m0(str));
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            return sb4;
        }
    }

    /* renamed from: l */
    public final C99178a mo138551l(String str) {
        T t;
        SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        Iterator<T> it = f290858b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C99178a) t).mo138544a(), str)) {
                break;
            }
        }
        C99178a aVar = (C99178a) t;
        SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r3 == 0) goto L_0x004c;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138552n(ks2.C99178a r15) {
        /*
            r14 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r1 = "reportData"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            di3.d r3 = di3.C86312j.m106911c(r0)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_sns_image_report_normal
            r5 = 0
            boolean r3 = r3.mo58784wf(r4, r5)
            java.lang.String r4 = "getCdnRetCode"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.report.Data"
            java.lang.String r6 = "MicroMsg.Image.SnsImageLoadReporter"
            if (r3 != 0) goto L_0x0056
            ks2.b r3 = r15.mo138545b()
            ks2.b r7 = ks2.C99179b.ShowBitmapSuccess
            if (r3 == r7) goto L_0x0037
            ks2.b r3 = r15.mo138545b()
            ks2.b r7 = ks2.C99179b.ShowBitmapFailButDownloadSuccess
            if (r3 == r7) goto L_0x0037
            ks2.b r3 = r15.mo138545b()
            ks2.b r7 = ks2.C99179b.LoadCancelByFling
            if (r3 != r7) goto L_0x0056
        L_0x0037:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r3 = r15.f290827g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r7 = -1
            if (r3 == r7) goto L_0x004c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r3 = r15.f290827g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r3 != 0) goto L_0x0056
        L_0x004c:
            java.lang.String r15 = "not enable image report1."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x0056:
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_sns_image_report_control
            r7 = 1
            boolean r0 = r0.mo58784wf(r3, r7)
            if (r0 != 0) goto L_0x006f
            java.lang.String r15 = "not enable image report2."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x006f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "reportData size:"
            r0.append(r3)
            java.util.concurrent.ConcurrentLinkedDeque<ks2.a> r3 = f290858b
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r3 = " info:"
            r0.append(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.autogen.mmdata.rpt.AndroidSnsImageLoadStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.AndroidSnsImageLoadStruct
            r0.<init>()
            r15.getClass()
            java.lang.String r3 = "getSnsId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.String r6 = r15.f290826f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0145
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.String r8 = r15.f290826f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r6.mo139807TE(r8)
            if (r6 == 0) goto L_0x0145
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.String r9 = r15.f290826f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = "snsId"
            r8.put(r3, r9)
            ks2.f r3 = f290857a
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r6.getTimeLine()
            java.lang.String r10 = r10.UserName
            com.tencent.mm.storage.z1 r9 = r9.get(r10)
            if (r9 == 0) goto L_0x00ee
            java.lang.String r9 = r9.mo62909j3()
            goto L_0x00ef
        L_0x00ee:
            r9 = 0
        L_0x00ef:
            java.lang.String r9 = r3.mo138550k(r9)
            java.lang.String r10 = "nickName"
            r8.put(r10, r9)
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r6.getTimeLine()
            java.lang.String r9 = r9.ContentDesc
            java.lang.String r3 = r3.mo138550k(r9)
            java.lang.String r9 = "content"
            r8.put(r9, r3)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r9 = "dd/MM/yyyy HH:mm:ss"
            r3.<init>(r9)
            java.util.Date r9 = new java.util.Date
            int r10 = r6.getCreateTime()
            long r10 = (long) r10
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            r9.<init>(r10)
            java.lang.String r3 = r3.format(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r9 = "time"
            r8.put(r9, r3)
            int r3 = r6.field_type
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "bizName"
            java.lang.String r3 = r0.mo86045b(r6, r3, r7)
            r0.f265318t = r3
            java.lang.String r3 = ks2.C61157y.m71719a(r8)
            java.lang.String r6 = "feedInfo"
            java.lang.String r3 = r0.mo86045b(r6, r3, r7)
            r0.f265317s = r3
        L_0x0145:
            int r3 = f290862f
            r0.f265316r = r3
            java.lang.String r3 = "getSession"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.String r6 = r15.f290836p
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = "SessionID"
            java.lang.String r3 = r0.mo86045b(r3, r6, r7)
            r0.f265302d = r3
            java.lang.String r3 = r15.mo138544a()
            java.lang.String r6 = "MediaID"
            java.lang.String r3 = r0.mo86045b(r6, r3, r7)
            r0.f265303e = r3
            java.lang.String r3 = "getRequestType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            int r6 = r15.f290822b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            r0.f265304f = r6
            java.lang.String r3 = "getFromScene"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.String r6 = r15.f290823c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = "FromScene"
            java.lang.String r3 = r0.mo86045b(r3, r6, r7)
            r0.f265305g = r3
            java.lang.String r3 = "isBatchDownload"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            boolean r6 = r15.f290824d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            r0.f265306h = r6
            ks2.b r3 = r15.mo138545b()
            int r3 = r3.ordinal()
            r0.f265307i = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r3 = r15.f290827g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r0.f265308j = r3
            java.lang.String r3 = "getStageCost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            org.json.JSONObject r4 = r15.f290828h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = ks2.C61157y.m71719a(r4)
            java.lang.String r4 = "stageCost"
            java.lang.String r3 = r0.mo86045b(r4, r3, r7)
            r0.f265309k = r3
            java.lang.String r3 = "isAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            boolean r4 = r15.f290829i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            r0.f265310l = r4
            java.lang.String r3 = "getEnqueueQueueSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            ks2.c r4 = r15.f290830j
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = r4.mo86098b()
            java.lang.String r4 = "enqueueQueueSize"
            java.lang.String r3 = r0.mo86045b(r4, r3, r7)
            r0.f265311m = r3
            java.lang.String r3 = "getStartDownloadQueueSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            ks2.c r4 = r15.f290831k
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = r4.mo86098b()
            java.lang.String r4 = "startDownloadQueueSize"
            java.lang.String r3 = r0.mo86045b(r4, r3, r7)
            r0.f265312n = r3
            java.lang.String r3 = "getCallbackUIQueueSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            ks2.c r4 = r15.f290832l
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = r4.mo86098b()
            java.lang.String r4 = "callbackUIQueueSize"
            java.lang.String r3 = r0.mo86045b(r4, r3, r7)
            r0.f265313o = r3
            java.lang.String r3 = "getStartImageLoaderQueueSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            ks2.c r4 = r15.f290833m
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            int r3 = r4.mo86097a()
            r0.f265314p = r3
            java.lang.String r3 = "getFinishedImageLoaderQueueSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            ks2.c r15 = r15.f290834n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            int r15 = r15.mo86097a()
            r0.f265315q = r15
            r0.mo86054n()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ks2.C99181f.mo138552n(ks2.a):void");
    }

    /* renamed from: q */
    public final void mo138553q(C99178a aVar, C99179b bVar) {
        SnsMethodCalculate.markStartTimeMs("updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        if (aVar.mo138545b() != bVar) {
            long currentTicks = Util.currentTicks();
            SnsMethodCalculate.markStartTimeMs("getStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
            long j = aVar.f290835o;
            SnsMethodCalculate.markEndTimeMs("getStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
            long j2 = currentTicks - j;
            SnsMethodCalculate.markStartTimeMs("setStage", "com.tencent.mm.plugin.sns.report.Data");
            C87412m.m108594g(bVar, "<set-?>");
            aVar.f290825e = bVar;
            SnsMethodCalculate.markEndTimeMs("setStage", "com.tencent.mm.plugin.sns.report.Data");
            SnsMethodCalculate.markStartTimeMs("getStageCost", "com.tencent.mm.plugin.sns.report.Data");
            JSONObject jSONObject = aVar.f290828h;
            SnsMethodCalculate.markEndTimeMs("getStageCost", "com.tencent.mm.plugin.sns.report.Data");
            jSONObject.put(bVar.toString(), j2);
            Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "media:" + aVar.mo138544a() + " updateStageCost:" + bVar);
        }
        SnsMethodCalculate.markEndTimeMs("updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }
}
