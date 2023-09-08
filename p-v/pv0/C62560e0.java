package pv0;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.e0 */
public class C62560e0 extends C47465a {

    /* renamed from: d */
    public int f177686d;

    /* renamed from: e */
    public C89349b f177687e;

    /* renamed from: f */
    public int f177688f;

    /* renamed from: g */
    public int f177689g;

    /* renamed from: h */
    public long f177690h;

    /* renamed from: i */
    public long f177691i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62560e0)) {
            return false;
        }
        C62560e0 e0Var = (C62560e0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f177686d), Integer.valueOf(e0Var.f177686d)) && C46238a.m51546a(this.f177687e, e0Var.f177687e) && C46238a.m51546a(Integer.valueOf(this.f177688f), Integer.valueOf(e0Var.f177688f)) && C46238a.m51546a(Integer.valueOf(this.f177689g), Integer.valueOf(e0Var.f177689g)) && C46238a.m51546a(Long.valueOf(this.f177690h), Long.valueOf(e0Var.f177690h)) && C46238a.m51546a(Long.valueOf(this.f177691i), Long.valueOf(e0Var.f177691i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f177686d);
            C89349b bVar = this.f177687e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f177688f);
            aVar.mo74318e(4, this.f177689g);
            aVar.mo74321h(5, this.f177690h);
            aVar.mo74321h(6, this.f177691i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f177686d) + 0;
            C89349b bVar2 = this.f177687e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58678e(3, this.f177688f) + C52418a.m58678e(4, this.f177689g) + C52418a.m58681h(5, this.f177690h) + C52418a.m58681h(6, this.f177691i);
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
            C62560e0 e0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e0Var.f177686d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    e0Var.f177687e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    e0Var.f177688f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e0Var.f177689g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e0Var.f177690h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    e0Var.f177691i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
