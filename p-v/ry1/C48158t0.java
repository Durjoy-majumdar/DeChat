package ry1;

import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42077m0;
import com.tencent.p014mm.plugin.game.model.C42115u0;
import com.tencent.p014mm.plugin.game.p061ui.GameOverSeaCenterUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import sw1.C48483p;
import sw1.C48484q;
import uy1.C52638a;
import uy1.C52642c;

/* renamed from: ry1.t0 */
public class C48158t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameOverSeaCenterUI f129088d;

    /* renamed from: ry1.t0$a */
    public class C48159a implements Runnable {
        public C48159a() {
        }

        public void run() {
            if (!C48158t0.this.f129088d.isFinishing()) {
                GameOverSeaCenterUI gameOverSeaCenterUI = C48158t0.this.f129088d;
                gameOverSeaCenterUI.f114115y = C52642c.m58986d(gameOverSeaCenterUI);
                C48158t0.this.f129088d.f114115y.show();
            }
        }
    }

    /* renamed from: ry1.t0$b */
    public class C48160b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C42077m0 f129090d;

        public C48160b(C42077m0 m0Var) {
            this.f129090d = m0Var;
        }

        public void run() {
            try {
                GameOverSeaCenterUI.m45895N7(C48158t0.this.f129088d, this.f129090d, 1);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI crash, %s", e.getMessage());
                C48158t0.this.f129088d.finish();
            }
        }
    }

    /* renamed from: ry1.t0$c */
    public class C48161c implements Runnable {
        public C48161c() {
        }

        public void run() {
            C48158t0.this.f129088d.f114112v.mo66219b(true);
        }
    }

    public C48158t0(GameOverSeaCenterUI gameOverSeaCenterUI) {
        this.f129088d = gameOverSeaCenterUI;
    }

    public void run() {
        byte[] Rz = ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz("pb_over_sea");
        if (Rz == null) {
            MMHandlerThread.postToMainThread(new C48159a());
        } else {
            MMHandlerThread.postToMainThread(new C48160b(new C42077m0(Rz, false)));
        }
        ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65971b(this.f129088d);
        C52642c.m58988f(C42046d.m45746e(this.f129088d));
        MMHandlerThread.postToMainThread(new C48161c());
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        LinkedList<String> e = C42046d.m45746e(this.f129088d);
        GameOverSeaCenterUI gameOverSeaCenterUI = this.f129088d;
        C86709a0.m107524d().mo123460f(new C42115u0(applicationLanguage, e, gameOverSeaCenterUI.f113686j, gameOverSeaCenterUI.f113687n, gameOverSeaCenterUI.f113688o, gameOverSeaCenterUI.f113684h));
        C42046d.m45754m();
        C52638a.C52640b.f146975a.mo73590c();
    }
}
