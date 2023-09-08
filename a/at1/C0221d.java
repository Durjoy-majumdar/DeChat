package at1;

import a14.C0000n0;
import c14.C54625h;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.webview.search.FinderWebSearchService$getFinderItemDetail$1$2", mo125469f = "FinderWebSearchService.kt", mo125470l = {181}, mo125471m = "invokeSuspend")
/* renamed from: at1.d */
public final class C0221d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f745d;

    /* renamed from: e */
    public final /* synthetic */ C54625h<String> f746e;

    /* renamed from: f */
    public final /* synthetic */ C0217b f747f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0221d(C54625h<String> hVar, C0217b bVar, C15601d<? super C0221d> dVar) {
        super(2, dVar);
        this.f746e = hVar;
        this.f747f = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0221d(this.f746e, this.f747f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0221d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f745d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54625h<String> hVar = this.f746e;
            this.f747f.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("retCode", -1);
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "returnFail().toString()");
            this.f745d = 1;
            if (hVar.mo75536o(jSONObject2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
