package com.tencent.p014mm.plugin.fingerprint.p842ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import f40.C86709a0;
import j20.C117292a;
import nj3.C76879j;
import ob0.C117747y;
import p910lj.C76701a;
import pv2.C77290d;
import tt1.C78101i;
import v53.C78342e0;
import vt1.C78473a;
import vt1.C78474b;
import vt1.C78476d;
import wt1.C78698o;
import wt1.C78700p;
import yq3.C79143a;
import yt3.C23319f;

/* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI */
public class FingerPrintAuthUI extends WalletBaseUI implements C78474b {

    /* renamed from: n */
    public static final /* synthetic */ int f198198n = 0;

    /* renamed from: d */
    public TextView f198199d;

    /* renamed from: e */
    public Dialog f198200e = null;

    /* renamed from: f */
    public boolean f198201f = false;

    /* renamed from: g */
    public Animation f198202g;

    /* renamed from: h */
    public int f198203h = 0;

    /* renamed from: i */
    public C78476d f198204i = null;

    /* renamed from: j */
    public boolean f198205j = false;

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI$a */
    public class C68976a implements C78474b {
        public C68976a() {
        }

        /* renamed from: n */
        public void mo94918n(int i, String str) {
            FingerPrintAuthUI fingerPrintAuthUI = FingerPrintAuthUI.this;
            fingerPrintAuthUI.getClass();
            MMHandlerThread.postToMainThread(new C78698o(fingerPrintAuthUI, false));
            if (i == 0) {
                FingerPrintAuthUI fingerPrintAuthUI2 = FingerPrintAuthUI.this;
                fingerPrintAuthUI2.f198201f = true;
                Log.m105925i("MicroMsg.FingerPrintAuthUI", "hy: is screen on: %b", Boolean.valueOf(!fingerPrintAuthUI2.f198205j));
                if (!fingerPrintAuthUI2.f198205j) {
                    FingerPrintAuthUI fingerPrintAuthUI3 = FingerPrintAuthUI.this;
                    fingerPrintAuthUI3.getClass();
                    Log.m105924i("MicroMsg.FingerPrintAuthUI", "request Identify2");
                    fingerPrintAuthUI3.f198204i.mo107886a(fingerPrintAuthUI3.getContext(), new C78700p(fingerPrintAuthUI3));
                    return;
                }
                return;
            }
            FingerPrintAuthUI.this.mo94928H7(str, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI$b */
    public class C68977b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f198207d;

        /* renamed from: e */
        public final /* synthetic */ int f198208e;

        /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI$b$a */
        public class C68978a implements DialogInterface.OnClickListener {
            public C68978a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C79143a.m95764c(FingerPrintAuthUI.this, new Bundle(), C68977b.this.f198208e);
            }
        }

        public C68977b(String str, int i) {
            this.f198207d = str;
            this.f198208e = i;
        }

        public void run() {
            String str = this.f198207d;
            if (Util.isNullOrNil(str)) {
                str = FingerPrintAuthUI.this.getString(C0966R.string.eud);
            }
            FingerPrintAuthUI fingerPrintAuthUI = FingerPrintAuthUI.this;
            C76879j.m92711E(fingerPrintAuthUI, str, "", fingerPrintAuthUI.getString(C0966R.string.ktq), false, new C68978a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI$c */
    public class C68979c implements DialogInterface.OnClickListener {
        public C68979c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C79143a.m95764c(FingerPrintAuthUI.this, new Bundle(), -1);
        }
    }

    /* renamed from: H7 */
    public final void mo94928H7(String str, int i) {
        this.f198201f = false;
        MMHandlerThread.postToMainThread(new C68977b(str, i));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ari;
    }

    /* renamed from: n */
    public void mo94918n(int i, String str) {
        if (i == 0) {
            Log.m105924i("MicroMsg.FingerPrintAuthUI", "open fingerprintpay success");
            doSceneProgress(new C78342e0((String) null, 19), false);
            return;
        }
        MMHandlerThread.postToMainThread(new C78698o(this, false));
        Log.m105920e("MicroMsg.FingerPrintAuthUI", "open fingerprintpay failed");
        C76879j.m92749t(this, getString(C0966R.string.eud), "", new C68979c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(C0966R.string.hev));
        this.f198199d = (TextView) findViewById(C0966R.C0970id.f7x);
        C78101i iVar = (C78101i) C86709a0.m107533q(C78101i.class);
        C78476d RQ = iVar.mo108075RQ();
        this.f198204i = RQ;
        if (RQ == null) {
            mo94928H7(getString(C0966R.string.eud), -1);
            return;
        }
        Bundle e = C79143a.m95766e(this);
        if (e != null) {
            String string = e.getString("pwd");
            if (TextUtils.isEmpty(string)) {
                Log.m105920e("MicroMsg.FingerPrintAuthUI", "get user pwd error");
                mo94928H7(getString(C0966R.string.eud), -1);
                C77290d.m93109g(1000, -1000223, -1, "get user pwd error");
            } else if (!iVar.mo108074Qk()) {
                mo94928H7(getString(C0966R.string.l3b), -1);
            } else if (iVar.mo108079gv()) {
                MMHandlerThread.postToMainThread(new C78698o(this, true));
                C23319f.m27817c().mo36811b();
                this.f198204i.mo107887b(this, new C68976a(), string);
            } else {
                Log.m105920e("MicroMsg.FingerPrintAuthUI", "device is not support FingerPrintAuth");
            }
        } else {
            Log.m105920e("MicroMsg.FingerPrintAuthUI", "contextdata is null,for that reason program can't get user pwd");
            mo94928H7(getString(C0966R.string.eud), -1);
            C77290d.m93109g(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.FingerPrintAuthUI", "hy: fingerprint auth ui on destroy");
        Animation animation = this.f198202g;
        if (animation != null) {
            animation.cancel();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f198205j = true;
        PowerManager.WakeLock newWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(536870913, "PostLocationService");
        if (newWakeLock != null) {
            PowerManager.WakeLock wakeLock = newWakeLock;
            C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            newWakeLock.acquire();
            C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        Log.m105924i("MicroMsg.FingerPrintAuthUI", "hy: user cancelled");
        ((C78473a) C86709a0.m107533q(C78473a.class)).userCancel();
        if (newWakeLock != null) {
            PowerManager.WakeLock wakeLock2 = newWakeLock;
            C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            newWakeLock.release();
            C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public void onResume() {
        super.onResume();
        this.f198205j = false;
        if (this.f198201f) {
            Log.m105924i("MicroMsg.FingerPrintAuthUI", "request Identify2");
            this.f198204i.mo107886a(getContext(), new C78700p(this));
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (this.f198204i.onSceneEnd(i, i2, str, yVar)) {
            return true;
        }
        if (!(yVar instanceof C78342e0)) {
            return false;
        }
        MMHandlerThread.postToMainThread(new C78698o(this, false));
        C79143a.m95764c(this, new Bundle(), 0);
        C76701a.makeText((Context) this, (int) C0966R.string.eue, 0).show();
        return true;
    }
}
