package com.tencent.p014mm.plugin.finder.p056ui;

import android.widget.SeekBar;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.g3 */
public final class C56390g3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161220d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56390g3(FinderSelectCoverUI finderSelectCoverUI) {
        super(0);
        this.f161220d = finderSelectCoverUI;
    }

    public Object invoke() {
        SeekBar seekBar = this.f161220d.f161088A;
        if (seekBar != null) {
            seekBar.setEnabled(false);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("seekBar");
        throw null;
    }
}
