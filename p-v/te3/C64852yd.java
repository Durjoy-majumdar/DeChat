package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yd */
public class C64852yd extends C47465a {

    /* renamed from: d */
    public float f186490d;

    /* renamed from: e */
    public float f186491e;

    /* renamed from: f */
    public float f186492f;

    /* renamed from: g */
    public boolean f186493g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64852yd)) {
            return false;
        }
        C64852yd ydVar = (C64852yd) aVar;
        return C46238a.m51546a(Float.valueOf(this.f186490d), Float.valueOf(ydVar.f186490d)) && C46238a.m51546a(Float.valueOf(this.f186491e), Float.valueOf(ydVar.f186491e)) && C46238a.m51546a(Float.valueOf(this.f186492f), Float.valueOf(ydVar.f186492f)) && C46238a.m51546a(Boolean.valueOf(this.f186493g), Boolean.valueOf(ydVar.f186493g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f186490d);
            aVar.mo74317d(2, this.f186491e);
            aVar.mo74317d(3, this.f186492f);
            aVar.mo74314a(4, this.f186493g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f186490d) + 0 + C52418a.m58677d(2, this.f186491e) + C52418a.m58677d(3, this.f186492f) + C52418a.m58674a(4, this.f186493g);
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
                C64852yd ydVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ydVar.f186490d = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ydVar.f186491e = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue == 3) {
                    ydVar.f186492f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    ydVar.f186493g = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
