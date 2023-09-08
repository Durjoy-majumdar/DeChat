package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k43 */
public class C50080k43 extends C47465a {

    /* renamed from: d */
    public long f136547d;

    /* renamed from: e */
    public long f136548e;

    /* renamed from: f */
    public String f136549f;

    /* renamed from: g */
    public long f136550g;

    /* renamed from: h */
    public int f136551h;

    /* renamed from: i */
    public int f136552i;

    /* renamed from: j */
    public int f136553j;

    /* renamed from: n */
    public String f136554n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50080k43)) {
            return false;
        }
        C50080k43 k432 = (C50080k43) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136547d), Long.valueOf(k432.f136547d)) && C46238a.m51546a(Long.valueOf(this.f136548e), Long.valueOf(k432.f136548e)) && C46238a.m51546a(this.f136549f, k432.f136549f) && C46238a.m51546a(Long.valueOf(this.f136550g), Long.valueOf(k432.f136550g)) && C46238a.m51546a(Integer.valueOf(this.f136551h), Integer.valueOf(k432.f136551h)) && C46238a.m51546a(Integer.valueOf(this.f136552i), Integer.valueOf(k432.f136552i)) && C46238a.m51546a(Integer.valueOf(this.f136553j), Integer.valueOf(k432.f136553j)) && C46238a.m51546a(this.f136554n, k432.f136554n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f136547d);
            aVar.mo74321h(2, this.f136548e);
            String str = this.f136549f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f136550g);
            aVar.mo74318e(5, this.f136551h);
            aVar.mo74318e(6, this.f136552i);
            aVar.mo74318e(7, this.f136553j);
            String str2 = this.f136554n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f136547d) + 0 + C52418a.m58681h(2, this.f136548e);
            String str3 = this.f136549f;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int h2 = h + C52418a.m58681h(4, this.f136550g) + C52418a.m58678e(5, this.f136551h) + C52418a.m58678e(6, this.f136552i) + C52418a.m58678e(7, this.f136553j);
            String str4 = this.f136554n;
            return str4 != null ? h2 + C52418a.m58683j(8, str4) : h2;
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
            C50080k43 k432 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    k432.f136547d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    k432.f136548e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    k432.f136549f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k432.f136550g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    k432.f136551h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    k432.f136552i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    k432.f136553j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    k432.f136554n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
