package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g42 */
public class C49514g42 extends C49335eu3 {

    /* renamed from: d */
    public int f133840d;

    /* renamed from: e */
    public C51163rv3 f133841e;

    /* renamed from: f */
    public C51163rv3 f133842f;

    /* renamed from: g */
    public int f133843g;

    /* renamed from: h */
    public int f133844h;

    /* renamed from: i */
    public int f133845i;

    /* renamed from: j */
    public C51018qv3 f133846j;

    /* renamed from: n */
    public long f133847n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49514g42)) {
            return false;
        }
        C49514g42 g422 = (C49514g42) aVar;
        return C46238a.m51546a(this.BaseResponse, g422.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133840d), Integer.valueOf(g422.f133840d)) && C46238a.m51546a(this.f133841e, g422.f133841e) && C46238a.m51546a(this.f133842f, g422.f133842f) && C46238a.m51546a(Integer.valueOf(this.f133843g), Integer.valueOf(g422.f133843g)) && C46238a.m51546a(Integer.valueOf(this.f133844h), Integer.valueOf(g422.f133844h)) && C46238a.m51546a(Integer.valueOf(this.f133845i), Integer.valueOf(g422.f133845i)) && C46238a.m51546a(this.f133846j, g422.f133846j) && C46238a.m51546a(Long.valueOf(this.f133847n), Long.valueOf(g422.f133847n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f133841e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f133842f == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f133846j != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f133840d);
                C51163rv3 rv32 = this.f133841e;
                if (rv32 != null) {
                    aVar.mo74322i(3, rv32.computeSize());
                    this.f133841e.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f133842f;
                if (rv33 != null) {
                    aVar.mo74322i(4, rv33.computeSize());
                    this.f133842f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f133843g);
                aVar.mo74318e(6, this.f133844h);
                aVar.mo74318e(7, this.f133845i);
                C51018qv3 qv32 = this.f133846j;
                if (qv32 != null) {
                    aVar.mo74322i(8, qv32.computeSize());
                    this.f133846j.writeFields(aVar);
                }
                aVar.mo74321h(9, this.f133847n);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? C52418a.m58682i(1, jaVar2.computeSize()) + 0 : 0) + C52418a.m58678e(2, this.f133840d);
            C51163rv3 rv34 = this.f133841e;
            if (rv34 != null) {
                i3 += C52418a.m58682i(3, rv34.computeSize());
            }
            C51163rv3 rv35 = this.f133842f;
            if (rv35 != null) {
                i3 += C52418a.m58682i(4, rv35.computeSize());
            }
            int e = i3 + C52418a.m58678e(5, this.f133843g) + C52418a.m58678e(6, this.f133844h) + C52418a.m58678e(7, this.f133845i);
            C51018qv3 qv33 = this.f133846j;
            if (qv33 != null) {
                e += C52418a.m58682i(8, qv33.computeSize());
            }
            return e + C52418a.m58681h(9, this.f133847n);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f133841e == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f133842f == null) {
                throw new C52419b("Not all required fields were included: ToUserName");
            } else if (this.f133846j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49514g42 g422 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        g422.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    g422.f133840d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv36.mo73356d(bArr2);
                        }
                        g422.f133841e = rv36;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv37.mo73356d(bArr3);
                        }
                        g422.f133842f = rv37;
                    }
                    return 0;
                case 5:
                    g422.f133843g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    g422.f133844h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    g422.f133845i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv34.mo73348f(bArr4);
                        }
                        g422.f133846j = qv34;
                    }
                    return 0;
                case 9:
                    g422.f133847n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
