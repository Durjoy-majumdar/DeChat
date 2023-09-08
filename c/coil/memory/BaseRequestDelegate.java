package coil.memory;

import a14.C53973z1;
import androidx.lifecycle.C39623j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/RequestDelegate;", "Landroidx/lifecycle/j;", "lifecycle", "La14/z1;", "job", "<init>", "(Landroidx/lifecycle/j;La14/z1;)V", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class BaseRequestDelegate extends RequestDelegate {

    /* renamed from: d */
    public final C39623j f309021d;

    /* renamed from: e */
    public final C53973z1 f309022e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRequestDelegate(C39623j jVar, C53973z1 z1Var) {
        super((C8480h) null);
        C87412m.m108594g(jVar, "lifecycle");
        C87412m.m108594g(z1Var, "job");
        this.f309021d = jVar;
        this.f309022e = z1Var;
    }

    /* renamed from: a */
    public void mo146073a() {
        this.f309021d.removeObserver(this);
    }

    /* renamed from: b */
    public void mo146074b() {
        C53973z1.C53974a.m60623a(this.f309022e, (CancellationException) null, 1, (Object) null);
    }
}
