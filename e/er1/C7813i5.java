package er1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9247b;
import it1.C9252f;
import it1.C9254h;
import java.lang.ref.WeakReference;
import lu3.C34379c;
import o40.C61926c;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: er1.i5 */
public final class C7813i5 extends C9247b {

    /* renamed from: f */
    public static final C7814a f26336f = new C7814a((C8480h) null);

    /* renamed from: e */
    public int f26337e;

    /* renamed from: er1.i5$a */
    public static final class C7814a {
        public C7814a(C8480h hVar) {
        }

        /* renamed from: a */
        public static C7813i5 m7953a(C7814a aVar, Context context, String str, long j, DialogInterface.OnCancelListener onCancelListener, int i, Object obj) {
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
            C7813i5 i5Var = new C7813i5();
            i5Var.f28992c = j;
            new WeakReference(context);
            C9252f fVar = new C9252f();
            if (str != null) {
                fVar.f28996c = str;
            }
            fVar.f28997d = onCancelListener;
            fVar.f28999a = new WeakReference<>(context);
            i5Var.f28991b = fVar;
            return i5Var;
        }
    }

    /* renamed from: er1.i5$b */
    public static final class C7815b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C7813i5 f26338d;

        public C7815b(C7813i5 i5Var) {
            this.f26338d = i5Var;
        }

        public final void run() {
            Log.m105924i("MultiDelayLoadingComponent", "begin() show loadingCount:" + this.f26338d.f26337e);
            C9254h hVar = this.f26338d.f28991b;
            if (hVar != null) {
                hVar.mo10029a();
            }
            C9254h hVar2 = this.f26338d.f28991b;
            if (hVar2 != null) {
                hVar2.mo10030b();
            }
        }
    }

    /* renamed from: er1.i5$c */
    public static final class C7816c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7813i5 f26339d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7816c(C7813i5 i5Var) {
            super(0);
            this.f26339d = i5Var;
        }

        public Object invoke() {
            Log.m105924i("MultiDelayLoadingComponent", "end() dismiss loadingCount:" + this.f26339d.f26337e);
            C9254h hVar = this.f26339d.f28991b;
            if (hVar != null) {
                hVar.mo10029a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public synchronized void mo8913b() {
        this.f26337e--;
        Log.m105924i("MultiDelayLoadingComponent", "end() loadingCount:" + this.f26337e);
        if (this.f26337e <= 0) {
            C34379c<?> cVar = this.f28990a;
            if (cVar != null) {
                cVar.cancel(false);
            }
            C61926c.m72668M(new C7816c(this));
        }
    }

    public synchronized void begin() {
        this.f26337e++;
        Log.m105924i("MultiDelayLoadingComponent", "begin() loadingCount:" + this.f26337e);
        if (this.f26337e <= 1) {
            C34379c<?> cVar = this.f28990a;
            if (cVar != null) {
                cVar.cancel(false);
            }
            C119179t tVar = C119157j.f356862d;
            C7815b bVar = new C7815b(this);
            long j = this.f28992c;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            this.f28990a = jVar.mo183892w(bVar, j, false);
        }
    }
}
