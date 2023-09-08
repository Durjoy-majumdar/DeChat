package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k33.C117377n;
import k33.C46645f;
import k33.C46648h;
import k33.C60967i;
import nj3.C76879j;
import p206nj.C11171e;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI */
public class VoiceLoginUI extends BaseVoicePrintUI implements C117377n.C117378a {

    /* renamed from: y */
    public static final /* synthetic */ int f347530y = 0;

    /* renamed from: w */
    public String f347531w = null;

    /* renamed from: x */
    public C117377n f347532x = null;

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI$b */
    public class C106306b implements DialogInterface.OnClickListener {
        public C106306b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(VoiceLoginUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI$c */
    public class C106307c implements DialogInterface.OnClickListener {
        public C106307c(VoiceLoginUI voiceLoginUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI$a */
    public class C115832a implements MenuItem.OnMenuItemClickListener {
        public C115832a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            VoiceLoginUI voiceLoginUI = VoiceLoginUI.this;
            int i = VoiceLoginUI.f347530y;
            voiceLoginUI.setResult(0);
            voiceLoginUI.finish();
            return true;
        }
    }

    /* renamed from: J7 */
    public void mo176324J7() {
        View findViewById = findViewById(C0966R.C0970id.itd);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo176326L7();
        this.f347490h.setTitleText((int) C0966R.string.kd4);
        this.f347490h.f347555f.setVisibility(8);
        this.f347487e.setEnabled(false);
    }

    /* renamed from: K7 */
    public void mo176325K7() {
        Log.m105919d("MicroMsg.VoiceLoginUI", "sendVoice, filename:%s", this.f347493n);
        if (!Util.isNullOrNil(this.f347493n) && !Util.isNullOrNil(this.f347494o)) {
            C117377n nVar = this.f347532x;
            C60967i iVar = new C60967i(this.f347493n, nVar.f351406f, 0, nVar.f351404d);
            iVar.f173648h = true;
            C97625j3.m125815e().mo123460f(iVar);
            this.f347487e.setEnabled(false);
            mo176326L7();
        }
    }

    /* renamed from: N7 */
    public void mo176342N7(boolean z) {
        mo176322H7();
        this.f347487e.setEnabled(true);
        if (z) {
            Log.m105925i("MicroMsg.VoiceLoginUI", "login success[%s]", Util.secPrint(this.f347532x.f351408h));
            Intent intent = new Intent();
            intent.putExtra("VoiceLoginAuthPwd", this.f347532x.f351408h);
            setResult(-1, intent);
            finish();
            return;
        }
        Log.m105924i("MicroMsg.VoiceLoginUI", "login failed");
        this.f347490h.setErr((int) C0966R.string.f361501kd3);
        this.f347490h.mo176351c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115669n.INSTANCE.mo160131h(11557, 1);
        this.f347531w = Util.nullAs(getIntent().getStringExtra("Kusername"), (String) null);
        String nullAs = Util.nullAs(getIntent().getStringExtra("Kvertify_key"), (String) null);
        Log.m105919d("MicroMsg.VoiceLoginUI", "summerauth onCreate, username:%s loginTicket==null:%b", this.f347531w, Boolean.valueOf(Util.isNullOrNil(nullAs)));
        if (!Util.isNullOrNil(this.f347531w) || !Util.isNullOrNil(nullAs)) {
            C117377n nVar = new C117377n();
            this.f347532x = nVar;
            nVar.f351409i = this.f347531w;
            nVar.f351404d = nullAs;
            nVar.f351405e = this;
            if (Util.isNullOrNil(nullAs)) {
                C97625j3.m125815e().mo123460f(new C46645f(1, nVar.f351409i));
            } else {
                C97625j3.m125815e().mo123460f(new C46648h(73, nVar.f351404d));
            }
            Log.m105925i("MicroMsg.VoiceLoginUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.RECORD_AUDIO", 80, "", getString(C0966R.string.j1x))), Util.getStack(), this);
            setBackBtn(new C115832a());
            if (C11171e.m11046c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.f356961a70));
                updataStatusBarIcon(C85875k4.m106211z());
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.VoiceLoginUI", "onCreate error, username and ticket are both null");
    }

    public void onDestroy() {
        super.onDestroy();
        C117377n nVar = this.f347532x;
        if (nVar != null) {
            nVar.getClass();
            C97625j3.m125815e().mo123470p(C1884v4.CTRL_INDEX, nVar);
            C97625j3.m125815e().mo123470p(616, nVar);
            C97625j3.m125815e().mo123470p(617, nVar);
            nVar.f351405e = null;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        setResult(0);
        finish();
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 80) {
            if (iArr[0] == 0) {
                mo176327M7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C106306b(), new C106307c(this));
        }
    }
}
