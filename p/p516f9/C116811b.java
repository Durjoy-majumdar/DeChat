package p516f9;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: f9.b */
public abstract class C116811b<T> {

    /* renamed from: a */
    public final int f350159a;

    /* renamed from: b */
    public final TaskCompletionSource<T> f350160b = new TaskCompletionSource<>();

    /* renamed from: c */
    public final int f350161c;

    /* renamed from: d */
    public final Bundle f350162d;

    public C116811b(int i, int i2, Bundle bundle) {
        this.f350159a = i;
        this.f350161c = i2;
        this.f350162d = bundle;
    }

    /* renamed from: a */
    public final void mo180803a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(this).length() + 16 + String.valueOf(t).length());
        }
        this.f350160b.setResult(t);
    }

    /* renamed from: b */
    public final void mo180804b(C116813c cVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(this).length() + 14 + String.valueOf(cVar).length());
        }
        this.f350160b.setException(cVar);
    }

    /* renamed from: c */
    public abstract void mo180800c(Bundle bundle);

    /* renamed from: d */
    public abstract boolean mo180801d();

    public String toString() {
        int i = this.f350161c;
        int i2 = this.f350159a;
        boolean d = mo180801d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
