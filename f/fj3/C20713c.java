package fj3;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: fj3.c */
public final class C20713c {

    /* renamed from: a */
    public static final C20713c f58572a = new C20713c();

    /* renamed from: b */
    public static final C13601g f58573b = C36568h.m40985a(C20714a.f58576d);

    /* renamed from: c */
    public static final C13601g f58574c = C36568h.m40985a(C20716c.f58578d);

    /* renamed from: d */
    public static final C13601g f58575d = C36568h.m40985a(C20717d.f58579d);

    /* renamed from: fj3.c$a */
    public static final class C20714a extends C87413o implements C32224a<PathInterpolator> {

        /* renamed from: d */
        public static final C20714a f58576d = new C20714a();

        public C20714a() {
            super(0);
        }

        public Object invoke() {
            return new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        }
    }

    /* renamed from: fj3.c$b */
    public static final class C20715b extends C87413o implements C32224a<PathInterpolator> {

        /* renamed from: d */
        public static final C20715b f58577d = new C20715b();

        public C20715b() {
            super(0);
        }

        public Object invoke() {
            return new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        }
    }

    /* renamed from: fj3.c$c */
    public static final class C20716c extends C87413o implements C32224a<PathInterpolator> {

        /* renamed from: d */
        public static final C20716c f58578d = new C20716c();

        public C20716c() {
            super(0);
        }

        public Object invoke() {
            return new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f);
        }
    }

    /* renamed from: fj3.c$d */
    public static final class C20717d extends C87413o implements C32224a<PathInterpolator> {

        /* renamed from: d */
        public static final C20717d f58579d = new C20717d();

        public C20717d() {
            super(0);
        }

        public Object invoke() {
            return new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        }
    }

    /* renamed from: fj3.c$e */
    public static final class C20718e extends C87413o implements C32224a<LinearInterpolator> {

        /* renamed from: d */
        public static final C20718e f58580d = new C20718e();

        public C20718e() {
            super(0);
        }

        public Object invoke() {
            return new LinearInterpolator();
        }
    }

    static {
        C36568h.m40985a(C20718e.f58580d);
        C36568h.m40985a(C20715b.f58577d);
    }

    /* renamed from: a */
    public final Interpolator mo32435a() {
        return (Interpolator) ((C36570n) f58573b).getValue();
    }
}
