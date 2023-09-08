package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7018q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C28611c;
import p011cm.C39989b;
import p196ln.C76705f;
import p196ln.C76708i;
import p227rn.C48052u;
import p227rn.C48054w;
import p910lj.C76701a;
import qo3.C89779i0;
import tv2.C14096e;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI */
public class AppBrandOpenWeRunSettingUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ImageView f108877d;

    /* renamed from: e */
    public TextView f108878e;

    /* renamed from: f */
    public TextView f108879f;

    /* renamed from: g */
    public TextView f108880g;

    /* renamed from: h */
    public TextView f108881h;

    /* renamed from: i */
    public C72996z1 f108882i = null;

    /* renamed from: j */
    public C89779i0 f108883j;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI$a */
    public class C40531a implements View.OnClickListener {
        public C40531a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandOpenWeRunSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14096e.m13447a(13);
            AppBrandOpenWeRunSettingUI appBrandOpenWeRunSettingUI = AppBrandOpenWeRunSettingUI.this;
            C89779i0 Q = C76879j.m92723Q(appBrandOpenWeRunSettingUI, appBrandOpenWeRunSettingUI.getString(C0966R.string.a3h), appBrandOpenWeRunSettingUI.getString(C0966R.string.iww), true, true, (DialogInterface.OnCancelListener) null);
            appBrandOpenWeRunSettingUI.f108883j = Q;
            Q.show();
            C86709a0.m107529k().f251779b.mo123455a(30, appBrandOpenWeRunSettingUI);
            LinkedList linkedList = new LinkedList();
            linkedList.add("gh_43f2581f6fd6");
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(1);
            C86709a0.m107529k().f251779b.mo123460f((C117747y) ((C39989b) C86312j.m106911c(C39989b.class)).Ya0(1, linkedList, linkedList2, "", ""));
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandOpenWeRunSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI$b */
    public class C40532b implements MenuItem.OnMenuItemClickListener {
        public C40532b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppBrandOpenWeRunSettingUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI$c */
    public class C40533c implements C75597w2.C31525a {
        public C40533c() {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105925i("MicroMsg.AppBrandOpenWeRunSettingUI", "getContactCallBack, suc = %b,user %s", Boolean.valueOf(z), str);
            AppBrandOpenWeRunSettingUI.this.f108882i = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get("gh_43f2581f6fd6");
            AppBrandOpenWeRunSettingUI.this.mo63379H7();
            AppBrandOpenWeRunSettingUI.this.f108883j.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI$d */
    public class C40534d implements Runnable {
        public C40534d() {
        }

        public void run() {
            AppBrandOpenWeRunSettingUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo63379H7() {
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f108877d, this.f108882i.getUsername());
        this.f108878e.setText(this.f108882i.mo62898f());
        if (this.f108882i.mo62927s3()) {
            this.f108879f.setTextColor(C7018q1.m7264b(getContext()));
            this.f108879f.setText(C0966R.string.iwu);
            this.f108879f.setCompoundDrawablesWithIntrinsicBounds(C0966R.C0969drawable.f357362bm1, 0, 0, 0);
            this.f108881h.setText(C0966R.string.iwu);
            this.f108881h.setClickable(false);
            return;
        }
        this.f108879f.setTextColor(C7018q1.m7263a(getContext()));
        this.f108879f.setText(C0966R.string.f361322ix1);
        this.f108879f.setCompoundDrawablesWithIntrinsicBounds(C0966R.C0969drawable.f357361bm0, 0, 0, 0);
        this.f108881h.setText(C0966R.string.iwt);
        this.f108881h.setClickable(true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6429em;
    }

    public final void init() {
        setBackBtn(new C40532b());
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("OpenWeRunSettingName"));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get("gh_43f2581f6fd6");
        this.f108882i = z1Var;
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            C89779i0 Q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
            this.f108883j = Q;
            Q.show();
            C31519v2.m39436a().mo55988e("gh_43f2581f6fd6", "", new C40533c());
        }
        this.f108880g.setText(getString(C0966R.string.f7771r6, new Object[]{nullAsNil}));
        mo63379H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(C0966R.string.f7769r4));
        this.f108877d = (ImageView) findViewById(C0966R.C0970id.hmw);
        this.f108878e = (TextView) findViewById(C0966R.C0970id.hmx);
        this.f108879f = (TextView) findViewById(C0966R.C0970id.hmz);
        this.f108880g = (TextView) findViewById(C0966R.C0970id.f358884hn1);
        TextView textView = (TextView) findViewById(C0966R.C0970id.hmy);
        this.f108881h = textView;
        textView.setOnClickListener(new C40531a());
        init();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C75700k0.class;
        Class cls2 = C48054w.class;
        if (yVar instanceof C28611c) {
            C86709a0.m107529k().f251779b.mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C28611c) yVar).mo56091T0();
                Log.m105925i("MicroMsg.AppBrandOpenWeRunSettingUI", "bind fitness contact %s success", T0);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_43f2581f6fd6");
                this.f108882i = z1Var;
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105920e("MicroMsg.AppBrandOpenWeRunSettingUI", "respUsername == " + T0 + ", contact = " + z1Var);
                } else {
                    C48052u uVar = null;
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        C48052u v = ((C48054w) C86312j.m106911c(cls2)).mo72625v(nullAsNil);
                        if (v != null) {
                            v.setUsername(T0);
                        }
                        ((C48054w) C86312j.m106911c(cls2)).mo72623d0(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                        uVar = v;
                    }
                    z1Var.setUsername(T0);
                    if (((int) z1Var.f108320R1) == 0) {
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.AppBrandOpenWeRunSettingUI", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
                        if (uVar != null) {
                            ((C48054w) C86312j.m106911c(cls2)).mo72621Uu(uVar);
                        } else {
                            Class cls3 = C76708i.class;
                            C48052u v2 = ((C48054w) C86312j.m106911c(cls2)).mo72625v(z1Var2.getUsername());
                            if (v2 == null || v2.mo72809G1()) {
                                Log.m105918d("MicroMsg.AppBrandOpenWeRunSettingUI", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105919d("MicroMsg.AppBrandOpenWeRunSettingUI", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C48052u uVar2 = ((C48054w) C86312j.m106911c(cls2)).get(this.f108882i.getUsername());
                if (uVar2 != null) {
                    ((C48054w) C86312j.m106911c(cls2)).mo72620Nf(uVar2);
                }
                C86709a0.m107535s().mo121142i().mo119676J(327825, Boolean.TRUE);
                setResult(-1);
                MMHandlerThread.postToMainThreadDelayed(new C40534d(), 1500);
            } else {
                Log.m105921e("MicroMsg.AppBrandOpenWeRunSettingUI", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
                }
                setResult(1);
            }
            C89779i0 i0Var = this.f108883j;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            mo63379H7();
        }
    }
}
