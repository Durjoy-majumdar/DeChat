package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import a14.C53873d2;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import p869y0.C112339w;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelKt$SearchBar$4", mo125469f = "MusicSearchPanel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k0 */
public final class C55309k0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public /* synthetic */ Object f157528d;

    /* renamed from: e */
    public final /* synthetic */ C112339w f157529e;

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k0$a */
    public static final class C55310a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112339w f157530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55310a(C112339w wVar) {
            super(1);
            this.f157530d = wVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f157530d.mo164065a();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55309k0(C112339w wVar, C15601d<? super C55309k0> dVar) {
        super(2, dVar);
        this.f157529e = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C55309k0 k0Var = new C55309k0(this.f157529e, dVar);
        k0Var.f157528d = obj;
        return k0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C55309k0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C53873d2.m60393e(((C0000n0) this.f157528d).getCoroutineContext()).mo74515E(new C55310a(this.f157529e));
        return C13598b0.f38549a;
    }
}
