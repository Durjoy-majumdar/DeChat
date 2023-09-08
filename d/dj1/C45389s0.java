package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51104rg1;
import te3.C51163rv3;
import te3.C51239sg1;

/* renamed from: dj1.s0 */
public final class C45389s0 extends C58286q<C51239sg1> {

    /* renamed from: t */
    public final C45390a f122904t;

    /* renamed from: u */
    public final String f122905u = "Finder.CgiFinderLivePause";

    /* renamed from: v */
    public C51104rg1 f122906v;

    /* renamed from: dj1.s0$a */
    public interface C45390a {
        /* renamed from: a */
        void mo10574a(int i, int i2, String str, C51239sg1 sg12);
    }

    public C45389s0(long j, String str, long j2, int i, int i2, int i3, C45390a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        this.f122904t = aVar;
        C51104rg1 rg12 = new C51104rg1();
        this.f122906v = rg12;
        rg12.f140890f = j;
        rg12.f140888d = str;
        rg12.f140889e = j2;
        rg12.f140891g = i;
        rg12.f140892h = i2;
        rg12.f140893i = i3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = rg12;
        C51239sg1 sg12 = new C51239sg1();
        sg12.setBaseResponse(new C49966ja());
        sg12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = sg12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderpauselive";
        bVar.f127069d = 4197;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLivePause", "CgiFinderLivePause init " + this.f122906v.f140890f + ',' + this.f122906v.f140888d + ",pause_second:" + this.f122906v.f140891g + ",pause_mode:" + this.f122906v.f140892h);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51239sg1 sg12 = (C51239sg1) eu32;
        C87412m.m108594g(sg12, "resp");
        String str2 = this.f122905u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45390a aVar = this.f122904t;
        if (aVar != null) {
            aVar.mo10574a(i, i2, str, sg12);
        }
    }
}
