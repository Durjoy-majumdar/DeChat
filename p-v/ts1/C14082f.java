package ts1;

import com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C31543z5;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Calendar;
import lc3.C10485b;
import rx3.C13598b0;
import up1.C37521f;
import zt3.C119157j;

/* renamed from: ts1.f */
public final class C14082f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTeenModeLimitVM f39491d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14082f(FinderTeenModeLimitVM finderTeenModeLimitVM) {
        super(0);
        this.f39491d = finderTeenModeLimitVM;
    }

    public Object invoke() {
        if (this.f39491d.mo5191c3()) {
            long c = C31543z5.m39453c();
            FinderTeenModeLimitVM finderTeenModeLimitVM = this.f39491d;
            long j = (c - finderTeenModeLimitVM.f18823i) + finderTeenModeLimitVM.f18822h;
            C58739j4.f168176a.getClass();
            Calendar instance = Calendar.getInstance();
            C87412m.m108593f(instance, "getInstance()");
            instance.setTimeInMillis(C31543z5.m39453c());
            instance.set(11, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(14, 0);
            long timeInMillis = instance.getTimeInMillis();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_CLEAR_TIME_LONG_SYNC;
            if (timeInMillis >= i.mo119673G(aVar, 0)) {
                Log.m105924i("FinderTeenModeLimitVM", "ClearEnjoyFinderTime on 0 time");
                long c2 = C31543z5.m39453c();
                finderTeenModeLimitVM.f18823i = c2;
                finderTeenModeLimitVM.f18822h = 0;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, Long.valueOf(finderTeenModeLimitVM.f18822h));
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(c2));
            }
            FinderTeenModeLimitVM finderTeenModeLimitVM2 = this.f39491d;
            finderTeenModeLimitVM2.getClass();
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC;
            boolean g = i2.mo119686g(aVar2, false);
            Log.m105924i("FinderTeenModeLimitVM", "checkTeemModeLimit currentEnjoyFinderMs:" + j + " , hasCurFewClose:" + g);
            boolean z = true;
            if (finderTeenModeLimitVM2.mo5192d3()) {
                long c3 = C31543z5.m39453c();
                long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC, c3);
                Log.m105924i("FinderTeenModeLimitVM", "currentTime:" + c3 + ", lastTime:" + G);
                if (!g || c3 - G >= 57600000) {
                    if (finderTeenModeLimitVM2.f18821g) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C14081e(finderTeenModeLimitVM2, true));
                    }
                }
            } else if (g) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Boolean.FALSE);
            }
            C37521f.f99374d.getClass();
            if (C37521f.f99434j6.mo60266n().intValue() != 1) {
                z = false;
            }
            if (j >= ((long) ((z ? 10 : ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderAntiAddictInterval", 2400)) * 1000)) && finderTeenModeLimitVM2.f18821g) {
                ((C119157j) C119157j.f356862d).mo183895z(new C14081e(finderTeenModeLimitVM2, false));
            }
        } else {
            this.f39491d.mo5194f3();
        }
        return C13598b0.f38549a;
    }
}
