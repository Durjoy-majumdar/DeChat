package com.tencent.p014mm.plugin.report.service;

import android.view.FrameMetrics;
import com.tencent.p014mm.plugin.report.service.C70998a;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import p221qf.C89641d;

/* renamed from: com.tencent.mm.plugin.report.service.b */
public final class C71000b implements C89641d {

    /* renamed from: a */
    public int f205474a;

    /* renamed from: b */
    public final /* synthetic */ C70998a f205475b;

    public C71000b(C70998a aVar) {
        this.f205475b = aVar;
    }

    /* renamed from: a */
    public void mo97647a(String str, FrameMetrics frameMetrics, float f, float f2) {
        C87412m.m108594g(str, "sceneName");
        C87412m.m108594g(frameMetrics, "frameMetrics");
        int ordinal = this.f205475b.f205467e.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (this.f205474a > 0) {
                    System.currentTimeMillis();
                    long j = this.f205475b.f205468f;
                    this.f205474a = 0;
                }
                C70998a aVar = this.f205475b;
                C70998a.C70999a aVar2 = C70998a.C70999a.STOPPED;
                aVar.getClass();
                aVar.f205467e = aVar2;
            }
        } else if (frameMetrics.getMetric(8) >= 200000000) {
            TimeUnit.SECONDS.toNanos(1);
            this.f205474a++;
        }
    }
}
