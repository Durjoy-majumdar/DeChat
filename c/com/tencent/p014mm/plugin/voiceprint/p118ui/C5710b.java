package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.b */
public class C5710b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsVoicePrintUI f21726d;

    public C5710b(SettingsVoicePrintUI settingsVoicePrintUI) {
        this.f21726d = settingsVoicePrintUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SettingsVoicePrintUI settingsVoicePrintUI = this.f21726d;
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(settingsVoicePrintUI, "android.permission.RECORD_AUDIO", 80, "", settingsVoicePrintUI.getString(C0966R.string.j1x));
        Log.m105925i("MicroMsg.VoiceSettingsUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f21726d);
        if (!z1) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        SettingsVoicePrintUI settingsVoicePrintUI2 = this.f21726d;
        int i = SettingsVoicePrintUI.f21682i;
        settingsVoicePrintUI2.mo6721H7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
