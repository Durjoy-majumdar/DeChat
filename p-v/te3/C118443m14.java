package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m14 */
public class C118443m14 extends C47465a {

    /* renamed from: d */
    public String f354129d;

    /* renamed from: e */
    public String f354130e;

    /* renamed from: f */
    public String f354131f;

    /* renamed from: g */
    public String f354132g;

    /* renamed from: h */
    public String f354133h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118443m14)) {
            return false;
        }
        C118443m14 m142 = (C118443m14) aVar;
        return C46238a.m51546a(this.f354129d, m142.f354129d) && C46238a.m51546a(this.f354130e, m142.f354130e) && C46238a.m51546a(this.f354131f, m142.f354131f) && C46238a.m51546a(this.f354132g, m142.f354132g) && C46238a.m51546a(this.f354133h, m142.f354133h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354129d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354130e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f354131f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f354132g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f354133h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f354129d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f354130e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f354131f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f354132g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f354133h;
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
            C118443m14 m142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m142.f354129d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                m142.f354130e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                m142.f354131f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                m142.f354132g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                m142.f354133h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
