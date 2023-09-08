package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p1050v2.C111331h;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C108347i;
import p853i4.C108348j;
import p853i4.C108353o;
import p853i4.C108355q;

public class Slide extends Visibility {

    /* renamed from: N */
    public static final TimeInterpolator f306694N = new DecelerateInterpolator();

    /* renamed from: P */
    public static final TimeInterpolator f306695P = new AccelerateInterpolator();

    /* renamed from: Q */
    public static final C103818g f306696Q = new C103812a();

    /* renamed from: R */
    public static final C103818g f306697R = new C103813b();

    /* renamed from: S */
    public static final C103818g f306698S = new C103814c();

    /* renamed from: T */
    public static final C103818g f306699T = new C103815d();

    /* renamed from: U */
    public static final C103818g f306700U = new C103816e();

    /* renamed from: V */
    public static final C103818g f306701V = new C103817f();

    /* renamed from: M */
    public C103818g f306702M = f306701V;

    /* renamed from: androidx.transition.Slide$a */
    public static class C103812a extends C103819h {
        public C103812a() {
            super((C103812a) null);
        }

        /* renamed from: b */
        public float mo145307b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    public static class C103813b extends C103819h {
        public C103813b() {
            super((C103812a) null);
        }

        /* renamed from: b */
        public float mo145307b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            boolean z = true;
            if (C107207u.C107209c.m145195d(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    public static class C103814c extends C103820i {
        public C103814c() {
            super((C103812a) null);
        }

        /* renamed from: a */
        public float mo145308a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    public static class C103815d extends C103819h {
        public C103815d() {
            super((C103812a) null);
        }

        /* renamed from: b */
        public float mo145307b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    public static class C103816e extends C103819h {
        public C103816e() {
            super((C103812a) null);
        }

        /* renamed from: b */
        public float mo145307b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            boolean z = true;
            if (C107207u.C107209c.m145195d(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    public static class C103817f extends C103820i {
        public C103817f() {
            super((C103812a) null);
        }

        /* renamed from: a */
        public float mo145308a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    public interface C103818g {
        /* renamed from: a */
        float mo145308a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo145307b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    public static abstract class C103819h implements C103818g {
        public C103819h(C103812a aVar) {
        }

        /* renamed from: a */
        public float mo145308a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    public static abstract class C103820i implements C103818g {
        public C103820i(C103812a aVar) {
        }

        /* renamed from: b */
        public float mo145307b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        mo145306W(80);
    }

    /* renamed from: U */
    public Animator mo145299U(ViewGroup viewGroup, View view, C108353o oVar, C108353o oVar2) {
        if (oVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) ((HashMap) oVar2.f324391a).get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C108355q.m146759a(view, oVar2, iArr[0], iArr[1], this.f306702M.mo145307b(viewGroup, view), this.f306702M.mo145308a(viewGroup, view), translationX, translationY, f306694N);
    }

    /* renamed from: V */
    public Animator mo145300V(ViewGroup viewGroup, View view, C108353o oVar, C108353o oVar2) {
        if (oVar == null) {
            return null;
        }
        int[] iArr = (int[]) ((HashMap) oVar.f324391a).get("android:slide:screenPosition");
        return C108355q.m146759a(view, oVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f306702M.mo145307b(viewGroup, view), this.f306702M.mo145308a(viewGroup, view), f306695P);
    }

    /* renamed from: W */
    public void mo145306W(int i) {
        if (i == 3) {
            this.f306702M = f306696Q;
        } else if (i == 5) {
            this.f306702M = f306699T;
        } else if (i == 48) {
            this.f306702M = f306698S;
        } else if (i == 80) {
            this.f306702M = f306701V;
        } else if (i == 8388611) {
            this.f306702M = f306697R;
        } else if (i == 8388613) {
            this.f306702M = f306700U;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        C108347i iVar = new C108347i();
        iVar.f324374b = i;
        this.f306710E = iVar;
    }

    /* renamed from: g */
    public void mo145266g(C108353o oVar) {
        mo145352S(oVar);
        int[] iArr = new int[2];
        oVar.f324392b.getLocationOnScreen(iArr);
        ((HashMap) oVar.f324391a).put("android:slide:screenPosition", iArr);
    }

    /* renamed from: k */
    public void mo145267k(C108353o oVar) {
        mo145352S(oVar);
        int[] iArr = new int[2];
        oVar.f324392b.getLocationOnScreen(iArr);
        ((HashMap) oVar.f324391a).put("android:slide:screenPosition", iArr);
    }

    public Slide(int i) {
        mo145306W(i);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324381g);
        int d = C111331h.m151817d(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo145306W(d);
    }
}
