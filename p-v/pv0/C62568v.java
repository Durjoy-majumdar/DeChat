package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.v */
public class C62568v extends C47465a {

    /* renamed from: d */
    public long f177717d;

    /* renamed from: e */
    public long f177718e;

    /* renamed from: f */
    public long f177719f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62568v)) {
            return false;
        }
        C62568v vVar = (C62568v) aVar;
        return C46238a.m51546a(Long.valueOf(this.f177717d), Long.valueOf(vVar.f177717d)) && C46238a.m51546a(Long.valueOf(this.f177718e), Long.valueOf(vVar.f177718e)) && C46238a.m51546a(Long.valueOf(this.f177719f), Long.valueOf(vVar.f177719f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f177717d);
            aVar.mo74321h(2, this.f177718e);
            aVar.mo74321h(3, this.f177719f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f177717d) + 0 + C52418a.m58681h(2, this.f177718e) + C52418a.m58681h(3, this.f177719f);
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
                C62568v vVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    vVar.f177717d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    vVar.f177718e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    vVar.f177719f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
