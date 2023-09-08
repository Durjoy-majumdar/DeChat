package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmWizardActivity;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.xlog.app.XLogSetup;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import j20.C117292a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import jg0.C117352d;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import p214om.C11502f;
import p763ym.C39070r;
import qn3.C77382c;
import xb2.C118866a;

/* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI */
public class SimpleLoginUI extends BaseMvvmWizardActivity implements C11385n {

    /* renamed from: v */
    public static final /* synthetic */ int f345053v = 0;

    /* renamed from: e */
    public MMFormInputView f345054e;

    /* renamed from: f */
    public MMFormInputView f345055f;

    /* renamed from: g */
    public MMClearEditText f345056g;

    /* renamed from: h */
    public MMClearEditText f345057h;

    /* renamed from: i */
    public ProgressDialog f345058i = null;

    /* renamed from: j */
    public SecurityImage f345059j = null;

    /* renamed from: n */
    public C115135m0 f345060n = new C115135m0();

    /* renamed from: o */
    public String f345061o = "";

    /* renamed from: p */
    public String f345062p;

    /* renamed from: q */
    public String f345063q;

    /* renamed from: r */
    public Button f345064r;

    /* renamed from: s */
    public String f345065s;

    /* renamed from: t */
    public TextWatcher f345066t = new C68485h();

    /* renamed from: u */
    public IListener f345067u = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.SimpleLoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/SimpleLoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$a */
    public class C68478a implements MenuItem.OnMenuItemClickListener {
        public C68478a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i = SimpleLoginUI.f345053v;
            boolean booleanExtra = simpleLoginUI.getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
            if (!booleanExtra) {
                simpleLoginUI.mo7678H7();
            }
            simpleLoginUI.mo7681K7(1);
            if (booleanExtra) {
                simpleLoginUI.mo7679I7(1);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$b */
    public class C68479b implements Runnable {
        public C68479b() {
        }

        public void run() {
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i = SimpleLoginUI.f345053v;
            simpleLoginUI.mo174845N7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$c */
    public class C68480c implements View.OnClickListener {
        public C68480c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i = SimpleLoginUI.f345053v;
            simpleLoginUI.mo174845N7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$d */
    public class C68481d implements View.OnClickListener {
        public C68481d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SimpleLoginUI.m161919O7(SimpleLoginUI.this, SimpleLoginUI.this.getString(C0966R.string.gcz) + LocaleUtil.getApplicationLanguage());
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$e */
    public class C68482e implements View.OnClickListener {
        public C68482e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SimpleLoginUI.m161919O7(SimpleLoginUI.this, SimpleLoginUI.this.getString(C0966R.string.f26, new Object[]{LocaleUtil.getApplicationLanguage()}));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$f */
    public class C68483f implements View.OnClickListener {
        public C68483f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i = SimpleLoginUI.f345053v;
            String string = simpleLoginUI.getString(C0966R.string.lit);
            SimpleLoginUI.m161919O7(simpleLoginUI.getContext(), string + LocaleUtil.getApplicationLanguage());
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$g */
    public class C68484g implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f196745d;

        public C68484g(SimpleLoginUI simpleLoginUI, C114735a0 a0Var) {
            this.f196745d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f196745d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$h */
    public class C68485h implements TextWatcher {
        public C68485h() {
        }

        public void afterTextChanged(Editable editable) {
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            if (Util.isNullOrNil(simpleLoginUI.f345056g.getText().toString()) || Util.isNullOrNil(simpleLoginUI.f345057h.getText().toString())) {
                simpleLoginUI.f345064r.setEnabled(false);
            } else {
                simpleLoginUI.f345064r.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$k */
    public class C68486k implements Runnable {
        public C68486k() {
        }

        public void run() {
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i = SimpleLoginUI.f345053v;
            simpleLoginUI.mo174845N7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$l */
    public class C68487l implements View.OnTouchListener {
        public C68487l() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SimpleLoginUI.this.f345056g.setFocusableInTouchMode(true);
            boolean onTouch = SimpleLoginUI.this.f345056g.getDefaultOnTouchListener().onTouch(view, motionEvent);
            C117292a.m165362h(onTouch, this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouch;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$m */
    public class C68488m implements View.OnTouchListener {
        public C68488m() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SimpleLoginUI.this.f345057h.setFocusableInTouchMode(true);
            SimpleLoginUI.this.f345056g.setFocusableInTouchMode(false);
            boolean onTouch = SimpleLoginUI.this.f345057h.getDefaultOnTouchListener().onTouch(view, motionEvent);
            C117292a.m165362h(onTouch, this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouch;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$n */
    public class C68489n implements TextView.OnEditorActionListener {
        public C68489n() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
            int i2 = SimpleLoginUI.f345053v;
            simpleLoginUI.mo174845N7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$o */
    public class C68490o implements View.OnKeyListener {
        public C68490o() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$7", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 == i && keyEvent.getAction() == 0) {
                SimpleLoginUI simpleLoginUI = SimpleLoginUI.this;
                int i2 = SimpleLoginUI.f345053v;
                simpleLoginUI.mo174845N7();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$7", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$7", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$i */
    public class C115078i implements C75576f4.C75578b {
        public C115078i(SimpleLoginUI simpleLoginUI) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C86709a0.m107523b().mo121110g());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$j */
    public class C115079j implements C117352d.C117354b {

        /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$j$a */
        public class C115080a implements C39070r.C39071a {
            public C115080a() {
            }
        }

        public C115079j() {
        }

        /* renamed from: a */
        public void mo174846a(boolean z) {
            ((C39070r) C86312j.m106911c(C39070r.class)).mo61911Es(SimpleLoginUI.this, new C115080a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$p */
    public class C115081p implements View.OnFocusChangeListener {
        public C115081p() {
        }

        public void onFocusChange(View view, boolean z) {
            ((C118866a) C39818r.f106831a.mo62444c(SimpleLoginUI.this).mo75002a(C118866a.class)).mo183577i3(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SimpleLoginUI$q */
    public class C115082q implements View.OnFocusChangeListener {
        public C115082q() {
        }

        public void onFocusChange(View view, boolean z) {
            ((C118866a) C39818r.f106831a.mo62444c(SimpleLoginUI.this).mo75002a(C118866a.class)).mo183577i3(z);
        }
    }

    /* renamed from: O7 */
    public static void m161919O7(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: N7 */
    public final void mo174845N7() {
        this.f345060n.f345162b = this.f345056g.getText().toString().trim();
        this.f345060n.f345163c = this.f345057h.getText().toString();
        if (this.f345060n.f345162b.equals("")) {
            C76879j.m92738i(this, C0966R.string.k_7, C0966R.string.gcw);
        } else if (this.f345060n.f345163c.equals("")) {
            C76879j.m92738i(this, C0966R.string.k9z, C0966R.string.gcw);
        } else {
            hideVKB();
            C115135m0 m0Var = this.f345060n;
            C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, this.f345062p, 0);
            C86709a0.m107524d().mo123460f(a0Var);
            this.f345058i = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gda), true, true, new C68484g(this, a0Var));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b89;
    }

    public void initView() {
        this.f345054e = (MMFormInputView) findViewById(C0966R.C0970id.g5g);
        TextView textView = (TextView) findViewById(C0966R.C0970id.g6h);
        if (WeChatBrands.AppInfo.current().isMainland()) {
            this.f345054e.setHint((int) C0966R.string.gbt);
            textView.setText(C0966R.string.gce);
        } else {
            this.f345054e.setHint((int) C0966R.string.gbu);
            textView.setText(C0966R.string.gcf);
        }
        this.f345055f = (MMFormInputView) findViewById(C0966R.C0970id.g6b);
        MMClearEditText mMClearEditText = (MMClearEditText) this.f345054e.getContentEditText();
        this.f345056g = mMClearEditText;
        mMClearEditText.setFocusableInTouchMode(false);
        this.f345056g.setOnTouchListener(new C68487l());
        MMClearEditText mMClearEditText2 = (MMClearEditText) this.f345055f.getContentEditText();
        this.f345057h = mMClearEditText2;
        mMClearEditText2.setFocusableInTouchMode(false);
        this.f345057h.setOnTouchListener(new C68488m());
        C77382c b = C77382c.m93286b(this.f345057h);
        b.f225611e = 0;
        b.f225610d = 16;
        b.mo107499d((C77382c.C77383a) null);
        Button button = (Button) findViewById(C0966R.C0970id.g5o);
        this.f345064r = button;
        button.setEnabled(false);
        this.f345056g.addTextChangedListener(this.f345066t);
        this.f345057h.addTextChangedListener(this.f345066t);
        this.f345057h.setOnEditorActionListener(new C68489n());
        this.f345057h.setOnKeyListener(new C68490o());
        this.f345056g.setOnFocusChangeListener(new C115081p());
        this.f345057h.setOnFocusChangeListener(new C115082q());
        View findViewById = findViewById(C0966R.C0970id.g5x);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/SimpleLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/SimpleLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setMMTitle((int) C0966R.string.gdk);
        setBackBtn(new C68478a());
        String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f345062p = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f345056g.setText(Util.nullAsNil(C115135m0.m161943c()));
            this.f345057h.setText(Util.nullAsNil(C115135m0.m161944d()));
            new MMHandler().postDelayed(new C68479b(), 500);
        }
        if (ChannelUtil.shouldShowGprsAlert) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93143Kn(this);
        }
        this.f345064r.setOnClickListener(new C68480c());
        ((Button) findViewById(C0966R.C0970id.g65)).setOnClickListener(new C68481d());
        ((Button) findViewById(C0966R.C0970id.g66)).setOnClickListener(new C68482e());
        ((Button) findViewById(C0966R.C0970id.g6a)).setOnClickListener(new C68483f());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        int i3 = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105919d("MicroMsg.SimpleLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
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
            Log.m105919d("MicroMsg.SimpleLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                mo174845N7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        File file = new File(getFilesDir(), ".launched");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Throwable unused) {
            }
            XLogSetup.realSetupXlog();
        }
        setMMTitle((int) C0966R.string.a0u);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        initView();
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        hideVKB();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
        if (!booleanExtra) {
            mo7678H7();
        }
        mo7681K7(1);
        if (booleanExtra) {
            mo7679I7(1);
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f345062p = intent.getStringExtra("auth_ticket");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f345062p = extras.getString("auth_ticket");
        }
        if (!Util.isNullOrNil(this.f345062p)) {
            this.f345056g.setText(Util.nullAsNil(C115135m0.m161943c()));
            this.f345057h.setText(Util.nullAsNil(C115135m0.m161944d()));
            new MMHandler().postDelayed(new C68486k(), 500);
        }
    }

    public void onPause() {
        ProgressDialog progressDialog = this.f345058i;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f345058i = null;
        }
        super.onPause();
        this.f345067u.dead();
    }

    public void onResume() {
        this.f345067u.alive();
        super.onResume();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0221, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r24, int r25, java.lang.String r26, ob0.C117747y r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.Class<om.f> r4 = p214om.C11502f.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onSceneEnd: errType = "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = " errCode = "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " errMsg = "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.SimpleLoginUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Scene Type "
            r5.append(r7)
            int r7 = r27.getType()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            android.app.ProgressDialog r5 = r0.f345058i
            r7 = 0
            if (r5 == 0) goto L_0x0052
            r5.dismiss()
            r0.f345058i = r7
        L_0x0052:
            r5 = r27
            com.tencent.mm.modelsimple.a0 r5 = (com.tencent.p014mm.modelsimple.C114735a0) r5
            java.lang.String r8 = r5.mo174354j1()
            r0.f345061o = r8
            int r8 = r27.getType()
            r9 = 252(0xfc, float:3.53E-43)
            r10 = 4
            r11 = 1
            r12 = 0
            if (r8 == r9) goto L_0x006f
            int r8 = r27.getType()
            r9 = 701(0x2bd, float:9.82E-43)
            if (r8 != r9) goto L_0x00c2
        L_0x006f:
            com.tencent.mm.plugin.account.ui.m0 r8 = r0.f345060n
            int r9 = r5.mo174360p1()
            r8.f345168h = r9
            com.tencent.mm.plugin.account.ui.m0 r8 = r0.f345060n
            java.lang.String r9 = r5.mo174359o1()
            r8.f345165e = r9
            com.tencent.mm.plugin.account.ui.m0 r8 = r0.f345060n
            byte[] r9 = r5.mo174357m1()
            r8.f345167g = r9
            com.tencent.mm.plugin.account.ui.m0 r8 = r0.f345060n
            java.lang.String r9 = r5.mo174358n1()
            r8.f345166f = r9
            r8 = -205(0xffffffffffffff33, float:NaN)
            if (r2 != r8) goto L_0x00a5
            java.lang.String r8 = r5.mo174355k1()
            r0.f345062p = r8
            java.lang.String r8 = r5.mo174364t1()
            r0.f345063q = r8
            java.lang.String r8 = r5.mo174356l1()
            r0.f345065s = r8
        L_0x00a5:
            if (r1 != r10) goto L_0x00c2
            r8 = -16
            if (r2 == r8) goto L_0x00af
            r8 = -17
            if (r2 != r8) goto L_0x00c2
        L_0x00af:
            ob0.b0 r8 = f40.C86709a0.m107524d()
            eb0.f4 r9 = new eb0.f4
            com.tencent.mm.plugin.account.ui.SimpleLoginUI$i r13 = new com.tencent.mm.plugin.account.ui.SimpleLoginUI$i
            r13.<init>(r0)
            r9.<init>(r13, r7)
            r8.mo123460f(r9)
            r8 = 1
            goto L_0x00c3
        L_0x00c2:
            r8 = 0
        L_0x00c3:
            r9 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r8 != 0) goto L_0x0252
            if (r1 != 0) goto L_0x00ce
            if (r2 != 0) goto L_0x00ce
            goto L_0x0252
        L_0x00ce:
            r8 = -217(0xffffffffffffff27, float:NaN)
            if (r2 != r8) goto L_0x00da
            com.tencent.mm.modelsimple.a0$c r1 = sf0.C118276e.m166845a(r5)
            sf0.C13665i0.m12973f(r0, r1, r2)
            return
        L_0x00da:
            di3.d r5 = di3.C86312j.m106911c(r4)
            om.f r5 = (p214om.C11502f) r5
            wc3.y r5 = r5.mo11461Sr()
            androidx.appcompat.app.AppCompatActivity r8 = r23.getContext()
            boolean r5 = r5.mo93163uP(r8, r1, r2, r3)
            r8 = 2
            if (r5 == 0) goto L_0x00f1
            goto L_0x0224
        L_0x00f1:
            if (r1 != r10) goto L_0x0223
            r5 = 2131832276(0x7f112dd4, float:1.9297601E38)
            switch(r2) {
                case -2023: goto L_0x0208;
                case -311: goto L_0x0193;
                case -310: goto L_0x0193;
                case -205: goto L_0x014a;
                case -140: goto L_0x013b;
                case -106: goto L_0x0136;
                case -100: goto L_0x0208;
                case -75: goto L_0x012d;
                case -72: goto L_0x0121;
                case -30: goto L_0x0119;
                case -9: goto L_0x0111;
                case -6: goto L_0x0193;
                case -4: goto L_0x0119;
                case -3: goto L_0x0119;
                case -1: goto L_0x00fb;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x0223
        L_0x00fb:
            ob0.b0 r4 = f40.C86709a0.m107524d()
            int r4 = r4.mo123467m()
            r6 = 5
            if (r4 != r6) goto L_0x0119
            r4 = 2131833496(0x7f113298, float:1.9300076E38)
            r5 = 2131833495(0x7f113297, float:1.9300074E38)
            nj3.C76879j.m92738i(r0, r4, r5)
            goto L_0x0224
        L_0x0111:
            r4 = 2131832275(0x7f112dd3, float:1.92976E38)
            nj3.C76879j.m92738i(r0, r4, r5)
            goto L_0x0224
        L_0x0119:
            r4 = 2131825174(0x7f111216, float:1.9283197E38)
            nj3.C76879j.m92738i(r0, r4, r5)
            goto L_0x0224
        L_0x0121:
            androidx.appcompat.app.AppCompatActivity r4 = r23.getContext()
            r5 = 2131834619(0x7f1136fb, float:1.9302353E38)
            nj3.C76879j.m92738i(r4, r5, r9)
            goto L_0x0224
        L_0x012d:
            androidx.appcompat.app.AppCompatActivity r4 = r23.getContext()
            sf0.C13665i0.m12971d(r4)
            goto L_0x0224
        L_0x0136:
            sf0.C13665i0.m12970c(r0, r3, r12)
            goto L_0x0224
        L_0x013b:
            java.lang.String r4 = r0.f345061o
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0224
            java.lang.String r4 = r0.f345061o
            sf0.C13665i0.m12972e(r0, r3, r4)
            goto L_0x0224
        L_0x014a:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r9 = r0.f345062p
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r9)
            r5[r12] = r9
            java.lang.String r9 = r0.f345065s
            r5[r11] = r9
            java.lang.String r9 = "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r5)
            com.tencent.mm.plugin.account.ui.m0 r5 = r0.f345060n
            com.tencent.p014mm.plugin.account.p024ui.C115135m0.f345161i = r5
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = r0.f345062p
            java.lang.String r9 = "auth_ticket"
            r5.putExtra(r9, r6)
            java.lang.String r6 = r0.f345063q
            java.lang.String r9 = "binded_mobile"
            r5.putExtra(r9, r6)
            java.lang.String r6 = r0.f345065s
            java.lang.String r9 = "close_safe_device_style"
            r5.putExtra(r9, r6)
            r6 = 3
            java.lang.String r9 = "from_source"
            r5.putExtra(r9, r6)
            di3.d r4 = di3.C86312j.m106911c(r4)
            om.f r4 = (p214om.C11502f) r4
            wc3.z r4 = r4.mo11462yM()
            com.tencent.mm.app.r1 r4 = (com.tencent.p014mm.app.C67654r1) r4
            r4.mo93189v(r0, r5)
            goto L_0x0224
        L_0x0193:
            com.tencent.mm.ui.applet.SecurityImage r4 = r0.f345059j
            if (r4 != 0) goto L_0x01c7
            androidx.appcompat.app.AppCompatActivity r13 = r23.getContext()
            r14 = 2131834632(0x7f113708, float:1.930238E38)
            com.tencent.mm.plugin.account.ui.m0 r4 = r0.f345060n
            int r15 = r4.f345168h
            byte[] r5 = r4.f345167g
            java.lang.String r6 = r4.f345165e
            java.lang.String r9 = r4.f345166f
            com.tencent.mm.plugin.account.ui.f3 r10 = new com.tencent.mm.plugin.account.ui.f3
            r10.<init>(r0)
            r20 = 0
            com.tencent.mm.plugin.account.ui.g3 r11 = new com.tencent.mm.plugin.account.ui.g3
            r11.<init>(r0)
            r16 = r5
            r17 = r6
            r18 = r9
            r19 = r10
            r21 = r11
            r22 = r4
            com.tencent.mm.ui.applet.SecurityImage r4 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.f345059j = r4
            goto L_0x0221
        L_0x01c7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "imgSid:"
            r4.append(r5)
            com.tencent.mm.plugin.account.ui.m0 r5 = r0.f345060n
            java.lang.String r5 = r5.f345165e
            r4.append(r5)
            java.lang.String r5 = " img len"
            r4.append(r5)
            com.tencent.mm.plugin.account.ui.m0 r5 = r0.f345060n
            byte[] r5 = r5.f345167g
            int r5 = r5.length
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            java.lang.String r5 = p206nj.C76861g.m92660c()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            com.tencent.mm.ui.applet.SecurityImage r4 = r0.f345059j
            com.tencent.mm.plugin.account.ui.m0 r5 = r0.f345060n
            int r6 = r5.f345168h
            byte[] r9 = r5.f345167g
            java.lang.String r10 = r5.f345165e
            java.lang.String r5 = r5.f345166f
            r4.mo177230b(r6, r9, r10, r5)
            goto L_0x0221
        L_0x0208:
            f40.C86718e.m107550n()
            f40.C86709a0.m107523b()
            java.lang.String r4 = f40.C86718e.f251747w
            java.lang.String r5 = r0.getString(r9)
            com.tencent.mm.plugin.account.ui.h3 r6 = new com.tencent.mm.plugin.account.ui.h3
            r6.<init>(r0)
            com.tencent.mm.plugin.account.ui.i3 r9 = new com.tencent.mm.plugin.account.ui.i3
            r9.<init>(r0)
            nj3.C76879j.m92719M(r0, r4, r5, r6, r9)
        L_0x0221:
            r11 = 1
            goto L_0x0224
        L_0x0223:
            r11 = 0
        L_0x0224:
            if (r11 == 0) goto L_0x0227
            return
        L_0x0227:
            ei.a r3 = p148ei.C7660a.m7782a(r26)
            if (r3 == 0) goto L_0x0234
            boolean r3 = r3.mo8792b(r0, r7, r7)
            if (r3 == 0) goto L_0x0234
            return
        L_0x0234:
            r3 = 2131830303(0x7f11261f, float:1.92936E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r4[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r2 = 1
            r4[r2] = r1
            java.lang.String r1 = r0.getString(r3, r4)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r12)
            r1.show()
            return
        L_0x0252:
            f40.C86718e.m107546E()
            com.tencent.mm.plugin.account.ui.m0 r1 = r0.f345060n
            java.lang.String r1 = r1.f345162b
            sf0.C13665i0.m12968a(r0, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r23.getContext()
            com.tencent.mm.plugin.account.ui.SimpleLoginUI$j r2 = new com.tencent.mm.plugin.account.ui.SimpleLoginUI$j
            r2.<init>()
            jg0.d r3 = new jg0.d
            r3.<init>(r1, r2)
            di3.d r1 = di3.C86312j.m106911c(r4)
            om.f r1 = (p214om.C11502f) r1
            wc3.y r1 = r1.mo11461Sr()
            ob0.y r1 = r1.P50(r3)
            r3.f351327g = r1
            if (r1 != 0) goto L_0x0287
            jg0.d$b r1 = r3.f351328h
            if (r1 == 0) goto L_0x02cd
            com.tencent.mm.plugin.account.ui.SimpleLoginUI$j r1 = (com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.C115079j) r1
            r2 = 1
            r1.mo174846a(r2)
            goto L_0x02cd
        L_0x0287:
            int r1 = r1.getType()
            r2 = 139(0x8b, float:1.95E-43)
            if (r1 != r2) goto L_0x0297
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123455a(r2, r3)
            goto L_0x02a8
        L_0x0297:
            ob0.y r1 = r3.f351327g
            int r1 = r1.getType()
            r2 = 138(0x8a, float:1.93E-43)
            if (r1 != r2) goto L_0x02a8
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123455a(r2, r3)
        L_0x02a8:
            ob0.b0 r1 = f40.C86709a0.m107524d()
            ob0.y r2 = r3.f351327g
            r1.mo123460f(r2)
            android.content.Context r10 = r3.f351325e
            java.lang.String r11 = r10.getString(r9)
            android.content.Context r1 = r3.f351325e
            r2 = 2131821572(0x7f110404, float:1.927589E38)
            java.lang.String r12 = r1.getString(r2)
            r13 = 1
            r14 = 1
            jg0.c r15 = new jg0.c
            r15.<init>(r3)
            qo3.i0 r1 = nj3.C76879j.m92723Q(r10, r11, r12, r13, r14, r15)
            r3.f351326f = r1
        L_0x02cd:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r1 != 0) goto L_0x02d9
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r1 == 0) goto L_0x02e5
        L_0x02d9:
            r1 = 2
            com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct
            r3.<init>()
            r3.f107894d = r1
            r3.mo86054n()
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C118866a.class);
    }
}
