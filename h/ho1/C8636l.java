package ho1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import te3.C51692vg1;
import vp1.C14937o;

/* renamed from: ho1.l */
public final class C8636l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C51692vg1> f27769d;

    /* renamed from: e */
    public final /* synthetic */ String f27770e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8636l(List<? extends C51692vg1> list, String str) {
        super(0);
        this.f27769d = list;
        this.f27770e = str;
    }

    public Object invoke() {
        LinkedList linkedList = new LinkedList();
        for (C51692vg1 pVar : this.f27769d) {
            linkedList.add(new C8643p(262144, pVar));
        }
        Log.m105924i("Finder.UserPoiHandler", "[saveData] infoList.size=" + this.f27769d.size() + ", firstPage.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            C14937o.f40972a.mo13980a(20, this.f27770e, linkedList);
        }
        return C13598b0.f38549a;
    }
}
