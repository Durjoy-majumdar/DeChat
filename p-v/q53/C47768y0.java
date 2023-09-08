package q53;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: q53.y0 */
public final class C47768y0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f128287d;

    public C47768y0(WeCoinEncashView weCoinEncashView) {
        this.f128287d = weCoinEncashView;
    }

    public void afterTextChanged(Editable editable) {
        C87412m.m108594g(editable, "s");
        String obj = editable.toString();
        if (C112551y.m153820t(obj, ".", false, 2, (Object) null)) {
            editable.insert(0, "0");
        } else {
            WalletFormView walletFormView = this.f128287d.f117267f;
            if (walletFormView == null) {
                C87412m.m108603p("mInputMoneyText");
                throw null;
            } else if (WalletFormView.m90176e(obj, walletFormView.getContentEt())) {
                return;
            }
        }
        String obj2 = editable.toString();
        int E = C112550d0.m153769E(obj2, ".", 0, false, 6, (Object) null);
        int length = obj2.length();
        if (E >= 0 && length - E > 3) {
            WalletFormView walletFormView2 = this.f128287d.f117267f;
            if (walletFormView2 != null) {
                WalletFormView.m90177f(walletFormView2.getContentEt(), obj2, E + 3, length);
            } else {
                C87412m.m108603p("mInputMoneyText");
                throw null;
            }
        } else if (E > 12) {
            WalletFormView walletFormView3 = this.f128287d.f117267f;
            if (walletFormView3 != null) {
                WalletFormView.m90177f(walletFormView3.getContentEt(), obj2, 12, E);
            } else {
                C87412m.m108603p("mInputMoneyText");
                throw null;
            }
        } else if (E == -1 && length > 12) {
            WalletFormView walletFormView4 = this.f128287d.f117267f;
            if (walletFormView4 != null) {
                WalletFormView.m90177f(walletFormView4.getContentEt(), obj2, 12, length);
            } else {
                C87412m.m108603p("mInputMoneyText");
                throw null;
            }
        }
        String obj3 = editable.toString();
        WeCoinEncashView weCoinEncashView = this.f128287d;
        WeakReference<C12075h1> weakReference = WeCoinEncashView.f117264v;
        weCoinEncashView.getClass();
        Log.m105925i("MicroMsg.WeCoinEncashView", "update tips: %s", obj3);
        long Y = C75228t.m90232Y(obj3 + "", "100");
        if (Y > 0) {
            long longExtra = weCoinEncashView.getIntent().getLongExtra("wecoin_income_balance", 0);
            if (Y >= 200000000) {
                TextView textView = weCoinEncashView.f117268g;
                if (textView != null) {
                    textView.setText(weCoinEncashView.getString(C0966R.string.ljm));
                    TextView textView2 = weCoinEncashView.f117268g;
                    if (textView2 != null) {
                        textView2.setTextColor(weCoinEncashView.getResources().getColor(C0966R.color.Red_100));
                        weCoinEncashView.f117272n = false;
                        weCoinEncashView.mo67561I7(false);
                        return;
                    }
                    C87412m.m108603p("mTotalBalanceWithdrawTip");
                    throw null;
                }
                C87412m.m108603p("mTotalBalanceWithdrawTip");
                throw null;
            } else if (Y > longExtra) {
                TextView textView3 = weCoinEncashView.f117268g;
                if (textView3 != null) {
                    textView3.setText(weCoinEncashView.getString(C0966R.string.ljl));
                    TextView textView4 = weCoinEncashView.f117268g;
                    if (textView4 != null) {
                        textView4.setTextColor(weCoinEncashView.getResources().getColor(C0966R.color.Red_100));
                        weCoinEncashView.f117272n = false;
                        weCoinEncashView.mo67561I7(false);
                        return;
                    }
                    C87412m.m108603p("mTotalBalanceWithdrawTip");
                    throw null;
                }
                C87412m.m108603p("mTotalBalanceWithdrawTip");
                throw null;
            } else {
                TextView textView5 = weCoinEncashView.f117268g;
                if (textView5 != null) {
                    textView5.setText(weCoinEncashView.f117271j);
                    TextView textView6 = weCoinEncashView.f117268g;
                    if (textView6 != null) {
                        textView6.setTextColor(weCoinEncashView.f117273o);
                        weCoinEncashView.f117272n = true;
                        weCoinEncashView.mo67561I7(true);
                        return;
                    }
                    C87412m.m108603p("mTotalBalanceWithdrawTip");
                    throw null;
                }
                C87412m.m108603p("mTotalBalanceWithdrawTip");
                throw null;
            }
        } else {
            TextView textView7 = weCoinEncashView.f117268g;
            if (textView7 != null) {
                textView7.setText(weCoinEncashView.f117271j);
                TextView textView8 = weCoinEncashView.f117268g;
                if (textView8 != null) {
                    textView8.setTextColor(weCoinEncashView.f117273o);
                    weCoinEncashView.f117272n = false;
                    weCoinEncashView.mo67561I7(false);
                    return;
                }
                C87412m.m108603p("mTotalBalanceWithdrawTip");
                throw null;
            }
            C87412m.m108603p("mTotalBalanceWithdrawTip");
            throw null;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }
}
