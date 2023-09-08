package fl3;

import com.tencent.p014mm.p136ui.contact.BizContactEntranceView;
import com.tencent.p014mm.p136ui.contact.C74599y2;
import com.tencent.p014mm.p136ui.contact.address.MvvmAddressUIFragment;

/* renamed from: fl3.f */
public final class C75772f implements C74599y2.C74600a {

    /* renamed from: a */
    public final /* synthetic */ MvvmAddressUIFragment f222371a;

    public C75772f(MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f222371a = mvvmAddressUIFragment;
    }

    /* renamed from: a */
    public final void mo103608a(int i) {
        MvvmAddressUIFragment mvvmAddressUIFragment = this.f222371a;
        C74599y2 y2Var = mvvmAddressUIFragment.f218954x;
        if (y2Var != null && mvvmAddressUIFragment.f218948r != null) {
            if (i <= 0) {
                if (y2Var != null) {
                    y2Var.setVisibility(8);
                }
                BizContactEntranceView bizContactEntranceView = this.f222371a.f218948r;
                if (bizContactEntranceView != null) {
                    bizContactEntranceView.mo103321d(true);
                    return;
                }
                return;
            }
            if (y2Var != null) {
                y2Var.setVisibility(0);
            }
            BizContactEntranceView bizContactEntranceView2 = this.f222371a.f218948r;
            if (bizContactEntranceView2 != null) {
                bizContactEntranceView2.mo103321d(false);
            }
        }
    }
}
