package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tu */
public class C51446tu extends C47465a {

    /* renamed from: d */
    public long f142408d;

    /* renamed from: e */
    public long f142409e;

    /* renamed from: f */
    public boolean f142410f;

    /* renamed from: g */
    public boolean f142411g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51446tu)) {
            return false;
        }
        C51446tu tuVar = (C51446tu) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142408d), Long.valueOf(tuVar.f142408d)) && C46238a.m51546a(Long.valueOf(this.f142409e), Long.valueOf(tuVar.f142409e)) && C46238a.m51546a(Boolean.valueOf(this.f142410f), Boolean.valueOf(tuVar.f142410f)) && C46238a.m51546a(Boolean.valueOf(this.f142411g), Boolean.valueOf(tuVar.f142411g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142408d);
            aVar.mo74321h(2, this.f142409e);
            aVar.mo74314a(3, this.f142410f);
            aVar.mo74314a(4, this.f142411g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f142408d) + 0 + C52418a.m58681h(2, this.f142409e) + C52418a.m58674a(3, this.f142410f) + C52418a.m58674a(4, this.f142411g);
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
                C51446tu tuVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tuVar.f142408d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    tuVar.f142409e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    tuVar.f142410f = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    tuVar.f142411g = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
