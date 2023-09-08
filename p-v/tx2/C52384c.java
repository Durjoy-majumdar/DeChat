package tx2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51076r92;
import te3.C51214s92;
import te3.gf4;

/* renamed from: tx2.c */
public class C52384c extends C52387f {

    /* renamed from: d */
    public C11385n f146427d;

    /* renamed from: e */
    public final C47350c f146428e;

    /* renamed from: f */
    public final String f146429f;

    /* renamed from: g */
    public int f146430g;

    /* renamed from: h */
    public LinkedList<gf4> f146431h;

    /* renamed from: i */
    public int f146432i;

    public C52384c(int i, long j, String str, int i2) {
        this.f146432i = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51076r92();
        bVar.f127067b = new C51214s92();
        bVar.f127068c = "/cgi-bin/micromsg-bin/gettalkroommember";
        bVar.f127069d = 336;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f146428e = a;
        C51076r92 r922 = (C51076r92) a.f127055a.f127080a;
        r922.f140775d = i;
        r922.f140776e = j;
        this.f146429f = str;
        r922.f140777f = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneGetTalkRoomMember", "doScene");
        this.f146427d = nVar;
        return dispatch(gVar, this.f146428e, this);
    }

    public int getType() {
        return 336;
    }

    /* renamed from: j1 */
    public String mo73384j1() {
        return this.f146429f;
    }

    /* renamed from: k1 */
    public int mo73385k1() {
        return this.f146432i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetTalkRoomMember", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            C51214s92 s922 = (C51214s92) this.f146428e.f127056b.f127083a;
            Log.m105925i("MicroMsg.NetSceneGetTalkRoomMember", "resp %s", s922.toString());
            this.f146430g = s922.f141385d;
            LinkedList<gf4> linkedList = s922.f141387f;
            LinkedList<gf4> linkedList2 = new LinkedList<>();
            Iterator<gf4> it = linkedList.iterator();
            while (it.hasNext()) {
                gf4 next = it.next();
                if (!Util.isNullOrNil(next.f134027e)) {
                    linkedList2.add(next);
                }
            }
            this.f146431h = linkedList2;
            this.f146427d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f146427d.onSceneEnd(i2, i3, str, this);
    }
}
