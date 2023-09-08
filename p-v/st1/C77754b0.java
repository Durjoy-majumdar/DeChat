package st1;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import ob0.C117747y;
import p602ly.C109440d;
import p623nr.C47294g;
import p623nr.C76954e;
import p623nr.C76955f;
import p623nr.C76956i;
import pv2.C77290d;
import tt1.C78088b;
import tt1.C78089c;
import tt1.C78092f;
import tt1.C78101i;
import vt1.C78474b;
import vt1.C78476d;
import xt3.C53448e;

/* renamed from: st1.b0 */
public class C77754b0 implements C78476d {

    /* renamed from: a */
    public WeakReference<WalletBaseUI> f226574a = null;

    /* renamed from: b */
    public C78474b f226575b = null;

    /* renamed from: c */
    public String f226576c = "";

    /* renamed from: d */
    public C78474b f226577d = null;

    /* renamed from: e */
    public C76956i f226578e;

    /* renamed from: f */
    public String f226579f;

    /* renamed from: g */
    public String f226580g;

    /* renamed from: h */
    public String f226581h;

    /* renamed from: st1.b0$a */
    public class C77755a implements C78088b {

        /* renamed from: a */
        public final /* synthetic */ C78474b f226582a;

        public C77755a(C78474b bVar) {
            this.f226582a = bVar;
        }

        /* renamed from: a */
        public void mo107892a(C78089c cVar) {
            C78089c cVar2 = cVar;
            Log.m105925i("MicroMsg.SoterFingerprintOpenDelegate", "authentication result: %s", Integer.valueOf(cVar2.f228884a));
            int i = cVar2.f228884a;
            String str = "";
            if (i != 0) {
                if (i != 2005) {
                    if (i != 2007) {
                        if (i == 2009) {
                            Log.m105925i("MicroMsg.SoterFingerprintOpenDelegate", "hy: on error: %d", Integer.valueOf(i));
                            str = MMApplicationContext.getContext().getString(C0966R.string.jle);
                            C77290d.m93109g(1000, -1000223, cVar2.f228884a, "fingerprint error");
                            C77290d.m93103a(3, 2);
                        } else if (i != 10308) {
                            switch (i) {
                                case 2000:
                                case 2001:
                                    Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "identify timeout");
                                    return;
                                case 2002:
                                    Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "identify FingerPrintConst.RESULT_NO_MATCH");
                                    this.f226582a.mo94918n(-1, str);
                                    return;
                            }
                        }
                    }
                    Log.m105925i("MicroMsg.SoterFingerprintOpenDelegate", "hy: on error: %d", Integer.valueOf(i));
                    String string = MMApplicationContext.getContext().getString(C0966R.string.jle);
                    if (cVar2.f228884a == 10308) {
                        String string2 = MMApplicationContext.getContext().getString(C0966R.string.jlg);
                        C77290d.m93109g(6, -1000223, -1, "too many trial");
                        this.f226582a.mo94918n(-3, string2);
                        return;
                    }
                    if (Build.VERSION.SDK_INT == 27 && "Xiaomi".equals(Build.MANUFACTURER)) {
                        string = MMApplicationContext.getContext().getString(C0966R.string.amo);
                    }
                    str = string;
                    C77290d.m93109g(1000, -1000223, cVar2.f228884a, "fingerprint error");
                    C115669n.INSTANCE.mo175911u(1104, 39);
                } else {
                    str = MMApplicationContext.getContext().getString(C0966R.string.jlh);
                    C77290d.m93109g(1000, -1000223, cVar2.f228884a, "fingerprint error");
                    C115669n.INSTANCE.mo175911u(1104, 39);
                }
                this.f226582a.mo94918n(-2, str);
                return;
            }
            Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "identify success");
            C77754b0.this.getClass();
            C77754b0 b0Var = C77754b0.this;
            b0Var.f226580g = cVar2.f228888e;
            b0Var.f226581h = cVar2.f228889f;
            C115669n.INSTANCE.mo175911u(1104, 40);
            this.f226582a.mo94918n(0, str);
        }
    }

    /* renamed from: st1.b0$b */
    public class C77756b implements Runnable {
        public C77756b() {
        }

        public void run() {
            C77754b0.this.mo107890d(0, "");
        }
    }

    /* renamed from: a */
    public void mo107886a(Context context, C78474b bVar) {
        Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "request authentication");
        if (Util.isNullOrNil(this.f226579f)) {
            Log.m105928w("MicroMsg.SoterFingerprintOpenDelegate", "no challenge!!");
        } else if (bVar != null) {
            C115669n.INSTANCE.mo175911u(1104, 41);
            ((C78101i) C86709a0.m107533q(C78101i.class)).mo108082n4(context, new C78092f(this.f226579f, 1), new C77755a(bVar));
        }
    }

    /* renamed from: b */
    public void mo107887b(Context context, C78474b bVar, String str) {
        Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: prepare");
        this.f226578e = ((C109440d) C86312j.m106911c(C109440d.class)).mo160182Uq();
        WeakReference<WalletBaseUI> weakReference = new WeakReference<>((WalletBaseUI) context);
        this.f226574a = weakReference;
        this.f226575b = bVar;
        this.f226576c = str;
        weakReference.get().addSceneEndListener(1586);
        this.f226574a.get().addSceneEndListener(1638);
        C77290d.m93112j();
        ((C78101i) C86709a0.m107533q(C78101i.class)).mo108070G3(new Object[0]);
        Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: start gen auth key");
        C115669n.INSTANCE.mo175911u(1104, 35);
        this.f226578e.mo107277b(new C77757c0(this), true, 1, (C53448e) ((C76954e) C86312j.m106911c(C76954e.class)).A30(this.f226576c, 1));
    }

    /* renamed from: c */
    public void mo107888c(C78474b bVar, String str, int i) {
        Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: doOpenFP");
        this.f226577d = bVar;
        if (!Util.isNullOrNil(this.f226580g)) {
            WeakReference<WalletBaseUI> weakReference = this.f226574a;
            if (weakReference != null && weakReference.get() != null) {
                this.f226574a.get().doSceneProgress((C117747y) ((C76954e) C86312j.m106911c(C76954e.class)).mo72336RG(this.f226580g, this.f226581h, this.f226576c, 1));
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.SoterFingerprintOpenDelegate", "hy: signature is null");
        C77290d.m93109g(9, -1000223, -1, "signature is null");
        mo107890d(-1, MMApplicationContext.getContext().getString(C0966R.string.eud));
    }

    public void clear() {
        Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: clear");
        WeakReference<WalletBaseUI> weakReference = this.f226574a;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f226574a.get().removeSceneEndListener(1586);
            this.f226574a.get().removeSceneEndListener(1638);
        }
        this.f226575b = null;
        C77761h0.IML.mo107896a();
        WeakReference<WalletBaseUI> weakReference2 = this.f226574a;
        if (weakReference2 != null && weakReference2.get() != null) {
            this.f226574a.clear();
        }
    }

    /* renamed from: d */
    public final void mo107890d(int i, String str) {
        C78474b bVar = this.f226575b;
        if (bVar != null) {
            bVar.mo94918n(i, str);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.SoterFingerprintOpenDelegate", "hy: onSceneEnd: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (Util.isNullOrNil(str)) {
            str = MMApplicationContext.getContext().getString(C0966R.string.eud);
        }
        if (yVar instanceof C76955f) {
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "get challenge success");
                C76955f fVar = (C76955f) yVar;
                if (Util.isNullOrNil(fVar.mo73581w0())) {
                    mo107890d(-1, str);
                    return true;
                }
                this.f226579f = fVar.mo73581w0();
                MMHandlerThread.postToMainThread(new C77756b());
            } else {
                Log.m105920e("MicroMsg.SoterFingerprintOpenDelegate", "hy: failed get challenge");
                mo107890d(i2, str);
                C77290d.m93109g(7, i, i2, "get challenge failed");
                return true;
            }
        }
        if (!(yVar instanceof C47294g)) {
            return false;
        }
        if (i2 == 0 && i == 0) {
            Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open success");
            C77290d.m93110h();
            C77290d.m93109g(0, 0, 0, "OK");
            Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
            clear();
            this.f226577d.mo94918n(0, str);
            this.f226577d = null;
        } else {
            Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: open");
            C77290d.m93109g(8, i, i2, "open fp pay failed");
            Log.m105924i("MicroMsg.SoterFingerprintOpenDelegate", "hy: callback total");
            clear();
            this.f226577d.mo94918n(-1, str);
            this.f226577d = null;
        }
        return true;
    }
}
