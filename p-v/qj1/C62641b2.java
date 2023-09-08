package qj1;

import android.os.Bundle;
import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.b2 */
public final class C62641b2 extends C87413o implements C32228q<Integer, Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63068w1 f177897d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62641b2(C63068w1 w1Var) {
        super(3);
        this.f177897d = w1Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        Class cls = C55001u.class;
        Class cls2 = C54963d0.class;
        C87412m.m108594g(str, "focusId");
        int i = (int) ((C54963d0) this.f177897d.mo87696x0(cls2)).f154048B.f144323d;
        int i2 = intValue != 3 ? intValue != 4 ? i & -33 & -65 : (i & -33) | 64 : (i & -65) | 32;
        C54795n5 D0 = this.f177897d.mo14476D0();
        if (D0 != null) {
            D0.mo75728c0(((C55001u) this.f177897d.mo87696x0(cls)).f154420q.f182392d, ((C55001u) this.f177897d.mo87696x0(cls)).f154416j, (long) i2, str, new C62626a2(this.f177897d, str));
        }
        String str2 = this.f177897d.f178988q;
        Log.m105924i(str2, "set mic setting success micSettingFlag:" + i2);
        long j = (long) i2;
        if (((C54963d0) this.f177897d.mo87696x0(cls2)).f154048B.f144323d != j) {
            ((C54963d0) this.f177897d.mo87696x0(cls2)).f154048B.f144323d = j;
        }
        this.f177897d.f178983G.mo88125F4(j);
        C58124b bVar = this.f177897d.f178987p;
        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_MIC_MODE_CHANGED_SELECT;
        Bundle bundle = new Bundle();
        bundle.putString("PARAM_FINDER_LIVE_FORCE_USER_ID", str);
        bundle.putInt("PARAM_FINDER_LIVE_MIC_MODE", intValue);
        bundle.putInt("PARAM_FINDER_LIVE_MIC_ANCHOR_POSITION", intValue2);
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.statusChange(bVar2, bundle);
        return C13598b0.f38549a;
    }
}
