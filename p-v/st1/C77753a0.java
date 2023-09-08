package st1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import java.lang.ref.WeakReference;
import lt3.C21460a;
import ob0.C117747y;
import p623nr.C76954e;
import p623nr.C76956i;
import pv2.C77290d;
import tt3.C22551c;

/* renamed from: st1.a0 */
public class C77753a0 implements C76956i.C76959c {

    /* renamed from: a */
    public final /* synthetic */ C77788z f226573a;

    public C77753a0(C77788z zVar) {
        this.f226573a = zVar;
    }

    /* renamed from: a */
    public void mo107283a(int i) {
    }

    /* renamed from: b */
    public void mo107284b(C22551c cVar) {
        int i = cVar.f61886a;
        if (i == 1006) {
            Log.m105920e("MicroMsg.SoterFaceIdOpenDelegate", "hy: failed upload: model is null or necessary elements null");
            C77290d.m93107e(4, -1000223, -1, "gen auth key failed: unexpected! generated but cannot get");
        } else if (i == 6) {
            C77290d.m93107e(4, -1000223, -1, "gen auth key failed");
            if (!Util.isNullOrNil(cVar.f61887b) && cVar.f61887b.startsWith("java.security.ProviderException")) {
                this.f226573a.mo107931d(-2, MMApplicationContext.getContext().getString(C0966R.string.amp));
                return;
            } else if (C21460a.m24273g() == 1 && !Util.isNullOrNil(cVar.f61887b) && cVar.f61887b.equals("errmsg not specified")) {
                this.f226573a.mo107931d(-2, MMApplicationContext.getContext().getString(C0966R.string.amq));
                return;
            }
        } else if (i == 1004) {
            Log.m105920e("MicroMsg.SoterFaceIdOpenDelegate", "hy: update pay auth key failed. remove");
            C77290d.m93107e(5, 4, cVar.f61886a, "upload auth key failed");
        } else if (i == 4 || i == 3) {
            Log.m105920e("MicroMsg.SoterFaceIdOpenDelegate", "hy: gen auth key failed");
            C77290d.m93107e(2, -1000223, -1, "gen ask failed");
        } else if (i == 1003) {
            Log.m105920e("MicroMsg.SoterFaceIdOpenDelegate", "alvinluo upload ask failed");
            C77290d.m93107e(3, 4, cVar.f61886a, cVar.f61887b);
        } else {
            Log.m105920e("MicroMsg.SoterFaceIdOpenDelegate", "alvinluo unknown error when prepare auth key");
            C77290d.m93107e(1000, -1000223, cVar.f61886a, cVar.f61887b);
        }
        this.f226573a.mo107931d(-1, MMApplicationContext.getContext().getString(C0966R.string.amo));
    }

    /* renamed from: c */
    public void mo107285c(C22551c cVar) {
        Log.m105924i("MicroMsg.SoterFaceIdOpenDelegate", "hy: update pay auth key success");
        WeakReference<WalletBaseUI> weakReference = this.f226573a.f226644a;
        if (weakReference == null || weakReference.get() == null) {
            this.f226573a.mo107931d(-1, "base ui is null");
        } else {
            this.f226573a.f226644a.get().doSceneProgress((C117747y) ((C76954e) C86312j.m106911c(C76954e.class)).mx0(2), false);
        }
    }
}
