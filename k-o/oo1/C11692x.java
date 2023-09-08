package oo1;

import android.view.View;
import android.widget.LinearLayout;
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

/* renamed from: oo1.x */
public final class C11692x {

    /* renamed from: a */
    public final AppCompatActivity f34246a;

    /* renamed from: b */
    public final C13601g f34247b;

    /* renamed from: c */
    public final C13601g f34248c = C36568h.m40985a(new C11693a(this));

    /* renamed from: d */
    public final C13601g f34249d = C36568h.m40985a(new C11694b(this));

    /* renamed from: oo1.x$a */
    public static final class C11693a extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11692x f34250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11693a(C11692x xVar) {
            super(0);
            this.f34250d = xVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34250d.f34247b).getValue()).f42891L;
        }
    }

    /* renamed from: oo1.x$b */
    public static final class C11694b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11692x f34251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11694b(C11692x xVar) {
            super(0);
            this.f34251d = xVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34251d.f34247b).getValue()).f42892M;
        }
    }

    /* renamed from: oo1.x$c */
    public static final class C11695c extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ View f34252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11695c(View view) {
            super(0);
            this.f34252d = view;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f34252d);
        }
    }

    public C11692x(View view, AppCompatActivity appCompatActivity) {
        C87412m.m108594g(view, "header");
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f34246a = appCompatActivity;
        this.f34247b = C36568h.m40985a(new C11695c(view));
    }
}
