package uf0;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uf0.d */
public final class C102017d extends C102014a {

    /* renamed from: w */
    public final List<Long> f300400w = new ArrayList();

    /* renamed from: x */
    public final List<Long> f300401x = new ArrayList();

    public C102017d(int i, long j, int i2, long j2) {
        super(i, j, i2, j2);
    }

    /* renamed from: b */
    public final void mo141512b(RandomAccessFile randomAccessFile, byte[] bArr) {
        C87412m.m108594g(randomAccessFile, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bArr, "atomHead");
        if (randomAccessFile.read(bArr) >= 8) {
            C102016c.m134343e(bArr, 0);
            if (C102016c.m134343e(bArr, 4) == C102014a.f300383m) {
                byte[] bArr2 = new byte[4];
                randomAccessFile.read(bArr2);
                byte b = bArr2[0];
                randomAccessFile.read(bArr2);
                int e = C102016c.m134343e(bArr2, 0);
                if (b == 1) {
                    bArr2 = new byte[8];
                }
                for (int i = 0; i < e; i++) {
                    if (b == 1) {
                        randomAccessFile.read(bArr2);
                        ((ArrayList) this.f300400w).add(Long.valueOf(C102016c.m134344f(bArr2, 0)));
                        randomAccessFile.read(bArr2);
                        ((ArrayList) this.f300401x).add(Long.valueOf(C102016c.m134344f(bArr2, 0)));
                    } else {
                        randomAccessFile.read(bArr2);
                        ((ArrayList) this.f300400w).add(Long.valueOf((long) C102016c.m134343e(bArr2, 0)));
                        randomAccessFile.read(bArr2);
                        ((ArrayList) this.f300401x).add(Long.valueOf((long) C102016c.m134343e(bArr2, 0)));
                    }
                    C102016c.m134346h(randomAccessFile, 4);
                }
            }
        }
    }
}
