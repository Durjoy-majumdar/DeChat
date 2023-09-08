package y43;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.x */
public class C79036x extends C47465a {

    /* renamed from: d */
    public int f232096d;

    /* renamed from: e */
    public String f232097e;

    /* renamed from: f */
    public String f232098f;

    /* renamed from: g */
    public String f232099g;

    /* renamed from: h */
    public String f232100h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C79036x)) {
            return false;
        }
        C79036x xVar = (C79036x) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f232096d), Integer.valueOf(xVar.f232096d)) && C46238a.m51546a(this.f232097e, xVar.f232097e) && C46238a.m51546a(this.f232098f, xVar.f232098f) && C46238a.m51546a(this.f232099g, xVar.f232099g) && C46238a.m51546a(this.f232100h, xVar.f232100h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f232096d);
            String str = this.f232097e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f232098f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f232099g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f232100h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f232096d) + 0;
            String str5 = this.f232097e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f232098f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f232099g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f232100h;
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
            C79036x xVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xVar.f232096d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                xVar.f232097e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                xVar.f232098f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                xVar.f232099g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xVar.f232100h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
