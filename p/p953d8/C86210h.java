package p953d8;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.io.EOFException;
import p300c8.C79950j;
import p333e8.C20551y;
import p333e8.C86464p;

/* renamed from: d8.h */
public final class C86210h {

    /* renamed from: d8.h$a */
    public static class C86211a {

        /* renamed from: a */
        public volatile long f250759a = -1;
    }

    /* renamed from: a */
    public static void m106781a(C79950j jVar, C86199a aVar, C86205d dVar, byte[] bArr, C86464p pVar, int i, C86211a aVar2, boolean z) {
        int i2;
        C79950j jVar2 = jVar;
        C86199a aVar3 = aVar;
        C86205d dVar2 = dVar;
        byte[] bArr2 = bArr;
        C86211a aVar4 = aVar2;
        dVar.getClass();
        bArr.getClass();
        long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        long j2 = -1;
        if (aVar4 != null) {
            String str = jVar2.f234186f;
            if (str == null) {
                str = jVar2.f234181a.toString();
            }
            String str2 = str;
            long j3 = jVar2.f234183c;
            long j4 = jVar2.f234185e;
            if (j4 == -1) {
                j4 = aVar3.mo120612E(str2);
            }
            aVar4.f250759a = j4;
            long j5 = j3;
            long j6 = j4;
            while (j6 != 0) {
                int i3 = (j6 > -1 ? 1 : (j6 == -1 ? 0 : -1));
                String str3 = str2;
                long D = aVar.mo120611D(str2, j5, i3 != 0 ? j6 : Long.MAX_VALUE);
                if (D <= 0) {
                    D = -D;
                    if (D == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                        break;
                    }
                }
                j5 += D;
                if (i3 == 0) {
                    D = 0;
                }
                j6 -= D;
                str2 = str3;
            }
        } else {
            aVar4 = new C86211a();
        }
        String str4 = jVar2.f234186f;
        if (str4 == null) {
            str4 = jVar2.f234181a.toString();
        }
        String str5 = str4;
        long j7 = jVar2.f234183c;
        long j8 = jVar2.f234185e;
        if (j8 == -1) {
            j8 = aVar3.mo120612E(str5);
        }
        long j9 = j7;
        long j15 = j8;
        for (long j16 = 0; j15 != j16; j16 = 0) {
            int i4 = (j15 > j2 ? 1 : (j15 == j2 ? 0 : -1));
            String str6 = str5;
            long D2 = aVar.mo120611D(str5, j9, i4 != 0 ? j15 : j);
            if (D2 <= j16) {
                D2 = -D2;
                try {
                    if (!Thread.interrupted()) {
                        C79950j jVar3 = new C79950j(jVar2.f234181a, jVar2.f234182b, j9, (jVar2.f234184d + j9) - jVar2.f234183c, -1, jVar2.f234186f, jVar2.f234187g | 2);
                        long b = dVar2.mo110126b(jVar3);
                        if (aVar4.f250759a == -1 && b != -1) {
                            aVar4.f250759a = jVar3.f234183c + b;
                        }
                        long j17 = j16;
                        while (true) {
                            i2 = (j17 > D2 ? 1 : (j17 == D2 ? 0 : -1));
                            if (i2 == 0) {
                                j2 = -1;
                                break;
                            } else if (!Thread.interrupted()) {
                                int c = dVar2.mo110127c(bArr2, 0, D2 != -1 ? (int) Math.min((long) bArr2.length, D2 - j17) : bArr2.length);
                                if (c == -1) {
                                    j2 = -1;
                                    if (aVar4.f250759a == -1) {
                                        aVar4.f250759a = jVar3.f234183c + j17;
                                    }
                                } else {
                                    j17 += (long) c;
                                }
                            } else {
                                throw new InterruptedException();
                            }
                        }
                        if (i2 < 0) {
                            if (z && i4 != 0) {
                                throw new EOFException();
                            }
                            return;
                        }
                    } else {
                        throw new InterruptedException();
                    }
                } finally {
                    C20551y.m22314d(dVar);
                }
            }
            j9 += D2;
            if (i4 == 0) {
                D2 = 0;
            }
            j15 -= D2;
            str5 = str6;
            j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
    }
}
