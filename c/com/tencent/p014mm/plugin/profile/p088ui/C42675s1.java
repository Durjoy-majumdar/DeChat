package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
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
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import g62.C32330n;
import junit.framework.Assert;
import nj3.C76879j;
import p214om.C11502f;
import pj3.C47511g;
import tc0.C77885p;
import te3.C48993ce3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.ui.s1 */
public class C42675s1 implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C47511g f115528d;

    /* renamed from: e */
    public Context f115529e;

    /* renamed from: f */
    public C72996z1 f115530f;

    /* renamed from: com.tencent.mm.plugin.profile.ui.s1$a */
    public class C42676a implements DialogInterface.OnClickListener {
        public C42676a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C42675s1.m46363a(C42675s1.this.f115529e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.s1$b */
    public class C42677b extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ boolean f115532a;

        /* renamed from: b */
        public final /* synthetic */ C6975i1 f115533b;

        public C42677b(boolean z, C6975i1 i1Var) {
            this.f115532a = z;
            this.f115533b = i1Var;
        }

        public void handleMessage(Message message) {
            int o = C75592q0.m90785o();
            C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(this.f115532a ? o & -33554433 : o | TPMediaCodecProfileLevel.HEVCHighTierLevel62));
            C48993ce3 ce32 = new C48993ce3();
            ce32.f131680d = TPMediaCodecProfileLevel.HEVCHighTierLevel62;
            ce32.f131681e = this.f115532a ^ true ? 1 : 0;
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(39, ce32));
            C6975i1 i1Var = this.f115533b;
            if (i1Var != null) {
                i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.s1$c */
    public class C42678c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f115534d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f115535e;

        public C42678c(ProgressDialog progressDialog, MMHandler mMHandler) {
            this.f115534d = progressDialog;
            this.f115535e = mMHandler;
        }

        public void run() {
            ProgressDialog progressDialog = this.f115534d;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f115535e.sendEmptyMessage(0);
            }
        }
    }

    public C42675s1(Context context) {
        this.f115529e = context;
    }

    /* renamed from: a */
    public static void m46363a(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        ((C119157j) C119157j.f356862d).mo183878i(new C42678c(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), new C42677b(z, i1Var)), 1500);
    }

    /* renamed from: b */
    public final void mo66820b() {
        boolean z = (C75592q0.m90785o() & TPMediaCodecProfileLevel.HEVCHighTierLevel62) == 0;
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f115528d.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f115530f.getUsername(), this.f115530f.mo62898f(), this.f115529e.getString(C0966R.string.bt5));
        helperHeaderPreference.mo7601J(z ? 1 : 0);
        this.f115528d.mo72529n("contact_info_voiceinput_install", z);
        this.f115528d.mo72529n("contact_info_voiceinput_uninstall", !z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C97625j3.m125812b().mo105906u().remove(this);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C97625j3.m125812b().mo105906u() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 7) {
            mo66820b();
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
        Assert.assertTrue(C72996z1.m85801H5(z1Var.getUsername()));
        C97625j3.m125812b().mo105906u().add(this);
        this.f115530f = z1Var;
        this.f115528d = gVar;
        gVar.mo72520b(C0966R.xml.f8881a_);
        mo66820b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105918d("MicroMsg.ContactWidgetVoiceInput", "handleEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_voiceinput_install")) {
            m46363a(this.f115529e, true, (C6975i1<C72996z1>) null);
            return true;
        } else if (str.equals("contact_info_voiceinput_uninstall")) {
            Context context = this.f115529e;
            C76879j.m92707A(context, context.getString(C0966R.string.iwz), "", this.f115529e.getString(C0966R.string.f7930wk), this.f115529e.getString(C0966R.string.f7926wf), new C42676a(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetVoiceInput", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
