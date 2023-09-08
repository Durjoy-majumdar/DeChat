package a14;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: a14.x */
public final class C53964x {

    /* renamed from: a */
    public final Object f151202a;

    /* renamed from: b */
    public final C53904j f151203b;

    /* renamed from: c */
    public final C32226l<Throwable, C13598b0> f151204c;

    /* renamed from: d */
    public final Object f151205d;

    /* renamed from: e */
    public final Throwable f151206e;

    public C53964x(Object obj, C53904j jVar, C32226l<? super Throwable, C13598b0> lVar, Object obj2, Throwable th) {
        this.f151202a = obj;
        this.f151203b = jVar;
        this.f151204c = lVar;
        this.f151205d = obj2;
        this.f151206e = th;
    }

    /* renamed from: a */
    public static C53964x m60605a(C53964x xVar, Object obj, C53904j jVar, C32226l<Throwable, C13598b0> lVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = xVar.f151202a;
        }
        if ((i & 2) != 0) {
            jVar = xVar.f151203b;
        }
        C53904j jVar2 = jVar;
        if ((i & 4) != 0) {
            lVar = xVar.f151204c;
        }
        C32226l<Throwable, C13598b0> lVar2 = lVar;
        if ((i & 8) != 0) {
            obj2 = xVar.f151205d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = xVar.f151206e;
        }
        Throwable th4 = th;
        xVar.getClass();
        return new C53964x(obj, jVar2, lVar2, obj4, th4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53964x)) {
            return false;
        }
        C53964x xVar = (C53964x) obj;
        return C87412m.m108589b(this.f151202a, xVar.f151202a) && C87412m.m108589b(this.f151203b, xVar.f151203b) && C87412m.m108589b(this.f151204c, xVar.f151204c) && C87412m.m108589b(this.f151205d, xVar.f151205d) && C87412m.m108589b(this.f151206e, xVar.f151206e);
    }

    public int hashCode() {
        Object obj = this.f151202a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C53904j jVar = this.f151203b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        C32226l<Throwable, C13598b0> lVar = this.f151204c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f151205d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f151206e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f151202a + ", cancelHandler=" + this.f151203b + ", onCancellation=" + this.f151204c + ", idempotentResume=" + this.f151205d + ", cancelCause=" + this.f151206e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C53964x(Object obj, C53904j jVar, C32226l lVar, Object obj2, Throwable th, int i, C8480h hVar) {
        this(obj, (i & 2) != 0 ? null : jVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
