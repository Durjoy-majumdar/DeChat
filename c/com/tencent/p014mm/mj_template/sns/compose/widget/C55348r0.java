package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import na0.C61630a;
import rx3.C13598b0;
import te3.o74;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelState$selectedMusic$1", mo125469f = "MusicSearchPanel.kt", mo125470l = {539, 543}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.r0 */
public final class C55348r0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f157631d;

    /* renamed from: e */
    public Object f157632e;

    /* renamed from: f */
    public int f157633f;

    /* renamed from: g */
    public final /* synthetic */ C55341p0 f157634g;

    /* renamed from: h */
    public final /* synthetic */ o74 f157635h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55348r0(C55341p0 p0Var, o74 o74, C15601d<? super C55348r0> dVar) {
        super(2, dVar);
        this.f157634g = p0Var;
        this.f157635h = o74;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C55348r0(this.f157634g, this.f157635h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C55348r0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C61630a aVar;
        C55341p0 p0Var;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f157633f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C61630a aVar3 = this.f157634g.f157611r;
            if (aVar3 != null) {
                this.f157633f = 1;
                if (aVar3.mo86581d(this) == aVar2) {
                    return aVar2;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            p0Var = (C55341p0) this.f157632e;
            aVar = (C61630a) this.f157631d;
            ResultKt.throwOnFailure(obj);
            p0Var.f157611r = aVar;
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C55341p0 p0Var2 = this.f157634g;
        String str = this.f157635h.f139007e;
        C87412m.m108593f(str, "snsMusicInfo.music_url");
        aVar = new C61630a(str, (long) this.f157635h.f139008f);
        C32227p<Boolean, Boolean, C13598b0> pVar = this.f157634g.f157602f;
        Boolean bool = Boolean.TRUE;
        pVar.invoke(bool, bool);
        this.f157631d = aVar;
        this.f157632e = p0Var2;
        this.f157633f = 2;
        if (aVar.mo86580c(this) == aVar2) {
            return aVar2;
        }
        p0Var = p0Var2;
        p0Var.f157611r = aVar;
        return C13598b0.f38549a;
    }
}
