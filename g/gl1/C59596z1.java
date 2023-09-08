package gl1;

import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import d60.C58124b;
import vk1.C65761b;

/* renamed from: gl1.z1 */
public final class C59596z1 implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ C59559k f170307a;

    public C59596z1(C59559k kVar) {
        this.f170307a = kVar;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        C65761b bVar = this.f170307a.f166842f;
        boolean z = false;
        if (bVar != null) {
            bVar.setMiniWinPermission(false);
        }
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        Bundle bundle = new Bundle();
        C59559k kVar = this.f170307a;
        int i = 1;
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
        C65761b bVar2 = kVar.f166842f;
        if (bVar2 != null && bVar2.isSwipeBack()) {
            z = true;
        }
        if (!z) {
            i = 3;
        }
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", i);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        C65761b bVar3 = kVar.f166842f;
        if (bVar3 != null) {
            bVar3.statusChange(C58124b.C58125b.MINI_WINDOW, bundle);
        }
        this.f170307a.mo84610p();
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        C65761b bVar = this.f170307a.f166842f;
        if (bVar != null) {
            bVar.setMiniWinPermission(false);
        }
        Bundle bundle = new Bundle();
        C65761b bVar2 = this.f170307a.f166842f;
        if (bVar2 != null) {
            bVar2.statusChange(C58124b.C58125b.MINI_WINDOW_CANCEL, bundle);
        }
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        C65761b bVar = this.f170307a.f166842f;
        if (bVar != null) {
            bVar.setMiniWinPermission(false);
        }
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        Bundle bundle = new Bundle();
        C65761b bVar2 = this.f170307a.f166842f;
        if (bVar2 != null) {
            bVar2.statusChange(C58124b.C58125b.MINI_WINDOW_REFUSE, bundle);
        }
    }
}
