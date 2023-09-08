package p301cd;

import p830xc.C91165a;
import p910lj.C76701a;

/* renamed from: cd.q$$k */
public final /* synthetic */ class q$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91165a f234364d;

    /* renamed from: e */
    public final /* synthetic */ String f234365e;

    public /* synthetic */ q$$k(C91165a aVar, String str) {
        this.f234364d = aVar;
        this.f234365e = str;
    }

    public final void run() {
        C91165a aVar = this.f234364d;
        C76701a.makeText(aVar.getContext(), (CharSequence) this.f234365e, 0).show();
    }
}
