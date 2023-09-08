package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.FontSizeChangedEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import kg3.C76577a;
import lg3.C76695c;
import lg3.C88494d;
import qo3.C47883u;
import s00.C90110f;
import tm2.C14049d;
import tm2.C78045b;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.i2 */
public class C71146i2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ float f205941a;

    /* renamed from: b */
    public final /* synthetic */ SettingsFontUI f205942b;

    public C71146i2(SettingsFontUI settingsFontUI, float f) {
        this.f205942b = settingsFontUI;
        this.f205941a = f;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        if (z) {
            C76695c.m92345f(0);
            if (!C76577a.m92160k(this.f205942b.getContext())) {
                SettingsFontUI settingsFontUI = this.f205942b;
                settingsFontUI.f205721i = settingsFontUI.f205720h;
            }
            SettingsFontUI settingsFontUI2 = this.f205942b;
            if (settingsFontUI2.f205720h != this.f205941a) {
                settingsFontUI2.f205716d = 1;
            } else {
                settingsFontUI2.f205716d = 0;
            }
            AppCompatActivity context = settingsFontUI2.getContext();
            SettingsFontUI settingsFontUI3 = this.f205942b;
            C78045b.m94197c(context, settingsFontUI3.f205720h, settingsFontUI3.f205722j);
            SettingsFontUI settingsFontUI4 = this.f205942b;
            settingsFontUI4.f205717e = C76577a.m92163n(settingsFontUI4.getContext());
            C115669n.INSTANCE.mo160131h(11609, Integer.valueOf(this.f205942b.f205716d), Integer.valueOf(this.f205942b.f205717e), 0);
            Log.m105925i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%d , changeFontSize: %d, curFontSize:%d", 11609, Integer.valueOf(this.f205942b.f205716d), Integer.valueOf(this.f205942b.f205717e));
            AppCompatActivity context2 = this.f205942b.getContext();
            float f = this.f205941a;
            float f2 = 1.0f;
            if (context2 != null) {
                f2 = context2.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getFloat("current_text_size_scale_key", 1.0f);
            }
            Log.m105924i("MicroMsg.FontSizeService", "fontSizeAfter=" + f2);
            int a = C78045b.m94195a(context2);
            int g = C88494d.m110350g();
            int b = C78045b.m94196b(a);
            if (b != g) {
                C88494d.m110355n(b);
                Intent intent = new Intent();
                intent.putExtra("Intro_Need_Clear_Top ", true);
                ((C67654r1) C14049d.m13403b()).mo93170c(intent, context2);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("Intro_Need_Clear_Top ", true);
            ((C67654r1) C14049d.m13403b()).mo93183p(intent2, context2);
            FontSizeChangedEvent fontSizeChangedEvent = new FontSizeChangedEvent();
            FontSizeChangedEvent.C67701a aVar = fontSizeChangedEvent.f193623d;
            aVar.f193624a = f;
            aVar.f193625b = f2;
            fontSizeChangedEvent.publish();
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124149ID("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        }
    }
}
