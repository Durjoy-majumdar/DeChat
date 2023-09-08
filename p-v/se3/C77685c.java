package se3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: se3.c */
public class C77685c extends C47465a {

    /* renamed from: d */
    public String f226460d;

    /* renamed from: e */
    public String f226461e;

    /* renamed from: f */
    public String f226462f;

    /* renamed from: g */
    public int f226463g;

    /* renamed from: h */
    public String f226464h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77685c)) {
            return false;
        }
        C77685c cVar = (C77685c) aVar;
        return C46238a.m51546a(this.f226460d, cVar.f226460d) && C46238a.m51546a(this.f226461e, cVar.f226461e) && C46238a.m51546a(this.f226462f, cVar.f226462f) && C46238a.m51546a(Integer.valueOf(this.f226463g), Integer.valueOf(cVar.f226463g)) && C46238a.m51546a(this.f226464h, cVar.f226464h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226460d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f226461e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f226462f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f226463g);
            String str4 = this.f226464h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f226460d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f226461e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f226462f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f226463g);
            String str8 = this.f226464h;
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
            C77685c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cVar.f226460d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                cVar.f226461e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cVar.f226462f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                cVar.f226463g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                cVar.f226464h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
