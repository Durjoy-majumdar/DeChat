package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rt3 */
public class C51156rt3 extends C49335eu3 {

    /* renamed from: d */
    public String f141140d;

    /* renamed from: e */
    public String f141141e;

    /* renamed from: f */
    public int f141142f;

    /* renamed from: g */
    public int f141143g;

    /* renamed from: h */
    public int f141144h;

    /* renamed from: i */
    public String f141145i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51156rt3)) {
            return false;
        }
        C51156rt3 rt32 = (C51156rt3) aVar;
        return C46238a.m51546a(this.BaseResponse, rt32.BaseResponse) && C46238a.m51546a(this.f141140d, rt32.f141140d) && C46238a.m51546a(this.f141141e, rt32.f141141e) && C46238a.m51546a(Integer.valueOf(this.f141142f), Integer.valueOf(rt32.f141142f)) && C46238a.m51546a(Integer.valueOf(this.f141143g), Integer.valueOf(rt32.f141143g)) && C46238a.m51546a(Integer.valueOf(this.f141144h), Integer.valueOf(rt32.f141144h)) && C46238a.m51546a(this.f141145i, rt32.f141145i);
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
                String str = this.f141140d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f141141e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f141142f);
                aVar.mo74318e(5, this.f141143g);
                aVar.mo74318e(6, this.f141144h);
                String str3 = this.f141145i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f141140d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f141141e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f141142f) + C52418a.m58678e(5, this.f141143g) + C52418a.m58678e(6, this.f141144h);
            String str6 = this.f141145i;
            return str6 != null ? e + C52418a.m58683j(7, str6) : e;
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
            C51156rt3 rt32 = objArr[1];
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
                        rt32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    rt32.f141140d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rt32.f141141e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rt32.f141142f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rt32.f141143g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rt32.f141144h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rt32.f141145i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
