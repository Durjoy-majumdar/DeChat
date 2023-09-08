package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hm3 */
public class C49726hm3 extends C47465a {

    /* renamed from: d */
    public int f134732d;

    /* renamed from: e */
    public int f134733e;

    /* renamed from: f */
    public int f134734f;

    /* renamed from: g */
    public int f134735g;

    /* renamed from: h */
    public f74 f134736h;

    /* renamed from: i */
    public int f134737i;

    /* renamed from: j */
    public int f134738j;

    /* renamed from: n */
    public int f134739n;

    /* renamed from: o */
    public int f134740o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49726hm3)) {
            return false;
        }
        C49726hm3 hm32 = (C49726hm3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134732d), Integer.valueOf(hm32.f134732d)) && C46238a.m51546a(Integer.valueOf(this.f134733e), Integer.valueOf(hm32.f134733e)) && C46238a.m51546a(Integer.valueOf(this.f134734f), Integer.valueOf(hm32.f134734f)) && C46238a.m51546a(Integer.valueOf(this.f134735g), Integer.valueOf(hm32.f134735g)) && C46238a.m51546a(this.f134736h, hm32.f134736h) && C46238a.m51546a(Integer.valueOf(this.f134737i), Integer.valueOf(hm32.f134737i)) && C46238a.m51546a(Integer.valueOf(this.f134738j), Integer.valueOf(hm32.f134738j)) && C46238a.m51546a(Integer.valueOf(this.f134739n), Integer.valueOf(hm32.f134739n)) && C46238a.m51546a(Integer.valueOf(this.f134740o), Integer.valueOf(hm32.f134740o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134732d);
            aVar.mo74318e(2, this.f134733e);
            aVar.mo74318e(3, this.f134734f);
            aVar.mo74318e(4, this.f134735g);
            f74 f74 = this.f134736h;
            if (f74 != null) {
                aVar.mo74322i(5, f74.computeSize());
                this.f134736h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f134737i);
            aVar.mo74318e(7, this.f134738j);
            aVar.mo74318e(8, this.f134739n);
            aVar.mo74318e(9, this.f134740o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134732d) + 0 + C52418a.m58678e(2, this.f134733e) + C52418a.m58678e(3, this.f134734f) + C52418a.m58678e(4, this.f134735g);
            f74 f742 = this.f134736h;
            if (f742 != null) {
                e += C52418a.m58682i(5, f742.computeSize());
            }
            return e + C52418a.m58678e(6, this.f134737i) + C52418a.m58678e(7, this.f134738j) + C52418a.m58678e(8, this.f134739n) + C52418a.m58678e(9, this.f134740o);
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
            C49726hm3 hm32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hm32.f134732d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hm32.f134733e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hm32.f134734f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    hm32.f134735g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        f74 f743 = new f74();
                        if (bArr != null && bArr.length > 0) {
                            f743.parseFrom(bArr);
                        }
                        hm32.f134736h = f743;
                    }
                    return 0;
                case 6:
                    hm32.f134737i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    hm32.f134738j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    hm32.f134739n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    hm32.f134740o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
