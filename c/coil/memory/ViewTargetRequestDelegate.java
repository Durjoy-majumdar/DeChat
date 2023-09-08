package coil.memory;

import a14.C53973z1;
import androidx.lifecycle.C0124r;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p1105d5.C106994f;
import p1132m5.C109528s;
import p1144q5.C110366b;
import p632o5.C109956h;
import p632o5.C109959i;
import p864t5.C110905d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcoil/memory/ViewTargetRequestDelegate;", "Lcoil/memory/RequestDelegate;", "Ld5/f;", "imageLoader", "Lo5/h;", "request", "Lm5/s;", "targetDelegate", "La14/z1;", "job", "<init>", "(Ld5/f;Lo5/h;Lm5/s;La14/z1;)V", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* renamed from: d */
    public final C106994f f309023d;

    /* renamed from: e */
    public final C109956h f309024e;

    /* renamed from: f */
    public final C109528s f309025f;

    /* renamed from: g */
    public final C53973z1 f309026g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestDelegate(C106994f fVar, C109956h hVar, C109528s sVar, C53973z1 z1Var) {
        super((C8480h) null);
        C87412m.m108594g(fVar, "imageLoader");
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(sVar, "targetDelegate");
        C87412m.m108594g(z1Var, "job");
        this.f309023d = fVar;
        this.f309024e = hVar;
        this.f309025f = sVar;
        this.f309026g = z1Var;
    }

    /* renamed from: b */
    public void mo146074b() {
        C53973z1.C53974a.m60623a(this.f309026g, (CancellationException) null, 1, (Object) null);
        this.f309025f.mo160744a();
        C110905d.m151208d(this.f309025f, (C109959i.C109960a) null);
        C109956h hVar = this.f309024e;
        C110366b bVar = hVar.f328994c;
        if (bVar instanceof C0124r) {
            hVar.f329004m.removeObserver((C0124r) bVar);
        }
        this.f309024e.f329004m.removeObserver(this);
    }
}
