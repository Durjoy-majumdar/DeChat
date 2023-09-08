package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lv4 extends C47465a {

    /* renamed from: d */
    public int f137667d;

    /* renamed from: e */
    public int f137668e;

    /* renamed from: f */
    public int f137669f;

    /* renamed from: g */
    public int f137670g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lv4)) {
            return false;
        }
        lv4 lv4 = (lv4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137667d), Integer.valueOf(lv4.f137667d)) && C46238a.m51546a(Integer.valueOf(this.f137668e), Integer.valueOf(lv4.f137668e)) && C46238a.m51546a(Integer.valueOf(this.f137669f), Integer.valueOf(lv4.f137669f)) && C46238a.m51546a(Integer.valueOf(this.f137670g), Integer.valueOf(lv4.f137670g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137667d);
            aVar.mo74318e(2, this.f137668e);
            aVar.mo74318e(3, this.f137669f);
            aVar.mo74318e(4, this.f137670g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f137667d) + 0 + C52418a.m58678e(2, this.f137668e) + C52418a.m58678e(3, this.f137669f) + C52418a.m58678e(4, this.f137670g);
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
                lv4 lv4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    lv4.f137667d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    lv4.f137668e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    lv4.f137669f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    lv4.f137670g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
