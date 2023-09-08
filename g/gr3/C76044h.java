package gr3;

import android.widget.EditText;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: gr3.h */
public class C76044h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditText f222901d;

    /* renamed from: e */
    public final /* synthetic */ String f222902e;

    public C76044h(EditText editText, String str) {
        this.f222901d = editText;
        this.f222902e = str;
    }

    public void run() {
        int selectionStart = this.f222901d.getSelectionStart();
        int selectionEnd = this.f222901d.getSelectionEnd();
        if (Util.isNullOrNil(this.f222902e)) {
            this.f222901d.setText("");
            return;
        }
        this.f222901d.setText(this.f222902e);
        EditText editText = this.f222901d;
        if (selectionStart > this.f222902e.length()) {
            selectionStart = this.f222902e.length();
        }
        if (selectionEnd > this.f222902e.length()) {
            selectionEnd = this.f222902e.length();
        }
        editText.setSelection(selectionStart, selectionEnd);
    }
}
