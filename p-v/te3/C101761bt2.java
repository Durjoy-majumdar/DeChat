package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bt2 */
public class C101761bt2 extends C47465a {

    /* renamed from: d */
    public String f297983d;

    /* renamed from: e */
    public String f297984e;

    /* renamed from: f */
    public int f297985f;

    /* renamed from: g */
    public String f297986g;

    /* renamed from: h */
    public String f297987h;

    /* renamed from: i */
    public String f297988i;

    /* renamed from: j */
    public String f297989j;

    /* renamed from: n */
    public int f297990n;

    /* renamed from: o */
    public int f297991o;

    /* renamed from: p */
    public C101764ch2 f297992p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101761bt2)) {
            return false;
        }
        C101761bt2 bt22 = (C101761bt2) aVar;
        return C46238a.m51546a(this.f297983d, bt22.f297983d) && C46238a.m51546a(this.f297984e, bt22.f297984e) && C46238a.m51546a(Integer.valueOf(this.f297985f), Integer.valueOf(bt22.f297985f)) && C46238a.m51546a(this.f297986g, bt22.f297986g) && C46238a.m51546a(this.f297987h, bt22.f297987h) && C46238a.m51546a(this.f297988i, bt22.f297988i) && C46238a.m51546a(this.f297989j, bt22.f297989j) && C46238a.m51546a(Integer.valueOf(this.f297990n), Integer.valueOf(bt22.f297990n)) && C46238a.m51546a(Integer.valueOf(this.f297991o), Integer.valueOf(bt22.f297991o)) && C46238a.m51546a(this.f297992p, bt22.f297992p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f297983d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f297984e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f297985f);
            String str3 = this.f297986g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f297987h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f297988i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f297989j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f297990n);
            aVar.mo74318e(9, this.f297991o);
            C101764ch2 ch22 = this.f297992p;
            if (ch22 != null) {
                aVar.mo74322i(10, ch22.computeSize());
                this.f297992p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f297983d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f297984e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int e = i2 + C52418a.m58678e(3, this.f297985f);
            String str9 = this.f297986g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f297987h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f297988i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f297989j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            int e2 = e + C52418a.m58678e(8, this.f297990n) + C52418a.m58678e(9, this.f297991o);
            C101764ch2 ch23 = this.f297992p;
            return ch23 != null ? e2 + C52418a.m58682i(10, ch23.computeSize()) : e2;
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
            C101761bt2 bt22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bt22.f297983d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bt22.f297984e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bt22.f297985f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bt22.f297986g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bt22.f297987h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bt22.f297988i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bt22.f297989j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bt22.f297990n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    bt22.f297991o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101764ch2 ch24 = new C101764ch2();
                        if (bArr != null && bArr.length > 0) {
                            ch24.parseFrom(bArr);
                        }
                        bt22.f297992p = ch24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
