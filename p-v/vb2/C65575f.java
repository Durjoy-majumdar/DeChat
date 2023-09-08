package vb2;

import com.tencent.p014mm.plugin.p081mv.p082ui.widget.RangeSliderView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8478d0;
import gy3.C87412m;
import vb2.C65567d;

/* renamed from: vb2.f */
public final class C65575f implements RangeSliderView.C57145a {

    /* renamed from: a */
    public final /* synthetic */ C65567d f188679a;

    /* renamed from: b */
    public final /* synthetic */ int f188680b;

    /* renamed from: c */
    public final /* synthetic */ C8478d0 f188681c;

    /* renamed from: d */
    public final /* synthetic */ C65567d.C65572e f188682d;

    /* renamed from: vb2.f$a */
    public static final class C65576a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65567d f188683d;

        public C65576a(C65567d dVar) {
            this.f188683d = dVar;
        }

        public final void run() {
            C65567d dVar = this.f188683d;
            int size = dVar.f188664e.getTracks().size();
            dVar.getClass();
            dVar.notifyItemChanged(size + 1);
        }
    }

    public C65575f(C65567d dVar, int i, C8478d0 d0Var, C65567d.C65572e eVar) {
        this.f188679a = dVar;
        this.f188680b = i;
        this.f188681c = d0Var;
        this.f188682d = eVar;
    }

    /* renamed from: a */
    public void mo80722a(int i, int i2) {
        this.f188679a.f188663d.mo80675a(this.f188680b, (long) (((float) (this.f188681c.f27483d + i2)) / this.f188679a.f188664e.getWidthPerMills()));
        Log.m105924i("MicroMsg.MvTracksAdapter", "onRangeEndChanged: " + i2);
    }

    /* renamed from: b */
    public void mo80723b(RangeSliderView.C57146b bVar, int i, int i2) {
        C87412m.m108594g(bVar, "edge");
        Log.m105924i("MicroMsg.MvTracksAdapter", "onSlidingStopped: " + i + ", " + i2);
        long widthPerMills = (long) (((float) i) / this.f188679a.f188664e.getWidthPerMills());
        long widthPerMills2 = (long) (((float) (i2 + this.f188681c.f27483d)) / this.f188679a.f188664e.getWidthPerMills());
        this.f188682d.f188668A.post(new C65576a(this.f188679a));
        this.f188679a.f188663d.mo80679e(this.f188680b, widthPerMills, widthPerMills2);
    }

    /* renamed from: c */
    public void mo80724c(RangeSliderView.C57146b bVar, int i, int i2) {
        C87412m.m108594g(bVar, "edge");
        Log.m105924i("MicroMsg.MvTracksAdapter", "onSlidingStarted: " + i + ", " + i2);
        this.f188679a.f188663d.mo80676b(this.f188680b, (long) (((float) i) / this.f188679a.f188664e.getWidthPerMills()), (long) (((float) i2) / this.f188679a.f188664e.getWidthPerMills()));
    }

    /* renamed from: d */
    public void mo80725d(int i, int i2) {
        this.f188679a.f188663d.mo80677c(this.f188680b, (long) (((float) i2) / this.f188679a.f188664e.getWidthPerMills()));
        Log.m105924i("MicroMsg.MvTracksAdapter", "onRangeStartChanged: " + i2);
    }
}
