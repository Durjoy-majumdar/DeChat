package t04;

import gy3.C87412m;
import java.util.Arrays;
import java.util.Iterator;
import sx3.C110816b;
import sx3.C110823p;

/* renamed from: t04.d */
public final class C110884d<T> extends C26253c<T> {

    /* renamed from: d */
    public Object[] f331686d = new Object[20];

    /* renamed from: e */
    public int f331687e = 0;

    /* renamed from: t04.d$a */
    public static final class C110885a extends C110816b<T> {

        /* renamed from: f */
        public int f331688f = -1;

        /* renamed from: g */
        public final /* synthetic */ C110884d<T> f331689g;

        public C110885a(C110884d<T> dVar) {
            this.f331689g = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo51014a() {
            /*
                r3 = this;
            L_0x0000:
                int r0 = r3.f331688f
                int r0 = r0 + 1
                r3.f331688f = r0
                t04.d<T> r1 = r3.f331689g
                java.lang.Object[] r1 = r1.f331686d
                int r2 = r1.length
                if (r0 >= r2) goto L_0x0011
                r2 = r1[r0]
                if (r2 == 0) goto L_0x0000
            L_0x0011:
                int r2 = r1.length
                if (r0 < r2) goto L_0x0019
                sx3.b1 r0 = sx3.C110817b1.Done
                r3.f331538d = r0
                goto L_0x0026
            L_0x0019:
                r0 = r1[r0]
                java.lang.String r1 = "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"
                gy3.C87412m.m108592e(r0, r1)
                r3.f331539e = r0
                sx3.b1 r0 = sx3.C110817b1.Ready
                r3.f331538d = r0
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t04.C110884d.C110885a.mo51014a():void");
        }
    }

    /* renamed from: f */
    public int mo53152f() {
        return this.f331687e;
    }

    public T get(int i) {
        return C110823p.m150982H(this.f331686d, i);
    }

    /* renamed from: i */
    public void mo53154i(int i, T t) {
        C87412m.m108594g(t, "value");
        Object[] objArr = this.f331686d;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            this.f331686d = copyOf;
        }
        Object[] objArr2 = this.f331686d;
        if (objArr2[i] == null) {
            this.f331687e++;
        }
        objArr2[i] = t;
    }

    public Iterator<T> iterator() {
        return new C110885a(this);
    }
}
