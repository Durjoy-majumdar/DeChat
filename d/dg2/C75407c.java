package dg2;

import ag2.C67038p;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.plugin.qqmail.p090ui.MailAddrsViewControl;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: dg2.c */
public class C75407c implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ MailAddrsViewControl f221688d;

    public C75407c(MailAddrsViewControl mailAddrsViewControl) {
        this.f221688d = mailAddrsViewControl;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        String obj;
        View view2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i == 67 && keyEvent.getAction() == 0) {
            String obj2 = this.f221688d.f203197f.getEditableText().toString();
            if (obj2.length() == 0 && (view2 = this.f221688d.f203202n) != null && view2.isSelected()) {
                MailAddrsViewControl mailAddrsViewControl = this.f221688d;
                mailAddrsViewControl.mo96855f((C67038p) mailAddrsViewControl.f203202n.getTag());
                MailAddrsViewControl mailAddrsViewControl2 = this.f221688d;
                mailAddrsViewControl2.f203202n = null;
                mailAddrsViewControl2.mo96850a();
            } else if (obj2.length() == 0 && this.f221688d.f203196e.size() > 0) {
                int size = this.f221688d.f203196e.size() - 1;
                View childAt = this.f221688d.getChildAt(size);
                if (!childAt.isSelected()) {
                    childAt.setSelected(true);
                } else {
                    MailAddrsViewControl mailAddrsViewControl3 = this.f221688d;
                    mailAddrsViewControl3.mo96855f(mailAddrsViewControl3.f203196e.get(size));
                    this.f221688d.mo96850a();
                }
            }
        } else if (i == 66 && keyEvent.getAction() == 0 && (obj = this.f221688d.f203197f.getEditableText().toString()) != null && obj.length() > 0) {
            this.f221688d.mo96854e(obj, true);
            this.f221688d.mo96850a();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/qqmail/ui/MailAddrsViewControl$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
