package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.q1 */
public class C47654q1 extends C47465a {

    /* renamed from: d */
    public long f127941d;

    /* renamed from: e */
    public long f127942e;

    /* renamed from: f */
    public long f127943f;

    /* renamed from: g */
    public long f127944g;

    /* renamed from: h */
    public long f127945h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47654q1)) {
            return false;
        }
        C47654q1 q1Var = (C47654q1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f127941d), Long.valueOf(q1Var.f127941d)) && C46238a.m51546a(Long.valueOf(this.f127942e), Long.valueOf(q1Var.f127942e)) && C46238a.m51546a(Long.valueOf(this.f127943f), Long.valueOf(q1Var.f127943f)) && C46238a.m51546a(Long.valueOf(this.f127944g), Long.valueOf(q1Var.f127944g)) && C46238a.m51546a(Long.valueOf(this.f127945h), Long.valueOf(q1Var.f127945h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f127941d);
            aVar.mo74321h(2, this.f127942e);
            aVar.mo74321h(3, this.f127943f);
            aVar.mo74321h(4, this.f127944g);
            aVar.mo74321h(5, this.f127945h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f127941d) + 0 + C52418a.m58681h(2, this.f127942e) + C52418a.m58681h(3, this.f127943f) + C52418a.m58681h(4, this.f127944g) + C52418a.m58681h(5, this.f127945h);
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
                C47654q1 q1Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    q1Var.f127941d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    q1Var.f127942e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    q1Var.f127943f = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 4) {
                    q1Var.f127944g = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    q1Var.f127945h = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
