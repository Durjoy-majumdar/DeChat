package tg3;

import android.content.DialogInterface;
import bd2.C79690d;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sandbox.updater.Updater;
import di3.C86312j;

/* renamed from: tg3.z */
public class C90500z implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ Updater f260109d;

    /* renamed from: e */
    public final /* synthetic */ DialogInterface.OnCancelListener f260110e;

    public C90500z(Updater updater, DialogInterface.OnCancelListener onCancelListener) {
        this.f260109d = updater;
        this.f260110e = onCancelListener;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener;
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(99);
        C115669n.INSTANCE.idkeyStat(405, 49, 1, true);
        Updater.m105887j(2);
        this.f260109d.mo119326i();
        if (!this.f260109d.f249752g && (onCancelListener = this.f260110e) != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
