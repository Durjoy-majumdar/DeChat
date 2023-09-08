package oo1;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ye1.C15972e0;

/* renamed from: oo1.u */
public final class C11684u {

    /* renamed from: a */
    public final AppCompatActivity f34231a;

    /* renamed from: b */
    public final C13601g f34232b;

    /* renamed from: c */
    public final C13601g f34233c = C36568h.m40985a(new C11685a(this));

    /* renamed from: d */
    public final C13601g f34234d = C36568h.m40985a(new C11686b(this));

    /* renamed from: oo1.u$a */
    public static final class C11685a extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11684u f34235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11685a(C11684u uVar) {
            super(0);
            this.f34235d = uVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34235d.f34232b).getValue()).f42900U;
        }
    }

    /* renamed from: oo1.u$b */
    public static final class C11686b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11684u f34236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11686b(C11684u uVar) {
            super(0);
            this.f34236d = uVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34236d.f34232b).getValue()).f42901V;
        }
    }

    /* renamed from: oo1.u$c */
    public static final class C11687c extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ View f34237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11687c(View view) {
            super(0);
            this.f34237d = view;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f34237d);
        }
    }

    public C11684u(View view, AppCompatActivity appCompatActivity) {
        C87412m.m108594g(view, "header");
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f34231a = appCompatActivity;
        this.f34232b = C36568h.m40985a(new C11687c(view));
    }
}
