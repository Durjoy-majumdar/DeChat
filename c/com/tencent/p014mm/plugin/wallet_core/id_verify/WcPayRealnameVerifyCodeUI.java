package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.wallet_core.utils.C5810l;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import cr3.C75282g;
import hr3.C76241b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import nj3.C11182m0;
import nj3.C76874e0;
import ob0.C117747y;
import qo3.C77407n;
import yq3.C79148e;
import z53.C53748b;
import z53.C53749c;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI */
public class WcPayRealnameVerifyCodeUI extends WalletBaseUI {

    /* renamed from: d */
    public WalletFormView f209141d;

    /* renamed from: e */
    public WalletFormView f209142e;

    /* renamed from: f */
    public Button f209143f;

    /* renamed from: g */
    public Button f209144g;

    /* renamed from: h */
    public TextView f209145h;

    /* renamed from: i */
    public ViewGroup f209146i;

    /* renamed from: j */
    public TextView f209147j;

    /* renamed from: n */
    public C72105i f209148n;

    /* renamed from: o */
    public String f209149o = "+86";

    /* renamed from: p */
    public boolean f209150p = false;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$g */
    public class C43368g implements View.OnClickListener {
        public C43368g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.WcPayRealNameVerifyCodeUI", "click phone code layout");
            Intent intent = new Intent();
            intent.setClassName(WcPayRealnameVerifyCodeUI.this.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
            WcPayRealnameVerifyCodeUI.this.startActivityForResult(intent, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$h */
    public class C43369h implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$h$a */
        public class C43370a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C77407n f117289d;

            public C43370a(C43369h hVar, C77407n nVar) {
                this.f117289d = nVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f117289d.mo107572p();
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$8$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$h$b */
        public class C43371b implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C77407n f117290d;

            /* renamed from: e */
            public final /* synthetic */ View f117291e;

            public C43371b(C43369h hVar, C77407n nVar, View view) {
                this.f117290d = nVar;
                this.f117291e = view;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                this.f117290d.mo107567l((View) null);
                this.f117290d.mo107567l(this.f117291e);
            }
        }

        public C43369h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.WcPayRealNameVerifyCodeUI", "click verify code fail tv");
            C77407n nVar = new C77407n((Context) WcPayRealnameVerifyCodeUI.this.getContext(), 1, false);
            View inflate = WcPayRealnameVerifyCodeUI.this.getLayoutInflater().inflate(C0966R.C0971layout.che, (ViewGroup) null);
            ((Button) inflate.findViewById(C0966R.C0970id.f358422f12)).setOnClickListener(new C43370a(this, nVar));
            nVar.f225771i = new C43371b(this, nVar, inflate);
            nVar.mo107559d(true);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$a */
    public class C72099a implements MenuItem.OnMenuItemClickListener {
        public C72099a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C79148e process = WcPayRealnameVerifyCodeUI.this.getProcess();
            if (process != null) {
                process.mo91257c(WcPayRealnameVerifyCodeUI.this.getContext(), 0);
            } else {
                WcPayRealnameVerifyCodeUI.this.finish();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$b */
    public class C72100b implements View.OnClickListener {
        public C72100b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.WcPayRealNameVerifyCodeUI", "click resend btn");
            WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = WcPayRealnameVerifyCodeUI.this;
            if (wcPayRealnameVerifyCodeUI.f209148n == null) {
                wcPayRealnameVerifyCodeUI.f209148n = new C72105i(60000, 1000);
            }
            wcPayRealnameVerifyCodeUI.f209150p = true;
            wcPayRealnameVerifyCodeUI.f209143f.setEnabled(false);
            wcPayRealnameVerifyCodeUI.f209148n.start();
            C75282g netController = WcPayRealnameVerifyCodeUI.this.getNetController();
            if (netController instanceof RealNameVerifyProcess$$h) {
                RealNameVerifyProcess$$h realNameVerifyProcess$$h = (RealNameVerifyProcess$$h) netController;
                String text = WcPayRealnameVerifyCodeUI.this.f209141d.getText();
                String str = WcPayRealnameVerifyCodeUI.this.f209149o;
                realNameVerifyProcess$$h.getClass();
                Log.m105924i("MicroMsg.RealNameVerifyProcess", "do resend verify code");
                Log.m105925i("MicroMsg.RealNameVerifyProcess", "do send sms: %s", text);
                new C53748b(text, str, realNameVerifyProcess$$h.f209038c, realNameVerifyProcess$$h.f209039d.f232423c.getString("realname_verify_process_req_key", "")).mo9225i().mo123062e(new C72140b(realNameVerifyProcess$$h));
                int i = realNameVerifyProcess$$h.f209038c;
                if (i == 0) {
                    realNameVerifyProcess$$h.f209038c = i + 1;
                }
            } else {
                Log.m105928w("MicroMsg.WcPayRealNameVerifyCodeUI", "wrong controller");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$c */
    public class C72101c extends C30870z1 {
        public C72101c() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            WcPayRealnameVerifyCodeUI.m84517H7(WcPayRealnameVerifyCodeUI.this);
            if (WcPayRealnameVerifyCodeUI.this.f209144g.isEnabled()) {
                C75282g netController = WcPayRealnameVerifyCodeUI.this.getNetController();
                if (netController instanceof RealNameVerifyProcess$$h) {
                    RealNameVerifyProcess$$h realNameVerifyProcess$$h = (RealNameVerifyProcess$$h) netController;
                    String text = WcPayRealnameVerifyCodeUI.this.f209141d.getText();
                    WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = WcPayRealnameVerifyCodeUI.this;
                    String str = wcPayRealnameVerifyCodeUI.f209149o;
                    String text2 = wcPayRealnameVerifyCodeUI.f209142e.getText();
                    realNameVerifyProcess$$h.getClass();
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "do check verify code");
                    ((WalletBaseUI) realNameVerifyProcess$$h.f221418a).showProgress();
                    new C53749c(realNameVerifyProcess$$h.f209039d.f232423c.getString("realname_verify_process_req_key", ""), text, str, text2).mo9225i().mo123062e(new C72138a(realNameVerifyProcess$$h));
                    return;
                }
                Log.m105928w("MicroMsg.WcPayRealNameVerifyCodeUI", "wrong controller");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$d */
    public class C72102d implements C76241b {
        public C72102d() {
        }

        /* renamed from: a */
        public boolean mo99317a(WalletFormView walletFormView, String str) {
            return false;
        }

        /* renamed from: b */
        public boolean mo99318b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo99319c(WalletFormView walletFormView, String str) {
            return false;
        }

        /* renamed from: d */
        public boolean mo99320d(WalletFormView walletFormView) {
            if (!"+86".equals(WcPayRealnameVerifyCodeUI.this.f209149o)) {
                return !Util.isNullOrNil(WcPayRealnameVerifyCodeUI.this.f209149o) && !Util.isNullOrNil(WcPayRealnameVerifyCodeUI.this.f209141d.getText());
            }
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText == null) {
                return false;
            }
            return tenpaySecureEditText.isPhoneNum();
        }

        /* renamed from: e */
        public String mo99321e(WalletFormView walletFormView, String str) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$e */
    public class C72103e implements WalletFormView.C75209c {
        public C72103e() {
        }

        public void onInputValidChange(boolean z) {
            Log.m105925i("MicroMsg.WcPayRealNameVerifyCodeUI", "phone valid change: %s", Boolean.valueOf(z));
            WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = WcPayRealnameVerifyCodeUI.this;
            if (!wcPayRealnameVerifyCodeUI.f209141d.mo105094l() || wcPayRealnameVerifyCodeUI.f209150p) {
                wcPayRealnameVerifyCodeUI.f209143f.setEnabled(false);
            } else {
                wcPayRealnameVerifyCodeUI.f209143f.setEnabled(true);
            }
            WcPayRealnameVerifyCodeUI.m84517H7(WcPayRealnameVerifyCodeUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$f */
    public class C72104f implements TextWatcher {
        public C72104f() {
        }

        public void afterTextChanged(Editable editable) {
            WcPayRealnameVerifyCodeUI.m84517H7(WcPayRealnameVerifyCodeUI.this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI$i */
    public class C72105i extends CountDownTimer {
        public C72105i(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = WcPayRealnameVerifyCodeUI.this;
            wcPayRealnameVerifyCodeUI.f209143f.setText(wcPayRealnameVerifyCodeUI.getString(C0966R.string.ldl));
            WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI2 = WcPayRealnameVerifyCodeUI.this;
            wcPayRealnameVerifyCodeUI2.f209150p = false;
            if (!wcPayRealnameVerifyCodeUI2.f209141d.mo105094l() || wcPayRealnameVerifyCodeUI2.f209150p) {
                wcPayRealnameVerifyCodeUI2.f209143f.setEnabled(false);
            } else {
                wcPayRealnameVerifyCodeUI2.f209143f.setEnabled(true);
            }
        }

        public void onTick(long j) {
            WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = WcPayRealnameVerifyCodeUI.this;
            Button button = wcPayRealnameVerifyCodeUI.f209143f;
            StringBuilder sb = new StringBuilder();
            long j2 = j / 1000;
            sb.append(j2);
            sb.append("s");
            button.setText(wcPayRealnameVerifyCodeUI.getString(C0966R.string.ldk, new Object[]{sb.toString()}));
            WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI2 = WcPayRealnameVerifyCodeUI.this;
            Button button2 = wcPayRealnameVerifyCodeUI2.f209143f;
            button2.setContentDescription(wcPayRealnameVerifyCodeUI2.getString(C0966R.string.ldm, new Object[]{j2 + ""}));
        }
    }

    /* renamed from: H7 */
    public static void m84517H7(WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        if (Util.isNullOrNil(wcPayRealnameVerifyCodeUI.f209142e.getText()) || !wcPayRealnameVerifyCodeUI.f209141d.mo105094l()) {
            wcPayRealnameVerifyCodeUI.f209144g.setEnabled(false);
        } else {
            wcPayRealnameVerifyCodeUI.f209144g.setEnabled(true);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chf;
    }

    public void initView() {
        this.f209141d = (WalletFormView) findViewById(C0966R.C0970id.lsy);
        this.f209142e = (WalletFormView) findViewById(C0966R.C0970id.f359605lt0);
        this.f209143f = (Button) findViewById(C0966R.C0970id.lsz);
        this.f209144g = (Button) findViewById(C0966R.C0970id.lsv);
        this.f209145h = (TextView) findViewById(C0966R.C0970id.lsu);
        this.f209146i = (ViewGroup) findViewById(C0966R.C0970id.lsw);
        this.f209147j = (TextView) findViewById(C0966R.C0970id.lsx);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        this.f209141d.getInfoIv().setLayoutParams(layoutParams);
        this.f209141d.getInfoIv().setScaleType(ImageView.ScaleType.FIT_CENTER);
        WalletIconImageView infoIv = this.f209141d.getInfoIv();
        int color = getResources().getColor(C0966R.color.FG_2);
        infoIv.f212566u = C0966R.raw.icons_filled_close2;
        infoIv.f212567v = color;
        this.f209142e.getContentEt().setPadding(this.f209142e.getContentEt().getPaddingLeft(), this.f209142e.getContentEt().getPaddingTop(), 0, this.f209142e.getContentEt().getPaddingBottom());
        this.f209143f.setOnClickListener(new C72100b());
        this.f209144g.setOnClickListener(new C72101c());
        this.f209141d.setLogicDelegate(new C72102d());
        this.f209141d.setOnInputValidChangeListener(new C72103e());
        this.f209142e.mo105069a(new C72104f());
        this.f209146i.setOnClickListener(new C43368g());
        this.f209147j.setText(this.f209149o);
        this.f209145h.setOnClickListener(new C43369h());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == 100) {
            String stringExtra = intent.getStringExtra("country_name");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105924i("MicroMsg.WcPayRealNameVerifyCodeUI", "user canceled this select");
                return;
            }
            String str = "+" + intent.getStringExtra("couttry_code");
            this.f209149o = str;
            Log.m105925i("MicroMsg.WcPayRealNameVerifyCodeUI", "countryName: %s, countryCode: %s", stringExtra, str);
            this.f209147j.setText(this.f209149o);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
        hideActionbarLine();
        setBackBtn(new C72099a(), C0966R.raw.actionbar_icon_dark_close);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C72105i iVar = this.f209148n;
        if (iVar != null) {
            iVar.cancel();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5810l.class);
    }
}
