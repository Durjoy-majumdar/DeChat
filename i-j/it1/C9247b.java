package it1;

import android.content.Context;
import android.content.DialogInterface;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60183l5;
import java.lang.ref.WeakReference;
import lu3.C34379c;
import o40.C61926c;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: it1.b */
public class C9247b implements C60183l5 {

    /* renamed from: d */
    public static final C9248a f28989d = new C9248a((C8480h) null);

    /* renamed from: a */
    public C34379c<?> f28990a;

    /* renamed from: b */
    public C9254h f28991b;

    /* renamed from: c */
    public long f28992c = 500;

    /* renamed from: it1.b$a */
    public static final class C9248a {
        public C9248a(C8480h hVar) {
        }

        /* renamed from: a */
        public static C9247b m8889a(C9248a aVar, Context context, String str, long j, DialogInterface.OnCancelListener onCancelListener, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                j = 500;
            }
            if ((i & 8) != 0) {
                onCancelListener = null;
            }
            aVar.getClass();
            C87412m.m108594g(context, "context");
            C9247b bVar = new C9247b();
            bVar.f28992c = j;
            new WeakReference(context);
            C9252f fVar = new C9252f();
            if (str != null) {
                fVar.f28996c = str;
            }
            fVar.f28997d = onCancelListener;
            fVar.f28999a = new WeakReference<>(context);
            bVar.f28991b = fVar;
            return bVar;
        }
    }

    /* renamed from: it1.b$b */
    public static final class C9249b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9247b f28993d;

        public C9249b(C9247b bVar) {
            this.f28993d = bVar;
        }

        public final void run() {
            C9254h hVar = this.f28993d.f28991b;
            if (hVar != null) {
                hVar.mo10029a();
            }
            C9254h hVar2 = this.f28993d.f28991b;
            if (hVar2 != null) {
                hVar2.mo10030b();
            }
        }
    }

    /* renamed from: it1.b$c */
    public static final class C9250c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9247b f28994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9250c(C9247b bVar) {
            super(0);
            this.f28994d = bVar;
        }

        public Object invoke() {
            C9254h hVar = this.f28994d.f28991b;
            if (hVar != null) {
                hVar.mo10029a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public synchronized void mo8913b() {
        C34379c<?> cVar = this.f28990a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C61926c.m72668M(new C9250c(this));
    }

    public synchronized void begin() {
        C34379c<?> cVar = this.f28990a;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C119179t tVar = C119157j.f356862d;
        C9249b bVar = new C9249b(this);
        long j = this.f28992c;
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f28990a = jVar.mo183892w(bVar, j, false);
    }
}
