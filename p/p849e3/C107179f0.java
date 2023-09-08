package p849e3;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p1057w2.C111711b;
import p849e3.C107207u;

/* renamed from: e3.f0 */
public class C107179f0 {

    /* renamed from: a */
    public final C107190k f320766a;

    /* renamed from: e3.f0$a */
    public static class C107180a {

        /* renamed from: a */
        public static Field f320767a;

        /* renamed from: b */
        public static Field f320768b;

        /* renamed from: c */
        public static Field f320769c;

        /* renamed from: d */
        public static boolean f320770d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f320767a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f320768b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f320769c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
    }

    /* renamed from: e3.f0$d */
    public static class C107183d extends C107182c {
        public C107183d() {
        }

        public C107183d(C107179f0 f0Var) {
            super(f0Var);
        }
    }

    /* renamed from: e3.f0$e */
    public static class C107184e {
        public C107184e() {
            this(new C107179f0((C107179f0) null));
        }

        /* renamed from: a */
        public final void mo157640a() {
        }

        /* renamed from: b */
        public C107179f0 mo157637b() {
            throw null;
        }

        /* renamed from: c */
        public void mo157638c(C111711b bVar) {
            throw null;
        }

        /* renamed from: d */
        public void mo157639d(C111711b bVar) {
            throw null;
        }

        public C107184e(C107179f0 f0Var) {
        }
    }

    /* renamed from: e3.f0$h */
    public static class C107187h extends C107186g {
        public C107187h(C107179f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        /* renamed from: a */
        public C107179f0 mo157658a() {
            return C107179f0.m145061g(this.f320783c.consumeDisplayCutout(), (View) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C107187h)) {
                return false;
            }
            C107187h hVar = (C107187h) obj;
            return Objects.equals(this.f320783c, hVar.f320783c) && Objects.equals(this.f320787g, hVar.f320787g);
        }

        /* renamed from: f */
        public C107174c mo157659f() {
            DisplayCutout displayCutout = this.f320783c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C107174c(displayCutout);
        }

        public int hashCode() {
            return this.f320783c.hashCode();
        }

        public C107187h(C107179f0 f0Var, C107187h hVar) {
            super(f0Var, (C107186g) hVar);
        }
    }

    /* renamed from: e3.f0$j */
    public static class C107189j extends C107188i {

        /* renamed from: q */
        public static final /* synthetic */ int f320792q = 0;

        static {
            C107179f0.m145061g(WindowInsets.CONSUMED, (View) null);
        }

        public C107189j(C107179f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        /* renamed from: d */
        public final void mo157641d(View view) {
        }

        /* renamed from: g */
        public C111711b mo157644g(int i) {
            return C111711b.m152276b(this.f320783c.getInsets(C107191l.m145127a(i)));
        }

        /* renamed from: o */
        public boolean mo157647o(int i) {
            return this.f320783c.isVisible(C107191l.m145127a(i));
        }

        public C107189j(C107179f0 f0Var, C107189j jVar) {
            super(f0Var, (C107188i) jVar);
        }
    }

    /* renamed from: e3.f0$k */
    public static class C107190k {

        /* renamed from: b */
        public static final /* synthetic */ int f320793b = 0;

        /* renamed from: a */
        public final C107179f0 f320794a;

        static {
            int i = Build.VERSION.SDK_INT;
            (i >= 30 ? new C107183d() : i >= 29 ? new C107182c() : new C107181b()).mo157637b().f320766a.mo157658a().f320766a.mo157653b().f320766a.mo157654c();
        }

        public C107190k(C107179f0 f0Var) {
            this.f320794a = f0Var;
        }

        /* renamed from: a */
        public C107179f0 mo157658a() {
            return this.f320794a;
        }

        /* renamed from: b */
        public C107179f0 mo157653b() {
            return this.f320794a;
        }

        /* renamed from: c */
        public C107179f0 mo157654c() {
            return this.f320794a;
        }

        /* renamed from: d */
        public void mo157641d(View view) {
        }

        /* renamed from: e */
        public void mo157642e(C107179f0 f0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C107190k)) {
                return false;
            }
            C107190k kVar = (C107190k) obj;
            return mo157646n() == kVar.mo157646n() && mo157656m() == kVar.mo157656m() && Objects.equals(mo157645k(), kVar.mo157645k()) && Objects.equals(mo157655i(), kVar.mo157655i()) && Objects.equals(mo157659f(), kVar.mo157659f());
        }

        /* renamed from: f */
        public C107174c mo157659f() {
            return null;
        }

        /* renamed from: g */
        public C111711b mo157644g(int i) {
            return C111711b.f334387e;
        }

        /* renamed from: h */
        public C111711b mo157661h() {
            return mo157645k();
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(mo157646n()), Boolean.valueOf(mo157656m()), mo157645k(), mo157655i(), mo157659f()});
        }

        /* renamed from: i */
        public C111711b mo157655i() {
            return C111711b.f334387e;
        }

        /* renamed from: j */
        public C111711b mo157662j() {
            return mo157645k();
        }

        /* renamed from: k */
        public C111711b mo157645k() {
            return C111711b.f334387e;
        }

        /* renamed from: l */
        public C111711b mo157663l() {
            return mo157645k();
        }

        /* renamed from: m */
        public boolean mo157656m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo157646n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo157647o(int i) {
            return true;
        }

        /* renamed from: p */
        public void mo157648p(C111711b[] bVarArr) {
        }

        /* renamed from: q */
        public void mo157649q(C111711b bVar) {
        }

        /* renamed from: r */
        public void mo157650r(C107179f0 f0Var) {
        }

        /* renamed from: s */
        public void mo157657s(C111711b bVar) {
        }
    }

    /* renamed from: e3.f0$l */
    public static final class C107191l {
        /* renamed from: a */
        public static int m145127a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i = C107189j.f320792q;
        } else {
            int i2 = C107190k.f320793b;
        }
    }

    public C107179f0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f320766a = new C107189j(this, windowInsets);
        } else if (i >= 29) {
            this.f320766a = new C107188i(this, windowInsets);
        } else if (i >= 28) {
            this.f320766a = new C107187h(this, windowInsets);
        } else {
            this.f320766a = new C107186g(this, windowInsets);
        }
    }

    /* renamed from: g */
    public static C107179f0 m145061g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C107179f0 f0Var = new C107179f0(windowInsets);
        if (view != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(view)) {
                f0Var.f320766a.mo157650r(C107207u.m145164e(view));
                f0Var.f320766a.mo157641d(view.getRootView());
            }
        }
        return f0Var;
    }

    @Deprecated
    /* renamed from: a */
    public int mo157629a() {
        return this.f320766a.mo157645k().f334391d;
    }

    @Deprecated
    /* renamed from: b */
    public int mo157630b() {
        return this.f320766a.mo157645k().f334388a;
    }

    @Deprecated
    /* renamed from: c */
    public int mo157631c() {
        return this.f320766a.mo157645k().f334390c;
    }

    @Deprecated
    /* renamed from: d */
    public int mo157632d() {
        return this.f320766a.mo157645k().f334389b;
    }

    @Deprecated
    /* renamed from: e */
    public C107179f0 mo157633e(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        C107184e dVar = i5 >= 30 ? new C107183d(this) : i5 >= 29 ? new C107182c(this) : new C107181b(this);
        dVar.mo157639d(C111711b.m152275a(i, i2, i3, i4));
        return dVar.mo157637b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107179f0)) {
            return false;
        }
        return Objects.equals(this.f320766a, ((C107179f0) obj).f320766a);
    }

    /* renamed from: f */
    public WindowInsets mo157635f() {
        C107190k kVar = this.f320766a;
        if (kVar instanceof C107185f) {
            return ((C107185f) kVar).f320783c;
        }
        return null;
    }

    public int hashCode() {
        C107190k kVar = this.f320766a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* renamed from: e3.f0$b */
    public static class C107181b extends C107184e {

        /* renamed from: c */
        public static Field f320771c;

        /* renamed from: d */
        public static boolean f320772d;

        /* renamed from: e */
        public static Constructor<WindowInsets> f320773e;

        /* renamed from: f */
        public static boolean f320774f;

        /* renamed from: a */
        public WindowInsets f320775a;

        /* renamed from: b */
        public C111711b f320776b;

        public C107181b() {
            this.f320775a = m145068e();
        }

        /* renamed from: e */
        private static WindowInsets m145068e() {
            if (!f320772d) {
                try {
                    f320771c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f320772d = true;
            }
            Field field = f320771c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f320774f) {
                try {
                    f320773e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f320774f = true;
            }
            Constructor<WindowInsets> constructor = f320773e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        /* renamed from: b */
        public C107179f0 mo157637b() {
            mo157640a();
            C107179f0 g = C107179f0.m145061g(this.f320775a, (View) null);
            g.f320766a.mo157648p((C111711b[]) null);
            g.f320766a.mo157657s(this.f320776b);
            return g;
        }

        /* renamed from: c */
        public void mo157638c(C111711b bVar) {
            this.f320776b = bVar;
        }

        /* renamed from: d */
        public void mo157639d(C111711b bVar) {
            WindowInsets windowInsets = this.f320775a;
            if (windowInsets != null) {
                this.f320775a = windowInsets.replaceSystemWindowInsets(bVar.f334388a, bVar.f334389b, bVar.f334390c, bVar.f334391d);
            }
        }

        public C107181b(C107179f0 f0Var) {
            super(f0Var);
            this.f320775a = f0Var.mo157635f();
        }
    }

    /* renamed from: e3.f0$c */
    public static class C107182c extends C107184e {

        /* renamed from: a */
        public final WindowInsets.Builder f320777a;

        public C107182c() {
            this.f320777a = new WindowInsets.Builder();
        }

        /* renamed from: b */
        public C107179f0 mo157637b() {
            mo157640a();
            C107179f0 g = C107179f0.m145061g(this.f320777a.build(), (View) null);
            g.f320766a.mo157648p((C111711b[]) null);
            return g;
        }

        /* renamed from: c */
        public void mo157638c(C111711b bVar) {
            this.f320777a.setStableInsets(bVar.mo163385c());
        }

        /* renamed from: d */
        public void mo157639d(C111711b bVar) {
            this.f320777a.setSystemWindowInsets(bVar.mo163385c());
        }

        public C107182c(C107179f0 f0Var) {
            super(f0Var);
            WindowInsets.Builder builder;
            WindowInsets f = f0Var.mo157635f();
            if (f != null) {
                builder = new WindowInsets.Builder(f);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f320777a = builder;
        }
    }

    /* renamed from: e3.f0$g */
    public static class C107186g extends C107185f {

        /* renamed from: m */
        public C111711b f320788m = null;

        public C107186g(C107179f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        /* renamed from: b */
        public C107179f0 mo157653b() {
            return C107179f0.m145061g(this.f320783c.consumeStableInsets(), (View) null);
        }

        /* renamed from: c */
        public C107179f0 mo157654c() {
            return C107179f0.m145061g(this.f320783c.consumeSystemWindowInsets(), (View) null);
        }

        /* renamed from: i */
        public final C111711b mo157655i() {
            if (this.f320788m == null) {
                this.f320788m = C111711b.m152275a(this.f320783c.getStableInsetLeft(), this.f320783c.getStableInsetTop(), this.f320783c.getStableInsetRight(), this.f320783c.getStableInsetBottom());
            }
            return this.f320788m;
        }

        /* renamed from: m */
        public boolean mo157656m() {
            return this.f320783c.isConsumed();
        }

        /* renamed from: s */
        public void mo157657s(C111711b bVar) {
            this.f320788m = bVar;
        }

        public C107186g(C107179f0 f0Var, C107186g gVar) {
            super(f0Var, (C107185f) gVar);
            this.f320788m = gVar.f320788m;
        }
    }

    /* renamed from: e3.f0$f */
    public static class C107185f extends C107190k {

        /* renamed from: h */
        public static boolean f320778h;

        /* renamed from: i */
        public static Method f320779i;

        /* renamed from: j */
        public static Class<?> f320780j;

        /* renamed from: k */
        public static Field f320781k;

        /* renamed from: l */
        public static Field f320782l;

        /* renamed from: c */
        public final WindowInsets f320783c;

        /* renamed from: d */
        public C111711b[] f320784d;

        /* renamed from: e */
        public C111711b f320785e;

        /* renamed from: f */
        public C107179f0 f320786f;

        /* renamed from: g */
        public C111711b f320787g;

        public C107185f(C107179f0 f0Var, WindowInsets windowInsets) {
            super(f0Var);
            this.f320785e = null;
            this.f320783c = windowInsets;
        }

        /* renamed from: t */
        private C111711b m145079t(int i, boolean z) {
            C111711b bVar = C111711b.f334387e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    C111711b u = mo157651u(i2, z);
                    bVar = C111711b.m152275a(Math.max(bVar.f334388a, u.f334388a), Math.max(bVar.f334389b, u.f334389b), Math.max(bVar.f334390c, u.f334390c), Math.max(bVar.f334391d, u.f334391d));
                }
            }
            return bVar;
        }

        /* renamed from: v */
        private C111711b m145080v() {
            C107179f0 f0Var = this.f320786f;
            return f0Var != null ? f0Var.f320766a.mo157655i() : C111711b.f334387e;
        }

        /* renamed from: w */
        private C111711b m145081w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f320778h) {
                    m145082y();
                }
                Method method = f320779i;
                if (!(method == null || f320780j == null || f320781k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f320781k.get(f320782l.get(invoke));
                        if (rect != null) {
                            return C111711b.m152275a(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        e.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: y */
        private static void m145082y() {
            try {
                f320779i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f320780j = cls;
                f320781k = cls.getDeclaredField("mVisibleInsets");
                f320782l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f320781k.setAccessible(true);
                f320782l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            f320778h = true;
        }

        /* renamed from: d */
        public void mo157641d(View view) {
            C111711b w = m145081w(view);
            if (w == null) {
                w = C111711b.f334387e;
            }
            mo157649q(w);
        }

        /* renamed from: e */
        public void mo157642e(C107179f0 f0Var) {
            f0Var.f320766a.mo157650r(this.f320786f);
            f0Var.f320766a.mo157649q(this.f320787g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f320787g, ((C107185f) obj).f320787g);
        }

        /* renamed from: g */
        public C111711b mo157644g(int i) {
            return m145079t(i, false);
        }

        /* renamed from: k */
        public final C111711b mo157645k() {
            if (this.f320785e == null) {
                this.f320785e = C111711b.m152275a(this.f320783c.getSystemWindowInsetLeft(), this.f320783c.getSystemWindowInsetTop(), this.f320783c.getSystemWindowInsetRight(), this.f320783c.getSystemWindowInsetBottom());
            }
            return this.f320785e;
        }

        /* renamed from: n */
        public boolean mo157646n() {
            return this.f320783c.isRound();
        }

        /* renamed from: o */
        public boolean mo157647o(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !mo157652x(i2)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: p */
        public void mo157648p(C111711b[] bVarArr) {
            this.f320784d = bVarArr;
        }

        /* renamed from: q */
        public void mo157649q(C111711b bVar) {
            this.f320787g = bVar;
        }

        /* renamed from: r */
        public void mo157650r(C107179f0 f0Var) {
            this.f320786f = f0Var;
        }

        /* renamed from: u */
        public C111711b mo157651u(int i, boolean z) {
            int i2;
            if (i == 1) {
                return z ? C111711b.m152275a(0, Math.max(m145080v().f334389b, mo157645k().f334389b), 0, 0) : C111711b.m152275a(0, mo157645k().f334389b, 0, 0);
            }
            C111711b bVar = null;
            if (i != 2) {
                if (i == 8) {
                    C111711b[] bVarArr = this.f320784d;
                    if (bVarArr != null) {
                        bVar = bVarArr[3];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    C111711b k = mo157645k();
                    C111711b v = m145080v();
                    int i3 = k.f334391d;
                    if (i3 > v.f334391d) {
                        return C111711b.m152275a(0, 0, 0, i3);
                    }
                    C111711b bVar2 = this.f320787g;
                    return (bVar2 == null || bVar2.equals(C111711b.f334387e) || (i2 = this.f320787g.f334391d) <= v.f334391d) ? C111711b.f334387e : C111711b.m152275a(0, 0, 0, i2);
                } else if (i == 16) {
                    return mo157662j();
                } else {
                    if (i == 32) {
                        return mo157661h();
                    }
                    if (i == 64) {
                        return mo157663l();
                    }
                    if (i != 128) {
                        return C111711b.f334387e;
                    }
                    C107179f0 f0Var = this.f320786f;
                    C107174c f = f0Var != null ? f0Var.f320766a.mo157659f() : mo157659f();
                    return f != null ? C111711b.m152275a(f.mo157622b(), f.mo157624d(), f.mo157623c(), f.mo157621a()) : C111711b.f334387e;
                }
            } else if (z) {
                C111711b v2 = m145080v();
                C111711b i4 = mo157655i();
                return C111711b.m152275a(Math.max(v2.f334388a, i4.f334388a), 0, Math.max(v2.f334390c, i4.f334390c), Math.max(v2.f334391d, i4.f334391d));
            } else {
                C111711b k2 = mo157645k();
                C107179f0 f0Var2 = this.f320786f;
                if (f0Var2 != null) {
                    bVar = f0Var2.f320766a.mo157655i();
                }
                int i5 = k2.f334391d;
                if (bVar != null) {
                    i5 = Math.min(i5, bVar.f334391d);
                }
                return C111711b.m152275a(k2.f334388a, 0, k2.f334390c, i5);
            }
        }

        /* renamed from: x */
        public boolean mo157652x(int i) {
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    return false;
                }
                if (!(i == 8 || i == 128)) {
                    return true;
                }
            }
            return !mo157651u(i, false).equals(C111711b.f334387e);
        }

        public C107185f(C107179f0 f0Var, C107185f fVar) {
            this(f0Var, new WindowInsets(fVar.f320783c));
        }
    }

    /* renamed from: e3.f0$i */
    public static class C107188i extends C107187h {

        /* renamed from: n */
        public C111711b f320789n = null;

        /* renamed from: o */
        public C111711b f320790o = null;

        /* renamed from: p */
        public C111711b f320791p = null;

        public C107188i(C107179f0 f0Var, WindowInsets windowInsets) {
            super(f0Var, windowInsets);
        }

        /* renamed from: h */
        public C111711b mo157661h() {
            if (this.f320790o == null) {
                this.f320790o = C111711b.m152276b(this.f320783c.getMandatorySystemGestureInsets());
            }
            return this.f320790o;
        }

        /* renamed from: j */
        public C111711b mo157662j() {
            if (this.f320789n == null) {
                this.f320789n = C111711b.m152276b(this.f320783c.getSystemGestureInsets());
            }
            return this.f320789n;
        }

        /* renamed from: l */
        public C111711b mo157663l() {
            if (this.f320791p == null) {
                this.f320791p = C111711b.m152276b(this.f320783c.getTappableElementInsets());
            }
            return this.f320791p;
        }

        /* renamed from: s */
        public void mo157657s(C111711b bVar) {
        }

        public C107188i(C107179f0 f0Var, C107188i iVar) {
            super(f0Var, (C107187h) iVar);
        }
    }

    public C107179f0(C107179f0 f0Var) {
        if (f0Var != null) {
            C107190k kVar = f0Var.f320766a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (kVar instanceof C107189j)) {
                this.f320766a = new C107189j(this, (C107189j) kVar);
            } else if (i >= 29 && (kVar instanceof C107188i)) {
                this.f320766a = new C107188i(this, (C107188i) kVar);
            } else if (i >= 28 && (kVar instanceof C107187h)) {
                this.f320766a = new C107187h(this, (C107187h) kVar);
            } else if (kVar instanceof C107186g) {
                this.f320766a = new C107186g(this, (C107186g) kVar);
            } else if (kVar instanceof C107185f) {
                this.f320766a = new C107185f(this, (C107185f) kVar);
            } else {
                this.f320766a = new C107190k(this);
            }
            kVar.mo157642e(this);
            return;
        }
        this.f320766a = new C107190k(this);
    }
}
