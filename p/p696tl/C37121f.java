package p696tl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30774r3;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import p248ug.C37453h0;
import p248ug.C37467u;
import p676rl.C36333b;
import p676rl.C36336d;
import p676rl.C36337e;

/* renamed from: tl.f */
public final class C37121f implements C37114a {

    /* renamed from: tl.f$a */
    public static final class C37122a implements C36333b.C36334a {

        /* renamed from: a */
        public final /* synthetic */ C36337e f98310a;

        /* renamed from: b */
        public final /* synthetic */ C36336d f98311b;

        /* renamed from: c */
        public final /* synthetic */ C37467u f98312c;

        /* renamed from: d */
        public final /* synthetic */ C37453h0 f98313d;

        public C37122a(C36337e eVar, C36336d dVar, C37467u uVar, C37453h0 h0Var) {
            this.f98310a = eVar;
            this.f98311b = dVar;
            this.f98312c = uVar;
            this.f98313d = h0Var;
        }

        /* renamed from: a */
        public void mo60626a(C37467u uVar) {
            C87412m.m108594g(uVar, "item");
            Log.m105924i("FunctionMsg.OpUpdateExecutor", "[onSuccessFetch] item:" + uVar);
            if (uVar.field_actionTime > C31543z5.m39451a() / 1000) {
                this.f98310a.mo60630a(0, uVar, this.f98311b.f96714c);
                return;
            }
            Log.m105924i("FunctionMsg.OpUpdateExecutor", "[onTaskExpired] to show! id:" + this.f98312c.field_functionmsgid);
            this.f98313d.mo59545a(uVar.field_functionmsgid, uVar, uVar.field_addMsg, uVar.mo61112l2());
        }

        /* renamed from: b */
        public void mo60627b(C37467u uVar) {
            C87412m.m108594g(uVar, "item");
            Log.m105928w("FunctionMsg.OpUpdateExecutor", "[onFailFetch] item:" + uVar);
            if (uVar.field_status == -1) {
                this.f98310a.mo60630a(-1, uVar, this.f98311b.f96714c);
            }
        }
    }

    /* renamed from: a */
    public void mo60977a(C36337e eVar, C37453h0 h0Var, C30774r3 r3Var, C37467u uVar, C37467u uVar2, long j) {
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(r3Var, "storage");
        C87412m.m108594g(uVar, "newFunctionMsgItem");
        uVar.field_needShow = true;
        if (uVar2 == null) {
            Log.m105924i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, insert a new one! " + uVar);
            try {
                r3Var.insert(uVar);
            } catch (Exception unused) {
            }
            eVar.mo60630a(0, uVar, this);
            return;
        }
        long j2 = uVar2.field_version;
        long j3 = uVar.field_version;
        if (j2 < j3) {
            Log.m105925i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, update the exist one! [%s:%s]", uVar, uVar2);
            long j4 = uVar2.field_version;
            uVar2.field_preVersion = j4;
            uVar.field_preVersion = j4;
            String str = uVar2.field_functionmsgid;
            C87412m.m108593f(str, "oldFunctionMsgItem!!.functionMsgId");
            r3Var.mo57696Lo(str, uVar);
            eVar.mo60630a(0, uVar, this);
        } else if (j2 >= j3) {
            Log.m105921e("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor], id:%s old:new [%s:%s]", uVar2.field_functionmsgid, Long.valueOf(j2), Long.valueOf(uVar.field_version));
        }
    }

    /* renamed from: b */
    public void mo60978b(C36337e eVar, C37453h0 h0Var, C36336d dVar) {
        C87412m.m108594g(eVar, "timer");
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(dVar, "task");
        C37467u uVar = dVar.f96713b;
        int i = uVar.field_status;
        if (i == -1) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(uVar);
            new C36333b(linkedList, h0Var, new C37122a(eVar, dVar, uVar, h0Var)).mo60624c();
        } else if (i == 2 || i == -2) {
            Log.m105924i("FunctionMsg.OpUpdateExecutor", "[onTaskExpired] id" + uVar.field_functionmsgid + " actionTime:" + uVar.field_actionTime);
            if (uVar.field_actionTime <= C31543z5.m39451a() / 1000) {
                h0Var.mo59545a(uVar.field_functionmsgid, uVar, uVar.field_addMsg, uVar.mo61112l2());
            } else {
                eVar.mo60630a(uVar.field_opCode, uVar, dVar.f96714c);
            }
        }
    }
}
