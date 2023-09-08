package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iy */
public class C49913iy extends C47465a {

    /* renamed from: d */
    public int f135739d;

    /* renamed from: e */
    public int f135740e;

    /* renamed from: f */
    public int f135741f;

    /* renamed from: g */
    public int f135742g;

    /* renamed from: h */
    public int f135743h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49913iy)) {
            return false;
        }
        C49913iy iyVar = (C49913iy) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135739d), Integer.valueOf(iyVar.f135739d)) && C46238a.m51546a(Integer.valueOf(this.f135740e), Integer.valueOf(iyVar.f135740e)) && C46238a.m51546a(Integer.valueOf(this.f135741f), Integer.valueOf(iyVar.f135741f)) && C46238a.m51546a(Integer.valueOf(this.f135742g), Integer.valueOf(iyVar.f135742g)) && C46238a.m51546a(Integer.valueOf(this.f135743h), Integer.valueOf(iyVar.f135743h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135739d);
            aVar.mo74318e(2, this.f135740e);
            aVar.mo74318e(3, this.f135741f);
            aVar.mo74318e(4, this.f135742g);
            aVar.mo74318e(5, this.f135743h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135739d) + 0 + C52418a.m58678e(2, this.f135740e) + C52418a.m58678e(3, this.f135741f) + C52418a.m58678e(4, this.f135742g) + C52418a.m58678e(5, this.f135743h);
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
                C49913iy iyVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    iyVar.f135739d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    iyVar.f135740e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    iyVar.f135741f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    iyVar.f135742g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    iyVar.f135743h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
