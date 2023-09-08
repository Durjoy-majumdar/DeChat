package com.tencent.p014mm.plugin.luckymoney.story;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior */
public class EnvelopeStoryBehavior extends AppBarLayout.Behavior implements View.OnTouchListener {

    /* renamed from: A */
    public float f199557A;

    /* renamed from: B */
    public float f199558B;

    /* renamed from: C */
    public Vibrator f199559C = ((Vibrator) MMApplicationContext.getContext().getSystemService("vibrator"));

    /* renamed from: D */
    public boolean f199560D;

    /* renamed from: E */
    public int f199561E = C76577a.m92151b(MMApplicationContext.getContext(), 300);

    /* renamed from: F */
    public boolean f199562F = false;

    /* renamed from: G */
    public boolean f199563G = false;

    /* renamed from: H */
    public AppBarLayout.C67445c f199564H;

    /* renamed from: I */
    public boolean f199565I = false;

    /* renamed from: J */
    public boolean f199566J = false;

    /* renamed from: K */
    public boolean f199567K;

    /* renamed from: x */
    public EnvelopeAppBarLayout f199568x;

    /* renamed from: y */
    public int f199569y = 0;

    /* renamed from: z */
    public RecyclerView f199570z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior$a */
    public class C69304a implements Animator.AnimatorListener {
        public C69304a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            EnvelopeStoryBehavior envelopeStoryBehavior = EnvelopeStoryBehavior.this;
            envelopeStoryBehavior.mo146260y(-(envelopeStoryBehavior.f199568x.getTotalScrollRange() - EnvelopeStoryBehavior.this.f199561E));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior$b */
    public class C69305b implements ValueAnimator.AnimatorUpdateListener {
        public C69305b() {
            EnvelopeStoryBehavior.this.mo146259w();
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Log.m105919d("MicroMsg.EnvelopeStoryBehavior", "animate middle: %s", Integer.valueOf(intValue));
            EnvelopeStoryBehavior.this.mo146260y(intValue);
            EnvelopeStoryBehavior envelopeStoryBehavior = EnvelopeStoryBehavior.this;
            AppBarLayout.C67445c cVar = envelopeStoryBehavior.f199564H;
            if (cVar != null) {
                cVar.mo3128a(envelopeStoryBehavior.f199568x, intValue);
            }
        }
    }

    public EnvelopeStoryBehavior() {
    }

    /* renamed from: H */
    public boolean mo94957H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.f199568x = (EnvelopeAppBarLayout) appBarLayout;
        this.f199570z = (RecyclerView) coordinatorLayout.findViewById(C0966R.C0970id.gdh);
        this.f199569y = (int) (((float) coordinatorLayout.getHeight()) / 10.0f);
        if (coordinatorLayout instanceof TouchCoordinatorLayout) {
            ((ArrayList) ((TouchCoordinatorLayout) coordinatorLayout).f199576D).add(this);
        }
        super.mo94960f(coordinatorLayout, appBarLayout, i);
        return true;
    }

    /* renamed from: I */
    public void mo94958I(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        super.mo94961k(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    /* renamed from: J */
    public void mo94855J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (i5 != 1 || !this.f199566J) {
            int totalScrollRange = (this.f199568x.getTotalScrollRange() - Math.abs(mo146259w())) + Math.abs(i4);
            Log.m105918d("MicroMsg.EnvelopeStoryBehavior", "distance: " + totalScrollRange);
            float f = 0.7f;
            float totalScrollRange2 = (float) this.f199568x.getTotalScrollRange();
            if (totalScrollRange2 != 0.0f) {
                float f2 = (float) totalScrollRange;
                f = f2 > totalScrollRange2 ? 0.0f : (totalScrollRange2 - f2) / totalScrollRange2;
            }
            if (totalScrollRange > 0) {
                double d = (double) (1.0f - f);
                i6 = (int) (((float) i4) * ((float) (((double) ((float) (d * 0.2d * d))) + 0.8d)));
            } else {
                i6 = i4;
            }
            super.mo78308m(coordinatorLayout, appBarLayout, view, i, i2, i3, i6, i5);
        } else if (i2 == 0) {
            Log.m105924i("MicroMsg.EnvelopeStoryBehavior", "stop verticalRecyclerView scroll!");
            this.f199570z.mo17155w1();
        }
    }

    /* renamed from: K */
    public boolean mo94959K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return super.mo5059s(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    /* renamed from: N */
    public final void mo95454N() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(200);
        valueAnimator.setIntValues(new int[]{mo146259w(), -(this.f199568x.getTotalScrollRange() - this.f199561E)});
        valueAnimator.addListener(new C69304a());
        valueAnimator.addUpdateListener(new C69305b());
        valueAnimator.start();
    }

    /* renamed from: O */
    public final void mo95455O() {
        boolean z = false;
        if ((!this.f199566J || mo146259w() + this.f199568x.getTotalScrollRange() > this.f199569y) && (!this.f199565I || Math.abs(mo146259w()) < this.f199569y)) {
            if (this.f199568x.getTotalScrollRange() - Math.abs(mo146259w()) == this.f199561E) {
                z = true;
            }
            if (!z) {
                this.f199568x.mo146163d(true, true, true);
                return;
            }
            return;
        }
        this.f199568x.mo146163d(false, true, true);
    }

    /* renamed from: P */
    public final void mo95456P() {
        int w = mo146259w();
        int totalScrollRange = this.f199568x.getTotalScrollRange();
        if (this.f199567K) {
            if (totalScrollRange - Math.abs(w) < this.f199561E) {
                this.f199568x.mo146163d(false, true, true);
            } else if (this.f199563G) {
                mo95454N();
            } else {
                mo95455O();
            }
        } else if (this.f199566J) {
            if (mo146259w() + this.f199568x.getTotalScrollRange() <= this.f199569y) {
                this.f199568x.mo146163d(false, true, true);
            } else {
                mo95454N();
            }
        } else if (!this.f199565I || Math.abs(mo146259w()) < this.f199569y) {
            mo95455O();
        } else if (totalScrollRange - Math.abs(w) < this.f199561E) {
            this.f199568x.mo146163d(false, true, true);
        } else {
            mo95454N();
        }
    }

    /* renamed from: Q */
    public final boolean mo95457Q() {
        return Math.abs(mo146259w()) <= 0;
    }

    /* renamed from: R */
    public final boolean mo95458R() {
        return this.f199568x.getTotalScrollRange() == Math.abs(mo146259w());
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ boolean mo94960f(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo94957H(coordinatorLayout, (AppBarLayout) view, i);
        return true;
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo95459h(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        return false;
    }

    /* renamed from: i */
    public boolean mo95460i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        return !mo95457Q() && !mo95458R();
    }

    /* renamed from: k */
    public void mo94961k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        super.mo94961k(coordinatorLayout, (AppBarLayout) view, view2, i, i2, iArr, i3);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z = true;
        if (motionEvent.getAction() == 0) {
            this.f199557A = motionEvent.getX();
            this.f199558B = motionEvent.getY();
            this.f199560D = false;
            this.f199565I = mo95457Q();
            this.f199566J = mo95458R();
            if (!(this.f199568x.getTotalScrollRange() - Math.abs(mo146259w()) == this.f199561E) && (this.f199566J || this.f199565I)) {
                z = false;
            }
            this.f199567K = z;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f199562F) {
                mo95456P();
            } else {
                EnvelopeAppBarLayout envelopeAppBarLayout = this.f199568x;
                if (envelopeAppBarLayout != null && this.f199563G) {
                    envelopeAppBarLayout.mo146163d(false, true, true);
                } else if (!mo95457Q() && !mo95458R()) {
                    mo95455O();
                }
            }
        } else if (motionEvent.getAction() == 2) {
            float y = motionEvent.getY() - this.f199558B;
            if (this.f199568x != null && !this.f199563G && y > 0.0f && mo146259w() != 0 && mo146259w() + this.f199568x.getTotalScrollRange() >= this.f199569y && this.f199567K && !this.f199560D && mo146259w() + this.f199561E >= this.f199569y) {
                this.f199560D = true;
                this.f199559C.vibrate(10);
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* renamed from: s */
    public boolean mo5059s(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return super.mo5059s(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
    }

    /* renamed from: v */
    public boolean mo843v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if (motionEvent.getAction() == 1) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getActionMasked() == 2) {
            float y = motionEvent.getY();
            float x = motionEvent.getX();
            float f = y - this.f199558B;
            if (f > 0.0f) {
                float f2 = 0.5f;
                float totalScrollRange = (float) this.f199568x.getTotalScrollRange();
                if (totalScrollRange != 0.0f) {
                    f2 = f > totalScrollRange ? 0.0f : (totalScrollRange - f) / totalScrollRange;
                }
                double d = (double) (1.0f - f2);
                Log.m105919d("MicroMsg.EnvelopeStoryBehavior", "lastY: %s, Y: %s", Float.valueOf(this.f199558B), Float.valueOf(motionEvent.getY()));
                Matrix matrix = new Matrix();
                matrix.setTranslate(0.0f, (-f) * ((float) (((double) ((float) (d * 0.2d * d))) + 0.3d)));
                motionEvent.transform(matrix);
            } else if (((double) (Math.abs(f) / Math.abs(x - this.f199557A))) < 0.57d) {
                return false;
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f199562F) {
                mo95456P();
            } else {
                EnvelopeAppBarLayout envelopeAppBarLayout = this.f199568x;
                if (envelopeAppBarLayout != null && this.f199563G) {
                    envelopeAppBarLayout.mo146163d(false, true, true);
                } else if (!mo95457Q() && !mo95458R()) {
                    mo95455O();
                }
            }
        }
        return super.mo843v(coordinatorLayout, appBarLayout, motionEvent);
    }

    public EnvelopeStoryBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
