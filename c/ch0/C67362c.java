package ch0;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.plugin.address.p879ui.InvoiceEditView;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: ch0.c */
public class C67362c extends NumberKeyListener {
    public C67362c(InvoiceEditView invoiceEditView) {
    }

    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-', '+', '_', 8212, ' ', ' ', '(', ')', 65288, 65289, '@', '~', '*', '&', '^', '%', '$', '#', '@', '!', ';', XVFSFile.PATH_SEPARATOR_CHAR, 65306, 65307, '{', '}', '[', ']', 65371, 65373, 12304, 12305, '<', '>', '~', '`', 183, '=', '=', '+'};
    }

    public int getInputType() {
        return 2;
    }
}
