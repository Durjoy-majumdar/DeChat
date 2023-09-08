package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class i84 extends C47465a {

    /* renamed from: d */
    public float f298386d;

    /* renamed from: e */
    public float f298387e;

    /* renamed from: f */
    public float f298388f;

    /* renamed from: g */
    public float f298389g;

    /* renamed from: h */
    public int f298390h;

    /* renamed from: i */
    public long f298391i;

    /* renamed from: j */
    public long f298392j;

    /* renamed from: n */
    public float f298393n;

    /* renamed from: o */
    public int f298394o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof i84)) {
            return false;
        }
        i84 i84 = (i84) aVar;
        return C46238a.m51546a(Float.valueOf(this.f298386d), Float.valueOf(i84.f298386d)) && C46238a.m51546a(Float.valueOf(this.f298387e), Float.valueOf(i84.f298387e)) && C46238a.m51546a(Float.valueOf(this.f298388f), Float.valueOf(i84.f298388f)) && C46238a.m51546a(Float.valueOf(this.f298389g), Float.valueOf(i84.f298389g)) && C46238a.m51546a(Integer.valueOf(this.f298390h), Integer.valueOf(i84.f298390h)) && C46238a.m51546a(Long.valueOf(this.f298391i), Long.valueOf(i84.f298391i)) && C46238a.m51546a(Long.valueOf(this.f298392j), Long.valueOf(i84.f298392j)) && C46238a.m51546a(Float.valueOf(this.f298393n), Float.valueOf(i84.f298393n)) && C46238a.m51546a(Integer.valueOf(this.f298394o), Integer.valueOf(i84.f298394o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f298386d);
            aVar.mo74317d(2, this.f298387e);
            aVar.mo74317d(3, this.f298388f);
            aVar.mo74317d(4, this.f298389g);
            aVar.mo74318e(5, this.f298390h);
            aVar.mo74321h(6, this.f298391i);
            aVar.mo74321h(7, this.f298392j);
            aVar.mo74317d(8, this.f298393n);
            aVar.mo74318e(9, this.f298394o);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.f298386d) + 0 + C52418a.m58677d(2, this.f298387e) + C52418a.m58677d(3, this.f298388f) + C52418a.m58677d(4, this.f298389g) + C52418a.m58678e(5, this.f298390h) + C52418a.m58681h(6, this.f298391i) + C52418a.m58681h(7, this.f298392j) + C52418a.m58677d(8, this.f298393n) + C52418a.m58678e(9, this.f298394o);
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
                i84 i84 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        i84.f298386d = aVar3.mo141628f(intValue);
                        return 0;
                    case 2:
                        i84.f298387e = aVar3.mo141628f(intValue);
                        return 0;
                    case 3:
                        i84.f298388f = aVar3.mo141628f(intValue);
                        return 0;
                    case 4:
                        i84.f298389g = aVar3.mo141628f(intValue);
                        return 0;
                    case 5:
                        i84.f298390h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        i84.f298391i = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        i84.f298392j = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        i84.f298393n = aVar3.mo141628f(intValue);
                        return 0;
                    case 9:
                        i84.f298394o = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
