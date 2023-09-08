package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vm3 */
public class C64779vm3 extends C49335eu3 {

    /* renamed from: d */
    public C64712sm3 f185958d;

    /* renamed from: e */
    public int f185959e;

    /* renamed from: f */
    public String f185960f;

    /* renamed from: g */
    public int f185961g;

    /* renamed from: h */
    public String f185962h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64779vm3)) {
            return false;
        }
        C64779vm3 vm32 = (C64779vm3) aVar;
        return C46238a.m51546a(this.f185958d, vm32.f185958d) && C46238a.m51546a(Integer.valueOf(this.f185959e), Integer.valueOf(vm32.f185959e)) && C46238a.m51546a(this.BaseResponse, vm32.BaseResponse) && C46238a.m51546a(this.f185960f, vm32.f185960f) && C46238a.m51546a(Integer.valueOf(this.f185961g), Integer.valueOf(vm32.f185961g)) && C46238a.m51546a(this.f185962h, vm32.f185962h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64712sm3 sm32 = this.f185958d;
            if (sm32 == null) {
                throw new C52419b("Not all required fields were included: rcptinfolist");
            } else if (this.BaseResponse != null) {
                if (sm32 != null) {
                    aVar.mo74322i(1, sm32.computeSize());
                    this.f185958d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f185959e);
                C49966ja jaVar = this.BaseResponse;
                if (jaVar != null) {
                    aVar.mo74322i(3, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f185960f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f185961g);
                String str2 = this.f185962h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BaseResponse");
            }
        } else if (i == 1) {
            C64712sm3 sm33 = this.f185958d;
            if (sm33 != null) {
                i2 = 0 + C52418a.m58682i(1, sm33.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185959e);
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                e += C52418a.m58682i(3, jaVar2.computeSize());
            }
            String str3 = this.f185960f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f185961g);
            String str4 = this.f185962h;
            return str4 != null ? e2 + C52418a.m58683j(6, str4) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185958d == null) {
                throw new C52419b("Not all required fields were included: rcptinfolist");
            } else if (this.BaseResponse != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BaseResponse");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64779vm3 vm32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64712sm3 sm34 = new C64712sm3();
                        if (bArr != null && bArr.length > 0) {
                            sm34.parseFrom(bArr);
                        }
                        vm32.f185958d = sm34;
                    }
                    return 0;
                case 2:
                    vm32.f185959e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr2 != null && bArr2.length > 0) {
                            jaVar3.parseFrom(bArr2);
                        }
                        vm32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 4:
                    vm32.f185960f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vm32.f185961g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vm32.f185962h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
