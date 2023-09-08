package p516f9;

import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import p1042u.C111059i;

/* renamed from: f9.j */
public final /* synthetic */ class C116827j implements C116829k {

    /* renamed from: a */
    public final C116823h f350187a;

    /* renamed from: b */
    public final C116829k f350188b;

    /* renamed from: c */
    public final TaskCompletionSource f350189c;

    /* renamed from: d */
    public final Pair f350190d;

    public C116827j(C116823h hVar, C116829k kVar, TaskCompletionSource taskCompletionSource, Pair pair) {
        this.f350187a = hVar;
        this.f350188b = kVar;
        this.f350189c = taskCompletionSource;
        this.f350190d = pair;
    }

    /* renamed from: a */
    public final String mo180817a() {
        C116823h hVar = this.f350187a;
        C116829k kVar = this.f350188b;
        TaskCompletionSource taskCompletionSource = this.f350189c;
        Pair pair = this.f350190d;
        hVar.getClass();
        try {
            String a = kVar.mo180817a();
            taskCompletionSource.setResult(a);
            synchronized (hVar) {
                ((C111059i) hVar.f350179a).remove(pair);
            }
            return a;
        } catch (IOException | RuntimeException e) {
            taskCompletionSource.setException(e);
            throw e;
        } catch (Throwable th) {
            synchronized (hVar) {
                ((C111059i) hVar.f350179a).remove(pair);
                throw th;
            }
        }
    }
}
