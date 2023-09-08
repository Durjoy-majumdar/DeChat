package vn3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import gy3.C87412m;

/* renamed from: vn3.d */
public final class C111561d extends ActionBar {

    /* renamed from: a */
    public final VASActivity f333979a;

    /* renamed from: b */
    public ViewGroup f333980b;

    /* renamed from: c */
    public View f333981c;

    public C111561d(VASActivity vASActivity) {
        C87412m.m108594g(vASActivity, "vasActivity");
        this.f333979a = vASActivity;
        FrameLayout frameLayout = new FrameLayout(vASActivity.get_activity());
        this.f333980b = frameLayout;
        frameLayout.setId(C0966R.C0970id.fjx);
    }

    /* renamed from: B */
    public void mo91084B(boolean z) {
    }

    /* renamed from: C */
    public void mo91085C(int i) {
    }

    /* renamed from: D */
    public void mo91086D(boolean z) {
    }

    /* renamed from: E */
    public void mo91087E(boolean z) {
    }

    /* renamed from: F */
    public void mo91088F(boolean z) {
    }

    /* renamed from: H */
    public void mo91090H(int i) {
    }

    /* renamed from: I */
    public void mo91091I(Drawable drawable) {
    }

    /* renamed from: L */
    public void mo91094L() {
        this.f333979a._showActionBar();
    }

    /* renamed from: j */
    public View mo91099j() {
        return this.f333981c;
    }

    /* renamed from: k */
    public int mo91100k() {
        return 0;
    }

    /* renamed from: l */
    public int mo91101l() {
        return 0;
    }

    /* renamed from: n */
    public CharSequence mo91103n() {
        return "";
    }

    /* renamed from: o */
    public void mo91104o() {
        this.f333979a._hideActionBar();
    }

    /* renamed from: q */
    public boolean mo91106q() {
        return false;
    }

    /* renamed from: w */
    public void mo91112w(Drawable drawable) {
        this.f333980b.setBackgroundDrawable(drawable);
    }

    /* renamed from: x */
    public void mo91113x(int i) {
    }

    /* renamed from: y */
    public void mo91114y(View view) {
        View view2 = this.f333981c;
        if (view2 != null) {
            this.f333980b.removeView(view2);
        }
        if (view != null) {
            this.f333980b.addView(view);
        }
        this.f333981c = view;
    }

    /* renamed from: z */
    public void mo91115z(View view, ActionBar.LayoutParams layoutParams) {
    }
}
