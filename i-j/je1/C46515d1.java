package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49128dd1;
import te3.C49267ed1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51895wy2;
import zc1.C66785b;

/* renamed from: je1.d1 */
public final class C46515d1 extends C60625c<C49267ed1> {

    /* renamed from: s */
    public final int f125314s;

    /* renamed from: t */
    public final long f125315t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46515d1(int i, long j, String str, LinkedList<C51895wy2> linkedList, C49712hj1 hj12, int i2, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        str = (i2 & 4) != 0 ? null : str;
        linkedList = (i2 & 8) != 0 ? null : linkedList;
        hj12 = (i2 & 16) != 0 ? null : hj12;
        this.f125314s = i;
        this.f125315t = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49128dd1 dd12 = new C49128dd1();
        bVar.f127066a = dd12;
        dd12.f132248d = i;
        dd12.f132249e = str == null ? C66785b.f191882e.mo90662O5() : str;
        dd12.f132250f.add(Long.valueOf(j));
        dd12.f132251g = C46523h2.f125330a.mo71860b(6205, hj12);
        if (linkedList != null) {
            dd12.f132252h = linkedList;
        }
        C49267ed1 ed12 = new C49267ed1();
        ed12.setBaseResponse(new C49966ja());
        ed12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ed12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findermodmentioned";
        bVar.f127069d = 6205;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49267ed1) eu32, "resp");
        Log.m105924i("Finder.CgiFinderModMentioned", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " opType=" + this.f125314s + " objectId=" + this.f125315t + ' ');
    }
}
