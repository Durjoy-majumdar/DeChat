package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sx2 */
public class C77997sx2 extends C47465a {

    /* renamed from: d */
    public String f228227d;

    /* renamed from: e */
    public String f228228e;

    /* renamed from: f */
    public String f228229f;

    /* renamed from: g */
    public String f228230g;

    /* renamed from: h */
    public String f228231h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77997sx2)) {
            return false;
        }
        C77997sx2 sx22 = (C77997sx2) aVar;
        return C46238a.m51546a(this.f228227d, sx22.f228227d) && C46238a.m51546a(this.f228228e, sx22.f228228e) && C46238a.m51546a(this.f228229f, sx22.f228229f) && C46238a.m51546a(this.f228230g, sx22.f228230g) && C46238a.m51546a(this.f228231h, sx22.f228231h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228227d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f228228e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f228229f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f228230g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f228231h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f228227d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f228228e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f228229f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f228230g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f228231h;
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
            C77997sx2 sx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sx22.f228227d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                sx22.f228228e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                sx22.f228229f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                sx22.f228230g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sx22.f228231h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
