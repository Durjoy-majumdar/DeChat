package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class e64 extends C101820nt3 {

    /* renamed from: d */
    public n64 f132736d;

    /* renamed from: e */
    public String f132737e;

    /* renamed from: f */
    public C51163rv3 f132738f;

    /* renamed from: g */
    public int f132739g;

    /* renamed from: h */
    public C51163rv3 f132740h;

    /* renamed from: i */
    public int f132741i;

    /* renamed from: j */
    public int f132742j;

    /* renamed from: n */
    public int f132743n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e64)) {
            return false;
        }
        e64 e64 = (e64) aVar;
        return C46238a.m51546a(this.BaseRequest, e64.BaseRequest) && C46238a.m51546a(this.f132736d, e64.f132736d) && C46238a.m51546a(this.f132737e, e64.f132737e) && C46238a.m51546a(this.f132738f, e64.f132738f) && C46238a.m51546a(Integer.valueOf(this.f132739g), Integer.valueOf(e64.f132739g)) && C46238a.m51546a(this.f132740h, e64.f132740h) && C46238a.m51546a(Integer.valueOf(this.f132741i), Integer.valueOf(e64.f132741i)) && C46238a.m51546a(Integer.valueOf(this.f132742j), Integer.valueOf(e64.f132742j)) && C46238a.m51546a(Integer.valueOf(this.f132743n), Integer.valueOf(e64.f132743n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132736d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                n64 n64 = this.f132736d;
                if (n64 != null) {
                    aVar.mo74322i(2, n64.computeSize());
                    this.f132736d.writeFields(aVar);
                }
                String str = this.f132737e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51163rv3 rv32 = this.f132738f;
                if (rv32 != null) {
                    aVar.mo74322i(4, rv32.computeSize());
                    this.f132738f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f132739g);
                C51163rv3 rv33 = this.f132740h;
                if (rv33 != null) {
                    aVar.mo74322i(6, rv33.computeSize());
                    this.f132740h.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f132741i);
                aVar.mo74318e(8, this.f132742j);
                aVar.mo74318e(9, this.f132743n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Action");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            n64 n642 = this.f132736d;
            if (n642 != null) {
                i2 += C52418a.m58682i(2, n642.computeSize());
            }
            String str2 = this.f132737e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C51163rv3 rv34 = this.f132738f;
            if (rv34 != null) {
                i2 += C52418a.m58682i(4, rv34.computeSize());
            }
            int e = i2 + C52418a.m58678e(5, this.f132739g);
            C51163rv3 rv35 = this.f132740h;
            if (rv35 != null) {
                e += C52418a.m58682i(6, rv35.computeSize());
            }
            return e + C52418a.m58678e(7, this.f132741i) + C52418a.m58678e(8, this.f132742j) + C52418a.m58678e(9, this.f132743n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132736d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Action");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            e64 e64 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        e64.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        n64 n643 = new n64();
                        if (bArr2 != null && bArr2.length > 0) {
                            n643.parseFrom(bArr2);
                        }
                        e64.f132736d = n643;
                    }
                    return 0;
                case 3:
                    e64.f132737e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv36.mo73356d(bArr3);
                        }
                        e64.f132738f = rv36;
                    }
                    return 0;
                case 5:
                    e64.f132739g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv37.mo73356d(bArr4);
                        }
                        e64.f132740h = rv37;
                    }
                    return 0;
                case 7:
                    e64.f132741i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    e64.f132742j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    e64.f132743n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
