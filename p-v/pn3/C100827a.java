package pn3;

import android.graphics.PointF;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pn3.a */
public class C100827a {
    /* renamed from: a */
    public static double m132079a(List<PointF> list, List<PointF> list2) {
        try {
            return m132080b(m132084f(m132083e(list)), m132084f(m132083e(list2)));
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.GestureRecognizer.ToIos", th.toString());
            return 0.0d;
        }
    }

    /* renamed from: b */
    public static double m132080b(List<Float> list, List<Float> list2) {
        int size = list.size();
        int size2 = list2.size();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        while (i < size && i < size2) {
            int i2 = i + 1;
            d += (double) ((list.get(i).floatValue() * list2.get(i).floatValue()) + (list.get(i2).floatValue() * list2.get(i2).floatValue()));
            d2 += (double) ((list.get(i).floatValue() * list2.get(i2).floatValue()) - (list.get(i2).floatValue() * list2.get(i).floatValue()));
            i += 2;
        }
        if (d != 0.0d) {
            double atan = Math.atan(d2 / d);
            return Math.acos((d * Math.cos(atan)) + (d2 * Math.sin(atan)));
        }
        Log.m105920e("MicroMsg.GestureRecognizer.ToIos", "devide a but a == 0");
        return 1.5707963267948966d;
    }

    /* renamed from: c */
    public static List<PointF> m132081c(List<PointF> list, double d) {
        List<PointF> list2 = list;
        double d2 = d / 200.0d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PointF(list2.get(0).x, list2.get(0).y));
        PointF pointF = list2.get(0);
        int size = list.size();
        int i = 1;
        double d3 = 0.0d;
        double d4 = 0.0d;
        while (i < size) {
            PointF pointF2 = list2.get(i);
            double hypot = (double) ((float) Math.hypot((double) (pointF.x - pointF2.x), (double) (pointF.y - pointF2.y)));
            double d5 = d4 + hypot;
            if (d5 < d2) {
                pointF = list2.get(i);
                i++;
                d4 = d5;
            } else if (hypot > d3) {
                double d6 = (d2 - d4) / hypot;
                float f = pointF.x;
                double d7 = ((double) f) + (((double) (pointF2.x - f)) * d6);
                float f2 = pointF.y;
                pointF = new PointF((float) d7, (float) (((double) f2) + (d6 * ((double) (pointF2.y - f2)))));
                arrayList.add(pointF);
                d4 = 0.0d;
            }
            d3 = 0.0d;
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List<PointF> m132082d(List<PointF> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            int size = list.size();
            arrayList.add(list.get(0));
            int size2 = arrayList.size() - 1;
            for (int i = 1; i < size; i++) {
                if (!list.get(i).equals(arrayList.get(size2))) {
                    arrayList.add(list.get(i));
                    size2 = arrayList.size() - 1;
                }
            }
            Log.m105924i("MicroMsg.GestureRecognizer", arrayList.toString());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static List<PointF> m132083e(List<PointF> list) {
        try {
            PointF pointF = list.get(0);
            int size = list.size();
            double d = 0.0d;
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                d += (double) ((float) Math.hypot((double) (pointF.x - pointF2.x), (double) (pointF.y - pointF2.y)));
                pointF = list.get(i);
            }
            return m132081c(list, d);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.GestureRecognizer.ToIos", th.toString());
            return new ArrayList();
        }
    }

    /* renamed from: f */
    public static List<Float> m132084f(List<PointF> list) {
        List<PointF> list2 = list;
        int size = list.size();
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i = 0; i < size; i++) {
            PointF pointF = list2.get(i);
            d += (double) pointF.x;
            d2 += (double) pointF.y;
        }
        double d3 = (double) size;
        PointF pointF2 = new PointF((float) (d / d3), (float) (d2 / d3));
        for (int i2 = 0; i2 < size; i2++) {
            PointF pointF3 = list2.get(i2);
            pointF3.x -= pointF2.x;
            pointF3.y -= pointF2.y;
        }
        double d4 = -1.7976931348623157E308d;
        double d5 = Double.MAX_VALUE;
        double d6 = Double.MAX_VALUE;
        double d7 = -1.7976931348623157E308d;
        for (int i3 = 0; i3 < size; i3++) {
            PointF pointF4 = list2.get(i3);
            d5 = Math.min(d5, (double) pointF4.x);
            d4 = Math.max(d4, (double) pointF4.x);
            d6 = Math.min(d6, (double) pointF4.y);
            d7 = Math.max(d7, (double) pointF4.y);
        }
        double d8 = d4 - d5;
        double d9 = d7 - d6;
        double max = Math.max(d8, d9);
        boolean z = Math.min(d8, d9) / max < 0.20000000298023224d;
        double d15 = 150.0d / d8;
        double d16 = 150.0d / d9;
        if (z) {
            d15 = 150.0d / max;
            d16 = 150.0d / max;
        }
        for (int i4 = 0; i4 < size; i4++) {
            PointF pointF5 = list2.get(i4);
            pointF5.x = (float) (((double) pointF5.x) * d15);
            pointF5.y = (float) (((double) pointF5.y) * d16);
        }
        PointF pointF6 = list2.get(0);
        double atan2 = Math.atan2((double) pointF6.y, (double) pointF6.x);
        double floor = (Math.floor((0.39269908169872414d + atan2) / 0.7853981633974483d) * 0.7853981633974483d) - atan2;
        double cos = Math.cos(floor);
        double sin = Math.sin(floor);
        for (int i5 = 0; i5 < size; i5++) {
            PointF pointF7 = list2.get(i5);
            float f = pointF7.y;
            float f2 = (float) ((((double) pointF7.x) * cos) - (((double) f) * sin));
            pointF7.x = f2;
            pointF7.y = (float) ((((double) f2) * sin) + (((double) f) * cos));
        }
        ArrayList arrayList = new ArrayList();
        double d17 = 0.0d;
        for (int i6 = 0; i6 < size; i6++) {
            PointF pointF8 = list2.get(i6);
            arrayList.add(Float.valueOf(pointF8.x));
            arrayList.add(Float.valueOf(pointF8.y));
            d17 += Math.pow((double) pointF8.x, 2.0d) + Math.pow((double) pointF8.y, 2.0d);
        }
        double sqrt = Math.sqrt(d17);
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            arrayList.set(i7, Float.valueOf((float) ((((double) ((Float) arrayList.get(i7)).floatValue()) / sqrt) + 1.0E-4d)));
        }
        return arrayList;
    }
}
