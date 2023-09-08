package eg1;

import a14.C53916l;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C8477a0;
import ht1.C60200t1;
import kotlin.Result;

/* renamed from: eg1.l */
public final class C58585l implements C60200t1.C60202b {

    /* renamed from: a */
    public final /* synthetic */ C8477a0 f167730a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<FinderObject> f167731b;

    public C58585l(C8477a0 a0Var, C53916l<? super FinderObject> lVar) {
        this.f167730a = a0Var;
        this.f167731b = lVar;
    }

    /* renamed from: a */
    public final void mo75691a(Object obj, int i, int i2) {
        if (!this.f167730a.f27482d) {
            C53916l<FinderObject> lVar = this.f167731b;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(obj instanceof FinderObject ? (FinderObject) obj : null));
        }
    }
}
