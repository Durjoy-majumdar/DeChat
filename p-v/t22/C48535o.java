package t22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101857vk;
import te3.C50522nc2;
import te3.C50662oc2;

/* renamed from: t22.o */
public class C48535o extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f129806d;

    /* renamed from: e */
    public C11385n f129807e;

    /* renamed from: f */
    public List<C101857vk> f129808f = new ArrayList(8);

    public C48535o() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50522nc2();
        bVar.f127067b = new C50662oc2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getweapplistbylocation";
        bVar.f127069d = 1913;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f129806d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129807e = nVar;
        return dispatch(gVar, this.f129806d, this);
    }

    public int getType() {
        return 1913;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetWeappListByLocation", "onGYNetEnd errType: %s, errCode: %s, errMsg: %s.", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50662oc2 oc22 = (C50662oc2) this.f129806d.f127056b.f127083a;
        LinkedList<C101857vk> linkedList = oc22.f139091e;
        if (linkedList != null) {
            int size = linkedList.size();
            Log.m105925i("MicroMsg.NetSceneGetWeappListByLocation", "weapp list size: %s.", Integer.valueOf(size));
            if (size <= 8) {
                ((ArrayList) this.f129808f).addAll(oc22.f139091e);
            } else {
                ((ArrayList) this.f129808f).addAll(oc22.f139091e.subList(0, 8));
            }
        }
        this.f129807e.onSceneEnd(i2, i3, str, this);
    }
}
