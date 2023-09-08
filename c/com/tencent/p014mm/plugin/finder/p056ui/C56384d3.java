package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import android.widget.SeekBar;
import er1.C58784w3;
import fy3.C32227p;
import gr1.C59664m2;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import sp3.C36777d;
import sx3.C26236u;
import te3.C64689rq2;

/* renamed from: com.tencent.mm.plugin.finder.ui.d3 */
public final class C56384d3 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: d */
    public final C32227p<Long, Bitmap, C13598b0> f161198d;

    /* renamed from: e */
    public long f161199e = -1;

    /* renamed from: f */
    public final /* synthetic */ FinderSelectCoverUI f161200f;

    /* renamed from: g */
    public final /* synthetic */ C64689rq2 f161201g;

    /* renamed from: h */
    public final /* synthetic */ long f161202h;

    /* renamed from: com.tencent.mm.plugin.finder.ui.d3$a */
    public static final class C56385a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectCoverUI f161203d;

        /* renamed from: e */
        public final /* synthetic */ C64689rq2 f161204e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56385a(FinderSelectCoverUI finderSelectCoverUI, C64689rq2 rq22) {
            super(2);
            this.f161203d = finderSelectCoverUI;
            this.f161204e = rq22;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            Bitmap bitmap = (Bitmap) obj2;
            if (bitmap != null) {
                FinderSelectCoverUI.m64622O7(this.f161203d, this.f161204e, bitmap);
            }
            return C13598b0.f38549a;
        }
    }

    public C56384d3(FinderSelectCoverUI finderSelectCoverUI, C64689rq2 rq22, long j) {
        this.f161200f = finderSelectCoverUI;
        this.f161201g = rq22;
        this.f161202h = j;
        this.f161198d = new C56385a(finderSelectCoverUI, rq22);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar seekBar2 = this.f161200f.f161088A;
        if (seekBar2 != null) {
            long max = (long) ((((double) i) / ((double) seekBar2.getMax())) * ((double) this.f161202h));
            C59664m2 m2Var = this.f161200f.f161089B;
            if (m2Var != null) {
                m2Var.seekTo(max);
                if (!C58784w3.f168295a.mo83894P0(this.f161201g)) {
                    C36777d dVar = this.f161200f.f161092E;
                    if (dVar != null) {
                        dVar.mo58664a(this.f161199e);
                    }
                    C36777d dVar2 = this.f161200f.f161092E;
                    if (dVar2 != null) {
                        dVar2.mo58665b(C26236u.m33719b(Long.valueOf(max)), this.f161198d);
                    }
                    this.f161199e = max;
                    return;
                }
                return;
            }
            C87412m.m108603p("seeker");
            throw null;
        }
        C87412m.m108603p("seekBar");
        throw null;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
