package aj3;

import aj3.C103374a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;

/* renamed from: aj3.b */
public class C103375b extends C103374a {

    /* renamed from: g */
    public final WeakReference<View> f304867g;

    /* renamed from: h */
    public long f304868h;

    /* renamed from: i */
    public boolean f304869i = false;

    /* renamed from: j */
    public long f304870j = 0;

    /* renamed from: k */
    public boolean f304871k = false;

    /* renamed from: l */
    public Interpolator f304872l;

    /* renamed from: m */
    public boolean f304873m = false;

    /* renamed from: n */
    public C103377b f304874n = new C103377b();

    /* renamed from: o */
    public ArrayList<C103378c> f304875o = new ArrayList<>();

    /* renamed from: p */
    public Runnable f304876p = new C103376a();

    /* renamed from: q */
    public HashMap<Animator, C103379d> f304877q = new HashMap<>();

    /* renamed from: aj3.b$a */
    public class C103376a implements Runnable {
        public C103376a() {
        }

        public void run() {
            C103375b.this.mo143292o();
        }
    }

    /* renamed from: aj3.b$b */
    public class C103377b implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        public C103377b() {
        }

        public void onAnimationCancel(Animator animator) {
            C103375b.this.getClass();
            HashMap<Animator, Runnable> hashMap = C103375b.this.f304863b;
            if (hashMap != null) {
                hashMap.remove(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C103375b.this.getClass();
            HashMap<Animator, Runnable> hashMap = C103375b.this.f304863b;
            if (hashMap != null) {
                Runnable runnable = hashMap.get(animator);
                if (runnable != null) {
                    runnable.run();
                }
                C103375b.this.f304863b.remove(animator);
            }
            C103375b.this.f304877q.remove(animator);
            if (C103375b.this.f304877q.isEmpty()) {
                C103375b.this.getClass();
            }
            C103375b.this.getClass();
        }

        public void onAnimationRepeat(Animator animator) {
            C103375b.this.getClass();
        }

        public void onAnimationStart(Animator animator) {
            C103375b.this.getClass();
            HashMap<Animator, Runnable> hashMap = C103375b.this.f304862a;
            if (hashMap != null) {
                Runnable runnable = hashMap.get(animator);
                if (runnable != null) {
                    runnable.run();
                }
                C103375b.this.f304862a.remove(animator);
            }
            C103375b.this.getClass();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            C103374a.C67055a aVar = C103375b.this.f304866e;
            if (aVar != null) {
                aVar.mo91065a(animatedFraction);
            }
            C103379d dVar = C103375b.this.f304877q.get(valueAnimator);
            if (!((dVar.f304883a & 511) == 0 || (view = C103375b.this.f304867g.get()) == null)) {
                view.invalidate();
            }
            ArrayList<C103378c> arrayList = dVar.f304884b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C103378c cVar = arrayList.get(i);
                    float f = cVar.f304881b + (cVar.f304882c * animatedFraction);
                    C103375b bVar = C103375b.this;
                    int i2 = cVar.f304880a;
                    View view2 = bVar.f304867g.get();
                    if (view2 != null) {
                        if (i2 == 1) {
                            view2.setTranslationX(f);
                        } else if (i2 == 2) {
                            view2.setTranslationY(f);
                        } else if (i2 == 4) {
                            view2.setScaleX(f);
                        } else if (i2 == 8) {
                            view2.setScaleY(f);
                        } else if (i2 == 16) {
                            view2.setRotation(f);
                        } else if (i2 == 32) {
                            view2.setRotationX(f);
                        } else if (i2 == 64) {
                            view2.setRotationY(f);
                        } else if (i2 == 128) {
                            view2.setX(f);
                        } else if (i2 == 256) {
                            view2.setY(f);
                        } else if (i2 == 512) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(Float.valueOf(f));
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/anim/animator/ViewPropertyAnimatorHC", "setValue", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                            C117292a.m165359e(view3, "com/tencent/mm/ui/anim/animator/ViewPropertyAnimatorHC", "setValue", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                    }
                }
            }
            View view4 = C103375b.this.f304867g.get();
            if (view4 != null) {
                view4.invalidate();
            }
        }
    }

    /* renamed from: aj3.b$c */
    public static class C103378c {

        /* renamed from: a */
        public int f304880a;

        /* renamed from: b */
        public float f304881b;

        /* renamed from: c */
        public float f304882c;

        public C103378c(int i, float f, float f2) {
            this.f304880a = i;
            this.f304881b = f;
            this.f304882c = f2;
        }
    }

    /* renamed from: aj3.b$d */
    public static class C103379d {

        /* renamed from: a */
        public int f304883a;

        /* renamed from: b */
        public ArrayList<C103378c> f304884b;

        public C103379d(int i, ArrayList<C103378c> arrayList) {
            this.f304883a = i;
            this.f304884b = arrayList;
        }
    }

    public C103375b(View view) {
        this.f304867g = new WeakReference<>(view);
    }

    /* renamed from: b */
    public C103374a mo143279b(float f) {
        mo143291n(16, f);
        return this;
    }

    /* renamed from: c */
    public C103374a mo143280c(float f) {
        mo143291n(4, f);
        return this;
    }

    /* renamed from: d */
    public C103374a mo143281d(float f) {
        mo143291n(8, f);
        return this;
    }

    /* renamed from: e */
    public C103374a mo143282e(long j) {
        if (j >= 0) {
            this.f304869i = true;
            this.f304868h = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    /* renamed from: f */
    public C103374a mo143283f(Interpolator interpolator) {
        this.f304873m = true;
        this.f304872l = interpolator;
        return this;
    }

    /* renamed from: g */
    public C103374a mo143284g(long j) {
        if (j >= 0) {
            this.f304871k = true;
            this.f304870j = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    /* renamed from: i */
    public void mo143286i() {
        View view = this.f304867g.get();
        if (view != null) {
            view.removeCallbacks(this.f304876p);
        }
        mo143292o();
    }

    /* renamed from: j */
    public C103374a mo143287j(float f) {
        mo143291n(1, f);
        return this;
    }

    /* renamed from: k */
    public C103374a mo143288k(float f) {
        mo143291n(2, f);
        return this;
    }

    /* renamed from: l */
    public C103374a mo143289l(Runnable runnable) {
        this.f304865d = runnable;
        if (runnable != null && this.f304863b == null) {
            this.f304863b = new HashMap<>();
        }
        return this;
    }

    /* renamed from: m */
    public C103374a mo143290m(Runnable runnable) {
        this.f304864c = runnable;
        if (runnable != null && this.f304862a == null) {
            this.f304862a = new HashMap<>();
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143291n(int r11, float r12) {
        /*
            r10 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r10.f304867g
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 1
            if (r0 == 0) goto L_0x0062
            if (r11 == r1) goto L_0x005d
            r2 = 2
            if (r11 == r2) goto L_0x0058
            r2 = 4
            if (r11 == r2) goto L_0x0053
            r2 = 8
            if (r11 == r2) goto L_0x004e
            r2 = 16
            if (r11 == r2) goto L_0x0049
            r2 = 32
            if (r11 == r2) goto L_0x0044
            r2 = 64
            if (r11 == r2) goto L_0x003f
            r2 = 128(0x80, float:1.794E-43)
            if (r11 == r2) goto L_0x003a
            r2 = 256(0x100, float:3.59E-43)
            if (r11 == r2) goto L_0x0035
            r2 = 512(0x200, float:7.175E-43)
            if (r11 == r2) goto L_0x0030
            goto L_0x0062
        L_0x0030:
            float r0 = r0.getAlpha()
            goto L_0x0063
        L_0x0035:
            float r0 = r0.getY()
            goto L_0x0063
        L_0x003a:
            float r0 = r0.getX()
            goto L_0x0063
        L_0x003f:
            float r0 = r0.getRotationY()
            goto L_0x0063
        L_0x0044:
            float r0 = r0.getRotationX()
            goto L_0x0063
        L_0x0049:
            float r0 = r0.getRotation()
            goto L_0x0063
        L_0x004e:
            float r0 = r0.getScaleY()
            goto L_0x0063
        L_0x0053:
            float r0 = r0.getScaleX()
            goto L_0x0063
        L_0x0058:
            float r0 = r0.getTranslationY()
            goto L_0x0063
        L_0x005d:
            float r0 = r0.getTranslationX()
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            float r12 = r12 - r0
            java.util.HashMap<android.animation.Animator, aj3.b$d> r2 = r10.f304877q
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x00c4
            r2 = 0
            java.util.HashMap<android.animation.Animator, aj3.b$d> r3 = r10.f304877q
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0077:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00bf
            java.lang.Object r4 = r3.next()
            android.animation.Animator r4 = (android.animation.Animator) r4
            java.util.HashMap<android.animation.Animator, aj3.b$d> r5 = r10.f304877q
            java.lang.Object r5 = r5.get(r4)
            aj3.b$d r5 = (aj3.C103375b.C103379d) r5
            int r6 = r5.f304883a
            r6 = r6 & r11
            r7 = 0
            if (r6 == 0) goto L_0x00b8
            java.util.ArrayList<aj3.b$c> r6 = r5.f304884b
            if (r6 == 0) goto L_0x00b8
            int r6 = r6.size()
            r8 = 0
        L_0x009a:
            if (r8 >= r6) goto L_0x00b8
            java.util.ArrayList<aj3.b$c> r9 = r5.f304884b
            java.lang.Object r9 = r9.get(r8)
            aj3.b$c r9 = (aj3.C103375b.C103378c) r9
            int r9 = r9.f304880a
            if (r9 != r11) goto L_0x00b5
            java.util.ArrayList<aj3.b$c> r6 = r5.f304884b
            r6.remove(r8)
            int r6 = r5.f304883a
            int r7 = ~r11
            r6 = r6 & r7
            r5.f304883a = r6
            r7 = 1
            goto L_0x00b8
        L_0x00b5:
            int r8 = r8 + 1
            goto L_0x009a
        L_0x00b8:
            if (r7 == 0) goto L_0x0077
            int r5 = r5.f304883a
            if (r5 != 0) goto L_0x0077
            r2 = r4
        L_0x00bf:
            if (r2 == 0) goto L_0x00c4
            r2.cancel()
        L_0x00c4:
            aj3.b$c r1 = new aj3.b$c
            r1.<init>(r11, r0, r12)
            java.util.ArrayList<aj3.b$c> r11 = r10.f304875o
            r11.add(r1)
            java.lang.ref.WeakReference<android.view.View> r11 = r10.f304867g
            java.lang.Object r11 = r11.get()
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x00e2
            java.lang.Runnable r12 = r10.f304876p
            r11.removeCallbacks(r12)
            java.lang.Runnable r12 = r10.f304876p
            r11.post(r12)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aj3.C103375b.mo143291n(int, float):void");
    }

    /* renamed from: o */
    public void mo143292o() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f});
        ArrayList arrayList = (ArrayList) this.f304875o.clone();
        this.f304875o.clear();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i |= ((C103378c) arrayList.get(i2)).f304880a;
        }
        Runnable runnable = this.f304864c;
        if (runnable != null) {
            this.f304862a.put(ofFloat, runnable);
            this.f304864c = null;
        }
        Runnable runnable2 = this.f304865d;
        if (runnable2 != null) {
            this.f304863b.put(ofFloat, runnable2);
            this.f304865d = null;
        }
        this.f304877q.put(ofFloat, new C103379d(i, arrayList));
        ofFloat.addUpdateListener(this.f304874n);
        ofFloat.addListener(this.f304874n);
        if (this.f304871k) {
            ofFloat.setStartDelay(this.f304870j);
        }
        if (this.f304869i) {
            ofFloat.setDuration(this.f304868h);
        }
        if (this.f304873m) {
            ofFloat.setInterpolator(this.f304872l);
        }
        ofFloat.start();
    }
}
