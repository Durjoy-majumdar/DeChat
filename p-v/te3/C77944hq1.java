package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hq1 */
public class C77944hq1 extends C47465a {

    /* renamed from: d */
    public String f227589d;

    /* renamed from: e */
    public int f227590e;

    /* renamed from: f */
    public String f227591f;

    /* renamed from: g */
    public int f227592g = 0;

    /* renamed from: h */
    public String f227593h;

    /* renamed from: i */
    public int f227594i;

    /* renamed from: j */
    public int f227595j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77944hq1)) {
            return false;
        }
        C77944hq1 hq12 = (C77944hq1) aVar;
        return C46238a.m51546a(this.f227589d, hq12.f227589d) && C46238a.m51546a(Integer.valueOf(this.f227590e), Integer.valueOf(hq12.f227590e)) && C46238a.m51546a(this.f227591f, hq12.f227591f) && C46238a.m51546a(Integer.valueOf(this.f227592g), Integer.valueOf(hq12.f227592g)) && C46238a.m51546a(this.f227593h, hq12.f227593h) && C46238a.m51546a(Integer.valueOf(this.f227594i), Integer.valueOf(hq12.f227594i)) && C46238a.m51546a(Integer.valueOf(this.f227595j), Integer.valueOf(hq12.f227595j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227589d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f227590e);
            String str2 = this.f227591f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f227592g);
            String str3 = this.f227593h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f227594i);
            aVar.mo74318e(7, this.f227595j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f227589d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f227590e);
            String str5 = this.f227591f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f227592g);
            String str6 = this.f227593h;
            if (str6 != null) {
                e2 += C52418a.m58683j(5, str6);
            }
            return e2 + C52418a.m58678e(6, this.f227594i) + C52418a.m58678e(7, this.f227595j);
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
            C77944hq1 hq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hq12.f227589d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hq12.f227590e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hq12.f227591f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hq12.f227592g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hq12.f227593h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hq12.f227594i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    hq12.f227595j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
