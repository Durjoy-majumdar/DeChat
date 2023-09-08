package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k33.C117386r;
import k33.C46644e;
import k33.C60970k;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI */
public class VoiceUnLockUI extends BaseVoicePrintUI implements C117386r.C117387a {

    /* renamed from: w */
    public C117386r f347562w;

    /* renamed from: J7 */
    public void mo176324J7() {
        View findViewById = findViewById(C0966R.C0970id.itd);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo176322H7();
        this.f347490h.setTitleText((int) C0966R.string.kd4);
        this.f347490h.f347555f.setVisibility(8);
        this.f347487e.setEnabled(false);
    }

    /* renamed from: K7 */
    public void mo176325K7() {
        Log.m105919d("MicroMsg.VoiceUnLockUI", "sendVoice, filename:%s", this.f347493n);
        if (!Util.isNullOrNil(this.f347493n) && !Util.isNullOrNil(this.f347562w.f351430f)) {
            C60970k kVar = new C60970k(this.f347493n, this.f347562w.f351429e, 0);
            kVar.f173660h = true;
            C97625j3.m125815e().mo123460f(kVar);
            this.f347487e.setEnabled(false);
            mo176326L7();
        }
    }

    /* renamed from: N7 */
    public void mo176360N7(boolean z) {
        mo176322H7();
        this.f347487e.setEnabled(true);
        if (z) {
            Log.m105918d("MicroMsg.VoiceUnLockUI", "unlock success");
            mo6740O7();
            return;
        }
        this.f347490h.setErr((int) C0966R.string.f361501kd3);
        this.f347490h.mo176351c();
    }

    /* renamed from: O7 */
    public void mo6740O7() {
        Intent intent = new Intent();
        intent.putExtra("kscene_type", 73);
        intent.setClass(this, VoicePrintCreateFinishUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f347562w = new C117386r(this);
        Log.m105918d("MicroMsg.VoicePrintUnLockService", "getVoiceText");
        C97625j3.m125815e().mo123460f(new C46644e(73, ""));
    }

    public void onDestroy() {
        super.onDestroy();
        C117386r rVar = this.f347562w;
        rVar.getClass();
        C97625j3.m125815e().mo123470p(611, rVar);
        C97625j3.m125815e().mo123470p(613, rVar);
        rVar.f351428d = null;
    }
}
