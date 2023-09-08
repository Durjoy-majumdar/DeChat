package e14;

import d14.C58050i1;
import e14.C58479d;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: e14.b */
public abstract class C58474b<S extends C58479d<?>> {

    /* renamed from: d */
    public S[] f167455d;

    /* renamed from: e */
    public int f167456e;

    /* renamed from: f */
    public int f167457f;

    /* renamed from: g */
    public C58475b0 f167458g;

    /* renamed from: e */
    public final C58050i1<Integer> mo83424e() {
        C58475b0 b0Var;
        synchronized (this) {
            b0Var = this.f167458g;
            if (b0Var == null) {
                b0Var = new C58475b0(this.f167456e);
                this.f167458g = b0Var;
            }
        }
        return b0Var;
    }

    /* renamed from: f */
    public final S mo83425f() {
        S s;
        C58475b0 b0Var;
        synchronized (this) {
            S[] sArr = this.f167455d;
            if (sArr == null) {
                sArr = mo82834h(2);
                this.f167455d = sArr;
            } else if (this.f167456e >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                this.f167455d = (C58479d[]) copyOf;
                sArr = (C58479d[]) copyOf;
            }
            int i = this.f167457f;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo82833g();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.mo82814a(this));
            this.f167457f = i;
            this.f167456e++;
            b0Var = this.f167458g;
        }
        if (b0Var != null) {
            synchronized (b0Var) {
                Object[] objArr = b0Var.f166163n;
                C87412m.m108591d(objArr);
                b0Var.mo82832d(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((b0Var.f166164o + ((long) ((int) ((b0Var.mo82845p() + ((long) b0Var.f166166q)) - b0Var.f166164o)))) - 1))]).intValue() + 1));
            }
        }
        return s;
    }

    /* renamed from: g */
    public abstract S mo82833g();

    /* renamed from: h */
    public abstract S[] mo82834h(int i);

    /* renamed from: i */
    public final void mo83426i(S s) {
        C58475b0 b0Var;
        int i;
        C15601d[] b;
        synchronized (this) {
            int i2 = this.f167456e - 1;
            this.f167456e = i2;
            b0Var = this.f167458g;
            if (i2 == 0) {
                this.f167457f = 0;
            }
            b = s.mo82815b(this);
        }
        for (C15601d dVar : b) {
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            }
        }
        if (b0Var != null) {
            synchronized (b0Var) {
                Object[] objArr = b0Var.f166163n;
                C87412m.m108591d(objArr);
                b0Var.mo82832d(Integer.valueOf(((Number) objArr[((int) ((b0Var.f166164o + ((long) ((int) ((b0Var.mo82845p() + ((long) b0Var.f166166q)) - b0Var.f166164o)))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }
}
