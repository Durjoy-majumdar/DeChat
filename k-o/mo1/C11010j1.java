package mo1;

import a14.C0000n0;
import cm1.C0714b2;
import cm1.C0740i2;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import p272xq.C102712e;
import p749xh.C102666r2;
import pb1.C11883v0;
import rx3.C13598b0;
import te3.C64726td1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.profile.uic.FinderProfileQQMusicFavUIC$queryFavList$1", mo125469f = "FinderProfileQQMusicFavUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: mo1.j1 */
public final class C11010j1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ List<C0740i2> f32727d;

    /* renamed from: e */
    public final /* synthetic */ C11013k1 f32728e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C0714b2, C13598b0> f32729f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11010j1(List<? extends C0740i2> list, C11013k1 k1Var, C32226l<? super C0714b2, C13598b0> lVar, C15601d<? super C11010j1> dVar) {
        super(2, dVar);
        this.f32727d = list;
        this.f32728e = k1Var;
        this.f32729f = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11010j1(this.f32727d, this.f32728e, this.f32729f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11010j1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        List<C0740i2> list = this.f32727d;
        if (list != null) {
            C11013k1 k1Var = this.f32728e;
            C32226l<C0714b2, C13598b0> lVar = this.f32729f;
            for (C0740i2 i2Var : list) {
                if (i2Var instanceof C0714b2) {
                    C0714b2 b2Var = (C0714b2) i2Var;
                    if (!k1Var.mo11172c3(b2Var, lVar)) {
                        C64726td1 td12 = b2Var.f1712e;
                        String str = td12 != null ? td12.f185537g : null;
                        if (!(str == null || str.length() == 0)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(str);
                            ArrayList<C102666r2> Lf = ((C102712e) C86312j.m106911c(C102712e.class)).mo142092Lf(arrayList, new ArrayList(), 7, (List<C102666r2>) null, (Set<Integer>) null, (C11883v0) null);
                            if (Lf != null) {
                                for (C102666r2 r2Var : Lf) {
                                    k1Var.f32733d.put(r2Var.field_sourceId, r2Var);
                                }
                            }
                            k1Var.mo11172c3(b2Var, lVar);
                        }
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
