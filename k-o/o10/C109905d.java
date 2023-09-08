package o10;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: o10.d */
public class C109905d {

    /* renamed from: a */
    public final C109916k f328859a;

    /* renamed from: o10.d$a */
    public static class C109906a {

        /* renamed from: a */
        public static Field f328860a;

        /* renamed from: b */
        public static Field f328861b;

        /* renamed from: c */
        public static Field f328862c;

        /* renamed from: d */
        public static boolean f328863d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f328860a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f328861b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f328862c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
    }

    /* renamed from: o10.d$b */
    public static class C109907b extends C109910e {

        /* renamed from: c */
        public static Field f328864c;

        /* renamed from: d */
        public static boolean f328865d;

        /* renamed from: e */
        public static Constructor<WindowInsets> f328866e;

        /* renamed from: f */
        public static boolean f328867f;

        /* renamed from: a */
        public WindowInsets f328868a;

        /* renamed from: b */
        public C109902b f328869b;

        public C109907b() {
            if (!f328865d) {
                try {
                    f328864c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f328865d = true;
            }
            Field field = f328864c;
            WindowInsets windowInsets = null;
            if (field != null) {
                try {
                    WindowInsets windowInsets2 = (WindowInsets) field.get((Object) null);
                    if (windowInsets2 != null) {
                        windowInsets = new WindowInsets(windowInsets2);
                        this.f328868a = windowInsets;
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f328867f) {
                try {
                    f328866e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f328867f = true;
            }
            Constructor<WindowInsets> constructor = f328866e;
            if (constructor != null) {
                try {
                    windowInsets = constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            this.f328868a = windowInsets;
        }

        /* renamed from: a */
        public C109905d mo161222a() {
            C109905d dVar = new C109905d(this.f328868a);
            dVar.f328859a.mo161231n((C109902b[]) null);
            dVar.f328859a.mo161238q(this.f328869b);
            return dVar;
        }

        /* renamed from: b */
        public void mo161223b(C109902b bVar) {
            this.f328869b = bVar;
        }

        /* renamed from: c */
        public void mo161224c(C109902b bVar) {
            WindowInsets windowInsets = this.f328868a;
            if (windowInsets != null) {
                this.f328868a = windowInsets.replaceSystemWindowInsets(bVar.f328854a, bVar.f328855b, bVar.f328856c, bVar.f328857d);
            }
        }
    }

    /* renamed from: o10.d$c */
    public static class C109908c extends C109910e {

        /* renamed from: a */
        public final WindowInsets.Builder f328870a = new WindowInsets.Builder();

        /* renamed from: a */
        public C109905d mo161222a() {
            C109905d dVar = new C109905d(this.f328870a.build());
            dVar.f328859a.mo161231n((C109902b[]) null);
            return dVar;
        }

        /* renamed from: b */
        public void mo161223b(C109902b bVar) {
            this.f328870a.setStableInsets(bVar.mo161216c());
        }

        /* renamed from: c */
        public void mo161224c(C109902b bVar) {
            this.f328870a.setSystemWindowInsets(bVar.mo161216c());
        }
    }

    /* renamed from: o10.d$d */
    public static class C109909d extends C109908c {
    }

    /* renamed from: o10.d$e */
    public static class C109910e {
        public C109910e() {
            new C109905d((C109905d) null);
        }

        /* renamed from: a */
        public C109905d mo161222a() {
            throw null;
        }

        /* renamed from: b */
        public void mo161223b(C109902b bVar) {
            throw null;
        }

        /* renamed from: c */
        public void mo161224c(C109902b bVar) {
            throw null;
        }
    }

    /* renamed from: o10.d$h */
    public static class C109913h extends C109912g {
        public C109913h(C109905d dVar, WindowInsets windowInsets) {
            super(dVar, windowInsets);
        }

        /* renamed from: a */
        public C109905d mo161239a() {
            return new C109905d(this.f328877c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C109913h)) {
                return false;
            }
            C109913h hVar = (C109913h) obj;
            return Objects.equals(this.f328877c, hVar.f328877c) && Objects.equals(this.f328881g, hVar.f328881g);
        }

        public int hashCode() {
            return this.f328877c.hashCode();
        }

        public C109913h(C109905d dVar, C109913h hVar) {
            super(dVar, (C109912g) hVar);
        }
    }

    /* renamed from: o10.d$j */
    public static class C109915j extends C109914i {

        /* renamed from: r */
        public static final /* synthetic */ int f328886r = 0;

        static {
            new C109905d(WindowInsets.CONSUMED);
        }

        public C109915j(C109905d dVar, WindowInsets windowInsets) {
            super(dVar, windowInsets);
        }

        /* renamed from: d */
        public final void mo161225d(View view) {
        }

        /* renamed from: f */
        public C109902b mo161228f(int i) {
            int i2;
            WindowInsets windowInsets = this.f328877c;
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
            return C109902b.m149395b(windowInsets.getInsets(i3));
        }

        public C109915j(C109905d dVar, C109915j jVar) {
            super(dVar, (C109914i) jVar);
        }
    }

    /* renamed from: o10.d$k */
    public static class C109916k {

        /* renamed from: b */
        public static final /* synthetic */ int f328887b = 0;

        /* renamed from: a */
        public final C109905d f328888a;

        static {
            int i = Build.VERSION.SDK_INT;
            (i >= 30 ? new C109909d() : i >= 29 ? new C109908c() : new C109907b()).mo161222a().f328859a.mo161239a().f328859a.mo161234b().f328859a.mo161235c();
        }

        public C109916k(C109905d dVar) {
            this.f328888a = dVar;
        }

        /* renamed from: a */
        public C109905d mo161239a() {
            return this.f328888a;
        }

        /* renamed from: b */
        public C109905d mo161234b() {
            return this.f328888a;
        }

        /* renamed from: c */
        public C109905d mo161235c() {
            return this.f328888a;
        }

        /* renamed from: d */
        public void mo161225d(View view) {
        }

        /* renamed from: e */
        public void mo161226e(C109905d dVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C109916k)) {
                return false;
            }
            C109916k kVar = (C109916k) obj;
            return mo161230m() == kVar.mo161230m() && mo161237l() == kVar.mo161237l() && Objects.equals(mo161229j(), kVar.mo161229j()) && Objects.equals(mo161236h(), kVar.mo161236h());
        }

        /* renamed from: f */
        public C109902b mo161228f(int i) {
            return C109902b.f328853e;
        }

        /* renamed from: g */
        public C109902b mo161241g() {
            return mo161229j();
        }

        /* renamed from: h */
        public C109902b mo161236h() {
            return C109902b.f328853e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(mo161230m()), Boolean.valueOf(mo161237l()), mo161229j(), mo161236h()});
        }

        /* renamed from: i */
        public C109902b mo161242i() {
            return mo161229j();
        }

        /* renamed from: j */
        public C109902b mo161229j() {
            return C109902b.f328853e;
        }

        /* renamed from: k */
        public C109902b mo161243k() {
            return mo161229j();
        }

        /* renamed from: l */
        public boolean mo161237l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo161230m() {
            return false;
        }

        /* renamed from: n */
        public void mo161231n(C109902b[] bVarArr) {
        }

        /* renamed from: o */
        public void mo161232o(C109902b bVar) {
        }

        /* renamed from: p */
        public void mo161233p(C109905d dVar) {
        }

        /* renamed from: q */
        public void mo161238q(C109902b bVar) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i = C109915j.f328886r;
        } else {
            int i2 = C109916k.f328887b;
        }
    }

    public C109905d(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f328859a = new C109915j(this, windowInsets);
        } else if (i >= 29) {
            this.f328859a = new C109914i(this, windowInsets);
        } else if (i >= 28) {
            this.f328859a = new C109913h(this, windowInsets);
        } else {
            this.f328859a = new C109912g(this, windowInsets);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109905d)) {
            return false;
        }
        return Objects.equals(this.f328859a, ((C109905d) obj).f328859a);
    }

    public int hashCode() {
        C109916k kVar = this.f328859a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* renamed from: o10.d$g */
    public static class C109912g extends C109911f {

        /* renamed from: n */
        public C109902b f328882n = null;

        public C109912g(C109905d dVar, WindowInsets windowInsets) {
            super(dVar, windowInsets);
        }

        /* renamed from: b */
        public C109905d mo161234b() {
            return new C109905d(this.f328877c.consumeStableInsets());
        }

        /* renamed from: c */
        public C109905d mo161235c() {
            return new C109905d(this.f328877c.consumeSystemWindowInsets());
        }

        /* renamed from: h */
        public final C109902b mo161236h() {
            if (this.f328882n == null) {
                this.f328882n = C109902b.m149394a(this.f328877c.getStableInsetLeft(), this.f328877c.getStableInsetTop(), this.f328877c.getStableInsetRight(), this.f328877c.getStableInsetBottom());
            }
            return this.f328882n;
        }

        /* renamed from: l */
        public boolean mo161237l() {
            return this.f328877c.isConsumed();
        }

        /* renamed from: q */
        public void mo161238q(C109902b bVar) {
            this.f328882n = bVar;
        }

        public C109912g(C109905d dVar, C109912g gVar) {
            super(dVar, (C109911f) gVar);
            this.f328882n = gVar.f328882n;
        }
    }

    /* renamed from: o10.d$f */
    public static class C109911f extends C109916k {

        /* renamed from: h */
        public static boolean f328871h;

        /* renamed from: i */
        public static Method f328872i;

        /* renamed from: j */
        public static Class<?> f328873j;

        /* renamed from: k */
        public static Class<?> f328874k;

        /* renamed from: l */
        public static Field f328875l;

        /* renamed from: m */
        public static Field f328876m;

        /* renamed from: c */
        public final WindowInsets f328877c;

        /* renamed from: d */
        public C109902b[] f328878d;

        /* renamed from: e */
        public C109902b f328879e;

        /* renamed from: f */
        public C109905d f328880f;

        /* renamed from: g */
        public C109902b f328881g;

        public C109911f(C109905d dVar, WindowInsets windowInsets) {
            super(dVar);
            this.f328879e = null;
            this.f328877c = windowInsets;
        }

        /* renamed from: d */
        public void mo161225d(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f328871h) {
                    try {
                        f328872i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                        f328873j = Class.forName("android.view.ViewRootImpl");
                        Class<?> cls = Class.forName("android.view.View$AttachInfo");
                        f328874k = cls;
                        f328875l = cls.getDeclaredField("mVisibleInsets");
                        f328876m = f328873j.getDeclaredField("mAttachInfo");
                        f328875l.setAccessible(true);
                        f328876m.setAccessible(true);
                    } catch (ReflectiveOperationException e) {
                        e.getMessage();
                    }
                    f328871h = true;
                }
                Method method = f328872i;
                C109902b bVar = null;
                if (!(method == null || f328874k == null || f328875l == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke != null) {
                            Rect rect = (Rect) f328875l.get(f328876m.get(invoke));
                            if (rect != null) {
                                bVar = C109902b.m149394a(rect.left, rect.top, rect.right, rect.bottom);
                            }
                        }
                    } catch (ReflectiveOperationException e2) {
                        e2.getMessage();
                    }
                }
                if (bVar == null) {
                    bVar = C109902b.f328853e;
                }
                this.f328881g = bVar;
                return;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* renamed from: e */
        public void mo161226e(C109905d dVar) {
            dVar.f328859a.mo161233p(this.f328880f);
            dVar.f328859a.mo161232o(this.f328881g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f328881g, ((C109911f) obj).f328881g);
        }

        /* renamed from: f */
        public C109902b mo161228f(int i) {
            C109902b bVar;
            int i2;
            C109902b bVar2 = C109902b.f328853e;
            int i3 = 1;
            while (i3 <= 256) {
                if ((i & i3) != 0) {
                    if (i3 != 1) {
                        C109902b bVar3 = null;
                        if (i3 == 2) {
                            C109902b j = mo161229j();
                            C109905d dVar = this.f328880f;
                            if (dVar != null) {
                                bVar3 = dVar.f328859a.mo161236h();
                            }
                            int i4 = j.f328857d;
                            if (bVar3 != null) {
                                i4 = Math.min(i4, bVar3.f328857d);
                            }
                            bVar = C109902b.m149394a(j.f328854a, 0, j.f328856c, i4);
                        } else if (i3 != 8) {
                            bVar = i3 != 16 ? i3 != 32 ? i3 != 64 ? C109902b.f328853e : mo161243k() : mo161241g() : mo161242i();
                        } else {
                            C109902b[] bVarArr = this.f328878d;
                            if (bVarArr != null) {
                                bVar3 = bVarArr[3];
                            }
                            if (bVar3 != null) {
                                bVar = bVar3;
                            } else {
                                C109902b j2 = mo161229j();
                                C109905d dVar2 = this.f328880f;
                                C109902b h = dVar2 != null ? dVar2.f328859a.mo161236h() : C109902b.f328853e;
                                int i5 = j2.f328857d;
                                if (i5 > h.f328857d) {
                                    bVar = C109902b.m149394a(0, 0, 0, i5);
                                } else {
                                    C109902b bVar4 = this.f328881g;
                                    bVar = (bVar4 == null || bVar4.equals(C109902b.f328853e) || (i2 = this.f328881g.f328857d) <= h.f328857d) ? C109902b.f328853e : C109902b.m149394a(0, 0, 0, i2);
                                }
                            }
                        }
                    } else {
                        bVar = C109902b.m149394a(0, mo161229j().f328855b, 0, 0);
                    }
                    bVar2 = C109902b.m149394a(Math.max(bVar2.f328854a, bVar.f328854a), Math.max(bVar2.f328855b, bVar.f328855b), Math.max(bVar2.f328856c, bVar.f328856c), Math.max(bVar2.f328857d, bVar.f328857d));
                }
                i3 <<= 1;
            }
            return bVar2;
        }

        /* renamed from: j */
        public final C109902b mo161229j() {
            if (this.f328879e == null) {
                this.f328879e = C109902b.m149394a(this.f328877c.getSystemWindowInsetLeft(), this.f328877c.getSystemWindowInsetTop(), this.f328877c.getSystemWindowInsetRight(), this.f328877c.getSystemWindowInsetBottom());
            }
            return this.f328879e;
        }

        /* renamed from: m */
        public boolean mo161230m() {
            return this.f328877c.isRound();
        }

        /* renamed from: n */
        public void mo161231n(C109902b[] bVarArr) {
            this.f328878d = bVarArr;
        }

        /* renamed from: o */
        public void mo161232o(C109902b bVar) {
            this.f328881g = bVar;
        }

        /* renamed from: p */
        public void mo161233p(C109905d dVar) {
            this.f328880f = dVar;
        }

        public C109911f(C109905d dVar, C109911f fVar) {
            this(dVar, new WindowInsets(fVar.f328877c));
        }
    }

    /* renamed from: o10.d$i */
    public static class C109914i extends C109913h {

        /* renamed from: o */
        public C109902b f328883o = null;

        /* renamed from: p */
        public C109902b f328884p = null;

        /* renamed from: q */
        public C109902b f328885q = null;

        public C109914i(C109905d dVar, WindowInsets windowInsets) {
            super(dVar, windowInsets);
        }

        /* renamed from: g */
        public C109902b mo161241g() {
            if (this.f328884p == null) {
                this.f328884p = C109902b.m149395b(this.f328877c.getMandatorySystemGestureInsets());
            }
            return this.f328884p;
        }

        /* renamed from: i */
        public C109902b mo161242i() {
            if (this.f328883o == null) {
                this.f328883o = C109902b.m149395b(this.f328877c.getSystemGestureInsets());
            }
            return this.f328883o;
        }

        /* renamed from: k */
        public C109902b mo161243k() {
            if (this.f328885q == null) {
                this.f328885q = C109902b.m149395b(this.f328877c.getTappableElementInsets());
            }
            return this.f328885q;
        }

        /* renamed from: q */
        public void mo161238q(C109902b bVar) {
        }

        public C109914i(C109905d dVar, C109914i iVar) {
            super(dVar, (C109913h) iVar);
        }
    }

    public C109905d(C109905d dVar) {
        if (dVar != null) {
            C109916k kVar = dVar.f328859a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (kVar instanceof C109915j)) {
                this.f328859a = new C109915j(this, (C109915j) kVar);
            } else if (i >= 29 && (kVar instanceof C109914i)) {
                this.f328859a = new C109914i(this, (C109914i) kVar);
            } else if (i >= 28 && (kVar instanceof C109913h)) {
                this.f328859a = new C109913h(this, (C109913h) kVar);
            } else if (kVar instanceof C109912g) {
                this.f328859a = new C109912g(this, (C109912g) kVar);
            } else if (kVar instanceof C109911f) {
                this.f328859a = new C109911f(this, (C109911f) kVar);
            } else {
                this.f328859a = new C109916k(this);
            }
            kVar.mo161226e(this);
            return;
        }
        this.f328859a = new C109916k(this);
    }
}
