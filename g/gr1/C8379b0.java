package gr1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.b0 */
public final class C8379b0 extends C87413o implements C32224a<WeImageView> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27370d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8379b0(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27370d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        return (WeImageView) this.f27370d.getSeekLayout().findViewById(C0966R.C0970id.j8s);
    }
}
