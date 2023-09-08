package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uw2 */
public class C51607uw2 extends C49335eu3 {

    /* renamed from: d */
    public int f143161d;

    /* renamed from: e */
    public String f143162e;

    /* renamed from: f */
    public String f143163f;

    /* renamed from: g */
    public String f143164g;

    /* renamed from: h */
    public C49995ji2 f143165h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51607uw2)) {
            return false;
        }
        C51607uw2 uw22 = (C51607uw2) aVar;
        return C46238a.m51546a(this.BaseResponse, uw22.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f143161d), Integer.valueOf(uw22.f143161d)) && C46238a.m51546a(this.f143162e, uw22.f143162e) && C46238a.m51546a(this.f143163f, uw22.f143163f) && C46238a.m51546a(this.f143164g, uw22.f143164g) && C46238a.m51546a(this.f143165h, uw22.f143165h);
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
                aVar.mo74318e(2, this.f143161d);
                String str = this.f143162e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f143163f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f143164g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                C49995ji2 ji22 = this.f143165h;
                if (ji22 != null) {
                    aVar.mo74322i(6, ji22.computeSize());
                    this.f143165h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143161d);
            String str4 = this.f143162e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f143163f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f143164g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            C49995ji2 ji23 = this.f143165h;
            return ji23 != null ? e + C52418a.m58682i(6, ji23.computeSize()) : e;
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
            C51607uw2 uw22 = objArr[1];
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
                        uw22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    uw22.f143161d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    uw22.f143162e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uw22.f143163f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uw22.f143164g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49995ji2 ji24 = new C49995ji2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ji24.parseFrom(bArr2);
                        }
                        uw22.f143165h = ji24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
