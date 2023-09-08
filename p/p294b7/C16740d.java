package p294b7;

import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import p294b7.C16750m;
import p333e8.C20541m;

/* renamed from: b7.d */
public final class C16740d implements C16750m {
    /* renamed from: a */
    public void mo17741a(Format format) {
    }

    /* renamed from: b */
    public void mo17742b(C20541m mVar, int i) {
        mVar.mo32114y(i);
    }

    /* renamed from: c */
    public int mo17743c(C16742f fVar, int i, boolean z) {
        C16738b bVar = (C16738b) fVar;
        int min = Math.min(bVar.f45245f, i);
        bVar.mo17739g(min);
        if (min == 0) {
            min = bVar.mo17736d(C16738b.f45239g, 0, Math.min(i, 4096), 0, true);
        }
        if (min != -1) {
            bVar.f45242c += (long) min;
        }
        if (min != -1) {
            return min;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public void mo17744d(long j, int i, int i2, int i3, C16750m.C16751a aVar) {
    }
}
