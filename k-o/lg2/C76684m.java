package lg2;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.plugin.recharge.p093ui.form.MallFormView;

/* renamed from: lg2.m */
public class C76684m extends NumberKeyListener {
    public C76684m(MallFormView mallFormView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    public int getInputType() {
        return 18;
    }
}
