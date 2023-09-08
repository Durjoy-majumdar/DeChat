package ga3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f62.C75693d1;
import fa3.C75739k;
import pe3.C47465a;
import te3.C77949j3;

/* renamed from: ga3.i */
public class C32368i implements C75693d1<C77949j3> {
    /* renamed from: I5 */
    public /* bridge */ /* synthetic */ void mo56014I5(C47465a aVar) {
        C77949j3 j3Var = (C77949j3) aVar;
    }

    /* renamed from: y1 */
    public void mo56015y1(C47465a aVar) {
        C77949j3 j3Var = (C77949j3) aVar;
        if (j3Var.f227630g != 51 && C75592q0.m90789s().equals(j3Var.f227628e.f141175d)) {
            C72963f4 h302 = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(j3Var.f227629f.f141175d, j3Var.f227638r);
            if (h302.mo108774y2() == 0) {
                Log.m105925i("WebWXSyncExtensionCallback", "[MicroMsg.MultiTerminalSyncMgr] msg not exit, svrID:%d", Long.valueOf(j3Var.f227638r));
                return;
            }
            Log.m105925i("WebWXSyncExtensionCallback", "[MicroMsg.MultiTerminalSyncMgr] selfSend msg, svrID:%d, localId:%d", Long.valueOf(j3Var.f227638r), Long.valueOf(h302.getMsgId()));
            ((C75739k) C86312j.m106911c(C75739k.class)).vx0().mo106056a(h302.getMsgId());
        }
    }
}
