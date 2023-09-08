package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import android.widget.SeekBar;
import er1.C58784w3;
import fy3.C32224a;
import gr1.C59664m2;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import sp3.C36777d;
import sx3.C26236u;
import te3.C64689rq2;

/* renamed from: com.tencent.mm.plugin.finder.ui.f3 */
public final class C56387f3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161207d;

    /* renamed from: e */
    public final /* synthetic */ long f161208e;

    /* renamed from: f */
    public final /* synthetic */ long f161209f;

    /* renamed from: g */
    public final /* synthetic */ C64689rq2 f161210g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56387f3(FinderSelectCoverUI finderSelectCoverUI, long j, long j2, C64689rq2 rq22) {
        super(0);
        this.f161207d = finderSelectCoverUI;
        this.f161208e = j;
        this.f161209f = j2;
        this.f161210g = rq22;
    }

    public Object invoke() {
        C36777d dVar;
        SeekBar seekBar = this.f161207d.f161088A;
        if (seekBar != null) {
            seekBar.setEnabled(true);
            View view = this.f161207d.f161090C;
            if (view != null) {
                view.setEnabled(true);
                FinderSelectCoverUI finderSelectCoverUI = this.f161207d;
                SeekBar seekBar2 = finderSelectCoverUI.f161088A;
                if (seekBar2 != null) {
                    seekBar2.setOnSeekBarChangeListener(new C56384d3(finderSelectCoverUI, this.f161210g, this.f161209f));
                    C59664m2 m2Var = this.f161207d.f161089B;
                    if (m2Var != null) {
                        m2Var.seekTo(0);
                        if (this.f161208e > 0) {
                            SeekBar seekBar3 = this.f161207d.f161088A;
                            if (seekBar3 != null) {
                                long max = (((long) seekBar3.getMax()) * this.f161208e) / this.f161209f;
                                SeekBar seekBar4 = this.f161207d.f161088A;
                                if (seekBar4 != null) {
                                    seekBar4.setProgress((int) max);
                                } else {
                                    C87412m.m108603p("seekBar");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("seekBar");
                                throw null;
                            }
                        }
                        if (!C58784w3.f168295a.mo83894P0(this.f161210g) && (dVar = this.f161207d.f161092E) != null) {
                            dVar.mo58665b(C26236u.m33719b(0L), new C56386e3(this.f161207d, this.f161210g));
                        }
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("seeker");
                    throw null;
                }
                C87412m.m108603p("seekBar");
                throw null;
            }
            C87412m.m108603p("selectBtn");
            throw null;
        }
        C87412m.m108603p("seekBar");
        throw null;
    }
}
