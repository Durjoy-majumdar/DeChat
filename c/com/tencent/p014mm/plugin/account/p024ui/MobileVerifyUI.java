package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88504k;
import nc0.C76850a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p148ei.C7660a;
import p910lj.C76701a;
import qe3.C89625d;
import qo3.C77407n;
import sf0.C13665i0;
import sf0.C77687b;
import sf0.C77701p0;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI */
public class MobileVerifyUI extends MMActivity {

    /* renamed from: I */
    public static final /* synthetic */ int f196673I = 0;

    /* renamed from: A */
    public int f196674A;

    /* renamed from: B */
    public C68466n f196675B;

    /* renamed from: C */
    public C77687b f196676C;

    /* renamed from: D */
    public String f196677D;

    /* renamed from: E */
    public int f196678E;

    /* renamed from: F */
    public String f196679F;

    /* renamed from: G */
    public String f196680G;

    /* renamed from: H */
    public int f196681H;

    /* renamed from: d */
    public MMFormInputView f196682d;

    /* renamed from: e */
    public EditText f196683e;

    /* renamed from: f */
    public ProgressDialog f196684f = null;

    /* renamed from: g */
    public TextView f196685g;

    /* renamed from: h */
    public TextView f196686h;

    /* renamed from: i */
    public TextView f196687i;

    /* renamed from: j */
    public Button f196688j;

    /* renamed from: n */
    public ScrollView f196689n;

    /* renamed from: o */
    public MTimerHandler f196690o;

    /* renamed from: p */
    public String f196691p;

    /* renamed from: q */
    public long f196692q = 0;

    /* renamed from: r */
    public SecurityImage f196693r = null;

    /* renamed from: s */
    public String f196694s;

    /* renamed from: t */
    public Boolean f196695t;

    /* renamed from: u */
    public String f196696u;

    /* renamed from: v */
    public int f196697v;

    /* renamed from: w */
    public int f196698w = 30;

    /* renamed from: x */
    public boolean f196699x = false;

    /* renamed from: y */
    public int f196700y = -1;

    /* renamed from: z */
    public String f196701z;

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$a */
    public class C68451a implements DialogInterface.OnClickListener {
        public C68451a(MobileVerifyUI mobileVerifyUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$b */
    public class C68452b implements DialogInterface.OnClickListener {
        public C68452b(MobileVerifyUI mobileVerifyUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$c */
    public class C68453c implements DialogInterface.OnCancelListener {
        public C68453c(MobileVerifyUI mobileVerifyUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$d */
    public class C68454d implements MTimerHandler.CallBack {
        public C68454d() {
        }

        public boolean onTimerExpired() {
            MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
            long j = mobileVerifyUI.f196692q - 1;
            mobileVerifyUI.f196692q = j;
            if (j >= 0) {
                TextView textView = mobileVerifyUI.f196686h;
                Resources resources = mobileVerifyUI.getResources();
                long j2 = MobileVerifyUI.this.f196692q;
                textView.setText(resources.getQuantityString(C0966R.plurals.f7240v, (int) j2, new Object[]{Integer.valueOf((int) j2)}));
            } else {
                mobileVerifyUI.f196686h.setVisibility(8);
                MobileVerifyUI.this.f196685g.setVisibility(0);
                MobileVerifyUI mobileVerifyUI2 = MobileVerifyUI.this;
                MTimerHandler mTimerHandler = mobileVerifyUI2.f196690o;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                }
                mobileVerifyUI2.f196690o = null;
                MobileVerifyUI.this.f196685g.setEnabled(true);
                MobileVerifyUI mobileVerifyUI3 = MobileVerifyUI.this;
                mobileVerifyUI3.f196685g.setText(mobileVerifyUI3.getString(C0966R.string.guv));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$e */
    public class C68455e implements InputFilter {
        public C68455e(MobileVerifyUI mobileVerifyUI) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return Util.filterNumber(charSequence);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$f */
    public class C68456f implements View.OnClickListener {
        public C68456f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
            int i = MobileVerifyUI.f196673I;
            mobileVerifyUI.mo93997H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$g */
    public class C68457g implements TextWatcher {
        public C68457g() {
        }

        public void afterTextChanged(Editable editable) {
            if (Util.isNullOrNil(MobileVerifyUI.this.f196683e.getText().toString())) {
                MobileVerifyUI.this.f196683e.setTextSize(15.0f);
                MobileVerifyUI.this.f196683e.setGravity(16);
            } else {
                MobileVerifyUI.this.f196683e.setTextSize(24.0f);
                MobileVerifyUI.this.f196683e.setGravity(16);
            }
            if (MobileVerifyUI.this.f196683e.getText() == null || MobileVerifyUI.this.f196683e.getText().toString().length() <= 0) {
                MobileVerifyUI.this.f196688j.setEnabled(false);
            } else {
                MobileVerifyUI.this.f196688j.setEnabled(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$h */
    public class C68458h implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$h$a */
        public class C68459a implements C11182m0 {
            public C68459a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107142f(0, MobileVerifyUI.this.getString(C0966R.string.guw));
                if (C76850a.m92635g(MobileVerifyUI.this.f196691p)) {
                    e0Var.mo107142f(1, MobileVerifyUI.this.getString(C0966R.string.ali));
                }
                MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
                if (mobileVerifyUI.f196674A == 2 && mobileVerifyUI.f196699x) {
                    e0Var.mo107142f(2, mobileVerifyUI.getString(C0966R.string.hx9));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$h$b */
        public class C68460b implements C11184p0 {
            public C68460b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId != 0) {
                    int i2 = 1;
                    if (itemId == 1) {
                        MobileVerifyUI.this.hideVKB();
                        int i3 = MobileVerifyUI.this.f196674A;
                        if (i3 == 2) {
                            C78595a.m94985e("R200_500");
                        } else if (i3 == 3) {
                            C78595a.m94985e("F200_300");
                        }
                        Intent intent = new Intent(MobileVerifyUI.this, RegByMobileVoiceVerifyUI.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("bindmcontact_mobile", MobileVerifyUI.this.f196691p);
                        int i4 = MobileVerifyUI.this.f196674A;
                        if (i4 == 2) {
                            i2 = 0;
                        } else if (i4 == 3) {
                            i2 = 2;
                        } else if (i4 != 4) {
                            i2 = 3;
                        }
                        bundle.putInt("voice_verify_type", i2);
                        intent.putExtras(bundle);
                        MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        MobileVerifyUI mobileVerifyUI2 = mobileVerifyUI;
                        C117292a.m165358d(mobileVerifyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MobileVerifyUI$5$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mobileVerifyUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(mobileVerifyUI2, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$5$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    return;
                }
                MobileVerifyUI mobileVerifyUI3 = MobileVerifyUI.this;
                int i5 = MobileVerifyUI.f196673I;
                mobileVerifyUI3.mo93998I7();
            }
        }

        public C68458h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileVerifyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
            LayoutInflater.from(mobileVerifyUI);
            C77407n nVar = new C77407n((Context) mobileVerifyUI, 1, false);
            C76874e0 e0Var = new C76874e0(mobileVerifyUI);
            new C76874e0(mobileVerifyUI);
            C68459a aVar = new C68459a();
            C68460b bVar = new C68460b();
            e0Var.clear();
            C76874e0 e0Var2 = new C76874e0(mobileVerifyUI);
            aVar.onCreateMMMenu(e0Var2);
            if (e0Var2.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = aVar;
                nVar.f225782p = bVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$i */
    public class C68461i implements MenuItem.OnMenuItemClickListener {
        public C68461i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
            int i = MobileVerifyUI.f196673I;
            C78595a.m94985e(mobileVerifyUI.f196701z);
            if (mobileVerifyUI.f196675B.mo94016a(C68465m.GoBack)) {
                return true;
            }
            mobileVerifyUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$j */
    public class C68462j implements TextView.OnEditorActionListener {
        public C68462j() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
            int i2 = MobileVerifyUI.f196673I;
            mobileVerifyUI.mo93997H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$k */
    public class C68463k implements View.OnKeyListener {
        public C68463k() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileVerifyUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (66 == i && keyEvent.getAction() == 0) {
                MobileVerifyUI mobileVerifyUI = MobileVerifyUI.this;
                int i2 = MobileVerifyUI.f196673I;
                mobileVerifyUI.mo93997H7();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/MobileVerifyUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$l */
    public class C68464l implements DialogInterface.OnClickListener {
        public C68464l(MobileVerifyUI mobileVerifyUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$m */
    public enum C68465m {
        GoBack,
        GoNext,
        DoSend,
        GoPostCheck
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MobileVerifyUI$n */
    public interface C68466n {
        /* renamed from: a */
        boolean mo94016a(C68465m mVar);

        /* renamed from: b */
        void mo94017b(MobileVerifyUI mobileVerifyUI);

        void start();

        void stop();
    }

    /* renamed from: H7 */
    public final void mo93997H7() {
        hideVKB();
        if (this.f196683e.getText().toString().trim().equals("")) {
            C76879j.m92738i(this, C0966R.string.alf, C0966R.string.a3h);
        } else {
            this.f196675B.mo94016a(C68465m.GoNext);
        }
    }

    /* renamed from: I7 */
    public final void mo93998I7() {
        this.f196685g.setEnabled(false);
        this.f196686h.setVisibility(0);
        TextView textView = this.f196686h;
        Resources resources = getResources();
        int i = this.f196698w;
        textView.setText(resources.getQuantityString(C0966R.plurals.f7240v, i, new Object[]{Integer.valueOf(i)}));
        this.f196685g.setVisibility(8);
        mo94001L7();
        this.f196675B.mo94016a(C68465m.DoSend);
        C76879j.m92726T(this, getString(C0966R.string.gtf));
    }

    /* renamed from: J7 */
    public boolean mo93999J7(int i, int i2, String str) {
        boolean z;
        String str2;
        C7660a a = C7660a.m7782a(str);
        if (a != null) {
            a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            return true;
        }
        if (i == 4) {
            if (i2 != -75) {
                if (i2 == -1) {
                    if (C86709a0.m107524d().mo123467m() == 5) {
                        C76879j.m92738i(this, C0966R.string.h7_, C0966R.string.h79);
                        return true;
                    }
                }
            }
            C13665i0.m12971d(this);
            return true;
        }
        if (i2 == -2023 || i2 == -100) {
            C86718e.m107550n();
            AppCompatActivity context = getContext();
            C86709a0.m107523b();
            if (TextUtils.isEmpty(C86718e.f251747w)) {
                str2 = C76577a.m92166q(getContext(), C0966R.string.gmc);
            } else {
                C86709a0.m107523b();
                str2 = C86718e.f251747w;
            }
            C76879j.m92719M(context, str2, getContext().getString(C0966R.string.a3h), new C68452b(this), new C68453c(this));
        } else if (i2 == -43) {
            C76701a.makeText((Context) this, (int) C0966R.string.aju, 0).show();
        } else if (i2 == -41) {
            C76701a.makeText((Context) this, (int) C0966R.string.ajw, 0).show();
        } else if (i2 != -36) {
            switch (i2) {
                case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidObjectException:
                    C76701a.makeText((Context) this, (int) C0966R.string.ajx, 0).show();
                    break;
                case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidClassException:
                    C76879j.m92742m(this, C0966R.string.al9, C0966R.string.ale, new C68451a(this));
                    break;
                case APPluginConstants.ERROR_IO_NoHttpResponseException:
                    C76879j.m92749t(this, getString(C0966R.string.ala), "", new C68464l(this));
                    break;
                default:
                    z = false;
                    break;
            }
        } else {
            C76701a.makeText((Context) this, (int) C0966R.string.ajz, 0).show();
        }
        z = true;
        if (z) {
            return true;
        }
        return this.f196676C.mo107842c(this, new C77701p0(i, i2, str));
    }

    /* renamed from: K7 */
    public void mo94000K7(boolean z) {
        Intent intent = new Intent(this, RegByMobileSetPwdUI.class);
        intent.putExtra("kintent_hint", getString(C0966R.string.iul));
        intent.putExtra("kintent_cancelable", z);
        startActivityForResult(intent, 0);
    }

    /* renamed from: L7 */
    public final void mo94001L7() {
        if (this.f196690o == null) {
            this.f196692q = (long) this.f196698w;
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C68454d(), true);
            this.f196690o = mTimerHandler;
            mTimerHandler.startTimer(1000, 1000);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bgg;
    }

    public void initView() {
        Log.m105918d("MicroMsg.MobileVerifyUI", "init getintent mobile:" + this.f196691p);
        MMFormInputView mMFormInputView = (MMFormInputView) findViewById(C0966R.C0970id.a9x);
        this.f196682d = mMFormInputView;
        mMFormInputView.setImeOption(5);
        this.f196682d.setInputType(3);
        this.f196683e = this.f196682d.getContentEditText();
        this.f196685g = (TextView) findViewById(C0966R.C0970id.gxo);
        this.f196686h = (TextView) findViewById(C0966R.C0970id.gxn);
        ((TextView) findViewById(C0966R.C0970id.a9v)).setText(this.f196691p);
        this.f196691p = PhoneFormater.pureNumber(this.f196691p);
        this.f196685g.setText(getString(C0966R.string.guw));
        this.f196687i = (TextView) findViewById(C0966R.C0970id.a9y);
        this.f196688j = (Button) findViewById(C0966R.C0970id.hfe);
        this.f196689n = (ScrollView) findViewById(C0966R.C0970id.j3q);
        getResources().getStringArray(C0966R.array.f2601ap);
        this.f196687i.setText(Html.fromHtml(getString(C0966R.string.hx5)));
        InputFilter[] inputFilterArr = {new C68455e(this)};
        this.f196686h.setVisibility(0);
        TextView textView = this.f196686h;
        Resources resources = getResources();
        int i = this.f196698w;
        textView.setText(resources.getQuantityString(C0966R.plurals.f7240v, i, new Object[]{Integer.valueOf(i)}));
        mo94001L7();
        this.f196683e.setFilters(inputFilterArr);
        EditText editText = this.f196683e;
        editText.addTextChangedListener(new MMEditText.C7040d(editText, (TextView) null, 12));
        this.f196688j.setOnClickListener(new C68456f());
        this.f196688j.setEnabled(false);
        this.f196683e.setTextSize(15.0f);
        this.f196683e.addTextChangedListener(new C68457g());
        this.f196685g.setOnClickListener(new C68458h());
        this.f196685g.setEnabled(false);
        setBackBtn(new C68461i());
        this.f196683e.setOnEditorActionListener(new C68462j());
        this.f196683e.setOnKeyListener(new C68463k());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 30844) {
            this.f196675B.mo94016a(C68465m.GoPostCheck);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f196697v = getIntent().getIntExtra("key_reg_style", 1);
        this.f196674A = getIntent().getIntExtra("mobile_verify_purpose", 0);
        this.f196677D = getIntent().getStringExtra("MicroMsg.MobileVerifyUIIntent_sms_code");
        this.f196694s = getIntent().getStringExtra("kintent_password");
        this.f196696u = getIntent().getStringExtra("kintent_nickname");
        this.f196695t = Boolean.valueOf(getIntent().getBooleanExtra("kintent_hasavatar", false));
        getIntent().getBooleanExtra("from_deep_link", false);
        this.f196679F = getIntent().getStringExtra("regsession_id");
        this.f196680G = getIntent().getStringExtra("reg_3d_app_ticket");
        this.f196681H = getIntent().getIntExtra("reg_3d_app_type", 0);
        int i = this.f196674A;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.f196675B = new C68493c2();
                } else if (i != 5) {
                    Log.m105921e("MicroMsg.MobileVerifyUI", "wrong purpose %s", Integer.valueOf(i));
                    finish();
                    return;
                }
            }
            this.f196675B = new C115207z1(i);
        } else {
            this.f196675B = new C115102d2();
            String str = this.f196694s;
            if (str == null || str.length() < 8) {
                this.f196678E = 4;
            } else {
                this.f196678E = 1;
            }
        }
        String string = getString(C0966R.string.akr);
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            string = getString(C0966R.string.a0u) + C88504k.m110376b(this);
        }
        setMMTitle(string);
        this.f196698w = getIntent().getIntExtra("mobileverify_countdownsec", 30);
        getIntent().getBooleanExtra("mobileverify_fb", false);
        this.f196699x = getIntent().getBooleanExtra("mobileverify_reg_qq", false);
        this.f196691p = getIntent().getExtras().getString("bindmcontact_mobile");
        this.f196701z = C78595a.m94981a();
        initView();
        this.f196675B.mo94017b(this);
        String str2 = this.f196677D;
        if (str2 != null) {
            this.f196683e.setText(str2);
            mo93997H7();
        } else if (this.f196674A == 5) {
            this.f196675B.mo94016a(C68465m.DoSend);
        }
        this.f196676C = new C77687b();
    }

    public void onDestroy() {
        C77687b bVar = this.f196676C;
        if (bVar != null) {
            bVar.mo107840a();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C78595a.m94985e(this.f196701z);
        if (this.f196675B.mo94016a(C68465m.GoBack)) {
            return true;
        }
        finish();
        return true;
    }

    public void onKeyboardStateChanged() {
        if (keyboardState() == 1) {
            ScrollView scrollView = this.f196689n;
            scrollView.scrollTo(0, scrollView.getChildAt(0).getMeasuredHeight() - this.f196689n.getMeasuredHeight());
            return;
        }
        this.f196689n.scrollTo(0, 0);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("nofification_type");
            Log.m105919d("MicroMsg.MobileVerifyUI", "[oneliang][notificationType]%s", stringExtra);
            if (stringExtra != null && stringExtra.equals("no_reg_notification")) {
                mo93998I7();
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f196675B.stop();
    }

    public void onResume() {
        super.onResume();
        this.f196675B.start();
    }
}
