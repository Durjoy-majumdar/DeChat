package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f70 */
public class C49389f70 extends C47465a {

    /* renamed from: d */
    public int f133325d;

    /* renamed from: e */
    public int f133326e;

    /* renamed from: f */
    public float f133327f;

    /* renamed from: g */
    public float f133328g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49389f70)) {
            return false;
        }
        C49389f70 f702 = (C49389f70) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133325d), Integer.valueOf(f702.f133325d)) && C46238a.m51546a(Integer.valueOf(this.f133326e), Integer.valueOf(f702.f133326e)) && C46238a.m51546a(Float.valueOf(this.f133327f), Float.valueOf(f702.f133327f)) && C46238a.m51546a(Float.valueOf(this.f133328g), Float.valueOf(f702.f133328g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133325d);
            aVar.mo74318e(2, this.f133326e);
            aVar.mo74317d(3, this.f133327f);
            aVar.mo74317d(4, this.f133328g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f133325d) + 0 + C52418a.m58678e(2, this.f133326e) + C52418a.m58677d(3, this.f133327f) + C52418a.m58677d(4, this.f133328g);
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
                C49389f70 f702 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    f702.f133325d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    f702.f133326e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    f702.f133327f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    f702.f133328g = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
