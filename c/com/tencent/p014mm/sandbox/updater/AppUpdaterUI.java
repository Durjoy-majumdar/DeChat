package com.tencent.p014mm.sandbox.updater;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sandbox.monitor.C85706i;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.service.C116024c;
import com.tencent.xweb.IXWebPreferences;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p1054vg.C102189h;
import p1054vg.C90793a;
import p206nj.C88956h;
import qo3.C77389a;
import qo3.C77398g;
import rg3.C36325c;
import tg3.C90461a0;
import tg3.C90471e;
import tg3.C90472f;
import tg3.C90473g;
import tg3.C90476j;
import tg3.C90477k;
import tg3.C90478l;
import tg3.C90479m;
import tg3.C90480n;
import tg3.C90485q;
import tg3.C90498x;
import tg3.C90499y;

/* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI */
public class AppUpdaterUI extends MMBaseActivity {

    /* renamed from: j */
    public static AppUpdaterUI f249736j;

    /* renamed from: e */
    public C77398g f249737e = null;

    /* renamed from: f */
    public Button f249738f;

    /* renamed from: g */
    public C90461a0 f249739g;

    /* renamed from: h */
    public C90498x f249740h = new C85708a();

    /* renamed from: i */
    public DialogInterface.OnClickListener f249741i = new C85714c();

    /* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI$a */
    public class C85708a implements C90498x {

        /* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI$a$a */
        public class C85709a implements DialogInterface.OnClickListener {
            public C85709a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105918d("MicroMsg.AppUpdaterUI", "go to WebView");
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/"));
                intent.addFlags(268435456);
                AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppUpdaterUI appUpdaterUI2 = appUpdaterUI;
                C117292a.m165358d(appUpdaterUI2, aVar.mo10232b(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                appUpdaterUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appUpdaterUI2, "com/tencent/mm/sandbox/updater/AppUpdaterUI$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        /* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI$a$b */
        public class C85710b implements DialogInterface.OnClickListener {
            public C85710b(C85708a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C85708a() {
        }

        /* renamed from: a */
        public void mo119312a(int i, int i2) {
            int i3 = (int) (i <= 0 ? 0 : (((long) i2) * 100) / ((long) i));
            if (i3 == 100) {
                AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
                appUpdaterUI.f249738f.setText(appUpdaterUI.getString(C0966R.string.k74));
                return;
            }
            Button button = AppUpdaterUI.this.f249738f;
            button.setText(AppUpdaterUI.this.getString(C0966R.string.f361480k72) + i3 + "%");
        }

        /* renamed from: b */
        public void mo119313b() {
            if (!AppUpdaterUI.this.isFinishing()) {
                AppUpdaterUI.this.f249738f.setText(C0966R.string.f361480k72);
                AppUpdaterUI.this.f249738f.setEnabled(false);
            }
        }

        /* renamed from: c */
        public void mo119314c(String str) {
            C77398g gVar = AppUpdaterUI.this.f249737e;
            if (gVar != null) {
                gVar.dismiss();
            }
            if (!AppUpdaterUI.this.isFinishing()) {
                Log.m105918d("MicroMsg.AppUpdaterUI", str);
                if (str != null) {
                    AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
                    appUpdaterUI.getClass();
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(405, 70, 1, true);
                    if (appUpdaterUI.f249739g.f260009u) {
                        nVar.idkeyStat(614, 50, 1, false);
                    }
                    new MMHandler().postDelayed(new C90477k(appUpdaterUI, str), 300);
                    AppUpdaterUI.this.f249738f.setEnabled(false);
                }
            }
        }

        /* renamed from: e */
        public void mo119315e() {
            C77398g gVar = AppUpdaterUI.this.f249737e;
            if (gVar != null) {
                gVar.dismiss();
            }
            if (!AppUpdaterUI.this.isFinishing()) {
                AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
                appUpdaterUI.getClass();
                Log.m105918d("MicroMsg.AppUpdaterUI", "showSDCardFullAlert");
                C115669n.INSTANCE.idkeyStat(405, 66, 1, true);
                C76879j.m92713G(appUpdaterUI, appUpdaterUI.getString(C0966R.string.k78), appUpdaterUI.getString(C0966R.string.a3h), true, new C90480n(appUpdaterUI)).setOnCancelListener(new C90471e(appUpdaterUI));
            }
        }

        /* renamed from: f */
        public void mo119316f(C85705h hVar) {
            if (!AppUpdaterUI.this.isFinishing()) {
                if (hVar instanceof C90485q) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(405, 67, 1, true);
                    Log.m105920e("MicroMsg.AppUpdaterUI", "download package from cdn error. switch to webserver");
                    AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
                    C77398g gVar = appUpdaterUI.f249737e;
                    if (gVar != null) {
                        gVar.mo107533r(appUpdaterUI.getString(C0966R.string.f0l, new Object[]{appUpdaterUI.f249739g.f259997i, appUpdaterUI.getString(C0966R.string.k6z), Util.getSizeKB((long) AppUpdaterUI.this.f249739g.f260000l)}));
                    }
                    if (AppUpdaterUI.this.f249739g.f260004p) {
                        nVar.idkeyStat(405, 68, 1, true);
                        AppUpdaterUI appUpdaterUI2 = AppUpdaterUI.this;
                        appUpdaterUI2.getClass();
                        Log.m105918d("MicroMsg.AppUpdaterUI", "showDownloadFullPackAlert()");
                        C77398g G = C76879j.m92713G(appUpdaterUI2, appUpdaterUI2.getString(C0966R.string.f0k, new Object[]{Util.getSizeKB((long) appUpdaterUI2.f249739g.f260000l)}), appUpdaterUI2.getString(C0966R.string.a3h), true, new C90478l(appUpdaterUI2, hVar));
                        G.setOnCancelListener(new C90479m(appUpdaterUI2));
                        G.setCanceledOnTouchOutside(false);
                        return;
                    }
                    return;
                }
                C115669n.INSTANCE.idkeyStat(405, 69, 1, true);
                C76879j.m92743n(AppUpdaterUI.this, C0966R.string.f361478k70, C0966R.string.a3h, new C85709a(), new C85710b(this));
            }
        }

        /* renamed from: g */
        public void mo119317g() {
            Log.m105920e("MicroMsg.AppUpdaterUI", "no sdcard.");
            C77398g gVar = AppUpdaterUI.this.f249737e;
            if (gVar != null) {
                gVar.dismiss();
            }
            if (!AppUpdaterUI.this.isFinishing()) {
                AppUpdaterUI.m105872F7(AppUpdaterUI.this);
            }
        }
    }

    /* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI$b */
    public class C85711b implements Runnable {

        /* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI$b$a */
        public class C85712a implements DialogInterface.OnClickListener {
            public C85712a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(AppUpdaterUI.this.f249739g.f260001m[0]));
                intent.addFlags(268435456);
                Context context = MMApplicationContext.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$2$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/sandbox/updater/AppUpdaterUI$2$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                AppUpdaterUI.this.mo119311H7();
            }
        }

        /* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI$b$b */
        public class C85713b implements DialogInterface.OnCancelListener {
            public C85713b() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
                AppUpdaterUI appUpdaterUI2 = AppUpdaterUI.f249736j;
                appUpdaterUI.mo119311H7();
            }
        }

        public C85711b() {
        }

        public void run() {
            AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
            C76879j.m92713G(appUpdaterUI, appUpdaterUI.f249739g.f259997i, appUpdaterUI.getString(C0966R.string.a3h), true, new C85712a()).setOnCancelListener(new C85713b());
        }
    }

    /* renamed from: com.tencent.mm.sandbox.updater.AppUpdaterUI$c */
    public class C85714c implements DialogInterface.OnClickListener {
        public C85714c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C102189h.C90802a aVar;
            Log.m105918d("MicroMsg.AppUpdaterUI", "getBtn (ok button) is click");
            AppUpdaterUI appUpdaterUI = AppUpdaterUI.this;
            if (appUpdaterUI.f249739g.f260006r == 1) {
                C90499y.m113322h(appUpdaterUI, 6, 0);
            }
            if (!C88956h.m111062c().equals("mounted")) {
                Log.m105920e("MicroMsg.AppUpdaterUI", "no sdcard.");
                AppUpdaterUI.this.f249737e.dismiss();
                AppUpdaterUI.m105872F7(AppUpdaterUI.this);
                return;
            }
            C90461a0 a0Var = AppUpdaterUI.this.f249739g;
            if ((a0Var.f260010v & 1) != 0) {
                Log.m105920e("MicroMsg.AppUpdaterUI", "package has set external update mode");
                Uri parse = Uri.parse(AppUpdaterUI.this.f249739g.f260011w);
                Intent addFlags = new Intent("android.intent.action.VIEW", parse).addFlags(268435456);
                if (parse == null || addFlags == null || !Util.isIntentAvailable(AppUpdaterUI.this, addFlags, false)) {
                    Log.m105920e("MicroMsg.AppUpdaterUI", "parse market uri failed, jump to weixin.qq.com");
                    Intent addFlags2 = new Intent("android.intent.action.VIEW", Uri.parse(C74928u.f220308a)).addFlags(268435456);
                    try {
                        AppUpdaterUI appUpdaterUI2 = AppUpdaterUI.this;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(addFlags2);
                        C117292a.m165358d(appUpdaterUI2, aVar2.mo10232b(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        appUpdaterUI2.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(appUpdaterUI2, "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.AppUpdaterUI", e, "", new Object[0]);
                    }
                } else {
                    Log.m105924i("MicroMsg.AppUpdaterUI", "parse market uri ok");
                    try {
                        AppUpdaterUI appUpdaterUI3 = AppUpdaterUI.this;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(addFlags);
                        C117292a.m165358d(appUpdaterUI3, aVar3.mo10232b(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        appUpdaterUI3.startActivity((Intent) aVar3.mo10231a(0));
                        C117292a.m165359e(appUpdaterUI3, "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.AppUpdaterUI", e2, "", new Object[0]);
                    }
                }
                AppUpdaterUI.this.mo119311H7();
                return;
            }
            String e3 = C85705h.m105861e(a0Var.f259998j, a0Var.f260009u);
            if (Util.isNullOrNil(e3) && (aVar = AppUpdaterUI.this.f249739g.f260003o) != null) {
                e3 = C85705h.f249722f + aVar.f260743b + ".apk";
                if (!C85706i.m105867c(e3) || !C90793a.m113860a(e3)) {
                    e3 = null;
                }
            }
            Log.m105918d("MicroMsg.AppUpdaterUI", e3);
            if (e3 != null) {
                Log.m105924i("MicroMsg.AppUpdaterUI", "update package already exist.");
                AppUpdaterUI.m105873G7(AppUpdaterUI.this, 8);
                AppUpdaterUI appUpdaterUI4 = AppUpdaterUI.this;
                if (appUpdaterUI4.f249739g.f260004p) {
                    AppUpdaterUI.m105873G7(appUpdaterUI4, 0);
                } else {
                    AppUpdaterUI.m105873G7(appUpdaterUI4, 9);
                }
                AppUpdaterUI.this.f249739g.mo124631k(1, true);
                ((C85708a) AppUpdaterUI.this.f249740h).mo119314c(e3);
                return;
            }
            Log.m105919d("MicroMsg.AppUpdaterUI", "current downloadMode : %s", Integer.valueOf(AppUpdaterUI.this.f249739g.f260006r));
            Log.m105919d("MicroMsg.AppUpdaterUI", "current updateType : %s", Integer.valueOf(AppUpdaterUI.this.f249739g.f259992d));
            C90461a0 a0Var2 = AppUpdaterUI.this.f249739g;
            int i2 = a0Var2.f260006r;
            if (i2 == 0) {
                a0Var2.mo124632l(false);
            } else if (i2 == 1) {
                Log.m105918d("MicroMsg.AppUpdaterUI", "gonna start UpdaterService");
                AppUpdaterUI.this.mo119311H7();
                Intent intent = new Intent(AppUpdaterUI.this.getIntent());
                intent.setClass(AppUpdaterUI.this, UpdaterService.class);
                intent.putExtra("intent_extra_run_in_foreground", true);
                C116024c.m163164d(intent, IXWebPreferences.XWEB_RENDERER_SANDBOX, true, C88144b.m109786e(IXWebPreferences.XWEB_RENDERER_SANDBOX));
                if (AppUpdaterUI.this.f249739g.f260009u) {
                    C115669n.INSTANCE.idkeyStat(614, 56, 1, false);
                    Log.m105918d("MicroMsg.AppUpdaterUI", "boots download start.");
                }
            } else {
                Log.m105920e("MicroMsg.AppUpdaterUI", "silence download never go here!");
            }
        }
    }

    /* renamed from: E7 */
    public static void m105871E7(AppUpdaterUI appUpdaterUI, int i) {
        appUpdaterUI.f249739g.mo124630j();
        appUpdaterUI.f249739g.mo124631k(i, true);
        appUpdaterUI.mo119311H7();
    }

    /* renamed from: F7 */
    public static void m105872F7(AppUpdaterUI appUpdaterUI) {
        appUpdaterUI.getClass();
        Log.m105918d("MicroMsg.AppUpdaterUI", "showNoSDCardAlert");
        C115669n.INSTANCE.idkeyStat(405, 65, 1, true);
        C76879j.m92713G(appUpdaterUI, appUpdaterUI.getString(C0966R.string.k75), appUpdaterUI.getString(C0966R.string.a3h), true, new C90472f(appUpdaterUI)).setOnCancelListener(new C90473g(appUpdaterUI));
    }

    /* renamed from: G7 */
    public static void m105873G7(AppUpdaterUI appUpdaterUI, int i) {
        appUpdaterUI.getClass();
        C90499y.m113323i(appUpdaterUI, i);
    }

    /* renamed from: H7 */
    public final void mo119311H7() {
        C77398g gVar = this.f249737e;
        if (gVar != null && gVar.isShowing()) {
            this.f249737e.dismiss();
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String[] strArr;
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.AppUpdaterUI", "onCreate");
        C36325c.m40947a(hashCode(), this);
        MMActivity.initLanguage(this);
        AppInstallerUI appInstallerUI = AppInstallerUI.f249728n;
        if (appInstallerUI == null || appInstallerUI.isFinishing()) {
            AppUpdaterUI appUpdaterUI = f249736j;
            if (appUpdaterUI == null || appUpdaterUI.isFinishing() || f249736j == this) {
                f249736j = this;
                setContentView(C0966R.C0971layout.a3c);
                C90461a0 a0Var = C90461a0.C90464c.f260018a;
                this.f249739g = a0Var;
                if (!a0Var.mo124634n(getIntent())) {
                    Log.m105920e("MicroMsg.AppUpdaterUI", "updaterManager.handleCommand return false");
                    mo119311H7();
                    return;
                }
                C90461a0 a0Var2 = this.f249739g;
                if (a0Var2.f259992d != 999 || (strArr = a0Var2.f260001m) == null || strArr.length <= 0) {
                    Log.m105918d("MicroMsg.AppUpdaterUI", "showUpdateDlg, downloadUrls = " + this.f249739g.f260001m);
                    C77389a aVar = new C77389a();
                    aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.f0j);
                    aVar.f225668y = true;
                    aVar.f225622E = new C90476j(this);
                    C90461a0 a0Var3 = this.f249739g;
                    if (!a0Var3.f260004p || a0Var3.f260003o == null) {
                        Log.m105918d("MicroMsg.AppUpdaterUI", "had try to download full pack.");
                        str = getString(C0966R.string.f0l, new Object[]{this.f249739g.f259997i, getString(C0966R.string.k6z), Util.getSizeKB((long) this.f249739g.f260000l)});
                    } else {
                        str = getString(C0966R.string.f0l, new Object[]{a0Var3.f259997i, getString(C0966R.string.f361481k73), Util.getSizeKB((long) this.f249739g.f260003o.f260746e)});
                    }
                    int i = this.f249739g.f259992d != 1 ? C0966R.string.k6v : C0966R.string.k6y;
                    aVar.f225660q = str;
                    aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.k77);
                    aVar.f225620C = this.f249741i;
                    aVar.f225641X = false;
                    aVar.f225664u = C0086a.m38a(this).getString(i);
                    C77398g gVar = new C77398g(this, C0966R.style.a66);
                    gVar.mo107525e(aVar);
                    this.f249737e = gVar;
                    gVar.setCanceledOnTouchOutside(false);
                    this.f249738f = this.f249737e.mo107526f(-1);
                    this.f249737e.getClass();
                    this.f249737e.show();
                    if (this.f249739g.f260006r == 1) {
                        C90499y.m113322h(this, 5, 0);
                    }
                    if (this.f249739g.f260009u) {
                        C115669n.INSTANCE.idkeyStat(614, 60, 1, false);
                    }
                    C90461a0 a0Var4 = this.f249739g;
                    C90498x xVar = this.f249740h;
                    if (xVar == null) {
                        a0Var4.getClass();
                    } else if (!a0Var4.f259990b.contains(xVar)) {
                        a0Var4.f259990b.add(xVar);
                    }
                } else {
                    Log.m105918d("MicroMsg.AppUpdaterUI", "into emergency status");
                    new MMHandler().postDelayed(new C85711b(), 100);
                }
            } else {
                Log.m105918d("MicroMsg.AppUpdaterUI", "duplicate instance, finish self");
                Log.m105918d("MicroMsg.AppUpdaterUI", "we already got one instance, does it gonna leak?");
                finish();
            }
        } else {
            Log.m105918d("MicroMsg.AppUpdaterUI", "AppInstallerUI is there, finish self");
            finish();
        }
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.AppUpdaterUI", "onDestroy");
        C36325c.m40948b(hashCode(), this);
        C90461a0 a0Var = this.f249739g;
        if (a0Var != null) {
            a0Var.f259990b.remove(this.f249740h);
        }
        if (f249736j == this) {
            f249736j = null;
        }
        super.onDestroy();
    }
}
