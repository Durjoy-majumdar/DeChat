package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.media.SoundPool;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.v0 */
public final class C71161v0 implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ SettingMessageRingtoneUI f205959a;

    /* renamed from: b */
    public final /* synthetic */ String f205960b;

    public C71161v0(SettingMessageRingtoneUI settingMessageRingtoneUI, String str) {
        this.f205959a = settingMessageRingtoneUI;
        this.f205960b = str;
    }

    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            this.f205959a.f205640i = Integer.valueOf(i);
            SoundPool soundPool2 = this.f205959a.f205636e;
            if (soundPool2 != null) {
                soundPool2.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.SettingMessageRingtoneUI", "SoundPool load error pathId " + this.f205960b + " status " + i2);
    }
}
