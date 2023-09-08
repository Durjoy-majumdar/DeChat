package qg1;

import com.tencent.p014mm.autogen.events.FinderLiveNoticeStateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eg1.C31588n;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51826wf0;
import te3.C51965xf0;

/* renamed from: qg1.a */
public final class C35848a extends C60625c<C51965xf0> {

    /* renamed from: s */
    public final String f95678s;

    /* renamed from: t */
    public final String f95679t;

    /* renamed from: u */
    public final int f95680u;

    /* renamed from: v */
    public final String f95681v = "Finder.CgiFinderAudienceReserveLive";

    /* renamed from: w */
    public C51826wf0 f95682w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35848a(String str, String str2, int i, C49712hj1 hj12, Integer num) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        this.f95678s = str;
        this.f95679t = str2;
        this.f95680u = i;
        C51826wf0 wf02 = new C51826wf0();
        this.f95682w = wf02;
        wf02.f144011d = str;
        wf02.f144012e = str2;
        wf02.f144013f = i;
        wf02.f144017j = num != null ? num.intValue() : -1;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f95682w;
        C51965xf0 xf02 = new C51965xf0();
        xf02.setBaseResponse(new C49966ja());
        xf02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = xf02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderaudiencereservelive";
        bVar.f127069d = 6276;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderAudienceReserveLive", "init userName:" + str + ", noticeId:" + str2 + " ,optype:" + i + ", scene:" + num);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51965xf0) eu32, "resp");
        String str2 = this.f95681v;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        if (i == 0 && i2 == 0) {
            boolean z = false;
            ((C31588n) C86312j.m106911c(C31588n.class)).mo58243Oe(this.f95678s, this.f95679t, this.f95680u == 1);
            FinderLiveNoticeStateEvent finderLiveNoticeStateEvent = new FinderLiveNoticeStateEvent();
            FinderLiveNoticeStateEvent.C28744a aVar = finderLiveNoticeStateEvent.f78792d;
            aVar.f78793a = this.f95679t;
            if (this.f95680u == 1) {
                z = true;
            }
            aVar.f78794b = z;
            finderLiveNoticeStateEvent.publish();
        }
    }
}
