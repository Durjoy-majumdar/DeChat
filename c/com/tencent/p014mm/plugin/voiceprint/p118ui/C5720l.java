package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.l */
public final class C5720l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintStateSettingUI f21735d;

    public C5720l(VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f21735d = voicePrintStateSettingUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        VoicePrintStateSettingUI voicePrintStateSettingUI = this.f21735d;
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(voicePrintStateSettingUI, "android.permission.RECORD_AUDIO", 80, "", voicePrintStateSettingUI.getString(C0966R.string.j1x));
        Log.m105925i("MicroMsg.VoicePrintStateSettingUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f21735d);
        if (z1) {
            this.f21735d.mo6733J7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
