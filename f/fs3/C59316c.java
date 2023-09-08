package fs3;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import android.util.Log;
import fy3.C32227p;
import gy3.C24560g0;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fs3.c */
public final class C59316c<T> {

    /* renamed from: a */
    public final T f169613a;

    /* renamed from: b */
    public String f169614b = "";

    /* renamed from: c */
    public Bundle f169615c = new Bundle();

    @C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.EventDetector$1", mo125469f = "EventDetector.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: fs3.c$a */
    public static final class C59317a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C59316c<T> f169616d;

        /* renamed from: e */
        public final /* synthetic */ Throwable f169617e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59317a(C59316c<T> cVar, Throwable th, C15601d<? super C59317a> dVar) {
            super(2, dVar);
            this.f169616d = cVar;
            this.f169617e = th;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59317a(this.f169616d, this.f169617e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59317a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C59316c<T> cVar = this.f169616d;
            String stackTraceString = Log.getStackTraceString(this.f169617e);
            C87412m.m108593f(stackTraceString, "getStackTraceString(trace)");
            cVar.getClass();
            cVar.f169614b = stackTraceString;
            return C13598b0.f38549a;
        }
    }

    public C59316c(T t) {
        this.f169613a = t;
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C59317a(this, new Throwable("DetectTrace"), (C15601d<? super C59317a>) null), 2, (Object) null);
    }

    /* renamed from: a */
    public final String mo84417a() {
        StringBuilder sb = new StringBuilder();
        T t = this.f169613a;
        C87412m.m108591d(t);
        sb.append(C24560g0.m30725a(t.getClass()).mo51264h());
        sb.append('_');
        sb.append(this.f169613a.hashCode());
        return sb.toString();
    }

    public String toString() {
        return "eventName: " + mo84417a() + " currentKey: " + "" + " \n traceString: " + this.f169614b;
    }
}
