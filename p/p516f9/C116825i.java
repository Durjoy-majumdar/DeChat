package p516f9;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: f9.i */
public final /* synthetic */ class C116825i implements C116829k {

    /* renamed from: a */
    public final TaskCompletionSource f350180a;

    public C116825i(TaskCompletionSource taskCompletionSource) {
        this.f350180a = taskCompletionSource;
    }

    /* renamed from: a */
    public final String mo180817a() {
        try {
            return (String) Tasks.await(this.f350180a.getTask());
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(cause);
            }
        } catch (InterruptedException e2) {
            throw new IOException(e2);
        }
    }
}
