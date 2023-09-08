package com.tencent.p014mm.plugin.nearby.p083ui;

import ad3.C67027a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import cc2.C54713e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75590o4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C8233m;
import junit.framework.Assert;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import pj3.C47511g;
import qo3.C77398g;
import qo3.C89779i0;
import tc0.C77884m;
import tc0.C77885p;
import uc3.C78146a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.nearby.ui.a */
public class C69920a implements C67027a, MStorageEx.IOnStorageChange, C11385n {

    /* renamed from: n */
    public static boolean f201722n = true;

    /* renamed from: d */
    public C47511g f201723d;

    /* renamed from: e */
    public Context f201724e;

    /* renamed from: f */
    public C72996z1 f201725f;

    /* renamed from: g */
    public C89779i0 f201726g;

    /* renamed from: h */
    public C54713e f201727h;

    /* renamed from: i */
    public View f201728i;

    /* renamed from: j */
    public C77398g f201729j = null;

    /* renamed from: com.tencent.mm.plugin.nearby.ui.a$a */
    public class C69921a implements DialogInterface.OnClickListener {
        public C69921a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C69920a.m82349a(C69920a.this.f201724e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.a$b */
    public class C69922b extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ boolean f201731a;

        /* renamed from: b */
        public final /* synthetic */ C6975i1 f201732b;

        public C69922b(boolean z, C6975i1 i1Var) {
            this.f201731a = z;
            this.f201732b = i1Var;
        }

        public void handleMessage(Message message) {
            Class cls = C75700k0.class;
            int o = C75592q0.m90785o();
            int i = this.f201731a ? o & -513 : o | 512;
            C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(i));
            C8233m XW = ((C75700k0) C86709a0.m107533q(cls)).mo96100XW();
            C77884m mVar = r3;
            C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0);
            ((C77885p) XW).mo107993q(mVar);
            if (!this.f201731a) {
                C86709a0.m107523b().mo121108c();
                C72957c4 c4Var = (C72957c4) ((C75700k0) C86709a0.m107533q(cls)).mo96099XB();
                c4Var.f212645d.delete(c4Var.getTableName(), (String) null, (String[]) null);
                C86709a0.m107524d().mo123460f(new C54713e(2, 0.0f, 0.0f, 0, 0, "", ""));
            }
            C6975i1 i1Var = this.f201732b;
            if (i1Var != null) {
                i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.a$c */
    public class C69923c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f201733d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f201734e;

        public C69923c(C89779i0 i0Var, MMHandler mMHandler) {
            this.f201733d = i0Var;
            this.f201734e = mMHandler;
        }

        public void run() {
            C89779i0 i0Var = this.f201733d;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f201734e.sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.a$d */
    public class C69924d implements DialogInterface.OnClickListener {
        public C69924d(C69920a aVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C69920a(Context context) {
        this.f201724e = context;
        this.f201728i = View.inflate(context, C0966R.C0971layout.b5u, (ViewGroup) null);
        C86709a0.m107524d().mo123455a(148, this);
    }

    /* renamed from: a */
    public static void m82349a(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        int i = z ? C0966R.string.iww : C0966R.string.f361324ix3;
        f201722n = z;
        ((C119157j) C119157j.f356862d).mo183878i(new C69923c(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(i), true, true, (DialogInterface.OnCancelListener) null), new C69922b(z, i1Var)), 1500);
    }

    /* renamed from: b */
    public final void mo96231b() {
        boolean z = (C75592q0.m90785o() & 512) == 0;
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f201723d.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f201725f.getUsername(), this.f201725f.mo62898f(), this.f201724e.getString(C0966R.string.bnc));
        helperHeaderPreference.mo7601J(z ? 1 : 0);
        this.f201723d.mo72529n("contact_info_lbs_install", z);
        this.f201723d.mo72529n("contact_info_lbs_go_lbs", !z);
        this.f201723d.mo72529n("contact_info_lbs_clear_info", !z);
        this.f201723d.mo72529n("contact_info_lbs_uninstall", !z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C86709a0.m107535s().mo121142i().remove(this);
        C86709a0.m107524d().mo123470p(148, this);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.ContactWidgetLBS", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C86709a0.m107535s().mo121142i() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetLBS", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 7) {
            mo96231b();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        if (this.f201727h != null || ((C54713e) yVar).mo75607f() != 2) {
            Log.m105924i("MicroMsg.ContactWidgetLBS", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
            if (yVar.getType() == 148) {
                C89779i0 i0Var = this.f201726g;
                if (i0Var != null) {
                    i0Var.dismiss();
                    this.f201726g = null;
                }
                if (i == 0 && i2 == 0) {
                    i3 = C0966R.string.h5g;
                    C86709a0.m107535s().mo121142i().mo119676J(4104, Boolean.TRUE);
                } else {
                    i3 = C0966R.string.h5f;
                }
                if (((C54713e) yVar).mo75607f() == 2 && f201722n) {
                    C76879j.m92742m(this.f201724e, i3, C0966R.string.a3h, new C69924d(this));
                    this.f201727h = null;
                }
            }
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
        Assert.assertTrue(C72996z1.m85834e5(z1Var.getUsername()));
        C86709a0.m107535s().mo121142i().add(this);
        Log.m105926v("MicroMsg.ContactWidgetLBS", "listener added");
        this.f201725f = z1Var;
        this.f201723d = gVar;
        f201722n = true;
        gVar.mo72520b(C0966R.xml.f8870w);
        mo96231b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105918d("MicroMsg.ContactWidgetLBS", "handleEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_lbs_go_lbs")) {
            Boolean bool = (Boolean) C86709a0.m107535s().mo121142i().mo119684e(4103, (Object) null);
            if (bool == null || !bool.booleanValue()) {
                C88144b.m109789g(this.f201724e, "nearby", ".ui.NearbyFriendsIntroUI");
            } else {
                C75590o4 b = C75590o4.m90741b();
                if (b == null) {
                    C88144b.m109789g(this.f201724e, "nearby", ".ui.NearbyPersonalInfoUI");
                } else {
                    String nullAsNil = Util.nullAsNil(b.mo105937d());
                    String nullAsNil2 = Util.nullAsNil(b.mo105936c());
                    int i = b.f222065b;
                    if (nullAsNil.equals("") || nullAsNil2.equals("") || i == 0) {
                        C88144b.m109789g(this.f201724e, "nearby", ".ui.NearbyPersonalInfoUI");
                    } else {
                        Boolean bool2 = (Boolean) C86709a0.m107535s().mo121142i().mo119684e(4104, (Object) null);
                        if (bool2 == null || !bool2.booleanValue()) {
                            C78146a.m94352a(this.f201724e, new Intent());
                            ((Activity) this.f201724e).finish();
                        } else {
                            C77398g gVar = this.f201729j;
                            if (gVar == null) {
                                Context context = this.f201724e;
                                this.f201729j = C76879j.m92753x(context, context.getString(C0966R.string.a3h), (String) null, this.f201728i, new C69925b(this), new C69926c(this));
                            } else {
                                gVar.show();
                            }
                        }
                    }
                }
            }
            return true;
        } else if (str.equals("contact_info_lbs_install")) {
            m82349a(this.f201724e, true, (C6975i1<C72996z1>) null);
            return true;
        } else if (str.equals("contact_info_lbs_clear_info")) {
            C76879j.m92743n(this.f201724e, C0966R.string.h5e, C0966R.string.h5d, new C69927d(this), new C69929e(this));
            return true;
        } else if (str.equals("contact_info_lbs_uninstall")) {
            Context context2 = this.f201724e;
            C76879j.m92707A(context2, context2.getString(C0966R.string.iwz), "", this.f201724e.getString(C0966R.string.f7930wk), this.f201724e.getString(C0966R.string.f7926wf), new C69921a(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetLBS", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
