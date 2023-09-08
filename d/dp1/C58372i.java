package dp1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderChatEnterStruct;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import dp1.C58363h;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: dp1.i */
public final class C58372i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f167178d;

    /* renamed from: e */
    public final /* synthetic */ long f167179e;

    /* renamed from: f */
    public final /* synthetic */ FinderChatEnterStruct f167180f;

    /* renamed from: g */
    public final /* synthetic */ C58363h.C58366d f167181g;

    public C58372i(String str, long j, FinderChatEnterStruct finderChatEnterStruct, C58363h.C58366d dVar) {
        this.f167178d = str;
        this.f167179e = j;
        this.f167180f = finderChatEnterStruct;
        this.f167181g = dVar;
    }

    public final void run() {
        long j = 0;
        long j2 = 0;
        for (C72963f4 f4Var : ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101090TO(this.f167178d, this.f167179e, Integer.MAX_VALUE)) {
            if (!(f4Var.getType() == 570425393 || f4Var.getType() == 10000 || f4Var.getType() == 10001 || f4Var.getType() == 10002)) {
                int t2 = f4Var.mo108769t2();
                if (t2 == 0) {
                    j++;
                } else if (t2 == 1) {
                    j2++;
                }
            }
        }
        FinderChatEnterStruct finderChatEnterStruct = this.f167180f;
        finderChatEnterStruct.f155106n = j;
        finderChatEnterStruct.f155107o = j2;
        finderChatEnterStruct.mo86054n();
        C58363h hVar = C58363h.f167137a;
        this.f167181g.getClass();
        C58363h.m67607a(hVar, "RecordFinderChatEnter", this.f167180f);
    }
}
