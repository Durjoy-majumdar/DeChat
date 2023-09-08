package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/* renamed from: com.tencent.mapsdk.internal.la */
public final class C80348la {

    /* renamed from: a */
    public static final Random f235215a = new Random();

    /* renamed from: a */
    private static List<PointF> m97868a(List<PointF> list, double d) {
        int size = list.size();
        if (list.isEmpty() || size < 3) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        int size2 = list.size() - 1;
        while (list.get(0).equals(list.get(size2))) {
            size2--;
            if (size2 <= 0) {
                return list;
            }
        }
        arrayList.add(Integer.valueOf(size2));
        m97871a(list, 0, size2, d, arrayList);
        m97872b(arrayList, 0, arrayList.size() - 1, new Comparator<Integer>() {
            /* renamed from: a */
            private static int m97873a(Integer num, Integer num2) {
                return num.intValue() - num2.intValue();
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Integer) obj).intValue() - ((Integer) obj2).intValue();
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(list.get(((Integer) arrayList.get(i)).intValue()));
        }
        return arrayList2;
    }

    /* renamed from: b */
    private static <E> void m97872b(ArrayList<E> arrayList, int i, int i2, Comparator<? super E> comparator) {
        while (i2 > i) {
            int nextInt = f235215a.nextInt((i2 - i) + 1) + i;
            E e = arrayList.get(nextInt);
            m97869a(arrayList, nextInt, i2);
            int i3 = i;
            int i4 = i3;
            while (i3 < i2) {
                if (comparator.compare(arrayList.get(i3), e) <= 0) {
                    m97869a(arrayList, i4, i3);
                    i4++;
                }
                i3++;
            }
            m97869a(arrayList, i4, i2);
            m97872b(arrayList, i, i4 - 1, comparator);
            i = i4 + 1;
        }
    }

    /* renamed from: a */
    private static <E> void m97869a(ArrayList<E> arrayList, int i, int i2) {
        E e = arrayList.get(i);
        arrayList.set(i, arrayList.get(i2));
        arrayList.set(i2, e);
    }

    /* renamed from: a */
    private static <E> int m97867a(ArrayList<E> arrayList, int i, int i2, Comparator<? super E> comparator) {
        int nextInt = f235215a.nextInt((i2 - i) + 1) + i;
        E e = arrayList.get(nextInt);
        m97869a(arrayList, nextInt, i2);
        int i3 = i;
        while (i < i2) {
            if (comparator.compare(arrayList.get(i), e) <= 0) {
                m97869a(arrayList, i3, i);
                i3++;
            }
            i++;
        }
        m97869a(arrayList, i3, i2);
        return i3;
    }

    /* renamed from: a */
    private static <E> void m97870a(ArrayList<E> arrayList, Comparator<? super E> comparator) {
        m97872b(arrayList, 0, arrayList.size() - 1, comparator);
    }

    /* renamed from: a */
    private static void m97871a(List<PointF> list, int i, int i2, double d, ArrayList<Integer> arrayList) {
        double d2;
        List<PointF> list2 = list;
        int i3 = i2;
        int i4 = i;
        while (true) {
            double d3 = 0.0d;
            int i5 = 0;
            for (int i6 = i4; i6 < i3; i6++) {
                PointF pointF = list2.get(i4);
                PointF pointF2 = list2.get(i3);
                PointF pointF3 = list2.get(i6);
                if (pointF.equals(pointF2) || pointF3.equals(pointF) || pointF3.equals(pointF2)) {
                    d2 = 0.0d;
                } else {
                    float f = pointF.x;
                    float f2 = pointF2.y;
                    float f3 = pointF2.x;
                    float f4 = pointF3.y;
                    float f5 = pointF3.x;
                    float f6 = pointF.y;
                    d2 = (Math.abs(((double) ((((((f * f2) + (f3 * f4)) + (f5 * f6)) - (f3 * f6)) - (f5 * f2)) - (f * f4))) * 0.5d) * 2.0d) / Math.sqrt(Math.pow((double) (pointF.x - pointF2.x), 2.0d) + Math.pow((double) (pointF.y - pointF2.y), 2.0d));
                }
                if (d2 > d3) {
                    i5 = i6;
                    d3 = d2;
                }
            }
            if (d3 > d && i5 != 0) {
                arrayList.add(Integer.valueOf(i5));
                m97871a(list, i4, i5, d, arrayList);
                i4 = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static double m97866a(PointF pointF, PointF pointF2, PointF pointF3) {
        if (pointF.equals(pointF2) || pointF3.equals(pointF) || pointF3.equals(pointF2)) {
            return 0.0d;
        }
        float f = pointF.x;
        float f2 = pointF2.y;
        float f3 = pointF2.x;
        float f4 = pointF3.y;
        float f5 = pointF3.x;
        float f6 = pointF.y;
        return (Math.abs(((double) ((((((f * f2) + (f3 * f4)) + (f5 * f6)) - (f3 * f6)) - (f5 * f2)) - (f * f4))) * 0.5d) * 2.0d) / Math.sqrt(Math.pow((double) (pointF.x - pointF2.x), 2.0d) + Math.pow((double) (pointF.y - pointF2.y), 2.0d));
    }
}
