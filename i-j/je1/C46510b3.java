package je1;

import com.tencent.p014mm.autogen.events.FinderMentionUpdateEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import java.util.Vector;
import kt1.C46744d;
import ob0.C11385n;
import ob0.C47350c;
import p749xh.C66276va;
import te3.C49299el0;
import te3.C49438fl0;
import te3.C49712hj1;
import te3.C49966ja;
import wp1.C53194i;
import wp1.C66169h;
import zc1.C66785b;

/* renamed from: je1.b3 */
public final class C46510b3 extends C60628i {

    /* renamed from: g */
    public final C66276va f125299g;

    /* renamed from: h */
    public final int f125300h;

    /* renamed from: i */
    public C47350c f125301i;

    /* renamed from: j */
    public C11385n f125302j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46510b3(C66276va vaVar, int i, C49712hj1 hj12, int i2) {
        super(hj12);
        C87412m.m108594g(vaVar, "mention");
        C87412m.m108594g(hj12, "contextObj");
        this.f125299g = vaVar;
        this.f125300h = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6618;
        C49438fl0 fl02 = new C49438fl0();
        fl02.f133573d = vaVar.field_followId;
        fl02.f133574e = i;
        fl02.f133575f = C46523h2.f125330a.mo71860b(6618, hj12);
        fl02.f133576g = C66785b.f191882e.mo90662O5();
        bVar.f127066a = fl02;
        C49299el0 el02 = new C49299el0();
        el02.setBaseResponse(new C49966ja());
        bVar.f127067b = el02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderfollowverify";
        this.f125301i = bVar.mo72403a();
        Log.m105924i("Finder.NetSceneFinderFollowVerify", "init id:" + vaVar.field_id + ", " + fl02.f133573d + " opType " + i);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125302j = nVar;
        return dispatch(gVar, this.f125301i, this);
    }

    public int getType() {
        return 6618;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("Finder.NetSceneFinderFollowVerify", "id:" + this.f125299g.field_id + ", errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        if (i2 == 0 && i3 == 0) {
            C66276va vaVar = this.f125299g;
            vaVar.field_extFlag |= 4;
            Log.m105924i("Finder.NetSceneFinderFollowVerify", "succ, id:" + this.f125299g.field_id + ", modify extFlag:" + this.f125299g.field_extFlag + ", updateDb ret:" + C66169h.f190180a.mo90252k(vaVar, this.f125300h));
        } else {
            if (i3 == -4043) {
                C66276va vaVar2 = this.f125299g;
                vaVar2.field_extFlag |= 8;
                Log.m105924i("Finder.NetSceneFinderFollowVerify", "failed revoke, id:" + this.f125299g.field_id + ", modify extFlag:" + this.f125299g.field_extFlag + ", updateDb ret:" + C66169h.f190180a.mo90252k(vaVar2, this.f125300h));
            } else if (i3 == -4042) {
                C66276va vaVar3 = this.f125299g;
                vaVar3.field_followExpireTime = 0;
                Log.m105924i("Finder.NetSceneFinderFollowVerify", "failed expire, id:" + this.f125299g.field_id + ", modify extFlag:" + this.f125299g.field_extFlag + ", updateDb ret:" + C66169h.f190180a.mo90252k(vaVar3, this.f125300h));
            }
            Vector<Long> vector = C53194i.f148390a;
            C53194i.f148390a.remove(Long.valueOf(this.f125299g.field_id));
            FinderMentionUpdateEvent finderMentionUpdateEvent = new FinderMentionUpdateEvent();
            finderMentionUpdateEvent.f107533d.f107534a = this.f125299g.field_id;
            finderMentionUpdateEvent.publish();
        }
        C11385n nVar = this.f125302j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
