package mr1;

import cm1.C55015f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import mr1.C25026b;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: mr1.n */
public final class C25045n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b f71483d;

    /* renamed from: e */
    public final /* synthetic */ String f71484e;

    /* renamed from: f */
    public final /* synthetic */ C55015f1 f71485f;

    /* renamed from: g */
    public final /* synthetic */ long f71486g;

    /* renamed from: h */
    public final /* synthetic */ long f71487h;

    /* renamed from: i */
    public final /* synthetic */ C25026b.C25032b f71488i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25045n(C25026b bVar, String str, C55015f1 f1Var, long j, long j2, C25026b.C25032b bVar2) {
        super(0);
        this.f71483d = bVar;
        this.f71484e = str;
        this.f71485f = f1Var;
        this.f71486g = j;
        this.f71487h = j2;
        this.f71488i = bVar2;
    }

    public Object invoke() {
        C25026b.C25029d dVar = this.f71483d.f71362c.get(this.f71484e);
        if (dVar != null) {
            C25026b bVar = this.f71483d;
            String str = this.f71484e;
            C55015f1 f1Var = this.f71485f;
            long j = this.f71486g;
            long j2 = this.f71487h;
            C25026b.C25032b bVar2 = this.f71488i;
            if (!dVar.f71416c && !dVar.f71419f.isEmpty()) {
                dVar.f71416c = true;
                C25026b.C25027a aVar = (C25026b.C25027a) C110818d0.m150923U(dVar.f71419f);
                if (!aVar.f71368A) {
                    C25026b.m31705b(bVar, dVar, aVar, f1Var, j, j2, true, bVar2, "onPlayerStop");
                }
                C25026b.m31704a(bVar, str, dVar, "onPlayerStop");
            } else if (!dVar.f71418e || !dVar.f71419f.isEmpty()) {
                Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerStop invalid item " + str + ' ' + dVar);
            } else {
                bVar.f71362c.remove(str);
                Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerStop pre render item remove " + str + ' ' + bVar.mo52130g() + ' ' + dVar);
            }
        }
        return C13598b0.f38549a;
    }
}
