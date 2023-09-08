package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindLinkedInUI;
import com.tencent.p014mm.plugin.profile.p088ui.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import g62.C32330n;
import j20.C117292a;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p214om.C11502f;
import pj3.C47511g;
import tc0.C77885p;
import te3.C48993ce3;

/* renamed from: com.tencent.mm.plugin.profile.ui.f1 */
public class C42630f1 implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C47511g f115403d;

    /* renamed from: e */
    public Context f115404e;

    /* renamed from: f */
    public C72996z1 f115405f;

    /* renamed from: g */
    public HelperHeaderPreference.C42607a f115406g;

    /* renamed from: com.tencent.mm.plugin.profile.ui.f1$a */
    public class C42631a implements DialogInterface.OnClickListener {
        public C42631a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C42630f1.m46311a(C42630f1.this.f115404e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.f1$b */
    public class C42632b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f115408d;

        /* renamed from: e */
        public final /* synthetic */ boolean f115409e;

        /* renamed from: f */
        public final /* synthetic */ C6975i1 f115410f;

        public C42632b(ProgressDialog progressDialog, boolean z, C6975i1 i1Var) {
            this.f115408d = progressDialog;
            this.f115409e = z;
            this.f115410f = i1Var;
        }

        public boolean onTimerExpired() {
            int i;
            ProgressDialog progressDialog = this.f115408d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            int o = C75592q0.m90785o();
            if (this.f115409e) {
                i = o & -16777217;
            } else {
                i = o | TPMediaCodecProfileLevel.HEVCMainTierLevel62;
                C97625j3.m125812b().mo105906u().mo119676J(286722, "");
                C97625j3.m125812b().mo105906u().mo119676J(286721, "");
                C97625j3.m125812b().mo105906u().mo119676J(286723, "");
            }
            C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(i));
            C48993ce3 ce32 = new C48993ce3();
            ce32.f131680d = TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            ce32.f131681e = this.f115409e ^ true ? 1 : 0;
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(39, ce32));
            C6975i1 i1Var = this.f115410f;
            if (i1Var == null) {
                return false;
            }
            i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            return false;
        }
    }

    public C42630f1(Context context) {
        this.f115404e = context;
        this.f115406g = new C42781w1(context);
    }

    /* renamed from: a */
    public static void m46311a(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        new MTimerHandler(new C42632b(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), z, i1Var), false).startTimer(1500);
    }

    /* renamed from: b */
    public final void mo66763b() {
        boolean z = (C75592q0.m90785o() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0;
        this.f115403d.removeAll();
        this.f115403d.mo72520b(C0966R.xml.f8871x);
        ((HelperHeaderPreference) this.f115403d.mo72519a("contact_info_header_helper")).mo66737J(this.f115405f, this.f115406g);
        if (z) {
            this.f115403d.mo72529n("contact_info_linkedin_account", false);
            this.f115403d.mo72531o("contact_info_linkedin_install");
            return;
        }
        this.f115403d.mo72529n("contact_info_linkedin_account", true);
        this.f115403d.mo72531o("contact_info_linkedin_uninstall");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            mo66763b();
        }
    }

    public boolean onDetach() {
        HelperHeaderPreference.C42607a aVar;
        C97625j3.m125812b().mo105906u().remove(this);
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f115403d.mo72519a("contact_info_header_helper");
        if (!(helperHeaderPreference == null || (aVar = helperHeaderPreference.f115333P) == null)) {
            aVar.onDetach();
        }
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue == 40 || intValue == 34) {
                mo66763b();
                return;
            }
            return;
        }
        boolean z = obj instanceof String;
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        boolean z2 = false;
        Assert.assertTrue(gVar != null);
        if (z1Var != null) {
            z2 = true;
        }
        Assert.assertTrue(z2);
        Assert.assertTrue(C72996z1.m85835f5(z1Var.getUsername()));
        C97625j3.m125812b().mo105906u().add(this);
        this.f115405f = z1Var;
        this.f115403d = gVar;
        mo66763b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105918d("MicroMsg.ContactWidgetLinkedIn", "handleEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_linkedin_install")) {
            m46311a(this.f115404e, true, (C6975i1<C72996z1>) null);
            return true;
        } else if (str.equals("contact_info_linkedin_uninstall")) {
            Context context = this.f115404e;
            C76879j.m92707A(context, context.getString(C0966R.string.iwz), "", this.f115404e.getString(C0966R.string.f7930wk), this.f115404e.getString(C0966R.string.f7926wf), new C42631a(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            if (str.equals("contact_info_linkedin_account")) {
                Intent intent = new Intent(this.f115404e, BindLinkedInUI.class);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(1);
                aVar.mo10233c(intent);
                C117292a.m165364j((Activity) this.f115404e, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetLinkedIn", "handleEvent", "(Ljava/lang/String;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
            Log.m105920e("MicroMsg.ContactWidgetLinkedIn", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
