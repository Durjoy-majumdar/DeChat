package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ab1 */
public class C48688ab1 extends C47465a {

    /* renamed from: d */
    public String f130410d;

    /* renamed from: e */
    public boolean f130411e;

    /* renamed from: f */
    public String f130412f;

    /* renamed from: g */
    public boolean f130413g;

    /* renamed from: h */
    public boolean f130414h;

    /* renamed from: i */
    public int f130415i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48688ab1)) {
            return false;
        }
        C48688ab1 ab12 = (C48688ab1) aVar;
        return C46238a.m51546a(this.f130410d, ab12.f130410d) && C46238a.m51546a(Boolean.valueOf(this.f130411e), Boolean.valueOf(ab12.f130411e)) && C46238a.m51546a(this.f130412f, ab12.f130412f) && C46238a.m51546a(Boolean.valueOf(this.f130413g), Boolean.valueOf(ab12.f130413g)) && C46238a.m51546a(Boolean.valueOf(this.f130414h), Boolean.valueOf(ab12.f130414h)) && C46238a.m51546a(Integer.valueOf(this.f130415i), Integer.valueOf(ab12.f130415i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130410d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f130411e);
            String str2 = this.f130412f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f130413g);
            aVar.mo74314a(5, this.f130414h);
            aVar.mo74318e(6, this.f130415i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f130410d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int a = i2 + C52418a.m58674a(2, this.f130411e);
            String str4 = this.f130412f;
            if (str4 != null) {
                a += C52418a.m58683j(3, str4);
            }
            return a + C52418a.m58674a(4, this.f130413g) + C52418a.m58674a(5, this.f130414h) + C52418a.m58678e(6, this.f130415i);
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
            C48688ab1 ab12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ab12.f130410d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ab12.f130411e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    ab12.f130412f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ab12.f130413g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    ab12.f130414h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    ab12.f130415i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
