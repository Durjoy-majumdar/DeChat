package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.o */
public final class C5723o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintStateSettingUI f21738d;

    public C5723o(VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f21738d = voicePrintStateSettingUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView: check layout click");
        Intent intent = new Intent(this.f21738d, VoiceUnLockUI.class);
        intent.putExtra("kscene_type", 73);
        intent.putExtra("trans_out_anim", C0966R.C0968anim.f2469dt);
        VoicePrintStateSettingUI voicePrintStateSettingUI = this.f21738d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        VoicePrintStateSettingUI voicePrintStateSettingUI2 = voicePrintStateSettingUI;
        C117292a.m165358d(voicePrintStateSettingUI2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        voicePrintStateSettingUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(voicePrintStateSettingUI2, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f21738d.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
