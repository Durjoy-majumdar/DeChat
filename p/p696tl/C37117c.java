package p696tl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30774r3;
import gy3.C87412m;
import p248ug.C37453h0;
import p248ug.C37467u;
import p676rl.C36336d;
import p676rl.C36337e;
import rx3.C13598b0;

/* renamed from: tl.c */
public final class C37117c implements C37114a {
    /* renamed from: a */
    public void mo60977a(C36337e eVar, C37453h0 h0Var, C30774r3 r3Var, C37467u uVar, C37467u uVar2, long j) {
        C13598b0 b0Var;
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(r3Var, "storage");
        C87412m.m108594g(uVar, "newFunctionMsgItem");
        Log.m105924i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete! id:" + uVar);
        if (uVar2 != null) {
            Log.m105925i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, newFunctionMsgItem.version: %s, functionMsgItem.version: %s, %s", Long.valueOf(uVar.field_version), Long.valueOf(uVar2.field_version), uVar2);
            long j2 = uVar.field_version;
            if (j2 == uVar2.field_version || j2 == 0) {
                uVar2.field_actionTime = uVar.field_actionTime;
                r3Var.delete(uVar2, new String[0]);
                uVar2.field_businessInfo = uVar.field_businessInfo;
                eVar.mo60630a(1, uVar2, this);
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, the origin one not exist! " + uVar);
            eVar.mo60630a(1, uVar, this);
        }
    }

    /* renamed from: b */
    public void mo60978b(C36337e eVar, C37453h0 h0Var, C36336d dVar) {
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(dVar, "task");
        Log.m105924i("FunctionMsg.OpDeleteExecutor", "[onTaskExpired] delete " + dVar.f96713b.field_functionmsgid);
        C37467u uVar = dVar.f96713b;
        h0Var.mo59546b(uVar.field_functionmsgid, uVar, uVar.field_addMsg);
    }
}
