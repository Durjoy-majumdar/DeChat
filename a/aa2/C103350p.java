package aa2;

import android.graphics.Bitmap;
import gy3.C8479f0;
import l92.C109296d;

/* renamed from: aa2.p */
public final class C103350p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109296d f304759d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Bitmap> f304760e;

    public C103350p(C109296d dVar, C8479f0<Bitmap> f0Var) {
        this.f304759d = dVar;
        this.f304760e = f0Var;
    }

    public final void run() {
        C109296d dVar = this.f304759d;
        if (dVar != null) {
            C109296d.C109297a.m148407c(dVar, (Bitmap) this.f304760e.f27484d, false, 0, 6, (Object) null);
        }
    }
}
