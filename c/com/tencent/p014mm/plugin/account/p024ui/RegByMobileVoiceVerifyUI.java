package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.p024ui.LanguagePreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import f40.C86718e;
import hg0.C76170j0;
import j20.C117292a;
import java.util.ArrayList;
import nc0.C76850a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI */
public class RegByMobileVoiceVerifyUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public String f196726d;

    /* renamed from: e */
    public String f196727e;

    /* renamed from: f */
    public String f196728f;

    /* renamed from: g */
    public TextView f196729g;

    /* renamed from: h */
    public C67216a f196730h;

    /* renamed from: i */
    public C76170j0 f196731i;

    /* renamed from: j */
    public int f196732j = 0;

    /* renamed from: n */
    public String f196733n;

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI$a */
    public class C68473a implements MenuItem.OnMenuItemClickListener {
        public C68473a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegByMobileVoiceVerifyUI.this.hideVKB();
            RegByMobileVoiceVerifyUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI$b */
    public class C68474b implements View.OnClickListener {
        public C68474b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RegByMobileVoiceVerifyUI.this.startActivityForResult(new Intent(RegByMobileVoiceVerifyUI.this, RegByMobileVoiceVerifySelectUI.class).putExtra("voice_verify_code", RegByMobileVoiceVerifyUI.this.f196728f), 10000);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI$c */
    public class C68475c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI$c$a */
        public class C68476a implements DialogInterface.OnClickListener {
            public C68476a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RegByMobileVoiceVerifyUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI$c$b */
        public class C68477b implements DialogInterface.OnClickListener {
            public C68477b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RegByMobileVoiceVerifyUI.this.finish();
            }
        }

        public C68475c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RegByMobileVoiceVerifyUI regByMobileVoiceVerifyUI = RegByMobileVoiceVerifyUI.this;
            int i = regByMobileVoiceVerifyUI.f196732j;
            if (i == 0 || i == 2 || i == 3) {
                regByMobileVoiceVerifyUI.f196730h = new C67216a(regByMobileVoiceVerifyUI.f196726d, i != 0 ? i != 2 ? 16 : 8 : 14, "", 1, regByMobileVoiceVerifyUI.f196728f);
                C86709a0.m107524d().mo123460f(RegByMobileVoiceVerifyUI.this.f196730h);
                C76879j.m92742m(RegByMobileVoiceVerifyUI.this, C0966R.string.all, C0966R.string.a3h, new C68476a());
            } else if (i == 4 || i == 1) {
                regByMobileVoiceVerifyUI.f196731i = new C76170j0(regByMobileVoiceVerifyUI.f196726d, 1, "", 1, regByMobileVoiceVerifyUI.f196728f, "");
                C86709a0.m107524d().mo123460f(RegByMobileVoiceVerifyUI.this.f196731i);
                C76879j.m92742m(RegByMobileVoiceVerifyUI.this, C0966R.string.all, C0966R.string.a3h, new C68477b());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6577it;
    }

    public void initView() {
        String str;
        setMMTitle((int) C0966R.string.alo);
        setBackBtn(new C68473a());
        this.f196729g = (TextView) findViewById(C0966R.C0970id.fhj);
        Button button = (Button) findViewById(C0966R.C0970id.a_0);
        String str2 = this.f196726d;
        LanguagePreference.C68448a[] H7 = RegByMobileVoiceVerifySelectUI.m80763H7();
        String d = C76850a.m92632d(str2);
        int length = H7.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = "English";
                break;
            }
            LanguagePreference.C68448a aVar = H7[i];
            if (aVar.f196669b.equalsIgnoreCase(d)) {
                str = aVar.f196668a;
                break;
            }
            i++;
        }
        this.f196727e = str;
        this.f196729g.setText(str);
        this.f196728f = C76850a.m92632d(this.f196726d);
        findViewById(C0966R.C0970id.g16).setOnClickListener(new C68474b());
        button.setOnClickListener(new C68475c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10000 && intent != null) {
            this.f196727e = intent.getStringExtra("voice_verify_language");
            this.f196728f = intent.getStringExtra("voice_verify_code");
            this.f196729g.setText(this.f196727e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f196726d = getIntent().getExtras().getString("bindmcontact_mobile");
        int i = getIntent().getExtras().getInt("voice_verify_type");
        this.f196732j = i;
        if (i == 0 || i == 2 || i == 3) {
            C86709a0.m107524d().mo123455a(145, this);
        } else if (i == 4 || i == 1) {
            C86709a0.m107524d().mo123455a(132, this);
        }
        this.f196733n = C78595a.m94981a();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(132, this);
        C86709a0.m107524d().mo123470p(145, this);
        int i = this.f196732j;
        if (i == 0 || i == 2 || i == 3) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R200_500");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_500"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C78595a.m94985e(this.f196733n);
        hideVKB();
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        int i = this.f196732j;
        if (i == 0 || i == 2 || i == 3) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(getClass().getName());
            sb.append(",");
            sb.append("R200_500");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R200_500"));
            sb.append(",");
            sb.append(1);
            C78595a.m94983c(10645, true, sb.toString());
            C78595a.m94984d("R200_500");
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.RegByMobileVoiceVerifyUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
    }
}
