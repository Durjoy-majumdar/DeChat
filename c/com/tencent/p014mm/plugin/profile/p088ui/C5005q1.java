package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.WCWebUpdater;
import eb0.C116756s5;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import g62.C8233m;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import pj3.C47511g;
import tc0.C77884m;
import tc0.C77885p;

/* renamed from: com.tencent.mm.plugin.profile.ui.q1 */
public class C5005q1 implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public Context f20312d;

    /* renamed from: e */
    public C47511g f20313e;

    /* renamed from: f */
    public C72996z1 f20314f;

    /* renamed from: g */
    public boolean f20315g;

    /* renamed from: com.tencent.mm.plugin.profile.ui.q1$a */
    public class C5006a implements DialogInterface.OnClickListener {
        public C5006a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C5005q1 q1Var = C5005q1.this;
            q1Var.mo5969a(q1Var.f20312d, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.q1$b */
    public class C5007b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f20317d;

        /* renamed from: e */
        public final /* synthetic */ ProgressDialog f20318e;

        /* renamed from: com.tencent.mm.plugin.profile.ui.q1$b$a */
        public class C5008a implements Runnable {
            public C5008a() {
            }

            public void run() {
                C5007b.this.f20318e.dismiss();
            }
        }

        public C5007b(boolean z, ProgressDialog progressDialog) {
            this.f20317d = z;
            this.f20318e = progressDialog;
        }

        public void run() {
            C5005q1 q1Var = C5005q1.this;
            boolean z = this.f20317d;
            q1Var.getClass();
            C116756s5.m164689b(6, z ? "3" : WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
            int o = C75592q0.m90785o();
            int i = z ? o & -129 : o | 128;
            C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(i));
            C8233m B = C97625j3.m125812b().mo105876B();
            C77884m mVar = r2;
            C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0);
            ((C77885p) B).mo107993q(mVar);
            if (!this.f20317d) {
                C75604z3.m90839k("qqsync");
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("qqsync");
            }
            MMHandlerThread.postToMainThread(new C5008a());
        }
    }

    public C5005q1(Context context) {
        this.f20312d = context;
    }

    /* renamed from: a */
    public final void mo5969a(Context context, boolean z) {
        C86709a0.m107525e().postToWorker(new C5007b(z, C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null)));
    }

    /* renamed from: b */
    public final void mo5970b() {
        this.f20315g = (C75592q0.m90785o() & 128) == 0;
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f20313e.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f20314f.getUsername(), this.f20314f.mo62898f(), this.f20312d.getString(C0966R.string.bpp));
        helperHeaderPreference.mo7601J(this.f20315g ? 1 : 0);
        this.f20313e.mo72529n("contact_info_go_to_sync", !this.f20315g);
        this.f20313e.mo72529n("contact_info_remind_me_syncing_tip", !this.f20315g);
        this.f20313e.mo72529n("contact_info_qqsync_install", this.f20315g);
        this.f20313e.mo72529n("contact_info_qqsync_uninstall", true ^ this.f20315g);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C97625j3.m125812b().mo105906u().remove(this);
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (this.f20315g != ((C75592q0.m90785o() & 128) == 0)) {
            mo5970b();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        C97625j3.m125812b().mo105906u().add(this);
        this.f20313e = gVar;
        this.f20314f = z1Var;
        gVar.mo72520b(C0966R.xml.f8876a5);
        mo5970b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        String str2 = str;
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if ("contact_info_go_to_sync".equals(str2)) {
            if (C72688j0.m85020f(this.f20312d, "com.tencent.qqpim")) {
                Intent launchIntentForPackage = this.f20312d.getPackageManager().getLaunchIntentForPackage("com.tencent.qqpim");
                launchIntentForPackage.addFlags(268435456);
                Context context = this.f20312d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(launchIntentForPackage);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync", "goToSync", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/profile/ui/ContactWidgetQQSync", "goToSync", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C76879j.m92739j(this.f20312d, C0966R.string.bpn, C0966R.string.a3h, C0966R.string.f7950x8, C0966R.string.f7926wf, new C5010r1(this), (DialogInterface.OnClickListener) null);
            }
            return true;
        } else if ("contact_info_remind_me_syncing".equals(str2)) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f20313e.mo72519a("contact_info_remind_me_syncing");
            C97625j3.m125812b().mo105906u().mo119676J(65792, Boolean.valueOf(checkBoxPreference.mo6804J()));
            C116756s5.m164689b(6, checkBoxPreference.mo6804J() ? "1" : "2");
            return true;
        } else if (str2.equals("contact_info_qqsync_install")) {
            mo5969a(this.f20312d, true);
            return true;
        } else if (!str2.equals("contact_info_qqsync_uninstall")) {
            return false;
        } else {
            Context context3 = this.f20312d;
            C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f20312d.getString(C0966R.string.f7930wk), this.f20312d.getString(C0966R.string.f7926wf), new C5006a(), (DialogInterface.OnClickListener) null);
            return true;
        }
    }
}
