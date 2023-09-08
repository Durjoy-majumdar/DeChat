package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.y1 */
public class C71167y1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SettingsCareModeIntro f205969d;

    public C71167y1(SettingsCareModeIntro settingsCareModeIntro) {
        this.f205969d = settingsCareModeIntro;
    }

    public void run() {
        Intent intent = new Intent();
        intent.putExtra("Intro_Need_Clear_Top ", true);
        ((C67654r1) C14049d.m13403b()).mo93170c(intent, this.f205969d.getContext());
    }
}
