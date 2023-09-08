package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ql */
public class C50974ql extends C47465a {

    /* renamed from: d */
    public int f140370d;

    /* renamed from: e */
    public int f140371e;

    /* renamed from: f */
    public C89349b f140372f;

    /* renamed from: g */
    public int f140373g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50974ql)) {
            return false;
        }
        C50974ql qlVar = (C50974ql) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140370d), Integer.valueOf(qlVar.f140370d)) && C46238a.m51546a(Integer.valueOf(this.f140371e), Integer.valueOf(qlVar.f140371e)) && C46238a.m51546a(this.f140372f, qlVar.f140372f) && C46238a.m51546a(Integer.valueOf(this.f140373g), Integer.valueOf(qlVar.f140373g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140370d);
            aVar.mo74318e(2, this.f140371e);
            C89349b bVar = this.f140372f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f140373g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140370d) + 0 + C52418a.m58678e(2, this.f140371e);
            C89349b bVar2 = this.f140372f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            return e + C52418a.m58678e(4, this.f140373g);
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
            C50974ql qlVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qlVar.f140370d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                qlVar.f140371e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                qlVar.f140372f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                qlVar.f140373g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
