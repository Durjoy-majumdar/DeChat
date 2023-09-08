package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p154fy.C8217g;
import p154fy.C87121j;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI */
public class ShareToQQWeiboUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ProgressDialog f22875d = null;

    /* renamed from: e */
    public EditText f22876e;

    /* renamed from: f */
    public TextView f22877f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI$a */
    public class C6195a implements MenuItem.OnMenuItemClickListener {
        public C6195a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareToQQWeiboUI.this.hideVKB();
            ShareToQQWeiboUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI$b */
    public class C6196b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.ShareToQQWeiboUI$b$a */
        public class C6197a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C8217g f22880d;

            public C6197a(C6196b bVar, C8217g gVar) {
                this.f22880d = gVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d((C117747y) this.f22880d);
            }
        }

        public C6196b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C8217g KQ = ((C87121j) C86312j.m106911c(C87121j.class)).mo71211KQ(ShareToQQWeiboUI.this.getIntent().getIntExtra("type", 0), ShareToQQWeiboUI.this.getIntent().getStringExtra("shortUrl"), ShareToQQWeiboUI.this.f22876e.getText().toString());
            C86709a0.m107524d().mo123460f((C117747y) KQ);
            ShareToQQWeiboUI shareToQQWeiboUI = ShareToQQWeiboUI.this;
            shareToQQWeiboUI.f22875d = C76879j.m92723Q(shareToQQWeiboUI.getContext(), ShareToQQWeiboUI.this.getString(C0966R.string.a3h), ShareToQQWeiboUI.this.getString(C0966R.string.lml), true, true, new C6197a(this, KQ));
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a0a;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.j6r);
        this.f22876e = (EditText) findViewById(C0966R.C0970id.br8);
        this.f22877f = (TextView) findViewById(C0966R.C0970id.lr4);
        String stringExtra = getIntent().getStringExtra("content");
        String stringExtra2 = getIntent().getStringExtra("shortUrl");
        EditText editText = this.f22876e;
        editText.addTextChangedListener(new MMEditText.C7040d(editText, this.f22877f, 280));
        if (stringExtra.contains(stringExtra2)) {
            this.f22876e.setText(stringExtra.trim());
        } else {
            EditText editText2 = this.f22876e;
            editText2.setText(stringExtra + " " + stringExtra2);
        }
        setBackBtn(new C6195a());
        addTextOptionMenu(0, getString(C0966R.string.f360097a31), new C6196b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(26, this);
        initView();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(26, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ShareToQQWeiboUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar.getType() == 26) {
            ProgressDialog progressDialog = this.f22875d;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f22875d = null;
            }
            if (i == 0 && i2 == 0) {
                hideVKB();
                setResult(-1);
                finish();
                return;
            }
            setResult(1, new Intent().putExtra("err_code", i2));
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.j6h, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }
}
