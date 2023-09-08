package com.tencent.p014mm.plugin.shake.p103ui;

import ad3.C67027a;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72992v4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31461f3;
import eb0.C75592q0;
import eb0.C97625j3;
import fd0.C75743h;
import j20.C117292a;
import junit.framework.Assert;
import k20.C9556a;
import nj3.C76879j;
import nn2.C47289g;
import nn2.C76942m;
import p214om.C11502f;
import pj3.C47511g;
import tc0.C77884m;
import tc0.C77885p;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.shake.ui.a */
public class C71184a implements C67027a, MStorageEx.IOnStorageChange, C31461f3 {

    /* renamed from: d */
    public C47511g f206022d;

    /* renamed from: e */
    public Context f206023e;

    /* renamed from: f */
    public C72996z1 f206024f;

    /* renamed from: com.tencent.mm.plugin.shake.ui.a$a */
    public class C71185a implements DialogInterface.OnClickListener {
        public C71185a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C71184a.m83618a(C71184a.this.f206023e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.a$b */
    public class C71186b extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ boolean f206026a;

        /* renamed from: b */
        public final /* synthetic */ C6975i1 f206027b;

        public C71186b(boolean z, C6975i1 i1Var) {
            this.f206026a = z;
            this.f206027b = i1Var;
        }

        public void handleMessage(Message message) {
            int o = C75592q0.m90785o();
            boolean z = this.f206026a;
            int i = z ? o & -257 : o | 256;
            Log.m105925i("MicroMsg.ContactWidgetShake", "setInstall pluginFlag install:%b  pluginFlag : %d -> %d", Boolean.valueOf(z), Integer.valueOf(o), Integer.valueOf(i));
            C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(i));
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0));
            if (!this.f206026a) {
                C47289g zx02 = C76942m.zx0();
                zx02.f126951d.execSQL("shakeitem1", "delete from shakeitem1");
                zx02.doNotify();
                C72992v4 yx02 = C75743h.yx0();
                yx02.f212830d.delete(yx02.getTableName(), (String) null, (String[]) null);
            }
            C6975i1 i1Var = this.f206027b;
            if (i1Var != null) {
                i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.a$c */
    public class C71187c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f206028d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f206029e;

        public C71187c(ProgressDialog progressDialog, MMHandler mMHandler) {
            this.f206028d = progressDialog;
            this.f206029e = mMHandler;
        }

        public void run() {
            ProgressDialog progressDialog = this.f206028d;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f206029e.sendEmptyMessage(0);
            }
        }
    }

    public C71184a(Context context) {
        this.f206023e = context;
    }

    /* renamed from: a */
    public static void m83618a(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        ((C119157j) C119157j.f356862d).mo183878i(new C71187c(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), new C71186b(z, i1Var)), 1500);
    }

    /* renamed from: b */
    public final void mo97870b() {
        boolean z = (C75592q0.m90785o() & 256) == 0;
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f206022d.mo72519a("contact_info_header_helper");
        if (helperHeaderPreference != null) {
            helperHeaderPreference.mo7600I(this.f206024f.getUsername(), this.f206024f.mo62898f(), this.f206023e.getString(C0966R.string.bqx));
            helperHeaderPreference.mo7601J(z ? 1 : 0);
        }
        this.f206022d.mo72529n("contact_info_shake_install", z);
        this.f206022d.mo72529n("contact_info_shake_go_shake", !z);
        this.f206022d.mo72529n("contact_info_shake_uninstall", !z);
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        mo97870b();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C97625j3.m125812b().mo105906u().remove(this);
        C97625j3.m125812b().mo105885K(this);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.ContactWidgetShake", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C97625j3.m125812b().mo105906u() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetShake", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 7 || nullAsInt == 34) {
            mo97870b();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        boolean z2 = false;
        Assert.assertTrue(gVar != null);
        if (z1Var != null) {
            z2 = true;
        }
        Assert.assertTrue(z2);
        Assert.assertTrue(C72996z1.m85794B5(z1Var.getUsername()));
        C97625j3.m125812b().mo105906u().add(this);
        C97625j3.m125812b().mo105886a(this);
        this.f206024f = z1Var;
        this.f206022d = gVar;
        gVar.mo72520b(C0966R.xml.f8878a7);
        mo97870b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105918d("MicroMsg.ContactWidgetShake", "handleEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_shake_go_shake")) {
            Intent intent = new Intent();
            intent.setClass(this.f206023e, ShakeReportUI.class);
            Context context = this.f206023e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ContactWidgetShake", "goShake", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/shake/ui/ContactWidgetShake", "goShake", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((Activity) this.f206023e).finish();
            return true;
        } else if (str.equals("contact_info_shake_install")) {
            m83618a(this.f206023e, true, (C6975i1<C72996z1>) null);
            return true;
        } else if (str.equals("contact_info_shake_uninstall")) {
            Context context3 = this.f206023e;
            C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f206023e.getString(C0966R.string.f7930wk), this.f206023e.getString(C0966R.string.f7926wf), new C71185a(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetShake", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
