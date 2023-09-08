package wf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import di3.C86312j;
import j20.C117292a;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import ok1.C62042e;
import rx3.C36570n;
import te3.C50852pn2;
import tf0.C13887q1;

/* renamed from: wf1.l0 */
public final class C15219l0<T> implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ C15193l f41430a;

    /* renamed from: b */
    public final /* synthetic */ C7045j f41431b;

    public C15219l0(C15193l lVar, C7045j jVar) {
        this.f41430a = lVar;
        this.f41431b = jVar;
    }

    public final void onResult(boolean z, Object obj, Object obj2) {
        T t;
        boolean z2;
        boolean z3 = z;
        Log.m105924i(this.f41430a.f41381d, "[OnResultListener] hasSetResult:" + z3);
        C7045j jVar = this.f41431b;
        jVar.f24854B = null;
        jVar.f24869t = null;
        jVar.mo8101d();
        View view = (View) ((C36570n) this.f41430a.f41391q).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View g3 = this.f41430a.mo14131g3();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(g3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(g3, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z3) {
            Integer num = this.f41430a.mo14133j3().get(obj);
            int intValue = num != null ? num.intValue() : 0;
            Iterator<T> it = this.f41430a.f41376I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C50852pn2) t).f139839d == intValue) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C50852pn2 pn22 = (C50852pn2) t;
            long j = pn22 != null ? pn22.f139840e : MAlarmHandler.NEXT_FIRE_INTERVAL;
            C15193l lVar = this.f41430a;
            if (j - lVar.f41373F > lVar.f41377J) {
                C76912y0.m92773l(lVar.getActivity(), this.f41430a.getActivity().getString(C0966R.string.n88, new Object[]{((C13887q1) C86312j.m106911c(C13887q1.class)).Gc0(this.f41430a.f41377J)}));
            } else {
                C62042e.f176370a.mo87013I1(3);
                C15193l lVar2 = this.f41430a;
                lVar2.f41379L = intValue;
                lVar2.mo14135l3((Integer) null);
                C15193l.m14281f3(this.f41430a, "showChooseTargetLevelDialog");
            }
        }
        this.f41430a.mo14135l3((Integer) null);
    }
}
