package n32;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI;

/* renamed from: n32.k */
public class C76827k implements TextWatcher {
    public C76827k(WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI) {
    }

    public void afterTextChanged(Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf >= 0 && length - indexOf > 3) {
            editable.delete(indexOf + 3, length);
        } else if (indexOf > 6) {
            editable.delete(6, indexOf);
        } else if (indexOf == -1 && length > 6) {
            editable.delete(6, length);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
