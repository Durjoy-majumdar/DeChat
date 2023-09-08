package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r50 */
public class C51058r50 extends C47465a {

    /* renamed from: d */
    public long f140695d;

    /* renamed from: e */
    public long f140696e;

    /* renamed from: f */
    public long f140697f;

    /* renamed from: g */
    public long f140698g;

    /* renamed from: h */
    public int f140699h;

    /* renamed from: i */
    public String f140700i;

    /* renamed from: j */
    public int f140701j;

    /* renamed from: n */
    public String f140702n;

    /* renamed from: o */
    public long f140703o;

    /* renamed from: p */
    public long f140704p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51058r50)) {
            return false;
        }
        C51058r50 r502 = (C51058r50) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140695d), Long.valueOf(r502.f140695d)) && C46238a.m51546a(Long.valueOf(this.f140696e), Long.valueOf(r502.f140696e)) && C46238a.m51546a(Long.valueOf(this.f140697f), Long.valueOf(r502.f140697f)) && C46238a.m51546a(Long.valueOf(this.f140698g), Long.valueOf(r502.f140698g)) && C46238a.m51546a(Integer.valueOf(this.f140699h), Integer.valueOf(r502.f140699h)) && C46238a.m51546a(this.f140700i, r502.f140700i) && C46238a.m51546a(Integer.valueOf(this.f140701j), Integer.valueOf(r502.f140701j)) && C46238a.m51546a(this.f140702n, r502.f140702n) && C46238a.m51546a(Long.valueOf(this.f140703o), Long.valueOf(r502.f140703o)) && C46238a.m51546a(Long.valueOf(this.f140704p), Long.valueOf(r502.f140704p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140695d);
            aVar.mo74321h(2, this.f140696e);
            aVar.mo74321h(3, this.f140697f);
            aVar.mo74321h(4, this.f140698g);
            aVar.mo74318e(5, this.f140699h);
            String str = this.f140700i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f140701j);
            String str2 = this.f140702n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74321h(9, this.f140703o);
            aVar.mo74321h(10, this.f140704p);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f140695d) + 0 + C52418a.m58681h(2, this.f140696e) + C52418a.m58681h(3, this.f140697f) + C52418a.m58681h(4, this.f140698g) + C52418a.m58678e(5, this.f140699h);
            String str3 = this.f140700i;
            if (str3 != null) {
                h += C52418a.m58683j(6, str3);
            }
            int e = h + C52418a.m58678e(7, this.f140701j);
            String str4 = this.f140702n;
            if (str4 != null) {
                e += C52418a.m58683j(8, str4);
            }
            return e + C52418a.m58681h(9, this.f140703o) + C52418a.m58681h(10, this.f140704p);
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
            C51058r50 r502 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    r502.f140695d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    r502.f140696e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    r502.f140697f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    r502.f140698g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    r502.f140699h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    r502.f140700i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    r502.f140701j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    r502.f140702n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    r502.f140703o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    r502.f140704p = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
