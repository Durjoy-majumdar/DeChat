package gi3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Looper;

/* renamed from: gi3.c */
public abstract class C24542c {
    public static final int GetHeight = 1;
    public static final int GetWidth = 0;
    public static final int Render = 2;

    public static void done(Looper looper) {
        if (looper != null) {
            C116974a<Paint> aVar = C24541b.f70126a;
            synchronized (C24541b.class) {
                C24541b.f70126a.mo180951b(looper);
                C24541b.f70127b.mo180951b(looper);
                C24541b.f70128c.mo180951b(looper);
                C24541b.f70129d.mo180951b(looper);
            }
        }
    }

    public static int getHeight(C24542c cVar) {
        return cVar.doCommand(1, new Object[0]);
    }

    public static int getWidth(C24542c cVar) {
        return cVar.doCommand(0, new Object[0]);
    }

    public static Matrix instanceMatrix(Looper looper) {
        Matrix a;
        C116974a<Paint> aVar = C24541b.f70126a;
        synchronized (C24541b.class) {
            a = C24541b.f70128c.mo180950a(looper);
            if (a == null) {
                a = new Matrix();
            } else {
                a.reset();
            }
            C24541b.f70128c.mo180952c(looper, a);
        }
        return a;
    }

    public static float[] instanceMatrixArray(Looper looper) {
        float[] a;
        C116974a<Paint> aVar = C24541b.f70126a;
        synchronized (C24541b.class) {
            a = C24541b.f70127b.mo180950a(looper);
            if (a == null) {
                a = new float[9];
            } else {
                System.arraycopy(C24541b.f70130e, 0, a, 0, 9);
            }
            C24541b.f70127b.mo180952c(looper, a);
        }
        return a;
    }

    public static Paint instancePaint(Looper looper) {
        return C24541b.m30701a(looper, (Paint) null);
    }

    public static Path instancePath(Looper looper) {
        return C24541b.m30702b(looper, (Path) null);
    }

    public static void render(C24542c cVar, Canvas canvas, Looper looper) {
        cVar.doCommand(2, canvas, looper);
    }

    public static float[] setMatrixFloatArray(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (fArr != null) {
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f3;
            fArr[3] = f4;
            fArr[4] = f5;
            fArr[5] = f6;
            fArr[6] = f7;
            fArr[7] = f8;
            fArr[8] = f9;
        }
        return fArr;
    }

    public abstract int doCommand(int i, Object... objArr);

    public static Paint instancePaint(Paint paint, Looper looper) {
        return C24541b.m30701a(looper, paint);
    }

    public static Path instancePath(Path path, Looper looper) {
        return C24541b.m30702b(looper, path);
    }
}
