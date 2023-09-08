package gr3;

import android.text.method.NumberKeyListener;
import gr3.C76024a;

/* renamed from: gr3.d */
public class C76039d extends NumberKeyListener {
    public C76039d(C76024a.C76033i iVar) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'x', 'X'};
    }

    public int getInputType() {
        return 1;
    }
}
