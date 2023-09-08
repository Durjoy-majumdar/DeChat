package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87203t;

/* renamed from: eb1.a */
public abstract class C45633a extends C117747y {
    public int dispatch(C114770g gVar, C114799u uVar, C1311n nVar) {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_fix_device_type, true);
        if ((uVar instanceof C47350c) && wf) {
            C47350c cVar = (C47350c) uVar;
            if (cVar.getReqObj() != null) {
                Log.m105925i("MicroMsg.FaceNetSceneBase", "Build.MODEL:%s", C87203t.m108275k());
                cVar.getReqObj().setDeviceType(C87203t.m108275k());
            }
        }
        return super.dispatch(gVar, uVar, nVar);
    }
}
