package ho1;

import cm1.C0716c;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;
import te3.C51692vg1;
import vp1.C14937o;

/* renamed from: ho1.g */
public final class C8630g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f27758d;

    /* renamed from: e */
    public final /* synthetic */ C8626e f27759e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8630g(String str, C8626e eVar) {
        super(0);
        this.f27758d = str;
        this.f27759e = eVar;
    }

    public Object invoke() {
        C8644q qVar;
        C51692vg1 vg12;
        List<C0740i2> h = C14937o.f40972a.mo13987h(20, this.f27758d);
        LinkedList linkedList = new LinkedList();
        for (C0740i2 i2Var : h) {
            if (!(!(i2Var instanceof C0716c) || (qVar = ((C0716c) i2Var).f1724d.f39810e) == null || (vg12 = qVar.f27795a) == null)) {
                linkedList.add(vg12);
            }
        }
        Log.m105924i("Finder.UserPoiHandler", "[loadLocalData] infoList.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            C61926c.m72668M(new C8629f(this.f27759e, linkedList));
        }
        return C13598b0.f38549a;
    }
}
