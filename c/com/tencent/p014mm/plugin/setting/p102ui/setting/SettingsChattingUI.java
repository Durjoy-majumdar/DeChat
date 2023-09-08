package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wcdb.support.CancellationSignal;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import pj3.C47511g;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI */
public class SettingsChattingUI extends MMPreference {

    /* renamed from: h */
    public static final /* synthetic */ int f205710h = 0;

    /* renamed from: d */
    public C47511g f205711d;

    /* renamed from: e */
    public ProgressDialog f205712e = null;

    /* renamed from: f */
    public boolean f205713f = false;

    /* renamed from: g */
    public CancellationSignal f205714g = new CancellationSignal();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI$a */
    public class C71068a implements MenuItem.OnMenuItemClickListener {
        public C71068a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsChattingUI.this.hideVKB();
            SettingsChattingUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8955cb;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.ir5);
        this.f205711d = getPreferenceScreen();
        if (C86709a0.m107535s().mo121142i().mo119688i(89, 0) != 2) {
            this.f205711d.mo72531o("settings_recovery");
        }
        setBackBtn(new C71068a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C86709a0.m107523b().mo121114l()) {
            finish();
        } else {
            initView();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1776646462:
                if (str.equals("settings_chatting_bg")) {
                    c = 0;
                    break;
                }
                break;
            case -1565531065:
                if (str.equals("settings_bak_chat")) {
                    c = 1;
                    break;
                }
                break;
            case -1550690765:
                if (str.equals("settings_reset")) {
                    c = 2;
                    break;
                }
                break;
            case -1439483675:
                if (str.equals("settings_voice_play_mode")) {
                    c = 3;
                    break;
                }
                break;
            case -409015247:
                if (str.equals("settings_recovery")) {
                    c = 4;
                    break;
                }
                break;
            case 624882802:
                if (str.equals("settings_enter_button_send")) {
                    c = 5;
                    break;
                }
                break;
            case 1789437336:
                if (str.equals("settings_emoji_manager")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent();
                intent.setClass(this, SettingsChattingBackgroundUI.class);
                AppCompatActivity context = getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 1:
                Intent className = new Intent().setClassName(getContext(), "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(className);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToBackup", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToBackup", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 2:
                Log.m105924i("MicroMsg.SettingsChattingUI", "Clean all messages do confirm.");
                C76879j.m92708B(getContext(), getResources().getString(C0966R.string.ixv), "", getString(C0966R.string.f7930wk), getString(C0966R.string.f7926wf), new C71134a2(this), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
                return true;
            case 3:
                boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE)).booleanValue();
                boolean z = !booleanValue;
                Log.m105919d("MicroMsg.SettingsChattingUI", "set voice mode from %B to %B", Boolean.valueOf(booleanValue), Boolean.valueOf(z));
                C86709a0.m107535s().mo121142i().mo119676J(26, Boolean.valueOf(z));
                return true;
            case 4:
                Intent className2 = new Intent().setClassName(getContext(), "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
                className2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                AppCompatActivity context2 = getContext();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(className2);
                AppCompatActivity appCompatActivity2 = context2;
                C117292a.m165358d(appCompatActivity2, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToRecovery", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(appCompatActivity2, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToRecovery", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case 5:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205711d.mo72519a("settings_enter_button_send");
                if (checkBoxPreference != null) {
                    boolean J = checkBoxPreference.mo6804J();
                    if (J) {
                        C77426q qVar = new C77426q(getContext());
                        qVar.mo107595g(getResources().getString(C0966R.string.irr));
                        qVar.mo107590b(new C71142d2(this, J, checkBoxPreference));
                        qVar.mo107603o();
                    } else {
                        Log.m105919d("MicroMsg.SettingsChattingUI", "set enter button send : %s", Boolean.valueOf(J));
                        C86709a0.m107535s().mo121142i().mo119676J(66832, Boolean.valueOf(J));
                    }
                }
                return true;
            case 6:
                Intent intent2 = new Intent();
                intent2.putExtra(String.valueOf(10931), 2);
                C88144b.m109791i(getContext(), "emoji", ".ui.EmojiMineUI", intent2, (Bundle) null);
                return true;
            default:
                return false;
        }
    }

    public void onResume() {
        super.onResume();
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205711d.mo72519a("settings_voice_play_mode");
        if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(((Boolean) C86709a0.m107535s().mo121142i().mo119684e(26, Boolean.FALSE)).booleanValue());
            checkBoxPreference.f121290w = false;
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f205711d.mo72519a("settings_enter_button_send");
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.mo6805K(((Boolean) C86709a0.m107535s().mo121142i().mo119684e(66832, Boolean.FALSE)).booleanValue());
            checkBoxPreference2.f121290w = false;
        }
    }
}
