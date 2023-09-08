package v82;

import android.content.Intent;
import com.tencent.p014mm.plugin.voip.p475ui.C106443e;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;

/* renamed from: v82.g1 */
public final class C111451g1 implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ C106443e f333676a;

    /* renamed from: b */
    public final /* synthetic */ C111425d1 f333677b;

    /* renamed from: c */
    public final /* synthetic */ Intent f333678c;

    /* renamed from: d */
    public final /* synthetic */ boolean f333679d;

    public C111451g1(C106443e eVar, C111425d1 d1Var, Intent intent, boolean z) {
        this.f333676a = eVar;
        this.f333677b = d1Var;
        this.f333678c = intent;
        this.f333679d = z;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        this.f333676a.mo150078b();
        if (this.f333676a.mo150077a()) {
            this.f333677b.mo163096f(this.f333678c, this.f333679d);
        }
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        this.f333676a.mo150079c();
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        this.f333676a.mo150079c();
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
