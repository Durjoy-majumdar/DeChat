package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zp3 */
public class C78024zp3 extends C47465a {

    /* renamed from: d */
    public int f228746d;

    /* renamed from: e */
    public String f228747e;

    /* renamed from: f */
    public String f228748f;

    /* renamed from: g */
    public String f228749g;

    /* renamed from: h */
    public String f228750h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78024zp3)) {
            return false;
        }
        C78024zp3 zp32 = (C78024zp3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f228746d), Integer.valueOf(zp32.f228746d)) && C46238a.m51546a(this.f228747e, zp32.f228747e) && C46238a.m51546a(this.f228748f, zp32.f228748f) && C46238a.m51546a(this.f228749g, zp32.f228749g) && C46238a.m51546a(this.f228750h, zp32.f228750h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f228746d);
            String str = this.f228747e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f228748f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f228749g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f228750h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f228746d) + 0;
            String str5 = this.f228747e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f228748f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f228749g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f228750h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C78024zp3 zp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zp32.f228746d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                zp32.f228747e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zp32.f228748f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                zp32.f228749g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zp32.f228750h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
