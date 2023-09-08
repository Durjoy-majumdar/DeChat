package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o40 */
public class C50633o40 extends C47465a {

    /* renamed from: d */
    public int f138945d;

    /* renamed from: e */
    public int f138946e;

    /* renamed from: f */
    public int f138947f;

    /* renamed from: g */
    public int f138948g;

    /* renamed from: h */
    public int f138949h;

    /* renamed from: i */
    public int f138950i;

    /* renamed from: j */
    public int f138951j;

    /* renamed from: n */
    public int f138952n;

    /* renamed from: o */
    public int f138953o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50633o40)) {
            return false;
        }
        C50633o40 o402 = (C50633o40) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138945d), Integer.valueOf(o402.f138945d)) && C46238a.m51546a(Integer.valueOf(this.f138946e), Integer.valueOf(o402.f138946e)) && C46238a.m51546a(Integer.valueOf(this.f138947f), Integer.valueOf(o402.f138947f)) && C46238a.m51546a(Integer.valueOf(this.f138948g), Integer.valueOf(o402.f138948g)) && C46238a.m51546a(Integer.valueOf(this.f138949h), Integer.valueOf(o402.f138949h)) && C46238a.m51546a(Integer.valueOf(this.f138950i), Integer.valueOf(o402.f138950i)) && C46238a.m51546a(Integer.valueOf(this.f138951j), Integer.valueOf(o402.f138951j)) && C46238a.m51546a(Integer.valueOf(this.f138952n), Integer.valueOf(o402.f138952n)) && C46238a.m51546a(Integer.valueOf(this.f138953o), Integer.valueOf(o402.f138953o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138945d);
            aVar.mo74318e(2, this.f138946e);
            aVar.mo74318e(3, this.f138947f);
            aVar.mo74318e(4, this.f138948g);
            aVar.mo74318e(5, this.f138949h);
            aVar.mo74318e(6, this.f138950i);
            aVar.mo74318e(7, this.f138951j);
            aVar.mo74318e(8, this.f138952n);
            aVar.mo74318e(9, this.f138953o);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f138945d) + 0 + C52418a.m58678e(2, this.f138946e) + C52418a.m58678e(3, this.f138947f) + C52418a.m58678e(4, this.f138948g) + C52418a.m58678e(5, this.f138949h) + C52418a.m58678e(6, this.f138950i) + C52418a.m58678e(7, this.f138951j) + C52418a.m58678e(8, this.f138952n) + C52418a.m58678e(9, this.f138953o);
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
                C50633o40 o402 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        o402.f138945d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        o402.f138946e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        o402.f138947f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        o402.f138948g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        o402.f138949h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        o402.f138950i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        o402.f138951j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        o402.f138952n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        o402.f138953o = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
