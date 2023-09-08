package p1014o4;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import p1221x4.C118847o;

/* renamed from: o4.w */
public abstract class C100281w {

    /* renamed from: a */
    public UUID f293786a;

    /* renamed from: b */
    public C118847o f293787b;

    /* renamed from: c */
    public Set<String> f293788c;

    /* renamed from: o4.w$a */
    public static abstract class C100282a<B extends C100282a<?, ?>, W extends C100281w> {

        /* renamed from: a */
        public UUID f293789a = UUID.randomUUID();

        /* renamed from: b */
        public C118847o f293790b;

        /* renamed from: c */
        public Set<String> f293791c = new HashSet();

        public C100282a(Class<? extends ListenableWorker> cls) {
            this.f293790b = new C118847o(this.f293789a.toString(), cls.getName());
            ((HashSet) this.f293791c).add(cls.getName());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
            if ((((java.util.HashSet) r0.f352002h.f352004a).size() > 0) == false) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final W mo139543a() {
            /*
                r6 = this;
                r0 = r6
                o4.o$a r0 = (p1014o4.C100279o.C100280a) r0
                o4.o r1 = new o4.o
                r1.<init>(r0)
                x4.o r0 = r6.f293790b
                o4.c r0 = r0.f355550j
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 1
                r4 = 0
                r5 = 24
                if (r2 < r5) goto L_0x0025
                o4.d r5 = r0.f352002h
                java.util.Set<o4.d$a> r5 = r5.f352004a
                java.util.HashSet r5 = (java.util.HashSet) r5
                int r5 = r5.size()
                if (r5 <= 0) goto L_0x0022
                r5 = 1
                goto L_0x0023
            L_0x0022:
                r5 = 0
            L_0x0023:
                if (r5 != 0) goto L_0x0037
            L_0x0025:
                boolean r5 = r0.f351998d
                if (r5 != 0) goto L_0x0037
                boolean r5 = r0.f351996b
                if (r5 != 0) goto L_0x0037
                r5 = 23
                if (r2 < r5) goto L_0x0036
                boolean r0 = r0.f351997c
                if (r0 == 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r3 = 0
            L_0x0037:
                x4.o r0 = r6.f293790b
                boolean r2 = r0.f355557q
                if (r2 == 0) goto L_0x0058
                if (r3 != 0) goto L_0x0050
                long r2 = r0.f355547g
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x0048
                goto L_0x0058
            L_0x0048:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs cannot be delayed"
                r0.<init>(r1)
                throw r0
            L_0x0050:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs only support network and storage constraints"
                r0.<init>(r1)
                throw r0
            L_0x0058:
                java.util.UUID r0 = java.util.UUID.randomUUID()
                r6.f293789a = r0
                x4.o r0 = new x4.o
                x4.o r2 = r6.f293790b
                r0.<init>(r2)
                r6.f293790b = r0
                java.util.UUID r2 = r6.f293789a
                java.lang.String r2 = r2.toString()
                r0.f355541a = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p1014o4.C100281w.C100282a.mo139543a():o4.w");
        }
    }

    public C100281w(UUID uuid, C118847o oVar, Set<String> set) {
        this.f293786a = uuid;
        this.f293787b = oVar;
        this.f293788c = set;
    }
}
