package dg2;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.qqmail.p090ui.MailAddrsViewControl;
import java.util.regex.Pattern;

/* renamed from: dg2.d */
public class C75408d implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ MailAddrsViewControl f221689d;

    public C75408d(MailAddrsViewControl mailAddrsViewControl) {
        this.f221689d = mailAddrsViewControl;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.endsWith("\n") || charSequence2.endsWith(" ")) {
            MailAddrsViewControl mailAddrsViewControl = this.f221689d;
            Pattern pattern = MailAddrsViewControl.f203194q;
            mailAddrsViewControl.mo96854e(charSequence2, true);
        }
        this.f221689d.mo96850a();
    }
}
