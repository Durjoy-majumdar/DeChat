package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.h */
public class C5716h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintFinishUI f21731d;

    public C5716h(VoicePrintFinishUI voicePrintFinishUI) {
        this.f21731d = voicePrintFinishUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f21731d.f21708h == 72) {
            Intent intent = new Intent();
            intent.setClass(this.f21731d, VoiceUnLockUI.class);
            intent.putExtra("kscene_type", 73);
            VoicePrintFinishUI voicePrintFinishUI = this.f21731d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            VoicePrintFinishUI voicePrintFinishUI2 = voicePrintFinishUI;
            C117292a.m165358d(voicePrintFinishUI2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintFinishUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            voicePrintFinishUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(voicePrintFinishUI2, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintFinishUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        this.f21731d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
