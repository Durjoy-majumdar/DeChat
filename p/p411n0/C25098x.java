package p411n0;

import sx3.C110821n;

/* renamed from: n0.x */
public final class C25098x {
    /* renamed from: a */
    public static final Object[] m31803a(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        C110821n.m150966m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C110821n.m150963j(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* renamed from: b */
    public static final Object[] m31804b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        C110821n.m150966m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C110821n.m150963j(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: c */
    public static final Object[] m31805c(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C110821n.m150966m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C110821n.m150963j(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
