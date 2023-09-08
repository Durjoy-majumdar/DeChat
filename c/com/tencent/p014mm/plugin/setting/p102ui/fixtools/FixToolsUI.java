package com.tencent.p014mm.plugin.setting.p102ui.fixtools;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bn2.f$$a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAboutMMHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import lg3.C88504k;
import m13.C88689b;
import nj3.C88989a;
import p757xv.C91353u;
import p761yd.C91441c;
import p910lj.C76701a;
import pj3.C47511g;
import qe3.C89625d;
import xm2.C78862e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI */
public class FixToolsUI extends MMPreference {

    /* renamed from: e */
    public static final /* synthetic */ int f205592e = 0;

    /* renamed from: d */
    public C47511g f205593d;

    public int getResourceId() {
        return C0966R.xml.f8905az;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205593d = getPreferenceScreen();
        setMMTitle((int) C0966R.string.eur);
        SettingsAboutMMHeaderPreference settingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference) this.f205593d.mo72519a("fix_tools_micromsg_header");
        String formatVersion = ChannelUtil.formatVersion(getContext(), C89625d.f257841g);
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            formatVersion = formatVersion + " " + C88504k.m110376b(this);
        }
        settingsAboutMMHeaderPreference.f205658J = formatVersion;
        int intExtra = getIntent().getIntExtra("entry_fix_tools", 2);
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(873, (long) intExtra, 1, false);
        nVar.idkeyStat(873, 0, 1, false);
        setBackBtn(new f$$a(this));
        IconPreference iconPreference = (IconPreference) this.f205593d.mo72519a("fix_tools_aggressive_clean");
        iconPreference.mo101928J(getString(C0966R.string.n3c));
        boolean z = false;
        iconPreference.mo101929K(0);
        this.f205593d.mo72529n("fix_tools_matrix", !((C91353u) C86312j.m106911c(C91353u.class)).mo112629m6());
        C47511g gVar = this.f205593d;
        if (!"1".equals(((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_fixtools_show_file_analyse", "0")) && !WeChatEnvironment.hasDebugger() && !BuildInfo.DEBUG) {
            z = true;
        }
        gVar.mo72529n("fix_tools_file_analyse", z);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.equals("fix_tools_uplog")) {
            if (C78862e.f231707c == null) {
                C78862e.f231707c = new C78862e();
            }
            if (C78862e.f231707c.f231708a) {
                MMWizardActivity.m7017L7(this, new Intent(getContext(), FixToolsUpLogUploadingUI.class));
            } else {
                Intent intent = new Intent(getContext(), FixToolsUplogUI.class);
                intent.putExtra("entry_fix_tools_uplog", 9);
                MMWizardActivity.m7017L7(this, intent);
            }
            return true;
        } else if (preference.f121285r.equals("fix_tools_db_recover")) {
            Intent className = new Intent().setClassName(getContext(), "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
            className.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            AppCompatActivity context = getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(className);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToRecovery", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToRecovery", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (preference.f121285r.endsWith("fix_tools_matrix")) {
            if (!C91441c.m114729c()) {
                C76701a.makeText((Context) this, (CharSequence) "Matrix is never installed", 0).show();
            } else {
                Intent intent2 = new Intent();
                intent2.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.matrix.MatrixSettingUI");
                intent2.addFlags(67108864);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToMatrixUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToMatrixUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            return true;
        } else if (preference.f121285r.endsWith("fix_tools_search")) {
            Intent intent3 = new Intent(MMApplicationContext.getContext(), FixSearchUI.class);
            intent3.addFlags(67108864);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToSearchUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToSearchUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (preference.f121285r.equals("fix_force_update")) {
            ((C88689b) C86312j.m106911c(C88689b.class)).mo122753gD(1, getContext());
            return true;
        } else if (preference.f121285r.equals("fix_tools_aggressive_clean")) {
            C88144b.m109791i(this, "clean", ".ui.CleanUI", new Intent(), (Bundle) null);
            return true;
        } else if (!preference.f121285r.equals("fix_tools_file_analyse")) {
            return false;
        } else {
            Intent intent4 = new Intent(getContext(), FixToolsFileListUI.class);
            intent4.addFlags(67108864);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent4);
            C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }
}
