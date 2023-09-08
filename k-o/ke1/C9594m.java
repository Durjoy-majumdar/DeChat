package ke1;

import c14.C54625h;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import je1.C9372s;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49173do1;
import te3.C49712hj1;
import te3.C51981xj0;
import te3.db4;
import u60.C14121l;

/* renamed from: ke1.m */
public final class C9594m extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f29835d;

    /* renamed from: e */
    public final /* synthetic */ C49712hj1 f29836e;

    /* renamed from: f */
    public final /* synthetic */ FinderObject f29837f;

    /* renamed from: g */
    public final /* synthetic */ List<db4> f29838g;

    /* renamed from: h */
    public final /* synthetic */ List<C49173do1> f29839h;

    /* renamed from: i */
    public final /* synthetic */ int f29840i;

    /* renamed from: j */
    public final /* synthetic */ int f29841j;

    /* renamed from: n */
    public final /* synthetic */ C54625h<C89132b.C89134c<C51981xj0>> f29842n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9594m(int i, C49712hj1 hj12, FinderObject finderObject, List<? extends db4> list, List<? extends C49173do1> list2, int i2, int i3, C54625h<C89132b.C89134c<C51981xj0>> hVar) {
        super(1);
        this.f29835d = i;
        this.f29836e = hj12;
        this.f29837f = finderObject;
        this.f29838g = list;
        this.f29839h = list2;
        this.f29840i = i2;
        this.f29841j = i3;
        this.f29842n = hVar;
    }

    public Object invoke(Object obj) {
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C58784w3.f168295a.mo83914a0(this.f29835d), "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        new C9372s(this.f29836e, this.f29837f, C89349b.m111674a(Util.decodeHexString((String) f)), this.f29838g, this.f29839h, this.f29835d, this.f29840i, this.f29841j).mo9225i().mo123419C(new C9593l(lVar, this.f29842n));
        return C13598b0.f38549a;
    }
}
