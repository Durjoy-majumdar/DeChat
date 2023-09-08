package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ks */
public final class C113901ks {
    /* renamed from: a */
    private static double m157710a(int i, int i2, int i3, float f) {
        double d = 1.0d - ((double) f);
        return (d * d * ((double) i)) + (((double) (2.0f * f)) * d * ((double) i2)) + ((double) (f * f * ((float) i3)));
    }

    /* renamed from: a */
    private static float m157712a(int i, int i2, int i3, int i4, float f) {
        float f2 = ((float) (i2 - i)) * 3.0f;
        float f3 = (((float) (i3 - i2)) * 3.0f) - f2;
        float f4 = f * f;
        return (((((float) (i4 - i)) - f2) - f3) * f4 * f) + (f3 * f4) + (f2 * f) + ((float) i);
    }

    /* renamed from: a */
    private static int m157713a(List<GeoPoint> list, int[] iArr, C113707es esVar) {
        int size;
        int i = 0;
        if (list == null || (size = list.size()) < 2) {
            return 0;
        }
        int i2 = 0;
        while (i < size - 1) {
            int i3 = i + 1;
            C113732fo a = esVar.mo172027a(list.get(i));
            C113732fo a2 = esVar.mo172027a(list.get(i3));
            double d = a2.f340215a - a.f340215a;
            double d2 = a2.f340216b - a.f340216b;
            int sqrt = (int) Math.sqrt((d * d) + (d2 * d2));
            int max = sqrt / Math.max(4, (sqrt / 500) * 4);
            iArr[i] = max;
            i2 += max;
            i = i3;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.tencent.map.lib.models.GeoPoint> m157715a(java.util.List<com.tencent.map.lib.models.GeoPoint> r16, int r17) {
        /*
            r0 = r16
            r1 = r17
            if (r0 == 0) goto L_0x0126
            boolean r3 = r16.isEmpty()
            if (r3 == 0) goto L_0x000e
            goto L_0x0126
        L_0x000e:
            int r3 = r16.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r5 = 0
            java.lang.Object r6 = r0.get(r5)
            com.tencent.map.lib.models.GeoPoint r6 = (com.tencent.map.lib.models.GeoPoint) r6
            int r7 = r3 + -1
            java.lang.Object r7 = r0.get(r7)
            com.tencent.map.lib.models.GeoPoint r7 = (com.tencent.map.lib.models.GeoPoint) r7
            int r8 = r6.getLongitudeE6()
            int r9 = r7.getLongitudeE6()
            int r8 = r8 + r9
            r9 = 2
            int r8 = r8 / r9
            int r6 = r6.getLatitudeE6()
            int r7 = r7.getLatitudeE6()
            int r6 = r6 + r7
            int r6 = r6 / r9
            r7 = 0
        L_0x003c:
            if (r7 >= r3) goto L_0x0057
            java.lang.Object r10 = r0.get(r7)
            com.tencent.map.lib.models.GeoPoint r10 = (com.tencent.map.lib.models.GeoPoint) r10
            int r11 = r10.getLongitudeE6()
            int r11 = r11 - r8
            r10.setLongitudeE6(r11)
            int r11 = r10.getLatitudeE6()
            int r11 = r11 - r6
            r10.setLatitudeE6(r11)
            int r7 = r7 + 1
            goto L_0x003c
        L_0x0057:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r7 = r1 + 1
            float r7 = (float) r7
            float r3 = r3 / r7
            r10 = r3
            r7 = 0
        L_0x005f:
            if (r7 >= r1) goto L_0x0125
            boolean r11 = r16.isEmpty()
            if (r11 == 0) goto L_0x006a
        L_0x0067:
            r12 = 0
            goto L_0x0109
        L_0x006a:
            int r11 = r16.size()
            r12 = 3
            if (r11 == r12) goto L_0x0075
            r13 = 4
            if (r11 == r13) goto L_0x0075
            goto L_0x0067
        L_0x0075:
            r13 = 1
            if (r11 != r12) goto L_0x00b9
            java.lang.Object r11 = r0.get(r5)
            com.tencent.map.lib.models.GeoPoint r11 = (com.tencent.map.lib.models.GeoPoint) r11
            java.lang.Object r12 = r0.get(r13)
            com.tencent.map.lib.models.GeoPoint r12 = (com.tencent.map.lib.models.GeoPoint) r12
            java.lang.Object r13 = r0.get(r9)
            com.tencent.map.lib.models.GeoPoint r13 = (com.tencent.map.lib.models.GeoPoint) r13
            if (r11 == 0) goto L_0x0067
            if (r12 == 0) goto L_0x0067
            if (r13 != 0) goto L_0x0091
            goto L_0x0067
        L_0x0091:
            int r14 = r11.getLongitudeE6()
            int r15 = r12.getLongitudeE6()
            int r2 = r13.getLongitudeE6()
            double r14 = m157710a(r14, r15, r2, r10)
            int r2 = (int) r14
            int r11 = r11.getLatitudeE6()
            int r12 = r12.getLatitudeE6()
            int r13 = r13.getLatitudeE6()
            double r11 = m157710a(r11, r12, r13, r10)
            int r11 = (int) r11
            com.tencent.map.lib.models.GeoPoint r12 = new com.tencent.map.lib.models.GeoPoint
            r12.<init>((int) r11, (int) r2)
            goto L_0x0109
        L_0x00b9:
            java.lang.Object r2 = r0.get(r5)
            com.tencent.map.lib.models.GeoPoint r2 = (com.tencent.map.lib.models.GeoPoint) r2
            java.lang.Object r11 = r0.get(r13)
            com.tencent.map.lib.models.GeoPoint r11 = (com.tencent.map.lib.models.GeoPoint) r11
            java.lang.Object r13 = r0.get(r9)
            com.tencent.map.lib.models.GeoPoint r13 = (com.tencent.map.lib.models.GeoPoint) r13
            java.lang.Object r12 = r0.get(r12)
            com.tencent.map.lib.models.GeoPoint r12 = (com.tencent.map.lib.models.GeoPoint) r12
            if (r2 == 0) goto L_0x0067
            if (r11 == 0) goto L_0x0067
            if (r13 == 0) goto L_0x0067
            if (r12 != 0) goto L_0x00da
            goto L_0x0067
        L_0x00da:
            int r14 = r2.getLongitudeE6()
            int r15 = r11.getLongitudeE6()
            int r5 = r13.getLongitudeE6()
            int r9 = r12.getLongitudeE6()
            float r5 = m157712a(r14, r15, r5, r9, r10)
            int r5 = (int) r5
            int r2 = r2.getLatitudeE6()
            int r9 = r11.getLatitudeE6()
            int r11 = r13.getLatitudeE6()
            int r12 = r12.getLatitudeE6()
            float r2 = m157712a(r2, r9, r11, r12, r10)
            int r2 = (int) r2
            com.tencent.map.lib.models.GeoPoint r12 = new com.tencent.map.lib.models.GeoPoint
            r12.<init>((int) r2, (int) r5)
        L_0x0109:
            if (r12 == 0) goto L_0x011f
            int r2 = r12.getLongitudeE6()
            int r2 = r2 + r8
            r12.setLongitudeE6(r2)
            int r2 = r12.getLatitudeE6()
            int r2 = r2 + r6
            r12.setLatitudeE6(r2)
            r4.add(r12)
            float r10 = r10 + r3
        L_0x011f:
            int r7 = r7 + 1
            r5 = 0
            r9 = 2
            goto L_0x005f
        L_0x0125:
            return r4
        L_0x0126:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113901ks.m157715a(java.util.List, int):java.util.List");
    }

    /* renamed from: a */
    private static GeoPoint m157714a(List<GeoPoint> list, float f) {
        int size;
        if (list == null || list.isEmpty() || ((size = list.size()) != 3 && size != 4)) {
            return null;
        }
        if (size == 3) {
            GeoPoint geoPoint = list.get(0);
            GeoPoint geoPoint2 = list.get(1);
            GeoPoint geoPoint3 = list.get(2);
            if (geoPoint == null || geoPoint2 == null || geoPoint3 == null) {
                return null;
            }
            return new GeoPoint((int) m157710a(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6(), geoPoint3.getLatitudeE6(), f), (int) m157710a(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6(), geoPoint3.getLongitudeE6(), f));
        }
        GeoPoint geoPoint4 = list.get(0);
        GeoPoint geoPoint5 = list.get(1);
        GeoPoint geoPoint6 = list.get(2);
        GeoPoint geoPoint7 = list.get(3);
        if (!(geoPoint4 == null || geoPoint5 == null || geoPoint6 == null || geoPoint7 == null)) {
            return new GeoPoint((int) m157712a(geoPoint4.getLatitudeE6(), geoPoint5.getLatitudeE6(), geoPoint6.getLatitudeE6(), geoPoint7.getLatitudeE6(), f), (int) m157712a(geoPoint4.getLongitudeE6(), geoPoint5.getLongitudeE6(), geoPoint6.getLongitudeE6(), geoPoint7.getLongitudeE6(), f));
        }
        return null;
    }

    /* renamed from: a */
    private static double m157711a(C113732fo foVar, C113732fo foVar2) {
        double d = foVar2.f340215a - foVar.f340215a;
        double d2 = foVar2.f340216b - foVar.f340216b;
        return Math.sqrt((d * d) + (d2 * d2));
    }
}
