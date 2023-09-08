package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jw2 */
public class C22504jw2 extends C47465a {

    /* renamed from: d */
    public int f64083d;

    /* renamed from: e */
    public int f64084e;

    /* renamed from: f */
    public int f64085f;

    /* renamed from: g */
    public int f64086g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22504jw2)) {
            return false;
        }
        C22504jw2 jw22 = (C22504jw2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64083d), Integer.valueOf(jw22.f64083d)) && C46238a.m51546a(Integer.valueOf(this.f64084e), Integer.valueOf(jw22.f64084e)) && C46238a.m51546a(Integer.valueOf(this.f64085f), Integer.valueOf(jw22.f64085f)) && C46238a.m51546a(Integer.valueOf(this.f64086g), Integer.valueOf(jw22.f64086g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64083d);
            aVar.mo74318e(2, this.f64084e);
            aVar.mo74318e(3, this.f64085f);
            aVar.mo74318e(4, this.f64086g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f64083d) + 0 + C52418a.m58678e(2, this.f64084e) + C52418a.m58678e(3, this.f64085f) + C52418a.m58678e(4, this.f64086g);
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
                C22504jw2 jw22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jw22.f64083d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    jw22.f64084e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    jw22.f64085f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    jw22.f64086g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
