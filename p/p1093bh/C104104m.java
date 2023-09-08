package p1093bh;

import android.graphics.Rect;
import p1158tg.C110980a;

/* renamed from: bh.m */
public class C104104m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ float f307982d;

    /* renamed from: e */
    public final /* synthetic */ float f307983e;

    /* renamed from: f */
    public final /* synthetic */ float f307984f;

    /* renamed from: g */
    public final /* synthetic */ C104106o f307985g;

    public C104104m(C104106o oVar, float f, float f2, float f3) {
        this.f307985g = oVar;
        this.f307982d = f;
        this.f307983e = f2;
        this.f307984f = f3;
    }

    public void run() {
        C104106o oVar = this.f307985g;
        C110980a aVar = oVar.f307994e.f307901C;
        aVar.f332393k = 100;
        float f = this.f307982d;
        Rect rect = oVar.f307993d;
        float f2 = this.f307983e;
        float f3 = this.f307984f;
        aVar.f332388f = f2;
        aVar.f332389g = f3;
        aVar.f332390h = rect;
        aVar.f332391i.set(rect);
        aVar.f332387e = f;
        aVar.mo162648b();
    }
}
