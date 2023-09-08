package gi3;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Looper;

/* renamed from: gi3.b */
public class C24541b {

    /* renamed from: a */
    public static C116974a<Paint> f70126a = new C116974a<>();

    /* renamed from: b */
    public static C116974a<float[]> f70127b = new C116974a<>();

    /* renamed from: c */
    public static C116974a<Matrix> f70128c = new C116974a<>();

    /* renamed from: d */
    public static C116974a<Path> f70129d = new C116974a<>();

    /* renamed from: e */
    public static final float[] f70130e = new float[9];

    /* renamed from: a */
    public static synchronized Paint m30701a(Looper looper, Paint paint) {
        Paint a;
        synchronized (C24541b.class) {
            a = f70126a.mo180950a(looper);
            if (a == null) {
                a = new Paint();
            } else {
                a.reset();
            }
            if (paint != null) {
                a.set(paint);
            }
            f70126a.mo180952c(looper, a);
        }
        return a;
    }

    /* renamed from: b */
    public static synchronized Path m30702b(Looper looper, Path path) {
        Path a;
        synchronized (C24541b.class) {
            a = f70129d.mo180950a(looper);
            if (a == null) {
                a = new Path();
            } else {
                a.reset();
            }
            if (path != null) {
                a.set(path);
            }
            f70129d.mo180952c(looper, a);
        }
        return a;
    }
}
