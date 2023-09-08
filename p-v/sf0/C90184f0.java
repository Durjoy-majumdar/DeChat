package sf0;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import kj2.C117407d;
import p447aw.C103918d;

/* renamed from: sf0.f0 */
public class C90184f0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f258903d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f258904e;

    /* renamed from: f */
    public final /* synthetic */ C90186h0 f258905f;

    public C90184f0(C90186h0 h0Var, Activity activity, Runnable runnable) {
        this.f258905f = h0Var;
        this.f258903d = activity;
        this.f258904e = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MultiProcessMMKV.getDefault().putBoolean("had_show_permission_guild", true).apply();
        C90186h0 h0Var = this.f258905f;
        Activity activity = this.f258903d;
        Runnable runnable = this.f258904e;
        h0Var.getClass();
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(activity, "android.permission.WRITE_EXTERNAL_STORAGE", 32, "", "");
        Log.m105925i("MicroMsg.PermissionCheckHelper", "check init, summerper checkPermission checkStorage[%b]", Boolean.valueOf(z1));
        if (!z1) {
            C117407d.INSTANCE.idkeyStat(462, 18, 1, true);
            h0Var.f258906a = runnable;
            return;
        }
        h0Var.mo124430b(activity, runnable);
    }
}
