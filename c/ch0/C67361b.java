package ch0;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.plugin.address.p879ui.AddrEditView;

/* renamed from: ch0.b */
public class C67361b extends NumberKeyListener {
    public C67361b(AddrEditView addrEditView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '+'};
    }

    public int getInputType() {
        return 3;
    }
}
