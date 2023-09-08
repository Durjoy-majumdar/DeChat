package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b6 */
public class C48812b6 extends C47465a {

    /* renamed from: d */
    public String f130962d;

    /* renamed from: e */
    public String f130963e;

    /* renamed from: f */
    public int f130964f = 600;

    /* renamed from: g */
    public String f130965g;

    /* renamed from: h */
    public int f130966h;

    /* renamed from: i */
    public boolean f130967i;

    /* renamed from: j */
    public int f130968j;

    /* renamed from: n */
    public int f130969n;

    /* renamed from: o */
    public int f130970o;

    /* renamed from: p */
    public int f130971p;

    /* renamed from: q */
    public int f130972q;

    /* renamed from: r */
    public int f130973r = -1;

    /* renamed from: s */
    public boolean f130974s = false;

    /* renamed from: t */
    public LinkedList<zg4> f130975t = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48812b6)) {
            return false;
        }
        C48812b6 b6Var = (C48812b6) aVar;
        return C46238a.m51546a(this.f130962d, b6Var.f130962d) && C46238a.m51546a(this.f130963e, b6Var.f130963e) && C46238a.m51546a(Integer.valueOf(this.f130964f), Integer.valueOf(b6Var.f130964f)) && C46238a.m51546a(this.f130965g, b6Var.f130965g) && C46238a.m51546a(Integer.valueOf(this.f130966h), Integer.valueOf(b6Var.f130966h)) && C46238a.m51546a(Boolean.valueOf(this.f130967i), Boolean.valueOf(b6Var.f130967i)) && C46238a.m51546a(Integer.valueOf(this.f130968j), Integer.valueOf(b6Var.f130968j)) && C46238a.m51546a(Integer.valueOf(this.f130969n), Integer.valueOf(b6Var.f130969n)) && C46238a.m51546a(Integer.valueOf(this.f130970o), Integer.valueOf(b6Var.f130970o)) && C46238a.m51546a(Integer.valueOf(this.f130971p), Integer.valueOf(b6Var.f130971p)) && C46238a.m51546a(Integer.valueOf(this.f130972q), Integer.valueOf(b6Var.f130972q)) && C46238a.m51546a(Integer.valueOf(this.f130973r), Integer.valueOf(b6Var.f130973r)) && C46238a.m51546a(Boolean.valueOf(this.f130974s), Boolean.valueOf(b6Var.f130974s)) && C46238a.m51546a(this.f130975t, b6Var.f130975t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130962d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130963e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f130964f);
            String str3 = this.f130965g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f130966h);
            aVar.mo74314a(6, this.f130967i);
            aVar.mo74318e(7, this.f130968j);
            aVar.mo74318e(8, this.f130969n);
            aVar.mo74318e(9, this.f130970o);
            aVar.mo74318e(10, this.f130971p);
            aVar.mo74318e(11, this.f130972q);
            aVar.mo74318e(12, this.f130973r);
            aVar.mo74314a(13, this.f130974s);
            aVar.mo74320g(14, 8, this.f130975t);
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f130962d;
            if (str4 != null) {
                i3 = C52418a.m58683j(1, str4) + 0;
            }
            String str5 = this.f130963e;
            if (str5 != null) {
                i3 += C52418a.m58683j(2, str5);
            }
            int e = i3 + C52418a.m58678e(3, this.f130964f);
            String str6 = this.f130965g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f130966h) + C52418a.m58674a(6, this.f130967i) + C52418a.m58678e(7, this.f130968j) + C52418a.m58678e(8, this.f130969n) + C52418a.m58678e(9, this.f130970o) + C52418a.m58678e(10, this.f130971p) + C52418a.m58678e(11, this.f130972q) + C52418a.m58678e(12, this.f130973r) + C52418a.m58674a(13, this.f130974s) + C52418a.m58680g(14, 8, this.f130975t);
        } else if (i2 == 2) {
            this.f130975t.clear();
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
            C48812b6 b6Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b6Var.f130962d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    b6Var.f130963e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    b6Var.f130964f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    b6Var.f130965g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    b6Var.f130966h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    b6Var.f130967i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    b6Var.f130968j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    b6Var.f130969n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    b6Var.f130970o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    b6Var.f130971p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    b6Var.f130972q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    b6Var.f130973r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    b6Var.f130974s = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        zg4 zg4 = new zg4();
                        if (bArr != null && bArr.length > 0) {
                            zg4.parseFrom(bArr);
                        }
                        b6Var.f130975t.add(zg4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
