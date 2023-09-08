package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ad0 */
public class C101755ad0 extends C47465a {

    /* renamed from: d */
    public int f297848d = -1;

    /* renamed from: e */
    public int f297849e = 0;

    /* renamed from: f */
    public int f297850f;

    /* renamed from: g */
    public int f297851g;

    /* renamed from: h */
    public int f297852h;

    /* renamed from: i */
    public int f297853i;

    /* renamed from: j */
    public String f297854j;

    /* renamed from: n */
    public String f297855n;

    /* renamed from: o */
    public String f297856o;

    /* renamed from: p */
    public int f297857p;

    /* renamed from: q */
    public C101760bd0 f297858q;

    /* renamed from: r */
    public String f297859r;

    /* renamed from: s */
    public String f297860s;

    /* renamed from: t */
    public String f297861t;

    /* renamed from: u */
    public int f297862u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101755ad0)) {
            return false;
        }
        C101755ad0 ad02 = (C101755ad0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f297848d), Integer.valueOf(ad02.f297848d)) && C46238a.m51546a(Integer.valueOf(this.f297849e), Integer.valueOf(ad02.f297849e)) && C46238a.m51546a(Integer.valueOf(this.f297850f), Integer.valueOf(ad02.f297850f)) && C46238a.m51546a(Integer.valueOf(this.f297851g), Integer.valueOf(ad02.f297851g)) && C46238a.m51546a(Integer.valueOf(this.f297852h), Integer.valueOf(ad02.f297852h)) && C46238a.m51546a(Integer.valueOf(this.f297853i), Integer.valueOf(ad02.f297853i)) && C46238a.m51546a(this.f297854j, ad02.f297854j) && C46238a.m51546a(this.f297855n, ad02.f297855n) && C46238a.m51546a(this.f297856o, ad02.f297856o) && C46238a.m51546a(Integer.valueOf(this.f297857p), Integer.valueOf(ad02.f297857p)) && C46238a.m51546a(this.f297858q, ad02.f297858q) && C46238a.m51546a(this.f297859r, ad02.f297859r) && C46238a.m51546a(this.f297860s, ad02.f297860s) && C46238a.m51546a(this.f297861t, ad02.f297861t) && C46238a.m51546a(Integer.valueOf(this.f297862u), Integer.valueOf(ad02.f297862u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f297848d);
            aVar.mo74318e(2, this.f297849e);
            aVar.mo74318e(3, this.f297850f);
            aVar.mo74318e(4, this.f297851g);
            aVar.mo74318e(5, this.f297852h);
            aVar.mo74318e(6, this.f297853i);
            String str = this.f297854j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f297855n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f297856o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f297857p);
            C101760bd0 bd02 = this.f297858q;
            if (bd02 != null) {
                aVar.mo74322i(11, bd02.computeSize());
                this.f297858q.writeFields(aVar);
            }
            String str4 = this.f297859r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            String str5 = this.f297860s;
            if (str5 != null) {
                aVar.mo74323j(13, str5);
            }
            String str6 = this.f297861t;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            aVar.mo74318e(15, this.f297862u);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f297848d) + 0 + C52418a.m58678e(2, this.f297849e) + C52418a.m58678e(3, this.f297850f) + C52418a.m58678e(4, this.f297851g) + C52418a.m58678e(5, this.f297852h) + C52418a.m58678e(6, this.f297853i);
            String str7 = this.f297854j;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            String str8 = this.f297855n;
            if (str8 != null) {
                e += C52418a.m58683j(8, str8);
            }
            String str9 = this.f297856o;
            if (str9 != null) {
                e += C52418a.m58683j(9, str9);
            }
            int e2 = e + C52418a.m58678e(10, this.f297857p);
            C101760bd0 bd03 = this.f297858q;
            if (bd03 != null) {
                e2 += C52418a.m58682i(11, bd03.computeSize());
            }
            String str10 = this.f297859r;
            if (str10 != null) {
                e2 += C52418a.m58683j(12, str10);
            }
            String str11 = this.f297860s;
            if (str11 != null) {
                e2 += C52418a.m58683j(13, str11);
            }
            String str12 = this.f297861t;
            if (str12 != null) {
                e2 += C52418a.m58683j(14, str12);
            }
            return e2 + C52418a.m58678e(15, this.f297862u);
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
            C101755ad0 ad02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ad02.f297848d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ad02.f297849e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ad02.f297850f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ad02.f297851g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ad02.f297852h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ad02.f297853i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ad02.f297854j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ad02.f297855n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ad02.f297856o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ad02.f297857p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101760bd0 bd04 = new C101760bd0();
                        if (bArr != null && bArr.length > 0) {
                            bd04.parseFrom(bArr);
                        }
                        ad02.f297858q = bd04;
                    }
                    return 0;
                case 12:
                    ad02.f297859r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ad02.f297860s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ad02.f297861t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ad02.f297862u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
