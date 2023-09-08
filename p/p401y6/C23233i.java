package p401y6;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import p404z6.C91618d;

/* renamed from: y6.i */
public interface C23233i {

    /* renamed from: y6.i$a */
    public static final class C23234a {

        /* renamed from: a */
        public final Handler f66689a;

        /* renamed from: b */
        public final C23233i f66690b;

        /* renamed from: y6.i$a$a */
        public class C23235a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C91618d f66691d;

            public C23235a(C91618d dVar) {
                this.f66691d = dVar;
            }

            public void run() {
                synchronized (this.f66691d) {
                }
                C23234a.this.f66690b.mo33445h(this.f66691d);
            }
        }

        public C23234a(Handler handler, C23233i iVar) {
            if (iVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f66689a = handler;
            this.f66690b = iVar;
        }

        /* renamed from: a */
        public void mo36692a(C91618d dVar) {
            if (this.f66690b != null) {
                this.f66689a.post(new C23235a(dVar));
            }
        }
    }

    /* renamed from: b */
    void mo33441b(String str, long j, long j2);

    /* renamed from: e */
    void mo33443e(int i);

    /* renamed from: h */
    void mo33445h(C91618d dVar);

    /* renamed from: j */
    void mo33446j(Format format);

    /* renamed from: n */
    void mo33450n(C91618d dVar);

    /* renamed from: s */
    void mo33453s(int i, long j, long j2);
}
