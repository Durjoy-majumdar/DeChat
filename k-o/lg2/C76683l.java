package lg2;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.plugin.recharge.p093ui.form.MallFormView;

/* renamed from: lg2.l */
public class C76683l extends NumberKeyListener {
    public C76683l(MallFormView mallFormView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'x', 'X'};
    }

    public int getInputType() {
        return 1;
    }
}
