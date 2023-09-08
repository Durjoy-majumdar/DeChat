package aj3;

import aj3.C103374a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.HashMap;

/* renamed from: aj3.d */
public class C103383d extends C103380c {

    /* renamed from: aj3.d$a */
    public class C103384a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ ValueAnimator f304890d;

        public C103384a(ValueAnimator valueAnimator) {
            this.f304890d = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C103383d.this.getClass();
            HashMap<Animator, Runnable> hashMap = C103383d.this.f304863b;
            if (hashMap != null) {
                hashMap.remove(this.f304890d);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C103383d.this.getClass();
            HashMap<Animator, Runnable> hashMap = C103383d.this.f304863b;
            if (hashMap != null) {
                Runnable runnable = hashMap.get(this.f304890d);
                if (runnable != null) {
                    runnable.run();
                }
                C103383d.this.f304863b.remove(this.f304890d);
            }
            C103383d.this.getClass();
            HashMap<Animator, Runnable> hashMap2 = C103383d.this.f304863b;
            if (hashMap2 != null && hashMap2.isEmpty()) {
                C103383d.this.getClass();
            }
            C103383d.this.f304866e = null;
        }

        public void onAnimationRepeat(Animator animator) {
            C103383d.this.getClass();
        }

        public void onAnimationStart(Animator animator) {
            C103383d.this.getClass();
            HashMap<Animator, Runnable> hashMap = C103383d.this.f304862a;
            if (hashMap != null) {
                Runnable runnable = hashMap.get(this.f304890d);
                if (runnable != null) {
                    runnable.run();
                }
                C103383d.this.f304862a.remove(this.f304890d);
            }
            C103383d.this.getClass();
        }
    }

    /* renamed from: aj3.d$b */
    public class C103385b implements ValueAnimator.AnimatorUpdateListener {
        public C103385b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C103374a.C67055a aVar = C103383d.this.f304866e;
            if (aVar != null) {
                aVar.mo91065a(floatValue);
            }
        }
    }

    public C103383d(View view) {
        super(view);
    }

    /* renamed from: h */
    public C103374a mo143285h(C103374a.C67055a aVar) {
        if (this.f304885g.get() != null) {
            this.f304866e = aVar;
        }
        return this;
    }

    /* renamed from: i */
    public void mo143286i() {
        System.currentTimeMillis();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f});
        ViewPropertyAnimator viewPropertyAnimator = this.f304885g.get();
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
        viewPropertyAnimator.setListener(new C103384a(ofFloat));
        if (this.f304866e != null) {
            viewPropertyAnimator.setUpdateListener(new C103385b());
        }
        viewPropertyAnimator.start();
    }
}
