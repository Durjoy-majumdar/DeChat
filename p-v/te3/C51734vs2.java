package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vs2 */
public class C51734vs2 extends C49335eu3 {

    /* renamed from: d */
    public int f143677d;

    /* renamed from: e */
    public String f143678e;

    /* renamed from: f */
    public String f143679f;

    /* renamed from: g */
    public String f143680g;

    /* renamed from: h */
    public String f143681h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51734vs2)) {
            return false;
        }
        C51734vs2 vs22 = (C51734vs2) aVar;
        return C46238a.m51546a(this.BaseResponse, vs22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f143677d), Integer.valueOf(vs22.f143677d)) && C46238a.m51546a(this.f143678e, vs22.f143678e) && C46238a.m51546a(this.f143679f, vs22.f143679f) && C46238a.m51546a(this.f143680g, vs22.f143680g) && C46238a.m51546a(this.f143681h, vs22.f143681h);
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
                aVar.mo74318e(2, this.f143677d);
                String str = this.f143678e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f143679f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f143680g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f143681h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143677d);
            String str5 = this.f143678e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f143679f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f143680g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f143681h;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
        } else if (i == 2) {
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
            C51734vs2 vs22 = objArr[1];
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
                        vs22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    vs22.f143677d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vs22.f143678e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vs22.f143679f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vs22.f143680g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vs22.f143681h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
