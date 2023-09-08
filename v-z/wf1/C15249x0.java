package wf1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: wf1.x0 */
public final class C15249x0 extends UIComponent {

    /* renamed from: d */
    public final C13601g f41491d;

    /* renamed from: wf1.x0$a */
    public static final class C15250a extends C87413o implements C32224a<C15221m0> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15250a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41492d = appCompatActivity;
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f41492d).mo75002a(C15221m0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ingCustomUIC::class.java)");
            return (C15221m0) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15249x0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41491d = C36568h.m40985a(new C15250a(appCompatActivity));
    }
}
