package rs1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.HardTouchableLayout;
import gy3.C87412m;
import ls1.C61391g;
import zt3.C119157j;

/* renamed from: rs1.ra */
public final class C63623ra implements HardTouchableLayout.C7074a {

    /* renamed from: a */
    public final /* synthetic */ FinderTabUIC f180394a;

    /* renamed from: rs1.ra$a */
    public static final class C63624a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTabUIC f180395d;

        public C63624a(FinderTabUIC finderTabUIC) {
            this.f180395d = finderTabUIC;
        }

        public final void run() {
            this.f180395d.getActiveFragment().mo4177S();
        }
    }

    public C63623ra(FinderTabUIC finderTabUIC) {
        this.f180394a = finderTabUIC;
    }

    /* renamed from: a */
    public void mo2343a(View view, MotionEvent motionEvent) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(motionEvent, "e");
        Log.m105924i("Finder.FinderTabUIC", "onDoubleClick");
        ((C119157j) C119157j.f356862d).mo183895z(new C63624a(this.f180394a));
        FinderTabUIC finderTabUIC = this.f180394a;
        C61391g I3 = finderTabUIC.mo80037I3(finderTabUIC.mo80036G3());
        if (I3 != null) {
            FinderTabUIC finderTabUIC2 = this.f180394a;
            finderTabUIC2.mo80040L3().mo10909c(finderTabUIC2.getActivity(), I3);
        }
    }
}
