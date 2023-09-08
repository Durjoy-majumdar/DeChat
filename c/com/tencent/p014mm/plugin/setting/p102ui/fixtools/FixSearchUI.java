package com.tencent.p014mm.plugin.setting.p102ui.fixtools;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import bn2.C67292a;
import bn2.C67293b;
import bn2.C67294c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import p255vr.C65873e;
import pj3.C47511g;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI */
public class FixSearchUI extends MMPreference {

    /* renamed from: d */
    public C47511g f205587d;

    /* renamed from: e */
    public C77398g f205588e;

    /* renamed from: f */
    public C77398g f205589f;

    /* renamed from: g */
    public C77398g f205590g;

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI$a */
    public class C71035a implements MenuItem.OnMenuItemClickListener {
        public C71035a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FixSearchUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8906b0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            pj3.g r4 = r3.getPreferenceScreen()
            r3.f205587d = r4
            r4 = 2131830148(0x7f112584, float:1.9293285E38)
            r3.setMMTitle((int) r4)
            pj3.g r4 = r3.f205587d
            java.lang.String r0 = "fix_tools_micromsg_header"
            com.tencent.mm.ui.base.preference.Preference r4 = r4.mo72519a(r0)
            com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference r4 = (com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAboutMMHeaderPreference) r4
            androidx.appcompat.app.AppCompatActivity r0 = r3.getContext()
            int r1 = qe3.C89625d.f257841g
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.formatVersion(r0, r1)
            boolean r1 = qe3.C89625d.f257845k
            if (r1 != 0) goto L_0x002b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_BLUE
            if (r1 == 0) goto L_0x0043
        L_0x002b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = lg3.C88504k.m110376b(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0043:
            r4.f205658J = r0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r0 = 0
            r1 = 1
            if (r4 != 0) goto L_0x0069
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r4 != 0) goto L_0x005d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r4 != 0) goto L_0x005d
            int r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r2 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r4 != r2) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r4 = 0
            goto L_0x005e
        L_0x005d:
            r4 = 1
        L_0x005e:
            if (r4 != 0) goto L_0x0069
            boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r4 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r4 = 0
            goto L_0x006a
        L_0x0069:
            r4 = 1
        L_0x006a:
            java.lang.String r2 = "fix_tools_fts_info"
            if (r4 == 0) goto L_0x0074
            pj3.g r4 = r3.f205587d
            r4.mo72529n(r2, r0)
            goto L_0x0079
        L_0x0074:
            pj3.g r4 = r3.f205587d
            r4.mo72529n(r2, r1)
        L_0x0079:
            com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI$a r4 = new com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI$a
            r4.<init>()
            r3.setBackBtn(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixSearchUI.onCreate(android.os.Bundle):void");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.equals("fix_tools_fts")) {
            C77398g gVar2 = this.f205588e;
            if (gVar2 == null) {
                gVar2 = C76879j.m92714H(this, getString(C0966R.string.eux), "", true, new C67292a(this), (DialogInterface.OnClickListener) null);
                this.f205588e = gVar2;
            }
            gVar2.show();
            return true;
        } else if (preference.f121285r.equals("fix_tools_websearch")) {
            if (this.f205589f == null) {
                this.f205589f = C76879j.m92714H(this, getString(C0966R.string.ev_), "", true, new C67293b(this), (DialogInterface.OnClickListener) null);
            }
            this.f205589f.show();
            return true;
        } else if (preference.f121285r.equals("fix_tools_topstory")) {
            if (this.f205590g == null) {
                this.f205590g = C76879j.m92714H(this, getString(C0966R.string.ev_), "", true, new C67294c(this), (DialogInterface.OnClickListener) null);
            }
            this.f205590g.show();
            return true;
        } else if (preference.f121285r.equals("fix_tools_trigger_build_message")) {
            ((C65873e) C86312j.m106911c(C65873e.class)).mo89920rE(1);
            return true;
        } else if (!preference.f121285r.equals("fix_tools_fts_info")) {
            return false;
        } else {
            Intent intent = new Intent();
            intent.setClassName(getContext(), "com.tencent.mm.plugin.search.ui.FTSInfoUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/fixtools/FixSearchUI", "goToFTSInfoUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixSearchUI", "goToFTSInfoUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }
}
