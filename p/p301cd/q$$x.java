package p301cd;

import android.view.MotionEvent;

/* renamed from: cd.q$$x */
public class q$$x implements Runnable {

    /* renamed from: d */
    public MotionEvent f234396d;

    /* renamed from: e */
    public final /* synthetic */ C80005q f234397e;

    public q$$x(C80005q qVar, C80010t tVar) {
        this.f234397e = qVar;
    }

    public void run() {
        C80005q qVar = this.f234397e;
        if (qVar.f234338w && qVar.f234333r != 0 && qVar.f234334s != 0) {
            qVar.mo110211A(this.f234396d.getX(), this.f234396d.getY());
        }
    }
}
