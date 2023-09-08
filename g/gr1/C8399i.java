package gr1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;
import kg3.C76577a;

/* renamed from: gr1.i */
public final class C8399i extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27391d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8399i(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27391d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        View findViewById = this.f27391d.getSeekLayout().findViewById(C0966R.C0970id.a2r);
        FinderFullSeekBarLayout finderFullSeekBarLayout = this.f27391d;
        boolean[] zArr = {false};
        if (findViewById != null) {
            findViewById.setOnTouchListener(new C8392g(zArr));
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new C8395h(zArr, finderFullSeekBarLayout));
        }
        int b = C76577a.m92151b(finderFullSeekBarLayout.getContext(), 1);
        findViewById.setBackgroundResource(C0966R.C0969drawable.b8k);
        findViewById.setMinimumWidth(finderFullSeekBarLayout.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3758d_));
        int i = b * 4;
        findViewById.setPadding(b * 10, i, b * 8, i);
        return findViewById;
    }
}
