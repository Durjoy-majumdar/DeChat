package fl1;

import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import d60.C58124b;
import vk1.C65760a;

/* renamed from: fl1.e2 */
public final class C59160e2 implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ C59161f f169185a;

    public C59160e2(C59161f fVar) {
        this.f169185a = fVar;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        Bundle bundle = new Bundle();
        C59161f fVar = this.f169185a;
        int i = 1;
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
        C65760a aVar = fVar.f166837f;
        if (!(aVar != null && aVar.isSwipeBack())) {
            i = 3;
        }
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", i);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        C65760a aVar2 = fVar.f166837f;
        if (aVar2 != null) {
            aVar2.statusChange(C58124b.C58125b.MINI_WINDOW, bundle);
        }
        C65760a aVar3 = this.f169185a.f166837f;
        if (aVar3 != null) {
            aVar3.setMiniWinPermission(false);
        }
        this.f169185a.mo84375K();
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        C65760a aVar = this.f169185a.f166837f;
        if (aVar != null) {
            aVar.setMiniWinPermission(false);
        }
        Bundle bundle = new Bundle();
        C65760a aVar2 = this.f169185a.f166837f;
        if (aVar2 != null) {
            aVar2.statusChange(C58124b.C58125b.MINI_WINDOW_CANCEL, bundle);
        }
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        C65760a aVar = this.f169185a.f166837f;
        if (aVar != null) {
            aVar.setMiniWinPermission(false);
        }
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        Bundle bundle = new Bundle();
        C65760a aVar2 = this.f169185a.f166837f;
        if (aVar2 != null) {
            aVar2.statusChange(C58124b.C58125b.MINI_WINDOW_REFUSE, bundle);
        }
    }
}
