package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.g */
public final class C5715g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintCreateFinishUI f21730d;

    public C5715g(VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
        this.f21730d = voicePrintCreateFinishUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VoicePrintCreateFinishUI voicePrintCreateFinishUI = this.f21730d;
        int i = VoicePrintCreateFinishUI.f21698f;
        voicePrintCreateFinishUI.getClass();
        Log.m105924i("MicroMsg.VoicePrintCreateFinishUI", "checkLock() called");
        Intent intent = new Intent(voicePrintCreateFinishUI, VoiceUnLockUI.class);
        intent.putExtra("kscene_type", 73);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        VoicePrintCreateFinishUI voicePrintCreateFinishUI2 = voicePrintCreateFinishUI;
        C117292a.m165358d(voicePrintCreateFinishUI2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "checkLock", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        voicePrintCreateFinishUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(voicePrintCreateFinishUI2, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "checkLock", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        voicePrintCreateFinishUI.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
