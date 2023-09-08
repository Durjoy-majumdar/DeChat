package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ja0 */
public class C49967ja0 extends C47465a {

    /* renamed from: d */
    public int f135957d;

    /* renamed from: e */
    public int f135958e;

    /* renamed from: f */
    public int f135959f;

    /* renamed from: g */
    public String f135960g;

    /* renamed from: h */
    public int f135961h;

    /* renamed from: i */
    public String f135962i;

    /* renamed from: j */
    public long f135963j;

    /* renamed from: n */
    public String f135964n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49967ja0)) {
            return false;
        }
        C49967ja0 ja02 = (C49967ja0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135957d), Integer.valueOf(ja02.f135957d)) && C46238a.m51546a(Integer.valueOf(this.f135958e), Integer.valueOf(ja02.f135958e)) && C46238a.m51546a(Integer.valueOf(this.f135959f), Integer.valueOf(ja02.f135959f)) && C46238a.m51546a(this.f135960g, ja02.f135960g) && C46238a.m51546a(Integer.valueOf(this.f135961h), Integer.valueOf(ja02.f135961h)) && C46238a.m51546a(this.f135962i, ja02.f135962i) && C46238a.m51546a(Long.valueOf(this.f135963j), Long.valueOf(ja02.f135963j)) && C46238a.m51546a(this.f135964n, ja02.f135964n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135957d);
            aVar.mo74318e(2, this.f135958e);
            aVar.mo74318e(3, this.f135959f);
            String str = this.f135960g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f135961h);
            String str2 = this.f135962i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74321h(7, this.f135963j);
            String str3 = this.f135964n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135957d) + 0 + C52418a.m58678e(2, this.f135958e) + C52418a.m58678e(3, this.f135959f);
            String str4 = this.f135960g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            int e2 = e + C52418a.m58678e(5, this.f135961h);
            String str5 = this.f135962i;
            if (str5 != null) {
                e2 += C52418a.m58683j(6, str5);
            }
            int h = e2 + C52418a.m58681h(7, this.f135963j);
            String str6 = this.f135964n;
            return str6 != null ? h + C52418a.m58683j(8, str6) : h;
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
            C49967ja0 ja02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ja02.f135957d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ja02.f135958e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ja02.f135959f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ja02.f135960g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ja02.f135961h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ja02.f135962i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ja02.f135963j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    ja02.f135964n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
