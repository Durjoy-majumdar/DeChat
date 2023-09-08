package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class op4 extends C47465a {

    /* renamed from: d */
    public int f184687d;

    /* renamed from: e */
    public int f184688e;

    /* renamed from: f */
    public long f184689f;

    /* renamed from: g */
    public long f184690g;

    /* renamed from: h */
    public long f184691h;

    /* renamed from: i */
    public long f184692i;

    /* renamed from: j */
    public long f184693j;

    /* renamed from: n */
    public long f184694n;

    /* renamed from: o */
    public long f184695o;

    /* renamed from: p */
    public long f184696p;

    /* renamed from: q */
    public int f184697q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof op4)) {
            return false;
        }
        op4 op4 = (op4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184687d), Integer.valueOf(op4.f184687d)) && C46238a.m51546a(Integer.valueOf(this.f184688e), Integer.valueOf(op4.f184688e)) && C46238a.m51546a(Long.valueOf(this.f184689f), Long.valueOf(op4.f184689f)) && C46238a.m51546a(Long.valueOf(this.f184690g), Long.valueOf(op4.f184690g)) && C46238a.m51546a(Long.valueOf(this.f184691h), Long.valueOf(op4.f184691h)) && C46238a.m51546a(Long.valueOf(this.f184692i), Long.valueOf(op4.f184692i)) && C46238a.m51546a(Long.valueOf(this.f184693j), Long.valueOf(op4.f184693j)) && C46238a.m51546a(Long.valueOf(this.f184694n), Long.valueOf(op4.f184694n)) && C46238a.m51546a(Long.valueOf(this.f184695o), Long.valueOf(op4.f184695o)) && C46238a.m51546a(Long.valueOf(this.f184696p), Long.valueOf(op4.f184696p)) && C46238a.m51546a(Integer.valueOf(this.f184697q), Integer.valueOf(op4.f184697q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184687d);
            aVar.mo74318e(2, this.f184688e);
            aVar.mo74321h(3, this.f184689f);
            aVar.mo74321h(4, this.f184690g);
            aVar.mo74321h(5, this.f184691h);
            aVar.mo74321h(6, this.f184692i);
            aVar.mo74321h(7, this.f184693j);
            aVar.mo74321h(8, this.f184694n);
            aVar.mo74321h(9, this.f184695o);
            aVar.mo74321h(10, this.f184696p);
            aVar.mo74318e(11, this.f184697q);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f184687d) + 0 + C52418a.m58678e(2, this.f184688e) + C52418a.m58681h(3, this.f184689f) + C52418a.m58681h(4, this.f184690g) + C52418a.m58681h(5, this.f184691h) + C52418a.m58681h(6, this.f184692i) + C52418a.m58681h(7, this.f184693j) + C52418a.m58681h(8, this.f184694n) + C52418a.m58681h(9, this.f184695o) + C52418a.m58681h(10, this.f184696p) + C52418a.m58678e(11, this.f184697q);
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
                op4 op4 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        op4.f184687d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        op4.f184688e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        op4.f184689f = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        op4.f184690g = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        op4.f184691h = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        op4.f184692i = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        op4.f184693j = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        op4.f184694n = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        op4.f184695o = aVar3.mo141631i(intValue);
                        return 0;
                    case 10:
                        op4.f184696p = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        op4.f184697q = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
