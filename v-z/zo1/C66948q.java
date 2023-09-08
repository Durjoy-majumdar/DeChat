package zo1;

import bp1.C54519d;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zo1.q */
public final class C66948q implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ C66943p f192340a;

    public C66948q(C66943p pVar) {
        this.f192340a = pVar;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105924i(this.f192340a.f192332q, "request miniWindow, onResultAllow");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f192340a.mo90933Z0();
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105920e(this.f192340a.f192332q, "request miniWindow, onResultCancel");
        ((C54519d) this.f192340a.mo87696x0(C54519d.class)).mo75380o3(false);
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105920e(this.f192340a.f192332q, "request miniWindow, onResultRefuse");
        ((C54519d) this.f192340a.mo87696x0(C54519d.class)).mo75380o3(false);
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
