package tw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: tw1.j */
public class C52376j extends C101820nt3 {

    /* renamed from: d */
    public String f146394d;

    /* renamed from: e */
    public int f146395e;

    /* renamed from: f */
    public int f146396f;

    /* renamed from: g */
    public String f146397g;

    /* renamed from: h */
    public String f146398h;

    /* renamed from: i */
    public String f146399i;

    /* renamed from: j */
    public int f146400j;

    /* renamed from: n */
    public String f146401n;

    /* renamed from: o */
    public String f146402o;

    /* renamed from: p */
    public String f146403p;

    /* renamed from: q */
    public String f146404q;

    /* renamed from: r */
    public String f146405r;

    /* renamed from: s */
    public String f146406s;

    /* renamed from: t */
    public String f146407t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52376j)) {
            return false;
        }
        C52376j jVar = (C52376j) aVar;
        return C46238a.m51546a(this.BaseRequest, jVar.BaseRequest) && C46238a.m51546a(this.f146394d, jVar.f146394d) && C46238a.m51546a(Integer.valueOf(this.f146395e), Integer.valueOf(jVar.f146395e)) && C46238a.m51546a(Integer.valueOf(this.f146396f), Integer.valueOf(jVar.f146396f)) && C46238a.m51546a(this.f146397g, jVar.f146397g) && C46238a.m51546a(this.f146398h, jVar.f146398h) && C46238a.m51546a(this.f146399i, jVar.f146399i) && C46238a.m51546a(Integer.valueOf(this.f146400j), Integer.valueOf(jVar.f146400j)) && C46238a.m51546a(this.f146401n, jVar.f146401n) && C46238a.m51546a(this.f146402o, jVar.f146402o) && C46238a.m51546a(this.f146403p, jVar.f146403p) && C46238a.m51546a(this.f146404q, jVar.f146404q) && C46238a.m51546a(this.f146405r, jVar.f146405r) && C46238a.m51546a(this.f146406s, jVar.f146406s) && C46238a.m51546a(this.f146407t, jVar.f146407t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f146394d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f146395e);
            aVar.mo74318e(4, this.f146396f);
            String str2 = this.f146397g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f146398h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f146399i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f146400j);
            String str5 = this.f146401n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f146402o;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f146403p;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            String str8 = this.f146404q;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            String str9 = this.f146405r;
            if (str9 != null) {
                aVar.mo74323j(13, str9);
            }
            String str10 = this.f146406s;
            if (str10 != null) {
                aVar.mo74323j(14, str10);
            }
            String str11 = this.f146407t;
            if (str11 != null) {
                aVar.mo74323j(15, str11);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str12 = this.f146394d;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            int e = i3 + C52418a.m58678e(3, this.f146395e) + C52418a.m58678e(4, this.f146396f);
            String str13 = this.f146397g;
            if (str13 != null) {
                e += C52418a.m58683j(5, str13);
            }
            String str14 = this.f146398h;
            if (str14 != null) {
                e += C52418a.m58683j(6, str14);
            }
            String str15 = this.f146399i;
            if (str15 != null) {
                e += C52418a.m58683j(7, str15);
            }
            int e2 = e + C52418a.m58678e(8, this.f146400j);
            String str16 = this.f146401n;
            if (str16 != null) {
                e2 += C52418a.m58683j(9, str16);
            }
            String str17 = this.f146402o;
            if (str17 != null) {
                e2 += C52418a.m58683j(10, str17);
            }
            String str18 = this.f146403p;
            if (str18 != null) {
                e2 += C52418a.m58683j(11, str18);
            }
            String str19 = this.f146404q;
            if (str19 != null) {
                e2 += C52418a.m58683j(12, str19);
            }
            String str20 = this.f146405r;
            if (str20 != null) {
                e2 += C52418a.m58683j(13, str20);
            }
            String str21 = this.f146406s;
            if (str21 != null) {
                e2 += C52418a.m58683j(14, str21);
            }
            String str22 = this.f146407t;
            return str22 != null ? e2 + C52418a.m58683j(15, str22) : e2;
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
            C52376j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        jVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    jVar.f146394d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jVar.f146395e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    jVar.f146396f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jVar.f146397g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jVar.f146398h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jVar.f146399i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jVar.f146400j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jVar.f146401n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jVar.f146402o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    jVar.f146403p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    jVar.f146404q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    jVar.f146405r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    jVar.f146406s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    jVar.f146407t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
