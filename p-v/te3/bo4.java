package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bo4 extends C101820nt3 {

    /* renamed from: d */
    public String f227019d;

    /* renamed from: e */
    public String f227020e;

    /* renamed from: f */
    public int f227021f;

    /* renamed from: g */
    public int f227022g;

    /* renamed from: h */
    public String f227023h;

    /* renamed from: i */
    public int f227024i;

    /* renamed from: j */
    public int f227025j;

    /* renamed from: n */
    public C51018qv3 f227026n;

    /* renamed from: o */
    public int f227027o;

    /* renamed from: p */
    public int f227028p;

    /* renamed from: q */
    public String f227029q;

    /* renamed from: r */
    public int f227030r;

    /* renamed from: s */
    public int f227031s;

    /* renamed from: t */
    public int f227032t;

    /* renamed from: u */
    public long f227033u;

    /* renamed from: v */
    public int f227034v;

    /* renamed from: w */
    public String f227035w;

    /* renamed from: x */
    public String f227036x;

    /* renamed from: y */
    public String f227037y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bo4)) {
            return false;
        }
        bo4 bo4 = (bo4) aVar;
        return C46238a.m51546a(this.f227019d, bo4.f227019d) && C46238a.m51546a(this.f227020e, bo4.f227020e) && C46238a.m51546a(Integer.valueOf(this.f227021f), Integer.valueOf(bo4.f227021f)) && C46238a.m51546a(Integer.valueOf(this.f227022g), Integer.valueOf(bo4.f227022g)) && C46238a.m51546a(this.f227023h, bo4.f227023h) && C46238a.m51546a(Integer.valueOf(this.f227024i), Integer.valueOf(bo4.f227024i)) && C46238a.m51546a(Integer.valueOf(this.f227025j), Integer.valueOf(bo4.f227025j)) && C46238a.m51546a(this.f227026n, bo4.f227026n) && C46238a.m51546a(Integer.valueOf(this.f227027o), Integer.valueOf(bo4.f227027o)) && C46238a.m51546a(this.BaseRequest, bo4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f227028p), Integer.valueOf(bo4.f227028p)) && C46238a.m51546a(this.f227029q, bo4.f227029q) && C46238a.m51546a(Integer.valueOf(this.f227030r), Integer.valueOf(bo4.f227030r)) && C46238a.m51546a(Integer.valueOf(this.f227031s), Integer.valueOf(bo4.f227031s)) && C46238a.m51546a(Integer.valueOf(this.f227032t), Integer.valueOf(bo4.f227032t)) && C46238a.m51546a(Long.valueOf(this.f227033u), Long.valueOf(bo4.f227033u)) && C46238a.m51546a(Integer.valueOf(this.f227034v), Integer.valueOf(bo4.f227034v)) && C46238a.m51546a(this.f227035w, bo4.f227035w) && C46238a.m51546a(this.f227036x, bo4.f227036x) && C46238a.m51546a(this.f227037y, bo4.f227037y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227019d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227020e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f227021f);
            aVar.mo74318e(4, this.f227022g);
            String str3 = this.f227023h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f227024i);
            aVar.mo74318e(7, this.f227025j);
            C51018qv3 qv32 = this.f227026n;
            if (qv32 != null) {
                aVar.mo74322i(8, qv32.computeSize());
                this.f227026n.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f227027o);
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(10, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(11, this.f227028p);
            String str4 = this.f227029q;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            aVar.mo74318e(13, this.f227030r);
            aVar.mo74318e(14, this.f227031s);
            aVar.mo74318e(15, this.f227032t);
            aVar.mo74321h(16, this.f227033u);
            aVar.mo74318e(17, this.f227034v);
            String str5 = this.f227035w;
            if (str5 != null) {
                aVar.mo74323j(19, str5);
            }
            String str6 = this.f227036x;
            if (str6 != null) {
                aVar.mo74323j(20, str6);
            }
            String str7 = this.f227037y;
            if (str7 != null) {
                aVar.mo74323j(21, str7);
            }
            return 0;
        } else if (i2 == 1) {
            String str8 = this.f227019d;
            if (str8 != null) {
                i3 = C52418a.m58683j(1, str8) + 0;
            }
            String str9 = this.f227020e;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            int e = i3 + C52418a.m58678e(3, this.f227021f) + C52418a.m58678e(4, this.f227022g);
            String str10 = this.f227023h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            int e2 = e + C52418a.m58678e(6, this.f227024i) + C52418a.m58678e(7, this.f227025j);
            C51018qv3 qv33 = this.f227026n;
            if (qv33 != null) {
                e2 += C52418a.m58682i(8, qv33.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(9, this.f227027o);
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                e3 += C52418a.m58682i(10, iaVar2.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(11, this.f227028p);
            String str11 = this.f227029q;
            if (str11 != null) {
                e4 += C52418a.m58683j(12, str11);
            }
            int e5 = e4 + C52418a.m58678e(13, this.f227030r) + C52418a.m58678e(14, this.f227031s) + C52418a.m58678e(15, this.f227032t) + C52418a.m58681h(16, this.f227033u) + C52418a.m58678e(17, this.f227034v);
            String str12 = this.f227035w;
            if (str12 != null) {
                e5 += C52418a.m58683j(19, str12);
            }
            String str13 = this.f227036x;
            if (str13 != null) {
                e5 += C52418a.m58683j(20, str13);
            }
            String str14 = this.f227037y;
            return str14 != null ? e5 + C52418a.m58683j(21, str14) : e5;
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
            bo4 bo4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bo4.f227019d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bo4.f227020e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bo4.f227021f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bo4.f227022g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bo4.f227023h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bo4.f227024i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    bo4.f227025j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        bo4.f227026n = qv34;
                    }
                    return 0;
                case 9:
                    bo4.f227027o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr2 != null && bArr2.length > 0) {
                            iaVar3.parseFrom(bArr2);
                        }
                        bo4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 11:
                    bo4.f227028p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    bo4.f227029q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    bo4.f227030r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    bo4.f227031s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    bo4.f227032t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    bo4.f227033u = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    bo4.f227034v = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    bo4.f227035w = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    bo4.f227036x = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    bo4.f227037y = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
