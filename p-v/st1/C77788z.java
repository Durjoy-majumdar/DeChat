package st1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import ob0.C117747y;
import ot3.C21889m;
import p602ly.C109440d;
import p623nr.C47294g;
import p623nr.C76954e;
import p623nr.C76955f;
import p623nr.C76956i;
import pv2.C77290d;
import tt1.C78101i;
import vt1.C78474b;
import vt1.C78476d;
import xt3.C53448e;

/* renamed from: st1.z */
public class C77788z implements C78476d {

    /* renamed from: a */
    public WeakReference<WalletBaseUI> f226644a;

    /* renamed from: b */
    public C78474b f226645b;

    /* renamed from: c */
    public C78474b f226646c;

    /* renamed from: d */
    public String f226647d;

    /* renamed from: e */
    public C76956i f226648e;

    /* renamed from: st1.z$a */
    public class C77789a implements Runnable {
        public C77789a() {
        }

        public void run() {
            C77788z.this.mo107931d(0, "");
        }
    }

    /* renamed from: a */
    public void mo107886a(Context context, C78474b bVar) {
    }

    /* renamed from: b */
    public void mo107887b(Context context, C78474b bVar, String str) {
        Log.m105924i("MicroMsg.SoterFaceIdOpenDelegate", "do prepare");
        this.f226645b = bVar;
        this.f226647d = str;
        this.f226644a = new WeakReference<>((WalletBaseUI) context);
        this.f226648e = ((C109440d) C86312j.m106911c(C109440d.class)).mo160182Uq();
        this.f226644a.get().addSceneEndListener(1586);
        this.f226644a.get().addSceneEndListener(1638);
        ((C78101i) C86709a0.m107533q(C78101i.class)).mo108070G3(new Object[0]);
        this.f226648e.mo107277b(new C77753a0(this), true, 1, (C53448e) ((C76954e) C86312j.m106911c(C76954e.class)).A30(this.f226647d, 2));
    }

    /* renamed from: c */
    public void mo107888c(C78474b bVar, String str, int i) {
        Log.m105924i("MicroMsg.SoterFaceIdOpenDelegate", "hy: doOpenFP");
        this.f226646c = bVar;
        C21889m mVar = C77761h0.IML.f226593g;
        if (mVar != null) {
            WeakReference<WalletBaseUI> weakReference = this.f226644a;
            if (weakReference != null && weakReference.get() != null) {
                this.f226644a.get().doSceneProgress((C117747y) ((C76954e) C86312j.m106911c(C76954e.class)).mo72336RG(mVar.f61899j, mVar.f61900k, this.f226647d, 2));
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.SoterFaceIdOpenDelegate", "hy: signature is null");
        C77290d.m93107e(9, -1000223, -1, "signature is null");
        String string = MMApplicationContext.getContext().getString(C0966R.string.clv);
        C78474b bVar2 = this.f226646c;
        if (bVar2 != null) {
            bVar2.mo94918n(-1, string);
        }
    }

    public void clear() {
        Log.m105924i("MicroMsg.SoterFaceIdOpenDelegate", "hy: clear");
        WeakReference<WalletBaseUI> weakReference = this.f226644a;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f226644a.get().removeSceneEndListener(1586);
            this.f226644a.get().removeSceneEndListener(1638);
        }
        C77761h0.IML.mo107896a();
        WeakReference<WalletBaseUI> weakReference2 = this.f226644a;
        if (weakReference2 != null && weakReference2.get() != null) {
            this.f226644a.clear();
        }
    }

    /* renamed from: d */
    public final void mo107931d(int i, String str) {
        C78474b bVar = this.f226645b;
        if (bVar != null) {
            bVar.mo94918n(i, str);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.SoterFaceIdOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s, scene: %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.clv);
        }
        if (yVar instanceof C76955f) {
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.SoterFaceIdOpenDelegate", "get challenge success");
                if (Util.isNullOrNil(((C76955f) yVar).mo73581w0())) {
                    mo107931d(-1, str);
                    return true;
                }
                MMHandlerThread.postToMainThread(new C77789a());
            } else {
                Log.m105920e("MicroMsg.SoterFaceIdOpenDelegate", "hy: failed get challenge");
                mo107931d(i2, str);
                C77290d.m93107e(7, i, i2, "get challenge failed");
                return true;
            }
        }
        if (!(yVar instanceof C47294g)) {
            return false;
        }
        if (i2 == 0 && i == 0) {
            Log.m105924i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open success");
            C77290d.m93110h();
            C77290d.m93107e(0, 0, 0, "OK");
            C78474b bVar = this.f226646c;
            if (bVar != null) {
                bVar.mo94918n(0, str);
            }
        } else {
            Log.m105924i("MicroMsg.SoterFaceIdOpenDelegate", "hy: open");
            C77290d.m93107e(8, i, i2, "open fp pay failed");
            C78474b bVar2 = this.f226646c;
            if (bVar2 != null) {
                bVar2.mo94918n(-1, str);
            }
        }
        return true;
    }
}
