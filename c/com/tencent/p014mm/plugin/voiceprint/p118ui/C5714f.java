package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.f */
public final class C5714f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintCreateFinishUI f21729d;

    public C5714f(VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
        this.f21729d = voicePrintCreateFinishUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.VoicePrintCreateFinishUI", "iknown button clicked");
        VoicePrintCreateFinishUI voicePrintCreateFinishUI = this.f21729d;
        int i = VoicePrintCreateFinishUI.f21698f;
        if (((Number) ((C36570n) voicePrintCreateFinishUI.f21700e).getValue()).intValue() == 75) {
            VoicePrintCreateFinishUI voicePrintCreateFinishUI2 = this.f21729d;
            voicePrintCreateFinishUI2.getClass();
            Log.m105924i("MicroMsg.VoicePrintCreateFinishUI", "create");
            Intent intent = new Intent(voicePrintCreateFinishUI2, VoiceCreateUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            VoicePrintCreateFinishUI voicePrintCreateFinishUI3 = voicePrintCreateFinishUI2;
            C117292a.m165358d(voicePrintCreateFinishUI3, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "create", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            voicePrintCreateFinishUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(voicePrintCreateFinishUI3, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "create", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            voicePrintCreateFinishUI2.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        }
        this.f21729d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
