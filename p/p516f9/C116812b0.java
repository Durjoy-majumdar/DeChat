package p516f9;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: f9.b0 */
public final class C116812b0 implements Continuation<Bundle, String> {

    /* renamed from: a */
    public final /* synthetic */ C116847z f350163a;

    public C116812b0(C116847z zVar) {
        this.f350163a = zVar;
    }

    public final /* synthetic */ Object then(Task task) {
        return this.f350163a.mo180845a((Bundle) task.getResult(IOException.class));
    }
}
