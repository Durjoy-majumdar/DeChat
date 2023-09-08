package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d51 */
public class C49098d51 extends C47465a {

    /* renamed from: d */
    public int f132118d;

    /* renamed from: e */
    public int f132119e;

    /* renamed from: f */
    public String f132120f;

    /* renamed from: g */
    public String f132121g;

    /* renamed from: h */
    public String f132122h;

    /* renamed from: i */
    public int f132123i;

    /* renamed from: j */
    public int f132124j;

    /* renamed from: n */
    public int f132125n;

    /* renamed from: o */
    public String f132126o;

    /* renamed from: p */
    public int f132127p;

    /* renamed from: q */
    public C50523nc3 f132128q;

    /* renamed from: r */
    public LinkedList<C49440fl2> f132129r = new LinkedList<>();

    /* renamed from: s */
    public String f132130s;

    /* renamed from: t */
    public C49067cz f132131t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49098d51)) {
            return false;
        }
        C49098d51 d512 = (C49098d51) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132118d), Integer.valueOf(d512.f132118d)) && C46238a.m51546a(Integer.valueOf(this.f132119e), Integer.valueOf(d512.f132119e)) && C46238a.m51546a(this.f132120f, d512.f132120f) && C46238a.m51546a(this.f132121g, d512.f132121g) && C46238a.m51546a(this.f132122h, d512.f132122h) && C46238a.m51546a(Integer.valueOf(this.f132123i), Integer.valueOf(d512.f132123i)) && C46238a.m51546a(Integer.valueOf(this.f132124j), Integer.valueOf(d512.f132124j)) && C46238a.m51546a(Integer.valueOf(this.f132125n), Integer.valueOf(d512.f132125n)) && C46238a.m51546a(this.f132126o, d512.f132126o) && C46238a.m51546a(Integer.valueOf(this.f132127p), Integer.valueOf(d512.f132127p)) && C46238a.m51546a(this.f132128q, d512.f132128q) && C46238a.m51546a(this.f132129r, d512.f132129r) && C46238a.m51546a(this.f132130s, d512.f132130s) && C46238a.m51546a(this.f132131t, d512.f132131t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132118d);
            aVar.mo74318e(2, this.f132119e);
            String str = this.f132120f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f132121g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f132122h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f132123i);
            aVar.mo74318e(7, this.f132124j);
            aVar.mo74318e(8, this.f132125n);
            String str4 = this.f132126o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74318e(10, this.f132127p);
            C50523nc3 nc32 = this.f132128q;
            if (nc32 != null) {
                aVar.mo74322i(11, nc32.computeSize());
                this.f132128q.writeFields(aVar);
            }
            aVar.mo74320g(12, 8, this.f132129r);
            String str5 = this.f132130s;
            if (str5 != null) {
                aVar.mo74323j(13, str5);
            }
            C49067cz czVar = this.f132131t;
            if (czVar != null) {
                aVar.mo74322i(14, czVar.computeSize());
                this.f132131t.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f132118d) + 0 + C52418a.m58678e(2, this.f132119e);
            String str6 = this.f132120f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f132121g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f132122h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            int e2 = e + C52418a.m58678e(6, this.f132123i) + C52418a.m58678e(7, this.f132124j) + C52418a.m58678e(8, this.f132125n);
            String str9 = this.f132126o;
            if (str9 != null) {
                e2 += C52418a.m58683j(9, str9);
            }
            int e3 = e2 + C52418a.m58678e(10, this.f132127p);
            C50523nc3 nc33 = this.f132128q;
            if (nc33 != null) {
                e3 += C52418a.m58682i(11, nc33.computeSize());
            }
            int g = e3 + C52418a.m58680g(12, 8, this.f132129r);
            String str10 = this.f132130s;
            if (str10 != null) {
                g += C52418a.m58683j(13, str10);
            }
            C49067cz czVar2 = this.f132131t;
            return czVar2 != null ? g + C52418a.m58682i(14, czVar2.computeSize()) : g;
        } else if (i2 == 2) {
            this.f132129r.clear();
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
            C49098d51 d512 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d512.f132118d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    d512.f132119e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    d512.f132120f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    d512.f132121g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    d512.f132122h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d512.f132123i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    d512.f132124j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    d512.f132125n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    d512.f132126o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    d512.f132127p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50523nc3 nc34 = new C50523nc3();
                        if (bArr != null && bArr.length > 0) {
                            nc34.parseFrom(bArr);
                        }
                        d512.f132128q = nc34;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49440fl2 fl22 = new C49440fl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            fl22.parseFrom(bArr2);
                        }
                        d512.f132129r.add(fl22);
                    }
                    return 0;
                case 13:
                    d512.f132130s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49067cz czVar3 = new C49067cz();
                        if (bArr3 != null && bArr3.length > 0) {
                            czVar3.parseFrom(bArr3);
                        }
                        d512.f132131t = czVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
