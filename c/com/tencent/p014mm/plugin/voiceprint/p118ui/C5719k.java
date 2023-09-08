package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.k */
public final class C5719k implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintStateSettingUI f21734d;

    public C5719k(VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f21734d = voicePrintStateSettingUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "resetLogic: reset click");
            Intent intent = new Intent(this.f21734d, VoiceCreateUI.class);
            intent.putExtra("KvoicePrintReset", true);
            intent.putExtra("kscene_type", 73);
            intent.putExtra("trans_out_anim", C0966R.C0968anim.f2469dt);
            this.f21734d.startActivityForResult(intent, 2);
            this.f21734d.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        } else if (itemId == 2) {
            Log.m105924i("MicroMsg.VoicePrintStateSettingUI", "resetLogic: delete click");
            VoicePrintStateSettingUI voicePrintStateSettingUI = this.f21734d;
            int i2 = VoicePrintStateSettingUI.f21709f;
            voicePrintStateSettingUI.mo6732I7(3);
        }
    }
}
