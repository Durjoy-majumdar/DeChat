package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.a2 */
public class C71134a2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsChattingUI f205923d;

    public C71134a2(SettingsChattingUI settingsChattingUI) {
        this.f205923d = settingsChattingUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.SettingsChattingUI", "Clean all messages another double confirm.");
        SettingsChattingUI settingsChattingUI = this.f205923d;
        int i2 = SettingsChattingUI.f205710h;
        C76879j.m92708B(settingsChattingUI.getContext(), settingsChattingUI.getResources().getString(C0966R.string.f361325m61), "", settingsChattingUI.getString(C0966R.string.f7930wk), settingsChattingUI.getString(C0966R.string.f7926wf), new C19176b2(settingsChattingUI), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
    }
}
