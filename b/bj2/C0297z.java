package bj2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.RepairerPatchDemoUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import ke3.C88144b;
import m13.C88689b;
import nd3.C47223a;
import nj3.C76879j;
import p1054vg.C102189h;
import p1054vg.C90793a;
import p1054vg.C90795b;
import p159gw.C45962f;
import p271xn.C15865p;
import p271xn.C91298n;
import qe3.C89623b0;
import qe3.C89625d;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import s72.C90149c;
import sf0.C90188n0;
import te3.rg4;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: bj2.z */
public final class C0297z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RepairerPatchDemoUI f865d;

    /* renamed from: e */
    public final /* synthetic */ rg4 f866e;

    /* renamed from: bj2.z$a */
    public static final class C0298a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f867d;

        /* renamed from: e */
        public final /* synthetic */ rg4 f868e;

        /* renamed from: bj2.z$a$a */
        public static final class C0299a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ RepairerPatchDemoUI f869d;

            /* renamed from: e */
            public final /* synthetic */ rg4 f870e;

            public C0299a(RepairerPatchDemoUI repairerPatchDemoUI, rg4 rg4) {
                this.f869d = repairerPatchDemoUI;
                this.f870e = rg4;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ((C45962f) C86312j.m106911c(C45962f.class)).go0(this.f869d.getContext(), this.f870e.f259797e, (C47223a) null, false);
                if (this.f870e.f259809t != 4) {
                    C115669n.INSTANCE.idkeyStat(614, 50, 1, false);
                } else {
                    ((C91298n) C86312j.m106911c(C91298n.class)).mo125101Bm(123);
                    C115669n.INSTANCE.idkeyStat(614, 123, 1, false);
                }
                dialogInterface.dismiss();
            }
        }

        /* renamed from: bj2.z$a$b */
        public static final class C0300b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ rg4 f871d;

            public C0300b(rg4 rg4) {
                this.f871d = rg4;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Class cls = C88689b.class;
                if (this.f871d.f259809t != 4) {
                    C115669n.INSTANCE.idkeyStat(614, 57, 1, false);
                } else {
                    ((C91298n) C86312j.m106911c(C91298n.class)).mo125101Bm(122);
                    C115669n.INSTANCE.idkeyStat(614, 122, 1, false);
                }
                dialogInterface.dismiss();
                if (((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
                    ((C88689b) C86312j.m106911c(cls)).mo122755gw(this.f871d.f259808s);
                }
            }
        }

        public C0298a(RepairerPatchDemoUI repairerPatchDemoUI, rg4 rg4) {
            this.f867d = repairerPatchDemoUI;
            this.f868e = rg4;
        }

        public final void run() {
            C77398g gVar = this.f867d.f20480h;
            if (gVar != null) {
                C87412m.m108591d(gVar);
                if (gVar.isShowing()) {
                    Log.m105924i(this.f867d.f20476d, "update dialog is showing.");
                    return;
                }
            }
            if (this.f868e.f259809t == 4) {
                ((C91298n) C86312j.m106911c(C91298n.class)).mo125101Bm(121);
                C115669n.INSTANCE.idkeyStat(614, 121, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(614, 60, 1, false);
            }
            RepairerPatchDemoUI repairerPatchDemoUI = this.f867d;
            AppCompatActivity context = repairerPatchDemoUI.getContext();
            rg4 rg4 = this.f868e;
            repairerPatchDemoUI.f20480h = C76879j.m92709C(context, rg4.f259802j, rg4.f259801i, rg4.f259803n, rg4.f259804o, false, new C0299a(this.f867d, rg4), new C0300b(rg4));
            ((C15865p) C86312j.m106911c(C15865p.class)).mo14315fh();
        }
    }

    /* renamed from: bj2.z$b */
    public static final class C0301b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f872d;

        /* renamed from: e */
        public final /* synthetic */ rg4 f873e;

        /* renamed from: bj2.z$b$a */
        public static final class C0302a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ RepairerPatchDemoUI f874a;

            /* renamed from: b */
            public final /* synthetic */ rg4 f875b;

            public C0302a(RepairerPatchDemoUI repairerPatchDemoUI, rg4 rg4) {
                this.f874a = repairerPatchDemoUI;
                this.f875b = rg4;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                Log.m105925i(this.f874a.f20476d, "onDialogClick %s", Boolean.valueOf(z));
                if (z) {
                    RepairerPatchDemoUI repairerPatchDemoUI = this.f874a;
                    int i = this.f875b.f259808s;
                    repairerPatchDemoUI.getClass();
                    String string = MMApplicationContext.getContext().getString(C0966R.string.k7p, new Object[]{LocaleUtil.getApplicationLanguage(), Integer.valueOf(i), 1});
                    C87412m.m108593f(string, "getContext().getString(c…uage(), clientVersion, 1)");
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", string);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    C115669n.INSTANCE.idkeyStat(1429, 28, 1, false);
                }
            }
        }

        /* renamed from: bj2.z$b$b */
        public static final class C0303b implements DialogInterface.OnDismissListener {

            /* renamed from: d */
            public final /* synthetic */ rg4 f876d;

            public C0303b(rg4 rg4) {
                this.f876d = rg4;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                ((C88689b) C86312j.m106911c(C88689b.class)).mo122755gw(this.f876d.f259808s);
                C115669n.INSTANCE.idkeyStat(1429, 29, 1, false);
            }
        }

        public C0301b(RepairerPatchDemoUI repairerPatchDemoUI, rg4 rg4) {
            this.f872d = repairerPatchDemoUI;
            this.f873e = rg4;
        }

        public final void run() {
            C77398g gVar = this.f872d.f20480h;
            if (gVar != null) {
                C87412m.m108591d(gVar);
                if (gVar.isShowing()) {
                    Log.m105924i(this.f872d.f20476d, "update dialog is showing.");
                    return;
                }
            }
            Log.m105924i(this.f872d.f20476d, "show update dialog");
            C115669n.INSTANCE.idkeyStat(1429, 27, 1, false);
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.k7q));
            qVar.mo107601m(C0966R.string.k7e);
            qVar.mo107589a(true);
            qVar.mo107590b(new C0302a(this.f872d, this.f873e));
            qVar.mo107593e(new C0303b(this.f873e));
            qVar.mo107603o();
            this.f872d.f20480h = qVar.f225839c;
            ((C15865p) C86312j.m106911c(C15865p.class)).mo14315fh();
        }
    }

    /* renamed from: bj2.z$c */
    public static final class C0304c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f877d;

        /* renamed from: e */
        public final /* synthetic */ rg4 f878e;

        public C0304c(RepairerPatchDemoUI repairerPatchDemoUI, rg4 rg4) {
            this.f877d = repairerPatchDemoUI;
            this.f878e = rg4;
        }

        public final void run() {
            C81039e eVar;
            String[] strArr;
            String str = this.f877d.f20476d;
            rg4 rg4 = this.f878e;
            Log.m105925i(str, "path:%s,apkMd5:%s", rg4.f259797e, rg4.f259799g);
            try {
                eVar = C86709a0.m107529k().f251779b.f256809d.mo55443A3();
            } catch (Throwable th) {
                Log.printErrStackTrace(this.f877d.f20476d, th, "", new Object[0]);
                eVar = null;
            }
            if (eVar != null) {
                String str2 = this.f878e.f259805p;
                C87412m.m108593f(str2, "dialogInfo.cdnUrl");
                String str3 = this.f878e.f259805p;
                C87412m.m108593f(str3, "dialogInfo.cdnUrl");
                String substring = str2.substring(0, C112550d0.m153771G(str3, XVFSFile.SEPARATOR_CHAR, 0, false, 6, (Object) null) + 1);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String str4 = this.f878e.f259805p;
                C87412m.m108593f(str4, "dialogInfo.cdnUrl");
                String str5 = this.f878e.f259805p;
                C87412m.m108593f(str5, "dialogInfo.cdnUrl");
                String substring2 = str4.substring(C112550d0.m153771G(str5, XVFSFile.SEPARATOR_CHAR, 0, false, 6, (Object) null) + 1);
                C87412m.m108593f(substring2, "this as java.lang.String).substring(startIndex)");
                C102189h hVar = new C102189h(substring, this.f878e.f259807r);
                rg4 rg42 = this.f878e;
                String str6 = rg42.f259800h;
                ((HashMap) hVar.f300887b).put(str6, new C102189h.C90802a(str6, rg42.f259799g, rg42.f259806q, substring2, rg42.f259798f));
                Intent intent = new Intent();
                this.f877d.getClass();
                String str7 = C90188n0.f258939g;
                if (str7 == null || str7.length() <= 0) {
                    String string = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
                    if (string == null || string.length() <= 0) {
                        string = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
                    }
                    LinkedList linkedList = (LinkedList) C89623b0.m112055d(string);
                    String[] strArr2 = new String[linkedList.size()];
                    int size = linkedList.size();
                    for (int i = 0; i < size; i++) {
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
                intent.putExtra("intent_extra_desc", this.f878e.f259802j);
                intent.putExtra("intent_extra_md5", this.f878e.f259806q);
                intent.putExtra("intent_extra_size", this.f878e.f259798f);
                intent.putExtra("intent_extra_download_url", new String[]{this.f878e.f259805p});
                intent.putExtra("intent_extra_patchInfo", hVar.mo141733c());
                intent.putExtra("intent_extra_updateMode", ChannelUtil.updateMode);
                intent.putExtra("intent_extra_marketUrl", ChannelUtil.marketURL);
                intent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
                intent.putExtra("intent_extra_tinker_patch", true);
                intent.putExtra("intent_extra_download_mode", 1);
                ((SubCoreSandBox) C90149c.f258834a).mo118744c(this.f877d.getContext(), intent);
                ((C15865p) C86312j.m106911c(C15865p.class)).mo14315fh();
            }
        }
    }

    public C0297z(RepairerPatchDemoUI repairerPatchDemoUI, rg4 rg4) {
        this.f865d = repairerPatchDemoUI;
        this.f866e = rg4;
    }

    public final void run() {
        String str;
        rg4 rg4;
        C90795b bVar;
        RepairerPatchDemoUI repairerPatchDemoUI = this.f865d;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        repairerPatchDemoUI.getClass();
        String str2 = null;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
        } catch (Exception unused) {
            str = null;
        }
        if (str != null) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                C90793a b = C90793a.m113861b(str);
                str2 = (b == null || (bVar = b.f260724b) == null) ? C86013q1.m106456q(str) : bVar.f260727d;
            }
        }
        rg4 rg42 = this.f866e;
        if ((rg42 != null && rg42.f259800h.equals(str2)) || ((rg4 = this.f866e) != null && rg4.f259809t == 4)) {
            rg4 rg43 = this.f866e;
            if (rg43 != null && rg43.f259809t == 4) {
                Log.m105925i(this.f865d.f20476d, "checkTinkerBoostInstall, HdiffApk, oldApkMd5 is equal?: %s， dialogInfo.newApkPath = %s, oldApkMd5  = %s.", Boolean.valueOf(C112551y.m153809i(rg43.f259800h, str2, true)), this.f866e.f259797e, str2);
            }
            if (C86013q1.m106450k(this.f866e.f259797e) && C90793a.m113860a(this.f866e.f259797e)) {
                ((C119157j) C119157j.f356862d).mo183895z(new C0298a(this.f865d, this.f866e));
            } else if (((C88689b) C86312j.m106911c(C88689b.class)).mo122748eJ()) {
                ((C119157j) C119157j.f356862d).mo183895z(new C0301b(this.f865d, this.f866e));
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new C0304c(this.f865d, this.f866e));
            }
        }
    }
}
