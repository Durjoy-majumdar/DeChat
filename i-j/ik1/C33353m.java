package ik1;

import fy3.C32226l;
import gy3.C87413o;
import p749xh.C38624o3;

/* renamed from: ik1.m */
public final class C33353m extends C87413o implements C32226l<C38624o3, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C38624o3 f90400d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33353m(C38624o3 o3Var) {
        super(1);
        this.f90400d = o3Var;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(((C38624o3) obj).field_liveId == this.f90400d.field_liveId);
    }
}
