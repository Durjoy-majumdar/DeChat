package com.tencent.p014mm.plugin.remittance.p098ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C45056f1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.remittance.model.C42853v;
import com.tencent.p014mm.plugin.remittance.model.C42855x;
import com.tencent.p014mm.plugin.remittance.model.C5058t0;
import com.tencent.p014mm.plugin.remittance.p098ui.C70887f0;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import di3.C86312j;
import gy3.C87412m;
import ie3.C76324c;
import j20.C117292a;
import java.math.RoundingMode;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import p206nj.C11171e;
import p629ny.C76979h;
import te3.C51607uw2;
import te3.C77935gl2;

/* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI */
public class WalletMerchantPayUI extends WalletBaseUI implements WcPayKeyboard.C75086f {

    /* renamed from: X */
    public static final /* synthetic */ int f205217X = 0;

    /* renamed from: A */
    public int f205218A;

    /* renamed from: B */
    public String f205219B;

    /* renamed from: C */
    public String f205220C;

    /* renamed from: D */
    public String f205221D;

    /* renamed from: E */
    public String f205222E;

    /* renamed from: F */
    public String f205223F;

    /* renamed from: G */
    public TextView f205224G;

    /* renamed from: H */
    public LinearLayout f205225H;

    /* renamed from: I */
    public RelativeLayout f205226I;

    /* renamed from: J */
    public RelativeLayout f205227J;

    /* renamed from: K */
    public RelativeLayout f205228K;

    /* renamed from: L */
    public TextView f205229L;

    /* renamed from: M */
    public int f205230M;

    /* renamed from: N */
    public long f205231N;

    /* renamed from: P */
    public String f205232P;

    /* renamed from: Q */
    public View f205233Q;

    /* renamed from: R */
    public TextView f205234R;

    /* renamed from: S */
    public TextView f205235S;

    /* renamed from: T */
    public TextView f205236T;

    /* renamed from: U */
    public Button f205237U;

    /* renamed from: V */
    public int f205238V = 0;

    /* renamed from: W */
    public Runnable f205239W = new C70859e();

    /* renamed from: d */
    public int f205240d;

    /* renamed from: e */
    public TextView f205241e;

    /* renamed from: f */
    public TextView f205242f;

    /* renamed from: g */
    public CdnImageView f205243g;

    /* renamed from: h */
    public WalletFormView f205244h;

    /* renamed from: i */
    public LinearLayout f205245i;

    /* renamed from: j */
    public LinearLayout f205246j;

    /* renamed from: n */
    public TextView f205247n;

    /* renamed from: o */
    public TextView f205248o;

    /* renamed from: p */
    public RemittanceRemarkInputHalfPage f205249p;

    /* renamed from: q */
    public EditText f205250q;

    /* renamed from: r */
    public boolean f205251r = false;

    /* renamed from: s */
    public String f205252s;

    /* renamed from: t */
    public ScrollView f205253t;

    /* renamed from: u */
    public WcPayKeyboard f205254u;

    /* renamed from: v */
    public String f205255v;

    /* renamed from: w */
    public String f205256w = "";

    /* renamed from: x */
    public double f205257x;

    /* renamed from: y */
    public String f205258y;

    /* renamed from: z */
    public int f205259z = 4;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$a */
    public class C70855a implements C72506r.C72510d {

        /* renamed from: a */
        public final /* synthetic */ C42855x f205260a;

        public C70855a(C42855x xVar) {
            this.f205260a = xVar;
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            int i = gl22.f227479e;
            if (i == 1) {
                WalletMerchantPayUI.this.finish();
            } else if (i == 2) {
                String str = gl22.f227480f;
                if (str == null || str.length() <= 0) {
                    WalletMerchantPayUI.this.mo97529K7(this.f205260a);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("rawUrl", gl22.f227480f);
                C75228t.m90217J(WalletMerchantPayUI.this, intent);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$b */
    public class C70856b implements C7092q.C7093a {
        public C70856b() {
        }

        public void onClick(View view) {
            WalletMerchantPayUI.m83390H7(WalletMerchantPayUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$c */
    public class C70857c implements C7092q.C7093a {
        public C70857c() {
        }

        public void onClick(View view) {
            WalletMerchantPayUI.m83390H7(WalletMerchantPayUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$d */
    public class C70858d implements MenuItem.OnMenuItemClickListener {
        public C70858d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.MerchantPayUI", "click back btn");
            WalletMerchantPayUI walletMerchantPayUI = WalletMerchantPayUI.this;
            walletMerchantPayUI.mo97527I7(walletMerchantPayUI.f205256w, 1);
            WalletMerchantPayUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$e */
    public class C70859e implements Runnable {
        public C70859e() {
        }

        public void run() {
            WalletMerchantPayUI walletMerchantPayUI = WalletMerchantPayUI.this;
            if (walletMerchantPayUI.f205238V == 2 && walletMerchantPayUI.isHandleAutoShowNormalStWcKb()) {
                WalletMerchantPayUI walletMerchantPayUI2 = WalletMerchantPayUI.this;
                if (!walletMerchantPayUI2.f205251r) {
                    walletMerchantPayUI2.showNormalStWcKb();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$f */
    public class C70860f extends C7089c0 {
        public C70860f() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C115669n.INSTANCE.mo160131h(15235, 5);
            WalletMerchantPayUI walletMerchantPayUI = WalletMerchantPayUI.this;
            int i = WalletMerchantPayUI.f205217X;
            walletMerchantPayUI.f205257x = walletMerchantPayUI.mo97528J7();
            WalletMerchantPayUI walletMerchantPayUI2 = WalletMerchantPayUI.this;
            if (walletMerchantPayUI2.f205257x <= 0.0d) {
                C76912y0.makeText((Context) walletMerchantPayUI2.getContext(), (int) C0966R.string.kmc, 0).show();
                return;
            }
            walletMerchantPayUI2.getClass();
            Log.m105924i("MicroMsg.MerchantPayUI", "do place order");
            walletMerchantPayUI2.hideWcKb();
            if (walletMerchantPayUI2.f205251r) {
                walletMerchantPayUI2.hideVKB();
                walletMerchantPayUI2.f205250q.clearFocus();
            }
            walletMerchantPayUI2.addSceneEndListener(4954);
            C42855x xVar = new C42855x(walletMerchantPayUI2.f205255v, walletMerchantPayUI2.f205257x, walletMerchantPayUI2.f205258y, walletMerchantPayUI2.f205223F);
            xVar.setProcessName("MerchantPay");
            walletMerchantPayUI2.showLoading();
            walletMerchantPayUI2.doSceneProgress(xVar, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$g */
    public class C70861g implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnClickListener f205267d;

        public C70861g(View.OnClickListener onClickListener) {
            this.f205267d = onClickListener;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                Log.m105924i("MicroMsg.MerchantPayUI", "click enter");
                WalletMerchantPayUI walletMerchantPayUI = WalletMerchantPayUI.this;
                if (walletMerchantPayUI.f205251r) {
                    walletMerchantPayUI.hideWcKb();
                    WalletMerchantPayUI.this.f205250q.requestFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) WalletMerchantPayUI.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(WalletMerchantPayUI.this.f205250q, 0);
                    }
                } else {
                    this.f205267d.onClick((View) null);
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$h */
    public class C70862h implements C75217h {
        public C70862h() {
        }

        public void onVisibleStateChange(boolean z) {
            WalletMerchantPayUI walletMerchantPayUI = WalletMerchantPayUI.this;
            int i = WalletMerchantPayUI.f205217X;
            walletMerchantPayUI.getClass();
            if (!z) {
                WalletMerchantPayUI.this.f205253t.scrollTo(0, 0);
                WalletFormView walletFormView = WalletMerchantPayUI.this.f205244h;
                if (walletFormView != null && walletFormView.getVisibility() == 0) {
                    WalletMerchantPayUI.this.f205244h.setFocusable(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$i */
    public class C70863i implements Runnable {
        public C70863i() {
        }

        public void run() {
            WalletMerchantPayUI walletMerchantPayUI = WalletMerchantPayUI.this;
            walletMerchantPayUI.f205230M = walletMerchantPayUI.f205228K.getWidth();
            WalletMerchantPayUI.this.f205226I.setVisibility(8);
            Log.m105919d("MicroMsg.MerchantPayUI", "post: mMaxUnitWidth:%s", Integer.valueOf(WalletMerchantPayUI.this.f205230M));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI$j */
    public class C70864j implements WalletFormView.C75211e {
        public C70864j() {
        }

        /* renamed from: a */
        public void mo93874a(CharSequence charSequence) {
            if (Util.isEqual(WalletMerchantPayUI.this.f205259z, 0)) {
                Log.m105924i("MicroMsg.MerchantPayUI", "mAmountRemindBit == 0");
                WalletMerchantPayUI.this.f205226I.setVisibility(8);
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
            WalletMerchantPayUI walletMerchantPayUI = WalletMerchantPayUI.this;
            if (i >= walletMerchantPayUI.f205259z) {
                int i3 = walletMerchantPayUI.f205244h.mo105091i(charSequence, walletMerchantPayUI.f205230M, i2);
                if (i3 != 0) {
                    WalletMerchantPayUI.this.f205226I.setVisibility(0);
                    WalletMerchantPayUI.this.f205229L.setText(C75157y0.m90139b(i));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) WalletMerchantPayUI.this.f205228K.getLayoutParams();
                    layoutParams.leftMargin = i3;
                    WalletMerchantPayUI.this.f205228K.setLayoutParams(layoutParams);
                    return;
                }
                WalletMerchantPayUI.this.f205226I.setVisibility(8);
                return;
            }
            walletMerchantPayUI.f205226I.setVisibility(8);
        }
    }

    /* renamed from: H7 */
    public static void m83390H7(WalletMerchantPayUI walletMerchantPayUI) {
        walletMerchantPayUI.f205244h.clearFocus();
        String str = "";
        if (walletMerchantPayUI.f205249p == null) {
            walletMerchantPayUI.f205249p = new RemittanceRemarkInputHalfPage(walletMerchantPayUI, 60, str, RemittanceRemarkInputHalfPage.C70828b.RemittanceBusi);
        }
        RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = walletMerchantPayUI.f205249p;
        String string = walletMerchantPayUI.getContext().getString(C0966R.string.hzp);
        remittanceRemarkInputHalfPage.getClass();
        C87412m.m108594g(string, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        remittanceRemarkInputHalfPage.f205120n = string;
        if (!Util.isNullOrNil(walletMerchantPayUI.f205252s)) {
            str = walletMerchantPayUI.f205252s;
        }
        walletMerchantPayUI.f205249p.mo97491a(walletMerchantPayUI.f205258y, str, new C70872a2(walletMerchantPayUI));
    }

    /* renamed from: I7 */
    public void mo97527I7(String str, int i) {
        Log.m105924i("MicroMsg.MerchantPayUI", "do check pay");
        C42853v vVar = new C42853v(str, i, this.f205255v);
        vVar.setProcessName("MerchantPay");
        doSceneProgress(vVar, false);
    }

    /* renamed from: J7 */
    public final double mo97528J7() {
        if (this.f205240d == 0) {
            this.f205257x = Util.getDouble(this.f205244h.getText(), 0.0d);
            Log.m105925i("MicroMsg.MerchantPayUI", "mMoneyEt.getText：%s", this.f205244h.getText());
        }
        Log.m105925i("MicroMsg.MerchantPayUI", "mTotalAmt：%s", Double.valueOf(this.f205257x));
        return this.f205257x;
    }

    /* renamed from: K7 */
    public void mo97529K7(C42855x xVar) {
        String str = xVar.f116059g.f143164g;
        Bundle bundle = new Bundle();
        bundle.putString("prepayId", str);
        bundle.putInt("payScene", 73);
        bundle.putInt("payChannel", this.f205218A);
        bundle.putString("qrCodeUrl", getIntent().getStringExtra("qrcodeUrl"));
        bundle.putInt("chatType", getIntent().getIntExtra("chat_type", 0));
        bundle.putInt("sendType", getIntent().getIntExtra("send_type", 0));
        bundle.putInt("qrCodeSessionType", getIntent().getIntExtra("qrcodeSessionType", 0));
        bundle.putString("qrCodeSessionName", getIntent().getStringExtra("qrcodeSessionName"));
        bundle.putString("qrCodeTimelineObjId", getIntent().getStringExtra("qrcodeTimelineObjId"));
        ((C76324c) C86312j.m106911c(C76324c.class)).startInWxAppPayUseCase(this, bundle);
    }

    /* renamed from: L7 */
    public final void mo97530L7() {
        if (!Util.isNullOrNil(this.f205258y)) {
            this.f205247n.setVisibility(0);
            this.f205248o.setVisibility(8);
            String string = getString(C0966R.string.i1o);
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, getString(C0966R.string.bgb, new Object[]{this.f205258y, string}));
            C75228t.m90253j0(this.f205247n, T1.toString(), T1.length() - string.length(), T1.length(), new C7092q((C7092q.C7093a) new C70856b(), true), getContext());
            return;
        }
        this.f205247n.setVisibility(8);
        this.f205248o.setVisibility(0);
        String string2 = getString(C0966R.string.hzp);
        C75228t.m90253j0(this.f205248o, string2, 0, string2.length(), new C7092q((C7092q.C7093a) new C70857c(), true), getContext());
    }

    /* renamed from: M7 */
    public final void mo97531M7() {
        double J7 = mo97528J7();
        this.f205257x = J7;
        if (J7 <= 0.0d) {
            WcPayKeyboard wcPayKeyboard = this.f205254u;
            if (wcPayKeyboard != null) {
                wcPayKeyboard.mo104738c(false);
            }
            this.f205237U.setEnabled(false);
            return;
        }
        WcPayKeyboard wcPayKeyboard2 = this.f205254u;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.mo104738c(true);
        }
        if (!this.f205251r) {
            this.f205237U.setEnabled(true);
        } else if (this.f205237U.getVisibility() != 0 || Util.isNullOrNil((CharSequence) this.f205250q.getText())) {
            this.f205237U.setEnabled(false);
        } else {
            this.f205237U.setEnabled(true);
        }
    }

    /* renamed from: R2 */
    public void mo95768R2(float f) {
        ScrollView scrollView = this.f205253t;
        if (scrollView != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) scrollView.getLayoutParams();
            layoutParams.bottomMargin = (int) f;
            this.f205253t.setLayoutParams(layoutParams);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cra;
    }

    public void initView() {
        boolean z;
        Class cls = C76979h.class;
        hideActionbarLine();
        this.f205253t = (ScrollView) findViewById(C0966R.C0970id.iwq);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.mb5);
        this.f205241e = (TextView) findViewById(C0966R.C0970id.mcx);
        this.f205242f = (TextView) findViewById(C0966R.C0970id.mba);
        this.f205243g = (CdnImageView) findViewById(C0966R.C0970id.mbb);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.mb8);
        this.f205244h = walletFormView;
        walletFormView.getHint();
        this.f205225H = (LinearLayout) findViewById(C0966R.C0970id.f358738mb3);
        this.f205224G = (TextView) findViewById(C0966R.C0970id.mb4);
        this.f205245i = (LinearLayout) findViewById(C0966R.C0970id.f358736mb1);
        this.f205248o = (TextView) findViewById(C0966R.C0970id.m9o);
        this.f205247n = (TextView) findViewById(C0966R.C0970id.m9q);
        this.f205246j = (LinearLayout) findViewById(C0966R.C0970id.f358737oh3);
        this.f205250q = (EditText) findViewById(C0966R.C0970id.oh4);
        this.f205227J = (RelativeLayout) findViewById(C0966R.C0970id.lh9);
        this.f205254u = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f205233Q = (LinearLayout) findViewById(C0966R.C0970id.mtr);
        this.f205234R = (TextView) findViewById(C0966R.C0970id.mto);
        this.f205235S = (TextView) findViewById(C0966R.C0970id.mtp);
        this.f205236T = (TextView) findViewById(C0966R.C0970id.mtn);
        this.f205237U = (Button) findViewById(C0966R.C0970id.mtq);
        if (this.f205240d == 1) {
            View view = this.f205233Q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initFixedModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initFixedModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f205225H.setVisibility(8);
            this.f205227J.setVisibility(8);
            if (!Util.isNullOrNil(this.f205232P)) {
                this.f205234R.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f205232P, this.f205234R.getTextSize()));
            }
            this.f205235S.setText(C75228t.m90260n(this.f205257x));
            this.f205236T.setTextSize(1, 56.0f);
            this.f205235S.setTextSize(1, 56.0f);
            this.f205237U.setVisibility(0);
            this.f205253t.setOnTouchListener(new C70879c2(this, false));
        } else {
            View view3 = this.f205233Q;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initNormalModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initNormalModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f205225H.setVisibility(0);
            this.f205227J.setVisibility(0);
            if (!Util.isNullOrNil(this.f205232P)) {
                this.f205224G.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f205232P, this.f205224G.getTextSize()));
            }
            this.f205244h.getContentEt().setTextSize(1, 52.0f);
            this.f205244h.getContentEt().setMinHeight(C76577a.m92151b(getContext(), 56));
            this.f205244h.getTitleTv().setTextSize(1, 52.0f);
            if (this.f205251r) {
                this.f205237U.setVisibility(0);
                this.f205237U.setEnabled(false);
                this.f205253t.setOnTouchListener(new C70879c2(this, false));
                z = false;
            } else {
                this.f205237U.setVisibility(8);
                this.f205253t.setOnTouchListener(new C70879c2(this, true));
                z = true;
            }
            if (!z) {
                this.f205244h.getContentEt().clearFocus();
            }
            setWPKeyboard(this.f205244h.getContentEt(), z, true);
            this.f205244h.setmContentAbnormalMoneyCheck(true);
            if (C11171e.m11046c(28)) {
                this.f205244h.getContentEt().post(new C70955v1(this, z));
            }
            if (this.f205251r) {
                this.f205254u.setActionText(getString(C0966R.string.a18));
                ((C5058t0) C39818r.f106831a.mo62444c(getContext()).mo75002a(C5058t0.class)).setValue("keyboard_title_key", getString(C0966R.string.a18));
            } else {
                this.f205254u.setActionText(getString(C0966R.string.i05));
                ((C5058t0) C39818r.f106831a.mo62444c(getContext()).mo75002a(C5058t0.class)).setValue("keyboard_title_key", getString(C0966R.string.i05));
            }
            setWcKbHeightListener(this);
            ((RelativeLayout.LayoutParams) this.f205254u.getLayoutParams()).addRule(12);
            this.f205244h.setOnFocusChangeListener(new C70958w1(this));
            this.f205244h.mo105069a(new C70961x1(this));
            this.f205244h.mo105097o(7, 2);
        }
        MMHandlerThread.postToMainThread(new C70882d2(this));
        if (this.f205251r) {
            this.f205245i.setVisibility(8);
            this.f205246j.setVisibility(0);
            this.f205250q.setHint(this.f205252s);
            this.f205250q.addTextChangedListener(new C70964y1(this));
            this.f205250q.setOnFocusChangeListener(new C70967z1(this));
        } else {
            this.f205246j.setVisibility(8);
            this.f205245i.setVisibility(0);
            mo97530L7();
        }
        C70860f fVar = new C70860f();
        this.f205237U.setOnClickListener(fVar);
        this.f205244h.getContentEt().setOnEditorActionListener(new C70861g(fVar));
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.lh5);
        if (C85875k4.m106211z()) {
            View findViewById = findViewById(C0966R.C0970id.lh_);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view5 = findViewById;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = findViewById2;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf7);
        } else {
            View findViewById3 = findViewById(C0966R.C0970id.lh_);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view7 = findViewById3;
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById4 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view8 = findViewById4;
            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf6);
        }
        setTenpayKBStateListener(new C70862h());
        this.f205226I = (RelativeLayout) findViewById(C0966R.C0970id.lh6);
        if (LocaleUtil.getApplicationLanguage().equals("zh_CN") || LocaleUtil.getApplicationLanguage().equals("zh_TW") || LocaleUtil.getApplicationLanguage().equals("zh_HK")) {
            this.f205228K = (RelativeLayout) findViewById(C0966R.C0970id.lh8);
            this.f205229L = (TextView) findViewById(C0966R.C0970id.lha);
            this.f205228K.post(new C70863i());
            this.f205244h.setmWalletFormViewListener(new C70864j());
        } else {
            this.f205226I.setVisibility(8);
        }
        C45056f1.m49909b(this, this.f205253t, findViewById(C0966R.C0970id.mb7), findViewById(C0966R.C0970id.mb7), findViewById(C0966R.C0970id.mb6), 24, 0.0f, false);
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        return this.f205240d == 0 && this.f205254u.mo104746j();
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.a7_)));
        View j = getSupportActionBar().mo91099j();
        if (!(j == null || (findViewById = j.findViewById(16908308)) == null || !(findViewById instanceof TextView))) {
            ((TextView) findViewById).setTextColor(getResources().getColor(C0966R.color.a7f));
        }
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.a7_));
        if (C11171e.m11046c(21) && !C11171e.m11046c(23)) {
            getWindow().setStatusBarColor(getContext().getResources().getColor(C0966R.color.BW_93));
        }
        setBackBtn(new C70876b2(this), C0966R.raw.actionbar_icon_dark_back);
        addSceneEndListener(4954);
        addSceneEndListener(4839);
        setMMTitle((int) C0966R.string.i05);
        setBackBtn(new C70858d());
        this.f205259z = 4;
        this.f205219B = getIntent().getStringExtra("shopName");
        this.f205255v = getIntent().getStringExtra("scanId");
        this.f205221D = getIntent().getStringExtra("shopAddress");
        this.f205220C = getIntent().getStringExtra("shopAdName");
        this.f205222E = getIntent().getStringExtra("shopHeadImgURL");
        this.f205218A = getIntent().getIntExtra("payChannel", 0);
        this.f205223F = getIntent().getStringExtra("qrcode_sender_username");
        this.f205232P = getIntent().getStringExtra("key_shop_desc");
        this.f205231N = getIntent().getLongExtra("key_shop_amount", 0);
        this.f205251r = getIntent().getBooleanExtra("merchantPayPayerDescRequired", false);
        String stringExtra = getIntent().getStringExtra("merchantPayPayerDescPlaceholder");
        this.f205252s = stringExtra;
        if (this.f205251r && Util.isNullOrNil(stringExtra)) {
            this.f205252s = getString(C0966R.string.nf_);
        }
        double i = C75228t.m90250i("" + this.f205231N, "100", 2, RoundingMode.HALF_UP);
        this.f205257x = i;
        if (i > 0.0d) {
            this.f205240d = 1;
        } else {
            this.f205240d = 0;
        }
        initView();
        mo97531M7();
        if (this.f205240d == 0) {
            this.f205238V = 1;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(4954);
        removeSceneEndListener(4839);
        Log.m105924i("MicroMsg.MerchantPayUI", "onDestroy()");
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.MerchantPayUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f205239W, 300);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        WcPayKeyboard wcPayKeyboard = this.f205254u;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.MerchantPayUI", "onPause()");
        if (this.f205240d == 0 && !this.f205254u.mo104747k()) {
            this.f205238V = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.MerchantPayUI", "onResume()");
        C70887f0.m83406d();
        C70887f0.C70888a.f205300a.mo97555a(this);
        if (this.f205238V == 3 && isHandleAutoShowNormalStWcKb() && !this.f205251r) {
            showNormalStWcKb();
        }
        if (this.f205240d == 0) {
            this.f205238V = 2;
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C42855x) {
            C42855x xVar = (C42855x) yVar;
            hideLoading();
            if (i == 0 && i2 == 0) {
                C51607uw2 uw22 = xVar.f116059g;
                if (uw22.f143161d == 0) {
                    String str2 = uw22.f143164g;
                    this.f205256w = uw22.f143163f;
                    if (C72506r.m84839e(uw22.f143165h)) {
                        new C72506r(this).mo99913c(uw22.f143165h, new C70855a(xVar));
                        return true;
                    }
                    mo97529K7(xVar);
                } else {
                    String str3 = uw22.f143162e;
                    Log.m105929w("MicroMsg.MerchantPayUI", "showAlert3() msg:%s, title:%s", Util.nullAsNil(str3), Util.nullAsNil(""));
                    C76879j.m92713G(this, str3, "", true, (DialogInterface.OnClickListener) null);
                }
            }
        }
        return true;
    }

    public boolean shouldEnsureSoterConnection() {
        return true;
    }
}
