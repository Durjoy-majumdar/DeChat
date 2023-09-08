package bj2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: bj2.l */
public final class C67275l extends UIComponent {

    /* renamed from: d */
    public final C13601g f193111d = C36568h.m40985a(C67276a.f193113d);

    /* renamed from: e */
    public final C13601g f193112e;

    /* renamed from: bj2.l$a */
    public static final class C67276a extends C87413o implements C32224a<C67280q> {

        /* renamed from: d */
        public static final C67276a f193113d = new C67276a();

        public C67276a() {
            super(0);
        }

        public Object invoke() {
            C67280q qVar = new C67280q();
            qVar.f193116d = true;
            return qVar;
        }
    }

    /* renamed from: bj2.l$b */
    public static final class C67277b extends C87413o implements C32224a<UIStateCenter<C67280q>> {

        /* renamed from: d */
        public final /* synthetic */ C67275l f193114d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f193115e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67277b(C67275l lVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f193114d = lVar;
            this.f193115e = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter((C67280q) ((C36570n) this.f193114d.f193111d).getValue(), this.f193115e, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67275l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f193112e = C36568h.m40985a(new C67277b(this, appCompatActivity));
    }

    /* renamed from: c3 */
    public final UIStateCenter<C67280q> mo91411c3() {
        return (UIStateCenter) ((C36570n) this.f193112e).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo91411c3().dispatch(new C67282u());
    }
}
