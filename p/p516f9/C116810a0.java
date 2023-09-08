package p516f9;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* renamed from: f9.a0 */
public final /* synthetic */ class C116810a0 implements Runnable {

    /* renamed from: d */
    public final C116847z f350156d;

    /* renamed from: e */
    public final Bundle f350157e;

    /* renamed from: f */
    public final TaskCompletionSource f350158f;

    public C116810a0(C116847z zVar, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.f350156d = zVar;
        this.f350157e = bundle;
        this.f350158f = taskCompletionSource;
    }

    public final void run() {
        C116847z zVar = this.f350156d;
        Bundle bundle = this.f350157e;
        TaskCompletionSource taskCompletionSource = this.f350158f;
        zVar.getClass();
        try {
            taskCompletionSource.setResult(zVar.f350237d.mo169425b(bundle));
        } catch (IOException e) {
            taskCompletionSource.setException(e);
        }
    }
}
