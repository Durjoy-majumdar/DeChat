package m80;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C85456b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import p1042u.C111055b;
import rx3.C13604l;
import sx3.C110818d0;
import w80.C90899c;

/* renamed from: m80.b */
public final class C34475b {

    /* renamed from: a */
    public final long f92788a;

    /* renamed from: b */
    public boolean f92789b;

    /* renamed from: c */
    public long f92790c = -1;

    /* renamed from: d */
    public long f92791d = -1;

    /* renamed from: e */
    public final C111055b<Long, Long> f92792e = new C111055b<>();

    /* renamed from: f */
    public final C111055b<Long, List<Long>> f92793f = new C111055b<>();

    /* renamed from: g */
    public final PriorityQueue<C13604l<Long, Integer>> f92794g;

    /* renamed from: h */
    public final List<Long> f92795h;

    /* renamed from: i */
    public int f92796i;

    /* renamed from: j */
    public int f92797j;

    /* renamed from: k */
    public double f92798k;

    /* renamed from: l */
    public double f92799l;

    /* renamed from: m */
    public final int f92800m;

    /* renamed from: m80.b$a */
    public static final class C34476a<T> implements Comparator {

        /* renamed from: d */
        public static final C34476a<T> f92801d = new C34476a<>();

        public int compare(Object obj, Object obj2) {
            return (int) (((Number) ((C13604l) obj).f38555d).longValue() - ((Number) ((C13604l) obj2).f38555d).longValue());
        }
    }

    public C34475b(String str, int i, long j, boolean z) {
        boolean z2;
        Class cls = C32735h.class;
        this.f92788a = j;
        this.f92789b = z;
        this.f92800m = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_remuxer_vfr_threshold, 10);
        double[] dArr = {0.0d, 0.0d, 0.0d};
        this.f92795h = C110818d0.m150942n0(C90899c.m114027a(str, dArr, Integer.MAX_VALUE));
        int i2 = (int) dArr[2];
        this.f92796i = i2;
        this.f92797j = i <= 0 ? i2 : i;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175912v(986, 114);
        C115669n nVar2 = nVar;
        nVar2.mo175913w(986, 115, (long) dArr[2]);
        nVar2.mo175913w(986, 116, (long) (dArr[1] - dArr[0]));
        int i3 = 0;
        while (true) {
            if (i3 >= 3) {
                z2 = true;
                break;
            }
            if (!(dArr[i3] > 0.0d)) {
                z2 = false;
                break;
            }
            i3++;
        }
        if (z2 && (!this.f92795h.isEmpty())) {
            this.f92791d = ((Number) C110818d0.m150923U(this.f92795h)).longValue();
        }
        this.f92798k = dArr[0];
        this.f92799l = dArr[1];
        this.f92794g = new PriorityQueue<>(Math.max(this.f92795h.size(), 11), C34476a.f92801d);
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_remuxer_decode_check_strategy, false);
        if (!WeChatEnvironment.hasDebugger() && !wf) {
            Log.m105924i("DecodeHelper", "use PassthroughDecodeStrategy");
            mo59602a(new C34479k());
        } else if (this.f92796i <= this.f92797j) {
            Log.m105924i("DecodeHelper", "use PassthroughDecodeStrategy");
            mo59602a(new C34479k());
        } else {
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_remuxer_vfr_max_process_frame_count, 3660);
            if (this.f92795h.size() > Qe && !C85456b.m105451d() && !C85456b.m105450c(false, this.f92789b)) {
                Log.m105924i("DecodeHelper", "use CfrDecodeStrategy");
                mo59602a(new C34474a());
            } else if (this.f92795h.size() <= Qe) {
                Log.m105924i("DecodeHelper", "use VfrDecodeStrategy");
                mo59602a(new C34481m());
            } else {
                Log.m105924i("DecodeHelper", "use SimpleVfrDecodeStrategy");
                mo59602a(new C34480l());
            }
        }
        Log.m105924i("DecodeHelper", "init decode helper, inFPS = " + this.f92796i + ", outFPS = " + this.f92797j + ", minFps:" + this.f92798k + ", maxFps:" + this.f92799l + ", vfrThreshold:" + this.f92800m + ", valid frames = " + this.f92792e.f332583f + ", lastPts:" + this.f92791d + ", frames.size:" + this.f92795h.size());
    }

    /* renamed from: a */
    public final void mo59602a(C34477c cVar) {
        C87412m.m108594g(cVar, "strategy");
        long currentTimeMillis = System.currentTimeMillis();
        cVar.mo59601a(this.f92788a, this.f92795h, this.f92796i, this.f92797j, this.f92792e, this.f92793f);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (cVar instanceof C34479k) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175912v(986, 105);
            nVar.mo175913w(986, 108, currentTimeMillis2);
        } else if (cVar instanceof C34474a) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo175912v(986, 107);
            nVar2.mo175913w(986, 112, currentTimeMillis2);
            C34474a aVar = (C34474a) cVar;
        } else if (cVar instanceof C34481m) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.mo175912v(986, 106);
            nVar3.mo175913w(986, 110, currentTimeMillis2);
        } else if (cVar instanceof C34480l) {
            C115669n nVar4 = C115669n.INSTANCE;
            nVar4.mo175912v(986, 149);
            nVar4.mo175913w(986, 150, currentTimeMillis2);
        }
        this.f92790c = -1;
    }
}
