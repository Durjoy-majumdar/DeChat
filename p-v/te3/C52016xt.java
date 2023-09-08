package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xt */
public class C52016xt extends C49335eu3 {

    /* renamed from: d */
    public int f144930d;

    /* renamed from: e */
    public String f144931e;

    /* renamed from: f */
    public C51823we2 f144932f;

    /* renamed from: g */
    public LinkedList<C51687ve2> f144933g = new LinkedList<>();

    /* renamed from: h */
    public String f144934h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52016xt)) {
            return false;
        }
        C52016xt xtVar = (C52016xt) aVar;
        return C46238a.m51546a(this.BaseResponse, xtVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f144930d), Integer.valueOf(xtVar.f144930d)) && C46238a.m51546a(this.f144931e, xtVar.f144931e) && C46238a.m51546a(this.f144932f, xtVar.f144932f) && C46238a.m51546a(this.f144933g, xtVar.f144933g) && C46238a.m51546a(this.f144934h, xtVar.f144934h);
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
                aVar.mo74318e(2, this.f144930d);
                String str = this.f144931e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51823we2 we22 = this.f144932f;
                if (we22 != null) {
                    aVar.mo74322i(4, we22.computeSize());
                    this.f144932f.writeFields(aVar);
                }
                aVar.mo74320g(5, 8, this.f144933g);
                String str2 = this.f144934h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f144930d);
            String str3 = this.f144931e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            C51823we2 we23 = this.f144932f;
            if (we23 != null) {
                e += C52418a.m58682i(4, we23.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f144933g);
            String str4 = this.f144934h;
            return str4 != null ? g + C52418a.m58683j(6, str4) : g;
        } else if (i == 2) {
            this.f144933g.clear();
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
            C52016xt xtVar = objArr[1];
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
                        xtVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    xtVar.f144930d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    xtVar.f144931e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51823we2 we24 = new C51823we2();
                        if (bArr2 != null && bArr2.length > 0) {
                            we24.parseFrom(bArr2);
                        }
                        xtVar.f144932f = we24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51687ve2 ve22 = new C51687ve2();
                        if (bArr3 != null && bArr3.length > 0) {
                            ve22.parseFrom(bArr3);
                        }
                        xtVar.f144933g.add(ve22);
                    }
                    return 0;
                case 6:
                    xtVar.f144934h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
