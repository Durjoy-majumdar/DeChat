package th1;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import gy3.C87412m;
import ph1.C62289d;
import ph1.C62293i;
import ph1.C62294j;
import sh1.C63892b;

/* renamed from: th1.a */
public final class C64933a extends C63892b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64933a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: k */
    public void mo84326k() {
        ViewGroup viewGroup = this.f181113q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f181113q;
        ViewGroup viewGroup3 = null;
        ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup3 = (ViewGroup) parent;
        }
        if (viewGroup3 != null) {
            viewGroup3.addView(this.f181110n, new FrameLayout.LayoutParams((int) (mo89086z() * ((float) mo88661s().width())), (int) (mo89086z() * ((float) mo88661s().height()))));
        }
    }

    /* renamed from: m */
    public Rect mo84327m() {
        return new Rect(0, 0, (int) (mo89086z() * ((float) mo88661s().width())), (int) (mo89086z() * ((float) mo88661s().height())));
    }

    /* renamed from: n */
    public Rect mo84328n() {
        C62294j jVar = this.f181112p;
        C87412m.m108591d(jVar);
        return jVar.f177096h;
    }

    /* renamed from: o */
    public View mo84329o() {
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(this.f181103d);
        roundedCornerFrameLayout.setRadius(this.f181103d.getResources().getDimension(C0966R.dimen.f3766df));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView(this.f181103d);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C62294j jVar = this.f181112p;
        C62289d dVar = jVar instanceof C62289d ? (C62289d) jVar : null;
        if (dVar != null) {
            View view = dVar.f177066i;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.ImageView");
            imageView.setImageDrawable(((ImageView) view).getDrawable());
        }
        roundedCornerFrameLayout.addView(imageView, layoutParams);
        return roundedCornerFrameLayout;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C62293i.f177081a.mo87358c();
    }

    /* renamed from: p */
    public void mo84332p() {
        ViewGroup viewGroup = this.f181113q;
        ViewGroup viewGroup2 = null;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f181110n);
        }
    }

    /* renamed from: r */
    public String mo84333r() {
        return "SwitchInImageDirector";
    }

    /* renamed from: z */
    public final float mo89086z() {
        ViewGroup viewGroup = this.f181113q;
        if (viewGroup == null) {
            return 1.0f;
        }
        C87412m.m108591d(viewGroup);
        float height = ((float) viewGroup.getHeight()) / ((float) mo88661s().height());
        ViewGroup viewGroup2 = this.f181113q;
        C87412m.m108591d(viewGroup2);
        float width = ((float) viewGroup2.getWidth()) / ((float) mo88661s().width());
        return width < height ? height : width;
    }
}
