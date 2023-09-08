package lg2;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.plugin.recharge.p093ui.form.MallFormView;

/* renamed from: lg2.n */
public class C76685n extends NumberKeyListener {
    public C76685n(MallFormView mallFormView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-'};
    }

    public int getInputType() {
        return 3;
    }
}
