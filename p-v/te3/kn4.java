package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class kn4 extends C101820nt3 {

    /* renamed from: d */
    public C51163rv3 f298636d;

    /* renamed from: e */
    public C51163rv3 f298637e;

    /* renamed from: f */
    public int f298638f;

    /* renamed from: g */
    public int f298639g;

    /* renamed from: h */
    public int f298640h;

    /* renamed from: i */
    public C51018qv3 f298641i;

    /* renamed from: j */
    public int f298642j;

    /* renamed from: n */
    public int f298643n;

    /* renamed from: o */
    public int f298644o;

    /* renamed from: p */
    public int f298645p;

    /* renamed from: q */
    public int f298646q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof kn4)) {
            return false;
        }
        kn4 kn4 = (kn4) aVar;
        return C46238a.m51546a(this.BaseRequest, kn4.BaseRequest) && C46238a.m51546a(this.f298636d, kn4.f298636d) && C46238a.m51546a(this.f298637e, kn4.f298637e) && C46238a.m51546a(Integer.valueOf(this.f298638f), Integer.valueOf(kn4.f298638f)) && C46238a.m51546a(Integer.valueOf(this.f298639g), Integer.valueOf(kn4.f298639g)) && C46238a.m51546a(Integer.valueOf(this.f298640h), Integer.valueOf(kn4.f298640h)) && C46238a.m51546a(this.f298641i, kn4.f298641i) && C46238a.m51546a(Integer.valueOf(this.f298642j), Integer.valueOf(kn4.f298642j)) && C46238a.m51546a(Integer.valueOf(this.f298643n), Integer.valueOf(kn4.f298643n)) && C46238a.m51546a(Integer.valueOf(this.f298644o), Integer.valueOf(kn4.f298644o)) && C46238a.m51546a(Integer.valueOf(this.f298645p), Integer.valueOf(kn4.f298645p)) && C46238a.m51546a(Integer.valueOf(this.f298646q), Integer.valueOf(kn4.f298646q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f298636d == null) {
                throw new C52419b("Not all required fields were included: ClientMediaId");
            } else if (this.f298637e == null) {
                throw new C52419b("Not all required fields were included: DataMD5");
            } else if (this.f298641i != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f298636d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f298636d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f298637e;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f298637e.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f298638f);
                aVar.mo74318e(5, this.f298639g);
                aVar.mo74318e(6, this.f298640h);
                C51018qv3 qv32 = this.f298641i;
                if (qv32 != null) {
                    aVar.mo74322i(7, qv32.computeSize());
                    this.f298641i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f298642j);
                aVar.mo74318e(9, this.f298643n);
                aVar.mo74318e(10, this.f298644o);
                aVar.mo74318e(11, this.f298645p);
                aVar.mo74318e(12, this.f298646q);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C51163rv3 rv34 = this.f298636d;
            if (rv34 != null) {
                i3 += C52418a.m58682i(2, rv34.computeSize());
            }
            C51163rv3 rv35 = this.f298637e;
            if (rv35 != null) {
                i3 += C52418a.m58682i(3, rv35.computeSize());
            }
            int e = i3 + C52418a.m58678e(4, this.f298638f) + C52418a.m58678e(5, this.f298639g) + C52418a.m58678e(6, this.f298640h);
            C51018qv3 qv33 = this.f298641i;
            if (qv33 != null) {
                e += C52418a.m58682i(7, qv33.computeSize());
            }
            return e + C52418a.m58678e(8, this.f298642j) + C52418a.m58678e(9, this.f298643n) + C52418a.m58678e(10, this.f298644o) + C52418a.m58678e(11, this.f298645p) + C52418a.m58678e(12, this.f298646q);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298636d == null) {
                throw new C52419b("Not all required fields were included: ClientMediaId");
            } else if (this.f298637e == null) {
                throw new C52419b("Not all required fields were included: DataMD5");
            } else if (this.f298641i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            kn4 kn4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        kn4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv36.mo73356d(bArr2);
                        }
                        kn4.f298636d = rv36;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv37.mo73356d(bArr3);
                        }
                        kn4.f298637e = rv37;
                    }
                    return 0;
                case 4:
                    kn4.f298638f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kn4.f298639g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kn4.f298640h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv34.mo73348f(bArr4);
                        }
                        kn4.f298641i = qv34;
                    }
                    return 0;
                case 8:
                    kn4.f298642j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    kn4.f298643n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    kn4.f298644o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    kn4.f298645p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    kn4.f298646q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
