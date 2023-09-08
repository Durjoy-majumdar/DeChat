package gr1;

import android.widget.SeekBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.f0 */
public final class C8391f0 extends C87413o implements C32224a<SeekBar> {

    /* renamed from: d */
    public final /* synthetic */ FinderFullSeekBarLayout f27382d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8391f0(FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f27382d = finderFullSeekBarLayout;
    }

    public Object invoke() {
        SeekBar seekBar = (SeekBar) this.f27382d.getSeekLayout().findViewById(C0966R.C0970id.f358957i24);
        seekBar.setOnSeekBarChangeListener(this.f27382d);
        return seekBar;
    }
}
