package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gt2 */
public class C101782gt2 extends C47465a {

    /* renamed from: d */
    public String f298304d;

    /* renamed from: e */
    public String f298305e;

    /* renamed from: f */
    public String f298306f;

    /* renamed from: g */
    public String f298307g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101782gt2)) {
            return false;
        }
        C101782gt2 gt22 = (C101782gt2) aVar;
        return C46238a.m51546a(this.f298304d, gt22.f298304d) && C46238a.m51546a(this.f298305e, gt22.f298305e) && C46238a.m51546a(this.f298306f, gt22.f298306f) && C46238a.m51546a(this.f298307g, gt22.f298307g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298304d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298305e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f298306f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f298307g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f298304d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f298305e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f298306f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f298307g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C101782gt2 gt22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gt22.f298304d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gt22.f298305e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gt22.f298306f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                gt22.f298307g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
