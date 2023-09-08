package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rb0 */
public class C51083rb0 extends C49335eu3 {

    /* renamed from: d */
    public int f140797d;

    /* renamed from: e */
    public String f140798e;

    /* renamed from: f */
    public String f140799f;

    /* renamed from: g */
    public String f140800g;

    /* renamed from: h */
    public int f140801h;

    /* renamed from: i */
    public String f140802i;

    /* renamed from: j */
    public String f140803j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51083rb0)) {
            return false;
        }
        C51083rb0 rb02 = (C51083rb0) aVar;
        return C46238a.m51546a(this.BaseResponse, rb02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f140797d), Integer.valueOf(rb02.f140797d)) && C46238a.m51546a(this.f140798e, rb02.f140798e) && C46238a.m51546a(this.f140799f, rb02.f140799f) && C46238a.m51546a(this.f140800g, rb02.f140800g) && C46238a.m51546a(Integer.valueOf(this.f140801h), Integer.valueOf(rb02.f140801h)) && C46238a.m51546a(this.f140802i, rb02.f140802i) && C46238a.m51546a(this.f140803j, rb02.f140803j);
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
                aVar.mo74318e(2, this.f140797d);
                String str = this.f140798e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f140799f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f140800g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f140801h);
                String str4 = this.f140802i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f140803j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140797d);
            String str6 = this.f140798e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f140799f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f140800g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            int e2 = e + C52418a.m58678e(6, this.f140801h);
            String str9 = this.f140802i;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f140803j;
            return str10 != null ? e2 + C52418a.m58683j(8, str10) : e2;
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
            C51083rb0 rb02 = objArr[1];
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
                        rb02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    rb02.f140797d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    rb02.f140798e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rb02.f140799f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rb02.f140800g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rb02.f140801h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rb02.f140802i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rb02.f140803j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
