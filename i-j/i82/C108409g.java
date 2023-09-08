package i82;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import c14.C54612b0;
import c14.C54614c;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h82.C108172a;
import h82.C108173b;
import h82.C108174c;
import java.io.Closeable;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;

/* renamed from: i82.g */
public final class C108409g<IN extends C108172a, OUT extends C108173b> implements Closeable {

    /* renamed from: d */
    public final C108174c<IN, OUT> f324612d;

    /* renamed from: e */
    public final C108414i f324613e;

    /* renamed from: f */
    public final C54625h<IN> f324614f;

    /* renamed from: g */
    public final C0000n0 f324615g;

    /* renamed from: i82.g$a */
    public static final class C108410a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108409g<IN, OUT> f324616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108410a(C108409g<? super IN, ? extends OUT> gVar) {
            super(1);
            this.f324616d = gVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f324616d.f324613e.close();
            return C13598b0.f38549a;
        }
    }

    public C108409g(C108174c<? super IN, ? extends OUT> cVar) {
        C87412m.m108594g(cVar, "mtrTask");
        this.f324612d = cVar;
        C108414i iVar = new C108414i();
        this.f324613e = iVar;
        C54625h<IN> a = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);
        ((C54614c) a).mo75538p(new C108410a(this));
        this.f324614f = a;
        this.f324615g = C53930o0.m60554a(iVar.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));
    }

    /* renamed from: a */
    public final void mo158936a(IN in) {
        C87412m.m108594g(in, "input");
        if (!((C54614c) this.f324614f).mo75535h()) {
            ((C54614c) this.f324614f).mo75539t(in);
        }
    }

    public void close() {
        Object obj;
        Log.m105924i("MicroMsg.MTR.MTRExecutor", "executor stopped");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(Boolean.valueOf(C54612b0.C54613a.m61404a(this.f324614f, (Throwable) null, 1, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Result.m168120isFailureimpl(obj);
    }
}
