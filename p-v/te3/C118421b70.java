package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b70 */
public class C118421b70 extends C47465a {

    /* renamed from: d */
    public String f353912d;

    /* renamed from: e */
    public int f353913e;

    /* renamed from: f */
    public String f353914f;

    /* renamed from: g */
    public String f353915g;

    /* renamed from: h */
    public String f353916h;

    /* renamed from: i */
    public String f353917i;

    /* renamed from: j */
    public int f353918j;

    /* renamed from: n */
    public String f353919n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118421b70)) {
            return false;
        }
        C118421b70 b702 = (C118421b70) aVar;
        return C46238a.m51546a(this.f353912d, b702.f353912d) && C46238a.m51546a(Integer.valueOf(this.f353913e), Integer.valueOf(b702.f353913e)) && C46238a.m51546a(this.f353914f, b702.f353914f) && C46238a.m51546a(this.f353915g, b702.f353915g) && C46238a.m51546a(this.f353916h, b702.f353916h) && C46238a.m51546a(this.f353917i, b702.f353917i) && C46238a.m51546a(Integer.valueOf(this.f353918j), Integer.valueOf(b702.f353918j)) && C46238a.m51546a(this.f353919n, b702.f353919n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f353912d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f353913e);
            String str2 = this.f353914f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f353915g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f353916h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f353917i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f353918j);
            String str6 = this.f353919n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f353912d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            int e = i2 + C52418a.m58678e(2, this.f353913e);
            String str8 = this.f353914f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f353915g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f353916h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f353917i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int e2 = e + C52418a.m58678e(7, this.f353918j);
            String str12 = this.f353919n;
            return str12 != null ? e2 + C52418a.m58683j(8, str12) : e2;
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
            C118421b70 b702 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b702.f353912d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    b702.f353913e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    b702.f353914f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b702.f353915g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    b702.f353916h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    b702.f353917i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    b702.f353918j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    b702.f353919n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
