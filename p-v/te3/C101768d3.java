package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d3 */
public class C101768d3 extends C47465a {

    /* renamed from: d */
    public int f298079d;

    /* renamed from: e */
    public int f298080e;

    /* renamed from: f */
    public int f298081f;

    /* renamed from: g */
    public int f298082g;

    /* renamed from: h */
    public int f298083h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101768d3)) {
            return false;
        }
        C101768d3 d3Var = (C101768d3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298079d), Integer.valueOf(d3Var.f298079d)) && C46238a.m51546a(Integer.valueOf(this.f298080e), Integer.valueOf(d3Var.f298080e)) && C46238a.m51546a(Integer.valueOf(this.f298081f), Integer.valueOf(d3Var.f298081f)) && C46238a.m51546a(Integer.valueOf(this.f298082g), Integer.valueOf(d3Var.f298082g)) && C46238a.m51546a(Integer.valueOf(this.f298083h), Integer.valueOf(d3Var.f298083h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298079d);
            aVar.mo74318e(2, this.f298080e);
            aVar.mo74318e(3, this.f298081f);
            aVar.mo74318e(4, this.f298082g);
            aVar.mo74318e(5, this.f298083h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f298079d) + 0 + C52418a.m58678e(2, this.f298080e) + C52418a.m58678e(3, this.f298081f) + C52418a.m58678e(4, this.f298082g) + C52418a.m58678e(5, this.f298083h);
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
                C101768d3 d3Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    d3Var.f298079d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    d3Var.f298080e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    d3Var.f298081f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    d3Var.f298082g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    d3Var.f298083h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
