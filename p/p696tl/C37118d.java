package p696tl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30774r3;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import p248ug.C37453h0;
import p248ug.C37467u;
import p676rl.C36333b;
import p676rl.C36336d;
import p676rl.C36337e;
import rx3.C13598b0;

/* renamed from: tl.d */
public final class C37118d implements C37114a {

    /* renamed from: tl.d$a */
    public static final class C37119a implements C36333b.C36334a {

        /* renamed from: a */
        public final /* synthetic */ C36337e f98308a;

        /* renamed from: b */
        public final /* synthetic */ C36336d f98309b;

        public C37119a(C36337e eVar, C36336d dVar) {
            this.f98308a = eVar;
            this.f98309b = dVar;
        }

        /* renamed from: a */
        public void mo60626a(C37467u uVar) {
            C87412m.m108594g(uVar, "item");
            Log.m105924i("FunctionMsg.OpNoShowExecutor", "[onSuccessFetch] item:" + uVar);
            if (uVar.field_actionTime > C31543z5.m39451a() / 1000) {
                this.f98308a.mo60630a(2, uVar, this.f98309b.f96714c);
            }
        }

        /* renamed from: b */
        public void mo60627b(C37467u uVar) {
            C87412m.m108594g(uVar, "item");
            Log.m105928w("FunctionMsg.OpNoShowExecutor", "[onFailFetch] item:" + uVar);
            if (uVar.field_status == -1) {
                this.f98308a.mo60630a(-1, uVar, this.f98309b.f96714c);
            }
        }
    }

    /* renamed from: a */
    public void mo60977a(C36337e eVar, C37453h0 h0Var, C30774r3 r3Var, C37467u uVar, C37467u uVar2, long j) {
        C13598b0 b0Var;
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(r3Var, "storage");
        C87412m.m108594g(uVar, "newFunctionMsgItem");
        uVar.field_needShow = false;
        if (uVar2 != null) {
            if (uVar2.field_version < uVar.field_version) {
                Log.m105925i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, update the exist one, preVersion: %s oldFunctionMsgItem:%s", Long.valueOf(uVar2.field_preVersion), uVar2);
                long j2 = uVar2.field_version;
                uVar2.field_preVersion = j2;
                uVar.field_preVersion = j2;
                uVar2.field_actionTime = uVar.field_actionTime;
                String str = uVar.field_custombuff;
                if (!Util.isNullOrNil(str)) {
                    uVar2.field_custombuff = str;
                }
                String str2 = uVar2.field_functionmsgid;
                C87412m.m108593f(str2, "oldFunctionMsgItem!!.functionMsgId");
                r3Var.mo57696Lo(str2, uVar);
                eVar.mo60630a(2, uVar, this);
            } else {
                Log.m105928w("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show! but version is smaller");
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105925i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, insert a new one! %s", uVar);
            r3Var.insert(uVar);
            eVar.mo60630a(2, uVar, this);
        }
    }

    /* renamed from: b */
    public void mo60978b(C36337e eVar, C37453h0 h0Var, C36336d dVar) {
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(dVar, "task");
        C37467u uVar = dVar.f96713b;
        if (uVar.field_status == -1) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(uVar);
            new C36333b(linkedList, h0Var, new C37119a(eVar, dVar)).mo60624c();
        }
    }
}
