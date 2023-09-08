package s33;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import l33.C109247e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.xu4;
import te3.yu4;
import z33.C112597j;

/* renamed from: s33.e */
public class C48219e extends C63696n<xu4, yu4> {

    /* renamed from: s33.e$a */
    public class C48220a implements C11385n {
        public C48220a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C112597j.m153937b("MicroMsg.Voip.GetRoomInfo", "Voip onSceneEnd type:" + yVar.getType() + " errType:" + i + " errCode:" + i2);
            if (i == 0 && i2 == 0) {
                yu4 yu4 = (yu4) C48219e.this.mo88543m1();
                if (yu4.BaseResponse.f135955d == 0 && !C109247e.xx0().f317332a.mo152663h()) {
                    Log.m105925i("MicroMsg.Voip.GetRoomInfo", "doTaskCallin in NetSceneVoipGetRoomInfo, roomid:%d, roomkey:%s, time:%d", Integer.valueOf(yu4.f145520d), Long.valueOf(yu4.f145521e), Integer.valueOf(yu4.f145522f));
                    C109247e.xx0().mo152611i(yu4);
                }
            }
        }
    }

    public C48219e(int i, long j, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new xu4();
        bVar.f127067b = new yu4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipgetroominfo";
        bVar.f127069d = 303;
        bVar.f127070e = 119;
        bVar.f127071f = 1000000119;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        xu4 xu4 = (xu4) a.f127055a.f127080a;
        xu4.f144983d = i;
        xu4.f144984e = j;
        xu4.f144985f = str;
        xu4.f144986g = 1;
        xu4.f144987h = System.currentTimeMillis();
    }

    public int getType() {
        return 303;
    }

    /* renamed from: k1 */
    public void mo72978k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            yu4 yu4 = (yu4) mo88543m1();
            if (yu4 != null) {
                Log.m105925i("MicroMsg.Voip.GetRoomInfo", "roomId:%d, roomKey:%s, memberCount:%d, inviteType:%d", Integer.valueOf(yu4.f145520d), Long.valueOf(yu4.f145521e), Integer.valueOf(yu4.f145523g), Integer.valueOf(yu4.f145526j));
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.Voip.GetRoomInfo", "Get RoomInfo error");
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C48220a();
    }
}
