package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p34 */
public class C50777p34 extends C49335eu3 {

    /* renamed from: d */
    public int f139556d;

    /* renamed from: e */
    public LinkedList<C50491n34> f139557e = new LinkedList<>();

    /* renamed from: f */
    public String f139558f;

    /* renamed from: g */
    public int f139559g;

    /* renamed from: h */
    public int f139560h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50777p34)) {
            return false;
        }
        C50777p34 p342 = (C50777p34) aVar;
        return C46238a.m51546a(this.BaseResponse, p342.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139556d), Integer.valueOf(p342.f139556d)) && C46238a.m51546a(this.f139557e, p342.f139557e) && C46238a.m51546a(this.f139558f, p342.f139558f) && C46238a.m51546a(Integer.valueOf(this.f139559g), Integer.valueOf(p342.f139559g)) && C46238a.m51546a(Integer.valueOf(this.f139560h), Integer.valueOf(p342.f139560h));
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
                aVar.mo74318e(2, this.f139556d);
                aVar.mo74320g(3, 8, this.f139557e);
                String str = this.f139558f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f139559g);
                aVar.mo74318e(6, this.f139560h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139556d) + C52418a.m58680g(3, 8, this.f139557e);
            String str2 = this.f139558f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f139559g) + C52418a.m58678e(6, this.f139560h);
        } else if (i == 2) {
            this.f139557e.clear();
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
            C50777p34 p342 = objArr[1];
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
                        p342.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    p342.f139556d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50491n34 n342 = new C50491n34();
                        if (bArr2 != null && bArr2.length > 0) {
                            n342.parseFrom(bArr2);
                        }
                        p342.f139557e.add(n342);
                    }
                    return 0;
                case 4:
                    p342.f139558f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    p342.f139559g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    p342.f139560h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
