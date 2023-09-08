package uf0;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.io.RandomAccessFile;

/* renamed from: uf0.l */
public final class C102023l extends C102014a {

    /* renamed from: w */
    public long f300433w;

    public C102023l(int i, long j, int i2, long j2) {
        super(i, j, i2, j2);
    }

    /* renamed from: b */
    public final void mo141524b(RandomAccessFile randomAccessFile, byte[] bArr) {
        C87412m.m108594g(randomAccessFile, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bArr, "atomHead");
        byte[] bArr2 = new byte[4];
        C102016c.m134346h(randomAccessFile, 12);
        randomAccessFile.read(bArr2);
        this.f300433w = (long) C102016c.m134343e(bArr2, 0);
        randomAccessFile.read(bArr2);
        C102016c.m134343e(bArr2, 0);
    }
}
