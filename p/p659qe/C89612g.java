package p659qe;

import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner;
import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import rx3.C13598b0;

/* renamed from: qe.g */
public final class C89612g {

    /* renamed from: a */
    public final C35836o f257805a;

    /* renamed from: b */
    public final C35836o f257806b;

    /* renamed from: c */
    public final boolean f257807c;

    /* renamed from: d */
    public final IBackgroundStatefulOwner f257808d;

    /* renamed from: e */
    public final long f257809e;

    /* renamed from: f */
    public final C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> f257810f;

    /* renamed from: g */
    public final C32224a<MemInfo[]> f257811g;

    public C89612g() {
        this(false, (IBackgroundStatefulOwner) null, 0, 0, 0, 0, (C32229r) null, (C32224a) null, 255, (C8480h) null);
    }

    public C89612g(boolean z, IBackgroundStatefulOwner iBackgroundStatefulOwner, long j, long j2, long j3, int i, C32229r rVar, C32224a aVar, int i2, C8480h hVar) {
        int i3 = i2;
        boolean z2 = (i3 & 1) != 0 ? true : z;
        IBackgroundStatefulOwner iBackgroundStatefulOwner2 = (i3 & 2) != 0 ? AppStagedBackgroundOwner.INSTANCE : iBackgroundStatefulOwner;
        long millis = (i3 & 4) != 0 ? TimeUnit.MINUTES.toMillis(3) : j;
        int i4 = i3 & 8;
        long j4 = MAlarmHandler.NEXT_FIRE_INTERVAL;
        long j5 = i4 != 0 ? Long.MAX_VALUE : j2;
        j4 = (i3 & 16) == 0 ? j3 : j4;
        int i5 = (i3 & 32) != 0 ? 3 : i;
        C32229r rVar2 = (i3 & 64) != 0 ? C89610e.f257803d : rVar;
        C32224a aVar2 = (i3 & 128) != 0 ? C89611f.f257804d : aVar;
        C87412m.m108594g(iBackgroundStatefulOwner2, "bgStatefulOwner");
        C87412m.m108594g(rVar2, "callback");
        C87412m.m108594g(aVar2, "extraPssFactory");
        this.f257807c = z2;
        this.f257808d = iBackgroundStatefulOwner2;
        this.f257809e = millis;
        this.f257810f = rVar2;
        this.f257811g = aVar2;
        this.f257805a = new C35836o(j5, i5, TimeUnit.MINUTES.toMillis(5));
        this.f257806b = new C35836o(j4, i5, 0);
    }

    public String toString() {
        return "AppBgSumPssMonitorConfig(enable=" + this.f257807c + ", bgStatefulOwner=" + this.f257808d + ", checkInterval=" + this.f257809e + ", callback=" + this.f257810f.getClass().getName() + ", thresholdKB=" + this.f257805a + ", extraPssFactory=" + this.f257811g.getClass().getName() + ')';
    }
}
