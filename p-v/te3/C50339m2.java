package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m2 */
public class C50339m2 extends C47465a {

    /* renamed from: d */
    public int f137758d;

    /* renamed from: e */
    public C89349b f137759e;

    /* renamed from: f */
    public long f137760f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50339m2)) {
            return false;
        }
        C50339m2 m2Var = (C50339m2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137758d), Integer.valueOf(m2Var.f137758d)) && C46238a.m51546a(this.f137759e, m2Var.f137759e) && C46238a.m51546a(Long.valueOf(this.f137760f), Long.valueOf(m2Var.f137760f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137758d);
            C89349b bVar = this.f137759e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74321h(3, this.f137760f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137758d) + 0;
            C89349b bVar2 = this.f137759e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58681h(3, this.f137760f);
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
            C50339m2 m2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m2Var.f137758d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                m2Var.f137759e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                m2Var.f137760f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
