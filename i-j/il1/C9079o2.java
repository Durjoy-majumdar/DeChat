package il1;

import a14.C53973z1;
import android.content.DialogInterface;
import java.util.concurrent.CancellationException;

/* renamed from: il1.o2 */
public final class C9079o2 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C9030k2 f28645d;

    public C9079o2(C9030k2 k2Var) {
        this.f28645d = k2Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C53973z1 uploadAndModJob = this.f28645d.getUploadAndModJob();
        if (uploadAndModJob != null) {
            C53973z1.C53974a.m60623a(uploadAndModJob, (CancellationException) null, 1, (Object) null);
        }
    }
}
