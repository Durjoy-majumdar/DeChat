package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49341ew0;
import te3.C49479fw0;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: dj1.v */
public final class C45393v extends C58286q<C49479fw0> {

    /* renamed from: t */
    public final C45394a f122909t;

    /* renamed from: u */
    public final String f122910u = "Finder.CgiFinderLiveBatchGetMicContact";

    /* renamed from: v */
    public C49341ew0 f122911v;

    /* renamed from: dj1.v$a */
    public interface C45394a {
        /* renamed from: a */
        void mo64565a(int i, int i2, String str, C49479fw0 fw02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45393v(long j, long j2, String str, byte[] bArr, int i, LinkedList<String> linkedList, C45394a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(linkedList, "usernameList");
        this.f122909t = aVar;
        C49341ew0 ew02 = new C49341ew0();
        this.f122911v = ew02;
        ew02.f133139f = j;
        ew02.f133137d = C46523h2.f125330a.mo71859a(4224);
        C49341ew0 ew03 = this.f122911v;
        ew03.f133140g = j2;
        ew03.f133141h = str;
        ew03.f133138e = C89349b.m111674a(bArr);
        this.f122911v.f133143j = C66785b.f191882e.mo90662O5();
        C49341ew0 ew04 = this.f122911v;
        ew04.f133142i = i;
        ew04.f133144n = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ew04;
        C49479fw0 fw02 = new C49479fw0();
        fw02.setBaseResponse(new C49966ja());
        fw02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = fw02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivebatchgetmiccontact";
        bVar.f127069d = 4224;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49479fw0 fw02 = (C49479fw0) eu32;
        C87412m.m108594g(fw02, "resp");
        String str2 = this.f122910u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45394a aVar = this.f122909t;
        if (aVar != null) {
            aVar.mo64565a(i, i2, str, fw02);
        }
    }
}
