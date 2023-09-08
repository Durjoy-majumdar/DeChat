package va0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import ta0.C110954a;

/* renamed from: va0.c */
public abstract class C111498c {

    /* renamed from: a */
    public final long f333805a;

    /* renamed from: b */
    public final long f333806b;

    /* renamed from: c */
    public final long f333807c;

    /* renamed from: d */
    public final long f333808d;

    /* renamed from: va0.c$a */
    public static final class C111499a extends C111498c {

        /* renamed from: e */
        public static final C111499a f333809e = new C111499a();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C111499a() {
            /*
                r14 = this;
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r1 = "getContext()"
                gy3.C87412m.m108593f(r0, r1)
                r2 = 2131100211(0x7f060233, float:1.7812797E38)
                long r4 = ta0.C110954a.m151254b(r2, r0)
                r6 = 0
                r0 = 2131100210(0x7f060232, float:1.7812795E38)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                gy3.C87412m.m108593f(r2, r1)
                long r8 = ta0.C110954a.m151254b(r0, r2)
                r10 = 0
                r12 = 10
                r13 = 0
                r3 = r14
                r3.<init>(r4, r6, r8, r10, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: va0.C111498c.C111499a.<init>():void");
        }
    }

    /* renamed from: va0.c$b */
    public static final class C111500b extends C111498c {

        /* renamed from: e */
        public static final C111500b f333810e = new C111500b();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C111500b() {
            /*
                r14 = this;
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r1 = "getContext()"
                gy3.C87412m.m108593f(r0, r1)
                r2 = 2131101271(0x7f060657, float:1.7814947E38)
                long r4 = ta0.C110954a.m151254b(r2, r0)
                r6 = 0
                r0 = 2131100210(0x7f060232, float:1.7812795E38)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                gy3.C87412m.m108593f(r2, r1)
                long r8 = ta0.C110954a.m151254b(r0, r2)
                r10 = 0
                r12 = 10
                r13 = 0
                r3 = r14
                r3.<init>(r4, r6, r8, r10, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: va0.C111498c.C111500b.<init>():void");
        }
    }

    public C111498c(long j, long j2, long j3, long j4, int i, C8480h hVar) {
        if ((i & 2) != 0) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            j2 = C110954a.m151254b(C0966R.color.f3185i9, context);
        }
        j3 = (i & 4) != 0 ? j : j3;
        if ((i & 8) != 0) {
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            j4 = C110954a.m151254b(C0966R.color.BW_0_Alpha_0_2, context2);
        }
        this.f333805a = j;
        this.f333806b = j2;
        this.f333807c = j3;
        this.f333808d = j4;
    }
}
