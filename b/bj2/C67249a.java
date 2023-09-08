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

/* renamed from: bj2.a */
public final class C67249a extends UIComponent {

    /* renamed from: bj2.a$a */
    public static final class C67250a extends C87413o implements C32226l<C67280q, C13598b0> {

        /* renamed from: d */
        public static final C67250a f193089d = new C67250a();

        public C67250a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C67280q qVar = (C67280q) obj;
            C87412m.m108594g(qVar, "state");
            IStateAction action = qVar.getAction();
            if (action != null && (action instanceof C67279m0)) {
                C67279m0 m0Var = (C67279m0) action;
                qVar.f193116d = true;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bj2.a$b */
    public static final class C67251b<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C67249a f193090d;

        public C67251b(C67249a aVar) {
            this.f193090d = aVar;
        }

        public void onChanged(Object obj) {
            C67280q qVar = (C67280q) obj;
            C87412m.m108594g(qVar, "state");
            C67249a aVar = this.f193090d;
            IStateAction action = qVar.getAction();
            if (action != null && (action instanceof C67282u)) {
                C67282u uVar = (C67282u) action;
                View findViewById = aVar.findViewById(C0966R.C0970id.k0o);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C67252b(aVar));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67249a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final C67275l mo91405c3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C67275l.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…(DemoDataUIC::class.java)");
        return (C67275l) a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo91405c3().mo91411c3().process((C0125s) getActivity(), C67250a.f193089d);
        mo91405c3().mo91411c3().observe((C0125s) getActivity(), new C67251b(this));
    }
}
