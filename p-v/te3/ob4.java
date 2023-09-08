package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ob4 extends C47465a {

    /* renamed from: d */
    public long f299014d;

    /* renamed from: e */
    public String f299015e;

    /* renamed from: f */
    public String f299016f;

    /* renamed from: g */
    public String f299017g;

    /* renamed from: h */
    public String f299018h;

    /* renamed from: i */
    public int f299019i;

    /* renamed from: j */
    public String f299020j;

    /* renamed from: n */
    public int f299021n;

    /* renamed from: o */
    public int f299022o;

    /* renamed from: p */
    public int f299023p;

    /* renamed from: q */
    public int f299024q;

    /* renamed from: r */
    public int f299025r;

    /* renamed from: s */
    public String f299026s;

    /* renamed from: t */
    public int f299027t;

    /* renamed from: u */
    public int f299028u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ob4)) {
            return false;
        }
        ob4 ob4 = (ob4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f299014d), Long.valueOf(ob4.f299014d)) && C46238a.m51546a(this.f299015e, ob4.f299015e) && C46238a.m51546a(this.f299016f, ob4.f299016f) && C46238a.m51546a(this.f299017g, ob4.f299017g) && C46238a.m51546a(this.f299018h, ob4.f299018h) && C46238a.m51546a(Integer.valueOf(this.f299019i), Integer.valueOf(ob4.f299019i)) && C46238a.m51546a(this.f299020j, ob4.f299020j) && C46238a.m51546a(Integer.valueOf(this.f299021n), Integer.valueOf(ob4.f299021n)) && C46238a.m51546a(Integer.valueOf(this.f299022o), Integer.valueOf(ob4.f299022o)) && C46238a.m51546a(Integer.valueOf(this.f299023p), Integer.valueOf(ob4.f299023p)) && C46238a.m51546a(Integer.valueOf(this.f299024q), Integer.valueOf(ob4.f299024q)) && C46238a.m51546a(Integer.valueOf(this.f299025r), Integer.valueOf(ob4.f299025r)) && C46238a.m51546a(this.f299026s, ob4.f299026s) && C46238a.m51546a(Integer.valueOf(this.f299027t), Integer.valueOf(ob4.f299027t)) && C46238a.m51546a(Integer.valueOf(this.f299028u), Integer.valueOf(ob4.f299028u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f299014d);
            String str = this.f299015e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f299016f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f299017g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f299018h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f299019i);
            String str5 = this.f299020j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f299021n);
            aVar.mo74318e(9, this.f299022o);
            aVar.mo74318e(10, this.f299023p);
            aVar.mo74318e(11, this.f299024q);
            aVar.mo74318e(12, this.f299025r);
            String str6 = this.f299026s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            aVar.mo74318e(14, this.f299027t);
            aVar.mo74318e(15, this.f299028u);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f299014d) + 0;
            String str7 = this.f299015e;
            if (str7 != null) {
                h += C52418a.m58683j(2, str7);
            }
            String str8 = this.f299016f;
            if (str8 != null) {
                h += C52418a.m58683j(3, str8);
            }
            String str9 = this.f299017g;
            if (str9 != null) {
                h += C52418a.m58683j(4, str9);
            }
            String str10 = this.f299018h;
            if (str10 != null) {
                h += C52418a.m58683j(5, str10);
            }
            int e = h + C52418a.m58678e(6, this.f299019i);
            String str11 = this.f299020j;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            int e2 = e + C52418a.m58678e(8, this.f299021n) + C52418a.m58678e(9, this.f299022o) + C52418a.m58678e(10, this.f299023p) + C52418a.m58678e(11, this.f299024q) + C52418a.m58678e(12, this.f299025r);
            String str12 = this.f299026s;
            if (str12 != null) {
                e2 += C52418a.m58683j(13, str12);
            }
            return e2 + C52418a.m58678e(14, this.f299027t) + C52418a.m58678e(15, this.f299028u);
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
            ob4 ob4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ob4.f299014d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ob4.f299015e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ob4.f299016f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ob4.f299017g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ob4.f299018h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ob4.f299019i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ob4.f299020j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ob4.f299021n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ob4.f299022o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ob4.f299023p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ob4.f299024q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ob4.f299025r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    ob4.f299026s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ob4.f299027t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    ob4.f299028u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
