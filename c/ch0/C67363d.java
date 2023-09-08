package ch0;

import android.text.method.NumberKeyListener;
import com.tencent.p014mm.plugin.address.p879ui.InvoiceEditView;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: ch0.d */
public class C67363d extends NumberKeyListener {

    /* renamed from: d */
    public final /* synthetic */ InvoiceEditView f193223d;

    public C67363d(InvoiceEditView invoiceEditView) {
        this.f193223d = invoiceEditView;
    }

    public char[] getAcceptedChars() {
        return this.f193223d.f196841d ? new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ' '} : new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-', '+', '_', 8212, ' ', ' ', '(', ')', 65288, 65289, '@', '~', '*', '&', '^', '%', '$', '#', '@', '!', ';', XVFSFile.PATH_SEPARATOR_CHAR, 65306, 65307, '{', '}', '[', ']', 65371, 65373, 12304, 12305, '<', '>', 36716, '~', '`', 183, '=', '=', '+'};
    }

    public int getInputType() {
        return 3;
    }
}
