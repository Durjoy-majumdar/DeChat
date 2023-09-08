package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import f40.C86709a0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p156gj.C107835h0;
import p910lj.C76701a;
import pv2.C77290d;
import rt1.C22249a;
import st1.C77781t;
import st1.C77788z;
import v53.C78342e0;
import vt1.C78473a;
import vt1.C78474b;
import yq3.C79143a;
import yt3.C23319f;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI */
public class WalletFaceIdAuthUI extends WalletBaseUI {

    /* renamed from: d */
    public Button f198168d;

    /* renamed from: e */
    public C68969e f198169e;

    /* renamed from: f */
    public int f198170f;

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$a */
    public class C68962a extends C7089c0 {
        public C68962a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletFaceIdAuthUI.this.f198169e.mo94914e();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$b */
    public class C68963b implements DialogInterface.OnClickListener {
        public C68963b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletFaceIdAuthUI.this.f198169e.mo94916g();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$c */
    public static class C68964c extends C68969e {

        /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$c$a */
        public class C68965a implements C78474b {
            public C68965a() {
            }

            /* renamed from: n */
            public void mo94918n(int i, String str) {
                Log.m105925i("MicroMsg.WalletFaceIdAuthUI", "prepared finish: %s, %s", Integer.valueOf(i), str);
                C68964c.this.f198179d.hideProgress();
                if (i == 0) {
                    C68964c.this.mo94920a();
                    return;
                }
                WalletFaceIdAuthUI walletFaceIdAuthUI = C68964c.this.f198179d;
                walletFaceIdAuthUI.mo94908H7(walletFaceIdAuthUI.getString(C0966R.string.amm));
            }
        }

        /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$c$b */
        public class C68966b implements DialogInterface.OnClickListener {
            public C68966b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C68964c cVar = C68964c.this;
                cVar.getClass();
                Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do finish");
                cVar.f198179d.finish();
            }
        }

        public C68964c(WalletFaceIdAuthUI walletFaceIdAuthUI) {
            super(walletFaceIdAuthUI);
            C77290d.f225400a = 0;
        }

        /* renamed from: b */
        public void mo94911b() {
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
            this.f198179d.showProgress();
            this.f198177b.mo107887b(this.f198179d, new C68965a(), this.f198180e);
        }

        /* renamed from: c */
        public int mo94912c() {
            return 1;
        }

        /* renamed from: d */
        public boolean mo94913d() {
            return true;
        }

        /* renamed from: e */
        public void mo94914e() {
        }

        /* renamed from: f */
        public void mo94915f() {
            this.f198179d.getWindow().setDimAmount(0.0f);
            super.mo94915f();
            this.f198179d.hideTitleView();
            this.f198179d.hideActionbarLine();
            this.f198179d.setContentViewVisibility(8);
        }

        /* renamed from: g */
        public void mo94916g() {
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do finish");
            this.f198179d.finish();
        }

        /* renamed from: h */
        public boolean mo94917h(int i, int i2, String str, C117747y yVar) {
            if (this.f198177b.onSceneEnd(i, i2, str, yVar)) {
                return true;
            }
            if (!(yVar instanceof C78342e0)) {
                return false;
            }
            this.f198179d.hideProgress();
            WalletFaceIdAuthUI walletFaceIdAuthUI = this.f198179d;
            C76879j.m92711E(walletFaceIdAuthUI, walletFaceIdAuthUI.getString(C0966R.string.clx), this.f198179d.getString(C0966R.string.clw), this.f198179d.getString(C0966R.string.l39), false, new C68966b());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$d */
    public static class C68967d extends C68969e {

        /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$d$a */
        public class C68968a implements C78474b {
            public C68968a() {
            }

            /* renamed from: n */
            public void mo94918n(int i, String str) {
                Log.m105925i("MicroMsg.WalletFaceIdAuthUI", "prepared finish: %s, %s", Integer.valueOf(i), str);
                C68967d.this.f198179d.hideProgress();
                if (i == 0) {
                    C68967d.this.f198179d.f198168d.setEnabled(true);
                    return;
                }
                WalletFaceIdAuthUI walletFaceIdAuthUI = C68967d.this.f198179d;
                walletFaceIdAuthUI.mo94908H7(walletFaceIdAuthUI.getString(C0966R.string.amm));
            }
        }

        public C68967d(WalletFaceIdAuthUI walletFaceIdAuthUI) {
            super(walletFaceIdAuthUI);
            C77290d.f225400a = 1;
        }

        /* renamed from: b */
        public void mo94911b() {
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
            this.f198179d.showProgress();
            this.f198177b.mo107887b(this.f198179d, new C68968a(), this.f198180e);
        }

        /* renamed from: c */
        public int mo94912c() {
            return 0;
        }

        /* renamed from: d */
        public boolean mo94913d() {
            return false;
        }

        /* renamed from: e */
        public void mo94914e() {
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do verify face id");
            mo94920a();
        }

        /* renamed from: g */
        public void mo94916g() {
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do end process");
            C79143a.m95764c(this.f198179d, new Bundle(), 0);
        }

        /* renamed from: h */
        public boolean mo94917h(int i, int i2, String str, C117747y yVar) {
            if (this.f198177b.onSceneEnd(i, i2, str, yVar)) {
                return true;
            }
            if (!(yVar instanceof C78342e0)) {
                return false;
            }
            this.f198179d.hideProgress();
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do end process");
            C79143a.m95764c(this.f198179d, new Bundle(), 0);
            C76701a.makeText((Context) this.f198179d, (int) C0966R.string.eue, 0).show();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$e */
    public static abstract class C68969e {

        /* renamed from: a */
        public C78473a f198176a;

        /* renamed from: b */
        public C77788z f198177b;

        /* renamed from: c */
        public Bundle f198178c;

        /* renamed from: d */
        public WalletFaceIdAuthUI f198179d;

        /* renamed from: e */
        public String f198180e;

        /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI$e$a */
        public class C68970a implements C22249a {
            public C68970a() {
            }

            public void onAuthCancel() {
                C68969e.this.f198179d.finish();
            }

            public void onAuthFail(int i) {
                WalletFaceIdAuthUI walletFaceIdAuthUI = C68969e.this.f198179d;
                walletFaceIdAuthUI.mo94908H7(walletFaceIdAuthUI.getString(C0966R.string.clv));
            }

            public void onAuthSuccess(int i, int i2) {
                C68969e eVar = C68969e.this;
                eVar.f198179d.showProgress();
                int i3 = 1;
                if (eVar.mo94912c() == 1) {
                    i3 = 2;
                }
                eVar.f198177b.mo107888c(new C68971b(eVar), String.valueOf(i), i3);
            }
        }

        public C68969e(WalletFaceIdAuthUI walletFaceIdAuthUI) {
            this.f198179d = walletFaceIdAuthUI;
            this.f198178c = walletFaceIdAuthUI.f198170f == 0 ? walletFaceIdAuthUI.getProcess().f232423c : walletFaceIdAuthUI.getIntent().getExtras();
            this.f198177b = new C77788z();
            this.f198176a = (C78473a) C86709a0.m107533q(C78473a.class);
        }

        /* renamed from: a */
        public void mo94920a() {
            Log.m105924i("MicroMsg.WalletFaceIdAuthUI", "do face id auth");
            Bundle bundle = new Bundle();
            bundle.putInt("face_auth_scene", 0);
            ((C77781t) C86312j.m106911c(C77781t.class)).d60(this.f198179d, new C68970a(), bundle);
        }

        /* renamed from: b */
        public abstract void mo94911b();

        /* renamed from: c */
        public abstract int mo94912c();

        /* renamed from: d */
        public abstract boolean mo94913d();

        /* renamed from: e */
        public abstract void mo94914e();

        /* renamed from: f */
        public void mo94915f() {
            Bundle bundle;
            C78473a aVar = this.f198176a;
            if (aVar == null) {
                Log.m105928w("MicroMsg.WalletFaceIdAuthUI", "no mgr");
                WalletFaceIdAuthUI walletFaceIdAuthUI = this.f198179d;
                walletFaceIdAuthUI.mo94908H7(walletFaceIdAuthUI.getString(C0966R.string.clv));
                return;
            }
            boolean Fk0 = aVar.Fk0();
            boolean l3 = this.f198176a.mo107913l3();
            boolean z = false;
            boolean z2 = C107835h0.f322849f.f322932a != 1;
            if (!Fk0 || !l3 || z2 || (bundle = this.f198178c) == null) {
                Object[] objArr = new Object[4];
                objArr[0] = Boolean.valueOf(Fk0);
                objArr[1] = Boolean.valueOf(l3);
                objArr[2] = Boolean.valueOf(z2);
                if (this.f198178c == null) {
                    z = true;
                }
                objArr[3] = Boolean.valueOf(z);
                Log.m105929w("MicroMsg.WalletFaceIdAuthUI", "support: %s, enrolled: %s, forceClose: %s, data: %s", objArr);
                WalletFaceIdAuthUI walletFaceIdAuthUI2 = this.f198179d;
                walletFaceIdAuthUI2.mo94908H7(walletFaceIdAuthUI2.getString(C0966R.string.clv));
                return;
            }
            String string = bundle.getString("pwd");
            this.f198180e = string;
            if (Util.isNullOrNil(string)) {
                Log.m105928w("MicroMsg.WalletFaceIdAuthUI", "no pwd");
                WalletFaceIdAuthUI walletFaceIdAuthUI3 = this.f198179d;
                walletFaceIdAuthUI3.mo94908H7(walletFaceIdAuthUI3.getString(C0966R.string.clv));
                return;
            }
            C23319f.m27817c().mo36811b();
            mo94911b();
        }

        /* renamed from: g */
        public abstract void mo94916g();

        /* renamed from: h */
        public abstract boolean mo94917h(int i, int i2, String str, C117747y yVar);
    }

    /* renamed from: H7 */
    public void mo94908H7(String str) {
        C76879j.m92711E(this, str, "", getString(C0966R.string.f8029zr), false, new C68963b());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a68;
    }

    public void initView() {
        Button button = (Button) findViewById(C0966R.C0970id.e_3);
        this.f198168d = button;
        button.setOnClickListener(new C68962a());
    }

    public boolean isTransparent() {
        return this.f198169e.mo94913d();
    }

    public void onCreate(Bundle bundle) {
        int intExtra = getIntent().getIntExtra("key_scene", 1);
        this.f198170f = intExtra;
        Log.m105925i("MicroMsg.WalletFaceIdAuthUI", "scene: %s", Integer.valueOf(intExtra));
        int i = this.f198170f;
        if (i == 0) {
            this.f198169e = new C68967d(this);
        } else if (i == 1) {
            this.f198169e = new C68964c(this);
        }
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cly);
        this.f198169e.mo94915f();
        initView();
    }

    public boolean onProgressFinish() {
        return true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return this.f198169e.mo94917h(i, i2, str, yVar);
    }
}
