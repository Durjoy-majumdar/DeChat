package hi2;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f72.C97842b;
import p159gw.C98250h;
import te3.C101781gb0;

/* renamed from: hi2.m */
public final class C98462m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101781gb0 f288795d;

    public C98462m(C101781gb0 gb02) {
        this.f288795d = gb02;
    }

    public final void run() {
        C101781gb0 gb02 = this.f288795d;
        if (!gb02.f298296i) {
            C98453h.f288774a.mo137810h(gb02.f298298n);
        }
        if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
            C101781gb0 gb03 = this.f288795d;
            boolean z = gb03.f298294g;
            if (z || (!z && gb03.f298297j && gb03.f298295h)) {
                String i = C97842b.m126292i("mp4");
                if (!this.f288795d.f298294g) {
                    i = AndroidMediaUtil.getExportVideoPath("mp4");
                }
                ((C98250h) C86312j.m106911c(C98250h.class)).O00(MMApplicationContext.getContext(), this.f288795d.f298299o, i);
                AndroidMediaUtil.refreshMediaScanner(i, MMApplicationContext.getContext());
            }
        }
    }
}
