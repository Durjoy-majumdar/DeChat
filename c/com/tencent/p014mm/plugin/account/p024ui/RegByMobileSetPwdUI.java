package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.modelsimple.C1306g0;
import com.tencent.p014mm.modelsimple.C1307j0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7627m3;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;
import p148ei.C7660a;
import p214om.C11502f;
import p286zl.C16293k;
import qg0.C12215a;
import te3.C50366m8;
import te3.C51018qv3;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI */
public class RegByMobileSetPwdUI extends SetPwdUI {

    /* renamed from: y */
    public static final /* synthetic */ int f10752y = 0;

    /* renamed from: i */
    public TextView f10753i;

    /* renamed from: j */
    public TextView f10754j;

    /* renamed from: n */
    public View f10755n;

    /* renamed from: o */
    public View f10756o;

    /* renamed from: p */
    public TextView f10757p;

    /* renamed from: q */
    public View f10758q;

    /* renamed from: r */
    public EditText f10759r;

    /* renamed from: s */
    public String f10760s = null;

    /* renamed from: t */
    public boolean f10761t = false;

    /* renamed from: u */
    public boolean f10762u;

    /* renamed from: v */
    public String f10763v = null;

    /* renamed from: w */
    public int f10764w = 0;

    /* renamed from: x */
    public C51018qv3 f10765x = null;

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI$a */
    public class C1453a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI$a$a */
        public class C1454a implements C16293k.C16294a {
            public C1454a() {
            }

            public void onActivityResult(int i, int i2, Intent intent) {
                if (i2 == -1) {
                    String stringExtra = intent.getStringExtra("setpwd_ticket");
                    Log.m105925i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", stringExtra);
                    if (!Util.isNullOrNil(stringExtra)) {
                        RegByMobileSetPwdUI regByMobileSetPwdUI = RegByMobileSetPwdUI.this;
                        regByMobileSetPwdUI.f10763v = stringExtra;
                        regByMobileSetPwdUI.f10764w = 6;
                        View view = regByMobileSetPwdUI.f10758q;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view3 = RegByMobileSetPwdUI.this.f10755n;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }

            public /* synthetic */ void onCancel() {
            }
        }

        public C1453a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C16293k) C86312j.m106911c(C16293k.class)).mo14653XV(RegByMobileSetPwdUI.this, new C1454a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI$b */
    public class C1455b implements DialogInterface.OnClickListener {
        public C1455b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByMobileSetPwdUI regByMobileSetPwdUI = RegByMobileSetPwdUI.this;
            int i2 = RegByMobileSetPwdUI.f10752y;
            regByMobileSetPwdUI.mo7681K7(1);
        }
    }

    /* renamed from: O7 */
    public C117747y mo1445O7() {
        if (Util.isNullOrNil(this.f10763v)) {
            this.f10763v = (String) C86709a0.m107535s().mo121142i().mo119684e(77830, (Object) null);
        }
        return new C1306g0(this.f10769e, this.f10763v, this.f10764w, this.f10765x);
    }

    /* renamed from: P7 */
    public void mo1454P7() {
        if (!Util.isNullOrNil(this.f10763v)) {
            mo1459V7();
        } else if (this.f10762u) {
            C86709a0.m107524d().mo123460f(new C1307j0(1, this.f10759r.getText().toString(), "", "", "", false));
            this.f10771g = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
        } else {
            mo1459V7();
        }
    }

    /* renamed from: Q7 */
    public String mo1446Q7() {
        return ((EditText) findViewById(C0966R.C0970id.ikg)).getText().toString();
    }

    /* renamed from: R7 */
    public String mo1447R7() {
        return ((EditText) findViewById(C0966R.C0970id.ikf)).getText().toString();
    }

    /* renamed from: S7 */
    public boolean mo1448S7(int i, int i2, String str) {
        if (i != 0 || i2 != 0) {
            return ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(getContext(), i, i2, str);
        }
        setResult(-1);
        finish();
        return true;
    }

    /* renamed from: T7 */
    public void mo1449T7(C12215a.C12216a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            C76879j.m92738i(this, C0966R.string.hxl, C0966R.string.hxn);
        } else if (ordinal == 1) {
            C76879j.m92738i(this, C0966R.string.hxm, C0966R.string.hxn);
        } else if (ordinal == 2) {
            C76879j.m92738i(this, C0966R.string.k_1, C0966R.string.hxn);
        } else if (ordinal == 3) {
            C76879j.m92738i(this, C0966R.string.k9y, C0966R.string.hxn);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.br8;
    }

    public void initView() {
        String str;
        if (!this.f10772h) {
            showMMLogo();
        }
        setMMTitle((int) C0966R.string.f361181hy0);
        this.f10754j = (TextView) findViewById(C0966R.C0970id.l2q);
        this.f10756o = findViewById(C0966R.C0970id.f5351cr);
        this.f10753i = (TextView) findViewById(C0966R.C0970id.ikb);
        this.f10757p = (TextView) findViewById(C0966R.C0970id.f5372dd);
        String str2 = this.f10760s;
        if (str2 != null && str2.length() > 0) {
            this.f10753i.setText(this.f10760s);
        }
        View findViewById = findViewById(C0966R.C0970id.ik_);
        this.f10758q = findViewById;
        this.f10759r = (EditText) findViewById.findViewById(C0966R.C0970id.ike);
        View findViewById2 = findViewById(C0966R.C0970id.ee8);
        this.f10755n = findViewById2;
        findViewById2.setOnClickListener(new C1453a());
        if (this.f10761t || !C86709a0.m107523b().mo121114l()) {
            View view = this.f10756o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view2 = this.f10756o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String c = C75592q0.m90773c();
            if (Util.isNullOrNil(c)) {
                c = C75592q0.m90789s();
                if (C72996z1.m85802I4(c)) {
                    c = null;
                }
            }
            if (Util.isNullOrNil(c)) {
                String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
                String str4 = (String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null);
                if (!Util.isNullOrNil(str3)) {
                    if (Util.isPhoneNumber(str3).booleanValue()) {
                        PhoneFormater phoneFormater = new PhoneFormater();
                        if (str3.startsWith("+")) {
                            str3 = str3.replace("+", "");
                            str = PhoneFormater.extractCountryCode(str3);
                            if (str != null) {
                                str3 = str3.substring(str.length());
                            }
                        } else {
                            str = "86";
                        }
                        String formatNumber = phoneFormater.formatNumber(str, str3);
                        this.f10757p.setText(C0966R.string.itz);
                        this.f10754j.setText(formatNumber);
                    }
                    this.f10753i.setText(C0966R.string.f361183hy2);
                } else if (!Util.isNullOrNil(str4)) {
                    this.f10754j.setText(str4);
                    this.f10757p.setText(C0966R.string.iri);
                    this.f10753i.setText(C0966R.string.f361182hy1);
                } else {
                    View view3 = this.f10756o;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                this.f10757p.setText(C0966R.string.j1p);
                this.f10754j.setText(c);
            }
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.hlo);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.hrh);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.blw);
        EditText editText = (EditText) findViewById(C0966R.C0970id.ikg);
        EditText editText2 = (EditText) findViewById(C0966R.C0970id.ikf);
        if (!LocaleUtil.isChineseAppLang()) {
            textView.setTextSize(1, 14.0f);
            textView2.setTextSize(1, 14.0f);
            textView3.setTextSize(1, 14.0f);
            editText.setTextSize(1, 14.0f);
            editText2.setTextSize(1, 14.0f);
        }
        float measureText = this.f10757p.getPaint().measureText(this.f10757p.getText().toString());
        int max = (int) Math.max(Math.max(Math.max(measureText, textView2.getPaint().measureText(textView2.getText().toString())), textView3.getPaint().measureText(textView3.getText().toString())), textView.getPaint().measureText(textView.getText().toString()));
        textView.setWidth(max);
        this.f10757p.setWidth(max);
        textView2.setWidth(max);
        textView2.setWidth(max);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10760s = getIntent().getStringExtra("kintent_hint");
        this.f10772h = getIntent().getBooleanExtra("kintent_cancelable", true);
        this.f10761t = getIntent().getBooleanExtra("from_unbind", false);
        C86709a0.m107524d().mo123455a(384, this);
        C86709a0.m107524d().mo123455a(255, this);
        initView();
        byte[] decodeHexString = Util.decodeHexString(C7627m3.m7760a().getString("_auth_key", ""));
        C50366m8 m8Var = new C50366m8();
        if (!Util.isNullOrNil(decodeHexString)) {
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(decodeHexString);
            this.f10765x = qv32;
            try {
                m8Var.parseFrom(decodeHexString);
            } catch (IOException e) {
                Log.printErrStackTrace("MicorMsg.RegByMobileSetPwdUI", e, "summersetpwd Failed parse autoauthkey buf", new Object[0]);
            }
        } else {
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(new byte[0]);
            this.f10765x = qv33;
        }
        String stringExtra = getIntent().getStringExtra("setpwd_ticket");
        Log.m105925i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            this.f10763v = stringExtra;
            this.f10764w = getIntent().getIntExtra("setpwd_ticket_type", 6);
            View view = this.f10758q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f10755n;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C86709a0.m107524d().mo123460f(new C1302b0(1));
        this.f10771g = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.f360085a04), true, false, (DialogInterface.OnCancelListener) null);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(384, this);
        C86709a0.m107524d().mo123470p(255, this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("setpwd_ticket");
        Log.m105925i("MicorMsg.RegByMobileSetPwdUI", "onNewIntent get reset pwd ticket %s", stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            this.f10763v = stringExtra;
            this.f10764w = 4;
            View view = this.f10758q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f10755n;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        Log.m105925i("MicorMsg.RegByMobileSetPwdUI", "errorCode %d, errorMsg %s, scene %s", Integer.valueOf(i2), str, yVar);
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar.getType() == 255) {
            if (((C1302b0) yVar).f10417g != 1) {
                return;
            }
            if (i3 == 0 && i4 == 0) {
                View view = this.f10758q;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f10755n;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f10762u = true;
            } else if (i4 == -3 && i3 == 4) {
                this.f10762u = false;
            } else {
                View view5 = this.f10758q;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = this.f10755n;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    Log.m105925i("MicorMsg.RegByMobileSetPwdUI", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", Integer.valueOf(i2), Integer.valueOf(a.f26002c), a.f26000a, a.f26001b);
                    C76879j.m92713G(this, a.f26001b, a.f26003d, false, new C1455b());
                }
            }
        } else if (yVar.getType() != 384) {
        } else {
            if (i3 == 0 && i4 == 0) {
                C86709a0.m107535s().mo121142i().mo119676J(77830, ((C1307j0) yVar).mo1225j1());
                mo1459V7();
                return;
            }
            C76879j.m92738i(this, C0966R.string.hxw, C0966R.string.a3h);
        }
    }
}
