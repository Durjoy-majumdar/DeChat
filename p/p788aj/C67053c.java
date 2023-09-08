package p788aj;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: aj.c */
public class C67053c extends C47465a {

    /* renamed from: d */
    public long f192601d;

    /* renamed from: e */
    public long f192602e;

    /* renamed from: f */
    public long f192603f;

    /* renamed from: g */
    public long f192604g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C67053c)) {
            return false;
        }
        C67053c cVar = (C67053c) aVar;
        return C46238a.m51546a(Long.valueOf(this.f192601d), Long.valueOf(cVar.f192601d)) && C46238a.m51546a(Long.valueOf(this.f192602e), Long.valueOf(cVar.f192602e)) && C46238a.m51546a(Long.valueOf(this.f192603f), Long.valueOf(cVar.f192603f)) && C46238a.m51546a(Long.valueOf(this.f192604g), Long.valueOf(cVar.f192604g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f192601d);
            aVar.mo74321h(2, this.f192602e);
            aVar.mo74321h(3, this.f192603f);
            aVar.mo74321h(4, this.f192604g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f192601d) + 0 + C52418a.m58681h(2, this.f192602e) + C52418a.m58681h(3, this.f192603f) + C52418a.m58681h(4, this.f192604g);
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
                C67053c cVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cVar.f192601d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    cVar.f192602e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    cVar.f192603f = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    cVar.f192604g = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
