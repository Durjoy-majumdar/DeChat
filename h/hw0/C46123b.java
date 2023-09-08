package hw0;

import a14.C0000n0;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.biz.scheme.BizComSchIntermediateUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C50871pt;
import te3.C51294st;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$startCheck$1", mo125469f = "BizComSchIntermediateUI.kt", mo125470l = {191}, mo125471m = "invokeSuspend")
/* renamed from: hw0.b */
public final class C46123b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f124282d;

    /* renamed from: e */
    public final /* synthetic */ BizComSchIntermediateUI f124283e;

    /* renamed from: f */
    public final /* synthetic */ String f124284f;

    /* renamed from: hw0.b$a */
    public static final class C46124a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f124285d;

        public C46124a(BizComSchIntermediateUI bizComSchIntermediateUI) {
            this.f124285d = bizComSchIntermediateUI;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f124285d;
            int i = BizComSchIntermediateUI.f108994v;
            bizComSchIntermediateUI.mo63448O7();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46123b(BizComSchIntermediateUI bizComSchIntermediateUI, String str, C15601d<? super C46123b> dVar) {
        super(2, dVar);
        this.f124283e = bizComSchIntermediateUI;
        this.f124284f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46123b(this.f124283e, this.f124284f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46123b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f124282d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f124283e;
            bizComSchIntermediateUI.f108999h = C89779i0.m112248e(bizComSchIntermediateUI.getContext(), this.f124283e.getContext().getString(C0966R.string.gat), true, 3, new C46124a(this.f124283e));
            C89779i0 i0Var = this.f124283e.f108999h;
            C87412m.m108591d(i0Var);
            i0Var.show();
            C8824d dVar = this.f124283e.f108996e;
            String str = this.f124284f;
            this.f124282d = 1;
            dVar.getClass();
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            new C46125e(str).mo9225i().mo123420E(new C8823c(dVar, hVar));
            obj = hVar.mo90314b();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C51294st stVar = (C51294st) obj;
        if (this.f124283e.isFinishing()) {
            Log.m105924i(this.f124283e.f108995d, "isFinishing, checkResp illegal!");
            return C13598b0.f38549a;
        } else if (stVar == null || stVar.f141732e == null) {
            Log.m105924i(this.f124283e.f108995d, "empty resp!");
            this.f124283e.mo63447N7();
            return C13598b0.f38549a;
        } else {
            String str2 = this.f124283e.f108995d;
            StringBuilder sb = new StringBuilder();
            sb.append("antispam_type = ");
            C50871pt ptVar = stVar.f141735h;
            Integer num = null;
            sb.append(ptVar != null ? new Integer(ptVar.f139944e) : null);
            Log.m105924i(str2, sb.toString());
            C50871pt ptVar2 = stVar.f141735h;
            if (ptVar2 != null) {
                num = new Integer(ptVar2.f139944e);
            }
            if (num != null && num.intValue() == 1) {
                BizComSchIntermediateUI.m43818H7(this.f124283e, stVar);
            } else if (num != null && num.intValue() == 2) {
                BizComSchIntermediateUI.m43819I7(this.f124283e, stVar);
            } else if (num != null && num.intValue() == 3) {
                BizComSchIntermediateUI.m43819I7(this.f124283e, stVar);
            } else {
                this.f124283e.mo63447N7();
            }
            return C13598b0.f38549a;
        }
    }
}
