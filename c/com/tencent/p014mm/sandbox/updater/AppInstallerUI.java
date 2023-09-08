package com.tencent.p014mm.sandbox.updater;

import al3.C0086a;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;
import qo3.C77389a;
import qo3.C77398g;
import rg3.C36325c;
import tg3.C90460a;
import tg3.C90461a0;
import tg3.C90465b;
import tg3.C90499y;

/* renamed from: com.tencent.mm.sandbox.updater.AppInstallerUI */
public class AppInstallerUI extends MMBaseActivity {

    /* renamed from: n */
    public static AppInstallerUI f249728n;

    /* renamed from: e */
    public C77398g f249729e = null;

    /* renamed from: f */
    public C77398g f249730f = null;

    /* renamed from: g */
    public String f249731g;

    /* renamed from: h */
    public String f249732h;

    /* renamed from: i */
    public int f249733i;

    /* renamed from: j */
    public DialogInterface.OnClickListener f249734j = new C85707a();

    /* renamed from: com.tencent.mm.sandbox.updater.AppInstallerUI$a */
    public class C85707a implements DialogInterface.OnClickListener {
        public C85707a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.AppInstallerUI", "getBtn (ok button) is click");
            AppInstallerUI appInstallerUI = AppInstallerUI.this;
            if (appInstallerUI.f249733i == 2) {
                C90499y.m113322h(appInstallerUI, 3, 0);
            }
            String e = C85705h.m105861e(AppInstallerUI.this.f249731g, false);
            Log.m105918d("MicroMsg.AppInstallerUI", e);
            if (e != null) {
                C90461a0.C90464c.f260018a.mo124631k(1, true);
                C115669n.INSTANCE.idkeyStat(405, 72, 1, true);
                AppInstallerUI appInstallerUI2 = AppInstallerUI.this;
                appInstallerUI2.getClass();
                new MMHandler().postDelayed(new C90465b(appInstallerUI2, e), 300);
                return;
            }
            C115669n.INSTANCE.idkeyStat(405, 73, 1, true);
            Log.m105920e("MicroMsg.AppInstallerUI", "pack not found!");
            AppInstallerUI appInstallerUI3 = AppInstallerUI.this;
            C76879j.m92726T(appInstallerUI3, appInstallerUI3.getString(C0966R.string.k6x));
            C90499y.m113315a();
            AppInstallerUI.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.AppInstallerUI", "onCreate");
        C36325c.m40947a(hashCode(), this);
        MMActivity.initLanguage(this);
        AppUpdaterUI appUpdaterUI = AppUpdaterUI.f249736j;
        if (appUpdaterUI == null || appUpdaterUI.isFinishing()) {
            AppInstallerUI appInstallerUI = f249728n;
            if (appInstallerUI == null || appInstallerUI.isFinishing() || f249728n == this) {
                f249728n = this;
                String b = C90499y.m113316b();
                this.f249731g = b;
                if (Util.isNullOrNil(b) || C85705h.m105861e(this.f249731g, false) == null) {
                    finish();
                    return;
                }
                this.f249732h = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).getString("update_downloaded_pack_desc_key", (String) null);
                this.f249733i = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).getInt("update_downloaded_pack_download_mode", 0);
                setContentView(C0966R.C0971layout.a3c);
                C77389a aVar = new C77389a();
                aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.f0j);
                aVar.f225668y = true;
                aVar.f225622E = new C90460a(this);
                aVar.f225660q = getString(C0966R.string.f0m, new Object[]{this.f249732h});
                aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.frd);
                aVar.f225620C = this.f249734j;
                aVar.f225641X = false;
                aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.k6v);
                aVar.f225621D = null;
                C77398g gVar = new C77398g(this, C0966R.style.a66);
                gVar.mo107525e(aVar);
                this.f249729e = gVar;
                gVar.setCanceledOnTouchOutside(false);
                this.f249729e.show();
                C115669n.INSTANCE.idkeyStat(405, 71, 1, true);
                if (this.f249733i == 2) {
                    int i = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).getInt("update_downloaded_cancel_times", 0);
                    Log.m105925i("MicroMsg.UpdateUtil", "getIgnoreDownloadedPackTimes times %s", Integer.valueOf(i));
                    C90499y.m113322h(this, 2, i + 1);
                    return;
                }
                return;
            }
            Log.m105918d("MicroMsg.AppInstallerUI", "duplicate instance, finish self");
            finish();
            return;
        }
        Log.m105918d("MicroMsg.AppInstallerUI", "AppUpdaterUI is there, finish self");
        finish();
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.AppInstallerUI", "onDestroy");
        C77398g gVar = this.f249729e;
        if (gVar != null && gVar.isShowing()) {
            this.f249729e.dismiss();
        }
        C77398g gVar2 = this.f249730f;
        if (gVar2 != null && gVar2.isShowing()) {
            this.f249730f.dismiss();
        }
        if (f249728n == this) {
            f249728n = null;
        }
        C36325c.m40948b(hashCode(), this);
        super.onDestroy();
    }
}
