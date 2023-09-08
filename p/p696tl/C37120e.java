package p696tl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30774r3;
import eb0.C31543z5;
import gy3.C87412m;
import p248ug.C37453h0;
import p248ug.C37467u;
import p676rl.C36336d;
import p676rl.C36337e;
import te3.C77949j3;

/* renamed from: tl.e */
public final class C37120e implements C37114a {
    /* renamed from: a */
    public void mo60977a(C36337e eVar, C37453h0 h0Var, C30774r3 r3Var, C37467u uVar, C37467u uVar2, long j) {
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(r3Var, "storage");
        C87412m.m108594g(uVar, "newFunctionMsgItem");
        Log.m105924i("FunctionMsg.OpShowExecutor", "[OpShowExecutor] op show, old functionMsgItem:" + uVar2);
        uVar.field_needShow = true;
        if (uVar2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[OpShowExecutor] op show!,");
            sb.append(uVar.field_version);
            sb.append(", ");
            sb.append(uVar2.field_version);
            sb.append(',');
            sb.append(uVar2.field_addMsg == null);
            Log.m105924i("FunctionMsg.OpShowExecutor", sb.toString());
            uVar2.field_needShow = true;
            if (uVar2.field_addMsg != null && uVar2.field_status == 2) {
                Log.m105925i("FunctionMsg.OpShowExecutor", "show, update create time to: %s", Long.valueOf(j));
                C77949j3 j3Var = uVar2.field_addMsg;
                if (j3Var != null) {
                    j3Var.f227635o = (int) (C31543z5.m39451a() / 1000);
                }
            }
            uVar2.field_actionTime = uVar.field_actionTime;
            String str = uVar.field_custombuff;
            if (!Util.isNullOrNil(str)) {
                uVar2.field_custombuff = str;
            }
            String str2 = uVar2.field_functionmsgid;
            C87412m.m108593f(str2, "oldFunctionMsgItem!!.functionMsgId");
            r3Var.mo57696Lo(str2, uVar2);
            eVar.mo60630a(3, uVar2, this);
        }
    }

    /* renamed from: b */
    public void mo60978b(C36337e eVar, C37453h0 h0Var, C36336d dVar) {
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(dVar, "task");
        C37467u uVar = dVar.f96713b;
        h0Var.mo59545a(uVar.field_functionmsgid, uVar, uVar.field_addMsg, uVar.mo61112l2());
    }
}
