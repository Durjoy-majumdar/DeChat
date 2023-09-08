package p301cd;

import android.view.ScaleGestureDetector;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: cd.q$$a */
public final /* synthetic */ class q$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234351d;

    public /* synthetic */ q$$a(C80005q qVar) {
        this.f234351d = qVar;
    }

    public final void run() {
        C80005q qVar = this.f234351d;
        qVar.getClass();
        qVar.f234341z = new ScaleGestureDetector(MMApplicationContext.getContext(), qVar.f234319I);
    }
}
