package b14;

import a14.C53872d1;
import a14.C53873d2;
import a14.C53883f1;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53916l;
import a14.C53925m2;
import android.os.Handler;
import android.os.Looper;
import f14.C58901s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import wx3.C66212f;

/* renamed from: b14.a */
public final class C54392a extends C54393b {
    private volatile C54392a _immediate;

    /* renamed from: e */
    public final Handler f152591e;

    /* renamed from: f */
    public final String f152592f;

    /* renamed from: g */
    public final boolean f152593g;

    /* renamed from: h */
    public final C54392a f152594h;

    public C54392a(Handler handler, String str, boolean z) {
        this.f152591e = handler;
        this.f152592f = str;
        this.f152593g = z;
        this._immediate = z ? this : null;
        C54392a aVar = this._immediate;
        if (aVar == null) {
            aVar = new C54392a(handler, str, true);
            this._immediate = aVar;
        }
        this.f152594h = aVar;
    }

    /* renamed from: I */
    public void mo74578I(long j, C53916l<? super C13598b0> lVar) {
        a$$b a__b = new a$$b(lVar, this);
        Handler handler = this.f152591e;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(a__b, j)) {
            lVar.mo74599v(new a$$c(this, a__b));
        } else {
            mo75156j0(lVar.getContext(), a__b);
        }
    }

    /* renamed from: Q */
    public C53883f1 mo74579Q(long j, Runnable runnable, C66212f fVar) {
        Handler handler = this.f152591e;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new a$$a(this, runnable);
        }
        mo75156j0(fVar, runnable);
        return C53925m2.f151179d;
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        if (!this.f152591e.post(runnable)) {
            mo75156j0(fVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C54392a) && ((C54392a) obj).f152591e == this.f152591e;
    }

    /* renamed from: h0 */
    public boolean mo74565h0(C66212f fVar) {
        return !this.f152593g || !C87412m.m108589b(Looper.myLooper(), this.f152591e.getLooper());
    }

    public int hashCode() {
        return System.identityHashCode(this.f152591e);
    }

    /* renamed from: i0 */
    public C53915k2 mo74590i0() {
        return this.f152594h;
    }

    /* renamed from: j0 */
    public final void mo75156j0(C66212f fVar, Runnable runnable) {
        C53873d2.m60390b(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C53872d1.f151119c.mo74497S(fVar, runnable);
    }

    public String toString() {
        String str;
        C53915k2 k2Var;
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var2 = C58901s.f168555a;
        if (this == k2Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                k2Var = k2Var2.mo74590i0();
            } catch (UnsupportedOperationException unused) {
                k2Var = null;
            }
            str = this == k2Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f152592f;
        if (str2 == null) {
            str2 = this.f152591e.toString();
        }
        if (!this.f152593g) {
            return str2;
        }
        return str2 + ".immediate";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C54392a(Handler handler, String str, int i, C8480h hVar) {
        this(handler, (i & 2) != 0 ? null : str, false);
    }
}
