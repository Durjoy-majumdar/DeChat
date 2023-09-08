package com.tencent.p014mm.plugin.subapp.p109ui.pluginapp;

import android.app.ActivityOptions;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import ax2.C0227b;
import ax2.C0228c;
import ax2.C0229d;
import ax2.C0234h;
import ax2.a$$a;
import bl3.C39818r;
import bp3.C104160f;
import bp3.C79758p;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceInfoCategory;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.MobileFriendUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import ff2.C8018a;
import gy3.C87412m;
import h81.C32735h;
import hg0.C76186t;
import j20.C117292a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import ke3.C88144b;
import l31.C61212e;
import lc3.C10485b;
import o31.C11345b;
import o31.C76986a;
import p182kk.C61104a;
import p255vr.C65873e;
import p286zl.C79396l;
import pj3.C47511g;
import s00.C90110f;
import u73.C101987v0;
import u73.C14135q;
import uk2.C14201c;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI */
public class AddMoreFriendsUI extends MMPreference {

    /* renamed from: d */
    public C47511g f21332d;

    /* renamed from: e */
    public boolean f21333e;

    /* renamed from: f */
    public C0234h f21334f;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI$a */
    public class C5506a implements Runnable {
        public C5506a() {
        }

        public void run() {
            Class cls = C0405n.class;
            Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
            O20.putExtra("KRightBtn", true);
            O20.putExtra("ftsneedkeyboard", true);
            O20.putExtra("key_load_js_without_delay", true);
            O20.putExtra("ftsType", 1);
            O20.putExtra("ftsbizscene", 9);
            Map<String, String> hn = ((C0405n) C86312j.m106911c(cls)).mo280hn(9, true, 0);
            String lh02 = ((C0405n) C86312j.m106911c(cls)).lh0(Util.safeParseInt(hn.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
            hn.put("sessionId", lh02);
            hn.put("subSessionId", lh02);
            O20.putExtra("sessionId", lh02);
            O20.putExtra("subSessionId", lh02);
            O20.putExtra("rawUrl", C101987v0.m134270d(hn, 0));
            Bundle bundle = null;
            if (!C85875k4.m106211z() && !AddMoreFriendsUI.this.isVASValid()) {
                bundle = ActivityOptions.makeSceneTransitionAnimation(AddMoreFriendsUI.this, new Pair[0]).toBundle();
            }
            C88144b.m109806x(AddMoreFriendsUI.this, O20, bundle);
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI$b */
    public class C5507b implements MenuItem.OnMenuItemClickListener {
        public C5507b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AddMoreFriendsUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI$c */
    public class C5508c implements DialogInterface.OnDismissListener {
        public C5508c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            AddMoreFriendsUI.this.setRequestedOrientation(-1);
        }
    }

    public AddMoreFriendsUI() {
        boolean z = false;
        boolean z2 = true;
        if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ColorfulQRCode_Int, 0) != 1) {
            z2 = ((C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_QRCODE_OLD_STYLE_INT, -100), -100) ^ true) || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_colorful_qrcode_new_enable, 0) == 1) ? true : z;
        }
        this.f21333e = z2;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getResourceId() {
        return C0966R.xml.f8852b;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C8018a.class);
        return hashSet;
    }

    public void initView() {
        Class cls = C5380o.class;
        setMMTitle((int) C0966R.string.f7390ew);
        this.f21332d = getPreferenceScreen();
        AddFriendItemPreference addFriendItemPreference = new AddFriendItemPreference(getContext());
        addFriendItemPreference.mo26273A("find_friends_by_invite");
        addFriendItemPreference.mo69923G(C0966R.string.cvw);
        addFriendItemPreference.f121282o = C0966R.raw.addfriend_icon_invite;
        Drawable drawable = addFriendItemPreference.f121274d.getResources().getDrawable(C0966R.raw.addfriend_icon_invite);
        if ((drawable == null && addFriendItemPreference.f121284q != null) || !(drawable == null || addFriendItemPreference.f121284q == drawable)) {
            addFriendItemPreference.f121284q = drawable;
        }
        addFriendItemPreference.mo7740D(C0966R.string.cvx);
        if ((Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InviteFriendsControlFlags"), 0) & 4) > 0) {
            this.f21332d.mo72524h(addFriendItemPreference, 4);
        }
        hideActionbarLine();
        setBackBtn(new C5507b());
        if (this.f21333e) {
            C0234h hVar = new C0234h(getContext());
            this.f21334f = hVar;
            C39818r rVar = C39818r.f106831a;
            C5380o oVar = (C5380o) rVar.mo62444c(this).mo75002a(cls);
            C87412m.m108594g(oVar, "uic");
            ImageView imageView = hVar.f767e;
            if (imageView != null) {
                oVar.f21034e = imageView;
            }
            ImageView imageView2 = hVar.f768f;
            if (imageView2 != null) {
                oVar.f21035f = imageView2;
            }
            TextView textView = hVar.f770h;
            if (textView != null) {
                oVar.f21037h = textView;
            }
            TextView textView2 = hVar.f771i;
            if (textView2 != null) {
                oVar.f21038i = textView2;
            }
            TextView textView3 = hVar.f772j;
            if (textView3 != null) {
                oVar.f21039j = textView3;
            }
            ImageView imageView3 = hVar.f769g;
            if (imageView3 != null) {
                oVar.f21036g = imageView3;
            }
            oVar.f21044r = false;
            oVar.mo6359l3(false);
            C5380o oVar2 = (C5380o) rVar.mo62444c(this).mo75002a(cls);
            a$$a a__a = new a$$a(this);
            oVar2.getClass();
            oVar2.f21047u = a__a;
            this.f21334f.setOnDismissListener(new C5508c());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.AddMoreFriendsUI).mo86179qs(this, C76986a.AddFriend);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Bundle bundle = null;
        if ("find_friends_by_qrcode".equals(preference.f121285r)) {
            Intent intent = new Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 1);
            intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
            intent.setFlags(65536);
            intent.putExtra("key_enable_multi_code", true);
            intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
            intent.putExtra("key_enable_scan_code_product_merge", true);
            intent.putExtra("key_check_camera_using", true);
            C115669n.INSTANCE.mo160131h(11265, 1);
            if (!C61104a.m71651g(this) && !C61104a.m71667w(this) && !C61104a.m71647c(getContext(), true)) {
                C88144b.m109791i(this, "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
            }
            ((C14201c) C86312j.m106911c(C14201c.class)).mo12578gN().mo6118a(12, C61104a.m71654j());
            return true;
        } else if ("find_friends_by_other_way".equals(preference.f121285r)) {
            if (C76186t.m91534b() != C79396l.SUCC) {
                Intent intent2 = new Intent(this, BindMContactIntroUI.class);
                intent2.putExtra("key_upload_scene", 6);
                MMWizardActivity.m7017L7(this, intent2);
                return true;
            }
            Intent intent3 = new Intent(this, MobileFriendUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent3);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if ("find_friends_by_web".equals(preference.f121285r)) {
            if (!WeChatBrands.Business.Entries.ContactNewFriendOa.checkAvailable(getContext())) {
                return true;
            }
            if (C43471q.m46984h(0)) {
                ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(MMApplicationContext.getContext(), new C5506a());
                preference.mo69932y(false);
            } else {
                Log.m105920e("MicroMsg.AddMoreFriendsUI", "fts h5 template not avail");
            }
            return true;
        } else if ("find_friends_by_radar".equals(preference.f121285r)) {
            C88144b.m109789g(this, "radar", ".ui.RadarSearchUI");
            return true;
        } else if ("find_friends_create_pwdgroup".equals(preference.f121285r)) {
            C115669n.INSTANCE.mo160131h(11140, 1);
            C88144b.m109789g(this, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
            return true;
        } else if ("find_friends_by_invite".equals(preference.f121285r)) {
            int intExtra = getIntent().getIntExtra("invite_friend_scene", 4);
            C115669n.INSTANCE.mo160131h(14034, Integer.valueOf(intExtra));
            Intent intent4 = new Intent(this, InviteFriendsBy3rdUI.class);
            intent4.putExtra("Invite_friends", intExtra);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent4);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (!"find_friends_by_ww".equals(preference.f121285r)) {
            return false;
        } else {
            if (!WeChatBrands.Business.Entries.ContactNewFriendWeWeCom.checkAvailable(getContext())) {
                return true;
            }
            Intent putExtra = new Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
            if (!C85875k4.m106211z() && !isVASValid()) {
                bundle = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
            }
            ((C65873e) C86312j.m106911c(C65873e.class)).mo89919mw(getContext(), ".ui.FTSAddWw", putExtra, bundle);
            return true;
        }
    }

    public void onResume() {
        String str;
        Preference a;
        super.onResume();
        boolean e = ((C0405n) C86312j.m106911c(C0405n.class)).mo279e();
        C88144b.m109788f("brandservice");
        if (e) {
            this.f21332d.mo72529n("find_friends_by_web", true);
        } else {
            this.f21332d.mo72529n("find_friends_by_web", false);
        }
        this.f21332d.notifyDataSetChanged();
        AddFriendSearchPreference addFriendSearchPreference = (AddFriendSearchPreference) this.f21332d.mo72519a("find_friends_by_input");
        addFriendSearchPreference.f21325K = getString(C0966R.string.bub);
        addFriendSearchPreference.f21326L = new C0227b(this);
        PreferenceInfoCategory preferenceInfoCategory = (PreferenceInfoCategory) this.f21332d.mo72519a("find_friends_info");
        String s = C75592q0.m90789s();
        String c = C75592q0.m90773c();
        String pureNumber = PhoneFormater.pureNumber((String) C97625j3.m125812b().mo105906u().mo119684e(6, (Object) null));
        if (!Util.isNullOrNil(c)) {
            str = getString(C0966R.string.cwc, new Object[]{c});
        } else if (!C72996z1.m85802I4(s)) {
            str = getString(C0966R.string.cwc, new Object[]{s});
        } else if (!Util.isNullOrNil(pureNumber)) {
            str = getString(C0966R.string.cwd, new Object[]{PhoneFormater.formatMobileString(pureNumber)});
        } else {
            str = getString(C0966R.string.cwe);
        }
        preferenceInfoCategory.mo69924H(str);
        preferenceInfoCategory.f24279L = new C0228c(this);
        C0229d dVar = new C0229d(this);
        preferenceInfoCategory.f24277J = dVar;
        preferenceInfoCategory.f24278K = dVar;
        ((AddFriendItemPreference) this.f21332d.mo72519a("find_friends_create_pwdgroup")).f21321L = 8;
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        if (getPreferenceScreen() != null && (a = getPreferenceScreen().mo72519a("find_friends_by_web")) != null) {
            a.mo69932y(true);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        if (this.f21333e) {
            hashSet.add(C5380o.class);
        }
    }
}
