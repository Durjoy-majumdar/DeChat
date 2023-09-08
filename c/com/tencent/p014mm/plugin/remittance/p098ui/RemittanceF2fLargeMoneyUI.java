package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.F2fLargeMoneyPayEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.remittance.model.C5060u0;
import com.tencent.p014mm.plugin.remittance.p098ui.C70887f0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C117747y;
import r43.C12942a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI */
public class RemittanceF2fLargeMoneyUI extends WalletBaseUI {

    /* renamed from: d */
    public RelativeLayout f204900d;

    /* renamed from: e */
    public TextView f204901e;

    /* renamed from: f */
    public TextView f204902f;

    /* renamed from: g */
    public WalletFormView f204903g;

    /* renamed from: h */
    public WcPayKeyboard f204904h;

    /* renamed from: i */
    public RelativeLayout f204905i;

    /* renamed from: j */
    public TextView f204906j;

    /* renamed from: n */
    public RelativeLayout f204907n;

    /* renamed from: o */
    public RelativeLayout f204908o;

    /* renamed from: p */
    public int f204909p = 4;

    /* renamed from: q */
    public int f204910q;

    /* renamed from: r */
    public String f204911r;

    /* renamed from: s */
    public String f204912s;

    /* renamed from: t */
    public double f204913t;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI$a */
    public class C70771a implements MenuItem.OnMenuItemClickListener {
        public C70771a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RemittanceF2fLargeMoneyUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI$b */
    public class C70772b implements TextView.OnEditorActionListener {
        public C70772b() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                Log.m105925i("MicroMsg.RemittanceF2fLargeMoneyUI", "click enter, mTotalAmt:%s", Double.valueOf(RemittanceF2fLargeMoneyUI.this.f204913t));
                RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = RemittanceF2fLargeMoneyUI.this;
                double d = remittanceF2fLargeMoneyUI.f204913t;
                if (d <= 0.0d) {
                    C76912y0.makeText((Context) remittanceF2fLargeMoneyUI.getContext(), (int) C0966R.string.kmc, 0).show();
                    return true;
                }
                remittanceF2fLargeMoneyUI.mo97414H7(d);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI$c */
    public class C70773c implements TextWatcher {
        public C70773c() {
        }

        public void afterTextChanged(Editable editable) {
            RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = RemittanceF2fLargeMoneyUI.this;
            remittanceF2fLargeMoneyUI.f204913t = Util.getDouble(remittanceF2fLargeMoneyUI.f204903g.getText(), 0.0d);
            RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI2 = RemittanceF2fLargeMoneyUI.this;
            if (remittanceF2fLargeMoneyUI2.f204913t <= 0.0d) {
                WcPayKeyboard wcPayKeyboard = remittanceF2fLargeMoneyUI2.f204904h;
                if (wcPayKeyboard != null) {
                    wcPayKeyboard.mo104738c(false);
                    return;
                }
                return;
            }
            WcPayKeyboard wcPayKeyboard2 = remittanceF2fLargeMoneyUI2.f204904h;
            if (wcPayKeyboard2 != null) {
                wcPayKeyboard2.mo104738c(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI$d */
    public class C70774d implements Runnable {
        public C70774d() {
        }

        public void run() {
            RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = RemittanceF2fLargeMoneyUI.this;
            remittanceF2fLargeMoneyUI.f204910q = remittanceF2fLargeMoneyUI.f204905i.getWidth();
            RemittanceF2fLargeMoneyUI.this.f204907n.setVisibility(8);
            Log.m105919d("MicroMsg.RemittanceF2fLargeMoneyUI", "post: mMaxUnitWidth:%s", Integer.valueOf(RemittanceF2fLargeMoneyUI.this.f204910q));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI$e */
    public class C70775e implements WalletFormView.C75211e {
        public C70775e() {
        }

        /* renamed from: a */
        public void mo93874a(CharSequence charSequence) {
            if (Util.isEqual(RemittanceF2fLargeMoneyUI.this.f204909p, 0)) {
                Log.m105924i("MicroMsg.RemittanceF2fLargeMoneyUI", "mAmountRemindBit == 0");
                RemittanceF2fLargeMoneyUI.this.f204907n.setVisibility(8);
                return;
            }
            long longValue = new Double(Util.getDouble(charSequence.toString(), 0.0d)).longValue();
            int i = 0;
            int i2 = 0;
            while (longValue != 0) {
                longValue /= 10;
                i++;
                i2 = (int) (longValue % 10);
            }
            RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = RemittanceF2fLargeMoneyUI.this;
            if (i >= remittanceF2fLargeMoneyUI.f204909p) {
                int i3 = remittanceF2fLargeMoneyUI.f204903g.mo105091i(charSequence, remittanceF2fLargeMoneyUI.f204910q, i2) + RemittanceF2fLargeMoneyUI.this.f204903g.getLeft();
                if (i3 != 0) {
                    RemittanceF2fLargeMoneyUI.this.f204907n.setVisibility(0);
                    RemittanceF2fLargeMoneyUI.this.f204906j.setText(C75157y0.m90139b(i));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) RemittanceF2fLargeMoneyUI.this.f204905i.getLayoutParams();
                    layoutParams.leftMargin = i3;
                    RemittanceF2fLargeMoneyUI.this.f204905i.setLayoutParams(layoutParams);
                    return;
                }
                RemittanceF2fLargeMoneyUI.this.f204907n.setVisibility(8);
                return;
            }
            remittanceF2fLargeMoneyUI.f204907n.setVisibility(8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI$f */
    public class C70776f implements View.OnTouchListener {
        public C70776f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            RemittanceF2fLargeMoneyUI.this.handleKeyboardTouchEvent(motionEvent);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: H7 */
    public void mo97414H7(double d) {
        F2fLargeMoneyPayEvent f2fLargeMoneyPayEvent = new F2fLargeMoneyPayEvent();
        f2fLargeMoneyPayEvent.f193589d.f193590a = getIntent().getStringExtra("key_amount_remind_sign");
        f2fLargeMoneyPayEvent.f193589d.f193593d = getIntent().getStringExtra("key_qr_code");
        f2fLargeMoneyPayEvent.f193589d.f193591b = (int) Math.round(d * 100.0d);
        f2fLargeMoneyPayEvent.f193589d.f193592c = this;
        f2fLargeMoneyPayEvent.publish();
    }

    /* renamed from: I7 */
    public void mo97415I7() {
        this.f204909p = getIntent().getIntExtra("key_amount_remind_bit", 4);
        this.f204911r = getIntent().getStringExtra("key_title");
        this.f204912s = getIntent().getStringExtra("key_desc");
    }

    /* renamed from: J7 */
    public void mo97416J7() {
        this.f204901e.setText(this.f204911r);
        ((C5060u0) C39818r.f106831a.mo62444c(getContext()).mo75002a(C5060u0.class)).setValue("page_title_key", this.f204911r);
        this.f204902f.setText(this.f204912s);
    }

    public void finish() {
        super.finish();
        Log.m105924i("MicroMsg.RemittanceF2fLargeMoneyUI", "finish()");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brm;
    }

    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn(new C70771a());
        this.f204900d = (RelativeLayout) findViewById(C0966R.C0970id.iwq);
        this.f204901e = (TextView) findViewById(C0966R.C0970id.coh);
        this.f204902f = (TextView) findViewById(C0966R.C0970id.cog);
        this.f204903g = (WalletFormView) findViewById(C0966R.C0970id.ilt);
        this.f204904h = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f204907n = (RelativeLayout) findViewById(C0966R.C0970id.lh6);
        this.f204908o = (RelativeLayout) findViewById(C0966R.C0970id.lh9);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.lh5);
        if (C85875k4.m106211z()) {
            View findViewById = findViewById(C0966R.C0970id.lh_);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf7);
        } else {
            View findViewById3 = findViewById(C0966R.C0970id.lh_);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById4 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view4 = findViewById4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf6);
        }
        mo97416J7();
        ((WalletTextView) this.f204903g.getTitleTv()).setTypeface(4);
        TenpaySecureEditText tenpaySecureEditText = (TenpaySecureEditText) this.f204903g.getContentEt();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tenpaySecureEditText.getLayoutParams();
        layoutParams.leftMargin = 0;
        tenpaySecureEditText.setLayoutParams(layoutParams);
        TextView titleTv = this.f204903g.getTitleTv();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) titleTv.getLayoutParams();
        layoutParams2.width = -2;
        titleTv.setLayoutParams(layoutParams2);
        setWPKeyboard(this.f204903g.getContentEt(), true, true);
        this.f204904h.setActionText(getString(C0966R.string.a18));
        ((C12942a) C39818r.f106831a.mo62444c(getContext()).mo75002a(C12942a.class)).setValue("keyboard_title_key", getString(C0966R.string.a18));
        ((RelativeLayout.LayoutParams) this.f204904h.getLayoutParams()).addRule(12);
        this.f204903g.mo105097o(7, 2);
        WalletFormView walletFormView = this.f204903g;
        int b = C76577a.m92151b(getContext(), 2);
        TenpaySecureEditText tenpaySecureEditText2 = walletFormView.f221285g;
        if (tenpaySecureEditText2 != null) {
            tenpaySecureEditText2.setPadding(b, 0, 0, 0);
        }
        this.f204903g.getContentEt().setOnEditorActionListener(new C70772b());
        this.f204903g.mo105069a(new C70773c());
        WcPayKeyboard wcPayKeyboard = this.f204904h;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.mo104738c(false);
        }
        this.f204908o.setVisibility(0);
        if (LocaleUtil.getApplicationLanguage().equals("zh_CN") || LocaleUtil.getApplicationLanguage().equals("zh_TW") || LocaleUtil.getApplicationLanguage().equals("zh_HK")) {
            this.f204905i = (RelativeLayout) findViewById(C0966R.C0970id.lh8);
            this.f204906j = (TextView) findViewById(C0966R.C0970id.lha);
            this.f204905i.post(new C70774d());
            this.f204903g.setmWalletFormViewListener(new C70775e());
        } else {
            this.f204907n.setVisibility(8);
        }
        this.f204900d.setOnTouchListener(new C70776f());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.RemittanceF2fLargeMoneyUI", "RemittanceF2fLargeMoneyUI show");
        mo97415I7();
        initView();
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.RemittanceF2fLargeMoneyUI", "onResume()");
        C70887f0.m83406d();
        C70887f0.C70888a.f205300a.mo97555a(this);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5060u0.class);
    }
}
