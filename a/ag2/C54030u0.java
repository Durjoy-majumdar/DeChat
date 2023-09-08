package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.u0 */
public class C54030u0 extends C47465a {

    /* renamed from: d */
    public long f151296d;

    /* renamed from: e */
    public String f151297e;

    /* renamed from: f */
    public int f151298f;

    /* renamed from: g */
    public String f151299g;

    /* renamed from: h */
    public String f151300h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C54030u0)) {
            return false;
        }
        C54030u0 u0Var = (C54030u0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f151296d), Long.valueOf(u0Var.f151296d)) && C46238a.m51546a(this.f151297e, u0Var.f151297e) && C46238a.m51546a(Integer.valueOf(this.f151298f), Integer.valueOf(u0Var.f151298f)) && C46238a.m51546a(this.f151299g, u0Var.f151299g) && C46238a.m51546a(this.f151300h, u0Var.f151300h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f151296d);
            String str = this.f151297e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f151298f);
            String str2 = this.f151299g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f151300h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f151296d) + 0;
            String str4 = this.f151297e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            int e = h + C52418a.m58678e(3, this.f151298f);
            String str5 = this.f151299g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f151300h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C54030u0 u0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u0Var.f151296d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                u0Var.f151297e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                u0Var.f151298f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                u0Var.f151299g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                u0Var.f151300h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
