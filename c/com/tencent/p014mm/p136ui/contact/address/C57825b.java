package com.tencent.p014mm.p136ui.contact.address;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.ContactCountView;
import j20.C117292a;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.contact.address.b */
public final class C57825b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MvvmAddressUIFragment f165448d;

    public C57825b(MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f165448d = mvvmAddressUIFragment;
    }

    public final void run() {
        MvvmAddressUIFragment mvvmAddressUIFragment = this.f165448d;
        int i = MvvmAddressUIFragment.f218930P;
        View findViewById = mvvmAddressUIFragment.findViewById(C0966R.C0970id.g3q);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        MvvmAddressUIFragment mvvmAddressUIFragment2 = this.f165448d;
        ContactCountView contactCountView = new ContactCountView(this.f165448d.getContext());
        MvvmAddressUIFragment mvvmAddressUIFragment3 = this.f165448d;
        contactCountView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        C60898l.m71327S5(mvvmAddressUIFragment3.mo103519X(), contactCountView, contactCountView.hashCode(), false, 4, (Object) null);
        mvvmAddressUIFragment2.f218953w = contactCountView;
    }
}
