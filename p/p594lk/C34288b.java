package p594lk;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30774r3;
import eb0.C31543z5;
import java.util.List;
import ob0.C35133k;
import ob0.C35136m;
import p248ug.C37453h0;
import p248ug.C37467u;
import sf0.C48374j0;
import te3.C50694ok;
import te3.C77949j3;

/* renamed from: lk.b */
public class C34288b implements C37453h0 {
    /* renamed from: a */
    public void mo59545a(String str, C37467u uVar, C77949j3 j3Var, List<C77949j3> list) {
        C35133k a;
        try {
            mo59548d(j3Var);
            C50694ok okVar = uVar.field_businessInfo;
            if (!(okVar == null || (a = C35133k.C11383a.m11204a(okVar.f139226d)) == null)) {
                a.mo12406d(uVar.field_businessInfo);
            }
            C35133k.C35134b bVar = new C35133k.C35134b();
            bVar.f94240a = uVar.field_businessInfo;
            bVar.f94241b = uVar.field_functionmsgid;
            long j = uVar.field_actionTime;
            if (j == 0) {
                j = C31543z5.m39451a() / 1000;
            }
            j3Var.f227635o = (int) j;
            uVar.field_status = 100;
            uVar.field_addMsg = j3Var;
            C30774r3.f82750d.mo57696Lo(str, uVar);
            Log.m105925i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] item:%s CreateTime:%s", uVar, Integer.valueOf(j3Var.f227635o));
            if (list == null || list.size() <= 0) {
                C35136m a2 = C35136m.C35140d.m40570a(Integer.valueOf(j3Var.f227630g));
                if (a2 != null) {
                    a2.mo56403Fg(new C35136m.C35137a(j3Var, true, (Object) bVar));
                    return;
                }
                return;
            }
            Log.m105925i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] addMsgList.size:%s ", Integer.valueOf(list.size()));
            for (C77949j3 next : list) {
                if (((long) next.f227635o) <= 0) {
                    long j2 = uVar.field_actionTime;
                    if (j2 == 0) {
                        j2 = C31543z5.m39451a() / 1000;
                    }
                    next.f227635o = (int) j2;
                }
                C35136m.C35140d.m40570a(Integer.valueOf(next.f227630g)).mo56403Fg(new C35136m.C35137a(next, true, (Object) bVar));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", e, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo59546b(String str, C37467u uVar, C77949j3 j3Var) {
        Log.m105925i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgDelete] item:%s", uVar);
        try {
            mo59548d(j3Var);
            j3Var.f227635o = (int) uVar.field_actionTime;
            uVar.field_addMsg = j3Var;
            uVar.field_status = 100;
            C30774r3.f82750d.mo57696Lo(str, uVar);
            C35136m.C35140d.m40570a(Integer.valueOf(j3Var.f227630g)).mo56404ld(new C35136m.C35138c(j3Var, str, uVar));
        } catch (Exception e) {
            Log.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo59547c(int i, String str, C50694ok okVar) {
        C35133k a;
        try {
            C35133k.C35134b bVar = new C35133k.C35134b();
            bVar.f94241b = str;
            bVar.f94240a = okVar;
            if (okVar != null && (a = C35133k.C11383a.m11204a((long) ((int) okVar.f139226d))) != null) {
                a.mo12407q(i, bVar);
                okVar.f139227e = bVar.f94240a.f139227e;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", e, "", new Object[0]);
        }
    }

    /* renamed from: d */
    public C77949j3 mo59548d(C77949j3 j3Var) {
        if (j3Var == null) {
            return null;
        }
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = j3Var.f227628e;
        objArr[1] = Integer.valueOf(j3Var.f227630g);
        if (j3Var.f227631h == null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("FunctionMsg.FunctionMsgDispatcher", "processAddMsg, fromUser: %s, msgType: %s, content==null: %s", objArr);
        String nullAsNil = Util.nullAsNil(C48374j0.m53718g(j3Var.f227628e));
        if ("readerapp".equals(nullAsNil)) {
            j3Var.f227628e = C48374j0.m53720i("newsapp");
            j3Var.f227630g = 12399999;
        }
        if (!"blogapp".equals(nullAsNil) && !"newsapp".equals(nullAsNil)) {
            return j3Var;
        }
        j3Var.f227630g = 12399999;
        return j3Var;
    }
}
