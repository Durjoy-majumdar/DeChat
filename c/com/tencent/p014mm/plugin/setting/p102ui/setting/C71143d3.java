package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p645pj.C77091b;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.d3 */
public class C71143d3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsRingtoneUI f205937d;

    public C71143d3(SettingsRingtoneUI settingsRingtoneUI) {
        this.f205937d = settingsRingtoneUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        SharedPreferences.Editor edit = this.f205937d.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit();
        SettingsRingtoneUI settingsRingtoneUI = this.f205937d;
        int i = settingsRingtoneUI.f205791i;
        if (i != 0) {
            Uri ringtoneUri = settingsRingtoneUI.f205786d.getRingtoneUri(i - 1);
            Log.m105918d("RingtonePickerActivity", "set ringtone to " + ringtoneUri);
            if (ringtoneUri != null) {
                str = ringtoneUri.toString();
                SettingsRingtoneUI settingsRingtoneUI2 = this.f205937d;
                settingsRingtoneUI2.getClass();
                String title = RingtoneManager.getRingtone(settingsRingtoneUI2, ringtoneUri).getTitle(settingsRingtoneUI2);
                edit.putString("settings.ringtone.name", title);
                Log.m105918d("RingtonePickerActivity", "ringtone name: " + title);
                edit.commit();
                C77091b.m93037s().edit().putString("settings.ringtone", str).commit();
                Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", str);
                this.f205937d.finish();
                return true;
            }
            edit.putString("settings.ringtone.name", this.f205937d.getString(C0966R.string.ivy));
            Log.m105918d("RingtonePickerActivity", "set ringtone follow system");
        } else {
            edit.putString("settings.ringtone.name", settingsRingtoneUI.getString(C0966R.string.ivy));
            Log.m105918d("RingtonePickerActivity", "set ringtone follow system");
        }
        str = null;
        edit.commit();
        C77091b.m93037s().edit().putString("settings.ringtone", str).commit();
        Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", str);
        this.f205937d.finish();
        return true;
    }
}
