package p659qe;

import com.tencent.matrix.lifecycle.C80407h;

/* renamed from: qe.m */
public final class C89615m implements C80407h {

    /* renamed from: d */
    public final /* synthetic */ C89613l f257816d;

    public C89615m(C89613l lVar) {
        this.f257816d = lVar;
    }

    public void off() {
        C89613l lVar = this.f257816d;
        lVar.f257812a.removeCallbacks(lVar.f257813b);
    }

    /* renamed from: on */
    public void mo60742on() {
        C89613l lVar = this.f257816d;
        lVar.f257812a.postDelayed(lVar.f257813b, lVar.f257814c.f257823g);
    }
}
