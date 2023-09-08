package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ky3 */
public class C64504ky3 extends C47465a {

    /* renamed from: d */
    public String f183998d;

    /* renamed from: e */
    public int f183999e;

    /* renamed from: f */
    public int f184000f;

    /* renamed from: g */
    public String f184001g;

    /* renamed from: h */
    public String f184002h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64504ky3)) {
            return false;
        }
        C64504ky3 ky32 = (C64504ky3) aVar;
        return C46238a.m51546a(this.f183998d, ky32.f183998d) && C46238a.m51546a(Integer.valueOf(this.f183999e), Integer.valueOf(ky32.f183999e)) && C46238a.m51546a(Integer.valueOf(this.f184000f), Integer.valueOf(ky32.f184000f)) && C46238a.m51546a(this.f184001g, ky32.f184001g) && C46238a.m51546a(this.f184002h, ky32.f184002h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183998d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f183999e);
            aVar.mo74318e(3, this.f184000f);
            String str2 = this.f184001g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f184002h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f183998d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f183999e) + C52418a.m58678e(3, this.f184000f);
            String str5 = this.f184001g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f184002h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C64504ky3 ky32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ky32.f183998d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ky32.f183999e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ky32.f184000f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ky32.f184001g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ky32.f184002h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
