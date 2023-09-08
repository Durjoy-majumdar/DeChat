package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ze3 */
public class C52253ze3 extends C47465a {

    /* renamed from: d */
    public String f145851d;

    /* renamed from: e */
    public String f145852e;

    /* renamed from: f */
    public int f145853f;

    /* renamed from: g */
    public float f145854g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52253ze3)) {
            return false;
        }
        C52253ze3 ze32 = (C52253ze3) aVar;
        return C46238a.m51546a(this.f145851d, ze32.f145851d) && C46238a.m51546a(this.f145852e, ze32.f145852e) && C46238a.m51546a(Integer.valueOf(this.f145853f), Integer.valueOf(ze32.f145853f)) && C46238a.m51546a(Float.valueOf(this.f145854g), Float.valueOf(ze32.f145854g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145851d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f145852e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f145853f);
            aVar.mo74317d(4, this.f145854g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f145851d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f145852e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f145853f) + C52418a.m58677d(4, this.f145854g);
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
            C52253ze3 ze32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ze32.f145851d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ze32.f145852e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ze32.f145853f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ze32.f145854g = aVar3.mo141628f(intValue);
                return 0;
            }
        }
    }
}
