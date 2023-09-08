package com.tencent.matrix.lifecycle.owners;

import android.os.Handler;
import com.tencent.matrix.lifecycle.C80392a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import p723vf.C118672d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.matrix.lifecycle.owners.k */
public abstract class C17661k {

    /* renamed from: a */
    public final C13601g f48050a = C36568h.m40985a(C17665c.f48062d);

    /* renamed from: b */
    public final C13601g f48051b = C36568h.m40985a(new C17663b(this));

    /* renamed from: c */
    public final C13601g f48052c = C36568h.m40985a(new C17664d(this));

    /* renamed from: d */
    public volatile int f48053d;

    /* renamed from: e */
    public final String f48054e;

    /* renamed from: f */
    public final long f48055f;

    /* renamed from: g */
    public final int f48056g;

    /* renamed from: com.tencent.matrix.lifecycle.owners.k$a */
    public static final class C17662a {

        /* renamed from: a */
        public final Long[] f48057a;

        /* renamed from: b */
        public Long[] f48058b;

        /* renamed from: c */
        public final long f48059c;

        public C17662a(long j) {
            this.f48059c = j;
            Long[] lArr = {13L, 21L};
            this.f48057a = lArr;
            Object[] copyOf = Arrays.copyOf(lArr, lArr.length);
            C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, size)");
            this.f48058b = (Long[]) copyOf;
        }

        /* renamed from: a */
        public final long mo21188a() {
            long longValue = this.f48058b[0].longValue() + this.f48058b[1].longValue();
            Long[] lArr = this.f48058b;
            lArr[0] = lArr[1];
            lArr[1] = Long.valueOf(longValue);
            return Math.min(longValue, this.f48059c);
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.k$b */
    public static final class C17663b extends C87413o implements C32224a<C17662a> {

        /* renamed from: d */
        public final /* synthetic */ C17661k f48060d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17663b(C17661k kVar) {
            super(0);
            this.f48060d = kVar;
        }

        public Object invoke() {
            return new C17662a(this.f48060d.f48055f);
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.k$d */
    public static final class C17664d extends C87413o implements C32224a<C17666l> {

        /* renamed from: d */
        public final /* synthetic */ C17661k f48061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17664d(C17661k kVar) {
            super(0);
            this.f48061d = kVar;
        }

        public Object invoke() {
            return new C17666l(this);
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.k$c */
    public static final class C17665c extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public static final C17665c f48062d = new C17665c();

        public C17665c() {
            super(0);
        }

        public Object invoke() {
            return C80392a0.f235326f.mo111887a();
        }
    }

    public C17661k(String str, long j, int i) {
        C87412m.m108594g(str, "tag");
        this.f48054e = str;
        this.f48055f = j;
        this.f48056g = i;
    }

    /* renamed from: a */
    public abstract boolean mo21181a();

    /* renamed from: b */
    public final boolean mo21182b() {
        C118672d.m167353c(this.f48054e, "checkAndPostIfNeeded", new Object[0]);
        mo21184d().removeCallbacks(mo21185e());
        if (!mo21181a()) {
            return false;
        }
        mo21184d().postDelayed(mo21185e(), mo21183c().mo21188a());
        return true;
    }

    /* renamed from: c */
    public final C17662a mo21183c() {
        return (C17662a) ((C36570n) this.f48051b).getValue();
    }

    /* renamed from: d */
    public final Handler mo21184d() {
        return (Handler) ((C36570n) this.f48050a).getValue();
    }

    /* renamed from: e */
    public final C17666l mo21185e() {
        return (C17666l) ((C36570n) this.f48052c).getValue();
    }

    /* renamed from: f */
    public final void mo21186f() {
        C17662a c = mo21183c();
        Long[] lArr = c.f48057a;
        Object[] copyOf = Arrays.copyOf(lArr, lArr.length);
        C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, size)");
        c.f48058b = (Long[]) copyOf;
        long a = mo21183c().mo21188a();
        String str = this.f48054e;
        C118672d.m167353c(str, "post check: " + a, new Object[0]);
        mo21184d().removeCallbacks(mo21185e());
        mo21184d().postDelayed(mo21185e(), a);
    }

    /* renamed from: g */
    public final void mo21187g() {
        this.f48053d = 0;
        C118672d.m167353c(this.f48054e, "stop", new Object[0]);
        C17662a c = mo21183c();
        Long[] lArr = c.f48057a;
        Object[] copyOf = Arrays.copyOf(lArr, lArr.length);
        C87412m.m108593f(copyOf, "java.util.Arrays.copyOf(this, size)");
        c.f48058b = (Long[]) copyOf;
        mo21184d().removeCallbacks(mo21185e());
    }
}
