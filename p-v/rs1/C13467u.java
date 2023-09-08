package rs1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: rs1.u */
public final class C13467u extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ FinderObject f38170d;

    /* renamed from: e */
    public final /* synthetic */ long f38171e;

    /* renamed from: f */
    public final /* synthetic */ boolean f38172f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13467u(FinderObject finderObject, long j, boolean z) {
        super(0);
        this.f38170d = finderObject;
        this.f38171e = j;
        this.f38172f = z;
    }

    public Object invoke() {
        return "feedId=" + this.f38170d.f164794id + " aid=" + this.f38171e + " hasComponent=" + this.f38172f;
    }
}
