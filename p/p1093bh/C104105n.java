package p1093bh;

import android.graphics.Rect;
import p1158tg.C110980a;

/* renamed from: bh.n */
public class C104105n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ float f307986d;

    /* renamed from: e */
    public final /* synthetic */ float f307987e;

    /* renamed from: f */
    public final /* synthetic */ float f307988f;

    /* renamed from: g */
    public final /* synthetic */ C104106o f307989g;

    public C104105n(C104106o oVar, float f, float f2, float f3) {
        this.f307989g = oVar;
        this.f307986d = f;
        this.f307987e = f2;
        this.f307988f = f3;
    }

    public void run() {
        C104106o oVar = this.f307989g;
        C110980a aVar = oVar.f307994e.f307901C;
        aVar.f332393k = 1000;
        float f = this.f307986d;
        Rect rect = oVar.f307993d;
        float f2 = this.f307987e;
        float f3 = this.f307988f;
        aVar.f332388f = f2;
        aVar.f332389g = f3;
        aVar.f332390h = rect;
        aVar.f332391i.set(rect);
        aVar.f332387e = f;
        this.f307989g.f307994e.f307901C.mo162648b();
    }
}
