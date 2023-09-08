package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class uj4 extends C47465a {

    /* renamed from: d */
    public long f142880d;

    /* renamed from: e */
    public long f142881e;

    /* renamed from: f */
    public long f142882f;

    /* renamed from: g */
    public double f142883g;

    /* renamed from: h */
    public double f142884h;

    /* renamed from: i */
    public double f142885i;

    /* renamed from: j */
    public double f142886j;

    /* renamed from: n */
    public long f142887n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uj4)) {
            return false;
        }
        uj4 uj4 = (uj4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142880d), Long.valueOf(uj4.f142880d)) && C46238a.m51546a(Long.valueOf(this.f142881e), Long.valueOf(uj4.f142881e)) && C46238a.m51546a(Long.valueOf(this.f142882f), Long.valueOf(uj4.f142882f)) && C46238a.m51546a(Double.valueOf(this.f142883g), Double.valueOf(uj4.f142883g)) && C46238a.m51546a(Double.valueOf(this.f142884h), Double.valueOf(uj4.f142884h)) && C46238a.m51546a(Double.valueOf(this.f142885i), Double.valueOf(uj4.f142885i)) && C46238a.m51546a(Double.valueOf(this.f142886j), Double.valueOf(uj4.f142886j)) && C46238a.m51546a(Long.valueOf(this.f142887n), Long.valueOf(uj4.f142887n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142880d);
            aVar.mo74321h(2, this.f142881e);
            aVar.mo74321h(3, this.f142882f);
            aVar.mo74316c(4, this.f142883g);
            aVar.mo74316c(5, this.f142884h);
            aVar.mo74316c(6, this.f142885i);
            aVar.mo74316c(7, this.f142886j);
            aVar.mo74321h(8, this.f142887n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f142880d) + 0 + C52418a.m58681h(2, this.f142881e) + C52418a.m58681h(3, this.f142882f) + C52418a.m58676c(4, this.f142883g) + C52418a.m58676c(5, this.f142884h) + C52418a.m58676c(6, this.f142885i) + C52418a.m58676c(7, this.f142886j) + C52418a.m58681h(8, this.f142887n);
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
                uj4 uj4 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        uj4.f142880d = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        uj4.f142881e = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        uj4.f142882f = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        uj4.f142883g = aVar3.mo141627e(intValue);
                        return 0;
                    case 5:
                        uj4.f142884h = aVar3.mo141627e(intValue);
                        return 0;
                    case 6:
                        uj4.f142885i = aVar3.mo141627e(intValue);
                        return 0;
                    case 7:
                        uj4.f142886j = aVar3.mo141627e(intValue);
                        return 0;
                    case 8:
                        uj4.f142887n = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
