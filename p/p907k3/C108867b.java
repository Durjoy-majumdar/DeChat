package p907k3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p907k3.C108861a;
import p907k3.C108867b;

/* renamed from: k3.b */
public abstract class C108867b<T extends C108867b<T>> implements C108861a.C108863b {

    /* renamed from: l */
    public static final C108878k f326007l = new C108869b("translationX");

    /* renamed from: m */
    public static final C108878k f326008m = new C108870c("scaleX");

    /* renamed from: n */
    public static final C108878k f326009n = new C108871d("scaleY");

    /* renamed from: o */
    public static final C108878k f326010o = new C108872e("rotation");

    /* renamed from: p */
    public static final C108878k f326011p = new C108873f("rotationX");

    /* renamed from: q */
    public static final C108878k f326012q = new C108874g("rotationY");

    /* renamed from: r */
    public static final C108878k f326013r = new C108868a("alpha");

    /* renamed from: a */
    public float f326014a = 0.0f;

    /* renamed from: b */
    public float f326015b = Float.MAX_VALUE;

    /* renamed from: c */
    public boolean f326016c = false;

    /* renamed from: d */
    public final Object f326017d;

    /* renamed from: e */
    public final C76488c f326018e;

    /* renamed from: f */
    public boolean f326019f = false;

    /* renamed from: g */
    public float f326020g = -3.4028235E38f;

    /* renamed from: h */
    public long f326021h = 0;

    /* renamed from: i */
    public float f326022i;

    /* renamed from: j */
    public final ArrayList<C108876i> f326023j = new ArrayList<>();

    /* renamed from: k */
    public final ArrayList<C108877j> f326024k = new ArrayList<>();

    /* renamed from: k3.b$a */
    public static class C108868a extends C108878k {
        public C108868a(String str) {
            super(str, (C108869b) null);
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            return ((View) obj).getAlpha();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            View view = (View) obj;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "androidx/dynamicanimation/animation/DynamicAnimation$12", "setValue", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "androidx/dynamicanimation/animation/DynamicAnimation$12", "setValue", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: k3.b$b */
    public static class C108869b extends C108878k {
        public C108869b(String str) {
            super(str, (C108869b) null);
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            return ((View) obj).getTranslationX();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            ((View) obj).setTranslationX(f);
        }
    }

    /* renamed from: k3.b$c */
    public static class C108870c extends C108878k {
        public C108870c(String str) {
            super(str, (C108869b) null);
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            return ((View) obj).getScaleX();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    /* renamed from: k3.b$d */
    public static class C108871d extends C108878k {
        public C108871d(String str) {
            super(str, (C108869b) null);
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            return ((View) obj).getScaleY();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    /* renamed from: k3.b$e */
    public static class C108872e extends C108878k {
        public C108872e(String str) {
            super(str, (C108869b) null);
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            return ((View) obj).getRotation();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    /* renamed from: k3.b$f */
    public static class C108873f extends C108878k {
        public C108873f(String str) {
            super(str, (C108869b) null);
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            return ((View) obj).getRotationX();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    /* renamed from: k3.b$g */
    public static class C108874g extends C108878k {
        public C108874g(String str) {
            super(str, (C108869b) null);
        }

        /* renamed from: a */
        public float mo91414a(Object obj) {
            return ((View) obj).getRotationY();
        }

        /* renamed from: b */
        public void mo91415b(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    /* renamed from: k3.b$h */
    public static class C108875h {

        /* renamed from: a */
        public float f326025a;

        /* renamed from: b */
        public float f326026b;
    }

    /* renamed from: k3.b$i */
    public interface C108876i {
        /* renamed from: a */
        void mo159988a(C108867b bVar, boolean z, float f, float f2);
    }

    /* renamed from: k3.b$j */
    public interface C108877j {
        /* renamed from: a */
        void mo159989a(C108867b bVar, float f, float f2);
    }

    /* renamed from: k3.b$k */
    public static abstract class C108878k extends C76488c<View> {
        public C108878k(String str, C108869b bVar) {
            super(str);
        }
    }

    public <K> C108867b(K k, C76488c<K> cVar) {
        this.f326017d = k;
        this.f326018e = cVar;
        if (cVar == f326010o || cVar == f326011p || cVar == f326012q) {
            this.f326022i = 0.1f;
        } else if (cVar == f326013r) {
            this.f326022i = 0.00390625f;
        } else if (cVar == f326008m || cVar == f326009n) {
            this.f326022i = 0.00390625f;
        } else {
            this.f326022i = 1.0f;
        }
    }

    /* renamed from: a */
    public boolean mo159984a(long j) {
        long j2 = j;
        long j3 = this.f326021h;
        if (j3 == 0) {
            this.f326021h = j2;
            mo159987c(this.f326015b);
            return false;
        }
        long j4 = j2 - j3;
        this.f326021h = j2;
        C108879d dVar = (C108879d) this;
        if (dVar.f326028t != Float.MAX_VALUE) {
            long j5 = j4 / 2;
            C108875h c = dVar.f326027s.mo159994c((double) dVar.f326015b, (double) dVar.f326014a, j5);
            C108880e eVar = dVar.f326027s;
            eVar.f326037i = (double) dVar.f326028t;
            dVar.f326028t = Float.MAX_VALUE;
            C108875h c2 = eVar.mo159994c((double) c.f326025a, (double) c.f326026b, j5);
            dVar.f326015b = c2.f326025a;
            dVar.f326014a = c2.f326026b;
        } else {
            C108875h c3 = dVar.f326027s.mo159994c((double) dVar.f326015b, (double) dVar.f326014a, j4);
            dVar.f326015b = c3.f326025a;
            dVar.f326014a = c3.f326026b;
        }
        float max = Math.max(dVar.f326015b, dVar.f326020g);
        dVar.f326015b = max;
        float min = Math.min(max, Float.MAX_VALUE);
        dVar.f326015b = min;
        float f = dVar.f326014a;
        C108880e eVar2 = dVar.f326027s;
        eVar2.getClass();
        boolean z = true;
        if (((double) Math.abs(f)) < eVar2.f326033e && ((double) Math.abs(min - ((float) eVar2.f326037i))) < eVar2.f326032d) {
            dVar.f326015b = (float) dVar.f326027s.f326037i;
            dVar.f326014a = 0.0f;
        } else {
            z = false;
        }
        float min2 = Math.min(this.f326015b, Float.MAX_VALUE);
        this.f326015b = min2;
        float max2 = Math.max(min2, this.f326020g);
        this.f326015b = max2;
        mo159987c(max2);
        if (z) {
            mo159986b(false);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo159986b(boolean z) {
        this.f326019f = false;
        ThreadLocal<C108861a> threadLocal = C108861a.f325995g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C108861a());
        }
        C108861a aVar = threadLocal.get();
        aVar.f325996a.remove(this);
        int indexOf = aVar.f325997b.indexOf(this);
        if (indexOf >= 0) {
            aVar.f325997b.set(indexOf, (Object) null);
            aVar.f326001f = true;
        }
        this.f326021h = 0;
        this.f326016c = false;
        for (int i = 0; i < this.f326023j.size(); i++) {
            if (this.f326023j.get(i) != null) {
                this.f326023j.get(i).mo159988a(this, z, this.f326015b, this.f326014a);
            }
        }
        ArrayList<C108876i> arrayList = this.f326023j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: c */
    public void mo159987c(float f) {
        this.f326018e.mo91415b(this.f326017d, f);
        for (int i = 0; i < this.f326024k.size(); i++) {
            if (this.f326024k.get(i) != null) {
                this.f326024k.get(i).mo159989a(this, this.f326015b, this.f326014a);
            }
        }
        ArrayList<C108877j> arrayList = this.f326024k;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
