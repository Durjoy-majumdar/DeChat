package com.tencent.p014mm.plugin.webview.webcompt;

import a14.C0000n0;
import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.webview.webcompt.WebComponent$refreshA8Key$2$1", mo125469f = "WebComponent.kt", mo125470l = {602}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.webview.webcompt.r */
public final class C44453r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f120551d;

    /* renamed from: e */
    public final /* synthetic */ C44408c f120552e;

    /* renamed from: f */
    public final /* synthetic */ C44408c.C44428l.C44429a f120553f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<String, C13598b0> f120554g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<C44408c.C44426j, C13598b0> f120555h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44453r(C44408c cVar, C44408c.C44428l.C44429a aVar, C32226l<? super String, C13598b0> lVar, C32226l<? super C44408c.C44426j, C13598b0> lVar2, C15601d<? super C44453r> dVar) {
        super(2, dVar);
        this.f120552e = cVar;
        this.f120553f = aVar;
        this.f120554g = lVar;
        this.f120555h = lVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C44453r(this.f120552e, this.f120553f, this.f120554g, this.f120555h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C44453r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f120551d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C44408c cVar = this.f120552e;
            String str = this.f120553f.f120475i;
            this.f120551d = 1;
            C44408c.C44410b bVar = C44408c.f120395e;
            obj = cVar.mo69183h(str, "", this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C44408c.C44426j e) {
                this.f120555h.invoke(e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32226l<String, C13598b0> lVar = this.f120554g;
        C44408c cVar2 = this.f120552e;
        C44408c.C44410b bVar2 = C44408c.f120395e;
        lVar.invoke(cVar2.mo69186l((C44408c.C44409a) obj));
        return C13598b0.f38549a;
    }
}
