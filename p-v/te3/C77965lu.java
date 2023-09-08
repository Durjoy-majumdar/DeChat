package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lu */
public class C77965lu extends C47465a {

    /* renamed from: d */
    public String f227822d;

    /* renamed from: e */
    public String f227823e;

    /* renamed from: f */
    public String f227824f;

    /* renamed from: g */
    public String f227825g;

    /* renamed from: h */
    public int f227826h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77965lu)) {
            return false;
        }
        C77965lu luVar = (C77965lu) aVar;
        return C46238a.m51546a(this.f227822d, luVar.f227822d) && C46238a.m51546a(this.f227823e, luVar.f227823e) && C46238a.m51546a(this.f227824f, luVar.f227824f) && C46238a.m51546a(this.f227825g, luVar.f227825g) && C46238a.m51546a(Integer.valueOf(this.f227826h), Integer.valueOf(luVar.f227826h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227822d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227823e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227824f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227825g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f227826h);
            return 0;
        } else if (i == 1) {
            String str5 = this.f227822d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f227823e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f227824f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f227825g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f227826h);
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
            C77965lu luVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                luVar.f227822d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                luVar.f227823e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                luVar.f227824f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                luVar.f227825g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                luVar.f227826h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
