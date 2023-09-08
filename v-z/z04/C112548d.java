package z04;

import fy3.C32227p;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import my3.C61594j;
import my3.C61595o;
import rx3.C13604l;
import y04.C15925h;

/* renamed from: z04.d */
public final class C112548d implements C15925h<C61594j> {

    /* renamed from: a */
    public final CharSequence f336977a;

    /* renamed from: b */
    public final int f336978b;

    /* renamed from: c */
    public final int f336979c;

    /* renamed from: d */
    public final C32227p<CharSequence, Integer, C13604l<Integer, Integer>> f336980d;

    /* renamed from: z04.d$a */
    public static final class C112549a implements Iterator<C61594j>, C33145a {

        /* renamed from: d */
        public int f336981d = -1;

        /* renamed from: e */
        public int f336982e;

        /* renamed from: f */
        public int f336983f;

        /* renamed from: g */
        public C61594j f336984g;

        /* renamed from: h */
        public int f336985h;

        /* renamed from: i */
        public final /* synthetic */ C112548d f336986i;

        public C112549a(C112548d dVar) {
            this.f336986i = dVar;
            int e = C61595o.m72297e(dVar.f336978b, 0, dVar.f336977a.length());
            this.f336982e = e;
            this.f336983f = e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo164273a() {
            /*
                r7 = this;
                int r0 = r7.f336983f
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f336981d = r1
                r0 = 0
                r7.f336984g = r0
                goto L_0x0082
            L_0x000c:
                z04.d r2 = r7.f336986i
                int r3 = r2.f336979c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f336985h
                int r6 = r6 + r5
                r7.f336985h = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f336977a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                my3.j r0 = new my3.j
                int r1 = r7.f336982e
                z04.d r2 = r7.f336986i
                java.lang.CharSequence r2 = r2.f336977a
                int r2 = z04.C112550d0.m153765A(r2)
                r0.<init>(r1, r2)
                r7.f336984g = r0
                r7.f336983f = r4
                goto L_0x0080
            L_0x0037:
                z04.d r0 = r7.f336986i
                fy3.p<java.lang.CharSequence, java.lang.Integer, rx3.l<java.lang.Integer, java.lang.Integer>> r2 = r0.f336980d
                java.lang.CharSequence r0 = r0.f336977a
                int r3 = r7.f336983f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                rx3.l r0 = (rx3.C13604l) r0
                if (r0 != 0) goto L_0x005f
                my3.j r0 = new my3.j
                int r1 = r7.f336982e
                z04.d r2 = r7.f336986i
                java.lang.CharSequence r2 = r2.f336977a
                int r2 = z04.C112550d0.m153765A(r2)
                r0.<init>(r1, r2)
                r7.f336984g = r0
                r7.f336983f = r4
                goto L_0x0080
            L_0x005f:
                A r2 = r0.f38555d
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f38556e
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f336982e
                my3.j r3 = my3.C61595o.m72301i(r3, r2)
                r7.f336984g = r3
                int r2 = r2 + r0
                r7.f336982e = r2
                if (r0 != 0) goto L_0x007d
                r1 = 1
            L_0x007d:
                int r2 = r2 + r1
                r7.f336983f = r2
            L_0x0080:
                r7.f336981d = r5
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z04.C112548d.C112549a.mo164273a():void");
        }

        public boolean hasNext() {
            if (this.f336981d == -1) {
                mo164273a();
            }
            return this.f336981d == 1;
        }

        public Object next() {
            if (this.f336981d == -1) {
                mo164273a();
            }
            if (this.f336981d != 0) {
                C61594j jVar = this.f336984g;
                C87412m.m108592e(jVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f336984g = null;
                this.f336981d = -1;
                return jVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C112548d(CharSequence charSequence, int i, int i2, C32227p<? super CharSequence, ? super Integer, C13604l<Integer, Integer>> pVar) {
        C87412m.m108594g(charSequence, "input");
        C87412m.m108594g(pVar, "getNextMatch");
        this.f336977a = charSequence;
        this.f336978b = i;
        this.f336979c = i2;
        this.f336980d = pVar;
    }

    public Iterator<C61594j> iterator() {
        return new C112549a(this);
    }
}
