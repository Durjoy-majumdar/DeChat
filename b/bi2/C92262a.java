package bi2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import gy3.C87412m;
import te3.C101769d70;

/* renamed from: bi2.a */
public abstract class C92262a {

    /* renamed from: a */
    public Matrix f264072a;

    /* renamed from: b */
    public long f264073b;

    /* renamed from: c */
    public C101769d70 f264074c;

    /* renamed from: d */
    public long f264075d;

    public C92262a(Matrix matrix) {
        C87412m.m108594g(matrix, "matrix");
        this.f264072a = matrix;
    }

    /* renamed from: a */
    public long mo126255a(long j) {
        while (true) {
            long j2 = this.f264073b;
            if (j2 <= j) {
                this.f264073b = j2 + mo126259e();
            } else {
                long j3 = j2 - j;
                this.f264073b = j3;
                return j3;
            }
        }
    }

    /* renamed from: b */
    public abstract void mo126256b();

    /* renamed from: c */
    public abstract void mo126257c(Canvas canvas, Paint paint);

    /* renamed from: d */
    public abstract void mo126258d();

    /* renamed from: e */
    public abstract long mo126259e();

    /* renamed from: f */
    public void mo126260f(long j) {
        this.f264075d = j;
    }

    /* renamed from: g */
    public final boolean mo126261g() {
        C101769d70 d702 = this.f264074c;
        if (d702 == null) {
            return true;
        }
        long j = this.f264075d;
        return j >= d702.f298084d && j <= d702.f298085e;
    }
}
