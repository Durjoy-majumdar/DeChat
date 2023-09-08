package s33;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51018qv3;
import te3.vu4;
import te3.wu4;
import z33.C112597j;

/* renamed from: s33.d */
public class C63694d extends C63696n<vu4, wu4> {

    /* renamed from: s33.d$a */
    public class C63695a implements C11385n {
        public C63695a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C112597j.m153938c("MicroMsg.Voip.DoubleLinkSwitch", "double link switch response:" + i + " errCode:" + i2 + " status:" + C63694d.this.f180559g.f317476a);
            if (i2 != 0) {
                C112597j.m153937b("MicroMsg.Voip.DoubleLinkSwitch", " double link switch  response with error code:" + i2);
                return;
            }
            wu4 wu4 = (wu4) C63694d.this.mo88543m1();
            C106377r rVar = C63694d.this.f180559g;
            int i3 = wu4.f144299g;
            rVar.f317494r = i3;
            if (i3 != 0) {
                if (rVar.f317500x.doubleLinkSwitch(wu4.f144300h) == 0) {
                    int i4 = wu4.f144300h;
                    if (1 == i4) {
                        C63694d.this.f180559g.f317500x.f317614Y0++;
                    } else if (2 == i4) {
                        C63694d.this.f180559g.f317500x.f317616Z0++;
                    }
                }
                C112597j.m153938c("MicroMsg.Voip.DoubleLinkSwitch", "zhengxue[DOUBLELINK]room " + wu4.f144296d + " member " + wu4.f144298f + " key " + wu4.f144297e + "report flag " + wu4.f144299g + "switch to link type " + wu4.f144300h + "doubleLinkSwitchReportStatus " + C63694d.this.f180559g.f317494r + "mDoubleLinkSwitchSucToDirectCnt" + C63694d.this.f180559g.f317500x.f317614Y0 + "mDoubleLinkSwitchSucToRelayCnt" + C63694d.this.f180559g.f317500x.f317616Z0);
            }
        }
    }

    public C63694d(int i, long j, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new vu4();
        bVar.f127067b = new wu4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipDoubleLinkSwitch";
        bVar.f127069d = 249;
        bVar.f127070e = 249;
        bVar.f127071f = 1000000249;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        vu4 vu4 = (vu4) a.f127055a.f127080a;
        vu4.f185982d = i;
        vu4.f185983e = j;
        vu4.f185984f = i2;
        vu4.f185985g = i3;
        vu4.f185986h = i4;
        vu4.f185987i = i5;
        vu4.f185988j = i6;
        vu4.f185989n = 1;
        C51018qv3 qv32 = new C51018qv3();
        C89349b bVar2 = new C89349b(bArr, 0, i7);
        qv32.mo73349j(bVar2);
        qv32.f140572d = bVar2.f257327a.length;
        qv32.f140573e = true;
        vu4.f185990o = qv32;
    }

    public int getType() {
        return 249;
    }

    /* renamed from: k1 */
    public void mo72978k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            wu4 wu4 = (wu4) mo88543m1();
            if (wu4 != null) {
                Log.m105925i("MicroMsg.Voip.DoubleLinkSwitch", "roomId:%d, roomKey:%s, member:%d", Integer.valueOf(wu4.f144296d), Long.valueOf(wu4.f144297e), Integer.valueOf(wu4.f144298f));
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.Voip.DoubleLinkSwitch", "double link switch error");
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C63695a();
    }
}
