package p212oe;

import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;

/* renamed from: oe.s$$g */
public final /* synthetic */ class s$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117776s f352280d;

    public /* synthetic */ s$$g(C117776s sVar) {
        this.f352280d = sVar;
    }

    public final void run() {
        this.f352280d.f343160i.putBoolean("extra_running_app_task", ProcessUILifecycleOwner.m98000c());
    }
}
