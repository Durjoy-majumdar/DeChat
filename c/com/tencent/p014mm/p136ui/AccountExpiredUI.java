package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.BackupCoreResetEvent;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AccountExpiredActionStruct;
import com.tencent.p014mm.plugin.account.p024ui.C1468a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.Map;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import p148ei.C7660a;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.AccountExpiredUI */
public class AccountExpiredUI extends MMActivity {

    /* renamed from: d */
    public int f214129d;

    /* renamed from: e */
    public int f214130e;

    /* renamed from: f */
    public String f214131f;

    /* renamed from: com.tencent.mm.ui.AccountExpiredUI$a */
    public class C72997a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7660a f214132d;

        /* renamed from: e */
        public final /* synthetic */ Intent f214133e;

        public C72997a(C7660a aVar, Intent intent) {
            this.f214132d = aVar;
            this.f214133e = intent;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!Util.isNullOrNil(this.f214132d.f26000a)) {
                Intent intent = new Intent();
                StringBuilder sb = new StringBuilder(this.f214132d.f26000a);
                sb.append("&wechat_real_lang=" + LocaleUtil.getApplicationLanguage());
                intent.putExtra("rawUrl", sb.toString());
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", true);
                intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                C88144b.m109791i(AccountExpiredUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C88990b.m111198g(AccountExpiredUI.this);
            } else {
                AccountExpiredUI accountExpiredUI = AccountExpiredUI.this;
                Intent intent2 = this.f214133e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(accountExpiredUI, aVar.mo10232b(), "com/tencent/mm/ui/AccountExpiredUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                accountExpiredUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(accountExpiredUI, "com/tencent/mm/ui/AccountExpiredUI$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C88990b.m111198g(AccountExpiredUI.this);
            }
            AccountExpiredUI.this.finish();
            BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
            backupProcessMgrExitEvent.f78724d.f78725a = true;
            backupProcessMgrExitEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AccountExpiredUI$b */
    public class C72998b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f214135d;

        public C72998b(Intent intent) {
            this.f214135d = intent;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AccountExpiredUI accountExpiredUI = AccountExpiredUI.this;
            Intent intent = this.f214135d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AccountExpiredUI accountExpiredUI2 = accountExpiredUI;
            C117292a.m165358d(accountExpiredUI2, aVar.mo10232b(), "com/tencent/mm/ui/AccountExpiredUI$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            accountExpiredUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(accountExpiredUI2, "com/tencent/mm/ui/AccountExpiredUI$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111198g(AccountExpiredUI.this);
            AccountExpiredUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AccountExpiredUI$c */
    public class C72999c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f214137d;

        public C72999c(Intent intent) {
            this.f214137d = intent;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AccountExpiredUI accountExpiredUI = AccountExpiredUI.this;
            Intent intent = this.f214137d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AccountExpiredUI accountExpiredUI2 = accountExpiredUI;
            C117292a.m165358d(accountExpiredUI2, aVar.mo10232b(), "com/tencent/mm/ui/AccountExpiredUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            accountExpiredUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(accountExpiredUI2, "com/tencent/mm/ui/AccountExpiredUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111198g(AccountExpiredUI.this);
            AccountExpiredUI.this.finish();
            BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
            backupProcessMgrExitEvent.f78724d.f78725a = true;
            backupProcessMgrExitEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.AccountExpiredUI$d */
    public class C73000d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f214139d;

        public C73000d(Intent intent) {
            this.f214139d = intent;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AccountExpiredUI accountExpiredUI = AccountExpiredUI.this;
            Intent intent = this.f214139d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(accountExpiredUI, aVar.mo10232b(), "com/tencent/mm/ui/AccountExpiredUI$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            accountExpiredUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(accountExpiredUI, "com/tencent/mm/ui/AccountExpiredUI$4", "onCancel", "(Landroid/content/DialogInterface;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111198g(AccountExpiredUI.this);
            AccountExpiredUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo101244H7() {
        Map<String, String> parseXml;
        Log.m105924i("MicroMsg.AccountExpiredUI", "errType = " + this.f214129d + " errCode = " + this.f214130e + " errMsg = " + this.f214131f);
        if (C1468a.m1501b(4, this.f214130e)) {
            Intent intent = new Intent();
            intent.setClass(this, LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864);
            C86709a0.m107528h();
            C86709a0.m107523b();
            String str = C86718e.f251747w;
            Log.m105920e("MicroMsg.AccountExpiredUI", "account expired=" + this.f214130e + " lastKickReason=" + str);
            new BackupCoreResetEvent().publish();
            C86718e.m107550n();
            LogoutEvent logoutEvent = new LogoutEvent();
            LogoutEvent.C28774a aVar = logoutEvent.f78863d;
            aVar.getClass();
            aVar.f78864a = 1;
            logoutEvent.publish();
            MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
            int i = this.f214130e;
            if (i == -2023) {
                C115669n.INSTANCE.idkeyStat(1582, 0, 1, false);
            } else if (i == -205) {
                C115669n.INSTANCE.idkeyStat(1582, 5, 1, false);
            } else if (i == -100) {
                C115669n.INSTANCE.idkeyStat(1582, 1, 1, false);
            } else if (i == -72) {
                C115669n.INSTANCE.idkeyStat(1582, 6, 1, false);
            } else if (i == -9) {
                C115669n.INSTANCE.idkeyStat(1582, 4, 1, false);
            } else if (i == -4) {
                C115669n.INSTANCE.idkeyStat(1582, 3, 1, false);
            } else if (i == -3) {
                C115669n.INSTANCE.idkeyStat(1582, 2, 1, false);
            }
            if (!Util.isNullOrNil(str)) {
                if (str != null && str.length() > 1024) {
                    str.substring(0, 1024);
                }
                mo101245I7(this.f214129d, this.f214130e, this.f214131f, str);
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    Log.m105925i("MicroMsg.AccountExpiredUI", "account expired br showType[%d]", Integer.valueOf(a.f26002c));
                    int i2 = a.f26002c;
                    if (i2 == 3 || i2 == 4) {
                        a.mo8792b(this, new C72997a(a, intent), new C72998b(intent));
                        return;
                    }
                    intent.putExtra("key_errType", this.f214129d);
                    intent.putExtra("key_errCode", this.f214130e);
                    intent.putExtra("key_errMsg", str);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/ui/AccountExpiredUI", "handleExpired", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/AccountExpiredUI", "handleExpired", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C88990b.m111198g(this);
                    finish();
                    return;
                } else if (str.startsWith("<") && (parseXml = XmlParser.parseXml(str, "e", (String) null)) != null && !Util.isNullOrNil(parseXml.get(".e.Content"))) {
                    str = parseXml.get(".e.Content");
                    Log.m105924i("MicroMsg.AccountExpiredUI", "account expired summerauthkick errmsg=" + str + " |v=" + parseXml);
                }
            } else {
                mo101245I7(this.f214129d, this.f214130e, this.f214131f, "empty!");
            }
            Log.m105925i("MicroMsg.AccountExpiredUI", "account expired lastKickReason[%s]", str);
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.gmc);
            }
            C76879j.m92719M(this, str, getString(C0966R.string.a3h), new C72999c(intent), new C73000d(intent));
            Log.m105924i("MicroMsg.AccountExpiredUI", "show kickout dialog by old logic.");
            return;
        }
        Log.m105924i("MicroMsg.AccountExpiredUI", "errCode not  -100, quit");
        finish();
    }

    /* renamed from: I7 */
    public final void mo101245I7(int i, int i2, String str, String str2) {
        AccountExpiredActionStruct accountExpiredActionStruct = new AccountExpiredActionStruct();
        accountExpiredActionStruct.f194111e = (long) i2;
        accountExpiredActionStruct.f194110d = (long) i;
        accountExpiredActionStruct.f194112f = accountExpiredActionStruct.mo86045b("errMsg", str, true);
        accountExpiredActionStruct.f194113g = accountExpiredActionStruct.mo86045b("lastKickReason", str2, true);
        accountExpiredActionStruct.mo86054n();
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
        this.f214129d = getIntent().getIntExtra("key_errType", 0);
        this.f214130e = getIntent().getIntExtra("key_errCode", 0);
        this.f214131f = getIntent().getStringExtra("key_errMsg");
        if (this.f214129d != 4) {
            Log.m105924i("MicroMsg.AccountExpiredUI", "finish, errType = " + this.f214129d + " errCode = " + this.f214130e + " errMsg = " + this.f214131f);
            finish();
        }
        try {
            mo101244H7();
        } catch (Exception unused) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onPointerCaptureChanged(boolean z) {
    }
}
