package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uc2 */
public class C51526uc2 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<e35> f142739d = new LinkedList<>();

    /* renamed from: e */
    public String f142740e;

    /* renamed from: f */
    public int f142741f;

    /* renamed from: g */
    public int f142742g;

    /* renamed from: h */
    public c35 f142743h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51526uc2)) {
            return false;
        }
        C51526uc2 uc22 = (C51526uc2) aVar;
        return C46238a.m51546a(this.BaseResponse, uc22.BaseResponse) && C46238a.m51546a(this.f142739d, uc22.f142739d) && C46238a.m51546a(this.f142740e, uc22.f142740e) && C46238a.m51546a(Integer.valueOf(this.f142741f), Integer.valueOf(uc22.f142741f)) && C46238a.m51546a(Integer.valueOf(this.f142742g), Integer.valueOf(uc22.f142742g)) && C46238a.m51546a(this.f142743h, uc22.f142743h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f142739d);
                String str = this.f142740e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f142741f);
                aVar.mo74318e(5, this.f142742g);
                c35 c35 = this.f142743h;
                if (c35 != null) {
                    aVar.mo74322i(6, c35.computeSize());
                    this.f142743h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f142739d);
            String str2 = this.f142740e;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            int e = g + C52418a.m58678e(4, this.f142741f) + C52418a.m58678e(5, this.f142742g);
            c35 c352 = this.f142743h;
            return c352 != null ? e + C52418a.m58682i(6, c352.computeSize()) : e;
        } else if (i == 2) {
            this.f142739d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51526uc2 uc22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        uc22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        e35 e35 = new e35();
                        if (bArr2 != null && bArr2.length > 0) {
                            e35.parseFrom(bArr2);
                        }
                        uc22.f142739d.add(e35);
                    }
                    return 0;
                case 3:
                    uc22.f142740e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uc22.f142741f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    uc22.f142742g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        c35 c353 = new c35();
                        if (bArr3 != null && bArr3.length > 0) {
                            c353.parseFrom(bArr3);
                        }
                        uc22.f142743h = c353;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
