package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t51 */
public class C64722t51 extends C47465a {

    /* renamed from: d */
    public String f185501d;

    /* renamed from: e */
    public String f185502e;

    /* renamed from: f */
    public String f185503f;

    /* renamed from: g */
    public String f185504g;

    /* renamed from: h */
    public String f185505h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64722t51)) {
            return false;
        }
        C64722t51 t512 = (C64722t51) aVar;
        return C46238a.m51546a(this.f185501d, t512.f185501d) && C46238a.m51546a(this.f185502e, t512.f185502e) && C46238a.m51546a(this.f185503f, t512.f185503f) && C46238a.m51546a(this.f185504g, t512.f185504g) && C46238a.m51546a(this.f185505h, t512.f185505h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185501d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185502e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185503f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f185504g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f185505h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f185501d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f185502e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f185503f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f185504g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f185505h;
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
            C64722t51 t512 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t512.f185501d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                t512.f185502e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                t512.f185503f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                t512.f185504g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                t512.f185505h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
