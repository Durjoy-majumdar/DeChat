package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TimePicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C75583h3;
import java.sql.Time;
import java.text.DateFormat;
import p645pj.C77091b;
import pj3.C47511g;
import zc2.C119093f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI */
public class SettingsActiveTimeUI extends MMPreference {

    /* renamed from: d */
    public C47511g f205679d;

    /* renamed from: e */
    public int f205680e;

    /* renamed from: f */
    public int f205681f;

    /* renamed from: g */
    public int f205682g;

    /* renamed from: h */
    public int f205683h;

    /* renamed from: i */
    public boolean f205684i = false;

    /* renamed from: j */
    public Preference f205685j;

    /* renamed from: n */
    public Preference f205686n;

    /* renamed from: o */
    public boolean f205687o = false;

    /* renamed from: p */
    public final TimePickerDialog.OnTimeSetListener f205688p = new C71061b();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI$a */
    public class C71060a implements MenuItem.OnMenuItemClickListener {
        public C71060a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsActiveTimeUI.this.hideVKB();
            SettingsActiveTimeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI$b */
    public class C71061b implements TimePickerDialog.OnTimeSetListener {
        public C71061b() {
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            SettingsActiveTimeUI settingsActiveTimeUI = SettingsActiveTimeUI.this;
            if (settingsActiveTimeUI.f205684i) {
                settingsActiveTimeUI.f205680e = i;
                settingsActiveTimeUI.f205681f = i2;
                SharedPreferences s = C77091b.m93037s();
                s.edit().putInt("settings_active_end_time_hour", i).commit();
                s.edit().putInt("settings_active_end_time_min", i2).commit();
                Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveActiveEnd: %d:%d", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                settingsActiveTimeUI.f205682g = i;
                settingsActiveTimeUI.f205683h = i2;
                SharedPreferences s2 = C77091b.m93037s();
                s2.edit().putInt("settings_active_begin_time_hour", i).commit();
                s2.edit().putInt("settings_active_begin_time_min", i2).commit();
                Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveActiveBegine: %d:%d", Integer.valueOf(i), Integer.valueOf(i2));
            }
            SettingsActiveTimeUI.this.initView();
        }
    }

    /* renamed from: H7 */
    public static String m83538H7(Context context, int i, int i2) {
        String loadApplicationLanguageSettings = LocaleUtil.loadApplicationLanguageSettings(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        if (!loadApplicationLanguageSettings.equalsIgnoreCase("zh_CN") && (!loadApplicationLanguageSettings.equalsIgnoreCase("language_default") || !"zh_CN".equalsIgnoreCase(applicationLanguage))) {
            return DateFormat.getTimeInstance(3, LocaleUtil.transLanguageToLocale(loadApplicationLanguageSettings)).format(new Time(i, i2, 0));
        }
        int i3 = i > 12 ? i - 12 : i;
        return C72715f.m85110c(context, (((long) i) * 3600000) + (((long) i2) * 60000)) + String.format("%02d:%02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
    }

    public int getResourceId() {
        return C0966R.xml.f8953c_;
    }

    public void initView() {
        C47511g preferenceScreen = getPreferenceScreen();
        this.f205679d = preferenceScreen;
        preferenceScreen.removeAll();
        this.f205679d.mo72520b(C0966R.xml.f8953c_);
        this.f205687o = !C77091b.m93033o();
        ((CheckBoxPreference) this.f205679d.mo72519a("settings_active_silence_time")).mo6805K(this.f205687o);
        this.f205686n = this.f205679d.mo72519a("settings_active_begin_time");
        this.f205680e = C77091b.m93037s().getInt("settings_active_end_time_hour", 23);
        int i = C77091b.m93037s().getInt("settings_active_end_time_min", 0);
        this.f205681f = i;
        this.f205686n.mo7741E(m83538H7(this, this.f205680e, i));
        this.f205685j = this.f205679d.mo72519a("settings_active_end_time");
        this.f205682g = C77091b.m93037s().getInt("settings_active_begin_time_hour", 8);
        int i2 = C77091b.m93037s().getInt("settings_active_begin_time_min", 0);
        this.f205683h = i2;
        this.f205685j.mo7741E(m83538H7(this, this.f205682g, i2));
        if (this.f205687o) {
            this.f205686n.mo69932y(true);
            this.f205685j.mo69932y(true);
        } else {
            this.f205686n.mo69932y(false);
            this.f205685j.mo69932y(false);
        }
        if (!this.f205687o) {
            this.f205679d.mo72526j(this.f205686n);
            this.f205679d.mo72526j(this.f205685j);
        }
        this.f205679d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ipv);
        initView();
        setBackBtn(new C71060a());
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return null;
        }
        return this.f205684i ? new TimePickerDialog(getContext(), this.f205688p, this.f205680e, this.f205681f, false) : new TimePickerDialog(getContext(), this.f205688p, this.f205682g, this.f205683h, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C75583h3.m90714a(2);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.equals("settings_active_begin_time")) {
            this.f205684i = true;
            showDialog(1);
            return true;
        } else if (preference.f121285r.equals("settings_active_end_time")) {
            this.f205684i = false;
            showDialog(1);
            return true;
        } else if (!preference.f121285r.equals("settings_active_silence_time")) {
            return false;
        } else {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205679d.mo72519a("settings_active_silence_time");
            boolean z = !checkBoxPreference.mo6804J();
            C77091b.m93037s().edit().putBoolean("settings_active_time_full", z).commit();
            Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsActiveTime: %B", Boolean.valueOf(z));
            C119093f.vx0();
            C115669n nVar = C115669n.INSTANCE;
            int i = 2;
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            if (checkBoxPreference.mo6804J()) {
                i = 1;
            }
            objArr[1] = Integer.valueOf(i);
            nVar.mo160131h(11351, objArr);
            initView();
            return true;
        }
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        if (i == 1) {
            if (this.f205684i) {
                ((TimePickerDialog) dialog).updateTime(this.f205680e, this.f205681f);
            } else {
                ((TimePickerDialog) dialog).updateTime(this.f205682g, this.f205683h);
            }
        }
    }
}
