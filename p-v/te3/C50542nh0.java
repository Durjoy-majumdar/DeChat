package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nh0 */
public class C50542nh0 extends C47465a {

    /* renamed from: d */
    public int f138602d;

    /* renamed from: e */
    public int f138603e;

    /* renamed from: f */
    public String f138604f;

    /* renamed from: g */
    public C89349b f138605g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50542nh0)) {
            return false;
        }
        C50542nh0 nh02 = (C50542nh0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138602d), Integer.valueOf(nh02.f138602d)) && C46238a.m51546a(Integer.valueOf(this.f138603e), Integer.valueOf(nh02.f138603e)) && C46238a.m51546a(this.f138604f, nh02.f138604f) && C46238a.m51546a(this.f138605g, nh02.f138605g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138602d);
            aVar.mo74318e(2, this.f138603e);
            String str = this.f138604f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f138605g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138602d) + 0 + C52418a.m58678e(2, this.f138603e);
            String str2 = this.f138604f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f138605g;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
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
            C50542nh0 nh02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nh02.f138602d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                nh02.f138603e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                nh02.f138604f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                nh02.f138605g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
