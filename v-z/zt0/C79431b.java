package zt0;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.plugin.appbrand.widget.sms.EditVerifyCodeView;

/* renamed from: zt0.b */
public class C79431b extends NumberKeyListener {
    public C79431b(EditVerifyCodeView editVerifyCodeView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    public int getInputType() {
        return 3;
    }
}
