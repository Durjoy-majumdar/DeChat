package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ju */
public class C101798ju extends C101820nt3 {

    /* renamed from: d */
    public String f298562d;

    /* renamed from: e */
    public String f298563e;

    /* renamed from: f */
    public String f298564f;

    /* renamed from: g */
    public String f298565g;

    /* renamed from: h */
    public String f298566h;

    /* renamed from: i */
    public String f298567i;

    /* renamed from: j */
    public String f298568j;

    /* renamed from: n */
    public String f298569n;

    /* renamed from: o */
    public int f298570o;

    /* renamed from: p */
    public String f298571p;

    /* renamed from: q */
    public int f298572q;

    /* renamed from: r */
    public String f298573r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101798ju)) {
            return false;
        }
        C101798ju juVar = (C101798ju) aVar;
        return C46238a.m51546a(this.BaseRequest, juVar.BaseRequest) && C46238a.m51546a(this.f298562d, juVar.f298562d) && C46238a.m51546a(this.f298563e, juVar.f298563e) && C46238a.m51546a(this.f298564f, juVar.f298564f) && C46238a.m51546a(this.f298565g, juVar.f298565g) && C46238a.m51546a(this.f298566h, juVar.f298566h) && C46238a.m51546a(this.f298567i, juVar.f298567i) && C46238a.m51546a(this.f298568j, juVar.f298568j) && C46238a.m51546a(this.f298569n, juVar.f298569n) && C46238a.m51546a(Integer.valueOf(this.f298570o), Integer.valueOf(juVar.f298570o)) && C46238a.m51546a(this.f298571p, juVar.f298571p) && C46238a.m51546a(Integer.valueOf(this.f298572q), Integer.valueOf(juVar.f298572q)) && C46238a.m51546a(this.f298573r, juVar.f298573r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f298562d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f298563e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f298564f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298565g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f298566h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f298567i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f298568j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f298569n;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f298570o);
            String str9 = this.f298571p;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            aVar.mo74318e(12, this.f298572q);
            String str10 = this.f298573r;
            if (str10 == null) {
                return 0;
            }
            aVar.mo74323j(13, str10);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            String str11 = this.f298562d;
            if (str11 != null) {
                i3 += C52418a.m58683j(2, str11);
            }
            String str12 = this.f298563e;
            if (str12 != null) {
                i3 += C52418a.m58683j(3, str12);
            }
            String str13 = this.f298564f;
            if (str13 != null) {
                i3 += C52418a.m58683j(4, str13);
            }
            String str14 = this.f298565g;
            if (str14 != null) {
                i3 += C52418a.m58683j(5, str14);
            }
            String str15 = this.f298566h;
            if (str15 != null) {
                i3 += C52418a.m58683j(6, str15);
            }
            String str16 = this.f298567i;
            if (str16 != null) {
                i3 += C52418a.m58683j(7, str16);
            }
            String str17 = this.f298568j;
            if (str17 != null) {
                i3 += C52418a.m58683j(8, str17);
            }
            String str18 = this.f298569n;
            if (str18 != null) {
                i3 += C52418a.m58683j(9, str18);
            }
            int e = i3 + C52418a.m58678e(10, this.f298570o);
            String str19 = this.f298571p;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            int e2 = e + C52418a.m58678e(12, this.f298572q);
            String str20 = this.f298573r;
            return str20 != null ? e2 + C52418a.m58683j(13, str20) : e2;
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
            C101798ju juVar = objArr[1];
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
                        juVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    juVar.f298562d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    juVar.f298563e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    juVar.f298564f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    juVar.f298565g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    juVar.f298566h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    juVar.f298567i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    juVar.f298568j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    juVar.f298569n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    juVar.f298570o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    juVar.f298571p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    juVar.f298572q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    juVar.f298573r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
