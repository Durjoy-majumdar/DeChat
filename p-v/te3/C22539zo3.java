package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zo3 */
public class C22539zo3 extends C47465a {

    /* renamed from: d */
    public String f64838d;

    /* renamed from: e */
    public String f64839e;

    /* renamed from: f */
    public String f64840f;

    /* renamed from: g */
    public String f64841g;

    /* renamed from: h */
    public String f64842h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22539zo3)) {
            return false;
        }
        C22539zo3 zo32 = (C22539zo3) aVar;
        return C46238a.m51546a(this.f64838d, zo32.f64838d) && C46238a.m51546a(this.f64839e, zo32.f64839e) && C46238a.m51546a(this.f64840f, zo32.f64840f) && C46238a.m51546a(this.f64841g, zo32.f64841g) && C46238a.m51546a(this.f64842h, zo32.f64842h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64838d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64839e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64840f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64841g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f64842h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f64838d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f64839e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f64840f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f64841g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f64842h;
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
            C22539zo3 zo32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zo32.f64838d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                zo32.f64839e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zo32.f64840f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                zo32.f64841g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zo32.f64842h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
