package p516f9;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.iid.zzb;

/* renamed from: f9.u */
public final class C116842u extends Binder {

    /* renamed from: d */
    public final zzb f350222d;

    public C116842u(zzb zzb) {
        this.f350222d = zzb;
    }

    /* renamed from: a */
    public final void mo180838a(C116840s sVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.f350222d.mo169428c(sVar.f350216a)) {
                sVar.mo180836a();
                return;
            }
            Log.isLoggable("EnhancedIntentService", 3);
            this.f350222d.f339234d.execute(new C116843v(this, sVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
