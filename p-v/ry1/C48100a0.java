package ry1;

import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42068j0;
import com.tencent.p014mm.plugin.game.model.C42113t0;
import com.tencent.p014mm.plugin.game.p061ui.GameDownloadGuidanceUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import sw1.C48484q;
import uy1.C52638a;
import uy1.C52642c;

/* renamed from: ry1.a0 */
public class C48100a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameDownloadGuidanceUI f128952d;

    /* renamed from: ry1.a0$a */
    public class C48101a implements Runnable {
        public C48101a() {
        }

        public void run() {
            if (!C48100a0.this.f128952d.isFinishing()) {
                GameDownloadGuidanceUI gameDownloadGuidanceUI = C48100a0.this.f128952d;
                gameDownloadGuidanceUI.f113829r = C52642c.m58986d(gameDownloadGuidanceUI);
                C48100a0.this.f128952d.f113829r.show();
            }
        }
    }

    /* renamed from: ry1.a0$b */
    public class C48102b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C42068j0 f128954d;

        public C48102b(C42068j0 j0Var) {
            this.f128954d = j0Var;
        }

        public void run() {
            try {
                C48100a0.this.f128952d.mo66167N7(this.f128954d, 1);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI crash, %s", e.getMessage());
                C48100a0.this.f128952d.finish();
            }
        }
    }

    public C48100a0(GameDownloadGuidanceUI gameDownloadGuidanceUI) {
        this.f128952d = gameDownloadGuidanceUI;
    }

    public void run() {
        byte[] Rz = ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz("pb_download_guidance");
        if (Rz == null) {
            MMHandlerThread.postToMainThread(new C48101a());
        } else {
            MMHandlerThread.postToMainThread(new C48102b(new C42068j0(Rz)));
        }
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        LinkedList<String> e = C42046d.m45746e(this.f128952d);
        GameDownloadGuidanceUI gameDownloadGuidanceUI = this.f128952d;
        C86709a0.m107524d().mo123460f(new C42113t0(applicationLanguage, e, gameDownloadGuidanceUI.f113686j, gameDownloadGuidanceUI.f113687n, gameDownloadGuidanceUI.f113688o, gameDownloadGuidanceUI.f113684h));
        C42046d.m45754m();
        C52638a.C52640b.f146975a.mo73590c();
    }
}
