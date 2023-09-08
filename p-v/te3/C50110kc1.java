package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kc1 */
public class C50110kc1 extends C47465a {

    /* renamed from: d */
    public String f136659d;

    /* renamed from: e */
    public String f136660e;

    /* renamed from: f */
    public int f136661f;

    /* renamed from: g */
    public String f136662g;

    /* renamed from: h */
    public String f136663h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50110kc1)) {
            return false;
        }
        C50110kc1 kc12 = (C50110kc1) aVar;
        return C46238a.m51546a(this.f136659d, kc12.f136659d) && C46238a.m51546a(this.f136660e, kc12.f136660e) && C46238a.m51546a(Integer.valueOf(this.f136661f), Integer.valueOf(kc12.f136661f)) && C46238a.m51546a(this.f136662g, kc12.f136662g) && C46238a.m51546a(this.f136663h, kc12.f136663h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136659d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136660e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f136661f);
            String str3 = this.f136662g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f136663h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f136659d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f136660e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f136661f);
            String str7 = this.f136662g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f136663h;
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
            C50110kc1 kc12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kc12.f136659d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                kc12.f136660e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kc12.f136661f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                kc12.f136662g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                kc12.f136663h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
