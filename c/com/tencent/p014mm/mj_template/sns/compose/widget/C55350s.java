package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import androidx.paging.compose.C54222c;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import p175j0.C60690y0;
import p247u3.C65053e2;
import p247u3.C65060g0;
import rx3.C13598b0;
import te3.o74;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelKt$MusicList$1", mo125469f = "MusicSearchPanel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.s */
public final class C55350s extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C54222c<C28971l<o74>> f157638d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<C32224a<C13598b0>> f157639e;

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.s$a */
    public static final class C55351a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54222c<C28971l<o74>> f157640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55351a(C54222c<C28971l<o74>> cVar) {
            super(0);
            this.f157640d = cVar;
        }

        public Object invoke() {
            Log.m105928w("MicroMsg.MusicSearchPanel", "MusicList: load error, user retry");
            C65053e2 e2Var = this.f157640d.f152188c.f187353b;
            if (e2Var != null) {
                e2Var.mo89249a();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55350s(C54222c<C28971l<o74>> cVar, C60690y0<C32224a<C13598b0>> y0Var, C15601d<? super C55350s> dVar) {
        super(2, dVar);
        this.f157638d = cVar;
        this.f157639e = y0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C55350s(this.f157638d, this.f157639e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C55350s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (this.f157638d.mo75007c().f187304a instanceof C65060g0.C65061a) {
            this.f157639e.setValue(new C55351a(this.f157638d));
        } else {
            this.f157639e.setValue(null);
        }
        return C13598b0.f38549a;
    }
}
