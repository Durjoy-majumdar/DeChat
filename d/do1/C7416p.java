package do1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import os1.C11749q;

/* renamed from: do1.p */
public final class C7416p extends C87413o implements C32226l<FinderObject, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C11749q f25586d;

    /* renamed from: e */
    public final /* synthetic */ C58341h f25587e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7416p(C11749q qVar, C58341h hVar) {
        super(1);
        this.f25586d = qVar;
        this.f25587e = hVar;
    }

    public Object invoke(Object obj) {
        FinderObject finderObject = (FinderObject) obj;
        C87412m.m108594g(finderObject, "feed");
        boolean d3 = this.f25586d.mo11613d3(finderObject.f164794id);
        if (d3) {
            String str = this.f25587e.f167027c;
            Log.m105924i(str, "refreshFirstPage: remove read feed, id = " + C61926c.m72691p(finderObject.f164794id));
        }
        return Boolean.valueOf(d3);
    }
}
