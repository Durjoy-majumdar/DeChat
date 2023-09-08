package p291aa;

/* renamed from: aa.k */
public abstract class C23632k<T> extends C23618b implements C27833m<T> {

    /* renamed from: n */
    public static final Object f67819n = new Object();

    /* renamed from: o */
    public static final C23633a f67820o = new C23633a();

    /* renamed from: i */
    public transient Object[] f67821i;

    /* renamed from: j */
    public final C27833m<T> f67822j = this;

    /* renamed from: aa.k$a */
    public static class C23633a {
    }

    public boolean contains(Object obj) {
        return mo37178v(obj) >= 0;
    }

    /* renamed from: f */
    public int mo37125f() {
        return this.f67821i.length;
    }

    /* renamed from: p */
    public void mo37132p(int i) {
        this.f67821i[i] = f67819n;
        this.f67798d--;
        this.f67800f++;
        mo37127k();
    }

    /* renamed from: r */
    public int mo37133r(int i) {
        int a = C112762a.m154255a(i);
        mo37128l(a);
        this.f67821i = new Object[a];
        return a;
    }

    /* renamed from: s */
    public C23632k<T> clone() {
        C23632k<T> kVar = (C23632k) super.clone();
        kVar.f67821i = (Object[]) this.f67821i.clone();
        return kVar;
    }

    /* renamed from: t */
    public final int mo37176t(T t) {
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    /* renamed from: u */
    public final boolean mo37177u(T t, T t2) {
        return t != null ? t.equals(t2) : t2 == null;
    }

    /* renamed from: v */
    public int mo37178v(T t) {
        Object[] objArr = this.f67821i;
        int length = objArr.length;
        int t2 = ((C23632k) this.f67822j).mo37176t(t) & Integer.MAX_VALUE;
        int i = t2 % length;
        Object obj = objArr[i];
        if (obj != null && (obj == f67819n || !((C23632k) this.f67822j).mo37177u(obj, t))) {
            int i2 = (t2 % (length - 2)) + 1;
            while (true) {
                i -= i2;
                if (i < 0) {
                    i += length;
                }
                obj = objArr[i];
                if (obj == null || (obj != f67819n && ((C23632k) this.f67822j).mo37177u(obj, t))) {
                    break;
                }
            }
        }
        if (obj == null) {
            return -1;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo37179w(T r9) {
        /*
            r8 = this;
            java.lang.Object[] r0 = r8.f67821i
            int r1 = r0.length
            aa.m<T> r2 = r8.f67822j
            aa.k r2 = (p291aa.C23632k) r2
            int r2 = r2.mo37176t(r9)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            int r3 = r2 % r1
            r4 = r0[r3]
            if (r4 != 0) goto L_0x0016
            return r3
        L_0x0016:
            java.lang.Object r5 = f67819n
            if (r4 == r5) goto L_0x0028
            aa.m<T> r6 = r8.f67822j
            aa.k r6 = (p291aa.C23632k) r6
            boolean r6 = r6.mo37177u(r4, r9)
            if (r6 == 0) goto L_0x0028
        L_0x0024:
            int r9 = -r3
            int r9 = r9 + -1
            return r9
        L_0x0028:
            int r6 = r1 + -2
            int r2 = r2 % r6
            int r2 = r2 + 1
            r6 = -1
            if (r4 != r5) goto L_0x0032
            r4 = r3
            goto L_0x0033
        L_0x0032:
            r4 = -1
        L_0x0033:
            int r3 = r3 - r2
            if (r3 >= 0) goto L_0x0037
            int r3 = r3 + r1
        L_0x0037:
            r5 = r0[r3]
            if (r4 != r6) goto L_0x0040
            java.lang.Object r7 = f67819n
            if (r5 != r7) goto L_0x0040
            r4 = r3
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            java.lang.Object r7 = f67819n
            if (r5 == r7) goto L_0x0050
            aa.m<T> r7 = r8.f67822j
            aa.k r7 = (p291aa.C23632k) r7
            boolean r7 = r7.mo37177u(r5, r9)
            if (r7 == 0) goto L_0x0033
        L_0x0050:
            java.lang.Object r7 = f67819n
            if (r5 != r7) goto L_0x006b
        L_0x0054:
            if (r5 == 0) goto L_0x006b
            java.lang.Object r7 = f67819n
            if (r5 == r7) goto L_0x0064
            aa.m<T> r7 = r8.f67822j
            aa.k r7 = (p291aa.C23632k) r7
            boolean r7 = r7.mo37177u(r5, r9)
            if (r7 != 0) goto L_0x006b
        L_0x0064:
            int r3 = r3 - r2
            if (r3 >= 0) goto L_0x0068
            int r3 = r3 + r1
        L_0x0068:
            r5 = r0[r3]
            goto L_0x0054
        L_0x006b:
            if (r5 == 0) goto L_0x0072
            java.lang.Object r9 = f67819n
            if (r5 == r9) goto L_0x0072
            goto L_0x0024
        L_0x0072:
            if (r4 != r6) goto L_0x0075
            return r3
        L_0x0075:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p291aa.C23632k.mo37179w(java.lang.Object):int");
    }

    /* renamed from: x */
    public final void mo37180x(Object obj, Object obj2) {
        String str;
        StringBuilder sb = new StringBuilder("Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals() or TObjectHashingStrategy.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method's documentation. object #1 =");
        sb.append(obj);
        String str2 = "";
        if (obj == null) {
            str = str2;
        } else {
            str = " (" + obj.getClass() + ")";
        }
        sb.append(str);
        sb.append(", hashCode=");
        sb.append(((C23632k) this.f67822j).mo37176t(obj));
        sb.append("; object #2 =");
        sb.append(obj2);
        if (obj2 != null) {
            str2 = " (" + obj2.getClass() + ")";
        }
        sb.append(str2);
        sb.append(", hashCode=");
        sb.append(((C23632k) this.f67822j).mo37176t(obj2));
        throw new IllegalArgumentException(sb.toString());
    }
}
