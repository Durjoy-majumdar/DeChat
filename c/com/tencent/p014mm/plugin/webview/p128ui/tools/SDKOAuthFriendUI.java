package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.model.C43719j0;
import com.tencent.p014mm.plugin.webview.model.C85518c1;
import com.tencent.p014mm.plugin.webview.model.C85522l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import ea3.C7608b;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import qo3.C89779i0;
import te3.C90407dx3;
import te3.C90442v43;
import vo3.C90852c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI */
public class SDKOAuthFriendUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public String f249342A;

    /* renamed from: B */
    public String f249343B;

    /* renamed from: d */
    public C85518c1 f249344d;

    /* renamed from: e */
    public C90407dx3 f249345e;

    /* renamed from: f */
    public String f249346f;

    /* renamed from: g */
    public String f249347g;

    /* renamed from: h */
    public String f249348h;

    /* renamed from: i */
    public String f249349i;

    /* renamed from: j */
    public String f249350j;

    /* renamed from: n */
    public int f249351n;

    /* renamed from: o */
    public long f249352o;

    /* renamed from: p */
    public boolean f249353p = false;

    /* renamed from: q */
    public String f249354q;

    /* renamed from: r */
    public int f249355r = 2;

    /* renamed from: s */
    public C89779i0 f249356s;

    /* renamed from: t */
    public LinkedList<String> f249357t = new LinkedList<>();

    /* renamed from: u */
    public SendAuth.Options f249358u;

    /* renamed from: v */
    public boolean f249359v = false;

    /* renamed from: w */
    public String f249360w;

    /* renamed from: x */
    public String f249361x;

    /* renamed from: y */
    public int f249362y;

    /* renamed from: z */
    public int f249363z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI$a */
    public class C85557a implements View.OnClickListener {
        public C85557a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthFriendUI sDKOAuthFriendUI = SDKOAuthFriendUI.this;
            bVar.mo8744a(sDKOAuthFriendUI.f249346f, sDKOAuthFriendUI.f249352o, 0, sDKOAuthFriendUI.f249355r, sDKOAuthFriendUI.mo118940I7(), 1, 0);
            SDKOAuthFriendUI sDKOAuthFriendUI2 = SDKOAuthFriendUI.this;
            sDKOAuthFriendUI2.f249344d.mo118910c(-2, sDKOAuthFriendUI2.f249358u, sDKOAuthFriendUI2.f249360w, sDKOAuthFriendUI2.f249362y, sDKOAuthFriendUI2.f249359v);
            SDKOAuthFriendUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI$b */
    public class C85558b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C90442v43 f249365d;

        public C85558b(C90442v43 v432) {
            this.f249365d = v432;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthFriendUI sDKOAuthFriendUI = SDKOAuthFriendUI.this;
            bVar.mo8744a(sDKOAuthFriendUI.f249346f, sDKOAuthFriendUI.f249352o, 1, sDKOAuthFriendUI.f249355r, sDKOAuthFriendUI.mo118940I7(), 1, 0);
            SDKOAuthFriendUI.m105580H7(SDKOAuthFriendUI.this, true, this.f249365d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI$c */
    public class C85559c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C90442v43 f249367d;

        public C85559c(C90442v43 v432) {
            this.f249367d = v432;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthFriendUI sDKOAuthFriendUI = SDKOAuthFriendUI.this;
            bVar.mo8744a(sDKOAuthFriendUI.f249346f, sDKOAuthFriendUI.f249352o, 0, sDKOAuthFriendUI.f249355r, sDKOAuthFriendUI.mo118940I7(), 1, 0);
            SDKOAuthFriendUI.m105580H7(SDKOAuthFriendUI.this, false, this.f249367d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m105580H7(SDKOAuthFriendUI sDKOAuthFriendUI, boolean z, C90442v43 v432) {
        SDKOAuthFriendUI sDKOAuthFriendUI2 = sDKOAuthFriendUI;
        if (z) {
            sDKOAuthFriendUI2.f249357t.add(sDKOAuthFriendUI2.f249347g);
            Log.m105925i("MicroMsg.SDKOAuthFriendUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", C85518c1.m105531k(sDKOAuthFriendUI2.f249357t));
        } else {
            sDKOAuthFriendUI.getClass();
            if (v432.f259864f == 3) {
                Log.m105924i("MicroMsg.SDKOAuthFriendUI", "user disagree + but must agree => cancel");
                sDKOAuthFriendUI2.f249344d.mo118910c(-4, sDKOAuthFriendUI2.f249358u, sDKOAuthFriendUI2.f249360w, sDKOAuthFriendUI2.f249362y, sDKOAuthFriendUI2.f249359v);
                return;
            }
        }
        if (!C85518c1.m105533m(sDKOAuthFriendUI2.f249345e)) {
            Log.m105924i("MicroMsg.SDKOAuthFriendUI", "only page 2");
            if (C85518c1.m105529b(sDKOAuthFriendUI2.f249345e, sDKOAuthFriendUI2.f249353p).booleanValue()) {
                Log.m105924i("MicroMsg.SDKOAuthFriendUI", "go to SDKOAuthAppDataUI");
                sDKOAuthFriendUI2.mo118942K7(sDKOAuthFriendUI2.f249345e, SDKOAuthAppDataUI.class, sDKOAuthFriendUI2.f249351n);
                C85518c1.m105530f(sDKOAuthFriendUI);
                return;
            }
            Log.m105924i("MicroMsg.SDKOAuthFriendUI", "doAuthDirectly");
            if (sDKOAuthFriendUI2.f249357t.size() > 0) {
                Log.m105925i("MicroMsg.SDKOAuthFriendUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", Boolean.valueOf(sDKOAuthFriendUI2.f249353p), Integer.valueOf(sDKOAuthFriendUI2.f249357t.size()));
                C89779i0 i0Var = sDKOAuthFriendUI2.f249356s;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                sDKOAuthFriendUI2.f249356s = C76879j.m92723Q(sDKOAuthFriendUI, (String) null, sDKOAuthFriendUI2.getString(C0966R.string.a4d), true, true, new C85567a0(sDKOAuthFriendUI2));
                if (sDKOAuthFriendUI2.f249353p) {
                    sDKOAuthFriendUI2.f249344d.mo118914h(1, sDKOAuthFriendUI2.f249357t, sDKOAuthFriendUI2.f249351n, sDKOAuthFriendUI2.f249354q);
                    return;
                }
                sDKOAuthFriendUI2.f249344d.mo118915i(1, sDKOAuthFriendUI2.f249357t, sDKOAuthFriendUI2.f249351n, sDKOAuthFriendUI2.f249360w, sDKOAuthFriendUI2.f249362y, (C89349b) null, Boolean.FALSE, sDKOAuthFriendUI2.f249359v);
                return;
            }
            sDKOAuthFriendUI2.f249344d.mo118910c(-4, sDKOAuthFriendUI2.f249358u, sDKOAuthFriendUI2.f249360w, sDKOAuthFriendUI2.f249362y, sDKOAuthFriendUI2.f249359v);
            return;
        }
        Log.m105924i("MicroMsg.SDKOAuthFriendUI", "go to SDKOAuthOtherUI");
        sDKOAuthFriendUI2.mo118942K7(sDKOAuthFriendUI2.f249345e, SDKOAuthOtherUI.class, sDKOAuthFriendUI2.f249351n);
        C85518c1.m105530f(sDKOAuthFriendUI);
    }

    /* renamed from: I7 */
    public final int mo118940I7() {
        return "snsapi_friend".equals(this.f249347g) ? 3 : 4;
    }

    /* renamed from: J7 */
    public final void mo118941J7() {
        int i = getResources().getConfiguration().orientation;
        View findViewById = findViewById(C0966R.C0970id.og8);
        if (findViewById != null) {
            int i2 = 0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            if (i == 2) {
                i2 = C76577a.m92151b(this, 12);
            } else if (i == 1) {
                i2 = C76577a.m92151b(this, 96);
            }
            layoutParams.bottomMargin = i2;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: K7 */
    public final void mo118942K7(C90407dx3 dx32, Class<?> cls, int i) {
        Log.m105924i("MicroMsg.SDKOAuthFriendUI", "startScopeActivity  cls:" + cls);
        Intent intent = new Intent(this, cls);
        intent.putExtra("0", this.f249346f);
        intent.putExtra("1", this.f249348h);
        intent.putExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, this.f249349i);
        intent.putExtra("7", this.f249350j);
        intent.putExtra("3", i);
        intent.putExtra("auth_raw_url", this.f249354q);
        intent.putExtra("has_selected_scope", this.f249357t);
        intent.putExtra("auth_from_scan", this.f249353p);
        intent.putExtra("auth_isoption1", this.f249359v);
        if (!Util.isNullOrNil(this.f249360w)) {
            intent.putExtra("key_open_sdk_token", this.f249360w);
        }
        if (!Util.isNullOrNil(this.f249361x)) {
            intent.putExtra("key_open_sdk_pkg_name", this.f249361x);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.f249362y);
        intent.putExtra("key_open_sdk_version", this.f249363z);
        SendAuth.Options options = this.f249358u;
        if (options != null && !Util.isNullOrNil(options.callbackClassName)) {
            Bundle bundle = new Bundle();
            this.f249358u.toBundle(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", dx32.toByteArray());
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bv6;
    }

    public final void init() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        ((TextView) findViewById(C0966R.C0970id.fmi)).setOnClickListener(new C85557a());
        Intent intent = getIntent();
        this.f249346f = intent.getStringExtra("0");
        this.f249347g = intent.getStringExtra("auth_scope");
        this.f249348h = intent.getStringExtra("1");
        this.f249357t = new LinkedList<>(intent.getStringArrayListExtra("has_selected_scope"));
        try {
            this.f249345e = (C90407dx3) new C90407dx3().parseFrom(intent.getByteArrayExtra("2"));
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f249349i = intent.getStringExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        this.f249350j = intent.getStringExtra("7");
        this.f249353p = intent.getBooleanExtra("auth_from_scan", false);
        this.f249360w = intent.getStringExtra("key_open_sdk_token");
        this.f249361x = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f249362y = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f249363z = intent.getIntExtra("key_open_sdk_version", 0);
        Log.m105925i("MicroMsg.SDKOAuthFriendUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.f249361x, Integer.valueOf(this.f249362y), Integer.valueOf(this.f249363z));
        if (this.f249353p) {
            this.f249355r = 3;
            String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f249354q = stringExtra;
            this.f249344d = new C85518c1(this, true, this.f249346f, stringExtra);
        } else {
            this.f249344d = new C85518c1(this, this.f249346f, this.f249348h, this.f249349i, this.f249350j);
        }
        this.f249351n = intent.getIntExtra("3", -1);
        this.f249359v = intent.getBooleanExtra("auth_isoption1", false);
        Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            SendAuth.Options options = new SendAuth.Options();
            this.f249358u = options;
            options.fromBundle(bundleExtra);
            Log.m105924i("MicroMsg.SDKOAuthFriendUI", "options.callbackClassName: " + this.f249358u.callbackClassName + "  options.callbackFlags: " + this.f249358u.callbackFlags);
        } else {
            Log.m105924i("MicroMsg.SDKOAuthFriendUI", "SendAuth.options, bundle is null");
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.a0a);
        Iterator<C90442v43> it = this.f249345e.f259468d.iterator();
        while (it.hasNext()) {
            C90442v43 next = it.next();
            if (next.f259862d.equals(this.f249347g)) {
                textView.setText(next.f259863e);
            }
        }
        textView.getPaint().setFakeBoldText(true);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.a0_);
        if (!Util.isNullOrNil(this.f249345e.f259483v)) {
            textView2.setVisibility(0);
            textView2.setText(this.f249345e.f259483v);
        } else {
            textView2.setVisibility(8);
        }
        C85518c1 c1Var = this.f249344d;
        C90407dx3 dx32 = this.f249345e;
        c1Var.f249209i = dx32.f259485x;
        this.f249342A = dx32.f259470f;
        this.f249343B = dx32.f259469e;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.raw.native_oauth_default_head_img;
        bVar.f59365u = getResources().getDimension(C0966R.dimen.f357059am2);
        bVar.f59364t = true;
        C20828a.m22825b().mo32519h(this.f249345e.f259470f, (ImageView) findViewById(C0966R.C0970id.hb7), bVar.mo32666a());
        ((TextView) findViewById(C0966R.C0970id.hbb)).setText(this.f249345e.f259469e);
        C90442v43 n = C85518c1.m105534n(this.f249347g, this.f249345e.f259468d);
        this.f249352o = System.currentTimeMillis();
        ((Button) findViewById(C0966R.C0970id.g5q)).setOnClickListener(new C85558b(n));
        ((Button) findViewById(C0966R.C0970id.g5u)).setOnClickListener(new C85559c(n));
        mo118941J7();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m105918d("MicroMsg.SDKOAuthFriendUI", "configuration changed");
        super.onConfigurationChanged(configuration);
        mo118941J7();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.SDKOAuthFriendUI", "onCreate");
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(1346, this);
        C86709a0.m107524d().mo123455a(1137, this);
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f249356s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C86709a0.m107524d().mo123470p(1346, this);
        C86709a0.m107524d().mo123470p(1137, this);
        Log.m105924i("MicroMsg.SDKOAuthFriendUI", "onDestroy");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f249344d.mo118910c(-2, this.f249358u, this.f249360w, this.f249362y, this.f249359v);
        C7608b.INSTANCE.mo8744a(this.f249346f, this.f249352o, 0, this.f249355r, mo118940I7(), 1, 0);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.SDKOAuthFriendUI", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.SDKOAuthFriendUI", "onResume");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        if (!(i == 0 && i2 == 0)) {
            C7608b.INSTANCE.mo8744a(this.f249346f, this.f249352o, 2, this.f249355r, mo118940I7(), 1, i2);
        }
        C89779i0 i0Var = this.f249356s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (yVar2 instanceof C85522l0) {
            this.f249344d.mo118919r(this, this.f249360w, this.f249363z, this.f249361x, this.f249362y, this.f249342A, this.f249343B, i, i2, str, yVar, this.f249358u, this.f249359v);
        } else if (yVar2 instanceof C43719j0) {
            this.f249344d.mo118918q(i, i2, str, yVar, this.f249358u);
        }
    }
}
