package p299c7;

import java.util.HashMap;
import p294b7.C16750m;
import p333e8.C20541m;
import p396x6.C23015n;

/* renamed from: c7.c */
public final class C16862c extends C16863d {

    /* renamed from: b */
    public long f45582b = -9223372036854775807L;

    public C16862c(C16750m mVar) {
        super(mVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m16516b(p333e8.C20541m r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007e
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x0072
            r1 = 2
            if (r5 == r1) goto L_0x006d
            r2 = 3
            if (r5 == r2) goto L_0x0053
            r2 = 8
            if (r5 == r2) goto L_0x004e
            r2 = 10
            if (r5 == r2) goto L_0x0034
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            long r2 = r4.mo32098i()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo32114y(r1)
            return r5
        L_0x0034:
            int r5 = r4.mo32106q()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x003d:
            if (r0 >= r5) goto L_0x004d
            int r2 = r4.mo32103n()
            java.lang.Object r2 = m16516b(r4, r2)
            r1.add(r2)
            int r0 = r0 + 1
            goto L_0x003d
        L_0x004d:
            return r1
        L_0x004e:
            java.util.HashMap r4 = m16517c(r4)
            return r4
        L_0x0053:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0058:
            java.lang.String r0 = m16518d(r4)
            int r1 = r4.mo32103n()
            r2 = 9
            if (r1 != r2) goto L_0x0065
            return r5
        L_0x0065:
            java.lang.Object r1 = m16516b(r4, r1)
            r5.put(r0, r1)
            goto L_0x0058
        L_0x006d:
            java.lang.String r4 = m16518d(r4)
            return r4
        L_0x0072:
            int r4 = r4.mo32103n()
            if (r4 != r1) goto L_0x0079
            r0 = 1
        L_0x0079:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007e:
            long r4 = r4.mo32098i()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p299c7.C16862c.m16516b(e8.m, int):java.lang.Object");
    }

    /* renamed from: c */
    public static HashMap<String, Object> m16517c(C20541m mVar) {
        int q = mVar.mo32106q();
        HashMap<String, Object> hashMap = new HashMap<>(q);
        for (int i = 0; i < q; i++) {
            hashMap.put(m16518d(mVar), m16516b(mVar, mVar.mo32103n()));
        }
        return hashMap;
    }

    /* renamed from: d */
    public static String m16518d(C20541m mVar) {
        int s = mVar.mo32108s();
        int i = mVar.f57810b;
        mVar.mo32114y(s);
        return new String(mVar.f57809a, i, s);
    }

    /* renamed from: a */
    public void mo17911a(C20541m mVar, long j) {
        if (mVar.mo32103n() != 2) {
            throw new C23015n();
        } else if ("onMetaData".equals(m16518d(mVar)) && mVar.mo32103n() == 8) {
            HashMap<String, Object> c = m16517c(mVar);
            if (c.containsKey("duration")) {
                double doubleValue = ((Double) c.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f45582b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }
}
