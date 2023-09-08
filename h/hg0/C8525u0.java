package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50898q04;
import te3.C51041r04;
import te3.C51163rv3;

/* renamed from: hg0.u0 */
public class C8525u0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f27574d;

    /* renamed from: e */
    public C11385n f27575e = null;

    public C8525u0(String str, List<String> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50898q04();
        bVar.f127067b = new C51041r04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendsmstomfriend";
        bVar.f127069d = v2helper.EMethodSetSendToNetworkOn;
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f27574d = a;
        C50898q04 q042 = (C50898q04) a.f127055a.f127080a;
        q042.f140079d = str;
        q042.f140081f = new LinkedList<>();
        q042.f140080e = list != null ? list.size() : i;
        if (list != null) {
            for (String next : list) {
                if (!Util.isNullOrNil(next)) {
                    LinkedList<C51163rv3> linkedList = q042.f140081f;
                    C51163rv3 rv32 = new C51163rv3();
                    rv32.f141175d = next;
                    rv32.f141176e = true;
                    linkedList.add(rv32);
                }
            }
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f27575e = nVar;
        return dispatch(gVar, this.f27574d, this);
    }

    public int getType() {
        return v2helper.EMethodSetSendToNetworkOn;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f27575e.onSceneEnd(i2, i3, str, this);
    }
}
