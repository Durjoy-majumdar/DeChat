package q11;

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
import java.io.Closeable;
import kotlin.Result;
import kotlin.ResultKt;
import p11.C110101a;
import p11.C110102b;
import p11.C110103c;
import rx3.C13598b0;

/* renamed from: q11.g */
public final class C110337g<IN extends C110101a, OUT extends C110102b> implements Closeable {

    /* renamed from: d */
    public final C110103c<IN, OUT> f330065d;

    /* renamed from: e */
    public final C110342i f330066e;

    /* renamed from: f */
    public final C54625h<IN> f330067f;

    /* renamed from: g */
    public final C0000n0 f330068g;

    /* renamed from: q11.g$a */
    public static final class C110338a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110337g<IN, OUT> f330069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110338a(C110337g<? super IN, ? extends OUT> gVar) {
            super(1);
            this.f330069d = gVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f330069d.f330066e.close();
            return C13598b0.f38549a;
        }
    }

    public C110337g(C110103c<? super IN, ? extends OUT> cVar) {
        C87412m.m108594g(cVar, "mtrTask");
        this.f330065d = cVar;
        C110342i iVar = new C110342i();
        this.f330066e = iVar;
        C54625h<IN> a = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);
        ((C54614c) a).mo75538p(new C110338a(this));
        this.f330067f = a;
        this.f330068g = C53930o0.m60554a(iVar.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));
    }

    public void close() {
        Object obj;
        Log.m105924i("MicroMsg.MTR.MTRExecutor", "executor stopped");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(Boolean.valueOf(C54612b0.C54613a.m61404a(this.f330067f, (Throwable) null, 1, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Result.m168120isFailureimpl(obj);
    }
}
