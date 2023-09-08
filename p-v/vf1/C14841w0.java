package vf1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49157dk1;

/* renamed from: vf1.w0 */
public final class C14841w0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C14844x0 f40840a;

    public C14841w0(C14844x0 x0Var) {
        this.f40840a = x0Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C14844x0 x0Var = this.f40840a;
        int i = cVar.f256794b;
        int i2 = cVar.f256793a;
        LinkedList<FinderObject> linkedList = ((C49157dk1) cVar.f256796d).f132378d;
        C87412m.m108593f(linkedList, "it.resp.object_list");
        C49157dk1 dk12 = (C49157dk1) cVar.f256796d;
        C14844x0.m14103e(x0Var, i, i2, linkedList, dk12.f132379e, dk12.f132380f);
        return C13598b0.f38549a;
    }
}
