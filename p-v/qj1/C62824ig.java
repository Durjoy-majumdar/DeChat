package qj1;

import a14.C0000n0;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import qo3.C89779i0;
import rx3.C13598b0;
import w50.C65933h;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorCameraOptPanelPlugin$clickMakeup$1", mo125469f = "FinderLiveVisitorCameraOptPanelPlugin.kt", mo125470l = {405}, mo125471m = "invokeSuspend")
/* renamed from: qj1.ig */
public final class C62824ig extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f178310d;

    /* renamed from: e */
    public int f178311e;

    /* renamed from: f */
    public final /* synthetic */ C62777fg f178312f;

    /* renamed from: qj1.ig$a */
    public static final class C62825a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C62825a f178313d = new C62825a();

        public C62825a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62824ig(C62777fg fgVar, C15601d<? super C62824ig> dVar) {
        super(2, dVar);
        this.f178312f = fgVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62824ig(this.f178312f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62824ig) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C89779i0 i0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f178311e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C89779i0 e = C89779i0.m112248e(this.f178312f.f166287d.getContext(), this.f178312f.f166287d.getContext().getString(C0966R.string.mvo), true, 2, (DialogInterface.OnCancelListener) null);
            C65933h hVar = C65933h.f189544a;
            C65933h.C65934a aVar2 = C65933h.C65934a.FinderLiveAnchorCameraOptPanelPlugin;
            C62825a aVar3 = C62825a.f178313d;
            this.f178310d = e;
            this.f178311e = 1;
            if (hVar.mo89974d(aVar2, false, aVar3, this) == aVar) {
                return aVar;
            }
            i0Var = e;
        } else if (i == 1) {
            i0Var = (C89779i0) this.f178310d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (i0Var.isShowing()) {
            i0Var.dismiss();
        }
        return C13598b0.f38549a;
    }
}
