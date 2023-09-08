package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m43 */
public class C50353m43 extends C47465a {

    /* renamed from: d */
    public int f137834d;

    /* renamed from: e */
    public int f137835e;

    /* renamed from: f */
    public int f137836f;

    /* renamed from: g */
    public int f137837g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50353m43)) {
            return false;
        }
        C50353m43 m432 = (C50353m43) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137834d), Integer.valueOf(m432.f137834d)) && C46238a.m51546a(Integer.valueOf(this.f137835e), Integer.valueOf(m432.f137835e)) && C46238a.m51546a(Integer.valueOf(this.f137836f), Integer.valueOf(m432.f137836f)) && C46238a.m51546a(Integer.valueOf(this.f137837g), Integer.valueOf(m432.f137837g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137834d);
            aVar.mo74318e(2, this.f137835e);
            aVar.mo74318e(3, this.f137836f);
            aVar.mo74318e(4, this.f137837g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f137834d) + 0 + C52418a.m58678e(2, this.f137835e) + C52418a.m58678e(3, this.f137836f) + C52418a.m58678e(4, this.f137837g);
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
                C50353m43 m432 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    m432.f137834d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    m432.f137835e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    m432.f137836f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    m432.f137837g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
