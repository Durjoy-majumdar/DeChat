package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class gj4 extends C49335eu3 {

    /* renamed from: d */
    public int f227461d;

    /* renamed from: e */
    public String f227462e;

    /* renamed from: f */
    public int f227463f;

    /* renamed from: g */
    public C48754ar3 f227464g;

    /* renamed from: h */
    public String f227465h;

    /* renamed from: i */
    public String f227466i;

    /* renamed from: j */
    public String f227467j;

    /* renamed from: n */
    public String f227468n;

    /* renamed from: o */
    public String f227469o;

    /* renamed from: p */
    public String f227470p;

    /* renamed from: q */
    public int f227471q;

    /* renamed from: r */
    public LinkedList<C64600o30> f227472r = new LinkedList<>();

    /* renamed from: s */
    public String f227473s;

    /* renamed from: t */
    public String f227474t;

    /* renamed from: u */
    public String f227475u;

    /* renamed from: v */
    public String f227476v;

    /* renamed from: w */
    public C48754ar3 f227477w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gj4)) {
            return false;
        }
        gj4 gj4 = (gj4) aVar;
        return C46238a.m51546a(this.BaseResponse, gj4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227461d), Integer.valueOf(gj4.f227461d)) && C46238a.m51546a(this.f227462e, gj4.f227462e) && C46238a.m51546a(Integer.valueOf(this.f227463f), Integer.valueOf(gj4.f227463f)) && C46238a.m51546a(this.f227464g, gj4.f227464g) && C46238a.m51546a(this.f227465h, gj4.f227465h) && C46238a.m51546a(this.f227466i, gj4.f227466i) && C46238a.m51546a(this.f227467j, gj4.f227467j) && C46238a.m51546a(this.f227468n, gj4.f227468n) && C46238a.m51546a(this.f227469o, gj4.f227469o) && C46238a.m51546a(this.f227470p, gj4.f227470p) && C46238a.m51546a(Integer.valueOf(this.f227471q), Integer.valueOf(gj4.f227471q)) && C46238a.m51546a(this.f227472r, gj4.f227472r) && C46238a.m51546a(this.f227473s, gj4.f227473s) && C46238a.m51546a(this.f227474t, gj4.f227474t) && C46238a.m51546a(this.f227475u, gj4.f227475u) && C46238a.m51546a(this.f227476v, gj4.f227476v) && C46238a.m51546a(this.f227477w, gj4.f227477w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f227461d);
            String str = this.f227462e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f227463f);
            C48754ar3 ar32 = this.f227464g;
            if (ar32 != null) {
                aVar.mo74322i(5, ar32.computeSize());
                this.f227464g.writeFields(aVar);
            }
            String str2 = this.f227465h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f227466i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f227467j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f227468n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f227469o;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f227470p;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            aVar.mo74318e(12, this.f227471q);
            aVar.mo74320g(13, 8, this.f227472r);
            String str8 = this.f227473s;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            String str9 = this.f227474t;
            if (str9 != null) {
                aVar.mo74323j(15, str9);
            }
            String str10 = this.f227475u;
            if (str10 != null) {
                aVar.mo74323j(16, str10);
            }
            String str11 = this.f227476v;
            if (str11 != null) {
                aVar.mo74323j(17, str11);
            }
            C48754ar3 ar33 = this.f227477w;
            if (ar33 != null) {
                aVar.mo74322i(18, ar33.computeSize());
                this.f227477w.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f227461d);
            String str12 = this.f227462e;
            if (str12 != null) {
                e += C52418a.m58683j(3, str12);
            }
            int e2 = e + C52418a.m58678e(4, this.f227463f);
            C48754ar3 ar34 = this.f227464g;
            if (ar34 != null) {
                e2 += C52418a.m58682i(5, ar34.computeSize());
            }
            String str13 = this.f227465h;
            if (str13 != null) {
                e2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f227466i;
            if (str14 != null) {
                e2 += C52418a.m58683j(7, str14);
            }
            String str15 = this.f227467j;
            if (str15 != null) {
                e2 += C52418a.m58683j(8, str15);
            }
            String str16 = this.f227468n;
            if (str16 != null) {
                e2 += C52418a.m58683j(9, str16);
            }
            String str17 = this.f227469o;
            if (str17 != null) {
                e2 += C52418a.m58683j(10, str17);
            }
            String str18 = this.f227470p;
            if (str18 != null) {
                e2 += C52418a.m58683j(11, str18);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f227471q) + C52418a.m58680g(13, 8, this.f227472r);
            String str19 = this.f227473s;
            if (str19 != null) {
                e3 += C52418a.m58683j(14, str19);
            }
            String str20 = this.f227474t;
            if (str20 != null) {
                e3 += C52418a.m58683j(15, str20);
            }
            String str21 = this.f227475u;
            if (str21 != null) {
                e3 += C52418a.m58683j(16, str21);
            }
            String str22 = this.f227476v;
            if (str22 != null) {
                e3 += C52418a.m58683j(17, str22);
            }
            C48754ar3 ar35 = this.f227477w;
            return ar35 != null ? e3 + C52418a.m58682i(18, ar35.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f227472r.clear();
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
            gj4 gj4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        gj4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    gj4.f227461d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gj4.f227462e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gj4.f227463f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48754ar3 ar36 = new C48754ar3();
                        if (bArr2 != null && bArr2.length > 0) {
                            ar36.parseFrom(bArr2);
                        }
                        gj4.f227464g = ar36;
                    }
                    return 0;
                case 6:
                    gj4.f227465h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gj4.f227466i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    gj4.f227467j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    gj4.f227468n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    gj4.f227469o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    gj4.f227470p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    gj4.f227471q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64600o30 o302 = new C64600o30();
                        if (bArr3 != null && bArr3.length > 0) {
                            o302.parseFrom(bArr3);
                        }
                        gj4.f227472r.add(o302);
                    }
                    return 0;
                case 14:
                    gj4.f227473s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    gj4.f227474t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    gj4.f227475u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    gj4.f227476v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C48754ar3 ar37 = new C48754ar3();
                        if (bArr4 != null && bArr4.length > 0) {
                            ar37.parseFrom(bArr4);
                        }
                        gj4.f227477w = ar37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
