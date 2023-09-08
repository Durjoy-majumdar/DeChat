package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceResetUI */
public class VoiceResetUI extends VoiceUnLockUI {
    /* renamed from: O7 */
    public void mo6740O7() {
        Log.m105918d("MicroMsg.VoiceResetUI", "unlock success");
        Intent intent = new Intent(this, VoiceCreateUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceResetUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceResetUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
