package f22;

import com.tencent.p014mm.plugin.label.p067ui.searchContact.ContactManagerUI;
import gy3.C87412m;

/* renamed from: f22.k */
public final class C7979k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContactManagerUI f26660d;

    public C7979k(ContactManagerUI contactManagerUI) {
        this.f26660d = contactManagerUI;
    }

    public final void run() {
        C58913e H7 = this.f26660d.mo5662H7();
        if (H7 != null) {
            String str = this.f26660d.f19788n;
            C87412m.m108591d(str);
            H7.mo84108c(str);
        }
    }
}
