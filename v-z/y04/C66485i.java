package y04;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;

/* renamed from: y04.i */
public final class C66485i<T> extends C66486j<T> implements Iterator<T>, C15601d<C13598b0>, C33145a {

    /* renamed from: d */
    public int f191265d;

    /* renamed from: e */
    public T f191266e;

    /* renamed from: f */
    public C15601d<? super C13598b0> f191267f;

    /* renamed from: e */
    public Object mo90571e(T t, C15601d<? super C13598b0> dVar) {
        this.f191266e = t;
        this.f191265d = 3;
        this.f191267f = dVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        C87412m.m108594g(dVar, "frame");
        return aVar;
    }

    /* renamed from: f */
    public final Throwable mo90572f() {
        int i = this.f191265d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f191265d);
    }

    public C66212f getContext() {
        return C66217g.f190253d;
    }

    public boolean hasNext() {
        int i;
        while (true) {
            i = this.f191265d;
            if (i != 0) {
                break;
            }
            this.f191265d = 5;
            C15601d<? super C13598b0> dVar = this.f191267f;
            C87412m.m108591d(dVar);
            this.f191267f = null;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        if (i == 1) {
            C87412m.m108591d((Object) null);
            throw null;
        } else if (i == 2 || i == 3) {
            return true;
        } else {
            if (i == 4) {
                return false;
            }
            throw mo90572f();
        }
    }

    public T next() {
        int i = this.f191265d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.f191265d = 1;
            C87412m.m108591d((Object) null);
            throw null;
        } else if (i == 3) {
            this.f191265d = 0;
            T t = this.f191266e;
            this.f191266e = null;
            return t;
        } else {
            throw mo90572f();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f191265d = 4;
    }
}
