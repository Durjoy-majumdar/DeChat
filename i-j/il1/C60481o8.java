package il1;

import cl1.C54985m;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64740tw0;

/* renamed from: il1.o8 */
public final class C60481o8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60424h8 f172398d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60481o8(C60424h8 h8Var) {
        super(0);
        this.f172398d = h8Var;
    }

    public Object invoke() {
        C64740tw0 tw02;
        C64740tw0 tw03;
        C54985m mVar = (C54985m) this.f172398d.f172286q.mo87696x0(C54985m.class);
        Log.m105924i("LiveCheerAnimationSlice", "notifyCheerAnimationFinish");
        LiveMutableData<C54985m.C54987c> liveMutableData = mVar.f154161i;
        C54985m.C54987c value = mVar.f154162j.getValue();
        if (value == null || (tw02 = value.f154168a) == null) {
            tw02 = new C64740tw0();
        }
        liveMutableData.postValue(new C54985m.C54987c(tw02, false, 1.0d, 0));
        LiveMutableData<C54985m.C54987c> liveMutableData2 = mVar.f154163n;
        C54985m.C54987c value2 = mVar.f154162j.getValue();
        if (value2 == null || (tw03 = value2.f154168a) == null) {
            tw03 = new C64740tw0();
        }
        liveMutableData2.postValue(new C54985m.C54987c(tw03, false, 1.0d, 0));
        return C13598b0.f38549a;
    }
}
