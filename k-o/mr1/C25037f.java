package mr1;

import cm1.C55015f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87413o;
import mr1.C25026b;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: mr1.f */
public final class C25037f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b f71449d;

    /* renamed from: e */
    public final /* synthetic */ String f71450e;

    /* renamed from: f */
    public final /* synthetic */ boolean f71451f;

    /* renamed from: g */
    public final /* synthetic */ C55015f1 f71452g;

    /* renamed from: h */
    public final /* synthetic */ long f71453h;

    /* renamed from: i */
    public final /* synthetic */ long f71454i;

    /* renamed from: j */
    public final /* synthetic */ C25026b.C25032b f71455j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25037f(C25026b bVar, String str, boolean z, C55015f1 f1Var, long j, long j2, C25026b.C25032b bVar2) {
        super(0);
        this.f71449d = bVar;
        this.f71450e = str;
        this.f71451f = z;
        this.f71452g = f1Var;
        this.f71453h = j;
        this.f71454i = j2;
        this.f71455j = bVar2;
    }

    public Object invoke() {
        C13598b0 b0Var;
        C25026b.C25029d dVar = this.f71449d.f71362c.get(this.f71450e);
        if (dVar != null) {
            String str = this.f71450e;
            boolean z = this.f71451f;
            C25026b bVar = this.f71449d;
            C55015f1 f1Var = this.f71452g;
            long j = this.f71453h;
            long j2 = this.f71454i;
            C25026b.C25032b bVar2 = this.f71455j;
            if (dVar.f71416c || dVar.f71419f.isEmpty()) {
                Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerPause invalid item hitStop " + str + ' ' + dVar);
            } else {
                C25026b.C25027a aVar = (C25026b.C25027a) C110818d0.m150923U(dVar.f71419f);
                if (aVar.f71368A) {
                    Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerPause invalid item stopPlayHit " + aVar.f71384Q + "  " + dVar);
                } else {
                    if (z) {
                        aVar.f71382O = C31543z5.m39451a();
                    }
                    C25026b.m31705b(bVar, dVar, aVar, f1Var, j, j2, !z, bVar2, "onPlayerPause");
                }
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C25026b bVar3 = this.f71449d;
            String str2 = this.f71450e;
            Log.m105928w("FinderNetworkFlowReport", "PLAY_onPlayerPause invalid item " + str2 + ' ' + bVar3);
        }
        return C13598b0.f38549a;
    }
}
