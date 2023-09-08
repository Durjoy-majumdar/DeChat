package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.re2 */
public class C64678re2 extends C47465a {

    /* renamed from: d */
    public long f185155d;

    /* renamed from: e */
    public long f185156e;

    /* renamed from: f */
    public String f185157f;

    /* renamed from: g */
    public String f185158g;

    /* renamed from: h */
    public int f185159h;

    /* renamed from: i */
    public String f185160i;

    /* renamed from: j */
    public String f185161j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64678re2)) {
            return false;
        }
        C64678re2 re22 = (C64678re2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f185155d), Long.valueOf(re22.f185155d)) && C46238a.m51546a(Long.valueOf(this.f185156e), Long.valueOf(re22.f185156e)) && C46238a.m51546a(this.f185157f, re22.f185157f) && C46238a.m51546a(this.f185158g, re22.f185158g) && C46238a.m51546a(Integer.valueOf(this.f185159h), Integer.valueOf(re22.f185159h)) && C46238a.m51546a(this.f185160i, re22.f185160i) && C46238a.m51546a(this.f185161j, re22.f185161j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f185155d);
            aVar.mo74321h(2, this.f185156e);
            String str = this.f185157f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f185158g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f185159h);
            String str3 = this.f185160i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f185161j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f185155d) + 0 + C52418a.m58681h(2, this.f185156e);
            String str5 = this.f185157f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f185158g;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            int e = h + C52418a.m58678e(5, this.f185159h);
            String str7 = this.f185160i;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f185161j;
            return str8 != null ? e + C52418a.m58683j(7, str8) : e;
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
            C64678re2 re22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    re22.f185155d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    re22.f185156e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    re22.f185157f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    re22.f185158g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    re22.f185159h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    re22.f185160i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    re22.f185161j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
