package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b53 */
public class C48811b53 extends C47465a {

    /* renamed from: d */
    public int f130950d;

    /* renamed from: e */
    public C48669a53 f130951e;

    /* renamed from: f */
    public C51924x43 f130952f;

    /* renamed from: g */
    public C52217z43 f130953g;

    /* renamed from: h */
    public C52068y43 f130954h;

    /* renamed from: i */
    public String f130955i;

    /* renamed from: j */
    public long f130956j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48811b53)) {
            return false;
        }
        C48811b53 b532 = (C48811b53) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130950d), Integer.valueOf(b532.f130950d)) && C46238a.m51546a(this.f130951e, b532.f130951e) && C46238a.m51546a(this.f130952f, b532.f130952f) && C46238a.m51546a(this.f130953g, b532.f130953g) && C46238a.m51546a(this.f130954h, b532.f130954h) && C46238a.m51546a(this.f130955i, b532.f130955i) && C46238a.m51546a(Long.valueOf(this.f130956j), Long.valueOf(b532.f130956j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130950d);
            C48669a53 a532 = this.f130951e;
            if (a532 != null) {
                aVar.mo74322i(2, a532.computeSize());
                this.f130951e.writeFields(aVar);
            }
            C51924x43 x432 = this.f130952f;
            if (x432 != null) {
                aVar.mo74322i(3, x432.computeSize());
                this.f130952f.writeFields(aVar);
            }
            C52217z43 z432 = this.f130953g;
            if (z432 != null) {
                aVar.mo74322i(4, z432.computeSize());
                this.f130953g.writeFields(aVar);
            }
            C52068y43 y432 = this.f130954h;
            if (y432 != null) {
                aVar.mo74322i(5, y432.computeSize());
                this.f130954h.writeFields(aVar);
            }
            String str = this.f130955i;
            if (str != null) {
                aVar.mo74323j(20, str);
            }
            aVar.mo74321h(21, this.f130956j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130950d) + 0;
            C48669a53 a533 = this.f130951e;
            if (a533 != null) {
                e += C52418a.m58682i(2, a533.computeSize());
            }
            C51924x43 x433 = this.f130952f;
            if (x433 != null) {
                e += C52418a.m58682i(3, x433.computeSize());
            }
            C52217z43 z433 = this.f130953g;
            if (z433 != null) {
                e += C52418a.m58682i(4, z433.computeSize());
            }
            C52068y43 y433 = this.f130954h;
            if (y433 != null) {
                e += C52418a.m58682i(5, y433.computeSize());
            }
            String str2 = this.f130955i;
            if (str2 != null) {
                e += C52418a.m58683j(20, str2);
            }
            return e + C52418a.m58681h(21, this.f130956j);
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
            C48811b53 b532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b532.f130950d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48669a53 a534 = new C48669a53();
                    if (bArr != null && bArr.length > 0) {
                        a534.parseFrom(bArr);
                    }
                    b532.f130951e = a534;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51924x43 x434 = new C51924x43();
                    if (bArr2 != null && bArr2.length > 0) {
                        x434.parseFrom(bArr2);
                    }
                    b532.f130952f = x434;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C52217z43 z434 = new C52217z43();
                    if (bArr3 != null && bArr3.length > 0) {
                        z434.parseFrom(bArr3);
                    }
                    b532.f130953g = z434;
                }
                return 0;
            } else if (intValue == 5) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C52068y43 y434 = new C52068y43();
                    if (bArr4 != null && bArr4.length > 0) {
                        y434.parseFrom(bArr4);
                    }
                    b532.f130954h = y434;
                }
                return 0;
            } else if (intValue == 20) {
                b532.f130955i = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 21) {
                return -1;
            } else {
                b532.f130956j = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
