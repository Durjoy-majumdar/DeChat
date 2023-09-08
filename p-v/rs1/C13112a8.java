package rs1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.camera.core.FocusMeteringAction;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import de1.C7290r;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: rs1.a8 */
public final class C13112a8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Rect f37324d;

    /* renamed from: e */
    public final /* synthetic */ int f37325e;

    /* renamed from: f */
    public final /* synthetic */ int f37326f;

    /* renamed from: g */
    public final /* synthetic */ int f37327g;

    /* renamed from: h */
    public final /* synthetic */ int f37328h;

    /* renamed from: i */
    public final /* synthetic */ View f37329i;

    /* renamed from: j */
    public final /* synthetic */ C60905o f37330j;

    /* renamed from: n */
    public final /* synthetic */ C13549y7 f37331n;

    /* renamed from: rs1.a8$a */
    public static final class C13113a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ PathMeasure f37332d;

        /* renamed from: e */
        public final /* synthetic */ float[] f37333e;

        /* renamed from: f */
        public final /* synthetic */ View f37334f;

        public C13113a(PathMeasure pathMeasure, float[] fArr, View view) {
            this.f37332d = pathMeasure;
            this.f37333e = fArr;
            this.f37334f = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f37332d.getPosTan(floatValue, this.f37333e, (float[]) null);
            float length = floatValue / this.f37332d.getLength();
            float f = 1.0f;
            float f2 = (0.8f > length ? 1 : (0.8f == length ? 0 : -1)) <= 0 && (length > 1.0f ? 1 : (length == 1.0f ? 0 : -1)) <= 0 ? (((float) 1) - length) / 0.19999999f : 1.0f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 <= 1.0f) {
                f = f2;
            }
            this.f37334f.setScaleX(f);
            this.f37334f.setScaleY(f);
            float left = this.f37333e[0] - ((float) this.f37334f.getLeft());
            float top = this.f37333e[1] - ((float) this.f37334f.getTop());
            this.f37334f.setTranslationX(left);
            this.f37334f.setTranslationY(top);
        }
    }

    /* renamed from: rs1.a8$b */
    public static final class C13114b extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ C60905o f37335d;

        /* renamed from: e */
        public final /* synthetic */ View f37336e;

        /* renamed from: f */
        public final /* synthetic */ C13549y7 f37337f;

        public C13114b(C60905o oVar, View view, C13549y7 y7Var) {
            this.f37335d = oVar;
            this.f37336e = view;
            this.f37337f = y7Var;
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f37335d.f44854d;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.removeViewInLayout(this.f37336e);
            }
        }

        public void onAnimationEnd(Animator animator) {
            C87412m.m108594g(animator, "animation");
            View view = this.f37335d.f44854d;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.removeViewInLayout(this.f37336e);
            }
            C13549y7 y7Var = this.f37337f;
            C60905o oVar = this.f37335d;
            y7Var.getClass();
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13554z zVar = (C13554z) rVar.mo62443b(context).mo62449e(C13554z.class);
            if (!(zVar != null && zVar.f38450t)) {
                View D = oVar.mo85812D(C0966R.C0970id.f26);
                Context context2 = oVar.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C4105m5 m5Var = new C4105m5(context2, (C4105m5.C4106a) null, 2, (C8480h) null);
                m5Var.f18267q = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                m5Var.f18261h.setText(m5Var.f18259f.getString(C0966R.string.mej));
                m5Var.f18260g = true;
                m5Var.f18261h.setTextSize(0, oVar.f173499A.getResources().getDimension(C0966R.dimen.f3879hn));
                C87412m.m108593f(D, "anchor");
                m5Var.mo4987c(D);
                m5Var.mo4986b();
            }
        }
    }

    public C13112a8(Rect rect, int i, int i2, int i3, int i4, View view, C60905o oVar, C13549y7 y7Var) {
        this.f37324d = rect;
        this.f37325e = i;
        this.f37326f = i2;
        this.f37327g = i3;
        this.f37328h = i4;
        this.f37329i = view;
        this.f37330j = oVar;
        this.f37331n = y7Var;
    }

    public final void run() {
        Path path = new Path();
        Rect rect = this.f37324d;
        path.moveTo((float) rect.left, (float) rect.top);
        path.quadTo((float) this.f37325e, (float) this.f37326f, (float) this.f37327g, (float) this.f37328h);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, pathMeasure.getLength()});
        ofFloat.setDuration(350);
        ofFloat.setInterpolator(new AccelerateInterpolator(1.1f));
        ofFloat.addUpdateListener(new C13113a(pathMeasure, new float[2], this.f37329i));
        ofFloat.addListener(new C13114b(this.f37330j, this.f37329i, this.f37331n));
        ofFloat.start();
    }
}
