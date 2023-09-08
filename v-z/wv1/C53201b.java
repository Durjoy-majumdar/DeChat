package wv1;

import a14.C0000n0;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z73.C53759a;
import z73.C53761n;

@C91590f(mo125468c = "com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchJSApi$getFTSHotData$1$1$1", mo125469f = "FTSHotSearchJSApi.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: wv1.b */
public final class C53201b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C66200a f148406d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f148407e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53201b(C66200a aVar, JSONObject jSONObject, C15601d<? super C53201b> dVar) {
        super(2, dVar);
        this.f148406d = aVar;
        this.f148407e = jSONObject;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C53201b(this.f148406d, this.f148407e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C53201b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        BaseWebSearchWebView webView;
        ResultKt.throwOnFailure(obj);
        C53759a aVar = this.f148406d.f150904a;
        if (!(aVar == null || (webView = aVar.getWebView()) == null)) {
            JSONObject jSONObject = this.f148407e;
            C53761n nVar = C53761n.f150905a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "returnObj.toString()");
            nVar.mo74349a(webView, "onFTSHotDataReady", jSONObject2);
        }
        return C13598b0.f38549a;
    }
}
