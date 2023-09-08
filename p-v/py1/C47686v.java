package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.v */
public class C47686v extends C47465a {

    /* renamed from: d */
    public int f128065d;

    /* renamed from: e */
    public String f128066e;

    /* renamed from: f */
    public String f128067f;

    /* renamed from: g */
    public String f128068g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47686v)) {
            return false;
        }
        C47686v vVar = (C47686v) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f128065d), Integer.valueOf(vVar.f128065d)) && C46238a.m51546a(this.f128066e, vVar.f128066e) && C46238a.m51546a(this.f128067f, vVar.f128067f) && C46238a.m51546a(this.f128068g, vVar.f128068g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f128066e == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f128067f != null) {
                aVar.mo74318e(1, this.f128065d);
                String str = this.f128066e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f128067f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f128068g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: IconURL");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f128065d) + 0;
            String str4 = this.f128066e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f128067f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f128068g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128066e == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f128067f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: IconURL");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47686v vVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vVar.f128065d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                vVar.f128066e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vVar.f128067f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                vVar.f128068g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
