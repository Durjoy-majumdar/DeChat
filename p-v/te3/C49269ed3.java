package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ed3 */
public class C49269ed3 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f132874d;

    /* renamed from: e */
    public int f132875e;

    /* renamed from: f */
    public String f132876f;

    /* renamed from: g */
    public int f132877g;

    /* renamed from: h */
    public int f132878h;

    /* renamed from: i */
    public String f132879i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49269ed3)) {
            return false;
        }
        C49269ed3 ed32 = (C49269ed3) aVar;
        return C46238a.m51546a(this.BaseResponse, ed32.BaseResponse) && C46238a.m51546a(this.f132874d, ed32.f132874d) && C46238a.m51546a(Integer.valueOf(this.f132875e), Integer.valueOf(ed32.f132875e)) && C46238a.m51546a(this.f132876f, ed32.f132876f) && C46238a.m51546a(Integer.valueOf(this.f132877g), Integer.valueOf(ed32.f132877g)) && C46238a.m51546a(Integer.valueOf(this.f132878h), Integer.valueOf(ed32.f132878h)) && C46238a.m51546a(this.f132879i, ed32.f132879i);
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
                C51018qv3 qv32 = this.f132874d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f132874d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f132875e);
                String str = this.f132876f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f132877g);
                aVar.mo74318e(6, this.f132878h);
                String str2 = this.f132879i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f132874d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f132875e);
            String str3 = this.f132876f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f132877g) + C52418a.m58678e(6, this.f132878h);
            String str4 = this.f132879i;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
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
            C49269ed3 ed32 = objArr[1];
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
                        ed32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        ed32.f132874d = qv34;
                    }
                    return 0;
                case 3:
                    ed32.f132875e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ed32.f132876f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ed32.f132877g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ed32.f132878h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ed32.f132879i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
