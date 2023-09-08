package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.x */
public class C47698x extends C47465a {

    /* renamed from: d */
    public String f128125d;

    /* renamed from: e */
    public String f128126e;

    /* renamed from: f */
    public String f128127f;

    /* renamed from: g */
    public String f128128g;

    /* renamed from: h */
    public int f128129h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47698x)) {
            return false;
        }
        C47698x xVar = (C47698x) aVar;
        return C46238a.m51546a(this.f128125d, xVar.f128125d) && C46238a.m51546a(this.f128126e, xVar.f128126e) && C46238a.m51546a(this.f128127f, xVar.f128127f) && C46238a.m51546a(this.f128128g, xVar.f128128g) && C46238a.m51546a(Integer.valueOf(this.f128129h), Integer.valueOf(xVar.f128129h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128125d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f128126e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f128127f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f128128g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f128129h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f128125d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f128126e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f128127f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f128128g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f128129h);
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
            C47698x xVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xVar.f128125d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                xVar.f128126e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                xVar.f128127f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                xVar.f128128g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xVar.f128129h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
