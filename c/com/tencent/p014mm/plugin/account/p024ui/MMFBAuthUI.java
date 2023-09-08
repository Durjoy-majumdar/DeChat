package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116099e;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116105j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import hg0.C46057k0;
import hg0.C8521g0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p910lj.C76701a;
import pj3.C47511g;
import sf0.C118276e;
import sf0.C13665i0;
import tc0.C37007j;
import tc0.C77885p;

/* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI */
public class MMFBAuthUI extends MMPreference implements C11385n {

    /* renamed from: q */
    public static final String[] f344640q = {"public_profile", Scopes.EMAIL, "user_location"};

    /* renamed from: d */
    public C116102h f344641d;

    /* renamed from: e */
    public ProgressDialog f344642e;

    /* renamed from: f */
    public DialogInterface.OnCancelListener f344643f;

    /* renamed from: g */
    public C8521g0 f344644g;

    /* renamed from: h */
    public boolean f344645h = false;

    /* renamed from: i */
    public boolean f344646i = false;

    /* renamed from: j */
    public String f344647j = "";

    /* renamed from: n */
    public C47511g f344648n;

    /* renamed from: o */
    public final Map<String, Preference> f344649o = new HashMap();

    /* renamed from: p */
    public IListener f344650p = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.FacebookAuthUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBAuthUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/MMFBAuthUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$a */
    public class C114960a implements DialogInterface.OnClickListener {
        public C114960a(MMFBAuthUI mMFBAuthUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$b */
    public class C114961b implements DialogInterface.OnCancelListener {
        public C114961b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (MMFBAuthUI.this.f344644g != null) {
                C86709a0.m107524d().mo123458d(MMFBAuthUI.this.f344644g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$c */
    public class C114962c implements MenuItem.OnMenuItemClickListener {
        public C114962c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = MMFBAuthUI.this.getIntent();
            intent.putExtra("bind_facebook_succ", MMFBAuthUI.this.f344646i);
            MMFBAuthUI.this.setResult(-1, intent);
            MMFBAuthUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$d */
    public class C114963d implements DialogInterface.OnClickListener {
        public C114963d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String string = MMFBAuthUI.this.getString(C0966R.string.a3h);
            String string2 = MMFBAuthUI.this.getString(C0966R.string.clb);
            MMFBAuthUI mMFBAuthUI = MMFBAuthUI.this;
            mMFBAuthUI.f344642e = ProgressDialog.show(mMFBAuthUI, string, string2, true);
            MMFBAuthUI mMFBAuthUI2 = MMFBAuthUI.this;
            mMFBAuthUI2.f344642e.setOnCancelListener(mMFBAuthUI2.f344643f);
            C86709a0.m107524d().mo123460f(new C46057k0(3));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$e */
    public class C114964e implements DialogInterface.OnClickListener {
        public C114964e(MMFBAuthUI mMFBAuthUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$f */
    public class C114965f implements DialogInterface.OnClickListener {
        public C114965f(MMFBAuthUI mMFBAuthUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$g */
    public class C114966g implements DialogInterface.OnClickListener {
        public C114966g(MMFBAuthUI mMFBAuthUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$h */
    public class C114967h implements DialogInterface.OnClickListener {
        public C114967h(MMFBAuthUI mMFBAuthUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$i */
    public class C114968i implements DialogInterface.OnClickListener {
        public C114968i(MMFBAuthUI mMFBAuthUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI$j */
    public final class C114969j implements C116102h.C116103a {
        public C114969j(C1149591 r2) {
        }

        /* renamed from: b */
        public void mo1391b(Bundle bundle) {
            MMFBAuthUI mMFBAuthUI = MMFBAuthUI.this;
            mMFBAuthUI.f344647j = mMFBAuthUI.f344641d.f348440a;
            C86709a0.m107535s().mo121142i().mo119676J(65830, MMFBAuthUI.this.f344647j);
            if (MMFBAuthUI.this.f344641d.f348441b != 0) {
                C86709a0.m107535s().mo121142i().mo119676J(65832, Long.valueOf(MMFBAuthUI.this.f344641d.f348441b));
            }
            MMFBAuthUI.this.mo174684H7();
        }

        /* renamed from: c */
        public void mo1392c(C116105j jVar) {
            Log.m105918d("MicroMsg.FacebookAuthUI", "onFacebookError:" + jVar.f348447e);
            C76879j.m92748s(MMFBAuthUI.this, jVar.getMessage(), MMFBAuthUI.this.getString(C0966R.string.bm6));
            MMFBAuthUI mMFBAuthUI = MMFBAuthUI.this;
            String[] strArr = MMFBAuthUI.f344640q;
            mMFBAuthUI.mo174685I7(false);
            C115669n.INSTANCE.idkeyStat(582, 2, 1, false);
        }

        /* renamed from: d */
        public void mo1393d(C116099e eVar) {
            Log.m105918d("MicroMsg.FacebookAuthUI", "onError:" + eVar.getMessage());
            C76879j.m92748s(MMFBAuthUI.this, eVar.getMessage(), MMFBAuthUI.this.getString(C0966R.string.bm6));
            MMFBAuthUI mMFBAuthUI = MMFBAuthUI.this;
            String[] strArr = MMFBAuthUI.f344640q;
            mMFBAuthUI.mo174685I7(false);
            C115669n.INSTANCE.idkeyStat(582, 3, 1, false);
        }

        public void onCancel() {
            Log.m105918d("MicroMsg.FacebookAuthUI", "onCancel");
            MMFBAuthUI mMFBAuthUI = MMFBAuthUI.this;
            String[] strArr = MMFBAuthUI.f344640q;
            mMFBAuthUI.mo174685I7(false);
            C115669n.INSTANCE.idkeyStat(582, 4, 1, false);
        }
    }

    /* renamed from: H7 */
    public final void mo174684H7() {
        ProgressDialog show = ProgressDialog.show(this, getString(C0966R.string.a3h), getString(C0966R.string.f360410cl2), true);
        this.f344642e = show;
        show.setOnCancelListener(this.f344643f);
        this.f344644g = new C8521g0(1, this.f344647j);
        C86709a0.m107524d().mo123460f(this.f344644g);
        mo174685I7(true);
        C115669n.INSTANCE.idkeyStat(582, 1, 1, false);
    }

    /* renamed from: I7 */
    public final void mo174685I7(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C37007j.C37008a(32, z ? "0" : "1"));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C37007j(arrayList));
    }

    /* renamed from: J7 */
    public final void mo174686J7() {
        this.f344648n.removeAll();
        boolean v = this.f344645h ? false : C75592q0.m90792v();
        if (((HashMap) this.f344649o).containsKey("facebook_auth_tip")) {
            Preference preference = (Preference) ((HashMap) this.f344649o).get("facebook_auth_tip");
            preference.mo69923G(v ? C0966R.string.cla : C0966R.string.f360409cl1);
            this.f344648n.mo72527k(preference);
        }
        if (((HashMap) this.f344649o).containsKey("facebook_auth_cat")) {
            this.f344648n.mo72527k((Preference) ((HashMap) this.f344649o).get("facebook_auth_cat"));
        }
        if (v) {
            if (((HashMap) this.f344649o).containsKey("facebook_auth_account")) {
                Preference preference2 = (Preference) ((HashMap) this.f344649o).get("facebook_auth_account");
                preference2.mo69924H(getString(C0966R.string.f360411cl3) + C86709a0.m107535s().mo121142i().mo119684e(65826, (Object) null));
                this.f344648n.mo72527k(preference2);
            }
            if (((HashMap) this.f344649o).containsKey("facebook_auth_cat2")) {
                this.f344648n.mo72527k((Preference) ((HashMap) this.f344649o).get("facebook_auth_cat2"));
            }
            if (((HashMap) this.f344649o).containsKey("facebook_auth_unbind_btn")) {
                this.f344648n.mo72527k((Preference) ((HashMap) this.f344649o).get("facebook_auth_unbind_btn"));
            }
        } else if (((HashMap) this.f344649o).containsKey("facebook_auth_bind_btn")) {
            this.f344648n.mo72527k((Preference) ((HashMap) this.f344649o).get("facebook_auth_bind_btn"));
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8891al;
    }

    public void initView() {
        this.f344645h = getIntent().getBooleanExtra("is_force_unbind", false);
        this.f344643f = new C114961b();
        setMMTitle((int) C0966R.string.aj_);
        this.f344648n.mo72520b(C0966R.xml.f8891al);
        Preference a = this.f344648n.mo72519a("facebook_auth_tip");
        if (a != null) {
            ((HashMap) this.f344649o).put("facebook_auth_tip", a);
        }
        Preference a2 = this.f344648n.mo72519a("facebook_auth_cat");
        if (a2 != null) {
            ((HashMap) this.f344649o).put("facebook_auth_cat", a2);
        }
        Preference a3 = this.f344648n.mo72519a("facebook_auth_bind_btn");
        if (a3 != null) {
            ((HashMap) this.f344649o).put("facebook_auth_bind_btn", a3);
        }
        Preference a4 = this.f344648n.mo72519a("facebook_auth_account");
        if (a4 != null) {
            ((HashMap) this.f344649o).put("facebook_auth_account", a4);
        }
        Preference a5 = this.f344648n.mo72519a("facebook_auth_cat2");
        if (a5 != null) {
            ((HashMap) this.f344649o).put("facebook_auth_cat2", a5);
        }
        Preference a6 = this.f344648n.mo72519a("facebook_auth_unbind_btn");
        if (a6 != null) {
            ((HashMap) this.f344649o).put("facebook_auth_unbind_btn", a6);
        }
        setBackBtn(new C114962c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = new Object[3];
        int i3 = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105925i("MicroMsg.FacebookAuthUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i2 == -1 && i == 1024 && intent != null) {
            String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            Object[] objArr2 = new Object[3];
            objArr2[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
            if (!Util.isNullOrNil(stringExtra)) {
                i3 = stringExtra.length();
            }
            objArr2[1] = Integer.valueOf(i3);
            objArr2[2] = Integer.valueOf(intExtra);
            Log.m105925i("MicroMsg.FacebookAuthUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                mo174684H7();
                return;
            }
        }
        C116102h hVar = this.f344641d;
        if (hVar != null) {
            hVar.mo177419b(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344648n = getPreferenceScreen();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C116102h hVar = this.f344641d;
        if (hVar != null) {
            hVar.mo177420c(this);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = getIntent();
            intent.putExtra("bind_facebook_succ", this.f344646i);
            setResult(-1, intent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f344650p.dead();
        C86709a0.m107524d().mo123470p(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED, this);
        C86709a0.m107524d().mo123470p(254, this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str == null) {
            Log.m105920e("MicroMsg.FacebookAuthUI", "onPreferenceTreeClick, key is null");
            return true;
        } else if (str.equals("facebook_auth_bind_btn")) {
            try {
                C116102h hVar = this.f344641d;
                hVar.getClass();
                CookieManager.getInstance().removeAllCookie();
                hVar.mo177424h((String) null);
                hVar.f348441b = 0;
                hVar.mo177425i(this);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FacebookAuthUI", e, "", new Object[0]);
            }
            C116102h hVar2 = new C116102h();
            this.f344641d = hVar2;
            hVar2.mo177418a(this, f344640q, new C114969j((C1149591) null));
            return true;
        } else if (!str.equals("facebook_auth_unbind_btn")) {
            return false;
        } else {
            C76879j.m92743n(this, C0966R.string.cl9, C0966R.string.a3h, new C114963d(), new C114964e(this));
            return true;
        }
    }

    public void onResume() {
        this.f344650p.alive();
        super.onResume();
        C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED, this);
        C86709a0.m107524d().mo123455a(254, this);
        mo174686J7();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C75700k0.class;
        if (yVar.getType() == 254) {
            if (i == 0 && i2 == 0) {
                this.f344644g = new C8521g0(0, "");
                C86709a0.m107524d().mo123460f(this.f344644g);
                return;
            }
            ProgressDialog progressDialog = this.f344642e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (i2 == -82) {
                C76879j.m92742m(this, C0966R.string.ion, C0966R.string.a3h, new C114965f(this));
            } else if (i2 == -83) {
                C76879j.m92742m(this, C0966R.string.iok, C0966R.string.a3h, new C114966g(this));
            } else if (i2 == -84) {
                C76879j.m92742m(this, C0966R.string.iol, C0966R.string.a3h, new C114967h(this));
            } else if (i2 == -85) {
                C76879j.m92742m(this, C0966R.string.ioj, C0966R.string.a3h, new C114968i(this));
            } else if (i2 == -86) {
                C76879j.m92742m(this, C0966R.string.iop, C0966R.string.a3h, new C114960a(this));
            } else if (i2 == -106) {
                C13665i0.m12970c(this, str, 0);
            } else if (i2 == -217) {
                C13665i0.m12973f(this, C118276e.m166845a((C114735a0) yVar), i2);
            } else {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                }
            }
        } else if (yVar.getType() == 183) {
            ProgressDialog progressDialog2 = this.f344642e;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            int i3 = ((C8521g0) yVar).f27565f;
            if (i == 0 && i2 == 0) {
                C76701a.makeText((Context) this, i3 == 0 ? C0966R.string.bma : C0966R.string.bm7, 1).show();
                this.f344645h = false;
                mo174686J7();
                if (i3 == 1) {
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f("facebookapp");
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101089TE("facebookapp");
                    this.f344646i = true;
                }
            } else if (i == 4 && i2 == -67) {
                C76701a.makeText((Context) this, (int) C0966R.string.cl5, 1).show();
            } else if (i == 4 && i2 == -5) {
                C76701a.makeText((Context) this, i3 == 1 ? C0966R.string.ckz : C0966R.string.cl8, 1).show();
            } else if (i2 == -106) {
                C13665i0.m12970c(this, str, 0);
            } else {
                C7660a a2 = C7660a.m7782a(str);
                if (a2 != null) {
                    a2.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                } else {
                    C76701a.makeText((Context) this, i3 == 0 ? C0966R.string.bm_ : C0966R.string.bm6, 1).show();
                }
            }
        }
    }
}
