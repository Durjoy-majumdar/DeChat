package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import kt1.C46744d;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49619gw0;
import te3.C49712hj1;
import te3.C49760hw0;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: dj1.w */
public final class C45395w extends C58286q<C49760hw0> {

    /* renamed from: t */
    public final String f122912t = "Finder.CgiFinderLiveBatchGetMusicInfo";

    /* renamed from: u */
    public C45396a f122913u;

    /* renamed from: v */
    public C49619gw0 f122914v;

    /* renamed from: dj1.w$a */
    public interface C45396a {
        /* renamed from: a */
        void mo70900a(int i, int i2, String str, C49760hw0 hw02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45395w(long j, byte[] bArr, String str, long j2, int i, LinkedList<Integer> linkedList, C45396a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(linkedList, "songIdList");
        C87412m.m108594g(aVar, "callback");
        boolean z = true;
        this.f122913u = aVar;
        C49619gw0 gw02 = new C49619gw0();
        this.f122914v = gw02;
        gw02.f134312d = C46523h2.f125330a.mo71859a(6887);
        C49619gw0 gw03 = this.f122914v;
        gw03.f134317i = j;
        gw03.f134316h = C89349b.m111674a(bArr);
        C49619gw0 gw04 = this.f122914v;
        gw04.f134313e = str;
        gw04.f134318j = j2;
        gw04.f134315g = i;
        gw04.f134314f = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = gw04;
        C49760hw0 hw02 = new C49760hw0();
        hw02.setBaseResponse(new C49966ja());
        hw02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = hw02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivebatchgetmusicinfo";
        bVar.f127069d = 6887;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("CgiFinderLiveBatchGetMusicInfo init ");
        sb.append(this.f122914v.f134317i);
        sb.append(',');
        sb.append(this.f122914v.f134313e);
        sb.append(',');
        sb.append(this.f122914v.f134315g);
        sb.append(",liveCookies is null:");
        sb.append(this.f122914v.f134316h != null ? false : z);
        Log.m105924i("Finder.CgiFinderLiveBatchGetMusicInfo", sb.toString());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49760hw0 hw02 = (C49760hw0) eu32;
        C87412m.m108594g(hw02, "resp");
        String str2 = this.f122912t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        this.f122913u.mo70900a(i, i2, str, hw02);
        if (i == 0 && i2 == 0) {
            String str3 = this.f122912t;
            Log.m105924i(str3, "FinderLiveBatchGetMusicInfoResponse:" + C61937h.m72709h(hw02));
        }
    }
}
