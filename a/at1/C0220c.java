package at1;

import a14.C0000n0;
import c14.C54625h;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.webview.search.FinderWebSearchService$getFinderItemDetail$1$1", mo125469f = "FinderWebSearchService.kt", mo125470l = {177}, mo125471m = "invokeSuspend")
/* renamed from: at1.c */
public final class C0220c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f742d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f743e;

    /* renamed from: f */
    public final /* synthetic */ C54625h<String> f744f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0220c(JSONObject jSONObject, C54625h<String> hVar, C15601d<? super C0220c> dVar) {
        super(2, dVar);
        this.f743e = jSONObject;
        this.f744f = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0220c(this.f743e, this.f744f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0220c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f742d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("Finder.WebSearchService", "result=" + this.f743e.toString(4));
            C54625h<String> hVar = this.f744f;
            String jSONObject = this.f743e.toString();
            C87412m.m108593f(jSONObject, "result.toString()");
            this.f742d = 1;
            if (hVar.mo75536o(jSONObject, this) == aVar) {
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
