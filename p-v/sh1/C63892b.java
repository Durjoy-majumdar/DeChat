package sh1;

import android.animation.Animator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87412m;
import ph1.C62294j;
import rh1.C63435a;
import rx3.C13598b0;
import vh1.C65749a;

/* renamed from: sh1.b */
public abstract class C63892b extends C63891a implements C63435a {

    /* renamed from: p */
    public C62294j f181112p;

    /* renamed from: q */
    public ViewGroup f181113q;

    /* renamed from: r */
    public C65749a f181114r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63892b(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo84316a() {
    }

    /* renamed from: b */
    public void mo84317b(C65749a aVar) {
        C87412m.m108594g(aVar, "params");
        this.f181113q = aVar.f189139b;
        this.f181114r = aVar;
        mo88657l();
    }

    /* renamed from: i */
    public void mo84324i(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "onAnimationEndCallback");
        mo88662u(aVar);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        mo84332p();
    }

    /* renamed from: v */
    public final ImageView mo88663v() {
        ImageView imageView = new ImageView(this.f181103d);
        if (mo88666y()) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        return imageView;
    }

    /* renamed from: w */
    public int mo88664w() {
        return mo88666y() ? this.f181106g : mo88660q().height();
    }

    /* renamed from: x */
    public int mo88665x() {
        return mo88666y() ? this.f181105f : mo88660q().width();
    }

    /* renamed from: y */
    public final boolean mo88666y() {
        C62294j jVar = this.f181112p;
        C87412m.m108591d(jVar);
        return jVar.f177094f >= 1.0f;
    }
}
