package e22;

import android.widget.EditText;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import nj3.C76905x;
import qo3.C101218e0;

/* renamed from: e22.f0 */
public class C75504f0 implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ ContactLabelUI f221875a;

    public C75504f0(ContactLabelUI contactLabelUI) {
        this.f221875a = contactLabelUI;
    }

    public void dismiss() {
        EditText editText;
        ContactLabelUI contactLabelUI = this.f221875a;
        C76905x xVar = contactLabelUI.f198651e;
        if (xVar != null && (editText = xVar.f224757M) != null) {
            contactLabelUI.hideVKB(editText);
        }
    }
}
