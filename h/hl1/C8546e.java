package hl1;

import a14.C0000n0;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.ResultKt;
import qj1.C12738xf;
import rx3.C13598b0;
import te3.C48682a91;
import te3.C52033xx0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorEndUIC$requestFinderLiveEndNav$$inlined$success$default$1", mo125469f = "FinderLiveVisitorEndUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: hl1.e */
public final class C8546e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f27616d;

    /* renamed from: e */
    public final /* synthetic */ C59974g f27617e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8546e(C0287e eVar, C15601d dVar, C59974g gVar) {
        super(2, dVar);
        this.f27616d = eVar;
        this.f27617e = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8546e(this.f27616d, dVar, this.f27617e);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8546e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C52033xx0 xx02 = (C52033xx0) ((C0288f) this.f27616d).f855b;
        Log.m105924i("Finder.FinderLiveVisitorEndUIC", "#requestFinderLiveEndNav good size=" + xx02.f145011d.size());
        LinkedList<C48682a91> linkedList = xx02.f145011d;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C48682a91 a912 = (C48682a91) it.next();
                if (a912.f130378e == 6) {
                    C12738xf xfVar = this.f27617e.f171121i;
                    if (xfVar != null) {
                        xfVar.mo12280d1(a912);
                    }
                }
            }
            return C13598b0.f38549a;
        }
        C12738xf xfVar2 = this.f27617e.f171121i;
        if (xfVar2 != null) {
            xfVar2.mo12280d1((C48682a91) null);
        }
        return C13598b0.f38549a;
    }
}
