package hf0;

import cf0.C80028g;
import df0.C86271a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.ZipException;

/* renamed from: hf0.b */
public class C87486b {

    /* renamed from: a */
    public static final Comparator<C86271a> f253477a = new C87487a();

    /* renamed from: hf0.b$a */
    public static class C87487a implements Comparator<C86271a> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((C86271a) obj).f250882g, ((C86271a) obj2).f250882g);
        }
    }

    /* renamed from: a */
    public static List<C86271a> m108773a(C80028g gVar) {
        C80028g gVar2 = gVar;
        int min = (int) Math.min((long) 32768, gVar2.f234462h);
        byte[] bArr = new byte[min];
        long j = (long) min;
        long j2 = gVar2.f234462h - j;
        gVar2.mo110269a(j2, j);
        int i = 0;
        C87488c.m108777d(gVar2, bArr, 0, min);
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
            gVar2.mo110269a(j3, gVar2.f234462h - j3);
            if (((int) C87488c.m108775b(gVar)) == 101010256) {
                C87488c.m108778e(gVar2, 6);
                int a = C87488c.m108774a(gVar);
                if (a != 65535) {
                    long b2 = C87488c.m108775b(gVar);
                    long b3 = C87488c.m108775b(gVar);
                    gVar2.mo110269a(b3, b2);
                    ArrayList arrayList = new ArrayList(a);
                    int i3 = 0;
                    while (i3 < a) {
                        if (((int) C87488c.m108775b(gVar)) == 33639248) {
                            C87488c.m108778e(gVar2, 4);
                            int a2 = C87488c.m108774a(gVar);
                            int a3 = C87488c.m108774a(gVar);
                            C87488c.m108778e(gVar2, 4);
                            long b4 = C87488c.m108775b(gVar);
                            long b5 = C87488c.m108775b(gVar);
                            long b6 = C87488c.m108775b(gVar);
                            int a4 = C87488c.m108774a(gVar);
                            int a5 = C87488c.m108774a(gVar);
                            int a6 = C87488c.m108774a(gVar);
                            C87488c.m108778e(gVar2, 8);
                            long b7 = C87488c.m108775b(gVar);
                            byte[] bArr2 = new byte[a4];
                            i = 0;
                            C87488c.m108777d(gVar2, bArr2, 0, a4);
                            C87488c.m108778e(gVar2, (long) (a5 + a6));
                            boolean z = (a2 & 1024) != 0;
                            arrayList.add(new C86271a(a3, b4, b5, b6, C86271a.m106880a(bArr2, z), z, b7));
                            i3++;
                        } else {
                            throw new ZipException("Bad central directory header");
                        }
                    }
                    Collections.sort(arrayList, f253477a);
                    while (i < arrayList.size()) {
                        C86271a aVar = (C86271a) arrayList.get(i);
                        long j4 = i < arrayList.size() - 1 ? ((C86271a) arrayList.get(i + 1)).f250882g : b3;
                        long j5 = aVar.f250882g;
                        gVar2.mo110269a(j5, j4 - j5);
                        if (((int) C87488c.m108775b(gVar)) == 67324752) {
                            C87488c.m108778e(gVar2, (long) 22);
                            aVar.f250883h = aVar.f250882g + ((long) (C87488c.m108774a(gVar) + 30 + C87488c.m108774a(gVar)));
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
