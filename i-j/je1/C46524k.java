package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C49987jg0;
import te3.C50128kg0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.k */
public final class C46524k extends C60625c<C50128kg0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46524k(LinkedList<Long> linkedList) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(linkedList, "mentionIdList");
        C49987jg0 jg02 = new C49987jg0();
        jg02.f136101d = C46523h2.f125330a.mo71860b(8546, this.f172731j);
        C66785b bVar = C66785b.f191882e;
        jg02.f136102e = bVar.mo90662O5();
        jg02.f136103f = linkedList;
        C50128kg0 kg02 = new C50128kg0();
        kg02.setBaseResponse(new C49966ja());
        kg02.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = jg02;
        bVar2.f127067b = kg02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderbatchgetmentioninfo";
        bVar2.f127069d = 8546;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderBatchGetMentionInfo", "init userName = " + bVar.mo90662O5() + ", mentionIdList:" + linkedList.size());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50128kg0) eu32, "resp");
        Log.m105924i("Finder.CgiFinderBatchGetMentionInfo", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
