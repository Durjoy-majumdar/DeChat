package uz0;

import fy3.C32224a;
import rx3.C13598b0;
import uz0.C22676g;

/* renamed from: uz0.e */
public final class C22672e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22676g.C22677a f65205d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f65206e;

    public C22672e(C22676g.C22677a aVar, C32224a<C13598b0> aVar2) {
        this.f65205d = aVar;
        this.f65206e = aVar2;
    }

    public final void run() {
        C22676g.C22677a aVar = this.f65205d;
        aVar.f65221z = aVar.f44854d.getHeight();
        C22676g.C22677a aVar2 = this.f65205d;
        aVar2.f65213A = aVar2.f44854d.getWidth();
        this.f65206e.invoke();
    }
}
