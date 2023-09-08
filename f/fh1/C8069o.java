package fh1;

import a14.C53916l;
import cl1.C54991o;
import gy3.C8477a0;
import java.util.regex.Pattern;
import kotlin.Result;
import o40.C61926c;
import qg1.C47826f;
import te3.C50415mk1;

/* renamed from: fh1.o */
public final class C8069o implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ C8048h f26830a;

    /* renamed from: b */
    public final /* synthetic */ boolean f26831b;

    /* renamed from: c */
    public final /* synthetic */ C8477a0 f26832c;

    /* renamed from: d */
    public final /* synthetic */ C53916l<Boolean> f26833d;

    public C8069o(C8048h hVar, boolean z, C8477a0 a0Var, C53916l<? super Boolean> lVar) {
        this.f26830a = hVar;
        this.f26831b = z;
        this.f26832c = a0Var;
        this.f26833d = lVar;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        int i2;
        Class cls = C54991o.class;
        C54991o oVar = (C54991o) this.f26830a.business(cls);
        if (this.f26831b) {
            int i3 = ((C54991o) this.f26830a.business(cls)).f154354q;
            Pattern pattern = C61926c.f176038a;
            i2 = i3 | 131072;
        } else {
            int i4 = ((C54991o) this.f26830a.business(cls)).f154354q;
            Pattern pattern2 = C61926c.f176038a;
            i2 = i4 & -131073;
        }
        oVar.f154354q = i2;
        C8477a0 a0Var = this.f26832c;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            C53916l<Boolean> lVar = this.f26833d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        C8477a0 a0Var = this.f26832c;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            C53916l<Boolean> lVar = this.f26833d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
    }
}
