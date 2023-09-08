package fl3;

import com.tencent.p014mm.p136ui.contact.C6935t;
import com.tencent.p014mm.p136ui.contact.address.MvvmAddressUIFragment;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;

/* renamed from: fl3.e */
public final class C75770e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MvvmAddressUIFragment f222369d;

    /* renamed from: fl3.e$a */
    public static final class C75771a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MvvmAddressUIFragment f222370d;

        public C75771a(MvvmAddressUIFragment mvvmAddressUIFragment) {
            this.f222370d = mvvmAddressUIFragment;
        }

        public final void run() {
            C6935t tVar = this.f222370d.f218952v;
            if (tVar != null) {
                tVar.setVisible(true);
            }
        }
    }

    public C75770e(MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f222369d = mvvmAddressUIFragment;
    }

    public final void run() {
        if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69671T3("@social.black.android", (String) null, (List<String>) null) > 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, Boolean.TRUE);
            MvvmAddressUIFragment mvvmAddressUIFragment = this.f222369d;
            C6935t tVar = mvvmAddressUIFragment.f218952v;
            if (tVar != null) {
                tVar.post(new C75771a(mvvmAddressUIFragment));
            }
        }
    }
}
