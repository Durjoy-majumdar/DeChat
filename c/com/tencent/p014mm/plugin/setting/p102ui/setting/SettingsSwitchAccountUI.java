package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import aw0.C103928o;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.mars.Mars;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.FcmUnRegisterEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.autogen.events.SwitchAccountKillProcessEvent;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.p024ui.MobileInputUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.p014mm.plugin.setting.p102ui.widget.SwitchAccountGridView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f40.C75681p0;
import f40.C86709a0;
import f40.C86718e;
import h81.C8496k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import nj3.C88989a;
import nj3.C88990b;
import ob0.C11385n;
import ob0.C117747y;
import p154fy.C87121j;
import p156gj.C87203t;
import p196ln.C76708i;
import p214om.C11502f;
import p645pj.C77093f;
import p680ru.C77570i;
import qo3.C77407n;
import tm2.C14049d;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI */
public class SettingsSwitchAccountUI extends MMActivity implements C11385n {

    /* renamed from: v */
    public static final /* synthetic */ int f248985v = 0;

    /* renamed from: d */
    public TextView f248986d;

    /* renamed from: e */
    public SwitchAccountGridView f248987e;

    /* renamed from: f */
    public boolean f248988f;

    /* renamed from: g */
    public View f248989g;

    /* renamed from: h */
    public View f248990h;

    /* renamed from: i */
    public TextView f248991i;

    /* renamed from: j */
    public ValueAnimator f248992j;

    /* renamed from: n */
    public String f248993n;

    /* renamed from: o */
    public MTimerHandler f248994o;

    /* renamed from: p */
    public int f248995p;

    /* renamed from: q */
    public boolean f248996q;

    /* renamed from: r */
    public boolean f248997r;

    /* renamed from: s */
    public Map<String, SwitchAccountModel> f248998s = new HashMap();

    /* renamed from: t */
    public BroadcastReceiver f248999t = new C71089d();

    /* renamed from: u */
    public SwitchAccountGridView.C85453e f249000u = new C85429h();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$d */
    public class C71089d extends BroadcastReceiver {
        public C71089d() {
        }

        public void onReceive(Context context, Intent intent) {
            Log.m105925i("MicroMsg.SettingsSwitchAccountUI", "onReceive %s", intent.getAction());
            SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
            settingsSwitchAccountUI.unregisterReceiver(settingsSwitchAccountUI.f248999t);
            if (Util.nullAsNil(intent.getAction()).equals("action_kill_mm_process")) {
                C86709a0.m107523b();
                C86718e.m107550n();
                C86709a0.m107528h().mo121099j("switch account ,delay logout");
                Mars.onSingalCrash(0);
                Log.appenderFlush();
                SettingsSwitchAccountUI.this.finish();
                Log.m105925i("MicroMsg.SettingsSwitchAccountUI", "try to kill mm pid %d", Integer.valueOf(Process.myPid()));
                new SwitchAccountKillProcessEvent().publish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$a */
    public class C85423a implements MenuItem.OnMenuItemClickListener {
        public C85423a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
            settingsSwitchAccountUI.f248988f = false;
            settingsSwitchAccountUI.f248997r = false;
            settingsSwitchAccountUI.f248987e.setDeleteState(false);
            SettingsSwitchAccountUI.this.f248987e.mo118801b();
            SettingsSwitchAccountUI.this.mo118785M7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$b */
    public class C85424b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f249002d;

        public C85424b(Intent intent) {
            this.f249002d = intent;
        }

        public void run() {
            ((C85429h) SettingsSwitchAccountUI.this.f249000u).mo118790a(this.f249002d.getStringExtra("SWITCH_TO_USERNAME"));
            C76912y0.makeText((Context) SettingsSwitchAccountUI.this.getContext(), (CharSequence) SettingsSwitchAccountUI.this.getString(C0966R.string.ixm), 1).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$c */
    public class C85425c implements MTimerHandler.CallBack {
        public C85425c() {
        }

        public boolean onTimerExpired() {
            SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
            int i = SettingsSwitchAccountUI.f248985v;
            settingsSwitchAccountUI.mo118784L7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$e */
    public class C85426e implements MenuItem.OnMenuItemClickListener {
        public C85426e(SettingsSwitchAccountUI settingsSwitchAccountUI) {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$f */
    public class C85427f implements MenuItem.OnMenuItemClickListener {
        public C85427f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
            int i = SettingsSwitchAccountUI.f248985v;
            settingsSwitchAccountUI.mo118782J7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$g */
    public class C85428g implements SwitchAccountGridView.C85454f {
        public C85428g() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$h */
    public class C85429h implements SwitchAccountGridView.C85453e {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$h$a */
        public class C85430a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ int f249008d;

            public C85430a(int i) {
                this.f249008d = i;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107142f(0, SettingsSwitchAccountUI.this.getString(C0966R.string.izy));
                e0Var.mo107142f(1, SettingsSwitchAccountUI.this.getString(this.f249008d == 0 ? C0966R.string.n5h : C0966R.string.izz));
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$h$b */
        public class C85431b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ int f249010d;

            public C85431b(int i) {
                this.f249010d = i;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(((HashMap) SettingsSwitchAccountUI.this.f248998s).size() > 1 ? 1 : 0);
                    objArr[1] = 13;
                    objArr[2] = C75593t5.f222075c.mo105944g();
                    objArr[3] = C75593t5.f222075c.mo105943f();
                    objArr[4] = C87203t.m108273i();
                    nVar.mo160131h(14978, objArr);
                    SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0);
                    sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
                    sharedPreferences.edit().putBoolean("last_switch_account_to_regui", false).commit();
                    SettingsSwitchAccountUI.this.mo118783K7();
                } else if (itemId == 1) {
                    C115669n nVar2 = C115669n.INSTANCE;
                    Object[] objArr2 = new Object[5];
                    objArr2[0] = Integer.valueOf(((HashMap) SettingsSwitchAccountUI.this.f248998s).size() > 1 ? 1 : 0);
                    objArr2[1] = 14;
                    objArr2[2] = C75593t5.f222075c.mo105944g();
                    objArr2[3] = C75593t5.f222075c.mo105943f();
                    objArr2[4] = C87203t.m108273i();
                    nVar2.mo160131h(14978, objArr2);
                    String H = C86709a0.m107535s().mo121142i().mo119674H(6, "");
                    if (this.f249010d == 0 || !Util.isNullOrNil(H)) {
                        Intent intent = new Intent(SettingsSwitchAccountUI.this, SettingsSelectCreateAccount.class);
                        intent.putExtra("RegScene", this.f249010d);
                        SettingsSwitchAccountUI.this.startActivityForResult(intent, 702);
                        return;
                    }
                    SettingsSwitchAccountUI.this.onActivityResult(702, 1, new Intent());
                }
            }
        }

        public C85429h() {
        }

        /* renamed from: a */
        public void mo118790a(String str) {
            String str2 = str;
            Class cls = C10485b.class;
            if (!Util.isNullOrNil(str)) {
                SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
                if (settingsSwitchAccountUI.f248995p == 0) {
                    settingsSwitchAccountUI.getClass();
                    Log.m105925i("MicroMsg.SettingsSwitchAccountUI", "switch to %s, current %s", str2, settingsSwitchAccountUI.f248993n);
                    if (!str2.equals(settingsSwitchAccountUI.f248993n)) {
                        settingsSwitchAccountUI.mo118783K7();
                        MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putString("last_switch_account_to_wx_username", str2).commit();
                        return;
                    }
                    settingsSwitchAccountUI.finish();
                    return;
                }
                settingsSwitchAccountUI.mo118780H7(str2);
                return;
            }
            SettingsSwitchAccountUI settingsSwitchAccountUI2 = SettingsSwitchAccountUI.this;
            if (settingsSwitchAccountUI2.f248995p == 0) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(((HashMap) settingsSwitchAccountUI2.f248998s).size() > 1 ? 1 : 0);
                objArr[1] = 11;
                objArr[2] = C75593t5.f222075c.mo105944g();
                objArr[3] = C75593t5.f222075c.mo105943f();
                objArr[4] = C87203t.m108273i();
                nVar.mo160131h(14978, objArr);
                int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_AffiliateAccount_Int, -1);
                String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
                boolean z = (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("AffiliatedAcctRegSwitch", 0) == 0 && e == -1) ? false : true;
                C77093f vh02 = ((C10485b) C86709a0.m107533q(cls)).vh0();
                if (e == -1) {
                    e = 0;
                }
                int b = vh02.mo107404b("AffiliatedAcctRegScene", e);
                if (!C86709a0.m107523b().mo121115m() || !"CN".equalsIgnoreCase(str3) || !z) {
                    SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0);
                    sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
                    sharedPreferences.edit().putBoolean("last_switch_account_to_regui", false).commit();
                    SettingsSwitchAccountUI.this.mo118783K7();
                    return;
                }
                Object[] objArr2 = new Object[5];
                objArr2[0] = Integer.valueOf(((HashMap) SettingsSwitchAccountUI.this.f248998s).size() > 1 ? 1 : 0);
                objArr2[1] = 12;
                objArr2[2] = C75593t5.f222075c.mo105944g();
                objArr2[3] = C75593t5.f222075c.mo105943f();
                objArr2[4] = C87203t.m108273i();
                nVar.mo160131h(14978, objArr2);
                C77407n nVar2 = new C77407n((Context) SettingsSwitchAccountUI.this.getContext(), 1, false);
                nVar2.f225771i = new C85430a(b);
                nVar2.f225782p = new C85431b(b);
                nVar2.mo107573q();
                return;
            }
            Intent intent = new Intent(SettingsSwitchAccountUI.this, MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            intent.putExtra("from_switch_account", true);
            SettingsSwitchAccountUI settingsSwitchAccountUI3 = SettingsSwitchAccountUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SettingsSwitchAccountUI settingsSwitchAccountUI4 = settingsSwitchAccountUI3;
            C117292a.m165358d(settingsSwitchAccountUI4, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$5", "onClickAvatar", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSwitchAccountUI3.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(settingsSwitchAccountUI4, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$5", "onClickAvatar", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111198g(SettingsSwitchAccountUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$i */
    public class C85432i implements MenuItem.OnMenuItemClickListener {
        public C85432i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
            if (!settingsSwitchAccountUI.f248988f) {
                settingsSwitchAccountUI.f248988f = true;
                settingsSwitchAccountUI.f248987e.setDeleteState(true);
                SettingsSwitchAccountUI.this.f248987e.mo118801b();
                SettingsSwitchAccountUI.this.mo118785M7();
                if (((HashSet) C75593t5.f222075c.mo105942e()).size() > 1) {
                    C115669n.INSTANCE.mo160131h(14978, 1, 3, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
                } else {
                    C115669n.INSTANCE.mo160131h(14978, 0, 3, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$j */
    public class C85433j implements MenuItem.OnMenuItemClickListener {
        public C85433j() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
            settingsSwitchAccountUI.f248988f = false;
            settingsSwitchAccountUI.f248997r = false;
            settingsSwitchAccountUI.f248987e.setDeleteState(false);
            SettingsSwitchAccountUI.this.f248987e.mo118801b();
            SettingsSwitchAccountUI.this.mo118785M7();
            if (SettingsSwitchAccountUI.this.f248987e.getAccountCount() == 0) {
                if (((HashSet) C75593t5.f222075c.mo105942e()).size() > 1) {
                    C115669n.INSTANCE.mo160131h(14978, 1, 11, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
                } else {
                    C115669n.INSTANCE.mo160131h(14978, 0, 11, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
                }
                Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(SettingsSwitchAccountUI.this);
                b.addFlags(67108864);
                SettingsSwitchAccountUI settingsSwitchAccountUI2 = SettingsSwitchAccountUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(b);
                SettingsSwitchAccountUI settingsSwitchAccountUI3 = settingsSwitchAccountUI2;
                C117292a.m165358d(settingsSwitchAccountUI3, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$9", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                settingsSwitchAccountUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(settingsSwitchAccountUI3, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$9", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                SettingsSwitchAccountUI.this.finish();
                C88990b.m111200i(SettingsSwitchAccountUI.this);
                SettingsSwitchAccountUI.this.f248996q = false;
            }
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo118780H7(String str) {
        String str2 = str;
        SwitchAccountModel switchAccountModel = (SwitchAccountModel) ((HashMap) this.f248998s).get(str2);
        if (switchAccountModel != null && !this.f248996q) {
            this.f248996q = true;
            Log.m105925i("MicroMsg.SettingsSwitchAccountUI", "doLoginScene: wxid: %s username:%s, ticket:%s", str2, switchAccountModel.f248935e, switchAccountModel.f248937g);
            C114735a0 a0Var = new C114735a0(switchAccountModel.f248935e, switchAccountModel.f248937g, 0, "", "", "", 0, "", true, false);
            a0Var.f343988p = str2;
            C86709a0.m107524d().mo123460f(a0Var);
            this.f248987e.setSwitchToWxUsername(str2);
            this.f248987e.mo118801b();
            mo118785M7();
        }
    }

    /* renamed from: I7 */
    public final void mo118781I7() {
        Class cls = C87121j.class;
        if (C86709a0.m107523b().mo121120t() && !C75592q0.m90795y()) {
            C86709a0.m107524d().mo123460f((C117747y) ((C87121j) C86312j.m106911c(cls)).mo71218iI(2));
        }
        C86709a0.m107524d().mo123460f((C117747y) ((C87121j) C86312j.m106911c(cls)).mo71220lB(0));
        this.f248987e.setLogoutState(true);
        this.f248987e.mo118801b();
        if (this.f248994o == null) {
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C85425c(), false);
            this.f248994o = mTimerHandler;
            mTimerHandler.startTimer(8000);
        }
    }

    /* renamed from: J7 */
    public final void mo118782J7() {
        Log.m105924i("MicroMsg.SettingsSwitchAccountUI", "go back");
        int i = this.f248995p;
        if (i == 2 || i == 1) {
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
            b.addFlags(67108864);
            b.putExtra("can_finish", true);
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            C88990b.m111200i(this);
            this.f248996q = false;
            return;
        }
        C103928o.m138642b();
        finish();
    }

    /* renamed from: K7 */
    public final void mo118783K7() {
        if (!(C86709a0.m107524d() == null || C86709a0.m107524d().f256809d == null)) {
            C86709a0.m107524d().f256809d.mo55479j0(false);
        }
        new FcmUnRegisterEvent().publish();
        Log.m105929w("MicroMsg.SettingsSwitchAccountUI", "dklogout User LOGOUT Now uin:%d , clear cookie", Integer.valueOf(C86709a0.m107523b().mo121110g()));
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107724bH();
        ((C8496k) C86312j.m106911c(C8496k.class)).mo9419s1();
        C1302b0 b0Var = new C1302b0(2);
        b0Var.f10416f = 1;
        C86709a0.m107524d().mo123460f(b0Var);
    }

    /* renamed from: L7 */
    public final void mo118784L7() {
        Log.m105924i("MicroMsg.SettingsSwitchAccountUI", "switch account logout");
        C14049d.m13402a().fq0();
        setBackBtnVisible(false);
        showOptionMenu(false);
        LogoutEvent logoutEvent = new LogoutEvent();
        LogoutEvent.C28774a aVar = logoutEvent.f78863d;
        aVar.getClass();
        aVar.f78864a = 0;
        logoutEvent.publish();
        BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f78724d.f78725a = true;
        backupProcessMgrExitEvent.publish();
        MMEntryLock.unlock("show_whatsnew");
        C75681p0.m90934a(this, true);
        if (C86709a0.m107522a()) {
            C7624i3.f25910c.mo8754b(((C76708i) C86312j.m106911c(C76708i.class)).mo106845oX(C75592q0.m90789s(), false));
        }
        Log.m105925i("MicroMsg.SettingsSwitchAccountUI", "last login username in sp %s", C7624i3.f25910c.mo19a("login_user_name", ""));
        Map<String, String> r = C75592q0.m90788r();
        HashMap hashMap = (HashMap) r;
        if (Util.isNullOrNil((String) hashMap.get("login_user_name"))) {
            hashMap.put("login_user_name", C7624i3.f25910c.mo19a("login_user_name", ""));
        }
        C75593t5.f222075c.mo105945h(C75592q0.m90789s(), r);
        MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", true).commit();
        String s = C75592q0.m90789s();
        registerReceiver(this.f248999t, new IntentFilter("action_kill_mm_process"));
        Intent intent = new Intent(this, FakeSwitchAccountUI.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((HashMap) this.f248998s).values());
        intent.putParcelableArrayListExtra("key_switch_account_users", arrayList);
        intent.putExtra("key_switch_from_wx_username", s);
        MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("transit_to_switch_account", true).commit();
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), this);
        float p = C76577a.m92165p(this);
        intent.putExtra("key_langauage_code", loadApplicationLanguage);
        intent.putExtra("key_font_scale_size", p);
        Log.m105925i("MicroMsg.SettingsSwitchAccountUI", "mm pid %d", Integer.valueOf(Process.myPid()));
        intent.putExtra("key_mm_process_pid", Process.myPid());
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "transitToSwitchAccount", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "transitToSwitchAccount", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C88990b.m111197f(this);
    }

    /* renamed from: M7 */
    public final void mo118785M7() {
        if (this.f248996q) {
            showOptionMenu(false);
        } else if (((HashMap) this.f248998s).size() <= 1 && this.f248995p == 0) {
            showOptionMenu(false);
            this.f248988f = false;
            this.f248987e.setDeleteState(false);
        } else if (!this.f248988f) {
            this.f248986d.setText(C0966R.string.izx);
            this.f248991i.setVisibility(8);
            addTextOptionMenu(0, getString(C0966R.string.a08), new C85432i());
        } else {
            this.f248986d.setText(C0966R.string.izv);
            this.f248991i.setVisibility(0);
            if (this.f248997r) {
                addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C85433j());
            } else {
                addTextOptionMenu(0, getString(C0966R.string.f7926wf), new C85423a());
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0105, code lost:
        if (r0.f222077a.contains(r8.f248993n) != false) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r22 = this;
            r8 = r22
            java.lang.Class<com.tencent.mm.plugin.account.ui.MobileInputUI> r9 = com.tencent.p014mm.plugin.account.p024ui.MobileInputUI.class
            java.lang.String r10 = ""
            r8.setMMTitle((java.lang.String) r10)
            r22.hideActionbarLine()
            android.content.res.Resources r0 = r22.getResources()
            r1 = 2131101433(0x7f0606f9, float:1.7815276E38)
            int r0 = r0.getColor(r1)
            r8.setActionbarColor(r0)
            r0 = 2131821575(0x7f110407, float:1.9275897E38)
            java.lang.String r0 = r8.getString(r0)
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$e r1 = new com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$e
            r1.<init>(r8)
            r11 = 0
            r8.addTextOptionMenu(r11, r0, r1)
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r1 = "key_scene"
            int r0 = r0.getIntExtra(r1, r11)
            r8.f248995p = r0
            r0 = 2131314754(0x7f094842, float:1.8247942E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.f248989g = r0
            r0 = 2131314752(0x7f094840, float:1.8247938E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.f248990h = r0
            r0 = 2131314753(0x7f094841, float:1.824794E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f248986d = r0
            r0 = 2131314748(0x7f09483c, float:1.824793E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f248991i = r0
            r0 = 2131314751(0x7f09483f, float:1.8247936E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView r0 = (com.tencent.p014mm.plugin.setting.p102ui.widget.SwitchAccountGridView) r0
            r8.f248987e = r0
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$e r1 = r8.f249000u
            r0.setOnClickAvatarListener(r1)
            int r0 = r8.f248995p
            if (r0 != 0) goto L_0x0091
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.setting.SwitchAccountReceiver> r1 = com.tencent.p014mm.plugin.setting.SwitchAccountReceiver.class
            r0.<init>(r8, r1)
            java.lang.String r1 = "switch_process_action_code_key"
            java.lang.String r2 = "action_switch_account"
            r0.putExtra(r1, r2)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1.sendBroadcast(r0)
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$f r0 = new com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$f
            r0.<init>()
            r8.setBackBtn(r0)
            goto L_0x0094
        L_0x0091:
            r8.setBackBtnVisible(r11)
        L_0x0094:
            eb0.t5 r0 = eb0.C75593t5.f222075c
            java.util.Set r0 = r0.mo105942e()
            boolean r1 = f40.C86709a0.m107522a()
            r12 = 2
            if (r1 == 0) goto L_0x00b3
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r2 = 0
            java.lang.Object r1 = r1.mo119684e(r12, r2)
            java.lang.String r1 = (java.lang.String) r1
            r8.f248993n = r1
            goto L_0x00be
        L_0x00b3:
            eb0.i3 r1 = eb0.C7624i3.f25910c
            java.lang.String r2 = "login_weixin_username"
            java.lang.String r1 = r1.mo19a(r2, r10)
            r8.f248993n = r1
        L_0x00be:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            int r2 = r8.f248995p
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r11] = r2
            java.lang.String r2 = r8.f248993n
            r13 = 1
            r1[r13] = r2
            java.lang.String r14 = "MicroMsg.SettingsSwitchAccountUI"
            java.lang.String r2 = "scene %d， lastLoginWxUsername %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r1)
            java.lang.String r1 = r8.f248993n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r2 = "last_logout_no_pwd_ticket"
            java.lang.String r3 = "last_login_use_voice"
            java.lang.String r4 = "last_login_nick_name"
            java.lang.String r5 = "login_user_name"
            java.lang.String r6 = "last_avatar_path"
            if (r1 != 0) goto L_0x013f
            java.lang.String r1 = r8.f248993n
            r7 = r0
            java.util.HashSet r7 = (java.util.HashSet) r7
            boolean r1 = r7.contains(r1)
            if (r1 != 0) goto L_0x013f
            int r0 = r8.f248995p
            if (r0 != r12) goto L_0x0107
            eb0.t5 r0 = eb0.C75593t5.f222075c
            java.lang.String r1 = r8.f248993n
            android.content.SharedPreferences r0 = r0.f222077a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0189
        L_0x0107:
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r17 = r0.mo19a(r5, r10)
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r21 = r0.mo19a(r4, r10)
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r18 = r0.mo19a(r6, r10)
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r0 = r0.mo19a(r3, r10)
            eb0.t5 r1 = eb0.C75593t5.f222075c
            java.lang.String r3 = r8.f248993n
            java.lang.String r19 = r1.mo105941d(r3, r2)
            com.tencent.mm.plugin.setting.model.SwitchAccountModel r1 = new com.tencent.mm.plugin.setting.model.SwitchAccountModel
            java.lang.String r2 = r8.f248993n
            int r20 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r15 = r1
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> r0 = r8.f248998s
            java.lang.String r2 = r8.f248993n
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r2, r1)
            goto L_0x0189
        L_0x013f:
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0189
            java.util.Iterator r0 = r0.iterator()
        L_0x014b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0189
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            eb0.t5 r7 = eb0.C75593t5.f222075c
            java.lang.String r17 = r7.mo105941d(r1, r5)
            eb0.t5 r7 = eb0.C75593t5.f222075c
            java.lang.String r21 = r7.mo105941d(r1, r4)
            eb0.t5 r7 = eb0.C75593t5.f222075c
            java.lang.String r18 = r7.mo105941d(r1, r6)
            eb0.t5 r7 = eb0.C75593t5.f222075c
            java.lang.String r19 = r7.mo105941d(r1, r2)
            eb0.t5 r7 = eb0.C75593t5.f222075c
            java.lang.String r7 = r7.mo105941d(r1, r3)
            com.tencent.mm.plugin.setting.model.SwitchAccountModel r15 = new com.tencent.mm.plugin.setting.model.SwitchAccountModel
            int r20 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)
            r7 = r15
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> r15 = r8.f248998s
            java.util.HashMap r15 = (java.util.HashMap) r15
            r15.put(r1, r7)
            goto L_0x014b
        L_0x0189:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> r0 = r8.f248998s
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            java.lang.String r15 = "mobile_input_purpose"
            if (r0 != 0) goto L_0x01e5
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r8, r9)
            r0.putExtra(r15, r13)
            java.lang.String r1 = "can_finish"
            r0.putExtra(r1, r13)
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r0)
            java.lang.Object[] r1 = r7.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r0 = r22
            r12 = r7
            r7 = r16
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r12.mo10231a(r11)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r2 = "initView"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r22
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r22.finish()
            nj3.C88990b.m111197f(r22)
        L_0x01e5:
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView r0 = r8.f248987e
            java.util.Map<java.lang.String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> r1 = r8.f248998s
            r0.mo118800a(r1)
            int r0 = r8.f248995p
            if (r0 != r13) goto L_0x0296
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "switch_account_preferences"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r11)
            java.lang.String r1 = "last_switch_account_to_wx_username"
            java.lang.String r1 = r0.getString(r1, r10)
            java.lang.String r2 = "last_switch_account_to_regui"
            boolean r2 = r0.getBoolean(r2, r11)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "transit_to_switch_account"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r11)
            r0.commit()
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r1
            java.lang.String r3 = "switch to %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x023e
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121115m()
            if (r0 == 0) goto L_0x023a
            java.lang.String r0 = "already login ,quit"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r22.finish()
            goto L_0x029f
        L_0x023a:
            r8.mo118780H7(r1)
            goto L_0x029f
        L_0x023e:
            r8.f248996q = r11
            if (r2 != 0) goto L_0x024b
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r8, r9)
            r0.putExtra(r15, r13)
            goto L_0x0252
        L_0x024b:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI> r1 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.class
            r0.<init>(r8, r1)
        L_0x0252:
            java.lang.String r1 = "from_switch_account"
            r0.putExtra(r1, r13)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r22
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r9.mo10231a(r11)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r2 = "initView"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r22
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            nj3.C88990b.m111197f(r22)
            eb0.C75593t5.f222076d = r13
            goto L_0x029f
        L_0x0296:
            if (r0 != 0) goto L_0x029f
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView r0 = r8.f248987e
            java.lang.String r1 = r8.f248993n
            r0.setLastLoginWxUsername(r1)
        L_0x029f:
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView r0 = r8.f248987e
            r0.mo118801b()
            r22.mo118785M7()
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView r0 = r8.f248987e
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$g r1 = new com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI$g
            r1.<init>()
            r0.setOnDeleteAvatarListener(r1)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r8.f248992j = r0
            com.tencent.mm.plugin.setting.ui.setting.j3 r1 = new com.tencent.mm.plugin.setting.ui.setting.j3
            r1.<init>(r8)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r8.f248992j
            com.tencent.mm.plugin.setting.ui.setting.k3 r1 = new com.tencent.mm.plugin.setting.ui.setting.k3
            r1.<init>(r8)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r8.f248992j
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsSwitchAccountUI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 701) {
            if (i2 == -1) {
                mo118781I7();
            }
        } else if (i != 702) {
        } else {
            if (i2 == 1) {
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0);
                sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
                sharedPreferences.edit().putBoolean("last_switch_account_to_regui", true).commit();
                mo118783K7();
            } else if (i2 == -1) {
                Set<String> e = C75593t5.f222075c.mo105942e();
                ((HashMap) this.f248998s).clear();
                Iterator it = ((HashSet) e).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = str;
                    ((HashMap) this.f248998s).put(str, new SwitchAccountModel(str2, C75593t5.f222075c.mo105941d(str, "login_user_name"), C75593t5.f222075c.mo105941d(str, "last_avatar_path"), C75593t5.f222075c.mo105941d(str, "last_logout_no_pwd_ticket"), Util.safeParseInt(C75593t5.f222075c.mo105941d(str, "last_login_use_voice")), C75593t5.f222075c.mo105941d(str, "last_login_nick_name")));
                }
                this.f248987e.mo118800a(this.f248998s);
                mo118785M7();
                this.f248987e.mo118801b();
                this.f248987e.post(new C85424b(intent));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            unregisterReceiver(this.f248999t);
        } catch (IllegalArgumentException unused) {
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo118782J7();
        return true;
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.SettingsSwitchAccountUI", "onResume");
        C103928o.m138641a(true, true, true);
        int i = this.f248995p;
        if (i == 1 || i == 2) {
            C86709a0.m107524d().mo123455a(701, this);
            C86709a0.m107524d().mo123455a(252, this);
        }
        if (this.f248995p == 0) {
            C86709a0.m107524d().mo123455a(281, this);
            C86709a0.m107524d().mo123455a(282, this);
            C86709a0.m107524d().mo123455a(255, this);
        }
        this.f248987e.mo118801b();
        mo118785M7();
        int i2 = this.f248995p;
        if ((i2 == 1 || i2 == 2) && C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            Log.m105924i("MicroMsg.SettingsSwitchAccountUI", "account initialized");
            this.f248996q = true;
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
            b.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            C88990b.m111200i(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0300  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r35, int r36, java.lang.String r37, ob0.C117747y r38) {
        /*
            r34 = this;
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = 5
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r36)
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r0[r13] = r1
            r15 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r0[r15] = r11
            r7 = 2
            r0[r7] = r38
            int r1 = r38.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r17 = 3
            r0[r17] = r1
            r6 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0[r6] = r8
            java.lang.String r5 = "MicroMsg.SettingsSwitchAccountUI"
            java.lang.String r2 = "errCode %d, errMsg %s, scene %s, type  %d, this %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            int r0 = r38.getType()
            r4 = 701(0x2bd, float:9.82E-43)
            r3 = 14978(0x3a82, float:2.0989E-41)
            r2 = 252(0xfc, float:3.53E-43)
            if (r0 == r2) goto L_0x0055
            int r0 = r38.getType()
            if (r0 != r4) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            r33 = r5
            r1 = 14978(0x3a82, float:2.0989E-41)
            r3 = 2
            r4 = 4
            goto L_0x0261
        L_0x0055:
            if (r9 != 0) goto L_0x0150
            if (r10 != 0) goto L_0x0150
            android.view.View r0 = r8.f248989g
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r18 = k20.C60958c.f173611a
            r2.mo10233c(r1)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r21 = "onSceneEnd"
            java.lang.String r22 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r2 = r2.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r20 = "onSceneEnd"
            java.lang.String r21 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r0 = r8.f248990h
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r1)
            java.lang.Object[] r26 = r2.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r28 = "onSceneEnd"
            java.lang.String r29 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = r2.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r27 = "onSceneEnd"
            java.lang.String r28 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            r0 = r38
            com.tencent.mm.modelsimple.a0 r0 = (com.tencent.p014mm.modelsimple.C114735a0) r0
            f40.C86718e.m107546E()
            eb0.t5 r0 = eb0.C75593t5.f222075c
            java.util.Set r0 = r0.mo105942e()
            java.util.HashSet r0 = (java.util.HashSet) r0
            int r0 = r0.size()
            if (r0 <= r15) goto L_0x0110
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r13] = r16
            r1[r15] = r14
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105944g()
            r1[r7] = r2
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105943f()
            r1[r17] = r2
            java.lang.String r2 = p156gj.C87203t.m108273i()
            r1[r6] = r2
            r0.mo160131h(r3, r1)
            goto L_0x0131
        L_0x0110:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r13] = r14
            r1[r15] = r14
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105944g()
            r1[r7] = r2
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105943f()
            r1[r17] = r2
            java.lang.String r2 = p156gj.C87203t.m108273i()
            r1[r6] = r2
            r0.mo160131h(r3, r1)
        L_0x0131:
            android.animation.ValueAnimator r0 = r8.f248992j
            r0.start()
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r0 != 0) goto L_0x0142
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r0 == 0) goto L_0x004d
        L_0x0142:
            r0 = 2
            com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct
            r2.<init>()
            r2.f107894d = r0
            r2.mo86054n()
            goto L_0x004d
        L_0x0150:
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView r0 = r8.f248987e
            java.lang.String r1 = ""
            r0.setSwitchToWxUsername(r1)
            r8.f248996q = r13
            r0 = 2131836375(0x7f113dd7, float:1.9305915E38)
            java.lang.String r0 = r8.getString(r0)
            nj3.C76879j.m92726T(r8, r0)
            r0 = r38
            com.tencent.mm.modelsimple.a0 r0 = (com.tencent.p014mm.modelsimple.C114735a0) r0
            java.lang.String r0 = r0.f343988p
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0204
            java.util.Map<java.lang.String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> r1 = r8.f248998s
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x0204
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.setting.model.SwitchAccountModel> r2 = r8.f248998s
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r0)
            com.tencent.mm.plugin.setting.model.SwitchAccountModel r2 = (com.tencent.p014mm.plugin.setting.model.SwitchAccountModel) r2
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r13] = r0
            int r4 = r2.f248938h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r15] = r4
            java.lang.String r4 = "wxID %s, plugSwitch: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MeSetSecurityVoicePrint
            boolean r3 = r3.banned()
            if (r3 != 0) goto L_0x01af
            int r2 = r2.f248938h
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x01af
            java.lang.Class<com.tencent.mm.plugin.account.ui.LoginVoiceUI> r2 = com.tencent.p014mm.plugin.account.p024ui.LoginVoiceUI.class
            r1.setClass(r8, r2)
            goto L_0x01b4
        L_0x01af:
            java.lang.Class<com.tencent.mm.plugin.account.ui.LoginPasswordUI> r2 = com.tencent.p014mm.plugin.account.p024ui.LoginPasswordUI.class
            r1.setClass(r8, r2)
        L_0x01b4:
            java.lang.String r2 = "switch_login_wx_id"
            r1.putExtra(r2, r0)
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r1)
            java.lang.Object[] r1 = r4.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            r0 = r34
            r12 = r4
            r4 = r20
            r33 = r5
            r5 = r21
            r6 = r22
            r7 = r23
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r12.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI"
            java.lang.String r2 = "onSceneEnd"
            java.lang.String r3 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r34
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            nj3.C88990b.m111197f(r34)
            goto L_0x0206
        L_0x0204:
            r33 = r5
        L_0x0206:
            eb0.t5 r0 = eb0.C75593t5.f222075c
            java.util.Set r0 = r0.mo105942e()
            java.util.HashSet r0 = (java.util.HashSet) r0
            int r0 = r0.size()
            if (r0 <= r15) goto L_0x023b
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r13] = r16
            r2[r15] = r16
            eb0.t5 r1 = eb0.C75593t5.f222075c
            java.lang.String r1 = r1.mo105944g()
            r3 = 2
            r2[r3] = r1
            eb0.t5 r1 = eb0.C75593t5.f222075c
            java.lang.String r1 = r1.mo105943f()
            r2[r17] = r1
            java.lang.String r1 = p156gj.C87203t.m108273i()
            r4 = 4
            r2[r4] = r1
            r1 = 14978(0x3a82, float:2.0989E-41)
            r0.mo160131h(r1, r2)
            goto L_0x0261
        L_0x023b:
            r1 = 14978(0x3a82, float:2.0989E-41)
            r3 = 2
            r4 = 4
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 5
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r13] = r14
            r5[r15] = r16
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105944g()
            r5[r3] = r2
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105943f()
            r5[r17] = r2
            java.lang.String r2 = p156gj.C87203t.m108273i()
            r5[r4] = r2
            r0.mo160131h(r1, r5)
        L_0x0261:
            int r0 = r38.getType()
            r2 = 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L_0x0300
            r0 = r38
            com.tencent.mm.modelsimple.b0 r0 = (com.tencent.p014mm.modelsimple.C1302b0) r0
            int r0 = r0.f10417g
            if (r0 != r3) goto L_0x0366
            if (r9 != 0) goto L_0x027a
            if (r10 != 0) goto L_0x027a
            r34.mo118781I7()
            goto L_0x0366
        L_0x027a:
            r0 = -3
            if (r10 != r0) goto L_0x02f8
            if (r9 != r4) goto L_0x02f8
            eb0.t5 r0 = eb0.C75593t5.f222075c
            java.util.Set r0 = r0.mo105942e()
            java.util.HashSet r0 = (java.util.HashSet) r0
            int r0 = r0.size()
            r2 = 7
            if (r0 <= r15) goto L_0x02b5
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r13] = r16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r15] = r2
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105944g()
            r5[r3] = r2
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105943f()
            r5[r17] = r2
            java.lang.String r2 = p156gj.C87203t.m108273i()
            r5[r4] = r2
            r0.mo160131h(r1, r5)
            goto L_0x02db
        L_0x02b5:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r13] = r14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r15] = r2
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105944g()
            r5[r3] = r2
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r2 = r2.mo105943f()
            r5[r17] = r2
            java.lang.String r2 = p156gj.C87203t.m108273i()
            r5[r4] = r2
            r0.mo160131h(r1, r5)
        L_0x02db:
            android.content.Intent r0 = new android.content.Intent
            androidx.appcompat.app.AppCompatActivity r1 = r34.getContext()
            java.lang.Class<com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI> r2 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI.class
            r0.<init>(r1, r2)
            r1 = 2131834606(0x7f1136ee, float:1.9302327E38)
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r2 = "kintent_hint"
            r0.putExtra(r2, r1)
            r1 = 701(0x2bd, float:9.82E-43)
            r8.startActivityForResult((android.content.Intent) r0, (int) r1)
            goto L_0x0366
        L_0x02f8:
            wc3.y r0 = tm2.C14049d.m13402a()
            r0.mo93163uP(r8, r9, r10, r11)
            return
        L_0x0300:
            int r0 = r38.getType()
            r1 = 282(0x11a, float:3.95E-43)
            if (r0 != r1) goto L_0x0366
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121115m()
            if (r0 == 0) goto L_0x0366
            r0 = r38
            fy.d r0 = (p154fy.C87119d) r0
            java.lang.String r0 = r0.mo63086V()
            java.lang.Object[] r1 = new java.lang.Object[r15]
            if (r0 != 0) goto L_0x0320
            r2 = -1
            goto L_0x0324
        L_0x0320:
            int r2 = r0.length()
        L_0x0324:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r13] = r2
            java.lang.String r2 = "logout return noPwdTicket[%s]"
            r3 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x033e
            java.lang.String r1 = "no pwd ticket is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
        L_0x033e:
            java.lang.String r1 = eb0.C75592q0.m90789s()
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r13] = r1
            java.lang.String r4 = "logout return username[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            eb0.t5 r2 = eb0.C75593t5.f222075c
            java.lang.String r3 = "last_logout_no_pwd_ticket"
            r2.mo105946i(r1, r3, r0)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r8.f248994o
            if (r0 == 0) goto L_0x0366
            boolean r0 = r0.stopped()
            if (r0 != 0) goto L_0x0366
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r8.f248994o
            r0.stopTimer()
            r34.mo118784L7()
        L_0x0366:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsSwitchAccountUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.SettingsSwitchAccountUI", "onStop");
        if (this.f248995p == 1) {
            this.f248987e.getClass();
        }
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(281, this);
        C86709a0.m107524d().mo123470p(282, this);
        C86709a0.m107524d().mo123470p(255, this);
    }
}
