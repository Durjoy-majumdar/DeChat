package gr1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;
import up1.C37521f;

/* renamed from: gr1.e0 */
public final class C8387e0 extends C87413o implements C32224a<WeImageView> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27378d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8387e0(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27378d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        WeImageView weImageView;
        C37521f.f99374d.getClass();
        if (C37521f.f99208J7.mo60266n().intValue() == 0) {
            View c = this.f27378d.getAwesomePrivateLayout();
            WeImageView weImageView2 = c != null ? (WeImageView) c.findViewById(C0966R.C0970id.j8q) : null;
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
            View c2 = this.f27378d.getAwesomePrivateLayout();
            if (c2 == null || (weImageView = (WeImageView) c2.findViewById(C0966R.C0970id.muu)) == null) {
                return null;
            }
            weImageView.setVisibility(0);
        } else {
            View c3 = this.f27378d.getAwesomePrivateLayout();
            WeImageView weImageView3 = c3 != null ? (WeImageView) c3.findViewById(C0966R.C0970id.muu) : null;
            if (weImageView3 != null) {
                weImageView3.setVisibility(8);
            }
            View c4 = this.f27378d.getAwesomePrivateLayout();
            if (c4 == null || (weImageView = (WeImageView) c4.findViewById(C0966R.C0970id.j8q)) == null) {
                return null;
            }
            weImageView.setVisibility(0);
        }
        return weImageView;
    }
}
