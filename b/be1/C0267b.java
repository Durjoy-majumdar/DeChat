package be1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kg3.C76577a;
import od1.C11397c;
import od1.C11405h;
import te3.C51270sn1;

/* renamed from: be1.b */
public final class C0267b extends C11397c<C51270sn1> {

    /* renamed from: q */
    public int f822q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0267b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f822q = C76577a.m92151b(appCompatActivity, 260);
    }

    /* renamed from: l3 */
    public void mo312l3(boolean z) {
        super.mo312l3(z);
        View findViewById = getActivity().findViewById(C0966R.C0970id.f5456fm);
        ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        layoutParams2.setMarginStart(0);
        layoutParams2.leftMargin = 0;
        findViewById.setLayoutParams(layoutParams2);
        if (C11405h.C11406a.m11253a(this)) {
            RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) getContext().findViewById(C0966R.C0970id.btv);
            float dimension = getContext().getResources().getDimension(C0966R.dimen.f3723cd);
            roundCornerRelativeLayout.mo82317c(dimension, dimension, 0.0f, 0.0f);
            roundCornerRelativeLayout.setBackgroundResource(C0966R.color.al6);
            int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(C0966R.dimen.f3679b9) + C75044y4.m89994f(getActivity());
            ViewGroup.LayoutParams layoutParams3 = roundCornerRelativeLayout.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams3).topMargin = (this.f822q - dimensionPixelSize) - ((int) dimension);
            ViewGroup viewGroup = this.f33543i;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    /* renamed from: m3 */
    public int mo313m3(int i) {
        return this.f822q;
    }
}
