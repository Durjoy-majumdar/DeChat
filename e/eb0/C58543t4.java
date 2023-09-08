package eb0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: eb0.t4 */
public class C58543t4 extends C47465a {

    /* renamed from: d */
    public int f167583d;

    /* renamed from: e */
    public String f167584e;

    /* renamed from: f */
    public long f167585f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C58543t4)) {
            return false;
        }
        C58543t4 t4Var = (C58543t4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f167583d), Integer.valueOf(t4Var.f167583d)) && C46238a.m51546a(this.f167584e, t4Var.f167584e) && C46238a.m51546a(Long.valueOf(this.f167585f), Long.valueOf(t4Var.f167585f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f167583d);
            String str = this.f167584e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f167585f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f167583d) + 0;
            String str2 = this.f167584e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58681h(3, this.f167585f);
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
            C58543t4 t4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t4Var.f167583d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                t4Var.f167584e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                t4Var.f167585f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
