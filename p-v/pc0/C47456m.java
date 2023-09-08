package pc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49423fh2;
import te3.C49561gh2;
import te3.C51304sv1;
import te3.C51453tv1;

/* renamed from: pc0.m */
public class C47456m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f127283d;

    /* renamed from: e */
    public final C47350c f127284e;

    public C47456m(List<C49423fh2> list, long j, C49561gh2 gh22) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51304sv1();
        bVar.f127067b = new C51453tv1();
        bVar.f127068c = "/cgi-bin/mmo2o-bin/getbeaconspushmessage";
        bVar.f127069d = 1708;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f127284e = a;
        C51304sv1 sv12 = (C51304sv1) a.f127055a.f127080a;
        sv12.f141777d.addAll(list);
        sv12.f141779f = j;
        sv12.f141778e = gh22;
        Log.m105925i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma]getBeaconsPushMessageReq.beacons.size:%d", Integer.valueOf(sv12.f141777d.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127283d = nVar;
        return dispatch(gVar, this.f127284e, this);
    }

    public int getType() {
        return 1708;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:netId:%s,errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        this.f127283d.onSceneEnd(i4, i5, str2, this);
        C51304sv1 sv12 = (C51304sv1) this.f127284e.f127055a.f127080a;
        LinkedList<C49423fh2> linkedList = sv12.f141777d;
        C49423fh2 fh22 = linkedList.get(0);
        C49561gh2 gh22 = sv12.f141778e;
        C51453tv1 tv12 = (C51453tv1) ((C47350c) uVar).f127056b.f127083a;
        if (i4 == 0 && i5 == 0) {
            if (tv12.f142441g != 0) {
                C115669n.INSTANCE.mo160131h(12659, 1, Integer.valueOf(linkedList.size()), fh22.f133496d, Integer.valueOf(fh22.f133497e), Integer.valueOf(fh22.f133498f), String.valueOf(gh22.f134050d), String.valueOf(gh22.f134051e), 2, Integer.valueOf(tv12.f142441g));
            }
            Log.m105918d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end ok");
            return;
        }
        C115669n.INSTANCE.mo160131h(12659, 1, Integer.valueOf(linkedList.size()), fh22.f133496d, Integer.valueOf(fh22.f133497e), Integer.valueOf(fh22.f133498f), String.valueOf(gh22.f134050d), String.valueOf(gh22.f134051e), 1, Integer.valueOf(tv12.f142441g));
        Log.m105918d("MicroMsg.NetSceneGetBeaconsPushMessage", "[kevinkma][NetSceneGetBeaconsPushMessage]:net end not ok");
    }
}
