package dg2;

import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.p014mm.plugin.qqmail.p090ui.MailAddrsViewControl;

/* renamed from: dg2.b */
public class C75406b implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ MailAddrsViewControl f221687d;

    public C75406b(MailAddrsViewControl mailAddrsViewControl) {
        this.f221687d = mailAddrsViewControl;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String obj;
        if (i != 5 || (obj = this.f221687d.f203197f.getEditableText().toString()) == null || obj.length() <= 0) {
            return true;
        }
        this.f221687d.mo96854e(obj, false);
        this.f221687d.mo96850a();
        return true;
    }
}
