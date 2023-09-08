package p1017od;

import com.tencent.magicbrush.C80301a;
import fy3.C32224a;
import gy3.C87412m;

/* renamed from: od.k$$b */
public final /* synthetic */ class k$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32224a f256951d;

    /* renamed from: e */
    public final /* synthetic */ C80301a f256952e;

    public /* synthetic */ k$$b(C32224a aVar, C80301a aVar2) {
        this.f256951d = aVar;
        this.f256952e = aVar2;
    }

    public final void run() {
        C32224a aVar = this.f256951d;
        C80301a aVar2 = this.f256952e;
        C87412m.m108594g(aVar, "$fn");
        C87412m.m108594g(aVar2, "this$0");
        C89201o oVar = (C89201o) aVar.invoke();
        aVar2.nativeBindTo(aVar2.f235052a, oVar.f257030a, oVar.f257031b, oVar.f257032c);
    }
}
