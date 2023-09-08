package p212oe;

import android.content.Context;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import java.util.concurrent.atomic.AtomicReference;
import p1195ge.C116947b;
import p981ie.C87705i;

/* renamed from: oe.q$$v */
public final /* synthetic */ class q$$v implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f352259a;

    /* renamed from: b */
    public final /* synthetic */ C116947b.C116948a f352260b;

    /* renamed from: c */
    public final /* synthetic */ Context f352261c;

    public /* synthetic */ q$$v(AtomicReference atomicReference, C116947b.C116948a aVar, Context context) {
        this.f352259a = atomicReference;
        this.f352260b = aVar;
        this.f352261c = context;
    }

    public final void accept(Object obj) {
        C117774q.m166119b(this.f352259a, this.f352260b, this.f352261c, (CpuStatFeature) obj);
    }
}
