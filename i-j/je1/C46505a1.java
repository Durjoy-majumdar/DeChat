package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58286q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.UUID;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51064r61;
import te3.C51163rv3;
import te3.C51203s61;

/* renamed from: je1.a1 */
public final class C46505a1 extends C58286q<C51203s61> {

    /* renamed from: t */
    public final String f125287t = "Finder.CgiFinderLiveReceiveCoupon";

    /* renamed from: u */
    public C46506a f125288u;

    /* renamed from: v */
    public C51064r61 f125289v;

    /* renamed from: je1.a1$a */
    public interface C46506a {
        /* renamed from: a */
        void mo607a(int i, int i2, String str, C51203s61 s612);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46505a1(long j, long j2, String str, String str2, C89349b bVar, LinkedList<String> linkedList, C46506a aVar, String str3) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "anchorUsername");
        C87412m.m108594g(linkedList, "stockIds");
        C87412m.m108594g(aVar, "callback");
        C87412m.m108594g(str3, "noticeId");
        this.f125288u = aVar;
        C51064r61 r612 = new C51064r61();
        this.f125289v = r612;
        r612.f140722d = C46523h2.f125330a.mo71859a(6219);
        C51064r61 r613 = this.f125289v;
        r613.f140724f = j;
        r613.f140723e = j2;
        r613.f140726h = str;
        r613.f140729n = str2;
        r613.f140727i = bVar;
        r613.f140725g = linkedList;
        r613.f140728j = UUID.randomUUID().toString();
        C51064r61 r614 = this.f125289v;
        r614.f140731p = str3;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = r614;
        C51203s61 s612 = new C51203s61();
        s612.setBaseResponse(new C49966ja());
        s612.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = s612;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivereceivecoupon";
        bVar2.f127069d = 6219;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveReceiveCoupon", "init " + this.f125289v.f140724f);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51203s61 s612 = (C51203s61) eu32;
        C87412m.m108594g(s612, "resp");
        String str2 = this.f125287t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        this.f125288u.mo607a(i, i2, str, s612);
    }
}
