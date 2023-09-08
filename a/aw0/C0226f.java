package aw0;

import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: aw0.f */
public class C0226f implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ C79636p f759a;

    public C0226f(C79636p pVar) {
        this.f759a = pVar;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105928w("MicroMsg.FloatBallPermissionUtil", "float window permission granted");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        C103922g.m138624c(this.f759a, true);
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        boolean Jn = ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext());
        Log.m105929w("MicroMsg.FloatBallPermissionUtil", "onResultCancel ok:%b", Boolean.valueOf(Jn));
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        C103922g.m138624c(this.f759a, Jn);
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Log.m105928w("MicroMsg.FloatBallPermissionUtil", "float window permission refused");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        C103922g.m138624c(this.f759a, false);
    }
}
