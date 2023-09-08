package fk3;

import a14.C0000n0;
import a14.C53930o0;
import android.util.Pair;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import p157gk.C59481e;
import p157gk.C59491j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.query.MediaHistoryQueryHeaderUI$initView$4", mo125469f = "MediaHistoryQueryHeaderUI.kt", mo125470l = {101}, mo125471m = "invokeSuspend")
/* renamed from: fk3.e */
public final class C59138e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f169141d;

    /* renamed from: e */
    public /* synthetic */ Object f169142e;

    /* renamed from: f */
    public final /* synthetic */ C59141h f169143f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59138e(C59141h hVar, C15601d<? super C59138e> dVar) {
        super(2, dVar);
        this.f169143f = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C59138e eVar = new C59138e(this.f169143f, dVar);
        eVar.f169142e = obj;
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59138e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C59481e eVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f169141d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Pair<ArrayList<QueryImageData>, ArrayList<QueryImageData>> g = C59136a.f169139a.mo84352g(this.f169143f.f169147b, false);
            Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "get result >> " + ((ArrayList) g.first).size() + ", " + ((ArrayList) g.second).size());
            if (C53930o0.m60560g((C0000n0) this.f169142e) && (eVar = C59491j.f169998c) != null) {
                Object obj2 = g.first;
                C87412m.m108593f(obj2, "data.first");
                Object obj3 = g.second;
                C87412m.m108593f(obj3, "data.second");
                this.f169141d = 1;
                if (eVar.mo84581c((ArrayList) obj2, (ArrayList) obj3, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
