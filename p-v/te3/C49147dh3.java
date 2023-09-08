package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dh3 */
public class C49147dh3 extends C49335eu3 {

    /* renamed from: d */
    public String f132328d;

    /* renamed from: e */
    public String f132329e;

    /* renamed from: f */
    public String f132330f;

    /* renamed from: g */
    public String f132331g;

    /* renamed from: h */
    public C51018qv3 f132332h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49147dh3)) {
            return false;
        }
        C49147dh3 dh32 = (C49147dh3) aVar;
        return C46238a.m51546a(this.BaseResponse, dh32.BaseResponse) && C46238a.m51546a(this.f132328d, dh32.f132328d) && C46238a.m51546a(this.f132329e, dh32.f132329e) && C46238a.m51546a(this.f132330f, dh32.f132330f) && C46238a.m51546a(this.f132331g, dh32.f132331g) && C46238a.m51546a(this.f132332h, dh32.f132332h);
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
                String str = this.f132328d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f132329e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f132330f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f132331g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                C51018qv3 qv32 = this.f132332h;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f132332h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f132328d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f132329e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f132330f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f132331g;
            if (str8 != null) {
                i2 += C52418a.m58683j(5, str8);
            }
            C51018qv3 qv33 = this.f132332h;
            return qv33 != null ? i2 + C52418a.m58682i(6, qv33.computeSize()) : i2;
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
            C49147dh3 dh32 = objArr[1];
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
                        dh32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    dh32.f132328d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dh32.f132329e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dh32.f132330f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dh32.f132331g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        dh32.f132332h = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
