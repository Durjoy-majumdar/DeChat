package e22;

import android.widget.ListView;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import gy3.C87412m;

/* renamed from: e22.e */
public final class C7589e implements VerticalScrollBar.C6756b {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f25858d;

    public C7589e(ContactEditLabel contactEditLabel) {
        this.f25858d = contactEditLabel;
    }

    /* renamed from: S0 */
    public void mo5638S0(String str) {
        int i;
        ContactEditLabel.C69040a aVar = this.f25858d.f198447A;
        if (aVar != null) {
            if (aVar.f198473o.get(str) == null) {
                i = -1;
            } else {
                Integer num = aVar.f198473o.get(str);
                C87412m.m108591d(num);
                i = num.intValue();
            }
            if (i != -1) {
                ListView listView = this.f25858d.f198471z;
                if (listView != null) {
                    listView.setSelection(i);
                } else {
                    C87412m.m108603p("listView");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }
}
