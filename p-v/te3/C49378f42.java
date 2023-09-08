package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f42 */
public class C49378f42 extends C101820nt3 {

    /* renamed from: d */
    public int f133283d;

    /* renamed from: e */
    public C51163rv3 f133284e;

    /* renamed from: f */
    public C51163rv3 f133285f;

    /* renamed from: g */
    public int f133286g;

    /* renamed from: h */
    public int f133287h;

    /* renamed from: i */
    public int f133288i;

    /* renamed from: j */
    public int f133289j;

    /* renamed from: n */
    public long f133290n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49378f42)) {
            return false;
        }
        C49378f42 f422 = (C49378f42) aVar;
        return C46238a.m51546a(this.BaseRequest, f422.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f133283d), Integer.valueOf(f422.f133283d)) && C46238a.m51546a(this.f133284e, f422.f133284e) && C46238a.m51546a(this.f133285f, f422.f133285f) && C46238a.m51546a(Integer.valueOf(this.f133286g), Integer.valueOf(f422.f133286g)) && C46238a.m51546a(Integer.valueOf(this.f133287h), Integer.valueOf(f422.f133287h)) && C46238a.m51546a(Integer.valueOf(this.f133288i), Integer.valueOf(f422.f133288i)) && C46238a.m51546a(Integer.valueOf(this.f133289j), Integer.valueOf(f422.f133289j)) && C46238a.m51546a(Long.valueOf(this.f133290n), Long.valueOf(f422.f133290n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133284e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f133285f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f133283d);
                C51163rv3 rv32 = this.f133284e;
                if (rv32 != null) {
                    aVar.mo74322i(3, rv32.computeSize());
                    this.f133284e.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f133285f;
                if (rv33 != null) {
                    aVar.mo74322i(4, rv33.computeSize());
                    this.f133285f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f133286g);
                aVar.mo74318e(6, this.f133287h);
                aVar.mo74318e(7, this.f133288i);
                aVar.mo74318e(8, this.f133289j);
                aVar.mo74321h(9, this.f133290n);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ToUserName");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133283d);
            C51163rv3 rv34 = this.f133284e;
            if (rv34 != null) {
                e += C52418a.m58682i(3, rv34.computeSize());
            }
            C51163rv3 rv35 = this.f133285f;
            if (rv35 != null) {
                e += C52418a.m58682i(4, rv35.computeSize());
            }
            return e + C52418a.m58678e(5, this.f133286g) + C52418a.m58678e(6, this.f133287h) + C52418a.m58678e(7, this.f133288i) + C52418a.m58678e(8, this.f133289j) + C52418a.m58681h(9, this.f133290n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133284e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f133285f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ToUserName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49378f42 f422 = objArr[1];
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
                        f422.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    f422.f133283d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv36.mo73356d(bArr2);
                        }
                        f422.f133284e = rv36;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv37.mo73356d(bArr3);
                        }
                        f422.f133285f = rv37;
                    }
                    return 0;
                case 5:
                    f422.f133286g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    f422.f133287h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    f422.f133288i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    f422.f133289j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    f422.f133290n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
