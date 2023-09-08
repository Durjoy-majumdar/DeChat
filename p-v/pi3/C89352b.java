package pi3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipException;
import oi3.C89230a;

/* renamed from: pi3.b */
public class C89352b {

    /* renamed from: a */
    public static final Comparator<C89351a> f257341a = new C89353a();

    /* renamed from: pi3.b$a */
    public class C89353a implements Comparator<C89351a> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((C89351a) obj).f257338g, ((C89351a) obj2).f257338g);
        }
    }

    /* renamed from: a */
    public static List<C89351a> m111682a(C89230a aVar) {
        C89230a aVar2 = aVar;
        int min = (int) Math.min((long) 32768, aVar2.f257105h);
        byte[] bArr = new byte[min];
        long j = (long) min;
        long j2 = aVar2.f257105h - j;
        aVar2.mo123549a(j2, j);
        int i = 0;
        C89354c.m111686d(aVar2, bArr, 0, min);
        int i2 = min - 1;
        byte b = 0;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            b = (b << 8) | bArr[i2];
            if (b == 101010256) {
                break;
            }
            i2--;
        }
        long j3 = i2 == -1 ? -1 : j2 + ((long) i2);
        if (j3 != -1) {
            aVar2.mo123549a(j3, aVar2.f257105h - j3);
            if (((int) C89354c.m111684b(aVar)) == 101010256) {
                C89354c.m111687e(aVar2, 6);
                int a = C89354c.m111683a(aVar);
                if (a != 65535) {
                    long b2 = C89354c.m111684b(aVar);
                    long b3 = C89354c.m111684b(aVar);
                    aVar2.mo123549a(b3, b2);
                    ArrayList arrayList = new ArrayList(a);
                    int i3 = 0;
                    while (i3 < a) {
                        if (((int) C89354c.m111684b(aVar)) == 33639248) {
                            C89354c.m111687e(aVar2, 4);
                            int a2 = C89354c.m111683a(aVar);
                            int a3 = C89354c.m111683a(aVar);
                            C89354c.m111687e(aVar2, 4);
                            long b4 = C89354c.m111684b(aVar);
                            long b5 = C89354c.m111684b(aVar);
                            long b6 = C89354c.m111684b(aVar);
                            int a4 = C89354c.m111683a(aVar);
                            int a5 = C89354c.m111683a(aVar);
                            int a6 = C89354c.m111683a(aVar);
                            C89354c.m111687e(aVar2, 8);
                            long b7 = C89354c.m111684b(aVar);
                            byte[] bArr2 = new byte[a4];
                            i = 0;
                            C89354c.m111686d(aVar2, bArr2, 0, a4);
                            C89354c.m111687e(aVar2, (long) (a5 + a6));
                            arrayList.add(new C89351a(a3, b4, b5, b6, bArr2, (a2 & 1024) != 0, b7, false));
                            i3++;
                        } else {
                            throw new ZipException("Bad central directory header");
                        }
                    }
                    Collections.sort(arrayList, f257341a);
                    while (i < arrayList.size()) {
                        C89351a aVar3 = (C89351a) arrayList.get(i);
                        long j4 = i < arrayList.size() - 1 ? ((C89351a) arrayList.get(i + 1)).f257338g : b3;
                        long j5 = aVar3.f257338g;
                        aVar2.mo123549a(j5, j4 - j5);
                        if (((int) C89354c.m111684b(aVar)) == 67324752) {
                            C89354c.m111687e(aVar2, (long) 22);
                            aVar3.f257339h = aVar3.f257338g + ((long) (C89354c.m111683a(aVar) + 30 + C89354c.m111683a(aVar)));
                            i++;
                        } else {
                            throw new ZipException("Bad local entry header");
                        }
                    }
                    return arrayList;
                }
                throw new ZipException("No support for zip64");
            }
            throw new ZipException("Bad eocd header");
        }
        throw new ZipException("EOCD record not found in last 32k of archive, giving up");
    }
}
