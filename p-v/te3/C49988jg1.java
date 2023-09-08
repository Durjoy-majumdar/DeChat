package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jg1 */
public class C49988jg1 extends C47465a {

    /* renamed from: d */
    public int f136104d;

    /* renamed from: e */
    public int f136105e;

    /* renamed from: f */
    public int f136106f;

    /* renamed from: g */
    public int f136107g;

    /* renamed from: h */
    public int f136108h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49988jg1)) {
            return false;
        }
        C49988jg1 jg12 = (C49988jg1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136104d), Integer.valueOf(jg12.f136104d)) && C46238a.m51546a(Integer.valueOf(this.f136105e), Integer.valueOf(jg12.f136105e)) && C46238a.m51546a(Integer.valueOf(this.f136106f), Integer.valueOf(jg12.f136106f)) && C46238a.m51546a(Integer.valueOf(this.f136107g), Integer.valueOf(jg12.f136107g)) && C46238a.m51546a(Integer.valueOf(this.f136108h), Integer.valueOf(jg12.f136108h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136104d);
            aVar.mo74318e(2, this.f136105e);
            aVar.mo74318e(3, this.f136106f);
            aVar.mo74318e(4, this.f136107g);
            aVar.mo74318e(5, this.f136108h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f136104d) + 0 + C52418a.m58678e(2, this.f136105e) + C52418a.m58678e(3, this.f136106f) + C52418a.m58678e(4, this.f136107g) + C52418a.m58678e(5, this.f136108h);
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
                C49988jg1 jg12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jg12.f136104d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    jg12.f136105e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    jg12.f136106f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    jg12.f136107g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    jg12.f136108h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
