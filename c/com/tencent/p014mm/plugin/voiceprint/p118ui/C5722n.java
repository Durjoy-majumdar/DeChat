package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.n */
public final class C5722n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintStateSettingUI f21737d;

    public C5722n(VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f21737d = voicePrintStateSettingUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView: reset layout click");
        VoicePrintStateSettingUI voicePrintStateSettingUI = this.f21737d;
        int i = VoicePrintStateSettingUI.f21709f;
        voicePrintStateSettingUI.getClass();
        C77407n nVar = new C77407n((Context) voicePrintStateSettingUI, false, 1);
        nVar.f225771i = new C5718j(voicePrintStateSettingUI);
        nVar.f225782p = new C5719k(voicePrintStateSettingUI);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
