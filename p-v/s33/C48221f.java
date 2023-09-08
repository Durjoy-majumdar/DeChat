package s33;

import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.plugin.voip.model.C106401z;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.av4;
import te3.zu4;
import z33.C112597j;

/* renamed from: s33.f */
public class C48221f extends C63696n<zu4, av4> {

    /* renamed from: h */
    public String f129209h = "MicroMsg.NetSceneVoipHeartBeat";

    /* renamed from: s33.f$a */
    public class C48222a implements C11385n {
        public C48222a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C106401z zVar = C48221f.this.f180559g.f317500x.f317568G1;
            zVar.getClass();
            zVar.mo152874f((long) ((int) (System.currentTimeMillis() - zVar.f317760O)));
            zVar.f317760O = 0;
            if (i == 0) {
                return;
            }
            if (i2 == 231 || i2 == 212) {
                String str2 = C48221f.this.f129209h;
                C112597j.m153937b(str2, "Voip heartbeat Failed, type:" + yVar.getType() + " errType:" + i + " errCode:" + i2);
                C106377r rVar = C48221f.this.f180559g;
                C106401z zVar2 = rVar.f317500x.f317568G1;
                zVar2.f317772a = 111;
                zVar2.f317773b = i2;
                zVar2.f317790s = 2;
                rVar.mo152719v(1, -9004, "", -1);
            }
        }
    }

    public C48221f(int i, long j, int i2, int i3, int i4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new zu4();
        bVar.f127067b = new av4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipheartbeat";
        bVar.f127069d = WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED;
        bVar.f127070e = 81;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        zu4 zu4 = (zu4) a.f127055a.f127080a;
        zu4.f146232d = i;
        zu4.f146233e = j;
        zu4.f146235g = System.currentTimeMillis();
        zu4.f146236h = i2;
        zu4.f146237i = i3;
        zu4.f146238j = i4;
        String str = this.f129209h;
        C112597j.m153936a(str, "send VoipHeartBeatReq audioDeviceOccupiedStatus: " + i3 + " channelSecondsNoData: " + i4);
    }

    public int getType() {
        return WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C48222a();
    }
}
