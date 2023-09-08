package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C49311eo1;
import te3.C49335eu3;
import te3.C49452fo1;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: dj1.g1 */
public final class C45362g1 extends C58286q<C49452fo1> {

    /* renamed from: t */
    public final JSONObject f122859t = new JSONObject();

    /* renamed from: u */
    public C49311eo1 f122860u;

    /* renamed from: dj1.g1$a */
    public interface C45363a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45362g1(ArrayList arrayList, long j, long j2, long j3, String str, C45363a aVar, int i, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "userName");
        C49311eo1 eo12 = new C49311eo1();
        this.f122860u = eo12;
        eo12.f133030d = C46523h2.f125330a.mo71860b(5891, this.f172731j);
        LinkedList<String> linkedList = new LinkedList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedList.add((String) it.next());
            }
        }
        C49311eo1 eo13 = this.f122860u;
        eo13.f133031e = linkedList;
        eo13.f133033g = j2;
        eo13.f133034h = j3;
        eo13.f133035i = str;
        eo13.f133032f = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = eo13;
        C49452fo1 fo12 = new C49452fo1();
        fo12.setBaseResponse(new C49966ja());
        fo12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = fo12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderupdatelivesonglist";
        bVar.f127069d = 5891;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122859t;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49452fo1) eu32, "resp");
        Log.m105924i("Finder.CgiFinderUpdateLiveSongList", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
