package r80;

import android.media.MediaFormat;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: r80.k */
public final class C110530k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110536p f330525d;

    /* renamed from: e */
    public final /* synthetic */ MediaFormat f330526e;

    public C110530k(C110536p pVar, MediaFormat mediaFormat) {
        this.f330525d = pVar;
        this.f330526e = mediaFormat;
    }

    public final void run() {
        C110536p pVar = this.f330525d;
        C32227p<? super MediaFormat, ? super C110536p, C13598b0> pVar2 = pVar.f330542c;
        if (pVar2 != null) {
            pVar2.invoke(this.f330526e, pVar);
        }
    }
}
