package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rj */
public class C77992rj extends C47465a {

    /* renamed from: d */
    public int f228169d;

    /* renamed from: e */
    public int f228170e;

    /* renamed from: f */
    public int f228171f;

    /* renamed from: g */
    public int f228172g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77992rj)) {
            return false;
        }
        C77992rj rjVar = (C77992rj) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f228169d), Integer.valueOf(rjVar.f228169d)) && C46238a.m51546a(Integer.valueOf(this.f228170e), Integer.valueOf(rjVar.f228170e)) && C46238a.m51546a(Integer.valueOf(this.f228171f), Integer.valueOf(rjVar.f228171f)) && C46238a.m51546a(Integer.valueOf(this.f228172g), Integer.valueOf(rjVar.f228172g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f228169d);
            aVar.mo74318e(2, this.f228170e);
            aVar.mo74318e(3, this.f228171f);
            aVar.mo74318e(4, this.f228172g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f228169d) + 0 + C52418a.m58678e(2, this.f228170e) + C52418a.m58678e(3, this.f228171f) + C52418a.m58678e(4, this.f228172g);
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
                C77992rj rjVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    rjVar.f228169d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    rjVar.f228170e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    rjVar.f228171f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    rjVar.f228172g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
