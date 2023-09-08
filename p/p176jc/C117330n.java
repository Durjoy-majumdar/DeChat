package p176jc;

import a14.C53916l;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Result;
import p176jc.C117310g;
import rx3.C13598b0;

/* renamed from: jc.n */
public final class C117330n implements C117310g.C117314d {

    /* renamed from: a */
    public final /* synthetic */ C53916l<C13598b0> f351256a;

    /* renamed from: b */
    public final /* synthetic */ C117310g f351257b;

    /* renamed from: jc.n$a */
    public static final class C117331a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C117310g f351258d;

        /* renamed from: e */
        public final /* synthetic */ C117330n f351259e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117331a(C117310g gVar, C117330n nVar) {
            super(1);
            this.f351258d = gVar;
            this.f351259e = nVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C117310g gVar = this.f351258d;
            C117330n nVar = this.f351259e;
            if (nVar == null) {
                gVar.getClass();
            } else {
                gVar.f351200i.remove(nVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C117330n(C53916l<? super C13598b0> lVar, C117310g gVar) {
        this.f351256a = lVar;
        this.f351257b = gVar;
        lVar.mo74599v(new C117331a(gVar, this));
    }

    /* renamed from: a */
    public void mo181990a() {
        if (this.f351256a.mo74597a()) {
            C53916l<C13598b0> lVar = this.f351256a;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        this.f351257b.f351200i.remove(this);
    }
}
