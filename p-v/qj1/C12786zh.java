package qj1;

import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;

/* renamed from: qj1.zh */
public final class C12786zh extends C12252b {

    /* renamed from: q */
    public final C58124b f36606q;

    /* renamed from: r */
    public View f36607r;

    /* renamed from: s */
    public final C13601g f36608s = C36568h.m40985a(new C12787a(this));

    /* renamed from: qj1.zh$a */
    public static final class C12787a extends C87413o implements C32224a<Runnable> {

        /* renamed from: d */
        public final /* synthetic */ C12786zh f36609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12787a(C12786zh zhVar) {
            super(0);
            this.f36609d = zhVar;
        }

        public Object invoke() {
            return new C12763yh(this.f36609d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12786zh(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36606q = bVar;
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
