package uf0;

import java.io.RandomAccessFile;

/* renamed from: uf0.o */
public class C102026o extends C102014a {

    /* renamed from: w */
    public C102018g f300461w;

    /* renamed from: x */
    public C102017d f300462x;

    public C102026o(int i, long j, int i2, long j2) {
        super(i, j, i2, j2);
    }

    /* renamed from: b */
    public void mo141539b(RandomAccessFile randomAccessFile, byte[] bArr) {
        long a = mo141508a() - 8;
        while (a > 0) {
            try {
                int read = randomAccessFile.read(bArr);
                int e = C102016c.m134343e(bArr, 0);
                int e2 = C102016c.m134343e(bArr, 4);
                a -= (long) e;
                if (e2 == C102014a.f300382l) {
                    C102017d dVar = (C102017d) C102019h.m134349a(e, e2, randomAccessFile.getFilePointer() - ((long) read), 0);
                    this.f300462x = dVar;
                    dVar.mo141512b(randomAccessFile, bArr);
                } else if (e2 == C102014a.f300379i) {
                    C102018g gVar = (C102018g) C102019h.m134349a(e, e2, randomAccessFile.getFilePointer() - ((long) read), 0);
                    this.f300461w = gVar;
                    gVar.mo141513b(randomAccessFile, bArr);
                } else if (!C102016c.m134346h(randomAccessFile, (long) (e - 8))) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
    }
}
