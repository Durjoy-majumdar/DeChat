package gr1;

import android.view.ViewConfiguration;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.q0 */
public final class C8422q0 extends C87413o implements C32224a<Integer> {

    /* renamed from: d */
    public final /* synthetic */ FinderLongVideoPlayerSeekBar f27418d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8422q0(FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar) {
        super(0);
        this.f27418d = finderLongVideoPlayerSeekBar;
    }

    public Object invoke() {
        return Integer.valueOf(ViewConfiguration.get(this.f27418d.getContext()).getScaledTouchSlop());
    }
}
