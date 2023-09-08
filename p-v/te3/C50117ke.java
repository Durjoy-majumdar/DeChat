package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ke */
public class C50117ke extends C47465a {

    /* renamed from: d */
    public int f136675d;

    /* renamed from: e */
    public int f136676e;

    /* renamed from: f */
    public int f136677f;

    /* renamed from: g */
    public int f136678g;

    /* renamed from: h */
    public int f136679h;

    /* renamed from: i */
    public boolean f136680i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50117ke)) {
            return false;
        }
        C50117ke keVar = (C50117ke) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136675d), Integer.valueOf(keVar.f136675d)) && C46238a.m51546a(Integer.valueOf(this.f136676e), Integer.valueOf(keVar.f136676e)) && C46238a.m51546a(Integer.valueOf(this.f136677f), Integer.valueOf(keVar.f136677f)) && C46238a.m51546a(Integer.valueOf(this.f136678g), Integer.valueOf(keVar.f136678g)) && C46238a.m51546a(Integer.valueOf(this.f136679h), Integer.valueOf(keVar.f136679h)) && C46238a.m51546a(Boolean.valueOf(this.f136680i), Boolean.valueOf(keVar.f136680i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136675d);
            aVar.mo74318e(2, this.f136676e);
            aVar.mo74318e(3, this.f136677f);
            aVar.mo74318e(4, this.f136678g);
            aVar.mo74318e(5, this.f136679h);
            aVar.mo74314a(900, this.f136680i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136675d) + 0 + C52418a.m58678e(2, this.f136676e) + C52418a.m58678e(3, this.f136677f) + C52418a.m58678e(4, this.f136678g) + C52418a.m58678e(5, this.f136679h) + C52418a.m58674a(900, this.f136680i);
        } else {
            if (i == 2) {
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
                C50117ke keVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    keVar.f136675d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    keVar.f136676e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    keVar.f136677f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    keVar.f136678g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 5) {
                    keVar.f136679h = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 900) {
                    return -1;
                } else {
                    keVar.f136680i = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
