package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pa0 */
public class C64624pa0 extends C47465a {

    /* renamed from: d */
    public int f184798d;

    /* renamed from: e */
    public String f184799e;

    /* renamed from: f */
    public String f184800f;

    /* renamed from: g */
    public String f184801g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64624pa0)) {
            return false;
        }
        C64624pa0 pa02 = (C64624pa0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184798d), Integer.valueOf(pa02.f184798d)) && C46238a.m51546a(this.f184799e, pa02.f184799e) && C46238a.m51546a(this.f184800f, pa02.f184800f) && C46238a.m51546a(this.f184801g, pa02.f184801g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184798d);
            String str = this.f184799e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184800f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f184801g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184798d) + 0;
            String str4 = this.f184799e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f184800f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f184801g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            C64624pa0 pa02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pa02.f184798d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pa02.f184799e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pa02.f184800f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pa02.f184801g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
