package q53;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import gy3.C87412m;

/* renamed from: q53.k0 */
public final class C12086k0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C12062e0 f35170d;

    public C12086k0(C12062e0 e0Var) {
        this.f35170d = e0Var;
    }

    public void afterTextChanged(Editable editable) {
        C87412m.m108594g(editable, "s");
        String obj = editable.toString();
        C12062e0 e0Var = this.f35170d;
        e0Var.getClass();
        Log.m105925i("WeCoinCustomAmountInputDialog", "update tips: %s", obj);
        long Y = C75228t.m90232Y(obj + "", "100");
        long Y2 = C75228t.m90232Y(obj + "", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        WalletTextView walletTextView = e0Var.f35142e;
        if (walletTextView != null) {
            walletTextView.setText(String.valueOf(Y2));
            if (Y == 0) {
                Button button = e0Var.f35141d;
                if (button != null) {
                    button.setEnabled(false);
                    TextView textView = e0Var.f35144g;
                    if (textView != null) {
                        textView.setVisibility(4);
                    } else {
                        C87412m.m108603p("inputTips");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("confirmButton");
                    throw null;
                }
            } else if (Y > e0Var.f35139b.f35190a) {
                Button button2 = e0Var.f35141d;
                if (button2 != null) {
                    button2.setEnabled(false);
                    TextView textView2 = e0Var.f35144g;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        long j = e0Var.f35139b.f35190a / ((long) 100);
                        TextView textView3 = e0Var.f35144g;
                        if (textView3 != null) {
                            textView3.setText(e0Var.f35138a.getString(C0966R.string.m0p, new Object[]{String.valueOf(j)}));
                            return;
                        }
                        C87412m.m108603p("inputTips");
                        throw null;
                    }
                    C87412m.m108603p("inputTips");
                    throw null;
                }
                C87412m.m108603p("confirmButton");
                throw null;
            } else {
                Button button3 = e0Var.f35141d;
                if (button3 != null) {
                    button3.setEnabled(true);
                    TextView textView4 = e0Var.f35144g;
                    if (textView4 != null) {
                        textView4.setVisibility(4);
                    } else {
                        C87412m.m108603p("inputTips");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("confirmButton");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("coinAmount");
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
