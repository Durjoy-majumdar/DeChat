package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ta1 */
public class C51367ta1 extends C47465a {

    /* renamed from: d */
    public int f142074d;

    /* renamed from: e */
    public int f142075e;

    /* renamed from: f */
    public int f142076f;

    /* renamed from: g */
    public int f142077g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51367ta1)) {
            return false;
        }
        C51367ta1 ta12 = (C51367ta1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142074d), Integer.valueOf(ta12.f142074d)) && C46238a.m51546a(Integer.valueOf(this.f142075e), Integer.valueOf(ta12.f142075e)) && C46238a.m51546a(Integer.valueOf(this.f142076f), Integer.valueOf(ta12.f142076f)) && C46238a.m51546a(Integer.valueOf(this.f142077g), Integer.valueOf(ta12.f142077g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142074d);
            aVar.mo74318e(2, this.f142075e);
            aVar.mo74318e(3, this.f142076f);
            aVar.mo74318e(4, this.f142077g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f142074d) + 0 + C52418a.m58678e(2, this.f142075e) + C52418a.m58678e(3, this.f142076f) + C52418a.m58678e(4, this.f142077g);
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
                C51367ta1 ta12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ta12.f142074d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ta12.f142075e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    ta12.f142076f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    ta12.f142077g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
