package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mt3 */
public class C50449mt3 extends C49335eu3 {

    /* renamed from: d */
    public int f138201d;

    /* renamed from: e */
    public String f138202e;

    /* renamed from: f */
    public String f138203f;

    /* renamed from: g */
    public String f138204g;

    /* renamed from: h */
    public String f138205h;

    /* renamed from: i */
    public long f138206i;

    /* renamed from: j */
    public String f138207j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50449mt3)) {
            return false;
        }
        C50449mt3 mt32 = (C50449mt3) aVar;
        return C46238a.m51546a(this.BaseResponse, mt32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138201d), Integer.valueOf(mt32.f138201d)) && C46238a.m51546a(this.f138202e, mt32.f138202e) && C46238a.m51546a(this.f138203f, mt32.f138203f) && C46238a.m51546a(this.f138204g, mt32.f138204g) && C46238a.m51546a(this.f138205h, mt32.f138205h) && C46238a.m51546a(Long.valueOf(this.f138206i), Long.valueOf(mt32.f138206i)) && C46238a.m51546a(this.f138207j, mt32.f138207j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f138201d);
            String str = this.f138202e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f138203f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f138204g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f138205h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74321h(7, this.f138206i);
            String str5 = this.f138207j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138201d);
            String str6 = this.f138202e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f138203f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f138204g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f138205h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            int h = e + C52418a.m58681h(7, this.f138206i);
            String str10 = this.f138207j;
            return str10 != null ? h + C52418a.m58683j(8, str10) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50449mt3 mt32 = objArr[1];
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
                        mt32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    mt32.f138201d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mt32.f138202e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mt32.f138203f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mt32.f138204g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mt32.f138205h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mt32.f138206i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    mt32.f138207j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
