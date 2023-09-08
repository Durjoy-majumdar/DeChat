package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tu2 */
public class C51449tu2 extends C47465a {

    /* renamed from: d */
    public long f142417d;

    /* renamed from: e */
    public int f142418e;

    /* renamed from: f */
    public int f142419f;

    /* renamed from: g */
    public int f142420g;

    /* renamed from: h */
    public String f142421h;

    /* renamed from: i */
    public int f142422i;

    /* renamed from: j */
    public int f142423j;

    /* renamed from: n */
    public int f142424n;

    /* renamed from: o */
    public boolean f142425o;

    /* renamed from: p */
    public long f142426p;

    /* renamed from: q */
    public int f142427q;

    /* renamed from: r */
    public int f142428r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51449tu2)) {
            return false;
        }
        C51449tu2 tu22 = (C51449tu2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142417d), Long.valueOf(tu22.f142417d)) && C46238a.m51546a(Integer.valueOf(this.f142418e), Integer.valueOf(tu22.f142418e)) && C46238a.m51546a(Integer.valueOf(this.f142419f), Integer.valueOf(tu22.f142419f)) && C46238a.m51546a(Integer.valueOf(this.f142420g), Integer.valueOf(tu22.f142420g)) && C46238a.m51546a(this.f142421h, tu22.f142421h) && C46238a.m51546a(Integer.valueOf(this.f142422i), Integer.valueOf(tu22.f142422i)) && C46238a.m51546a(Integer.valueOf(this.f142423j), Integer.valueOf(tu22.f142423j)) && C46238a.m51546a(Integer.valueOf(this.f142424n), Integer.valueOf(tu22.f142424n)) && C46238a.m51546a(Boolean.valueOf(this.f142425o), Boolean.valueOf(tu22.f142425o)) && C46238a.m51546a(Long.valueOf(this.f142426p), Long.valueOf(tu22.f142426p)) && C46238a.m51546a(Integer.valueOf(this.f142427q), Integer.valueOf(tu22.f142427q)) && C46238a.m51546a(Integer.valueOf(this.f142428r), Integer.valueOf(tu22.f142428r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142417d);
            aVar.mo74318e(2, this.f142418e);
            aVar.mo74318e(3, this.f142419f);
            aVar.mo74318e(4, this.f142420g);
            String str = this.f142421h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f142422i);
            aVar.mo74318e(7, this.f142423j);
            aVar.mo74318e(8, this.f142424n);
            aVar.mo74314a(9, this.f142425o);
            aVar.mo74321h(10, this.f142426p);
            aVar.mo74318e(11, this.f142427q);
            aVar.mo74318e(12, this.f142428r);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f142417d) + 0 + C52418a.m58678e(2, this.f142418e) + C52418a.m58678e(3, this.f142419f) + C52418a.m58678e(4, this.f142420g);
            String str2 = this.f142421h;
            if (str2 != null) {
                h += C52418a.m58683j(5, str2);
            }
            return h + C52418a.m58678e(6, this.f142422i) + C52418a.m58678e(7, this.f142423j) + C52418a.m58678e(8, this.f142424n) + C52418a.m58674a(9, this.f142425o) + C52418a.m58681h(10, this.f142426p) + C52418a.m58678e(11, this.f142427q) + C52418a.m58678e(12, this.f142428r);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51449tu2 tu22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tu22.f142417d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    tu22.f142418e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tu22.f142419f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    tu22.f142420g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    tu22.f142421h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tu22.f142422i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tu22.f142423j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    tu22.f142424n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    tu22.f142425o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    tu22.f142426p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    tu22.f142427q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    tu22.f142428r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
