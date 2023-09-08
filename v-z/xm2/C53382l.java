package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49414fe3;
import te3.C49522g62;
import te3.C49549ge3;
import te3.C49665h62;

/* renamed from: xm2.l */
public class C53382l extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f150205d;

    /* renamed from: e */
    public C11385n f150206e = null;

    /* renamed from: f */
    public boolean f150207f = false;

    public C53382l() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49522g62();
        bVar.f127067b = new C49665h62();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpluginswitch";
        bVar.f127069d = 4158;
        this.f150205d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150206e = nVar;
        return dispatch(gVar, this.f150205d, this);
    }

    public int getType() {
        return 4158;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C49665h62 h622;
        C49549ge3 ge32;
        LinkedList<C49414fe3> linkedList;
        if (i2 == 0 && i3 == 0 && (h622 = (C49665h62) ((C47350c) uVar).f127056b.f127083a) != null && (ge32 = h622.f134460d) != null && (linkedList = ge32.f134005d) != null) {
            Iterator<C49414fe3> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C49414fe3 next = it.next();
                if (next != null) {
                    Log.m105925i("MicroMsg.NetSceneGetMiniShopHelperPluginShowStatus", "updateNeedShow, switchId: %d, switchValue: %b", Integer.valueOf(next.f133467d), Boolean.valueOf(next.f133468e));
                    if (5200001 == next.f133467d) {
                        this.f150207f = next.f133468e;
                        break;
                    }
                }
            }
        }
        C11385n nVar = this.f150206e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
