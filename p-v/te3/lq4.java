package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lq4 extends C47465a {

    /* renamed from: d */
    public String f137587d;

    /* renamed from: e */
    public String f137588e;

    /* renamed from: f */
    public String f137589f;

    /* renamed from: g */
    public int f137590g;

    /* renamed from: h */
    public String f137591h;

    /* renamed from: i */
    public String f137592i;

    /* renamed from: j */
    public String f137593j;

    /* renamed from: n */
    public int f137594n;

    /* renamed from: o */
    public String f137595o;

    /* renamed from: p */
    public int f137596p;

    /* renamed from: q */
    public C51018qv3 f137597q;

    /* renamed from: r */
    public String f137598r;

    /* renamed from: s */
    public int f137599s;

    /* renamed from: t */
    public C51018qv3 f137600t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lq4)) {
            return false;
        }
        lq4 lq4 = (lq4) aVar;
        return C46238a.m51546a(this.f137587d, lq4.f137587d) && C46238a.m51546a(this.f137588e, lq4.f137588e) && C46238a.m51546a(this.f137589f, lq4.f137589f) && C46238a.m51546a(Integer.valueOf(this.f137590g), Integer.valueOf(lq4.f137590g)) && C46238a.m51546a(this.f137591h, lq4.f137591h) && C46238a.m51546a(this.f137592i, lq4.f137592i) && C46238a.m51546a(this.f137593j, lq4.f137593j) && C46238a.m51546a(Integer.valueOf(this.f137594n), Integer.valueOf(lq4.f137594n)) && C46238a.m51546a(this.f137595o, lq4.f137595o) && C46238a.m51546a(Integer.valueOf(this.f137596p), Integer.valueOf(lq4.f137596p)) && C46238a.m51546a(this.f137597q, lq4.f137597q) && C46238a.m51546a(this.f137598r, lq4.f137598r) && C46238a.m51546a(Integer.valueOf(this.f137599s), Integer.valueOf(lq4.f137599s)) && C46238a.m51546a(this.f137600t, lq4.f137600t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137587d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137588e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137589f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f137590g);
            String str4 = this.f137591h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f137592i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f137593j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f137594n);
            String str7 = this.f137595o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            aVar.mo74318e(10, this.f137596p);
            C51018qv3 qv32 = this.f137597q;
            if (qv32 != null) {
                aVar.mo74322i(11, qv32.computeSize());
                this.f137597q.writeFields(aVar);
            }
            String str8 = this.f137598r;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            aVar.mo74318e(13, this.f137599s);
            C51018qv3 qv33 = this.f137600t;
            if (qv33 != null) {
                aVar.mo74322i(14, qv33.computeSize());
                this.f137600t.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f137587d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f137588e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f137589f;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            int e = i3 + C52418a.m58678e(4, this.f137590g);
            String str12 = this.f137591h;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f137592i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f137593j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            int e2 = e + C52418a.m58678e(8, this.f137594n);
            String str15 = this.f137595o;
            if (str15 != null) {
                e2 += C52418a.m58683j(9, str15);
            }
            int e3 = e2 + C52418a.m58678e(10, this.f137596p);
            C51018qv3 qv34 = this.f137597q;
            if (qv34 != null) {
                e3 += C52418a.m58682i(11, qv34.computeSize());
            }
            String str16 = this.f137598r;
            if (str16 != null) {
                e3 += C52418a.m58683j(12, str16);
            }
            int e4 = e3 + C52418a.m58678e(13, this.f137599s);
            C51018qv3 qv35 = this.f137600t;
            return qv35 != null ? e4 + C52418a.m58682i(14, qv35.computeSize()) : e4;
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
            lq4 lq4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lq4.f137587d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lq4.f137588e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lq4.f137589f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lq4.f137590g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lq4.f137591h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lq4.f137592i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lq4.f137593j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lq4.f137594n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    lq4.f137595o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    lq4.f137596p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv36.mo73348f(bArr);
                        }
                        lq4.f137597q = qv36;
                    }
                    return 0;
                case 12:
                    lq4.f137598r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    lq4.f137599s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv37.mo73348f(bArr2);
                        }
                        lq4.f137600t = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
