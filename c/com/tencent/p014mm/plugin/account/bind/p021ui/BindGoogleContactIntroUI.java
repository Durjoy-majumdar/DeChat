package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gg0.C8274a;
import hg0.C8522h0;
import hg0.C8524u;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI */
public class BindGoogleContactIntroUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ImageView f10483d;

    /* renamed from: e */
    public TextView f10484e;

    /* renamed from: f */
    public Button f10485f;

    /* renamed from: g */
    public Button f10486g;

    /* renamed from: h */
    public boolean f10487h = false;

    /* renamed from: i */
    public String f10488i;

    /* renamed from: j */
    public ProgressDialog f10489j;

    /* renamed from: n */
    public C8522h0 f10490n;

    /* renamed from: o */
    public int f10491o;

    /* renamed from: p */
    public View.OnClickListener f10492p = new C1337a();

    /* renamed from: q */
    public View.OnClickListener f10493q = new C1338b();

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI$a */
    public class C1337a implements View.OnClickListener {
        public C1337a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(BindGoogleContactIntroUI.this, BindGoogleContactUI.class);
            intent.putExtra("enter_scene", BindGoogleContactIntroUI.this.f10491o);
            BindGoogleContactIntroUI bindGoogleContactIntroUI = BindGoogleContactIntroUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            BindGoogleContactIntroUI bindGoogleContactIntroUI2 = bindGoogleContactIntroUI;
            C117292a.m165358d(bindGoogleContactIntroUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bindGoogleContactIntroUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bindGoogleContactIntroUI2, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI$b */
    public class C1338b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI$b$a */
        public class C1339a implements DialogInterface.OnClickListener {
            public C1339a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                BindGoogleContactIntroUI bindGoogleContactIntroUI = BindGoogleContactIntroUI.this;
                bindGoogleContactIntroUI.f10490n = new C8522h0(C8522h0.C8523a.MM_BIND_GCONTACT_OPCODE_UNBIND, bindGoogleContactIntroUI.f10488i, 1);
                C86709a0.m107524d().mo123460f(bindGoogleContactIntroUI.f10490n);
                bindGoogleContactIntroUI.f10489j = C76879j.m92723Q(bindGoogleContactIntroUI, bindGoogleContactIntroUI.getString(C0966R.string.a3h), bindGoogleContactIntroUI.getString(C0966R.string.a4d), true, true, new C8274a(bindGoogleContactIntroUI));
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI$b$b */
        public class C1340b implements DialogInterface.OnClickListener {
            public C1340b(C1338b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C1338b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76879j.m92717K(BindGoogleContactIntroUI.this.getContext(), true, BindGoogleContactIntroUI.this.getString(C0966R.string.k6_), "", BindGoogleContactIntroUI.this.getString(C0966R.string.k69), BindGoogleContactIntroUI.this.getString(C0966R.string.f7926wf), new C1339a(), new C1340b(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI$c */
    public class C1341c implements MenuItem.OnMenuItemClickListener {
        public C1341c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindGoogleContactIntroUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo1276H7() {
        this.f10486g.setVisibility(8);
        this.f10485f.setVisibility(0);
        this.f10483d.setVisibility(0);
        this.f10484e.setVisibility(0);
        this.f10484e.setText(C0966R.string.ajc);
        this.f10485f.setText(C0966R.string.aja);
        this.f10485f.setOnClickListener(this.f10492p);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6570im;
    }

    public void initView() {
        setBackBtn(new C1341c());
        this.f10483d = (ImageView) findViewById(C0966R.C0970id.jd8);
        this.f10484e = (TextView) findViewById(C0966R.C0970id.jd9);
        this.f10485f = (Button) findViewById(C0966R.C0970id.jd7);
        this.f10486g = (Button) findViewById(C0966R.C0970id.jdp);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1) {
            if (i == 2005) {
                intent.getBooleanExtra("gpservices", false);
            }
        } else if (i == 2005) {
            intent.getBooleanExtra("gpservices", false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ajd);
        this.f10491o = getIntent().getIntExtra("enter_scene", 0);
        if (C8524u.m8419b(this)) {
            startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(208903, (Object) null);
        this.f10488i = str;
        if (TextUtils.isEmpty(str)) {
            this.f10487h = false;
        } else {
            this.f10487h = true;
        }
        initView();
        if (this.f10487h) {
            this.f10486g.setVisibility(0);
            this.f10485f.setVisibility(8);
            this.f10484e.setVisibility(0);
            this.f10484e.setText(getString(C0966R.string.ajb, new Object[]{this.f10488i}));
            this.f10486g.setOnClickListener(this.f10493q);
        } else {
            mo1276H7();
        }
        C86709a0.m107524d().mo123455a(487, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        Log.m105925i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        ProgressDialog progressDialog = this.f10489j;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f10489j.dismiss();
        }
        if (i == 0 && i2 == 0) {
            C86709a0.m107535s().mo121142i().mo119676J(208903, "");
            C86709a0.m107535s().mo121142i().mo119676J(208901, "");
            C86709a0.m107535s().mo121142i().mo119676J(208902, "");
            C86709a0.m107535s().mo121142i().mo119676J(208905, Boolean.TRUE);
            C86709a0.m107535s().mo121142i().mo119681a(true);
            mo1276H7();
            C76879j.m92726T(this, getString(C0966R.string.k6a));
            return;
        }
        Log.m105924i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "unbind failed");
        C76701a.makeText((Context) this, (int) C0966R.string.fdo, 0).show();
    }

    public void onStop() {
        super.onStop();
        C86709a0.m107524d().mo123470p(487, this);
    }
}
