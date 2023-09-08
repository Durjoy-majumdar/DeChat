package oo1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import ye1.C15972e0;

/* renamed from: oo1.z */
public final class C11697z {

    /* renamed from: a */
    public final AppCompatActivity f34257a;

    /* renamed from: b */
    public final C49712hj1 f34258b;

    /* renamed from: c */
    public final C13601g f34259c;

    /* renamed from: d */
    public final C13601g f34260d = C36568h.m40985a(new C11698a(this));

    /* renamed from: e */
    public final C13601g f34261e = C36568h.m40985a(new C11699b(this));

    /* renamed from: f */
    public final C13601g f34262f = C36568h.m40985a(new C11700c(this));

    /* renamed from: oo1.z$a */
    public static final class C11698a extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11697z f34263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11698a(C11697z zVar) {
            super(0);
            this.f34263d = zVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34263d.f34259c).getValue()).f42927k0;
        }
    }

    /* renamed from: oo1.z$b */
    public static final class C11699b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11697z f34264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11699b(C11697z zVar) {
            super(0);
            this.f34264d = zVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34264d.f34259c).getValue()).f42931m0;
        }
    }

    /* renamed from: oo1.z$c */
    public static final class C11700c extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11697z f34265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11700c(C11697z zVar) {
            super(0);
            this.f34265d = zVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34265d.f34259c).getValue()).f42923i0;
        }
    }

    /* renamed from: oo1.z$d */
    public static final class C11701d extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ View f34266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11701d(View view) {
            super(0);
            this.f34266d = view;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f34266d);
        }
    }

    public C11697z(View view, AppCompatActivity appCompatActivity, C49712hj1 hj12) {
        C87412m.m108594g(view, "header");
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        this.f34257a = appCompatActivity;
        this.f34258b = hj12;
        this.f34259c = C36568h.m40985a(new C11701d(view));
    }

    /* renamed from: a */
    public final FrameLayout mo11547a() {
        return (FrameLayout) ((C36570n) this.f34260d).getValue();
    }
}
