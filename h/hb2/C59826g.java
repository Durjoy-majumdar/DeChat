package hb2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import gy3.C87412m;

/* renamed from: hb2.g */
public final class C59826g {

    /* renamed from: a */
    public final Drawable f170785a;

    /* renamed from: b */
    public final Point f170786b;

    /* renamed from: c */
    public final Size f170787c;

    /* renamed from: hb2.g$a */
    public static final class C59827a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C59826g f170788d;

        /* renamed from: e */
        public final /* synthetic */ float f170789e;

        /* renamed from: f */
        public final /* synthetic */ float f170790f;

        /* renamed from: g */
        public final /* synthetic */ float f170791g;

        /* renamed from: h */
        public final /* synthetic */ float f170792h;

        /* renamed from: i */
        public final /* synthetic */ float f170793i;

        /* renamed from: j */
        public final /* synthetic */ float f170794j;

        /* renamed from: n */
        public final /* synthetic */ float f170795n;

        /* renamed from: o */
        public final /* synthetic */ float f170796o;

        /* renamed from: p */
        public final /* synthetic */ ImageView f170797p;

        /* renamed from: q */
        public final /* synthetic */ boolean f170798q;

        public C59827a(C59826g gVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, ImageView imageView, boolean z) {
            this.f170788d = gVar;
            this.f170789e = f;
            this.f170790f = f2;
            this.f170791g = f3;
            this.f170792h = f4;
            this.f170793i = f5;
            this.f170794j = f6;
            this.f170795n = f7;
            this.f170796o = f8;
            this.f170797p = imageView;
            this.f170798q = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C59826g gVar = this.f170788d;
            float f = this.f170789e;
            float f2 = this.f170790f;
            gVar.getClass();
            float f3 = f + ((f2 - f) * floatValue);
            C59826g gVar2 = this.f170788d;
            float f4 = this.f170791g;
            float f5 = this.f170792h;
            gVar2.getClass();
            float f6 = f4 + ((f5 - f4) * floatValue);
            C59826g gVar3 = this.f170788d;
            float f7 = this.f170793i;
            float f8 = this.f170794j;
            gVar3.getClass();
            float f9 = f7 + ((f8 - f7) * floatValue);
            C59826g gVar4 = this.f170788d;
            float f15 = this.f170795n;
            float f16 = this.f170796o;
            gVar4.getClass();
            float f17 = 1.0f - floatValue;
            this.f170797p.setX(f3);
            this.f170797p.setY(f6);
            ImageView imageView = this.f170797p;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = (int) f9;
            layoutParams.height = (int) (f15 + ((f16 - f15) * floatValue));
            imageView.setLayoutParams(layoutParams);
            if (this.f170798q) {
                this.f170797p.setAlpha(f17);
            }
        }
    }

    public C59826g(Drawable drawable, Point point, Size size) {
        C87412m.m108594g(point, "position");
        C87412m.m108594g(size, "size");
        this.f170785a = drawable;
        this.f170786b = point;
        this.f170787c = size;
    }

    /* renamed from: a */
    public final void mo84781a(ImageView imageView) {
        C87412m.m108594g(imageView, "imageView");
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = this.f170787c.getWidth();
        layoutParams.height = this.f170787c.getHeight();
        imageView.setLayoutParams(layoutParams);
        imageView.setX((float) this.f170786b.x);
        imageView.setY((float) this.f170786b.y);
        imageView.setImageDrawable(this.f170785a);
    }

    /* renamed from: b */
    public final Animator mo84782b(C59826g gVar, ImageView imageView, boolean z) {
        C59826g gVar2 = gVar;
        ImageView imageView2 = imageView;
        C87412m.m108594g(gVar2, "to");
        C87412m.m108594g(imageView2, "animateView");
        mo84781a(imageView2);
        Point point = this.f170786b;
        Point point2 = gVar2.f170786b;
        float f = (float) point.y;
        float f2 = (float) point2.y;
        float width = (float) this.f170787c.getWidth();
        float width2 = (float) gVar2.f170787c.getWidth();
        float height = (float) this.f170787c.getHeight();
        float height2 = (float) gVar2.f170787c.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C59827a(this, (float) point.x, (float) point2.x, f, f2, width, width2, height, height2, imageView2, z));
        return ofFloat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59826g)) {
            return false;
        }
        C59826g gVar = (C59826g) obj;
        return C87412m.m108589b(this.f170785a, gVar.f170785a) && C87412m.m108589b(this.f170786b, gVar.f170786b) && C87412m.m108589b(this.f170787c, gVar.f170787c);
    }

    public int hashCode() {
        Drawable drawable = this.f170785a;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f170786b.hashCode()) * 31) + this.f170787c.hashCode();
    }

    public String toString() {
        return "MusicMvAnimationInfo(drawable=" + this.f170785a + ", position=" + this.f170786b + ", size=" + this.f170787c + ')';
    }
}
