package tf1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53930o0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import f14.C58901s;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.concurrent.CancellationException;
import jp3.C46566c;
import jp3.C9486a;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;

/* renamed from: tf1.c */
public abstract class C13893c extends C13911k<C0740i2> {

    /* renamed from: d */
    public C46566c<C9486a> f39057d = new C46566c<>();

    /* renamed from: e */
    public final C0000n0 f39058e = C53930o0.m60554a(C53872d1.f151119c);

    /* renamed from: f */
    public final C0000n0 f39059f = C53930o0.m60554a(C58901s.f168555a);

    /* renamed from: tf1.c$a */
    public static final class C13894a extends C87413o implements C32226l<C89132b.C89134c<? extends C49335eu3>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13893c f39060d;

        /* renamed from: e */
        public final /* synthetic */ Object f39061e;

        /* renamed from: f */
        public final /* synthetic */ C13910j<C0740i2> f39062f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13894a(C13893c cVar, Object obj, C13910j<C0740i2> jVar) {
            super(1);
            this.f39060d = cVar;
            this.f39061e = obj;
            this.f39062f = jVar;
        }

        public Object invoke(Object obj) {
            C61926c.m72668M(new C13892b(this.f39060d, (C89132b.C89134c) obj, this.f39061e, this.f39062f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tf1.c$b */
    public static final class C13895b implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l f39063a;

        public C13895b(C32226l lVar) {
            this.f39063a = lVar;
        }

        public final /* synthetic */ Object call(Object obj) {
            return this.f39063a.invoke(obj);
        }
    }

    public void alive() {
        super.alive();
        this.f39057d = new C46566c<>();
    }

    /* renamed from: b */
    public abstract IResponse<C0740i2> mo2700b(int i, int i2, String str, C89132b<? extends C49335eu3> bVar, C49335eu3 eu32);

    /* renamed from: c */
    public C89132b<? extends C49335eu3> mo4170c() {
        return null;
    }

    public IResponse<C0740i2> callInit() {
        return new C13899f();
    }

    /* renamed from: d */
    public abstract C89132b<? extends C49335eu3> mo2701d();

    public void dead() {
        super.dead();
        this.f39057d.dead();
        C53930o0.m60558e(this.f39058e, (CancellationException) null, 1, (Object) null);
        C53930o0.m60558e(this.f39059f, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: e */
    public abstract C89132b<? extends C49335eu3> mo2702e();

    public void fetch(Object obj, C13910j<C0740i2> jVar, boolean z) {
        C87412m.m108594g(jVar, "callback");
        if (obj != null && (obj instanceof C89132b)) {
            ((C89132b) obj).mo9225i().mo11397F(this.f39057d).mo123420E(new C13895b(new C13894a(this, obj, jVar)));
        }
    }

    public void fetchInit(C13910j<C0740i2> jVar) {
        C87412m.m108594g(jVar, "callback");
        if (mo4170c() == null) {
            IResponse<C0740i2> callInit = callInit();
            callInit.setPullType(1000);
            jVar.onFetchDone(callInit);
            return;
        }
        C13911k.fetch$default(this, mo4170c(), jVar, false, 4, (Object) null);
    }

    public void fetchLoadMore(C13910j<C0740i2> jVar, boolean z) {
        C87412m.m108594g(jVar, "callback");
        C13911k.fetch$default(this, mo2701d(), jVar, false, 4, (Object) null);
    }

    public void fetchPreload(C13910j<C0740i2> jVar) {
        C87412m.m108594g(jVar, "callback");
        super.fetchPreload(jVar);
        C13911k.fetch$default(this, mo2702e(), jVar, false, 4, (Object) null);
    }

    public void fetchRefresh(C13910j<C0740i2> jVar) {
        C87412m.m108594g(jVar, "callback");
        C13911k.fetch$default(this, mo2702e(), jVar, false, 4, (Object) null);
    }
}
