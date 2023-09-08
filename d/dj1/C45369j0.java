package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import je1.C46523h2;
import kt1.C46744d;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51623v01;
import te3.C51763w01;
import zc1.C66785b;

/* renamed from: dj1.j0 */
public final class C45369j0 extends C58286q<C51763w01> {

    /* renamed from: t */
    public final String f122873t = "Finder.CgiFinderLiveGetRedPacketInfo";

    /* renamed from: u */
    public C51623v01 f122874u;

    /* renamed from: dj1.j0$a */
    public interface C45370a {
        /* renamed from: a */
        void mo70891a(int i, int i2, String str, C51763w01 w012);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45369j0(long j, long j2, String str, byte[] bArr, int i, List<String> list) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "nonceId");
        C87412m.m108594g(list, "sendIdList");
        C51623v01 v012 = new C51623v01();
        this.f122874u = v012;
        v012.f143218h = j;
        v012.f143217g = j2;
        v012.f143219i = str;
        v012.f143214d = C46523h2.f125330a.mo71859a(6271);
        this.f122874u.f143215e = C89349b.m111674a(bArr);
        this.f122874u.f143220j = C66785b.f191882e.mo90662O5();
        C51623v01 v013 = this.f122874u;
        v013.f143221n = i;
        LinkedList<String> linkedList = v013.f143216f;
        if (linkedList != null) {
            linkedList.addAll(list);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122874u;
        C51763w01 w012 = new C51763w01();
        w012.setBaseResponse(new C49966ja());
        w012.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = w012;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetredpacketinfo";
        bVar.f127069d = 6271;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetRedPacketInfo", "CgiFinderLiveGetRedPacketInfo, init liveId:" + this.f122874u.f143218h + ", objectId:" + this.f122874u.f143217g + ", nonceId:" + this.f122874u.f143219i + ", send_id_list:" + this.f122874u.f143216f);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51763w01 w012 = (C51763w01) eu32;
        C87412m.m108594g(w012, "resp");
        String str2 = this.f122873t;
        Log.m105924i(str2, "CgiFinderLiveGetRedPacketInfo [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ",result:" + C61937h.m72709h(w012));
    }
}
