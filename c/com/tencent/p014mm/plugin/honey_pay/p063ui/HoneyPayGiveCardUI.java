package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import de3.C75355a0;
import di3.C86312j;
import fy3.C32226l;
import j20.C117292a;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.HashSet;
import k20.C9556a;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76979h;
import t02.C48527c;
import te3.C77933g43;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI */
public class HoneyPayGiveCardUI extends HoneyPayBaseUI {

    /* renamed from: A */
    public C77933g43 f114818A;

    /* renamed from: B */
    public String f114819B;

    /* renamed from: f */
    public ScrollView f114820f;

    /* renamed from: g */
    public WalletFormView f114821g;

    /* renamed from: h */
    public ImageView f114822h;

    /* renamed from: i */
    public TextView f114823i;

    /* renamed from: j */
    public TextView f114824j;

    /* renamed from: n */
    public TextView f114825n;

    /* renamed from: o */
    public TextView f114826o;

    /* renamed from: p */
    public TextView f114827p;

    /* renamed from: q */
    public CdnImageView f114828q;

    /* renamed from: r */
    public MMEditText f114829r;

    /* renamed from: s */
    public WcPayBannerView f114830s;

    /* renamed from: t */
    public long f114831t = 100000;

    /* renamed from: u */
    public long f114832u = 0;

    /* renamed from: v */
    public String f114833v;

    /* renamed from: w */
    public String f114834w;

    /* renamed from: x */
    public String f114835x;

    /* renamed from: y */
    public String f114836y;

    /* renamed from: z */
    public int f114837z;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$a */
    public class C42426a implements TextWatcher {
        public C42426a() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(".")) {
                editable.insert(0, "0");
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 2) {
                editable.delete(indexOf + 3, length);
            }
            HoneyPayGiveCardUI.m46095I7(HoneyPayGiveCardUI.this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$b */
    public class C42427b extends C7089c0 {
        public C42427b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            HoneyPayGiveCardUI honeyPayGiveCardUI = HoneyPayGiveCardUI.this;
            honeyPayGiveCardUI.f114821g.mo105096n(honeyPayGiveCardUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$c */
    public class C42428c extends C7089c0 {
        public C42428c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            HoneyPayGiveCardUI.this.f114826o.setVisibility(8);
            HoneyPayGiveCardUI.this.f114821g.setVisibility(0);
            HoneyPayGiveCardUI honeyPayGiveCardUI = HoneyPayGiveCardUI.this;
            honeyPayGiveCardUI.f114821g.mo105096n(honeyPayGiveCardUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$d */
    public class C42429d extends C7089c0 {
        public C42429d() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105918d(HoneyPayGiveCardUI.this.f114712d, "click give btn");
            if (HoneyPayGiveCardUI.m46095I7(HoneyPayGiveCardUI.this)) {
                HoneyPayGiveCardUI.this.hideTenpayKB();
                HoneyPayGiveCardUI honeyPayGiveCardUI = HoneyPayGiveCardUI.this;
                Log.m105924i(honeyPayGiveCardUI.f114712d, "go to pwd ui");
                long Y = C75228t.m90232Y(honeyPayGiveCardUI.f114821g.getText(), "100");
                String stringExtra = honeyPayGiveCardUI.getIntent().getStringExtra("key_take_message");
                Intent intent = new Intent(honeyPayGiveCardUI.getContext(), HoneyPayCheckPwdUI.class);
                intent.putExtra("key_scene", 1);
                intent.putExtra("key_credit_line", Y);
                intent.putExtra("key_take_message", stringExtra);
                intent.putExtra("key_username", honeyPayGiveCardUI.f114834w);
                intent.putExtra("key_wishing", honeyPayGiveCardUI.f114835x);
                intent.putExtra("key_cardtype", honeyPayGiveCardUI.f114837z);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(honeyPayGiveCardUI, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayGiveCardUI", "gotoPwdUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                honeyPayGiveCardUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(honeyPayGiveCardUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayGiveCardUI", "gotoPwdUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            Log.m105928w(HoneyPayGiveCardUI.this.f114712d, "over limit when click");
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$e */
    public class C42430e implements TextView.OnEditorActionListener {
        public C42430e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            HoneyPayGiveCardUI honeyPayGiveCardUI = HoneyPayGiveCardUI.this;
            honeyPayGiveCardUI.f114835x = honeyPayGiveCardUI.f114829r.getText().toString();
            HoneyPayGiveCardUI.this.hideVKB();
            HoneyPayGiveCardUI.this.mo66517L7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$f */
    public class C42431f implements View.OnFocusChangeListener {
        public C42431f() {
        }

        public void onFocusChange(View view, boolean z) {
            if (!z) {
                HoneyPayGiveCardUI honeyPayGiveCardUI = HoneyPayGiveCardUI.this;
                honeyPayGiveCardUI.f114835x = honeyPayGiveCardUI.f114829r.getText().toString();
                HoneyPayGiveCardUI.this.mo66517L7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$g */
    public class C42432g implements C75217h {
        public C42432g() {
        }

        public void onVisibleStateChange(boolean z) {
            if (z) {
                HoneyPayGiveCardUI honeyPayGiveCardUI = HoneyPayGiveCardUI.this;
                honeyPayGiveCardUI.scrollToFormEditPosAfterShowTenPay(honeyPayGiveCardUI.f114820f, honeyPayGiveCardUI.f114825n, 10);
                return;
            }
            HoneyPayGiveCardUI.this.f114820f.scrollTo(0, 0);
            HoneyPayGiveCardUI.this.f114821g.mo105072d();
            if (Util.isNullOrNil(HoneyPayGiveCardUI.this.f114821g.getText())) {
                HoneyPayGiveCardUI.this.f114821g.setVisibility(8);
                HoneyPayGiveCardUI.this.f114826o.setVisibility(0);
                HoneyPayGiveCardUI.this.mo66515J7(false);
                HoneyPayGiveCardUI.this.mo66516K7(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$h */
    public class C42433h implements Runnable {
        public C42433h() {
        }

        public void run() {
            HoneyPayGiveCardUI honeyPayGiveCardUI = HoneyPayGiveCardUI.this;
            honeyPayGiveCardUI.f114821g.mo105096n(honeyPayGiveCardUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$i */
    public class C42434i implements C72476y0.C72477a {
        public C42434i() {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            HoneyPayGiveCardUI.this.hideTenpayKB();
            HoneyPayGiveCardUI.this.f114827p.setVisibility(8);
            HoneyPayGiveCardUI.this.f114829r.setVisibility(0);
            HoneyPayGiveCardUI.this.f114829r.requestFocus();
            HoneyPayGiveCardUI.this.showVKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$j */
    public static class C42435j extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$j$a */
        public class C42436a implements C32226l<View, Boolean> {
            public C42436a(C42435j jVar) {
            }

            public Object invoke(Object obj) {
                return ((View) obj).isShown() ? Boolean.TRUE : Boolean.FALSE;
            }
        }

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI$j$b */
        public class C42437b implements Runnable {
            public C42437b() {
            }

            public void run() {
                TextView textView = (TextView) C42435j.this.findViewById(C0966R.C0970id.ezd);
                if (textView != null) {
                    textView.sendAccessibilityEvent(8);
                }
            }
        }

        public C42435j(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0970id.ezg).view(C0966R.C0970id.eza).desc((int) C0966R.string.fkd).type(ViewType.Button);
            root(C0966R.C0970id.ezg).view(C0966R.C0970id.ezh).talkOn(new C42436a(this));
            root(C0966R.C0970id.ezg).view(C0966R.C0970id.ljn).disable();
            C119179t tVar = C119157j.f356862d;
            C42437b bVar = new C42437b();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(bVar, 300, false);
        }
    }

    /* renamed from: I7 */
    public static boolean m46095I7(HoneyPayGiveCardUI honeyPayGiveCardUI) {
        if (Util.isNullOrNil(honeyPayGiveCardUI.f114821g.getText())) {
            Log.m105918d(honeyPayGiveCardUI.f114712d, "no input, hide alert");
            honeyPayGiveCardUI.mo66515J7(false);
            honeyPayGiveCardUI.mo66516K7(false);
            honeyPayGiveCardUI.f114825n.setEnabled(false);
        } else {
            int X = C75228t.m90231X(honeyPayGiveCardUI.f114821g.getText(), "100");
            Log.m105919d(honeyPayGiveCardUI.f114712d, "current fen: %s", Integer.valueOf(X));
            long j = (long) X;
            if (j < honeyPayGiveCardUI.f114832u) {
                honeyPayGiveCardUI.mo66516K7(true);
                honeyPayGiveCardUI.f114825n.setEnabled(false);
            } else if (j > honeyPayGiveCardUI.f114831t) {
                honeyPayGiveCardUI.mo66515J7(true);
                honeyPayGiveCardUI.f114825n.setEnabled(false);
            } else if (X == 0) {
                honeyPayGiveCardUI.f114825n.setEnabled(false);
            } else {
                honeyPayGiveCardUI.mo66515J7(false);
                honeyPayGiveCardUI.mo66516K7(false);
                honeyPayGiveCardUI.f114825n.setEnabled(true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: J7 */
    public final void mo66515J7(boolean z) {
        if (z && !this.f114824j.isShown()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C45121z0.m49962b());
            sb.append(C75228t.m90248h("" + this.f114831t, "100", 2, RoundingMode.HALF_UP).toString());
            String sb4 = sb.toString();
            if (!Util.isNullOrNil(this.f114819B)) {
                this.f114824j.setText(this.f114819B);
            } else {
                this.f114824j.setText(getString(C0966R.string.fkq, new Object[]{sb4}));
            }
            this.f114824j.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2425cq));
            this.f114824j.setVisibility(0);
            TextView textView = (TextView) ((C42435j) component(C42435j.class)).findViewById(C0966R.C0970id.ezh);
            textView.announceForAccessibility(textView.getText());
        } else if (!z && this.f114824j.isShown()) {
            this.f114824j.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2447d_));
            this.f114824j.setVisibility(8);
        }
    }

    /* renamed from: K7 */
    public final void mo66516K7(boolean z) {
        if (z && !this.f114824j.isShown()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C45121z0.m49962b());
            sb.append(C75228t.m90250i("" + this.f114832u, "100", 2, RoundingMode.HALF_UP));
            String sb4 = sb.toString();
            this.f114824j.setText(getString(C0966R.string.fku, new Object[]{sb4}));
            this.f114824j.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2425cq));
            this.f114824j.setVisibility(0);
            TextView textView = (TextView) ((C42435j) component(C42435j.class)).findViewById(C0966R.C0970id.ezh);
            textView.announceForAccessibility(textView.getText());
        } else if (!z && this.f114824j.isShown()) {
            this.f114824j.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2447d_));
            this.f114824j.setVisibility(8);
        }
    }

    /* renamed from: L7 */
    public final void mo66517L7() {
        this.f114827p.setVisibility(0);
        this.f114829r.setVisibility(8);
        this.f114829r.setText(this.f114835x);
        this.f114829r.setSelection(this.f114835x.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(C0966R.string.fkx);
        SpannableString yp02 = ((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), this.f114835x, this.f114827p.getTextSize());
        spannableStringBuilder.append(yp02);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.append(string);
        spannableStringBuilder.setSpan(new C72476y0(1, (C72476y0.C72477a) new C42434i()), yp02.length() + 1, spannableStringBuilder.length(), 34);
        this.f114827p.setText(spannableStringBuilder);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azm;
    }

    public void initView() {
        this.f114820f = (ScrollView) findViewById(C0966R.C0970id.ezg);
        this.f114821g = (WalletFormView) findViewById(C0966R.C0970id.eze);
        this.f114823i = (TextView) findViewById(C0966R.C0970id.ez_);
        this.f114824j = (TextView) findViewById(C0966R.C0970id.ezh);
        this.f114822h = (ImageView) findViewById(C0966R.C0970id.ez8);
        this.f114825n = (TextView) findViewById(C0966R.C0970id.eza);
        this.f114826o = (TextView) findViewById(C0966R.C0970id.ezb);
        this.f114827p = (TextView) findViewById(C0966R.C0970id.ezj);
        this.f114829r = (MMEditText) findViewById(C0966R.C0970id.ezi);
        this.f114830s = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f114822h, this.f114834w, 0.06f);
        String g = C75228t.m90246g(this.f114834w, 10);
        if (!Util.isNullOrNil(this.f114833v)) {
            g = String.format("%s(%s)", new Object[]{g, this.f114833v});
        }
        this.f114823i.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), g, this.f114823i.getTextSize()));
        TenpaySecureEditText tenpaySecureEditText = this.f114821g.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setPadding(0, 0, 0, 0);
        }
        this.f114821g.getTitleTv().setText(C45121z0.m49962b());
        this.f114821g.mo105069a(new C42426a());
        this.f114821g.setOnClickListener(new C42427b());
        this.f114826o.setOnClickListener(new C42428c());
        this.f114825n.setClickable(true);
        this.f114825n.setOnClickListener(new C42429d());
        this.f114827p.setClickable(true);
        this.f114827p.setOnTouchListener(new C75355a0(this));
        this.f114829r.setOnEditorActionListener(new C42430e());
        this.f114829r.setOnFocusChangeListener(new C42431f());
        mo66517L7();
        setTenpayKBStateListener(new C42432g());
        setEditFocusListener(this.f114821g, 2, false);
        this.f114821g.postDelayed(new C42433h(), 100);
        this.f114828q = (CdnImageView) findViewById(C0966R.C0970id.ezf);
        if (!Util.isNullOrNil(this.f114836y)) {
            this.f114828q.mo100288c(this.f114836y, 0, 0, C48527c.m53908d(this.f114837z));
        } else {
            this.f114828q.setImageResource(C48527c.m53908d(this.f114837z));
        }
        this.f114830s.setBannerData(this.f114818A);
        this.f114830s.setBgColor(getResources().getColor(C0966R.color.f2960ag));
        this.f114830s.setTextColor(getResources().getColor(C0966R.color.al6));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        this.f114713e = C0966R.color.f3565xw;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(C0966R.color.al6);
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        this.f114831t = getIntent().getLongExtra("key_max_credit_line", 0);
        this.f114819B = getIntent().getStringExtra("key_over_max_limit_warning");
        this.f114832u = getIntent().getLongExtra("key_min_credit_line", 0);
        this.f114833v = getIntent().getStringExtra("key_true_name");
        this.f114834w = getIntent().getStringExtra("key_username");
        this.f114835x = getIntent().getStringExtra("key_wishing");
        this.f114836y = getIntent().getStringExtra("key_icon_url");
        this.f114837z = getIntent().getIntExtra("key_cardtype", 0);
        String stringExtra = getIntent().getStringExtra("key_notice_item");
        if (!Util.isNullOrNil(stringExtra)) {
            try {
                C77933g43 g432 = new C77933g43();
                g432.parseFrom(Base64.decode(stringExtra, 2));
                this.f114818A = g432;
            } catch (IOException e) {
                Log.printErrStackTrace(this.f114712d, e, "", new Object[0]);
            }
        }
        if (this.f114837z == 0) {
            Log.m105928w(this.f114712d, "error card type!!");
            finish();
        }
        initView();
        setMMTitle((int) C0966R.string.fkg);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C42435j.class);
    }
}
