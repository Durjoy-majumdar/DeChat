package g83;

import a14.C0000n0;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13601g;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z73.C53761n;

@C91590f(mo125468c = "com.tencent.mm.plugin.websearch.webview.BaseWebSearchJSApi$getFinderItemDetail$2$1$1$1", mo125469f = "BaseWebSearchJSApi.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: g83.c */
public final class C59385c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C59379b<Object> f169727d;

    /* renamed from: e */
    public final /* synthetic */ String f169728e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59385c(C59379b<Object> bVar, String str, C15601d<? super C59385c> dVar) {
        super(2, dVar);
        this.f169727d = bVar;
        this.f169728e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59385c(this.f169727d, this.f169728e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59385c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        BaseWebSearchWebView webView;
        ResultKt.throwOnFailure(obj);
        C59379b<Object> bVar = this.f169727d;
        C13601g<MultiProcessMMKV> gVar = C59379b.f169715b;
        C59386f<Object> g = bVar.mo84482g();
        if (!(g == null || (webView = g.getWebView()) == null)) {
            C53761n.f150905a.mo74349a(webView, "onFinderItemDetailReady", this.f169728e);
        }
        return C13598b0.f38549a;
    }
}
