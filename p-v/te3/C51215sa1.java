package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sa1 */
public class C51215sa1 extends C47465a {

    /* renamed from: d */
    public int f141388d;

    /* renamed from: e */
    public String f141389e;

    /* renamed from: f */
    public LinkedList<C52172yv> f141390f = new LinkedList<>();

    /* renamed from: g */
    public int f141391g;

    /* renamed from: h */
    public int f141392h;

    /* renamed from: i */
    public String f141393i;

    /* renamed from: j */
    public int f141394j;

    /* renamed from: n */
    public int f141395n;

    /* renamed from: o */
    public long f141396o;

    /* renamed from: p */
    public int f141397p;

    /* renamed from: q */
    public int f141398q;

    /* renamed from: r */
    public int f141399r;

    /* renamed from: s */
    public String f141400s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51215sa1)) {
            return false;
        }
        C51215sa1 sa12 = (C51215sa1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141388d), Integer.valueOf(sa12.f141388d)) && C46238a.m51546a(this.f141389e, sa12.f141389e) && C46238a.m51546a(this.f141390f, sa12.f141390f) && C46238a.m51546a(Integer.valueOf(this.f141391g), Integer.valueOf(sa12.f141391g)) && C46238a.m51546a(Integer.valueOf(this.f141392h), Integer.valueOf(sa12.f141392h)) && C46238a.m51546a(this.f141393i, sa12.f141393i) && C46238a.m51546a(Integer.valueOf(this.f141394j), Integer.valueOf(sa12.f141394j)) && C46238a.m51546a(Integer.valueOf(this.f141395n), Integer.valueOf(sa12.f141395n)) && C46238a.m51546a(Long.valueOf(this.f141396o), Long.valueOf(sa12.f141396o)) && C46238a.m51546a(Integer.valueOf(this.f141397p), Integer.valueOf(sa12.f141397p)) && C46238a.m51546a(Integer.valueOf(this.f141398q), Integer.valueOf(sa12.f141398q)) && C46238a.m51546a(Integer.valueOf(this.f141399r), Integer.valueOf(sa12.f141399r)) && C46238a.m51546a(this.f141400s, sa12.f141400s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141388d);
            String str = this.f141389e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f141390f);
            aVar.mo74318e(4, this.f141391g);
            aVar.mo74318e(5, this.f141392h);
            String str2 = this.f141393i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f141394j);
            aVar.mo74318e(8, this.f141395n);
            aVar.mo74321h(9, this.f141396o);
            aVar.mo74318e(10, this.f141397p);
            aVar.mo74318e(11, this.f141398q);
            aVar.mo74318e(12, this.f141399r);
            String str3 = this.f141400s;
            if (str3 == null) {
                return 0;
            }
            aVar.mo74323j(13, str3);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f141388d) + 0;
            String str4 = this.f141389e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int g = e + C52418a.m58680g(3, 8, this.f141390f) + C52418a.m58678e(4, this.f141391g) + C52418a.m58678e(5, this.f141392h);
            String str5 = this.f141393i;
            if (str5 != null) {
                g += C52418a.m58683j(6, str5);
            }
            int e2 = g + C52418a.m58678e(7, this.f141394j) + C52418a.m58678e(8, this.f141395n) + C52418a.m58681h(9, this.f141396o) + C52418a.m58678e(10, this.f141397p) + C52418a.m58678e(11, this.f141398q) + C52418a.m58678e(12, this.f141399r);
            String str6 = this.f141400s;
            return str6 != null ? e2 + C52418a.m58683j(13, str6) : e2;
        } else if (i2 == 2) {
            this.f141390f.clear();
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
            C51215sa1 sa12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sa12.f141388d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    sa12.f141389e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52172yv yvVar = new C52172yv();
                        if (bArr != null && bArr.length > 0) {
                            yvVar.parseFrom(bArr);
                        }
                        sa12.f141390f.add(yvVar);
                    }
                    return 0;
                case 4:
                    sa12.f141391g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sa12.f141392h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    sa12.f141393i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    sa12.f141394j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    sa12.f141395n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    sa12.f141396o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    sa12.f141397p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    sa12.f141398q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    sa12.f141399r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    sa12.f141400s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
