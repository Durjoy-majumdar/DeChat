package p622no;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.StringKtKt;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import h81.C32735h;
import p215oo.C77032h;
import pc0.C100765f;
import rx3.C13598b0;
import uy0.C102115b;

@C86522b
/* renamed from: no.j */
public final class C100141j extends C86301e implements C77032h {
    /* renamed from: AR */
    public void mo107356AR(C72963f4 f4Var, C100765f fVar) {
        C87412m.m108594g(f4Var, "targetMsg");
        C102115b.f300694a.mo141621c(f4Var, fVar);
    }

    /* renamed from: DR */
    public void mo107357DR() {
        Log.m105924i("MicroMsg.MsgTraceHelper", "clearScene() called");
        C102115b.f300695b = 2;
    }

    /* renamed from: EP */
    public String mo107358EP(String str, String str2, String str3) {
        boolean z = false;
        if (!(str2 == null || str2.length() == 0)) {
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (!z) {
                Log.m105924i("MicroMsg.MsgTracerService", "tryInsertMessageTracebackInfo() called with: msgSource = " + str + ", svrMsgId = " + str2 + ", talkerUsername = " + str3);
                C102115b bVar = C102115b.f300694a;
                C100765f fVar = new C100765f();
                fVar.f295214b = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(str3, StringKtKt.safeToLong(str2)).getMsgId();
                C13598b0 b0Var = C13598b0.f38549a;
                return bVar.mo141620b(str, fVar);
            }
        }
        Log.m105924i("MicroMsg.MsgTracerService", "tryInsertMessageTracebackInfo() called with: msgSource = " + str + ", svrMsgId = " + str2 + ", talkerUsername = " + str3);
        return str == null ? "" : str;
    }

    /* renamed from: RF */
    public void mo107359RF(C72963f4 f4Var, long j) {
        C87412m.m108594g(f4Var, "targetMsg");
        C102115b bVar = C102115b.f300694a;
        C100765f fVar = new C100765f();
        fVar.f295214b = j;
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.mo141621c(f4Var, fVar);
    }

    /* renamed from: SR */
    public String mo107360SR(String str, long j) {
        C102115b bVar = C102115b.f300694a;
        C100765f fVar = new C100765f();
        fVar.f295214b = j;
        C13598b0 b0Var = C13598b0.f38549a;
        return bVar.mo141620b(str, fVar);
    }

    public String Yq0(String str, C100765f fVar) {
        C87412m.m108594g(fVar, "forwardInfo");
        return C102115b.f300694a.mo141620b(str, fVar);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_msgtrace_tmpnode_enable, 0) == 1) {
            C102115b.f300696c = true;
        }
    }

    public void setScene(int i) {
        Log.m105924i("MicroMsg.MsgTraceHelper", "setScene() called with: scene = " + i);
        C102115b.f300695b = i;
    }
}
