package rg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.player.PlayerThread;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49672h82;
import te3.C49813i82;
import te3.C51145rr2;
import te3.C51747vv3;

/* renamed from: rg0.c */
public class C12998c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f37058d;

    public int doScene(C114770g gVar, C11385n nVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49672h82();
        bVar.f127067b = new C49813i82();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getsafetyinfo";
        bVar.f127069d = PlayerThread.ACTION_QUIT;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f37058d = nVar;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return PlayerThread.ACTION_QUIT;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<C51145rr2> linkedList;
        C51747vv3 vv32;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105921e("MicroMsg.NetSceneGetSafetyInfo", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        C49813i82 i822 = (C49813i82) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            if (i822 == null || (vv32 = i822.f135168d) == null || (linkedList = vv32.f143732d) == null) {
                linkedList = null;
            }
            if (linkedList != null) {
                Log.m105924i("MicroMsg.NetSceneGetSafetyInfo", "NetSceneGetSafetyInfo onGYNetEnd get list.size = " + linkedList.size());
                C13003h.vx0().execSQL("SafeDeviceInfo", "delete from SafeDeviceInfo");
                for (C51145rr2 eVar : linkedList) {
                    C13003h.vx0().insertNotify(new C13000e(eVar), false);
                }
                C13003h.vx0().doNotify();
            }
        }
        this.f37058d.onSceneEnd(i2, i3, str, this);
    }
}
