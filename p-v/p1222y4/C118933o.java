package p1222y4;

import android.content.Context;
import androidx.work.impl.foreground.C113063a;
import java.util.UUID;
import p1014o4.C109939f;
import p1014o4.C117705u;
import p1206p4.C117971d;
import p1221x4.C118850q;
import p283z4.C119049a;
import p283z4.C119060c;

/* renamed from: y4.o */
public class C118933o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C119060c f356230d;

    /* renamed from: e */
    public final /* synthetic */ UUID f356231e;

    /* renamed from: f */
    public final /* synthetic */ C109939f f356232f;

    /* renamed from: g */
    public final /* synthetic */ Context f356233g;

    /* renamed from: h */
    public final /* synthetic */ C118934p f356234h;

    public C118933o(C118934p pVar, C119060c cVar, UUID uuid, C109939f fVar, Context context) {
        this.f356234h = pVar;
        this.f356230d = cVar;
        this.f356231e = uuid;
        this.f356232f = fVar;
        this.f356233g = context;
    }

    public void run() {
        try {
            if (!(this.f356230d.f356565d instanceof C119049a.C119052c)) {
                String uuid = this.f356231e.toString();
                C117705u f = ((C118850q) this.f356234h.f356237c).mo183557f(uuid);
                if (f == null || f.mo182396a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((C117971d) this.f356234h.f356236b).mo182724d(uuid, this.f356232f);
                this.f356233g.startService(C113063a.m154719a(this.f356233g, uuid, this.f356232f));
            }
            this.f356230d.mo183732i(null);
        } catch (Throwable th) {
            this.f356230d.mo183733j(th);
        }
    }
}
