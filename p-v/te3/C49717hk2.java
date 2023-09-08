package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hk2 */
public class C49717hk2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f134699d;

    /* renamed from: e */
    public String f134700e;

    /* renamed from: f */
    public String f134701f;

    /* renamed from: g */
    public String f134702g;

    /* renamed from: h */
    public String f134703h;

    /* renamed from: i */
    public int f134704i;

    /* renamed from: j */
    public String f134705j;

    /* renamed from: n */
    public String f134706n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49717hk2)) {
            return false;
        }
        C49717hk2 hk22 = (C49717hk2) aVar;
        return C46238a.m51546a(this.BaseResponse, hk22.BaseResponse) && C46238a.m51546a(this.f134699d, hk22.f134699d) && C46238a.m51546a(this.f134700e, hk22.f134700e) && C46238a.m51546a(this.f134701f, hk22.f134701f) && C46238a.m51546a(this.f134702g, hk22.f134702g) && C46238a.m51546a(this.f134703h, hk22.f134703h) && C46238a.m51546a(Integer.valueOf(this.f134704i), Integer.valueOf(hk22.f134704i)) && C46238a.m51546a(this.f134705j, hk22.f134705j) && C46238a.m51546a(this.f134706n, hk22.f134706n);
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
                C49713hj2 hj22 = this.f134699d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f134699d.writeFields(aVar);
                }
                String str = this.f134700e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f134701f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f134702g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f134703h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74318e(7, this.f134704i);
                String str5 = this.f134705j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f134706n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49713hj2 hj23 = this.f134699d;
            if (hj23 != null) {
                i2 += C52418a.m58682i(2, hj23.computeSize());
            }
            String str7 = this.f134700e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f134701f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f134702g;
            if (str9 != null) {
                i2 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f134703h;
            if (str10 != null) {
                i2 += C52418a.m58683j(6, str10);
            }
            int e = i2 + C52418a.m58678e(7, this.f134704i);
            String str11 = this.f134705j;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            String str12 = this.f134706n;
            return str12 != null ? e + C52418a.m58683j(9, str12) : e;
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
            C49717hk2 hk22 = objArr[1];
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
                        hk22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49713hj2 hj24 = new C49713hj2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hj24.parseFrom(bArr2);
                        }
                        hk22.f134699d = hj24;
                    }
                    return 0;
                case 3:
                    hk22.f134700e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hk22.f134701f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hk22.f134702g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hk22.f134703h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hk22.f134704i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    hk22.f134705j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    hk22.f134706n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
