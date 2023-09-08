package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.se1 */
public class C51231se1 extends C47465a {

    /* renamed from: d */
    public int f141455d;

    /* renamed from: e */
    public C48669a53 f141456e;

    /* renamed from: f */
    public C51924x43 f141457f;

    /* renamed from: g */
    public C52217z43 f141458g;

    /* renamed from: h */
    public C52068y43 f141459h;

    /* renamed from: i */
    public LinkedList<C48811b53> f141460i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51231se1)) {
            return false;
        }
        C51231se1 se12 = (C51231se1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141455d), Integer.valueOf(se12.f141455d)) && C46238a.m51546a(this.f141456e, se12.f141456e) && C46238a.m51546a(this.f141457f, se12.f141457f) && C46238a.m51546a(this.f141458g, se12.f141458g) && C46238a.m51546a(this.f141459h, se12.f141459h) && C46238a.m51546a(this.f141460i, se12.f141460i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141455d);
            C48669a53 a532 = this.f141456e;
            if (a532 != null) {
                aVar.mo74322i(2, a532.computeSize());
                this.f141456e.writeFields(aVar);
            }
            C51924x43 x432 = this.f141457f;
            if (x432 != null) {
                aVar.mo74322i(3, x432.computeSize());
                this.f141457f.writeFields(aVar);
            }
            C52217z43 z432 = this.f141458g;
            if (z432 != null) {
                aVar.mo74322i(4, z432.computeSize());
                this.f141458g.writeFields(aVar);
            }
            C52068y43 y432 = this.f141459h;
            if (y432 != null) {
                aVar.mo74322i(5, y432.computeSize());
                this.f141459h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f141460i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141455d) + 0;
            C48669a53 a533 = this.f141456e;
            if (a533 != null) {
                e += C52418a.m58682i(2, a533.computeSize());
            }
            C51924x43 x433 = this.f141457f;
            if (x433 != null) {
                e += C52418a.m58682i(3, x433.computeSize());
            }
            C52217z43 z433 = this.f141458g;
            if (z433 != null) {
                e += C52418a.m58682i(4, z433.computeSize());
            }
            C52068y43 y433 = this.f141459h;
            if (y433 != null) {
                e += C52418a.m58682i(5, y433.computeSize());
            }
            return e + C52418a.m58680g(6, 8, this.f141460i);
        } else if (i == 2) {
            this.f141460i.clear();
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
            C51231se1 se12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    se12.f141455d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48669a53 a534 = new C48669a53();
                        if (bArr != null && bArr.length > 0) {
                            a534.parseFrom(bArr);
                        }
                        se12.f141456e = a534;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51924x43 x434 = new C51924x43();
                        if (bArr2 != null && bArr2.length > 0) {
                            x434.parseFrom(bArr2);
                        }
                        se12.f141457f = x434;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C52217z43 z434 = new C52217z43();
                        if (bArr3 != null && bArr3.length > 0) {
                            z434.parseFrom(bArr3);
                        }
                        se12.f141458g = z434;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C52068y43 y434 = new C52068y43();
                        if (bArr4 != null && bArr4.length > 0) {
                            y434.parseFrom(bArr4);
                        }
                        se12.f141459h = y434;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C48811b53 b532 = new C48811b53();
                        if (bArr5 != null && bArr5.length > 0) {
                            b532.parseFrom(bArr5);
                        }
                        se12.f141460i.add(b532);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
