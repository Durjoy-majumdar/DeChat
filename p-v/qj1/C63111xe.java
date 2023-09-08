package qj1;

import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import gy3.C87412m;
import o40.C61926c;
import te3.C49712hj1;

/* renamed from: qj1.xe */
public final class C63111xe extends C62660c {

    /* renamed from: p */
    public final C58124b f179099p;

    /* renamed from: q */
    public final int f179100q = 3;

    /* renamed from: r */
    public int f179101r = 3;

    /* renamed from: s */
    public final TextView f179102s;

    /* renamed from: t */
    public final MTimerHandler f179103t;

    /* renamed from: qj1.xe$a */
    public static final class C63112a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C63111xe f179104d;

        public C63112a(C63111xe xeVar) {
            this.f179104d = xeVar;
        }

        public final boolean onTimerExpired() {
            C63111xe xeVar = this.f179104d;
            int i = xeVar.f179101r;
            xeVar.getClass();
            if (i > 0) {
                C63111xe xeVar2 = this.f179104d;
                xeVar2.f179101r--;
                xeVar2.getClass();
                C61926c.m72668M(new C63143ye(xeVar2));
                return true;
            }
            C63111xe xeVar3 = this.f179104d;
            xeVar3.getClass();
            C61926c.m72668M(new C63091we(xeVar3));
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63111xe(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179099p = bVar;
        this.f179102s = (TextView) viewGroup.findViewById(C0966R.C0970id.dzs);
        this.f179103t = new MTimerHandler("FinderLiveSwitchModeTimer", (MTimerHandler.CallBack) new C63112a(this), true);
    }

    /* renamed from: Z0 */
    public final void mo88040Z0() {
        mo10792g(0);
        this.f179103t.stopTimer();
        this.f179103t.startTimer(1000, 1000);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
