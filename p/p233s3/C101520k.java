package p233s3;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C64186f0;

/* renamed from: s3.k */
public class C101520k extends C101519j {

    /* renamed from: k */
    public static Handler f297245k;

    /* renamed from: f */
    public final Window f297246f;

    /* renamed from: g */
    public long f297247g;

    /* renamed from: h */
    public long f297248h;

    /* renamed from: i */
    public long f297249i;

    /* renamed from: j */
    public final Window.OnFrameMetricsAvailableListener f297250j;

    /* renamed from: s3.k$a */
    public static final class C101521a implements Window.OnFrameMetricsAvailableListener {

        /* renamed from: a */
        public final /* synthetic */ C101520k f297251a;

        /* renamed from: b */
        public final /* synthetic */ C101514g f297252b;

        public C101521a(C101520k kVar, C101514g gVar) {
            this.f297251a = kVar;
            this.f297252b = gVar;
        }

        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            C101520k kVar = this.f297251a;
            C87412m.m108593f(frameMetrics, "frameMetrics");
            long max = Math.max(kVar.mo141008e(frameMetrics), this.f297251a.f297249i);
            C101520k kVar2 = this.f297251a;
            if (max >= kVar2.f297248h && max != kVar2.f297247g) {
                C101514g gVar = this.f297252b;
                C101512e d = this.f297251a.mo141007d(max, (long) (((float) kVar2.mo141006c(frameMetrics)) * gVar.f297236d), frameMetrics);
                C87412m.m108594g(d, "frameData");
                gVar.f297233a.execute(new C101516h(gVar, d));
                this.f297251a.f297247g = max;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101520k(C101514g gVar, View view, Window window) {
        super(gVar, view);
        C87412m.m108594g(gVar, "jankStats");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(window, "window");
        this.f297246f = window;
        this.f297250j = new C101521a(this, gVar);
    }

    /* renamed from: a */
    public void mo141003a(boolean z) {
        List<Window.OnFrameMetricsAvailableListener> list;
        Window window = this.f297246f;
        if (!z) {
            Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.f297250j;
            C101506a aVar = (C101506a) window.getDecorView().getTag(C0966R.C0970id.mts);
            if (!(aVar == null || (list = aVar.f297217a) == null)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.remove(onFrameMetricsAvailableListener);
                if (arrayList.isEmpty()) {
                    window.removeOnFrameMetricsAvailableListener(aVar);
                    window.getDecorView().setTag(C0966R.C0970id.mts, (Object) null);
                }
                aVar.f297217a = arrayList;
            }
            this.f297248h = 0;
        } else if (this.f297248h == 0) {
            C101506a aVar2 = (C101506a) window.getDecorView().getTag(C0966R.C0970id.mts);
            if (aVar2 == null) {
                C101506a aVar3 = new C101506a(new ArrayList());
                if (f297245k == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    handlerThread.start();
                    f297245k = new Handler(handlerThread.getLooper());
                }
                window.addOnFrameMetricsAvailableListener(aVar3, f297245k);
                window.getDecorView().setTag(C0966R.C0970id.mts, aVar3);
                aVar2 = aVar3;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(aVar2.f297217a);
            arrayList2.add(this.f297250j);
            aVar2.f297217a = arrayList2;
            this.f297248h = System.nanoTime();
        }
    }

    /* renamed from: c */
    public long mo141006c(FrameMetrics frameMetrics) {
        C87412m.m108594g(frameMetrics, "metrics");
        return C101507b.f297218h.mo140997a(this.f297239b.get());
    }

    /* renamed from: d */
    public C101512e mo141007d(long j, long j2, FrameMetrics frameMetrics) {
        long j3 = j;
        FrameMetrics frameMetrics2 = frameMetrics;
        C87412m.m108594g(frameMetrics2, "frameMetrics");
        long metric = frameMetrics2.getMetric(0) + frameMetrics2.getMetric(1) + frameMetrics2.getMetric(2) + frameMetrics2.getMetric(3) + frameMetrics2.getMetric(4) + frameMetrics2.getMetric(5);
        long j4 = j3 + metric;
        this.f297249i = j4;
        C101526p pVar = this.f297241d.f297258a;
        return new C101512e(j, metric, frameMetrics2.getMetric(6) + metric + frameMetrics2.getMetric(7), metric > j2, pVar != null ? pVar.mo141012c(j3, j4) : C64186f0.f181907d);
    }

    /* renamed from: e */
    public long mo141008e(FrameMetrics frameMetrics) {
        C87412m.m108594g(frameMetrics, "frameMetrics");
        Object obj = C101507b.f297219i.get(this.f297240c);
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }
}
