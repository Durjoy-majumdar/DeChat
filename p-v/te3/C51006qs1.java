package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qs1 */
public class C51006qs1 extends C47465a {

    /* renamed from: d */
    public jp4 f140522d;

    /* renamed from: e */
    public C50169kr1 f140523e;

    /* renamed from: f */
    public String f140524f;

    /* renamed from: g */
    public C48757as1 f140525g;

    /* renamed from: h */
    public C49887ir1 f140526h;

    /* renamed from: i */
    public C49047ct1 f140527i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51006qs1)) {
            return false;
        }
        C51006qs1 qs12 = (C51006qs1) aVar;
        return C46238a.m51546a(this.f140522d, qs12.f140522d) && C46238a.m51546a(this.f140523e, qs12.f140523e) && C46238a.m51546a(this.f140524f, qs12.f140524f) && C46238a.m51546a(this.f140525g, qs12.f140525g) && C46238a.m51546a(this.f140526h, qs12.f140526h) && C46238a.m51546a(this.f140527i, qs12.f140527i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            jp4 jp4 = this.f140522d;
            if (jp4 != null) {
                aVar.mo74322i(1, jp4.computeSize());
                this.f140522d.writeFields(aVar);
            }
            C50169kr1 kr12 = this.f140523e;
            if (kr12 != null) {
                aVar.mo74322i(2, kr12.computeSize());
                this.f140523e.writeFields(aVar);
            }
            String str = this.f140524f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C48757as1 as12 = this.f140525g;
            if (as12 != null) {
                aVar.mo74322i(4, as12.computeSize());
                this.f140525g.writeFields(aVar);
            }
            C49887ir1 ir12 = this.f140526h;
            if (ir12 != null) {
                aVar.mo74322i(5, ir12.computeSize());
                this.f140526h.writeFields(aVar);
            }
            C49047ct1 ct12 = this.f140527i;
            if (ct12 != null) {
                aVar.mo74322i(6, ct12.computeSize());
                this.f140527i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            jp4 jp42 = this.f140522d;
            if (jp42 != null) {
                i2 = 0 + C52418a.m58682i(1, jp42.computeSize());
            }
            C50169kr1 kr13 = this.f140523e;
            if (kr13 != null) {
                i2 += C52418a.m58682i(2, kr13.computeSize());
            }
            String str2 = this.f140524f;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C48757as1 as13 = this.f140525g;
            if (as13 != null) {
                i2 += C52418a.m58682i(4, as13.computeSize());
            }
            C49887ir1 ir13 = this.f140526h;
            if (ir13 != null) {
                i2 += C52418a.m58682i(5, ir13.computeSize());
            }
            C49047ct1 ct13 = this.f140527i;
            return ct13 != null ? i2 + C52418a.m58682i(6, ct13.computeSize()) : i2;
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
            C51006qs1 qs12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        jp4 jp43 = new jp4();
                        if (bArr != null && bArr.length > 0) {
                            jp43.parseFrom(bArr);
                        }
                        qs12.f140522d = jp43;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50169kr1 kr14 = new C50169kr1();
                        if (bArr2 != null && bArr2.length > 0) {
                            kr14.parseFrom(bArr2);
                        }
                        qs12.f140523e = kr14;
                    }
                    return 0;
                case 3:
                    qs12.f140524f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48757as1 as14 = new C48757as1();
                        if (bArr3 != null && bArr3.length > 0) {
                            as14.parseFrom(bArr3);
                        }
                        qs12.f140525g = as14;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49887ir1 ir14 = new C49887ir1();
                        if (bArr4 != null && bArr4.length > 0) {
                            ir14.parseFrom(bArr4);
                        }
                        qs12.f140526h = ir14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49047ct1 ct14 = new C49047ct1();
                        if (bArr5 != null && bArr5.length > 0) {
                            ct14.parseFrom(bArr5);
                        }
                        qs12.f140527i = ct14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
