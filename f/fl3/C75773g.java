package fl3;

import com.tencent.p014mm.p136ui.contact.C74562t0;
import com.tencent.p014mm.p136ui.contact.address.MvvmAddressUIFragment;

/* renamed from: fl3.g */
public final class C75773g implements C74562t0.C74564b {

    /* renamed from: a */
    public final /* synthetic */ MvvmAddressUIFragment f222372a;

    public C75773g(MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f222372a = mvvmAddressUIFragment;
    }

    /* renamed from: a */
    public final void mo103526a(int i) {
        C74562t0 t0Var = this.f222372a.f218955y;
        if (t0Var != null) {
            if (i <= 0) {
                if (t0Var != null) {
                    t0Var.setVisibility(8);
                }
            } else if (t0Var != null) {
                t0Var.setVisibility(0);
            }
        }
    }
}
