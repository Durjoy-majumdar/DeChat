package com.tencent.p014mm.plugin.finder.view;

import android.widget.SeekBar;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.s4 */
public final class C105318s4 extends C87413o implements C32224a<SeekBar> {

    /* renamed from: d */
    public final /* synthetic */ FinderProgressBar f312946d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105318s4(FinderProgressBar finderProgressBar) {
        super(0);
        this.f312946d = finderProgressBar;
    }

    public Object invoke() {
        SeekBar seekBar = (SeekBar) this.f312946d.findViewById(C0966R.C0970id.j8m);
        seekBar.setOnSeekBarChangeListener(this.f312946d);
        return seekBar;
    }
}
