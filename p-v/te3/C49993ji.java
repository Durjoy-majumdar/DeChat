package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ji */
public class C49993ji extends C47465a {

    /* renamed from: d */
    public String f136127d;

    /* renamed from: e */
    public boolean f136128e;

    /* renamed from: f */
    public String f136129f;

    /* renamed from: g */
    public boolean f136130g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49993ji)) {
            return false;
        }
        C49993ji jiVar = (C49993ji) aVar;
        return C46238a.m51546a(this.f136127d, jiVar.f136127d) && C46238a.m51546a(Boolean.valueOf(this.f136128e), Boolean.valueOf(jiVar.f136128e)) && C46238a.m51546a(this.f136129f, jiVar.f136129f) && C46238a.m51546a(Boolean.valueOf(this.f136130g), Boolean.valueOf(jiVar.f136130g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136127d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f136128e);
            String str2 = this.f136129f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f136130g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f136127d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int a = i2 + C52418a.m58674a(2, this.f136128e);
            String str4 = this.f136129f;
            if (str4 != null) {
                a += C52418a.m58683j(3, str4);
            }
            return a + C52418a.m58674a(4, this.f136130g);
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
            C49993ji jiVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jiVar.f136127d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                jiVar.f136128e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                jiVar.f136129f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                jiVar.f136130g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
