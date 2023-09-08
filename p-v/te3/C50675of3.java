package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.of3 */
public class C50675of3 extends C47465a {

    /* renamed from: d */
    public String f139142d;

    /* renamed from: e */
    public int f139143e;

    /* renamed from: f */
    public String f139144f;

    /* renamed from: g */
    public String f139145g;

    /* renamed from: h */
    public String f139146h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50675of3)) {
            return false;
        }
        C50675of3 of32 = (C50675of3) aVar;
        return C46238a.m51546a(this.f139142d, of32.f139142d) && C46238a.m51546a(Integer.valueOf(this.f139143e), Integer.valueOf(of32.f139143e)) && C46238a.m51546a(this.f139144f, of32.f139144f) && C46238a.m51546a(this.f139145g, of32.f139145g) && C46238a.m51546a(this.f139146h, of32.f139146h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139142d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f139143e);
            String str2 = this.f139144f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f139145g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f139146h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f139142d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f139143e);
            String str6 = this.f139144f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f139145g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f139146h;
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
            C50675of3 of32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                of32.f139142d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                of32.f139143e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                of32.f139144f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                of32.f139145g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                of32.f139146h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
