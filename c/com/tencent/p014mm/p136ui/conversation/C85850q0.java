package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.pluginsdk.platformtools.C30689g;
import com.tencent.p014mm.pluginsdk.platformtools.C6666h;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import h81.C32735h;
import java.util.HashMap;
import java.util.LinkedList;
import ke3.C88144b;
import m13.C88689b;
import nd3.C47223a;
import nj3.C76879j;
import p1054vg.C102189h;
import p1054vg.C90793a;
import p159gw.C45962f;
import p271xn.C91294h;
import p271xn.C91295i;
import p271xn.C91298n;
import qe3.C89623b0;
import qe3.C89625d;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import s72.C90149c;
import sf0.C90188n0;
import te3.rg4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.q0 */
public class C85850q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ rg4 f250064d;

    /* renamed from: e */
    public final /* synthetic */ InitHelper f250065e;

    /* renamed from: com.tencent.mm.ui.conversation.q0$a */
    public class C85851a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f250066d;

        /* renamed from: com.tencent.mm.ui.conversation.q0$a$a */
        public class C85852a implements DialogInterface.OnClickListener {
            public C85852a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C85850q0 q0Var = C85850q0.this;
                ((C45962f) C86312j.m106911c(C45962f.class)).go0(q0Var.f250065e.f219447o, q0Var.f250064d.f259797e, (C47223a) null, false);
                if (C85850q0.this.f250064d.f259809t != 4) {
                    C115669n.INSTANCE.idkeyStat(614, 50, 1, false);
                } else {
                    ((C91298n) C86312j.m106911c(C91298n.class)).mo125101Bm(123);
                    C115669n.INSTANCE.idkeyStat(614, 123, 1, false);
                }
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.q0$a$b */
        public class C85853b implements DialogInterface.OnClickListener {
            public C85853b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Class cls = C88689b.class;
                if (C85850q0.this.f250064d.f259809t != 4) {
                    C115669n.INSTANCE.idkeyStat(614, 57, 1, false);
                } else {
                    ((C91298n) C86312j.m106911c(C91298n.class)).mo125101Bm(122);
                    C115669n.INSTANCE.idkeyStat(614, 122, 1, false);
                }
                dialogInterface.dismiss();
                if (((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
                    ((C88689b) C86312j.m106911c(cls)).mo122755gw(C85850q0.this.f250064d.f259808s);
                }
            }
        }

        public C85851a(boolean z) {
            this.f250066d = z;
        }

        public void run() {
            Class cls = C91298n.class;
            Class cls2 = C91295i.class;
            Class cls3 = C88689b.class;
            C77398g gVar = C85850q0.this.f250065e.f219439d;
            if (gVar == null || !gVar.isShowing()) {
                rg4 rg4 = C85850q0.this.f250064d;
                if (rg4.f259810u == 1) {
                    if (rg4.f259809t == 4) {
                        ((C91295i) C86312j.m106911c(cls2)).Ek0("mmdiff_apk_has_ready", 0, C85850q0.this.f250064d.f259809t);
                        ((C91298n) C86312j.m106911c(cls)).mo125101Bm(121);
                        C115669n.INSTANCE.idkeyStat(614, 121, 1, false);
                    } else {
                        ((C91295i) C86312j.m106911c(cls2)).Ek0("mmdiff_apk_has_ready", 0, C85850q0.this.f250064d.f259809t);
                        ((C91298n) C86312j.m106911c(cls)).mo125101Bm(60);
                        C115669n.INSTANCE.idkeyStat(614, 60, 1, false);
                    }
                }
                if (!this.f250066d) {
                    rg4 rg42 = C85850q0.this.f250064d;
                    if (rg42.f259812w != 1) {
                        if (rg42.f259811v == 1) {
                            int i = rg42.f259809t;
                            if (i == 4 || i == 3) {
                                if (((C88689b) C86312j.m106911c(cls3)).mo122748eJ()) {
                                    ((C88689b) C86312j.m106911c(cls3)).mo122769xu(C85850q0.this.f250064d.f259808s);
                                }
                            } else if (((C88689b) C86312j.m106911c(cls3)).mo122748eJ()) {
                                ((C88689b) C86312j.m106911c(cls3)).mo122755gw(C85850q0.this.f250064d.f259808s);
                            }
                        }
                        C30689g.m39152a();
                        return;
                    }
                }
                C85850q0 q0Var = C85850q0.this;
                InitHelper initHelper = q0Var.f250065e;
                Activity activity = initHelper.f219447o;
                rg4 rg43 = q0Var.f250064d;
                initHelper.f219439d = C76879j.m92709C(activity, rg43.f259802j, rg43.f259801i, rg43.f259803n, rg43.f259804o, false, new C85852a(), new C85853b());
                C30689g.m39152a();
                return;
            }
            Log.m105924i("MicroMsg.InitHelper", "update dialog is showing.");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.q0$b */
    public class C85854b implements Runnable {

        /* renamed from: com.tencent.mm.ui.conversation.q0$b$a */
        public class C85855a implements C47883u {
            public C85855a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                Log.m105925i("MicroMsg.InitHelper", "onDialogClick %s", Boolean.valueOf(z));
                if (z) {
                    C85850q0 q0Var = C85850q0.this;
                    InitHelper initHelper = q0Var.f250065e;
                    int i = q0Var.f250064d.f259808s;
                    initHelper.getClass();
                    String string = MMApplicationContext.getContext().getString(C0966R.string.k7p, new Object[]{LocaleUtil.getApplicationLanguage(), Integer.valueOf(i), 1});
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", string);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    C115669n.INSTANCE.idkeyStat(1429, 28, 1, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.q0$b$b */
        public class C85856b implements DialogInterface.OnDismissListener {
            public C85856b() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                ((C88689b) C86312j.m106911c(C88689b.class)).mo122755gw(C85850q0.this.f250064d.f259808s);
                C115669n.INSTANCE.idkeyStat(1429, 29, 1, false);
            }
        }

        public C85854b() {
        }

        public void run() {
            C77398g gVar = C85850q0.this.f250065e.f219439d;
            if (gVar == null || !gVar.isShowing()) {
                Log.m105924i("MicroMsg.InitHelper", "show update dialog");
                C115669n.INSTANCE.idkeyStat(1429, 27, 1, false);
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.k7q));
                qVar.mo107601m(C0966R.string.k7e);
                qVar.mo107589a(true);
                qVar.mo107590b(new C85855a());
                qVar.mo107593e(new C85856b());
                qVar.mo107603o();
                C85850q0.this.f250065e.f219439d = qVar.f225839c;
                C30689g.m39152a();
                return;
            }
            Log.m105924i("MicroMsg.InitHelper", "update dialog is showing.");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.q0$c */
    public class C85857c implements Runnable {
        public C85857c() {
        }

        public void run() {
            C81039e eVar;
            String[] strArr;
            rg4 rg4 = C85850q0.this.f250064d;
            Log.m105925i("MicroMsg.InitHelper", "path:%s,apkMd5:%s", rg4.f259797e, rg4.f259799g);
            try {
                eVar = C97625j3.m125815e().f256809d.mo55443A3();
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.InitHelper", th, "", new Object[0]);
                eVar = null;
            }
            if (eVar != null) {
                String str = C85850q0.this.f250064d.f259805p;
                String substring = str.substring(0, str.lastIndexOf(47) + 1);
                String str2 = C85850q0.this.f250064d.f259805p;
                String substring2 = str2.substring(str2.lastIndexOf(47) + 1);
                C102189h hVar = new C102189h(substring, C85850q0.this.f250064d.f259807r);
                rg4 rg42 = C85850q0.this.f250064d;
                String str3 = rg42.f259800h;
                ((HashMap) hVar.f300887b).put(str3, new C102189h.C90802a(str3, rg42.f259799g, rg42.f259806q, substring2, rg42.f259798f));
                Intent intent = new Intent();
                String str4 = C90188n0.f258939g;
                if (str4 == null || str4.length() <= 0) {
                    String string = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
                    if (string == null || string.length() <= 0) {
                        string = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
                    }
                    LinkedList linkedList = (LinkedList) C89623b0.m112055d(string);
                    String[] strArr2 = new String[linkedList.size()];
                    for (int i = 0; i < linkedList.size(); i++) {
                        strArr2[i] = ((C89623b0) linkedList.get(i)).f257830c;
                    }
                    strArr = strArr2;
                } else {
                    strArr = new String[]{C90188n0.f258939g};
                }
                intent.putExtra("intent_short_ips", strArr);
                intent.putExtra("intent_client_version", C89625d.f257841g);
                intent.putExtra("intent_extra_session", eVar.mo55421S(1));
                intent.putExtra("intent_extra_cookie", eVar.getCookie());
                intent.putExtra("intent_extra_ecdhkey", eVar.mo55415D());
                intent.putExtra("intent_extra_uin", eVar.getUin());
                intent.putExtra("intent_update_type", 3);
                intent.putExtra("intent_extra_desc", C85850q0.this.f250064d.f259802j);
                intent.putExtra("intent_extra_md5", C85850q0.this.f250064d.f259806q);
                intent.putExtra("intent_extra_size", C85850q0.this.f250064d.f259798f);
                intent.putExtra("intent_extra_download_url", new String[]{C85850q0.this.f250064d.f259805p});
                intent.putExtra("intent_extra_patchInfo", hVar.mo141733c());
                intent.putExtra("intent_extra_updateMode", ChannelUtil.updateMode);
                intent.putExtra("intent_extra_marketUrl", ChannelUtil.marketURL);
                intent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
                intent.putExtra("intent_extra_tinker_patch", true);
                intent.putExtra("intent_extra_download_mode", 1);
                ((SubCoreSandBox) C90149c.f258834a).mo118744c(C85850q0.this.f250065e.f219447o, intent);
                C30689g.m39152a();
            }
        }
    }

    public C85850q0(InitHelper initHelper, rg4 rg4) {
        this.f250065e = initHelper;
        this.f250064d = rg4;
    }

    public void run() {
        rg4 rg4;
        Class cls = C88689b.class;
        Class cls2 = C32735h.class;
        boolean Xq0 = ((C88689b) C86312j.m106911c(cls)).Xq0(this.f250064d);
        if (Xq0) {
            Log.m105925i("MicroMsg.InitHelper", "checkTinkerBoostInstall, isApkHasUpdateIndialogInfo = %s.", Boolean.valueOf(Xq0));
            return;
        }
        String a = C6666h.m6946a(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.InitHelper", "checkTinkerBoostInstall, oldApkMd5 = %s.", a);
        rg4 rg42 = this.f250064d;
        if ((rg42 != null && rg42.f259800h.equalsIgnoreCase(a)) || ((rg4 = this.f250064d) != null && rg4.f259809t == 4)) {
            InitHelper initHelper = this.f250065e;
            int i = this.f250064d.f259809t;
            initHelper.getClass();
            Log.m105925i("MicroMsg.InitHelper", "isPatch = %s", Boolean.valueOf(i == 2 || i == 3 || i == 4));
            rg4 rg43 = this.f250064d;
            if (rg43.f259810u == 0 && rg43.f259811v == 0 && rg43.f259812w == 0) {
                rg43.f259810u = 1;
                rg43.f259811v = 1;
            }
            if (!C86013q1.m106450k(rg43.f259797e) || !C90793a.m113860a(this.f250064d.f259797e)) {
                String valueOf = String.valueOf(this.f250064d.f259807r);
                boolean z = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_upgrade_allow_no_alpha_version_install, 1) == 1;
                boolean YR = ((C91294h) C86312j.m106911c(C91294h.class)).mo125093YR(valueOf);
                Log.m105925i("MicroMsg.InitHelper", "checkTinkerBoostInstall, isAlphaVersion = %s, isForceAllowNoAlphaVersionInstall = %s.", Boolean.valueOf(YR), Boolean.valueOf(z));
                if (!YR && z) {
                    return;
                }
                if (((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C85854b());
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(new C85857c());
                }
            } else {
                boolean z2 = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_update_patch_dialog_can_show_flag, 0) == 1;
                Log.m105925i("MicroMsg.InitHelper", "showUpdateDilaog = %s, currentVersion = %s, dialogInfo.isShowDialog = %s, dialogInfo.isShowNotification = %s.", Boolean.valueOf(z2), Integer.valueOf(C89625d.f257841g), Integer.valueOf(this.f250064d.f259812w), Integer.valueOf(this.f250064d.f259810u));
                ((C119157j) C119157j.f356862d).mo183895z(new C85851a(z2));
            }
        }
    }
}
