package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vb3 */
public class C51676vb3 extends C47465a {

    /* renamed from: d */
    public String f143417d;

    /* renamed from: e */
    public int f143418e;

    /* renamed from: f */
    public String f143419f;

    /* renamed from: g */
    public String f143420g;

    /* renamed from: h */
    public String f143421h;

    /* renamed from: i */
    public int f143422i;

    /* renamed from: j */
    public String f143423j;

    /* renamed from: n */
    public String f143424n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51676vb3)) {
            return false;
        }
        C51676vb3 vb32 = (C51676vb3) aVar;
        return C46238a.m51546a(this.f143417d, vb32.f143417d) && C46238a.m51546a(Integer.valueOf(this.f143418e), Integer.valueOf(vb32.f143418e)) && C46238a.m51546a(this.f143419f, vb32.f143419f) && C46238a.m51546a(this.f143420g, vb32.f143420g) && C46238a.m51546a(this.f143421h, vb32.f143421h) && C46238a.m51546a(Integer.valueOf(this.f143422i), Integer.valueOf(vb32.f143422i)) && C46238a.m51546a(this.f143423j, vb32.f143423j) && C46238a.m51546a(this.f143424n, vb32.f143424n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143417d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f143418e);
            String str2 = this.f143419f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f143420g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f143421h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f143422i);
            String str5 = this.f143423j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f143424n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f143417d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            int e = i2 + C52418a.m58678e(2, this.f143418e);
            String str8 = this.f143419f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f143420g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f143421h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            int e2 = e + C52418a.m58678e(6, this.f143422i);
            String str11 = this.f143423j;
            if (str11 != null) {
                e2 += C52418a.m58683j(7, str11);
            }
            String str12 = this.f143424n;
            return str12 != null ? e2 + C52418a.m58683j(8, str12) : e2;
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
            C51676vb3 vb32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vb32.f143417d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    vb32.f143418e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vb32.f143419f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vb32.f143420g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vb32.f143421h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vb32.f143422i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vb32.f143423j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    vb32.f143424n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
