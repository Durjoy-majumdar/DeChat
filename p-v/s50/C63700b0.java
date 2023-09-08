package s50;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import u80.C111142d;
import u80.C111143e;

/* renamed from: s50.b0 */
public final class C63700b0 {

    /* renamed from: a */
    public int f180569a = 1;

    /* renamed from: b */
    public C111143e f180570b;

    /* renamed from: c */
    public C111142d f180571c;

    /* renamed from: d */
    public int f180572d = 2;

    /* renamed from: e */
    public int f180573e;

    /* renamed from: f */
    public int f180574f;

    /* renamed from: g */
    public int f180575g;

    /* renamed from: h */
    public MTimerHandler f180576h = new MTimerHandler("LiveVisitorRendererCounter", (MTimerHandler.CallBack) new C63701a(this), true);

    /* renamed from: i */
    public long f180577i;

    /* renamed from: s50.b0$a */
    public static final class C63701a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C63700b0 f180578d;

        public C63701a(C63700b0 b0Var) {
            this.f180578d = b0Var;
        }

        public final boolean onTimerExpired() {
            int i = this.f180578d.f180575g;
            if (i <= 5) {
                Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFpsLow");
                C115669n.INSTANCE.mo175913w(1383, 0, 1);
            } else if (i <= 10) {
                Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFpsMiddle");
                C115669n.INSTANCE.mo175913w(1383, 1, 1);
            } else if (i > 10) {
                Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFpsHigh");
                C115669n.INSTANCE.mo175913w(1383, 2, 1);
            }
            int i2 = this.f180578d.f180575g;
            Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFps value is " + i2);
            C115669n.INSTANCE.mo160138m((int) 1383, 3, 4, i2, false);
            this.f180578d.f180575g = 0;
            return true;
        }
    }

    public C63700b0(String str, int i) {
        C87412m.m108594g(str, "userId");
    }
}
