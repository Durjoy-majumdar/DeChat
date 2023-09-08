package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class a94 extends C47465a {

    /* renamed from: d */
    public int f130392d;

    /* renamed from: e */
    public String f130393e;

    /* renamed from: f */
    public long f130394f;

    /* renamed from: g */
    public int f130395g;

    /* renamed from: h */
    public int f130396h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof a94)) {
            return false;
        }
        a94 a94 = (a94) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130392d), Integer.valueOf(a94.f130392d)) && C46238a.m51546a(this.f130393e, a94.f130393e) && C46238a.m51546a(Long.valueOf(this.f130394f), Long.valueOf(a94.f130394f)) && C46238a.m51546a(Integer.valueOf(this.f130395g), Integer.valueOf(a94.f130395g)) && C46238a.m51546a(Integer.valueOf(this.f130396h), Integer.valueOf(a94.f130396h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130392d);
            String str = this.f130393e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f130394f);
            aVar.mo74318e(4, this.f130395g);
            aVar.mo74318e(5, this.f130396h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130392d) + 0;
            String str2 = this.f130393e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58681h(3, this.f130394f) + C52418a.m58678e(4, this.f130395g) + C52418a.m58678e(5, this.f130396h);
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
            a94 a94 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                a94.f130392d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                a94.f130393e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                a94.f130394f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                a94.f130395g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                a94.f130396h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
