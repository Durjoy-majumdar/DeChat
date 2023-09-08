package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xh2 */
public class C51975xh2 extends C47465a {

    /* renamed from: d */
    public String f144653d;

    /* renamed from: e */
    public String f144654e;

    /* renamed from: f */
    public float f144655f;

    /* renamed from: g */
    public float f144656g;

    /* renamed from: h */
    public C52219z50 f144657h;

    /* renamed from: i */
    public String f144658i;

    /* renamed from: j */
    public float f144659j;

    /* renamed from: n */
    public float f144660n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51975xh2)) {
            return false;
        }
        C51975xh2 xh22 = (C51975xh2) aVar;
        return C46238a.m51546a(this.f144653d, xh22.f144653d) && C46238a.m51546a(this.f144654e, xh22.f144654e) && C46238a.m51546a(Float.valueOf(this.f144655f), Float.valueOf(xh22.f144655f)) && C46238a.m51546a(Float.valueOf(this.f144656g), Float.valueOf(xh22.f144656g)) && C46238a.m51546a(this.f144657h, xh22.f144657h) && C46238a.m51546a(this.f144658i, xh22.f144658i) && C46238a.m51546a(Float.valueOf(this.f144659j), Float.valueOf(xh22.f144659j)) && C46238a.m51546a(Float.valueOf(this.f144660n), Float.valueOf(xh22.f144660n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144653d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144654e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74317d(3, this.f144655f);
            aVar.mo74317d(4, this.f144656g);
            C52219z50 z502 = this.f144657h;
            if (z502 != null) {
                aVar.mo74322i(6, z502.computeSize());
                this.f144657h.writeFields(aVar);
            }
            String str3 = this.f144658i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74317d(8, this.f144659j);
            aVar.mo74317d(9, this.f144660n);
            return 0;
        } else if (i == 1) {
            String str4 = this.f144653d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f144654e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int d = i2 + C52418a.m58677d(3, this.f144655f) + C52418a.m58677d(4, this.f144656g);
            C52219z50 z503 = this.f144657h;
            if (z503 != null) {
                d += C52418a.m58682i(6, z503.computeSize());
            }
            String str6 = this.f144658i;
            if (str6 != null) {
                d += C52418a.m58683j(7, str6);
            }
            return d + C52418a.m58677d(8, this.f144659j) + C52418a.m58677d(9, this.f144660n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51975xh2 xh22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xh22.f144653d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xh22.f144654e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xh22.f144655f = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    xh22.f144656g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52219z50 z504 = new C52219z50();
                        if (bArr != null && bArr.length > 0) {
                            z504.parseFrom(bArr);
                        }
                        xh22.f144657h = z504;
                    }
                    return 0;
                case 7:
                    xh22.f144658i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xh22.f144659j = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    xh22.f144660n = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
