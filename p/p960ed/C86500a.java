package p960ed;

import android.graphics.PointF;
import android.util.Size;
import android.view.Surface;
import gy3.C8480h;
import gy3.C87412m;
import p301cd.C79999m;
import p301cd.C80005q;
import p830xc.C91165a;
import p960ed.C86505e;

/* renamed from: ed.a */
public final class C86500a implements C86505e, C86502b, C86503c, C86504d {

    /* renamed from: g */
    public static final C86501a f251329g = new C86501a((C8480h) null);

    /* renamed from: d */
    public final C86500a f251330d = this;

    /* renamed from: e */
    public final C86500a f251331e = this;

    /* renamed from: f */
    public final C86500a f251332f = this;

    /* renamed from: ed.a$a */
    public static final class C86501a implements C86505e.C86506a {
        public C86501a(C8480h hVar) {
        }

        /* renamed from: a */
        public C86505e mo120984a(C80005q qVar, C79999m mVar) {
            C87412m.m108594g(qVar, "livePusherBroker");
            C87412m.m108594g(mVar, "livePusher");
            return new C86500a(qVar, mVar);
        }
    }

    public C86500a(C80005q qVar, C79999m mVar) {
        C87412m.m108594g(qVar, "livePusherBroker");
        C87412m.m108594g(mVar, "livePusher");
    }

    /* renamed from: d */
    public void mo120972d(int i) {
    }

    /* renamed from: e */
    public boolean mo120973e(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
        return false;
    }

    /* renamed from: k */
    public void mo120974k(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
    }

    /* renamed from: n */
    public void mo120975n(int i) {
    }

    /* renamed from: o */
    public void mo120976o(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
    }

    /* renamed from: q */
    public void mo120977q() {
    }

    /* renamed from: r */
    public void mo120978r(PointF pointF) {
        C87412m.m108594g(pointF, "pos");
    }

    /* renamed from: s */
    public C86502b mo120979s() {
        return this.f251330d;
    }

    /* renamed from: t */
    public C86504d mo120980t() {
        return this.f251332f;
    }

    /* renamed from: u */
    public void mo120981u(Size size) {
        C87412m.m108594g(size, "size");
    }

    /* renamed from: w */
    public void mo120982w(Surface surface) {
        C87412m.m108594g(surface, "previewSurface");
    }

    /* renamed from: z */
    public C86503c mo120983z() {
        return this.f251331e;
    }
}
