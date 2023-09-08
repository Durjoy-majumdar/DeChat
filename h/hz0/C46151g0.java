package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51509u83;
import te3.C52011xr3;
import te3.C52160yr3;

/* renamed from: hz0.g0 */
public class C46151g0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124387d;

    /* renamed from: e */
    public C11385n f124388e;

    public C46151g0(LinkedList<C51509u83> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52011xr3();
        bVar.f127067b = new C52160yr3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/reportdynamiccardcodeaction";
        bVar.f127069d = 1275;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124387d = a;
        ((C52011xr3) a.f127055a.f127080a).f144897d = linkedList;
        if (linkedList != null) {
            Iterator<C51509u83> it = linkedList.iterator();
            while (it.hasNext()) {
                C51509u83 next = it.next();
                Log.m105919d("MicroMsg.NetSceneReportDynamicCardCodeAction", "ReportDynamicCardCodeActionReq operate card_id=%s,code_id=%s,operate_timestamp=%d,operate_type=%d", next.f142679d, next.f142680e, Integer.valueOf(next.f142681f), Integer.valueOf(next.f142682g));
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124388e = nVar;
        return dispatch(gVar, this.f124387d, this);
    }

    public int getType() {
        return 1275;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneReportDynamicCardCodeAction", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f124388e.onSceneEnd(i2, i3, str, this);
    }
}
