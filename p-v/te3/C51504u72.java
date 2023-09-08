package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u72 */
public class C51504u72 extends C49335eu3 {

    /* renamed from: d */
    public boolean f142648d = false;

    /* renamed from: e */
    public String f142649e;

    /* renamed from: f */
    public String f142650f;

    /* renamed from: g */
    public String f142651g;

    /* renamed from: h */
    public String f142652h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51504u72)) {
            return false;
        }
        C51504u72 u722 = (C51504u72) aVar;
        return C46238a.m51546a(this.BaseResponse, u722.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f142648d), Boolean.valueOf(u722.f142648d)) && C46238a.m51546a(this.f142649e, u722.f142649e) && C46238a.m51546a(this.f142650f, u722.f142650f) && C46238a.m51546a(this.f142651g, u722.f142651g) && C46238a.m51546a(this.f142652h, u722.f142652h);
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
                aVar.mo74314a(2, this.f142648d);
                String str = this.f142649e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f142650f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f142651g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f142652h;
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
            int a = i2 + C52418a.m58674a(2, this.f142648d);
            String str5 = this.f142649e;
            if (str5 != null) {
                a += C52418a.m58683j(3, str5);
            }
            String str6 = this.f142650f;
            if (str6 != null) {
                a += C52418a.m58683j(4, str6);
            }
            String str7 = this.f142651g;
            if (str7 != null) {
                a += C52418a.m58683j(5, str7);
            }
            String str8 = this.f142652h;
            return str8 != null ? a + C52418a.m58683j(6, str8) : a;
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
            C51504u72 u722 = objArr[1];
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
                        u722.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    u722.f142648d = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    u722.f142649e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u722.f142650f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    u722.f142651g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    u722.f142652h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
