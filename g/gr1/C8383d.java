package gr1;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.d */
public final class C8383d extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27374d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8383d(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27374d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        return (TextView) this.f27374d.getSeekLayout().findViewById(C0966R.C0970id.f358639g73);
    }
}
