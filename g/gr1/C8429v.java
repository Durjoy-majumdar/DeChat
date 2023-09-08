package gr1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.v */
public final class C8429v extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27425d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8429v(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27425d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        View findViewById = this.f27425d.getSeekLayout().findViewById(C0966R.C0970id.egp);
        findViewById.setOnClickListener(new C8428u(this.f27425d));
        return findViewById;
    }
}
