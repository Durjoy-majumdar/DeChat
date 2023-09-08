package eu0;

import bd2.C79690d;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import du0.C31289a;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89144l0;
import te3.b75;
import te3.c75;

/* renamed from: eu0.h */
public final class C86694h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f251703d;

    /* renamed from: e */
    public final /* synthetic */ String f251704e;

    /* renamed from: eu0.h$a */
    public static final class C86695a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f251705d;

        /* renamed from: e */
        public final /* synthetic */ String f251706e;

        public C86695a(int i, String str) {
            this.f251705d = i;
            this.f251706e = str;
        }

        public final void run() {
            Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "Timeout Reason[didn't accept the call in " + this.f251705d + " seconds]");
            C86683b.f251674a.mo121066c();
            String str = this.f251706e;
            C87412m.m108594g(str, "roomId");
            C47350c.C47352b bVar = new C47350c.C47352b();
            b75 b75 = new b75();
            b75.f131003e = 10;
            b75.f131002d = str;
            bVar.f127066a = b75;
            bVar.f127067b = new c75();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
            bVar.f127069d = 5036;
            C89144l0.m111429e(bVar.mo72403a(), C31289a.f83781d, true);
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(41);
        }
    }

    public C86694h(int i, String str) {
        this.f251703d = i;
        this.f251704e = str;
    }

    public final void run() {
        C86683b.f251674a.mo121069f(new C86695a(this.f251703d, this.f251704e));
    }
}
