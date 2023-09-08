package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kp2 */
public class C50161kp2 extends C47465a {

    /* renamed from: d */
    public String f136967d;

    /* renamed from: e */
    public String f136968e;

    /* renamed from: f */
    public String f136969f;

    /* renamed from: g */
    public String f136970g;

    /* renamed from: h */
    public String f136971h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50161kp2)) {
            return false;
        }
        C50161kp2 kp22 = (C50161kp2) aVar;
        return C46238a.m51546a(this.f136967d, kp22.f136967d) && C46238a.m51546a(this.f136968e, kp22.f136968e) && C46238a.m51546a(this.f136969f, kp22.f136969f) && C46238a.m51546a(this.f136970g, kp22.f136970g) && C46238a.m51546a(this.f136971h, kp22.f136971h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136967d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136968e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f136969f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f136970g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f136971h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f136967d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f136968e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f136969f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f136970g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f136971h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C50161kp2 kp22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kp22.f136967d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                kp22.f136968e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kp22.f136969f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                kp22.f136970g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                kp22.f136971h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
