package u24;

import v24.C90742a;
import v24.C90743b;

/* renamed from: u24.a */
public class C90595a {

    /* renamed from: a */
    public static final Object[] f260300a = new Object[0];

    /* renamed from: b */
    public static final String[] f260301b = new String[0];

    /* renamed from: c */
    public static final int[] f260302c = new int[0];

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113497a(int[] r4, int r5) {
        /*
            r0 = 0
            r1 = -1
            if (r4 != 0) goto L_0x0005
            goto L_0x0011
        L_0x0005:
            r2 = 0
        L_0x0006:
            int r3 = r4.length
            if (r2 >= r3) goto L_0x0011
            r3 = r4[r2]
            if (r5 != r3) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0011:
            r2 = -1
        L_0x0012:
            if (r2 == r1) goto L_0x0015
            r0 = 1
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u24.C90595a.m113497a(int[], int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113498b(java.lang.Object[] r4, java.lang.Object r5) {
        /*
            r0 = 0
            r1 = -1
            if (r4 != 0) goto L_0x0005
            goto L_0x0032
        L_0x0005:
            if (r5 != 0) goto L_0x0013
            r5 = 0
        L_0x0008:
            int r2 = r4.length
            if (r5 >= r2) goto L_0x0032
            r2 = r4[r5]
            if (r2 != 0) goto L_0x0010
            goto L_0x0033
        L_0x0010:
            int r5 = r5 + 1
            goto L_0x0008
        L_0x0013:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r2 = r2.getComponentType()
            boolean r2 = r2.isInstance(r5)
            if (r2 == 0) goto L_0x0032
            r2 = 0
        L_0x0022:
            int r3 = r4.length
            if (r2 >= r3) goto L_0x0032
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x002f
            r5 = r2
            goto L_0x0033
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x0032:
            r5 = -1
        L_0x0033:
            if (r5 == r1) goto L_0x0036
            r0 = 1
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u24.C90595a.m113498b(java.lang.Object[], java.lang.Object):boolean");
    }

    /* renamed from: c */
    public static String m113499c(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        C90742a aVar = new C90742a(obj, C90743b.f260631p);
        C90743b bVar = aVar.f260629c;
        StringBuffer stringBuffer = aVar.f260627a;
        boolean z = bVar.f260633d;
        bVar.mo124875a(stringBuffer, (String) null, obj, true);
        stringBuffer.append(bVar.f260640n);
        return aVar.toString();
    }
}
