package ke1;

import c14.C54625h;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51981xj0;
import u60.C14121l;
import u60.C65233m;

/* renamed from: ke1.j */
public final class C9590j {

    /* renamed from: a */
    public final C65233m f29829a;

    /* renamed from: ke1.j$a */
    public static final class C9591a extends C14121l {

        /* renamed from: i */
        public final C54625h<C89132b.C89134c<C51981xj0>> f29830i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9591a(C54625h<C89132b.C89134c<C51981xj0>> hVar, C32226l<? super C14121l, C13598b0> lVar) {
            super(lVar, (String) null, 2, (C8480h) null);
            C87412m.m108594g(hVar, "channel");
            C87412m.m108594g(lVar, "task");
            this.f29830i = hVar;
        }

        /* renamed from: e */
        public void mo10270e() {
            this.f29830i.mo75512b((CancellationException) null);
            Log.m105928w("Finder.EnhanceStreamFetcher", "Task cancel");
        }
    }

    public C9590j() {
        C65233m mVar = new C65233m("Finder.EnhanceStreamFetcher");
        mVar.mo89361d();
        this.f29829a = mVar;
    }
}
