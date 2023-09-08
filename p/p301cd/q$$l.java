package p301cd;

import p830xc.C91165a;
import p910lj.C76701a;

/* renamed from: cd.q$$l */
public final /* synthetic */ class q$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91165a f234366d;

    /* renamed from: e */
    public final /* synthetic */ String f234367e;

    public /* synthetic */ q$$l(C91165a aVar, String str) {
        this.f234366d = aVar;
        this.f234367e = str;
    }

    public final void run() {
        C91165a aVar = this.f234366d;
        C76701a.makeText(aVar.getContext(), (CharSequence) this.f234367e, 0).show();
    }
}
