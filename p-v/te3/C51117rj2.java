package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rj2 */
public class C51117rj2 extends C49335eu3 {

    /* renamed from: d */
    public String f140943d;

    /* renamed from: e */
    public String f140944e;

    /* renamed from: f */
    public String f140945f;

    /* renamed from: g */
    public String f140946g;

    /* renamed from: h */
    public String f140947h;

    /* renamed from: i */
    public String f140948i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51117rj2)) {
            return false;
        }
        C51117rj2 rj22 = (C51117rj2) aVar;
        return C46238a.m51546a(this.BaseResponse, rj22.BaseResponse) && C46238a.m51546a(this.f140943d, rj22.f140943d) && C46238a.m51546a(this.f140944e, rj22.f140944e) && C46238a.m51546a(this.f140945f, rj22.f140945f) && C46238a.m51546a(this.f140946g, rj22.f140946g) && C46238a.m51546a(this.f140947h, rj22.f140947h) && C46238a.m51546a(this.f140948i, rj22.f140948i);
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
                String str = this.f140943d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f140944e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f140945f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f140946g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f140947h;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                String str6 = this.f140948i;
                if (str6 != null) {
                    aVar.mo74323j(7, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str7 = this.f140943d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f140944e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f140945f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f140946g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f140947h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f140948i;
            return str12 != null ? i2 + C52418a.m58683j(7, str12) : i2;
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
            C51117rj2 rj22 = objArr[1];
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
                        rj22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    rj22.f140943d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rj22.f140944e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rj22.f140945f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rj22.f140946g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rj22.f140947h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rj22.f140948i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
