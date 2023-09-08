package mr1;

import cm1.C55015f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import e03.C58469b;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C25026b;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: mr1.m */
public final class C25044m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b f71474d;

    /* renamed from: e */
    public final /* synthetic */ String f71475e;

    /* renamed from: f */
    public final /* synthetic */ long f71476f;

    /* renamed from: g */
    public final /* synthetic */ C55015f1 f71477g;

    /* renamed from: h */
    public final /* synthetic */ boolean f71478h;

    /* renamed from: i */
    public final /* synthetic */ C58469b f71479i;

    /* renamed from: j */
    public final /* synthetic */ long f71480j;

    /* renamed from: n */
    public final /* synthetic */ C25026b.C25032b f71481n;

    /* renamed from: o */
    public final /* synthetic */ long f71482o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25044m(C25026b bVar, String str, long j, C55015f1 f1Var, boolean z, C58469b bVar2, long j2, C25026b.C25032b bVar3, long j3) {
        super(0);
        this.f71474d = bVar;
        this.f71475e = str;
        this.f71476f = j;
        this.f71477g = f1Var;
        this.f71478h = z;
        this.f71479i = bVar2;
        this.f71480j = j2;
        this.f71481n = bVar3;
        this.f71482o = j3;
    }

    public Object invoke() {
        C25026b bVar = this.f71474d;
        String str = this.f71475e;
        long j = this.f71476f;
        C55015f1 f1Var = this.f71477g;
        C25026b.C25027a aVar = bVar.f71361b.get(str);
        C13598b0 b0Var = null;
        if (aVar != null) {
            if (j > 0) {
                aVar.f71394g = j;
                aVar.f71393f = j / ((long) 1000);
            }
            aVar.f71372E = true;
            C25026b.C25027a.f71367U.mo52139d(aVar, f1Var);
            Log.m105924i("FinderNetworkFlowReport", "PRERENDER_stopPreRenderForStartPlay " + aVar.f71384Q + ' ' + str + " item:" + aVar);
        } else {
            aVar = null;
        }
        C25026b.C25029d dVar = this.f71474d.f71362c.get(this.f71475e);
        if (dVar != null) {
            boolean z = this.f71478h;
            String str2 = this.f71475e;
            C25026b bVar2 = this.f71474d;
            C58469b bVar3 = this.f71479i;
            long j2 = this.f71480j;
            C55015f1 f1Var2 = this.f71477g;
            C25026b.C25032b bVar4 = this.f71481n;
            long j3 = this.f71482o;
            boolean z2 = (dVar.f71419f.isEmpty() ^ true) && !((C25026b.C25027a) C110818d0.m150923U(dVar.f71419f)).f71368A;
            if (z && z2) {
                C25026b.C25027a aVar2 = (C25026b.C25027a) C110818d0.m150923U(dVar.f71419f);
                if (z && aVar2.f71382O > 0) {
                    aVar2.f71383P += C31543z5.m39451a() - aVar2.f71382O;
                    aVar2.f71382O = 0;
                }
                Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerStart " + str2 + " isManualStart item " + dVar);
            } else if (!dVar.f71414a || dVar.f71416c) {
                Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerStart " + str2 + " invalid item " + dVar);
            } else if (dVar.f71415b || dVar.f71419f.size() != 1) {
                String str3 = bVar2.mo52127d((long) bVar3.f167445a) + ' ' + bVar3.f167450f + ' ' + str2;
                C25026b.C25027a.C25028a aVar3 = C25026b.C25027a.f71367U;
                C25026b.C25027a a = aVar3.mo52136a(j2, str2, bVar3);
                a.f71413z = true;
                a.f71405r = C31543z5.m39451a();
                C87412m.m108594g(str3, "<set-?>");
                a.f71384Q = str3;
                a.f71412y = (long) dVar.f71419f.size();
                if (aVar != null) {
                    dVar.f71418e = false;
                    a.f71386S = aVar;
                    if (((int) aVar.f71388a) == 5) {
                        a.f71369B = true;
                        a.f71370C = false;
                    }
                    aVar3.mo52138c(a, f1Var2);
                    Log.m105924i("FinderNetworkFlowReport", "PLAY_onPlayerStart#hasPreRender " + str3 + ' ' + a);
                } else if (bVar4 != null) {
                    bVar4.mo52144a(new C25043l(str3, a));
                }
                Log.m105924i("FinderNetworkFlowReport", "PLAY_onPlayerStart#itembegin " + str3 + ' ' + a);
                dVar.f71419f.add(a);
            } else {
                dVar.f71415b = true;
                C25026b.C25027a aVar4 = (C25026b.C25027a) C110818d0.m150914L(dVar.f71419f);
                aVar4.f71413z = true;
                aVar4.f71407t = j3;
                aVar4.f71412y = 0;
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            C25026b bVar5 = this.f71474d;
            Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerStart invalid item " + this.f71475e + ' ' + bVar5);
        }
        return C13598b0.f38549a;
    }
}
