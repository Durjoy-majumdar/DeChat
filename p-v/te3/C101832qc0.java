package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qc0 */
public class C101832qc0 extends C47465a {

    /* renamed from: d */
    public String f299210d;

    /* renamed from: e */
    public String f299211e;

    /* renamed from: f */
    public String f299212f;

    /* renamed from: g */
    public int f299213g;

    /* renamed from: h */
    public String f299214h;

    /* renamed from: i */
    public String f299215i;

    /* renamed from: j */
    public int f299216j;

    /* renamed from: n */
    public String f299217n;

    /* renamed from: o */
    public int f299218o;

    /* renamed from: p */
    public int f299219p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101832qc0)) {
            return false;
        }
        C101832qc0 qc02 = (C101832qc0) aVar;
        return C46238a.m51546a(this.f299210d, qc02.f299210d) && C46238a.m51546a(this.f299211e, qc02.f299211e) && C46238a.m51546a(this.f299212f, qc02.f299212f) && C46238a.m51546a(Integer.valueOf(this.f299213g), Integer.valueOf(qc02.f299213g)) && C46238a.m51546a(this.f299214h, qc02.f299214h) && C46238a.m51546a(this.f299215i, qc02.f299215i) && C46238a.m51546a(Integer.valueOf(this.f299216j), Integer.valueOf(qc02.f299216j)) && C46238a.m51546a(this.f299217n, qc02.f299217n) && C46238a.m51546a(Integer.valueOf(this.f299218o), Integer.valueOf(qc02.f299218o)) && C46238a.m51546a(Integer.valueOf(this.f299219p), Integer.valueOf(qc02.f299219p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299210d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299211e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299212f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f299213g);
            String str4 = this.f299214h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f299215i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f299216j);
            String str6 = this.f299217n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.f299218o);
            aVar.mo74318e(10, this.f299219p);
            return 0;
        } else if (i == 1) {
            String str7 = this.f299210d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f299211e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f299212f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int e = i2 + C52418a.m58678e(4, this.f299213g);
            String str10 = this.f299214h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f299215i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            int e2 = e + C52418a.m58678e(7, this.f299216j);
            String str12 = this.f299217n;
            if (str12 != null) {
                e2 += C52418a.m58683j(8, str12);
            }
            return e2 + C52418a.m58678e(9, this.f299218o) + C52418a.m58678e(10, this.f299219p);
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
            C101832qc0 qc02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qc02.f299210d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qc02.f299211e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qc02.f299212f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qc02.f299213g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qc02.f299214h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qc02.f299215i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qc02.f299216j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    qc02.f299217n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    qc02.f299218o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    qc02.f299219p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
