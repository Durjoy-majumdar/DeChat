package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uq1 */
public class C22531uq1 extends C47465a {

    /* renamed from: d */
    public int f64657d = 7;

    /* renamed from: e */
    public long f64658e = 0;

    /* renamed from: f */
    public int f64659f = 0;

    /* renamed from: g */
    public String f64660g = "";

    /* renamed from: h */
    public int f64661h = 0;

    /* renamed from: i */
    public int f64662i = 0;

    /* renamed from: j */
    public boolean f64663j = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22531uq1)) {
            return false;
        }
        C22531uq1 uq12 = (C22531uq1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64657d), Integer.valueOf(uq12.f64657d)) && C46238a.m51546a(Long.valueOf(this.f64658e), Long.valueOf(uq12.f64658e)) && C46238a.m51546a(Integer.valueOf(this.f64659f), Integer.valueOf(uq12.f64659f)) && C46238a.m51546a(this.f64660g, uq12.f64660g) && C46238a.m51546a(Integer.valueOf(this.f64661h), Integer.valueOf(uq12.f64661h)) && C46238a.m51546a(Integer.valueOf(this.f64662i), Integer.valueOf(uq12.f64662i)) && C46238a.m51546a(Boolean.valueOf(this.f64663j), Boolean.valueOf(uq12.f64663j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64657d);
            aVar.mo74321h(2, this.f64658e);
            aVar.mo74318e(3, this.f64659f);
            String str = this.f64660g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f64661h);
            aVar.mo74318e(6, this.f64662i);
            aVar.mo74314a(7, this.f64663j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f64657d) + 0 + C52418a.m58681h(2, this.f64658e) + C52418a.m58678e(3, this.f64659f);
            String str2 = this.f64660g;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f64661h) + C52418a.m58678e(6, this.f64662i) + C52418a.m58674a(7, this.f64663j);
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
            C22531uq1 uq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uq12.f64657d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    uq12.f64658e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    uq12.f64659f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    uq12.f64660g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uq12.f64661h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    uq12.f64662i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    uq12.f64663j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
