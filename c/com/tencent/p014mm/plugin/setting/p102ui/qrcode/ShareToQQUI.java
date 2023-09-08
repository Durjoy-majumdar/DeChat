package com.tencent.p014mm.plugin.setting.p102ui.qrcode;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import cn2.C0893a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.account.p024ui.MMFBAuthUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import jg0.C117355j;
import jg0.C9399k;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p154fy.C8217g;
import p154fy.C87121j;
import p910lj.C76701a;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI */
public class ShareToQQUI extends MMActivity implements C11385n {

    /* renamed from: i */
    public static final /* synthetic */ int f20621i = 0;

    /* renamed from: d */
    public ProgressDialog f20622d = null;

    /* renamed from: e */
    public EditText f20623e;

    /* renamed from: f */
    public int f20624f;

    /* renamed from: g */
    public C116102h f20625g;

    /* renamed from: h */
    public boolean f20626h = false;

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI$a */
    public class C5183a implements MenuItem.OnMenuItemClickListener {
        public C5183a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareToQQUI.this.hideVKB();
            ShareToQQUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI$b */
    public class C5184b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI$b$a */
        public class C5185a extends C9399k {
            public C5185a(C5184b bVar) {
            }

            /* renamed from: a */
            public void mo779a(int i, String str) {
                super.mo779a(i, str);
            }

            /* renamed from: b */
            public void mo780b(Bundle bundle) {
                super.mo780b(bundle);
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI$b$b */
        public class C5186b implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C8217g f20629d;

            public C5186b(C5184b bVar, C8217g gVar) {
                this.f20629d = gVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d((C117747y) this.f20629d);
            }
        }

        public C5184b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C8217g gVar;
            Class cls = C87121j.class;
            ShareToQQUI shareToQQUI = ShareToQQUI.this;
            shareToQQUI.f20626h = true;
            int i = shareToQQUI.f20624f;
            if (i == 2 || i == 1) {
                C87121j jVar = (C87121j) C86312j.m106911c(cls);
                String obj = ShareToQQUI.this.f20623e.getText().toString();
                int i2 = ShareToQQUI.this.f20624f;
                gVar = jVar.Tf0(obj, i2 == 1, false, i2 == 2, true);
            } else if (i == 4) {
                long nullAsNil = Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119684e(65831, (Object) null));
                String nullAsNil2 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(65830, (Object) null));
                if (Util.milliSecondsToNow(nullAsNil) > 86400000 && nullAsNil2.length() > 0) {
                    ShareToQQUI.this.f20625g = new C116102h();
                    ShareToQQUI.this.f20625g.mo177424h(nullAsNil2);
                    new C117355j(ShareToQQUI.this.f20625g, new C5185a(this)).mo182018c();
                }
                gVar = ((C87121j) C86312j.m106911c(cls)).mo71212Kr(ShareToQQUI.this.f20623e.getText().toString());
            } else {
                C76879j.m92738i(shareToQQUI.getContext(), C0966R.string.j6f, C0966R.string.a3h);
                return true;
            }
            C86709a0.m107524d().mo123460f((C117747y) gVar);
            ShareToQQUI shareToQQUI2 = ShareToQQUI.this;
            shareToQQUI2.f20622d = C76879j.m92723Q(shareToQQUI2.getContext(), ShareToQQUI.this.getString(C0966R.string.a3h), ShareToQQUI.this.getString(C0966R.string.a2w), true, true, new C5186b(this, gVar));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI$c */
    public class C5187c implements DialogInterface.OnClickListener {
        public C5187c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(ShareToQQUI.this.getContext(), MMFBAuthUI.class);
            intent.putExtra("is_force_unbind", true);
            AppCompatActivity context = ShareToQQUI.this.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/qrcode/ShareToQQUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/qrcode/ShareToQQUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ShareToQQUI.this.hideVKB();
            ShareToQQUI.this.finish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a0b;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iln);
        this.f20623e = (EditText) findViewById(C0966R.C0970id.br8);
        EditText editText = this.f20623e;
        editText.addTextChangedListener(new MMEditText.C7040d(editText, (TextView) findViewById(C0966R.C0970id.lr4), 280));
        int intExtra = getIntent().getIntExtra("show_to", 2);
        this.f20624f = intExtra;
        if (intExtra == 4) {
            this.f20623e.setText(C0966R.string.ikp);
        } else {
            this.f20623e.setText(C0966R.string.ikr);
        }
        setBackBtn(new C5183a());
        addTextOptionMenu(0, getString(C0966R.string.f360097a31), new C5184b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(26, this);
        initView();
        if (C75592q0.m90792v()) {
            C116102h hVar = new C116102h();
            hVar.mo177424h(Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(65830, (Object) null)));
            new C117355j(hVar, new C0893a(this)).mo182018c();
        }
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(26, this);
        C116102h hVar = this.f20625g;
        if (hVar != null) {
            hVar.mo177420c(this);
        }
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ShareToQQUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar.getType() == 26) {
            ProgressDialog progressDialog = this.f20622d;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f20622d = null;
            }
            if (i == 4 && i2 == -68) {
                if (Util.isNullOrNil(str)) {
                    str = "error";
                }
                C76879j.m92750u(this, str, getString(C0966R.string.a3h), new C5187c(), (DialogInterface.OnClickListener) null);
            } else if (i == 0 && i2 == 0) {
                hideVKB();
                String string = getString(C0966R.string.j6i);
                if (!isFinishing()) {
                    C76701a.makeText((Context) this, (CharSequence) string, 0).show();
                }
            } else {
                this.f20626h = false;
                if (!C14049d.m13402a().mo93163uP(getContext(), i, i2, str)) {
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.j6h, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            }
        }
    }
}
