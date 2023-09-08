package bj2;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bj2.c */
public final class C67253c extends UIComponent {

    /* renamed from: bj2.c$a */
    public static final class C67254a extends C87413o implements C32226l<C67280q, C13598b0> {

        /* renamed from: d */
        public static final C67254a f193092d = new C67254a();

        public C67254a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C67280q qVar = (C67280q) obj;
            C87412m.m108594g(qVar, "state");
            IStateAction action = qVar.getAction();
            if (action != null && (action instanceof C67281s)) {
                C67281s sVar = (C67281s) action;
                qVar.f193116d = false;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bj2.c$b */
    public static final class C67255b<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C67253c f193093d;

        public C67255b(C67253c cVar) {
            this.f193093d = cVar;
        }

        public void onChanged(Object obj) {
            C67280q qVar = (C67280q) obj;
            C87412m.m108594g(qVar, "state");
            C67253c cVar = this.f193093d;
            IStateAction action = qVar.getAction();
            if (action != null && (action instanceof C67282u)) {
                C67282u uVar = (C67282u) action;
                View findViewById = cVar.findViewById(C0966R.C0970id.cjx);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C67261d(cVar));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67253c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final C67275l mo91407c3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C67275l.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…(DemoDataUIC::class.java)");
        return (C67275l) a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo91407c3().mo91411c3().process((C0125s) getActivity(), C67254a.f193092d);
        mo91407c3().mo91411c3().observe((C0125s) getActivity(), new C67255b(this));
    }
}
