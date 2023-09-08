package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cq1 */
public class C77914cq1 extends C47465a {

    /* renamed from: d */
    public long f227140d;

    /* renamed from: e */
    public String f227141e;

    /* renamed from: f */
    public String f227142f;

    /* renamed from: g */
    public int f227143g;

    /* renamed from: h */
    public String f227144h;

    /* renamed from: i */
    public String f227145i;

    /* renamed from: j */
    public String f227146j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77914cq1)) {
            return false;
        }
        C77914cq1 cq12 = (C77914cq1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f227140d), Long.valueOf(cq12.f227140d)) && C46238a.m51546a(this.f227141e, cq12.f227141e) && C46238a.m51546a(this.f227142f, cq12.f227142f) && C46238a.m51546a(Integer.valueOf(this.f227143g), Integer.valueOf(cq12.f227143g)) && C46238a.m51546a(this.f227144h, cq12.f227144h) && C46238a.m51546a(this.f227145i, cq12.f227145i) && C46238a.m51546a(this.f227146j, cq12.f227146j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f227140d);
            String str = this.f227141e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227142f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f227143g);
            String str3 = this.f227144h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f227145i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f227146j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f227140d) + 0;
            String str6 = this.f227141e;
            if (str6 != null) {
                h += C52418a.m58683j(2, str6);
            }
            String str7 = this.f227142f;
            if (str7 != null) {
                h += C52418a.m58683j(3, str7);
            }
            int e = h + C52418a.m58678e(4, this.f227143g);
            String str8 = this.f227144h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f227145i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f227146j;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C77914cq1 cq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cq12.f227140d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    cq12.f227141e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cq12.f227142f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    cq12.f227143g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    cq12.f227144h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cq12.f227145i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    cq12.f227146j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
