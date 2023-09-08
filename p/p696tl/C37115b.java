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

/* renamed from: tl.b */
public final class C37115b implements C37114a {

    /* renamed from: tl.b$a */
    public static final class C37116a implements C36333b.C36334a {

        /* renamed from: a */
        public final /* synthetic */ C36337e f98304a;

        /* renamed from: b */
        public final /* synthetic */ C36336d f98305b;

        /* renamed from: c */
        public final /* synthetic */ C37467u f98306c;

        /* renamed from: d */
        public final /* synthetic */ C37453h0 f98307d;

        public C37116a(C36337e eVar, C36336d dVar, C37467u uVar, C37453h0 h0Var) {
            this.f98304a = eVar;
            this.f98305b = dVar;
            this.f98306c = uVar;
            this.f98307d = h0Var;
        }

        /* renamed from: a */
        public void mo60626a(C37467u uVar) {
            C87412m.m108594g(uVar, "item");
            Log.m105924i("FunctionMsg.OpDelayExecutor", "[onSuccessFetch] item:" + uVar);
            if (uVar.field_actionTime > C31543z5.m39451a() / 1000) {
                this.f98304a.mo60630a(101, uVar, this.f98305b.f96714c);
                return;
            }
            Log.m105924i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] to show! id" + this.f98306c.field_functionmsgid);
            this.f98307d.mo59545a(uVar.field_functionmsgid, uVar, uVar.field_addMsg, uVar.mo61112l2());
        }

        /* renamed from: b */
        public void mo60627b(C37467u uVar) {
            C87412m.m108594g(uVar, "item");
            Log.m105928w("FunctionMsg.OpDelayExecutor", "[onFailFetch] item:" + uVar);
            if (uVar.field_status == -1) {
                this.f98304a.mo60630a(-1, uVar, this.f98305b.f96714c);
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
        if (uVar2 != null) {
            uVar.field_needShow = true;
            uVar2.field_preVersion = uVar2.field_version;
            uVar2.field_version = uVar.field_version;
            long j2 = uVar.field_actionTime;
            if (0 < j2) {
                uVar2.field_actionTime = j2 + uVar.field_delayTime;
            } else {
                uVar2.field_actionTime += uVar.field_delayTime;
            }
            String str = uVar.field_custombuff;
            if (!Util.isNullOrNil(str)) {
                uVar2.field_custombuff = str;
            }
            String str2 = uVar2.field_functionmsgid;
            C87412m.m108593f(str2, "oldFunctionMsgItem!!.functionMsgId");
            r3Var.mo57696Lo(str2, uVar2);
            Log.m105924i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor], functionMsgId: " + uVar.field_functionmsgid + ", op delay! update the exist one, new ActionTime:" + uVar.field_actionTime + " new delay:" + uVar.field_delayTime + " reslt:" + uVar2);
            eVar.mo60630a(101, uVar2, this);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor] op delay, oldFunctionMsgItem is null! newFunctionMsgItem: " + uVar);
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
            new C36333b(linkedList, h0Var, new C37116a(eVar, dVar, uVar, h0Var)).mo60624c();
        } else if (i == 2 || i == -2) {
            Log.m105924i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] id" + uVar.field_functionmsgid + " actionTime:" + uVar.field_actionTime);
            if (uVar.field_actionTime <= C31543z5.m39451a() / 1000) {
                h0Var.mo59545a(uVar.field_functionmsgid, uVar, uVar.field_addMsg, uVar.mo61112l2());
            } else {
                eVar.mo60630a(uVar.field_opCode, uVar, dVar.f96714c);
            }
        }
    }
}
