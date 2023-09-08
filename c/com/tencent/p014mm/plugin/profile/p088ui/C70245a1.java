package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceCategory;
import com.tencent.p014mm.plugin.account.p024ui.MMFBFriendUI;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import dg0.C75398e;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import g62.C8233m;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p214om.C11502f;
import pj3.C47511g;
import qo3.C89779i0;
import tc0.C77884m;
import tc0.C77885p;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.ui.a1 */
public class C70245a1 implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C47511g f202992d;

    /* renamed from: e */
    public Context f202993e;

    /* renamed from: f */
    public C72996z1 f202994f;

    /* renamed from: g */
    public Map<String, Preference> f202995g = new HashMap();

    /* renamed from: com.tencent.mm.plugin.profile.ui.a1$a */
    public class C70246a implements DialogInterface.OnClickListener {
        public C70246a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C70245a1.m82831a(C70245a1.this.f202993e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.a1$b */
    public class C70247b extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ boolean f202997a;

        /* renamed from: b */
        public final /* synthetic */ C6975i1 f202998b;

        public C70247b(boolean z, C6975i1 i1Var) {
            this.f202997a = z;
            this.f202998b = i1Var;
        }

        public void handleMessage(Message message) {
            int o = C75592q0.m90785o();
            int i = this.f202997a ? o & -8193 : o | 8192;
            C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(i));
            C8233m B = C97625j3.m125812b().mo105876B();
            C77884m mVar = r2;
            C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0);
            ((C77885p) B).mo107993q(mVar);
            if (!this.f202997a) {
                C75398e.xx0().mo106431jo();
                C97625j3.m125812b().mo105906u().mo119676J(65828, "");
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("facebookapp");
                ((C72972g4) C97625j3.m125812b().mo105911z()).mo101089TE("facebookapp");
            }
            C6975i1 i1Var = this.f202998b;
            if (i1Var != null) {
                i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.a1$c */
    public class C70248c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f202999d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f203000e;

        public C70248c(C89779i0 i0Var, MMHandler mMHandler) {
            this.f202999d = i0Var;
            this.f203000e = mMHandler;
        }

        public void run() {
            C89779i0 i0Var = this.f202999d;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f203000e.sendEmptyMessage(0);
            }
        }
    }

    public C70245a1(Context context) {
        this.f202993e = context;
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0("facebookapp");
    }

    /* renamed from: a */
    public static void m82831a(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        ((C119157j) C119157j.f356862d).mo183878i(new C70248c(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), new C70247b(z, i1Var)), 1500);
    }

    /* renamed from: b */
    public final void mo96749b() {
        this.f202992d.removeAll();
        boolean z = true;
        if (((HashMap) this.f202995g).containsKey("contact_info_header_helper")) {
            HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) ((HashMap) this.f202995g).get("contact_info_header_helper");
            this.f202992d.mo72527k(helperHeaderPreference);
            helperHeaderPreference.mo7600I(this.f202994f.getUsername(), this.f202994f.mo62909j3(), this.f202993e.getString(C0966R.string.bm9));
            helperHeaderPreference.mo7601J((C75592q0.m90785o() & 8192) == 0 ? 1 : 0);
        }
        if (((HashMap) this.f202995g).containsKey("contact_info_facebookapp_cat")) {
            this.f202992d.mo72527k((Preference) ((HashMap) this.f202995g).get("contact_info_facebookapp_cat"));
        }
        if ((C75592q0.m90785o() & 8192) != 0) {
            z = false;
        }
        if (z) {
            if (((HashMap) this.f202995g).containsKey("contact_info_facebookapp_account")) {
                Preference preference = (Preference) ((HashMap) this.f202995g).get("contact_info_facebookapp_account");
                this.f202992d.mo72527k(preference);
                if (C75592q0.m90792v()) {
                    preference.mo7740D(C0966R.string.imn);
                } else {
                    preference.mo7740D(C0966R.string.iod);
                }
            }
            if (C75592q0.m90792v() && ((HashMap) this.f202995g).containsKey("contact_info_facebookapp_addr")) {
                Preference preference2 = (Preference) ((HashMap) this.f202995g).get("contact_info_facebookapp_addr");
                this.f202992d.mo72527k(preference2);
                preference2.mo7741E((String) C97625j3.m125812b().mo105906u().mo119684e(65826, (Object) null));
            }
            if (((HashMap) this.f202995g).containsKey("contact_info_facebookapp_cat2")) {
                this.f202992d.mo72527k((Preference) ((HashMap) this.f202995g).get("contact_info_facebookapp_cat2"));
            }
            if (((HashMap) this.f202995g).containsKey("contact_info_facebookapp_uninstall")) {
                this.f202992d.mo72527k((Preference) ((HashMap) this.f202995g).get("contact_info_facebookapp_uninstall"));
            }
        } else if (((HashMap) this.f202995g).containsKey("contact_info_facebookapp_install")) {
            this.f202992d.mo72527k((Preference) ((HashMap) this.f202995g).get("contact_info_facebookapp_install"));
        }
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
        Log.m105919d("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C97625j3.m125812b().mo105906u() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 65825) {
            mo96749b();
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
        Assert.assertTrue(C72996z1.m85815R4(z1Var.getUsername()));
        C97625j3.m125812b().mo105906u().add(this);
        this.f202994f = z1Var;
        this.f202992d = gVar;
        gVar.mo72520b(C0966R.xml.f8867t);
        Preference a = gVar.mo72519a("contact_info_header_helper");
        if (a != null) {
            ((HashMap) this.f202995g).put("contact_info_header_helper", a);
        }
        Preference a2 = gVar.mo72519a("contact_info_facebookapp_listfriend");
        if (a2 != null) {
            ((HashMap) this.f202995g).put("contact_info_facebookapp_listfriend", a2);
        }
        Preference a3 = gVar.mo72519a("contact_info_facebookapp_account");
        if (a3 != null) {
            ((HashMap) this.f202995g).put("contact_info_facebookapp_account", a3);
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) gVar.mo72519a("contact_info_facebookapp_cat");
        if (preferenceCategory != null) {
            ((HashMap) this.f202995g).put("contact_info_facebookapp_cat", preferenceCategory);
        }
        Preference a4 = gVar.mo72519a("contact_info_facebookapp_addr");
        if (a4 != null) {
            ((HashMap) this.f202995g).put("contact_info_facebookapp_addr", a4);
        }
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) gVar.mo72519a("contact_info_facebookapp_cat2");
        if (preferenceCategory2 != null) {
            ((HashMap) this.f202995g).put("contact_info_facebookapp_cat2", preferenceCategory2);
        }
        Preference a5 = gVar.mo72519a("contact_info_facebookapp_install");
        if (a5 != null) {
            ((HashMap) this.f202995g).put("contact_info_facebookapp_install", a5);
        }
        Preference a6 = gVar.mo72519a("contact_info_facebookapp_uninstall");
        if (a6 != null) {
            ((HashMap) this.f202995g).put("contact_info_facebookapp_uninstall", a6);
        }
        mo96749b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105918d("MicroMsg.ContactWidgetFacebookapp", "handleEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_facebookapp_install")) {
            m82831a(this.f202993e, true, (C6975i1<C72996z1>) null);
            return true;
        } else if (str.equals("contact_info_facebookapp_uninstall")) {
            Context context = this.f202993e;
            C76879j.m92707A(context, context.getString(C0966R.string.iwz), "", this.f202993e.getString(C0966R.string.f7930wk), this.f202993e.getString(C0966R.string.f7926wf), new C70246a(), (DialogInterface.OnClickListener) null);
            return true;
        } else if (str.equals("contact_info_facebookapp_listfriend")) {
            Intent intent = new Intent(this.f202993e, MMFBFriendUI.class);
            Context context2 = this.f202993e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetFacebookapp", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/profile/ui/ContactWidgetFacebookapp", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("contact_info_facebookapp_account")) {
            C88144b.m109791i(this.f202993e, "account", ".ui.FacebookAuthUI", new Intent(), (Bundle) null);
            return true;
        } else if (str.equals("contact_info_facebookapp_addr")) {
            C88144b.m109791i(this.f202993e, "account", ".ui.FacebookAuthUI", new Intent(), (Bundle) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetFacebookapp", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
