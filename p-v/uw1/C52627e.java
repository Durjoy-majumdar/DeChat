package uw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uw1.e */
public class C52627e extends C47465a {

    /* renamed from: d */
    public String f146938d;

    /* renamed from: e */
    public String f146939e;

    /* renamed from: f */
    public int f146940f;

    /* renamed from: g */
    public int f146941g;

    /* renamed from: h */
    public String f146942h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52627e)) {
            return false;
        }
        C52627e eVar = (C52627e) aVar;
        return C46238a.m51546a(this.f146938d, eVar.f146938d) && C46238a.m51546a(this.f146939e, eVar.f146939e) && C46238a.m51546a(Integer.valueOf(this.f146940f), Integer.valueOf(eVar.f146940f)) && C46238a.m51546a(Integer.valueOf(this.f146941g), Integer.valueOf(eVar.f146941g)) && C46238a.m51546a(this.f146942h, eVar.f146942h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146938d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f146939e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f146940f);
            aVar.mo74318e(4, this.f146941g);
            String str3 = this.f146942h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f146938d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f146939e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f146940f) + C52418a.m58678e(4, this.f146941g);
            String str6 = this.f146942h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C52627e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eVar.f146938d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                eVar.f146939e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                eVar.f146940f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                eVar.f146941g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                eVar.f146942h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
