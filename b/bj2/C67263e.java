package bj2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: bj2.e */
public final class C67263e extends UIComponent {

    /* renamed from: bj2.e$a */
    public static final class C67264a<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C67263e f193098d;

        public C67264a(C67263e eVar) {
            this.f193098d = eVar;
        }

        public void onChanged(Object obj) {
            C67280q qVar = (C67280q) obj;
            C87412m.m108594g(qVar, "state");
            C67263e eVar = this.f193098d;
            IStateAction action = qVar.getAction();
            String str = "正在搜索";
            if (action != null && (action instanceof C67279m0)) {
                C67279m0 m0Var = (C67279m0) action;
                TextView textView = (TextView) eVar.findViewById(C0966R.C0970id.k1g);
                if (textView != null) {
                    textView.setText(qVar.f193116d ? str : "没有搜索");
                }
            }
            C67263e eVar2 = this.f193098d;
            IStateAction action2 = qVar.getAction();
            if (action2 != null && (action2 instanceof C67281s)) {
                C67281s sVar = (C67281s) action2;
                TextView textView2 = (TextView) eVar2.findViewById(C0966R.C0970id.k1g);
                if (textView2 != null) {
                    if (!qVar.f193116d) {
                        str = "没有搜索";
                    }
                    textView2.setText(str);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67263e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C67275l.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…(DemoDataUIC::class.java)");
        ((C67275l) a).mo91411c3().observe((C0125s) getActivity(), new C67264a(this));
    }
}
