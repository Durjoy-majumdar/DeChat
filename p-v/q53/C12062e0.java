package q53;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import gy3.C87412m;
import qo3.C101218e0;

/* renamed from: q53.e0 */
public final class C12062e0 {

    /* renamed from: a */
    public final Context f35138a;

    /* renamed from: b */
    public final C12102o0 f35139b;

    /* renamed from: c */
    public final C101218e0 f35140c;

    /* renamed from: d */
    public Button f35141d;

    /* renamed from: e */
    public WalletTextView f35142e;

    /* renamed from: f */
    public WalletFormView f35143f;

    /* renamed from: g */
    public TextView f35144g;

    /* renamed from: h */
    public final KeyboardHeightProvider f35145h;

    /* renamed from: q53.e0$a */
    public static final class C12063a implements C7020t0 {

        /* renamed from: d */
        public final /* synthetic */ C12062e0 f35146d;

        public C12063a(C12062e0 e0Var) {
            this.f35146d = e0Var;
        }

        /* renamed from: Q1 */
        public final void mo531Q1(int i, boolean z) {
            Log.m105924i("WeCoinCustomAmountInputDialog", "KeyboardHeightObserver " + i + ' ' + z);
            if (i > 0) {
                C12062e0 e0Var = this.f35146d;
                C101218e0 e0Var2 = e0Var.f35140c;
                if (e0Var2.mo140661h()) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
                    ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofInt.addUpdateListener(new C12074h0(e0Var, e0Var2));
                    ofInt.addListener(new C12078i0(e0Var2));
                    ofInt.setDuration(200);
                    ofInt.start();
                    return;
                }
                return;
            }
            C101218e0 e0Var3 = this.f35146d.f35140c;
            if (e0Var3.mo140661h()) {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{e0Var3.f296384g.getPaddingBottom(), 0});
                ofInt2.setInterpolator(new DecelerateInterpolator());
                ofInt2.addUpdateListener(new C12067f0(e0Var3));
                ofInt2.addListener(new C12071g0(e0Var3));
                ofInt2.setDuration(200);
                ofInt2.start();
            }
        }
    }

    public C12062e0(Context context, C12102o0 o0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(o0Var, "parameter");
        this.f35138a = context;
        this.f35139b = o0Var;
        C101218e0 e0Var = new C101218e0(context, 0, 0, true, o0Var.f35191b);
        this.f35140c = e0Var;
        View inflate = View.inflate(context, C0966R.C0971layout.cmz, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.lok);
        C87412m.m108593f(findViewById, "result.findViewById(R.id.wecoin_recharge_btn)");
        this.f35141d = (Button) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.lxl);
        C87412m.m108593f(findViewById2, "result.findViewById(R.id.coin_amount)");
        this.f35142e = (WalletTextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.m2a);
        C87412m.m108593f(findViewById3, "result.findViewById(R.id.input_area)");
        this.f35143f = (WalletFormView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f7x);
        C87412m.m108593f(findViewById4, "result.findViewById(R.id.input_tips)");
        this.f35144g = (TextView) findViewById4;
        WalletFormView walletFormView = this.f35143f;
        if (walletFormView != null) {
            walletFormView.setmContentAbnormalMoneyCheck(true);
            Button button = this.f35141d;
            if (button != null) {
                button.setEnabled(false);
                if (o0Var.f35191b) {
                    int color = context.getResources().getColor(C0966R.color.BW_100_Alpha_0_8);
                    int color2 = context.getResources().getColor(C0966R.color.BW_100_Alpha_0_3);
                    ((WeImageView) inflate.findViewById(C0966R.C0970id.f357484a32)).setIconColor(color);
                    ((TextView) inflate.findViewById(C0966R.C0970id.knx)).setTextColor(color);
                    ((TextView) inflate.findViewById(C0966R.C0970id.lyq)).setTextColor(color2);
                    ((WeImageView) inflate.findViewById(C0966R.C0970id.m98)).setIconColor(color2);
                    ((WalletTextView) inflate.findViewById(C0966R.C0970id.ljn)).setTextColor(color);
                    ((LinearLayout) inflate.findViewById(C0966R.C0970id.gyl)).setBackgroundResource(C0966R.C0969drawable.b6g);
                    WalletFormView walletFormView2 = this.f35143f;
                    if (walletFormView2 != null) {
                        walletFormView2.setContentTextColor(color);
                        WalletTextView walletTextView = this.f35142e;
                        if (walletTextView != null) {
                            walletTextView.setTextColor(color2);
                            Button button2 = this.f35141d;
                            if (button2 != null) {
                                button2.setTextColor(context.getResources().getColor(C0966R.color.f3256kz));
                                Button button3 = this.f35141d;
                                if (button3 != null) {
                                    button3.setBackgroundResource(C0966R.C0969drawable.f4655ow);
                                } else {
                                    C87412m.m108603p("confirmButton");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("confirmButton");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("coinAmount");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("inputArea");
                        throw null;
                    }
                }
                ((WeImageView) inflate.findViewById(C0966R.C0970id.f357484a32)).setOnClickListener(new C12082j0(this));
                WalletFormView walletFormView3 = this.f35143f;
                if (walletFormView3 != null) {
                    walletFormView3.mo105069a(new C12086k0(this));
                    Button button4 = this.f35141d;
                    if (button4 != null) {
                        button4.setOnClickListener(new C12090l0(this));
                        e0Var.mo140664k(inflate, 0, 0);
                        e0Var.mo140679y(48);
                        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider((Activity) context);
                        keyboardHeightProvider.f220015b = new C12063a(this);
                        this.f35145h = keyboardHeightProvider;
                        return;
                    }
                    C87412m.m108603p("confirmButton");
                    throw null;
                }
                C87412m.m108603p("inputArea");
                throw null;
            }
            C87412m.m108603p("confirmButton");
            throw null;
        }
        C87412m.m108603p("inputArea");
        throw null;
    }

    /* renamed from: a */
    public final void mo11909a() {
        WalletFormView walletFormView = this.f35143f;
        if (walletFormView != null) {
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText != null) {
                tenpaySecureEditText.clearFocus();
                ((InputMethodManager) walletFormView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(walletFormView.f221285g.getWindowToken(), 0);
            }
            this.f35145h.mo104021d();
            this.f35140c.mo140680z();
            return;
        }
        C87412m.m108603p("inputArea");
        throw null;
    }
}
