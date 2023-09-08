package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lu3 */
public class C50312lu3 extends C47465a {

    /* renamed from: d */
    public String f137646d;

    /* renamed from: e */
    public int f137647e;

    /* renamed from: f */
    public int f137648f;

    /* renamed from: g */
    public int f137649g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50312lu3)) {
            return false;
        }
        C50312lu3 lu32 = (C50312lu3) aVar;
        return C46238a.m51546a(this.f137646d, lu32.f137646d) && C46238a.m51546a(Integer.valueOf(this.f137647e), Integer.valueOf(lu32.f137647e)) && C46238a.m51546a(Integer.valueOf(this.f137648f), Integer.valueOf(lu32.f137648f)) && C46238a.m51546a(Integer.valueOf(this.f137649g), Integer.valueOf(lu32.f137649g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137646d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f137647e);
            aVar.mo74318e(3, this.f137648f);
            aVar.mo74318e(4, this.f137649g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f137646d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f137647e) + C52418a.m58678e(3, this.f137648f) + C52418a.m58678e(4, this.f137649g);
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
            C50312lu3 lu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lu32.f137646d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lu32.f137647e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                lu32.f137648f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lu32.f137649g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
