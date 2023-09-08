package gu3;

import android.os.Looper;
import java.util.Objects;
import mu3.C109639a;
import zt3.C119146d;

/* renamed from: gu3.f */
public class C107920f<E> extends C107917d<E> {
    public C107920f() {
    }

    /* renamed from: d */
    public C107916a<Throwable, ?> mo158343d() {
        for (C107917d dVar = this; dVar != null; dVar = dVar.f323127e) {
        }
        return null;
    }

    /* renamed from: e */
    public C87399g mo158344e() {
        C87399g gVar = this.f323124b;
        if (gVar != null) {
            return gVar;
        }
        if (C109639a.m148953d() != null || Looper.myLooper() != null) {
            return new C107919e(this);
        }
        throw new RuntimeException(String.format("fail to create DefaultScheduler. Current thread[%s-%s] without a Looper or Serial.", new Object[]{Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId())}));
    }

    /* renamed from: f */
    public C107917d mo158345f(C107916a aVar) {
        Objects.requireNonNull(aVar);
        C107920f fVar = new C107920f();
        fVar.f323124b = mo158344e();
        fVar.f323126d = this;
        this.f323127e = fVar;
        this.f323125c = aVar;
        return fVar;
    }

    /* renamed from: g */
    public E mo158346g() {
        if (this.f323123a == null) {
            C109639a d = C109639a.m148953d();
            String c = d == null ? C109639a.m148952c(Looper.myLooper()) : d.f328237a;
            C107917d dVar = this;
            while (dVar.f323126d != null) {
                if (!dVar.f323124b.getTag().equals(c)) {
                    dVar = dVar.f323126d;
                } else {
                    throw new RuntimeException("this pipeline will happen dead lock in future. please to check it. serialTag=" + c);
                }
            }
        }
        mo158349h();
        return super.mo158346g();
    }

    /* renamed from: h */
    public void mo158349h() {
        if (!this.f323130h.compareAndSet(false, true)) {
            C119146d.f356851c.mo125766w("Pipeline", "this pipeline has begin.", new Object[0]);
            return;
        }
        C107917d dVar = this;
        while (dVar.f323126d != null) {
            dVar = dVar.f323126d;
        }
        dVar.mo158342c(dVar.f323125c);
    }

    public C107920f(E e) {
        super(e);
    }
}
