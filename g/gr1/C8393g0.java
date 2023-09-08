package gr1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: gr1.g0 */
public final class C8393g0 extends C87413o implements C32224a<ViewGroup> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27384d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8393g0(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27384d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        ViewParent parent = this.f27384d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ViewGroup viewGroup = (ViewGroup) ((View) parent).findViewById(C0966R.C0970id.e6u);
        viewGroup.setOnTouchListener(this.f27384d.f17506U0);
        return viewGroup;
    }
}
