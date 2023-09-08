package vf1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50942qc1;

/* renamed from: vf1.v0 */
public final class C14838v0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C14844x0 f40837a;

    public C14838v0(C14844x0 x0Var) {
        this.f40837a = x0Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C14844x0 x0Var = this.f40837a;
        int i = cVar.f256794b;
        int i2 = cVar.f256793a;
        LinkedList<FinderObject> linkedList = ((C50942qc1) cVar.f256796d).f140238d;
        C87412m.m108593f(linkedList, "it.resp.object_list");
        C50942qc1 qc12 = (C50942qc1) cVar.f256796d;
        C14844x0.m14103e(x0Var, i, i2, linkedList, qc12.f140240f, qc12.f140239e);
        return C13598b0.f38549a;
    }
}
