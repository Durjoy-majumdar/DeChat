package g03;

import android.graphics.Bitmap;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: g03.u */
public final class C107691u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107681p f322199d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f322200e;

    public C107691u(C107681p pVar, Bitmap bitmap) {
        this.f322199d = pVar;
        this.f322200e = bitmap;
    }

    public final void run() {
        C32226l<? super Bitmap, C13598b0> lVar = this.f322199d.f322156G;
        if (lVar != null) {
            lVar.invoke(this.f322200e);
        }
    }
}
