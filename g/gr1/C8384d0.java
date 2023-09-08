package gr1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.d0 */
public final class C8384d0 extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27375d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8384d0(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27375d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        View c = this.f27375d.getAwesomePrivateLayout();
        if (c != null) {
            return (TextView) c.findViewById(C0966R.C0970id.j8r);
        }
        return null;
    }
}
