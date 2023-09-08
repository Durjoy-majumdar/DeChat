package sf0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.BioHelperUI;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7624i3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import hg0.C76186t;
import nj3.C76879j;
import p148ei.C7660a;
import p148ei.C7662f;
import p214om.C11502f;
import p286zl.C79396l;
import qg0.C12215a;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: sf0.i0 */
public class C13665i0 {

    /* renamed from: sf0.i0$a */
    public class C13666a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f38706d;

        /* renamed from: e */
        public final /* synthetic */ Activity f38707e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f38708f;

        public C13666a(int i, Activity activity, Runnable runnable) {
            this.f38706d = i;
            this.f38707e = activity;
            this.f38708f = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.PostLoginUtil", "[cpan] kv report logid:%d scene:%d", 11438, Integer.valueOf(this.f38706d));
            C115669n.INSTANCE.mo160131h(11438, Integer.valueOf(this.f38706d));
            C76186t.m91542j(true);
            C13665i0.m12974g(true, false);
            C13658a.m12959a(C13658a.f38696b);
            Runnable runnable = this.f38708f;
            if (runnable != null) {
                runnable.run();
            }
            this.f38707e.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
        }
    }

    /* renamed from: sf0.i0$b */
    public class C13667b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f38709d;

        /* renamed from: e */
        public final /* synthetic */ Activity f38710e;

        public C13667b(Runnable runnable, Activity activity) {
            this.f38709d = runnable;
            this.f38710e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C76186t.m91542j(false);
            C13665i0.m12974g(false, false);
            Runnable runnable = this.f38709d;
            if (runnable != null) {
                runnable.run();
            }
            this.f38710e.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
        }
    }

    /* renamed from: sf0.i0$c */
    public class C13668c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f38711d;

        /* renamed from: e */
        public final /* synthetic */ Context f38712e;

        public C13668c(String str, Context context) {
            this.f38711d = str;
            this.f38712e = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f38711d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, this.f38712e);
        }
    }

    /* renamed from: sf0.i0$d */
    public class C13669d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f38713d;

        /* renamed from: e */
        public final /* synthetic */ Context f38714e;

        public C13669d(String str, Context context) {
            this.f38713d = str;
            this.f38714e = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f38713d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, this.f38714e);
        }
    }

    /* renamed from: sf0.i0$e */
    public class C13670e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f38715d;

        /* renamed from: e */
        public final /* synthetic */ C7660a f38716e;

        /* renamed from: f */
        public final /* synthetic */ int f38717f;

        public C13670e(Context context, C7660a aVar, int i) {
            this.f38715d = context;
            this.f38716e = aVar;
            this.f38717f = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C12215a.m11778c(this.f38715d, this.f38716e.f26000a, this.f38717f, false);
        }
    }

    /* renamed from: a */
    public static void m12968a(Context context, String str) {
        C7624i3.f25910c.mo8756d("login_user_name", str);
    }

    /* renamed from: b */
    public static void m12969b(Activity activity, Runnable runnable, boolean z, int i) {
        if (C76186t.m91534b() != C79396l.SUCC && C76186t.m91534b() != C79396l.SUCC_UNLOAD) {
            Log.m105920e("MicroMsg.PostLoginUtil", "not successfully binded, skip addrbook confirm");
        } else if (Util.nullAsFalse((Boolean) C86709a0.m107535s().mo121142i().mo119684e(12322, (Object) null))) {
            Log.m105918d("MicroMsg.PostLoginUtil", "addrbook upload confirmed");
        } else if (z || !Util.nullAsFalse((Boolean) C86709a0.m107535s().mo121142i().mo119684e(12323, (Object) null))) {
            C76186t.m91542j(false);
            Log.m105919d("MicroMsg.PostLoginUtil", "READ_PHONE_STATE.getLine1Number %s", Util.getStack());
            String nullAsNil = Util.nullAsNil(Util.getLine1Number(activity));
            if (nullAsNil.length() > 0 && nullAsNil.equals(C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null))) {
                C76186t.m91542j(true);
                Log.m105924i("MicroMsg.PostLoginUtil", "same none-nil phone number, leave it");
            } else if (i != 2) {
                C76879j.m92739j(activity, C0966R.string.ajg, C0966R.string.a3h, C0966R.string.a4h, C0966R.string.f360090a14, new C13666a(i, activity, runnable), new C13667b(runnable, activity));
                C86709a0.m107535s().mo121142i().mo119676J(12323, Boolean.TRUE);
                return;
            }
        } else {
            Log.m105918d("MicroMsg.PostLoginUtil", "addrbook upload login confirmed showed");
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public static void m12970c(Context context, String str, int i) {
        C7660a a = C7660a.m7782a(str);
        if (a == null) {
            return;
        }
        if (a.f26002c == 8) {
            C12215a.m11778c(context, a.f26000a, i, false);
            return;
        }
        C7662f fVar = a.f26004e;
        String str2 = fVar.f26014f;
        String str3 = fVar.f26015g;
        if (Util.isNullOrNil(str2)) {
            str2 = context.getString(C0966R.string.a18);
        }
        String str4 = str2;
        if (Util.isNullOrNil(str3)) {
            str3 = context.getString(C0966R.string.f7926wf);
        }
        String str5 = str3;
        C13670e eVar = new C13670e(context, a, i);
        int i2 = a.f26002c;
        if (i2 != 1 && i2 != 4) {
            return;
        }
        if (Util.isNullOrNil(a.f26000a)) {
            C76879j.m92748s(context, a.f26001b, a.f26003d);
            return;
        }
        C76879j.m92707A(context, a.f26001b, a.f26003d, str4, str5, eVar, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: d */
    public static void m12971d(Context context) {
        Context context2 = context;
        C76879j.m92707A(context2, context.getString(C0966R.string.f7560jn), "", context.getString(C0966R.string.bjb), context.getString(C0966R.string.bj_), new C13668c(context.getString(C0966R.string.f7559jm), context), (DialogInterface.OnClickListener) null);
    }

    /* renamed from: e */
    public static void m12972e(Context context, String str, String str2) {
        C7660a a = C7660a.m7782a(str);
        if (a != null) {
            a.mo8792b(context, new C13669d(str2, context), (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: f */
    public static void m12973f(Context context, C114735a0.C1301c cVar, int i) {
        Intent intent = new Intent(context, BioHelperUI.class);
        intent.putExtra("k_type", cVar.f10408a);
        intent.putExtra("KVoiceHelpCode", i);
        intent.putExtra("Kvertify_key", cVar.f10409b);
        intent.putExtra("KVoiceHelpUrl", cVar.f10410c);
        intent.putExtra("KVoiceHelpWording", cVar.f10411d);
        intent.putExtra("Kusername", cVar.f10412e);
        if (cVar.f10413f != null) {
            intent.getExtras().putAll(cVar.f10413f);
        }
    }

    /* renamed from: g */
    public static void m12974g(boolean z, boolean z2) {
        int q = C75592q0.m90787q();
        int i = z ? q & -131073 : q | 131072;
        Log.m105918d("MicroMsg.PostLoginUtil", "Reg By mobile update = " + i);
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(i));
        int i2 = !z ? 1 : 2;
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 17;
        br12.f182325e = i2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        if (z2) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        }
    }
}
