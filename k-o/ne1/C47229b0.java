package ne1;

import com.tencent.p014mm.autogen.events.FinderLiveRecommendSwitchEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8782l3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C48841bd1;

@C86522b
/* renamed from: ne1.b0 */
public final class C47229b0 extends C61685z0<C48841bd1> implements C8782l3 {

    /* renamed from: e */
    public final String f126796e = "Finder.FinderModPersonalizedSetting";

    public void At0(int i, C8794p5<C48841bd1> p5Var) {
        C48841bd1 bd12 = new C48841bd1();
        bd12.f131056d = i;
        C61685z0.Ax0(this, bd12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C48841bd1 bd12 = (C48841bd1) obj;
        C87412m.m108594g(bd12, "cmdBufItem");
        return C89349b.m111674a(bd12.toByteArray());
    }

    public int xx0() {
        return 20;
    }

    public String yx0() {
        return this.f126796e;
    }

    public void zx0(Object obj, int i) {
        C48841bd1 bd12 = (C48841bd1) obj;
        C87412m.m108594g(bd12, "cmdBufItem");
        String str = this.f126796e;
        Log.m105924i(str, "switchState=" + bd12.f131056d + ", retCode:" + i);
        FinderLiveRecommendSwitchEvent finderLiveRecommendSwitchEvent = new FinderLiveRecommendSwitchEvent();
        FinderLiveRecommendSwitchEvent.C40099a aVar = finderLiveRecommendSwitchEvent.f107529d;
        aVar.f107530a = i;
        aVar.f107531b = bd12.f131056d;
        aVar.f107532c = 20;
        finderLiveRecommendSwitchEvent.publish();
    }
}
