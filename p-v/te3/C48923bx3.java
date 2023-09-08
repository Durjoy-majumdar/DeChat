package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bx3 */
public class C48923bx3 extends C49335eu3 {

    /* renamed from: d */
    public String f131374d;

    /* renamed from: e */
    public String f131375e;

    /* renamed from: f */
    public String f131376f;

    /* renamed from: g */
    public String f131377g;

    /* renamed from: h */
    public C89349b f131378h;

    /* renamed from: i */
    public boolean f131379i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48923bx3)) {
            return false;
        }
        C48923bx3 bx32 = (C48923bx3) aVar;
        return C46238a.m51546a(this.BaseResponse, bx32.BaseResponse) && C46238a.m51546a(this.f131374d, bx32.f131374d) && C46238a.m51546a(this.f131375e, bx32.f131375e) && C46238a.m51546a(this.f131376f, bx32.f131376f) && C46238a.m51546a(this.f131377g, bx32.f131377g) && C46238a.m51546a(this.f131378h, bx32.f131378h) && C46238a.m51546a(Boolean.valueOf(this.f131379i), Boolean.valueOf(bx32.f131379i));
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
                String str = this.f131374d;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f131375e;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f131376f;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f131377g;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                C89349b bVar = this.f131378h;
                if (bVar != null) {
                    aVar.mo74315b(7, bVar);
                }
                aVar.mo74314a(8, this.f131379i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str5 = this.f131374d;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f131375e;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            String str7 = this.f131376f;
            if (str7 != null) {
                i2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f131377g;
            if (str8 != null) {
                i2 += C52418a.m58683j(6, str8);
            }
            C89349b bVar2 = this.f131378h;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(7, bVar2);
            }
            return i2 + C52418a.m58674a(8, this.f131379i);
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
            C48923bx3 bx32 = objArr[1];
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
                        bx32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 3:
                    bx32.f131374d = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bx32.f131375e = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bx32.f131376f = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bx32.f131377g = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bx32.f131378h = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    bx32.f131379i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
