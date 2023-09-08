package kl1;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wk1.C15440n;

/* renamed from: kl1.b0 */
public final class C10301b0 {

    /* renamed from: a */
    public final View f31394a;

    /* renamed from: b */
    public final String f31395b = "FlashLightProxy";

    /* renamed from: c */
    public final float f31396c = 1.0f;

    /* renamed from: d */
    public final double f31397d = (((double) 1.0f) * 0.95d);

    /* renamed from: e */
    public boolean f31398e;

    /* renamed from: f */
    public Bitmap f31399f;

    /* renamed from: g */
    public float f31400g;

    /* renamed from: h */
    public final C13601g f31401h = C36568h.m40985a(C10304c.f31407d);

    /* renamed from: i */
    public final C13601g f31402i = C36568h.m40985a(C10303b.f31406d);

    /* renamed from: j */
    public float f31403j = ((float) C15440n.f41895a.mo14258g());

    /* renamed from: k */
    public final C13601g f31404k = C36568h.m40985a(new C10302a(this));

    /* renamed from: kl1.b0$a */
    public static final class C10302a extends C87413o implements C32224a<ValueAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10301b0 f31405d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10302a(C10301b0 b0Var) {
            super(0);
            this.f31405d = b0Var;
        }

        public Object invoke() {
            this.f31405d.getClass();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, this.f31405d.f31396c});
            C10301b0 b0Var = this.f31405d;
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C10354z(b0Var));
            ofFloat.addListener(new C10299a0(b0Var));
            return ofFloat;
        }
    }

    /* renamed from: kl1.b0$b */
    public static final class C10303b extends C87413o implements C32224a<Matrix> {

        /* renamed from: d */
        public static final C10303b f31406d = new C10303b();

        public C10303b() {
            super(0);
        }

        public Object invoke() {
            return new Matrix();
        }
    }

    /* renamed from: kl1.b0$c */
    public static final class C10304c extends C87413o implements C32224a<Path> {

        /* renamed from: d */
        public static final C10304c f31407d = new C10304c();

        public C10304c() {
            super(0);
        }

        public Object invoke() {
            return new Path();
        }
    }

    public C10301b0(View view) {
        C87412m.m108594g(view, "container");
        this.f31394a = view;
    }

    /* renamed from: a */
    public final ValueAnimator mo10610a() {
        Object value = ((C36570n) this.f31404k).getValue();
        C87412m.m108593f(value, "<get-anim>(...)");
        return (ValueAnimator) value;
    }

    /* renamed from: b */
    public final void mo10611b(int i) {
        String str = this.f31395b;
        Log.m105924i(str, "stop source:" + i + '!');
        this.f31398e = false;
        if (mo10610a().isRunning()) {
            mo10610a().cancel();
        }
    }
}
