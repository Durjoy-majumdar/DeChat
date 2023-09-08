package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.p136ui.C85875k4;
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
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI */
public class SDKOAuthOtherUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public String f249369A;

    /* renamed from: B */
    public LinkedList<String> f249370B = new LinkedList<>();

    /* renamed from: d */
    public C85518c1 f249371d;

    /* renamed from: e */
    public C90407dx3 f249372e;

    /* renamed from: f */
    public C85563d f249373f;

    /* renamed from: g */
    public String f249374g;

    /* renamed from: h */
    public String f249375h;

    /* renamed from: i */
    public String f249376i;

    /* renamed from: j */
    public String f249377j;

    /* renamed from: n */
    public int f249378n;

    /* renamed from: o */
    public long f249379o;

    /* renamed from: p */
    public boolean f249380p = false;

    /* renamed from: q */
    public String f249381q;

    /* renamed from: r */
    public int f249382r = 2;

    /* renamed from: s */
    public C89779i0 f249383s;

    /* renamed from: t */
    public SendAuth.Options f249384t;

    /* renamed from: u */
    public boolean f249385u = false;

    /* renamed from: v */
    public String f249386v;

    /* renamed from: w */
    public String f249387w;

    /* renamed from: x */
    public int f249388x;

    /* renamed from: y */
    public int f249389y;

    /* renamed from: z */
    public String f249390z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI$a */
    public class C85560a implements View.OnClickListener {
        public C85560a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthOtherUI sDKOAuthOtherUI = SDKOAuthOtherUI.this;
            bVar.mo8744a(sDKOAuthOtherUI.f249374g, sDKOAuthOtherUI.f249379o, 0, sDKOAuthOtherUI.f249382r, 4, 1, 0);
            SDKOAuthOtherUI sDKOAuthOtherUI2 = SDKOAuthOtherUI.this;
            sDKOAuthOtherUI2.f249371d.mo118910c(-2, sDKOAuthOtherUI2.f249384t, sDKOAuthOtherUI2.f249386v, sDKOAuthOtherUI2.f249388x, sDKOAuthOtherUI2.f249385u);
            SDKOAuthOtherUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI$b */
    public class C85561b implements View.OnClickListener {
        public C85561b(int i, int i2) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthOtherUI sDKOAuthOtherUI = SDKOAuthOtherUI.this;
            bVar.mo8744a(sDKOAuthOtherUI.f249374g, sDKOAuthOtherUI.f249379o, 1, sDKOAuthOtherUI.f249382r, 4, 1, 0);
            SDKOAuthOtherUI.this.mo118946H7(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI$c */
    public class C85562c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f249393d;

        public C85562c(boolean z, int i, int i2) {
            this.f249393d = z;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthOtherUI sDKOAuthOtherUI = SDKOAuthOtherUI.this;
            bVar.mo8744a(sDKOAuthOtherUI.f249374g, sDKOAuthOtherUI.f249379o, 0, sDKOAuthOtherUI.f249382r, 4, 1, 0);
            SDKOAuthOtherUI sDKOAuthOtherUI2 = SDKOAuthOtherUI.this;
            if (this.f249393d) {
                sDKOAuthOtherUI2.getClass();
                Log.m105924i("MicroMsg.SDKOAuthOtherUI", "user disagree + but must agree => cancel");
                sDKOAuthOtherUI2.f249371d.mo118910c(-4, sDKOAuthOtherUI2.f249384t, sDKOAuthOtherUI2.f249386v, sDKOAuthOtherUI2.f249388x, sDKOAuthOtherUI2.f249385u);
            } else {
                sDKOAuthOtherUI2.mo118946H7(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI$d */
    public static final class C85563d extends BaseAdapter {

        /* renamed from: d */
        public LinkedList<C90442v43> f249395d;

        /* renamed from: e */
        public LayoutInflater f249396e;

        /* renamed from: f */
        public Context f249397f;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI$d$a */
        public class C85564a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C90442v43 f249398d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f249399e;

            public C85564a(C85563d dVar, C90442v43 v432, ImageView imageView) {
                this.f249398d = v432;
                this.f249399e = imageView;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int i = this.f249398d.f259864f;
                if (i == 2) {
                    this.f249399e.setImageResource(C0966R.C0969drawable.f4825o0);
                    this.f249398d.f259864f = 1;
                } else if (i == 1) {
                    this.f249399e.setImageResource(C0966R.raw.checkbox_selected_small);
                    this.f249398d.f259864f = 2;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI$d$b */
        public static final class C85565b {

            /* renamed from: a */
            public ImageView f249400a;

            /* renamed from: b */
            public TextView f249401b;
        }

        public C85563d(Context context, LinkedList<C90442v43> linkedList) {
            this.f249396e = LayoutInflater.from(context);
            this.f249395d = linkedList;
            this.f249397f = context;
        }

        public int getCount() {
            LinkedList<C90442v43> linkedList = this.f249395d;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size();
        }

        public Object getItem(int i) {
            if (i < 0 || i >= this.f249395d.size()) {
                return null;
            }
            return this.f249395d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C85565b bVar;
            LinkedList<C90442v43> linkedList = this.f249395d;
            if (linkedList == null || linkedList.size() <= 0) {
                return null;
            }
            C90442v43 v432 = (i < 0 || i >= this.f249395d.size()) ? null : this.f249395d.get(i);
            if (v432 == null) {
                return view;
            }
            if (view == null) {
                bVar = new C85565b();
                view2 = this.f249396e.inflate(C0966R.C0971layout.f359962bv2, (ViewGroup) null, false);
                bVar.f249400a = (ImageView) view2.findViewById(C0966R.C0970id.f5861qo);
                bVar.f249401b = (TextView) view2.findViewById(C0966R.C0970id.f5860qn);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (C85565b) view.getTag();
            }
            int i2 = v432.f259864f;
            if (i2 == 1) {
                bVar.f249400a.setImageResource(C0966R.C0969drawable.f4825o0);
            } else if (i2 == 3) {
                bVar.f249400a.setImageResource(C85875k4.m106211z() ? C0966R.raw.checkbox_selected_grey_dark_small : C0966R.raw.checkbox_selected_grey_small);
            } else {
                bVar.f249400a.setImageResource(C0966R.raw.checkbox_selected_small);
            }
            bVar.f249401b.setText(v432.f259863e);
            ImageView imageView = bVar.f249400a;
            imageView.setOnClickListener(new C85564a(this, v432, imageView));
            return view2;
        }
    }

    /* renamed from: H7 */
    public final void mo118946H7(boolean z) {
        Log.m105924i("MicroMsg.SDKOAuthOtherUI", "accept go  MPGdprPolicyUtil.checkPolicy");
        if (z) {
            LinkedList<String> linkedList = this.f249370B;
            C85563d dVar = this.f249373f;
            dVar.getClass();
            LinkedList linkedList2 = new LinkedList();
            for (int i = 0; i < dVar.f249395d.size(); i++) {
                C90442v43 v432 = dVar.f249395d.get(i);
                int i2 = v432.f259864f;
                if (i2 == 2 || i2 == 3) {
                    linkedList2.add(v432.f259862d);
                }
            }
            linkedList.addAll(linkedList2);
            Log.m105925i("MicroMsg.SDKOAuthOtherUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", C85518c1.m105531k(this.f249370B));
        }
        if (C85518c1.m105529b(this.f249372e, this.f249380p).booleanValue()) {
            Log.m105924i("MicroMsg.SDKOAuthOtherUI", "go to SDKOAuthAppDataUI");
            C90407dx3 dx32 = this.f249372e;
            Class<SDKOAuthAppDataUI> cls = SDKOAuthAppDataUI.class;
            LinkedList<String> linkedList3 = this.f249370B;
            int i3 = this.f249378n;
            Log.m105924i("MicroMsg.SDKOAuthOtherUI", "startScopeActivity  cls:" + cls);
            Intent intent = new Intent(this, cls);
            intent.putExtra("0", this.f249374g);
            intent.putExtra("1", this.f249375h);
            intent.putExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, this.f249376i);
            intent.putExtra("7", this.f249377j);
            intent.putExtra("3", i3);
            intent.putExtra("auth_raw_url", this.f249381q);
            intent.putExtra("auth_from_scan", this.f249380p);
            intent.putExtra("has_selected_scope", linkedList3);
            intent.putExtra("auth_isoption1", this.f249385u);
            if (!Util.isNullOrNil(this.f249386v)) {
                intent.putExtra("key_open_sdk_token", this.f249386v);
            }
            if (!Util.isNullOrNil(this.f249387w)) {
                intent.putExtra("key_open_sdk_pkg_name", this.f249387w);
            }
            intent.putExtra("key_open_sdk_authentication_result", this.f249388x);
            intent.putExtra("key_open_sdk_version", this.f249389y);
            SendAuth.Options options = this.f249384t;
            if (options != null && !Util.isNullOrNil(options.callbackClassName)) {
                Bundle bundle = new Bundle();
                this.f249384t.toBundle(bundle);
                intent.putExtra("send_auth_option", bundle);
            }
            try {
                intent.putExtra("2", dx32.toByteArray());
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.SDKOAuthOtherUI", "SdkOauthAuthorizeResp toByteArray failed");
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/util/LinkedList;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/util/LinkedList;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C85518c1.m105530f(this);
            return;
        }
        Log.m105924i("MicroMsg.SDKOAuthOtherUI", "doAuthDirectly");
        if (this.f249370B.size() > 0) {
            Log.m105925i("MicroMsg.SDKOAuthOtherUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", Boolean.valueOf(this.f249380p), Integer.valueOf(this.f249370B.size()));
            C89779i0 i0Var = this.f249383s;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f249383s = C76879j.m92723Q(this, (String) null, getString(C0966R.string.a4d), true, true, new C85568b0(this));
            if (this.f249380p) {
                this.f249371d.mo118914h(1, this.f249370B, this.f249378n, this.f249381q);
                return;
            }
            this.f249371d.mo118915i(1, this.f249370B, this.f249378n, this.f249386v, this.f249388x, (C89349b) null, Boolean.FALSE, this.f249385u);
            return;
        }
        this.f249371d.mo118910c(-4, this.f249384t, this.f249386v, this.f249388x, this.f249385u);
    }

    /* renamed from: I7 */
    public final void mo118947I7() {
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

    public int getLayoutId() {
        return C0966R.C0971layout.bv7;
    }

    public final void init() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        ((TextView) findViewById(C0966R.C0970id.fmi)).setOnClickListener(new C85560a());
        Intent intent = getIntent();
        this.f249374g = intent.getStringExtra("0");
        this.f249375h = intent.getStringExtra("1");
        try {
            this.f249372e = (C90407dx3) new C90407dx3().parseFrom(intent.getByteArrayExtra("2"));
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.SDKOAuthOtherUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f249376i = intent.getStringExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        this.f249377j = intent.getStringExtra("7");
        boolean z = false;
        this.f249380p = intent.getBooleanExtra("auth_from_scan", false);
        this.f249370B = new LinkedList<>(intent.getStringArrayListExtra("has_selected_scope"));
        if (this.f249380p) {
            this.f249382r = 3;
            String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f249381q = stringExtra;
            this.f249371d = new C85518c1(this, true, this.f249374g, stringExtra);
        } else {
            this.f249371d = new C85518c1(this, this.f249374g, this.f249375h, this.f249376i, this.f249377j);
        }
        this.f249378n = intent.getIntExtra("3", -1);
        this.f249385u = intent.getBooleanExtra("auth_isoption1", false);
        this.f249386v = intent.getStringExtra("key_open_sdk_token");
        this.f249387w = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f249388x = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f249389y = intent.getIntExtra("key_open_sdk_version", 0);
        Log.m105925i("MicroMsg.SDKOAuthOtherUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.f249387w, Integer.valueOf(this.f249388x), Integer.valueOf(this.f249389y));
        Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            SendAuth.Options options = new SendAuth.Options();
            this.f249384t = options;
            options.fromBundle(bundleExtra);
            Log.m105924i("MicroMsg.SDKOAuthOtherUI", "options.callbackClassName: " + this.f249384t.callbackClassName + "  options.callbackFlags: " + this.f249384t.callbackFlags);
        } else {
            Log.m105924i("MicroMsg.SDKOAuthOtherUI", "SendAuth.options, bundle is null");
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.a0d);
        textView.setText(C0966R.string.h86);
        textView.getPaint().setFakeBoldText(true);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.a0_);
        if (!Util.isNullOrNil(this.f249372e.f259483v)) {
            textView2.setVisibility(0);
            textView2.setText(this.f249372e.f259483v);
        } else {
            textView2.setVisibility(8);
        }
        C85518c1 c1Var = this.f249371d;
        C90407dx3 dx32 = this.f249372e;
        c1Var.f249209i = dx32.f259485x;
        this.f249390z = dx32.f259470f;
        this.f249369A = dx32.f259469e;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.raw.native_oauth_default_head_img;
        bVar.f59365u = getResources().getDimension(C0966R.dimen.f357059am2);
        bVar.f59364t = true;
        C20828a.m22825b().mo32519h(this.f249372e.f259470f, (ImageView) findViewById(C0966R.C0970id.hb8), bVar.mo32666a());
        ((TextView) findViewById(C0966R.C0970id.hbc)).setText(this.f249372e.f259469e);
        ListView listView = (ListView) findViewById(C0966R.C0970id.a0c);
        LinkedList linkedList = new LinkedList();
        Iterator<C90442v43> it = this.f249372e.f259468d.iterator();
        while (it.hasNext()) {
            C90442v43 next = it.next();
            if (!next.f259862d.equals("snsapi_userinfo") && !next.f259862d.equals("snsapi_login") && !next.f259862d.equals("group_sns_login") && !next.f259862d.equals("snsapi_friend")) {
                linkedList.add(next);
                if (next.f259864f == 3) {
                    z = true;
                }
            }
        }
        C85563d dVar = new C85563d(this, linkedList);
        this.f249373f = dVar;
        listView.setAdapter(dVar);
        int intExtra = intent.getIntExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, -2);
        int intExtra2 = intent.getIntExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, -2);
        this.f249379o = System.currentTimeMillis();
        ((Button) findViewById(C0966R.C0970id.g5s)).setOnClickListener(new C85561b(intExtra, intExtra2));
        ((Button) findViewById(C0966R.C0970id.g5w)).setOnClickListener(new C85562c(z, intExtra, intExtra2));
        mo118947I7();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m105918d("MicroMsg.SDKOAuthOtherUI", "configuration changed");
        super.onConfigurationChanged(configuration);
        mo118947I7();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.SDKOAuthOtherUI", "onCreate");
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(1346, this);
        C86709a0.m107524d().mo123455a(1137, this);
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f249383s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C86709a0.m107524d().mo123470p(1346, this);
        C86709a0.m107524d().mo123470p(1137, this);
        Log.m105924i("MicroMsg.SDKOAuthOtherUI", "onDestroy");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C7608b.INSTANCE.mo8744a(this.f249374g, this.f249379o, 0, this.f249382r, 4, 1, 0);
        this.f249371d.mo118910c(-2, this.f249384t, this.f249386v, this.f249388x, this.f249385u);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.SDKOAuthOtherUI", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.SDKOAuthOtherUI", "onResume");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        if (!(i == 0 && i2 == 0)) {
            C7608b.INSTANCE.mo8744a(this.f249374g, this.f249379o, 2, this.f249382r, 4, 1, i2);
        }
        C89779i0 i0Var = this.f249383s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (yVar2 instanceof C85522l0) {
            this.f249371d.mo118919r(this, this.f249386v, this.f249389y, this.f249387w, this.f249388x, this.f249390z, this.f249369A, i, i2, str, yVar, this.f249384t, this.f249385u);
        } else if (yVar2 instanceof C43719j0) {
            this.f249371d.mo118918q(i, i2, str, yVar, this.f249384t);
        }
    }
}
