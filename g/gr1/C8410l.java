package gr1;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.l */
public final class C8410l extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27407d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8410l(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27407d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        return (TextView) this.f27407d.getSeekLayout().findViewById(C0966R.C0970id.l59);
    }
}
