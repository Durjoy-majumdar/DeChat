package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import g62.C8233m;
import junit.framework.Assert;
import nj3.C76879j;
import p154fy.C87121j;
import p214om.C11502f;
import pj3.C47511g;
import qo3.C89779i0;
import tc0.C37006i;
import tc0.C77884m;
import tc0.C77885p;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.ui.g1 */
public class C70269g1 implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: g */
    public static boolean f203024g;

    /* renamed from: d */
    public C47511g f203025d;

    /* renamed from: e */
    public Context f203026e;

    /* renamed from: f */
    public C72996z1 f203027f;

    /* renamed from: com.tencent.mm.plugin.profile.ui.g1$a */
    public class C70270a implements DialogInterface.OnClickListener {
        public C70270a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93172e(new Intent(), C70269g1.this.f203026e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.g1$b */
    public class C70271b implements DialogInterface.OnClickListener {
        public C70271b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C70269g1.m82839a(C70269g1.this.f203026e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.g1$c */
    public class C70272c implements DialogInterface.OnClickListener {
        public C70272c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C70269g1.m82841c(C70269g1.this.f203026e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.g1$d */
    public class C70273d extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ boolean f203031a;

        /* renamed from: b */
        public final /* synthetic */ Context f203032b;

        /* renamed from: c */
        public final /* synthetic */ C6975i1 f203033c;

        public C70273d(boolean z, Context context, C6975i1 i1Var) {
            this.f203031a = z;
            this.f203032b = context;
            this.f203033c = i1Var;
        }

        public void handleMessage(Message message) {
            if (this.f203031a) {
                C70269g1.m82840b(true);
            }
            int o = C75592q0.m90785o();
            int i = this.f203031a ? o & -17 : o | 16;
            C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(i));
            C8233m B = C97625j3.m125812b().mo105876B();
            C77884m mVar = r2;
            C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0);
            ((C77885p) B).mo107993q(mVar);
            if (!this.f203031a) {
                C70269g1.m82839a(this.f203032b);
            }
            C6975i1 i1Var = this.f203033c;
            if (i1Var != null) {
                i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.g1$e */
    public class C70274e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f203034d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f203035e;

        public C70274e(C89779i0 i0Var, MMHandler mMHandler) {
            this.f203034d = i0Var;
            this.f203035e = mMHandler;
        }

        public void run() {
            C89779i0 i0Var = this.f203034d;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f203035e.sendEmptyMessage(0);
            }
        }
    }

    public C70269g1(Context context) {
        this.f203026e = context;
    }

    /* renamed from: a */
    public static void m82839a(Context context) {
        f203024g = false;
        C75604z3.m90836h("medianote", new C70280i1(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a4d), true, true, new C70277h1())));
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot("medianote", 15);
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("medianote");
    }

    /* renamed from: b */
    public static void m82840b(boolean z) {
        int q = C75592q0.m90787q();
        C97625j3.m125812b().mo105906u().mo119676J(7, Integer.valueOf(z ? q | 16384 : q & -16385));
        ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C37006i(13, z ? 1 : 2));
    }

    /* renamed from: c */
    public static void m82841c(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        ((C119157j) C119157j.f356862d).mo183878i(new C70274e(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), new C70273d(z, context, i1Var)), 1500);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96771d() {
        /*
            r9 = this;
            int r0 = eb0.C75592q0.m90785o()
            r0 = r0 & 16
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            int r3 = eb0.C75592q0.m90787q()
            boolean r4 = eb0.C75592q0.m90790t()
            if (r4 != 0) goto L_0x002e
            r4 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0034
            r3 = r3 & -16385(0xffffffffffffbfff, float:NaN)
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            r5 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.mo119676J(r5, r3)
            goto L_0x0034
        L_0x002e:
            r3 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            pj3.g r4 = r9.f203025d
            java.lang.String r5 = "contact_info_header_helper"
            com.tencent.mm.ui.base.preference.Preference r4 = r4.mo72519a(r5)
            com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference r4 = (com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference) r4
            com.tencent.mm.storage.z1 r5 = r9.f203027f
            java.lang.String r5 = r5.getUsername()
            com.tencent.mm.storage.z1 r6 = r9.f203027f
            java.lang.String r6 = r6.mo62898f()
            android.content.Context r7 = r9.f203026e
            r8 = 2131824200(0x7f110e48, float:1.9281221E38)
            java.lang.String r7 = r7.getString(r8)
            r4.mo7600I(r5, r6, r7)
            r4.mo7601J(r0)
            pj3.g r4 = r9.f203025d
            java.lang.String r5 = "contact_info_medianote_install"
            r4.mo72529n(r5, r0)
            pj3.g r4 = r9.f203025d
            r5 = r0 ^ 1
            java.lang.String r6 = "contact_info_medianote_view"
            r4.mo72529n(r6, r5)
            if (r0 == 0) goto L_0x0094
            boolean r4 = eb0.C75592q0.m90790t()
            if (r4 != 0) goto L_0x0094
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r5 = "BindQQSwitch"
            java.lang.String r4 = r4.mo107405c(r5)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r2)
            if (r4 != r2) goto L_0x008b
            r1 = 1
        L_0x008b:
            java.lang.String r4 = "MicroMsg.ContactWidgetMediaNote"
            java.lang.String r5 = "summerqq BindQQSwitch off"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x0095
        L_0x0094:
            r1 = r0
        L_0x0095:
            pj3.g r4 = r9.f203025d
            r1 = r1 ^ r2
            java.lang.String r5 = "contact_info_medianote_sync_to_qqmail"
            r4.mo72529n(r5, r1)
            pj3.g r1 = r9.f203025d
            r4 = r0 ^ 1
            java.lang.String r6 = "contact_info_medianote_clear_data"
            r1.mo72529n(r6, r4)
            pj3.g r1 = r9.f203025d
            r0 = r0 ^ r2
            java.lang.String r2 = "contact_info_medianote_uninstall"
            r1.mo72529n(r2, r0)
            pj3.g r0 = r9.f203025d
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r5)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            r0.mo6805K(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.C70269g1.mo96771d():void");
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
        Log.m105919d("MicroMsg.ContactWidgetMediaNote", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C97625j3.m125812b().mo105906u() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetMediaNote", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 7) {
            mo96771d();
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
        Assert.assertTrue(C72996z1.m85837h5(z1Var.getUsername()));
        C97625j3.m125812b().mo105906u().add(this);
        this.f203027f = z1Var;
        this.f203025d = gVar;
        gVar.mo72520b(C0966R.xml.f8873z);
        mo96771d();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Class cls = C11502f.class;
        Log.m105918d("MicroMsg.ContactWidgetMediaNote", "handleEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_medianote_view")) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", "medianote");
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent, this.f203026e);
            ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93136Bk();
            return true;
        } else if (str.equals("contact_info_medianote_sync_to_qqmail")) {
            if (!C75592q0.m90790t()) {
                C76879j.m92743n(this.f203026e, C0966R.string.f360298bo2, C0966R.string.f360297bo1, new C70270a(), (DialogInterface.OnClickListener) null);
                mo96771d();
            } else {
                m82840b(((CheckBoxPreference) this.f203025d.mo72519a(str)).mo6804J());
            }
            return true;
        } else if (str.equals("contact_info_medianote_clear_data")) {
            Context context = this.f203026e;
            C76879j.m92707A(context, context.getString(C0966R.string.blf), "", this.f203026e.getString(C0966R.string.f7930wk), this.f203026e.getString(C0966R.string.f7926wf), new C70271b(), (DialogInterface.OnClickListener) null);
            return true;
        } else if (str.equals("contact_info_medianote_install")) {
            m82841c(this.f203026e, true, (C6975i1<C72996z1>) null);
            return true;
        } else if (str.equals("contact_info_medianote_uninstall")) {
            Context context2 = this.f203026e;
            C76879j.m92707A(context2, context2.getString(C0966R.string.iwz), "", this.f203026e.getString(C0966R.string.f7930wk), this.f203026e.getString(C0966R.string.f7926wf), new C70272c(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetMediaNote", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
