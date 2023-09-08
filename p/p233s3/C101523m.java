package p233s3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import gy3.C87412m;
import sx3.C64186f0;

/* renamed from: s3.m */
public final class C101523m extends C101522l {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101523m(C101514g gVar, View view, Window window) {
        super(gVar, view, window);
        C87412m.m108594g(gVar, "jankStats");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(window, "window");
    }

    /* renamed from: c */
    public long mo141006c(FrameMetrics frameMetrics) {
        C87412m.m108594g(frameMetrics, "metrics");
        return frameMetrics.getMetric(13);
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
        return new C101513f(j, metric, frameMetrics2.getMetric(6) + metric + frameMetrics2.getMetric(7), frameMetrics2.getMetric(8) - frameMetrics2.getMetric(13), metric > j2, pVar != null ? pVar.mo141012c(j3, j4) : C64186f0.f181907d);
    }
}
