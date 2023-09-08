package r80;

import android.media.MediaFormat;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: r80.i */
public final class C110523i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110536p f330503d;

    /* renamed from: e */
    public final /* synthetic */ MediaFormat f330504e;

    public C110523i(C110536p pVar, MediaFormat mediaFormat) {
        this.f330503d = pVar;
        this.f330504e = mediaFormat;
    }

    public final void run() {
        C110536p pVar = this.f330503d;
        C32227p<? super MediaFormat, ? super C110536p, C13598b0> pVar2 = pVar.f330542c;
        if (pVar2 != null) {
            pVar2.invoke(this.f330504e, pVar);
        }
    }
}
