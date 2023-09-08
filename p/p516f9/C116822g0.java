package p516f9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: f9.g0 */
public final class C116822g0 {

    /* renamed from: e */
    public static C116822g0 f350174e;

    /* renamed from: a */
    public final Context f350175a;

    /* renamed from: b */
    public final ScheduledExecutorService f350176b;

    /* renamed from: c */
    public C116826i0 f350177c = new C116826i0(this, (C116824h0) null);

    /* renamed from: d */
    public int f350178d = 1;

    public C116822g0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f350176b = scheduledExecutorService;
        this.f350175a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final synchronized <T> Task<T> mo180816a(C116811b<T> bVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(bVar).length() + 9);
        }
        if (!this.f350177c.mo180819b(bVar)) {
            C116826i0 i0Var = new C116826i0(this, (C116824h0) null);
            this.f350177c = i0Var;
            i0Var.mo180819b(bVar);
        }
        return bVar.f350160b.getTask();
    }
}
