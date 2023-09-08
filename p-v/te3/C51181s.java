package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s */
public class C51181s extends C49335eu3 {

    /* renamed from: d */
    public int f141236d = 268513600;

    /* renamed from: e */
    public String f141237e = "请求不成功，请稍候再试";

    /* renamed from: f */
    public String f141238f;

    /* renamed from: g */
    public String f141239g;

    /* renamed from: h */
    public String f141240h;

    /* renamed from: i */
    public String f141241i;

    /* renamed from: j */
    public C77903a f141242j;

    /* renamed from: n */
    public String f141243n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51181s)) {
            return false;
        }
        C51181s sVar = (C51181s) aVar;
        return C46238a.m51546a(this.BaseResponse, sVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141236d), Integer.valueOf(sVar.f141236d)) && C46238a.m51546a(this.f141237e, sVar.f141237e) && C46238a.m51546a(this.f141238f, sVar.f141238f) && C46238a.m51546a(this.f141239g, sVar.f141239g) && C46238a.m51546a(this.f141240h, sVar.f141240h) && C46238a.m51546a(this.f141241i, sVar.f141241i) && C46238a.m51546a(this.f141242j, sVar.f141242j) && C46238a.m51546a(this.f141243n, sVar.f141243n);
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
                aVar.mo74318e(2, this.f141236d);
                String str = this.f141237e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f141238f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f141239g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f141240h;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f141241i;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                C77903a aVar2 = this.f141242j;
                if (aVar2 != null) {
                    aVar.mo74322i(9, aVar2.computeSize());
                    this.f141242j.writeFields(aVar);
                }
                String str6 = this.f141243n;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141236d);
            String str7 = this.f141237e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f141238f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f141239g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f141240h;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            String str11 = this.f141241i;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            C77903a aVar3 = this.f141242j;
            if (aVar3 != null) {
                e += C52418a.m58682i(9, aVar3.computeSize());
            }
            String str12 = this.f141243n;
            return str12 != null ? e + C52418a.m58683j(10, str12) : e;
        } else if (i == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C51181s sVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        sVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    sVar.f141236d = aVar5.mo141629g(intValue);
                    return 0;
                case 3:
                    sVar.f141237e = aVar5.mo141633k(intValue);
                    return 0;
                case 4:
                    sVar.f141238f = aVar5.mo141633k(intValue);
                    return 0;
                case 5:
                    sVar.f141239g = aVar5.mo141633k(intValue);
                    return 0;
                case 7:
                    sVar.f141240h = aVar5.mo141633k(intValue);
                    return 0;
                case 8:
                    sVar.f141241i = aVar5.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77903a aVar6 = new C77903a();
                        if (bArr2 != null && bArr2.length > 0) {
                            aVar6.parseFrom(bArr2);
                        }
                        sVar.f141242j = aVar6;
                    }
                    return 0;
                case 10:
                    sVar.f141243n = aVar5.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
