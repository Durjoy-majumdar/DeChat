package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v33 */
public class C64765v33 extends C47465a {

    /* renamed from: d */
    public int f185820d;

    /* renamed from: e */
    public int f185821e;

    /* renamed from: f */
    public int f185822f;

    /* renamed from: g */
    public int f185823g;

    /* renamed from: h */
    public int f185824h;

    /* renamed from: i */
    public int f185825i;

    /* renamed from: j */
    public int f185826j;

    /* renamed from: n */
    public int f185827n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64765v33)) {
            return false;
        }
        C64765v33 v332 = (C64765v33) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185820d), Integer.valueOf(v332.f185820d)) && C46238a.m51546a(Integer.valueOf(this.f185821e), Integer.valueOf(v332.f185821e)) && C46238a.m51546a(Integer.valueOf(this.f185822f), Integer.valueOf(v332.f185822f)) && C46238a.m51546a(Integer.valueOf(this.f185823g), Integer.valueOf(v332.f185823g)) && C46238a.m51546a(Integer.valueOf(this.f185824h), Integer.valueOf(v332.f185824h)) && C46238a.m51546a(Integer.valueOf(this.f185825i), Integer.valueOf(v332.f185825i)) && C46238a.m51546a(Integer.valueOf(this.f185826j), Integer.valueOf(v332.f185826j)) && C46238a.m51546a(Integer.valueOf(this.f185827n), Integer.valueOf(v332.f185827n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185820d);
            aVar.mo74318e(2, this.f185821e);
            aVar.mo74318e(3, this.f185822f);
            aVar.mo74318e(4, this.f185823g);
            aVar.mo74318e(5, this.f185824h);
            aVar.mo74318e(6, this.f185825i);
            aVar.mo74318e(7, this.f185826j);
            aVar.mo74318e(8, this.f185827n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f185820d) + 0 + C52418a.m58678e(2, this.f185821e) + C52418a.m58678e(3, this.f185822f) + C52418a.m58678e(4, this.f185823g) + C52418a.m58678e(5, this.f185824h) + C52418a.m58678e(6, this.f185825i) + C52418a.m58678e(7, this.f185826j) + C52418a.m58678e(8, this.f185827n);
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
                C64765v33 v332 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        v332.f185820d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        v332.f185821e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        v332.f185822f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        v332.f185823g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        v332.f185824h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        v332.f185825i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        v332.f185826j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        v332.f185827n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
