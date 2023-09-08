package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t9 */
public class C51360t9 extends C47465a {

    /* renamed from: d */
    public String f142039d;

    /* renamed from: e */
    public String f142040e;

    /* renamed from: f */
    public String f142041f;

    /* renamed from: g */
    public int f142042g;

    /* renamed from: h */
    public int f142043h;

    /* renamed from: i */
    public LinkedList<C49674h90> f142044i = new LinkedList<>();

    /* renamed from: j */
    public String f142045j;

    /* renamed from: n */
    public String f142046n;

    /* renamed from: o */
    public String f142047o;

    /* renamed from: p */
    public String f142048p;

    /* renamed from: q */
    public String f142049q;

    /* renamed from: r */
    public long f142050r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51360t9)) {
            return false;
        }
        C51360t9 t9Var = (C51360t9) aVar;
        return C46238a.m51546a(this.f142039d, t9Var.f142039d) && C46238a.m51546a(this.f142040e, t9Var.f142040e) && C46238a.m51546a(this.f142041f, t9Var.f142041f) && C46238a.m51546a(Integer.valueOf(this.f142042g), Integer.valueOf(t9Var.f142042g)) && C46238a.m51546a(Integer.valueOf(this.f142043h), Integer.valueOf(t9Var.f142043h)) && C46238a.m51546a(this.f142044i, t9Var.f142044i) && C46238a.m51546a(this.f142045j, t9Var.f142045j) && C46238a.m51546a(this.f142046n, t9Var.f142046n) && C46238a.m51546a(this.f142047o, t9Var.f142047o) && C46238a.m51546a(this.f142048p, t9Var.f142048p) && C46238a.m51546a(this.f142049q, t9Var.f142049q) && C46238a.m51546a(Long.valueOf(this.f142050r), Long.valueOf(t9Var.f142050r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142039d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f142040e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f142041f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f142042g);
            aVar.mo74318e(5, this.f142043h);
            aVar.mo74320g(6, 8, this.f142044i);
            String str4 = this.f142045j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f142046n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f142047o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f142048p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f142049q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            aVar.mo74321h(12, this.f142050r);
            return 0;
        } else if (i == 1) {
            String str9 = this.f142039d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f142040e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f142041f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            int e = i2 + C52418a.m58678e(4, this.f142042g) + C52418a.m58678e(5, this.f142043h) + C52418a.m58680g(6, 8, this.f142044i);
            String str12 = this.f142045j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f142046n;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            String str14 = this.f142047o;
            if (str14 != null) {
                e += C52418a.m58683j(9, str14);
            }
            String str15 = this.f142048p;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            String str16 = this.f142049q;
            if (str16 != null) {
                e += C52418a.m58683j(11, str16);
            }
            return e + C52418a.m58681h(12, this.f142050r);
        } else if (i == 2) {
            this.f142044i.clear();
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
            C51360t9 t9Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t9Var.f142039d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    t9Var.f142040e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t9Var.f142041f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t9Var.f142042g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    t9Var.f142043h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49674h90 h902 = new C49674h90();
                        if (bArr != null && bArr.length > 0) {
                            h902.parseFrom(bArr);
                        }
                        t9Var.f142044i.add(h902);
                    }
                    return 0;
                case 7:
                    t9Var.f142045j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    t9Var.f142046n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    t9Var.f142047o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    t9Var.f142048p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    t9Var.f142049q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    t9Var.f142050r = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
