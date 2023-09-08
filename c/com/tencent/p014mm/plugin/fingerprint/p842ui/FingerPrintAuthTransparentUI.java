package com.tencent.p014mm.plugin.fingerprint.p842ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import pv2.C77290d;
import qo3.C77390c0;
import tt1.C78101i;
import v53.C78342e0;
import vt1.C78473a;
import vt1.C78474b;
import vt1.C78475c;
import vt1.C78476d;
import wt1.C78657b;
import wt1.C78659c;
import wt1.C78661d;
import wt1.C78663e;
import wt1.C78665f;
import wt1.C78667g;
import wt1.C78669h;
import wt1.C78686i;
import wt1.C78688j;
import wt1.C78690k;
import wt1.C78692l;
import wt1.C78694m;
import wt1.C78696n;
import yt3.C23319f;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI */
public class FingerPrintAuthTransparentUI extends WalletBaseUI implements C78474b {

    /* renamed from: q */
    public static final /* synthetic */ int f198183q = 0;

    /* renamed from: d */
    public View f198184d = null;

    /* renamed from: e */
    public C77390c0 f198185e = null;

    /* renamed from: f */
    public Dialog f198186f;

    /* renamed from: g */
    public C78476d f198187g = null;

    /* renamed from: h */
    public int f198188h = -1;

    /* renamed from: i */
    public Animation f198189i;

    /* renamed from: j */
    public int f198190j = 0;

    /* renamed from: n */
    public int f198191n = 0;

    /* renamed from: o */
    public boolean f198192o = false;

    /* renamed from: p */
    public C78475c f198193p = new C68973b();

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI$a */
    public class C68972a implements DialogInterface.OnClickListener {
        public C68972a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "showErrorAlert, finish ui!");
            dialogInterface.dismiss();
            FingerPrintAuthTransparentUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI$b */
    public class C68973b implements C78475c {
        public C68973b() {
        }

        /* renamed from: a */
        public void mo23733a(int i, int i2, int i3, int i4) {
            if (i == 0) {
                Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "identify success");
                FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = FingerPrintAuthTransparentUI.this;
                fingerPrintAuthTransparentUI.f198188h = i2;
                fingerPrintAuthTransparentUI.mo94926P7();
                C77390c0 c0Var = fingerPrintAuthTransparentUI.f198185e;
                if (c0Var != null && c0Var.isShowing()) {
                    fingerPrintAuthTransparentUI.f198185e.dismiss();
                }
                fingerPrintAuthTransparentUI.mo94922L7();
            } else if (i != 2005) {
                if (i != 2007) {
                    if (i == 2009) {
                        Log.m105925i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", Integer.valueOf(i));
                        String string = MMApplicationContext.getContext().getString(C0966R.string.jle);
                        C77290d.m93109g(1000, -1000223, i, "fingerprint error");
                        C77290d.m93103a(3, 2);
                        FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI2 = FingerPrintAuthTransparentUI.this;
                        int i5 = FingerPrintAuthTransparentUI.f198183q;
                        fingerPrintAuthTransparentUI2.mo94925O7(-1, string);
                        return;
                    } else if (i != 10308) {
                        if (i == 2001) {
                            Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "identify timeout");
                            return;
                        } else if (i == 2002) {
                            Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "identify FingerPrintConst.RESULT_NO_MATCH");
                            FingerPrintAuthTransparentUI.m81238H7(FingerPrintAuthTransparentUI.this);
                            FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI3 = FingerPrintAuthTransparentUI.this;
                            fingerPrintAuthTransparentUI3.getClass();
                            C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
                            aVar.userCancel();
                            if (!aVar.iw0()) {
                                Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
                                return;
                            } else if (aVar.mo107917uN(fingerPrintAuthTransparentUI3.f198193p, 0, true) != 0) {
                                Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "startFingerprintAuth failed!");
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                Log.m105925i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", Integer.valueOf(i));
                String string2 = MMApplicationContext.getContext().getString(C0966R.string.jle);
                if (i == 10308) {
                    string2 = MMApplicationContext.getContext().getString(C0966R.string.jlf);
                    C77290d.m93109g(6, -1000223, -1, "too many trial");
                } else {
                    C77290d.m93109g(1000, -1000223, i, "fingerprint error");
                }
                FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI4 = FingerPrintAuthTransparentUI.this;
                int i6 = FingerPrintAuthTransparentUI.f198183q;
                fingerPrintAuthTransparentUI4.mo94925O7(-1, string2);
            } else {
                String string3 = MMApplicationContext.getContext().getString(C0966R.string.jlh);
                C77290d.m93109g(1000, -1000223, i, "fingerprint error");
                FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI5 = FingerPrintAuthTransparentUI.this;
                int i7 = FingerPrintAuthTransparentUI.f198183q;
                fingerPrintAuthTransparentUI5.mo94925O7(-1, string3);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI$c */
    public class C68974c implements C78474b {
        public C68974c() {
        }

        /* renamed from: n */
        public void mo94918n(int i, String str) {
            if (i == 0) {
                FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = FingerPrintAuthTransparentUI.this;
                int i2 = FingerPrintAuthTransparentUI.f198183q;
                fingerPrintAuthTransparentUI.mo94922L7();
            } else if (i == -1) {
                FingerPrintAuthTransparentUI.m81238H7(FingerPrintAuthTransparentUI.this);
            } else if (i == -3) {
                FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI2 = FingerPrintAuthTransparentUI.this;
                int i3 = FingerPrintAuthTransparentUI.f198183q;
                fingerPrintAuthTransparentUI2.getClass();
                if (Util.isNullOrNil(str)) {
                    str = fingerPrintAuthTransparentUI2.getString(C0966R.string.eud);
                }
                C76879j.m92709C(fingerPrintAuthTransparentUI2, str, "", fingerPrintAuthTransparentUI2.getString(C0966R.string.l_w), fingerPrintAuthTransparentUI2.getString(C0966R.string.ktq), false, new C78663e(fingerPrintAuthTransparentUI2), new C78665f(fingerPrintAuthTransparentUI2));
            } else {
                FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI3 = FingerPrintAuthTransparentUI.this;
                int i4 = FingerPrintAuthTransparentUI.f198183q;
                fingerPrintAuthTransparentUI3.mo94925O7(C0966R.string.eud, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI$d */
    public class C68975d implements C78474b {
        public C68975d() {
        }

        /* renamed from: n */
        public void mo94918n(int i, String str) {
            FingerPrintAuthTransparentUI.this.mo94924N7(false);
            if (i == 0) {
                Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "cert ready and do openFP");
                FingerPrintAuthTransparentUI.m81240J7(FingerPrintAuthTransparentUI.this);
                FingerPrintAuthTransparentUI.this.mo94923M7();
                return;
            }
            FingerPrintAuthTransparentUI.this.mo94925O7(-1, str);
        }
    }

    /* renamed from: H7 */
    public static void m81238H7(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        fingerPrintAuthTransparentUI.getClass();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (currentTimeMillis - fingerPrintAuthTransparentUI.f198190j > 1) {
            fingerPrintAuthTransparentUI.f198190j = currentTimeMillis;
            ((TextView) fingerPrintAuthTransparentUI.f198184d.findViewById(C0966R.C0970id.kmx)).setVisibility(8);
            TextView textView = (TextView) fingerPrintAuthTransparentUI.f198184d.findViewById(C0966R.C0970id.f357941cl2);
            textView.setVisibility(4);
            if (fingerPrintAuthTransparentUI.f198189i == null) {
                fingerPrintAuthTransparentUI.f198189i = AnimationUtils.loadAnimation(fingerPrintAuthTransparentUI.getContext(), C0966R.C0968anim.f2401c5);
            }
            textView.startAnimation(fingerPrintAuthTransparentUI.f198189i);
            MMHandlerThread.postToMainThreadDelayed(new C78686i(fingerPrintAuthTransparentUI, textView), fingerPrintAuthTransparentUI.f198189i.getDuration());
        }
    }

    /* renamed from: I7 */
    public static void m81239I7(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI, boolean z) {
        C77290d.m93111i(2, fingerPrintAuthTransparentUI.f198191n);
        if (z) {
            C77290d.m93109g(10, -1000223, -1, "user permanent cancelled");
            Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled and checked as not show anymore");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, Boolean.TRUE);
        } else {
            Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled but will show again");
            C77290d.m93109g(1, -1000223, -1, "user cancelled");
        }
        fingerPrintAuthTransparentUI.finish();
    }

    /* renamed from: J7 */
    public static void m81240J7(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        fingerPrintAuthTransparentUI.getClass();
        Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "showIdentifyUI!");
        View inflate = LayoutInflater.from(fingerPrintAuthTransparentUI).inflate(C0966R.C0971layout.arh, (ViewGroup) null);
        fingerPrintAuthTransparentUI.f198184d = inflate;
        ViewParent parent = inflate.getParent();
        ViewGroup viewGroup = parent != null ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ((ImageView) fingerPrintAuthTransparentUI.f198184d.findViewById(C0966R.C0970id.e99)).setOnClickListener(new C78657b(fingerPrintAuthTransparentUI));
        C77390c0 c0Var = fingerPrintAuthTransparentUI.f198185e;
        if (c0Var != null && c0Var.isShowing()) {
            fingerPrintAuthTransparentUI.f198185e.dismiss();
            fingerPrintAuthTransparentUI.f198185e = null;
        }
        C77390c0 c0Var2 = new C77390c0(fingerPrintAuthTransparentUI, C0966R.style.a69);
        fingerPrintAuthTransparentUI.f198185e = c0Var2;
        c0Var2.setContentView(fingerPrintAuthTransparentUI.f198184d);
        fingerPrintAuthTransparentUI.f198185e.setCanceledOnTouchOutside(false);
        fingerPrintAuthTransparentUI.f198185e.setCancelable(true);
        fingerPrintAuthTransparentUI.f198185e.show();
        fingerPrintAuthTransparentUI.f198185e.setOnCancelListener(new C78659c(fingerPrintAuthTransparentUI));
        C76879j.m92730a(fingerPrintAuthTransparentUI, fingerPrintAuthTransparentUI.f198185e);
    }

    /* renamed from: K7 */
    public final void mo94921K7() {
        C77290d.m93111i(3, this.f198191n);
        Intent intent = getIntent();
        this.f198187g.mo107887b(this, new C68975d(), intent != null ? intent.getStringExtra("key_pwd1") : "");
        mo94924N7(true);
        C77390c0 c0Var = this.f198185e;
        if (c0Var != null && c0Var.isShowing()) {
            this.f198185e.dismiss();
        }
    }

    /* renamed from: L7 */
    public final void mo94922L7() {
        C78476d dVar = this.f198187g;
        dVar.mo107888c(this, "" + this.f198188h, 2);
    }

    /* renamed from: M7 */
    public final void mo94923M7() {
        this.f198187g.mo107886a(getContext(), new C68974c());
    }

    /* renamed from: N7 */
    public void mo94924N7(boolean z) {
        if (z) {
            this.f198186f = C75197d0.m90164e(this, false, (DialogInterface.OnCancelListener) null);
            return;
        }
        Dialog dialog = this.f198186f;
        if (dialog != null && dialog.isShowing()) {
            this.f198186f.dismiss();
            this.f198186f = null;
        }
    }

    /* renamed from: O7 */
    public final void mo94925O7(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = getString(i);
        }
        C76879j.m92711E(this, str, "", getString(C0966R.string.ktq), false, new C68972a());
    }

    /* renamed from: P7 */
    public final void mo94926P7() {
        Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled");
        ((C78473a) C86709a0.m107533q(C78473a.class)).userCancel();
    }

    public void finish() {
        C78476d dVar = this.f198187g;
        if (dVar != null) {
            dVar.clear();
        }
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return -1;
    }

    /* renamed from: n */
    public void mo94918n(int i, String str) {
        mo94924N7(false);
        if (i == 0) {
            Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay success");
            doSceneProgress(new C78342e0((String) null, 19), false);
            C76879j.m92711E(this, getString(C0966R.string.eug), getString(C0966R.string.euc), getString(C0966R.string.l39), false, new C78661d(this));
        } else if (i == -2) {
            Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay failed");
            if (TextUtils.isEmpty(str)) {
                str = getString(C0966R.string.eud);
            }
            C76879j.m92709C(this, str, "", getString(C0966R.string.eul), getString(C0966R.string.f7926wf), false, new C78667g(this), new C78669h(this));
        } else {
            mo94925O7(-1, str);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "launch FingerPrintAuthTransparentUI");
        C78101i iVar = (C78101i) C86709a0.m107533q(C78101i.class);
        if (!iVar.mo108079gv()) {
            Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "device is not support FingerPrintAuth or load fingerpringauth so failed, finish UI!");
            finish();
        } else if (C75592q0.m90763K()) {
            Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "now account is isPayUPay, finish UI!");
            finish();
        } else if (iVar.mo73371F7()) {
            Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "getIsOpenFPFromLocal is true, finish UI!");
            finish();
        } else if (!iVar.mo108074Qk()) {
            Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "isWxHasFingerPrint is false, finish UI!");
            finish();
        } else {
            C67205s0 Ex0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
            this.f198187g = iVar.mo108075RQ();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINGER_PRINT_LAST_IS_SEVERE_ERROR_BOOLEAN_SYNC;
            this.f198192o = i.mo119686g(aVar, false);
            if (!Ex0.mo91341w() || iVar.mo73371F7()) {
                Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "isReg?:" + Ex0.mo91341w() + ";isOpenTouch:" + iVar.mo73371F7());
                Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "finish FingerPrintAuthTransparentUI, not show the open guide!");
                finish();
                return;
            }
            Log.m105920e("MicroMsg.FingerPrintAuthTransparentUI", "show fingerprint auth open guide!");
            C23319f.m27817c().mo36811b();
            C115669n.INSTANCE.mo160131h(12924, 1);
            C77290d.f225400a = 0;
            if (getIntent().getBooleanExtra("key_show_guide", true)) {
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_COUNT_INT_SYNC;
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_FIRST_SHOWN_BOOLEAN_SYNC;
                if (i2.mo119686g(aVar3, true)) {
                    Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "hy: first show. no check box");
                    C85801v1 i3 = C86709a0.m107535s().mo121142i();
                    Boolean bool = Boolean.FALSE;
                    i3.mo119677K(aVar3, bool);
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, bool);
                    C76879j.m92709C(this, getString(this.f198192o ? C0966R.string.fge : C0966R.string.fgd), "", getString(C0966R.string.atq), getString(C0966R.string.f7926wf), false, new C78688j(this), new C78690k(this));
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, 1);
                    this.f198191n = 1;
                    C77290d.m93111i(1, 1);
                    return;
                }
                Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "hy: already shown before. show dialog with check box");
                View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.ark, (ViewGroup) null);
                this.f198191n = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(aVar2, (Object) null)).intValue() + 1;
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(this.f198191n));
                C77290d.m93111i(1, this.f198191n);
                C76879j.m92715I(this, false, (String) null, inflate, getString(C0966R.string.atq), getString(C0966R.string.f7926wf), new C78692l(this), new C78694m(this, (CheckBox) inflate.findViewById(C0966R.C0970id.e9k)));
            } else if (getIntent().getBooleanExtra("isFromKinda", false)) {
                C77290d.m93111i(3, this.f198191n);
                String stringExtra = getIntent().getStringExtra("kindaPayPwd");
                if (stringExtra != null) {
                    this.f198187g.mo107887b(this, new C78696n(this), stringExtra);
                    mo94924N7(true);
                }
                this.mController.mo177105z0(getResources().getColor(C0966R.color.al6));
            } else {
                mo94921K7();
            }
        }
    }

    public void onDestroy() {
        C77390c0 c0Var = this.f198185e;
        if (c0Var != null && c0Var.isShowing()) {
            this.f198185e.dismiss();
            this.f198185e = null;
        }
        Animation animation = this.f198189i;
        if (animation != null) {
            animation.cancel();
        }
        mo94924N7(false);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "alvinluo onPause");
        PowerManager.WakeLock newWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(536870913, "PostLocationService");
        if (newWakeLock != null) {
            PowerManager.WakeLock wakeLock = newWakeLock;
            C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            newWakeLock.acquire();
            C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        mo94926P7();
        if (newWakeLock != null) {
            PowerManager.WakeLock wakeLock2 = newWakeLock;
            C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            newWakeLock.release();
            C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthTransparentUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return this.f198187g.onSceneEnd(i, i2, str, yVar);
    }

    public void onStop() {
        super.onStop();
        finish();
    }
}
