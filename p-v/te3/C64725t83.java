package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t83 */
public class C64725t83 extends C49335eu3 {

    /* renamed from: d */
    public int f185514d;

    /* renamed from: e */
    public int f185515e;

    /* renamed from: f */
    public int f185516f;

    /* renamed from: g */
    public long f185517g;

    /* renamed from: h */
    public int f185518h;

    /* renamed from: i */
    public long f185519i;

    /* renamed from: j */
    public int f185520j;

    /* renamed from: n */
    public long f185521n;

    /* renamed from: o */
    public int f185522o;

    /* renamed from: p */
    public LinkedList<C64678re2> f185523p = new LinkedList<>();

    /* renamed from: q */
    public String f185524q;

    /* renamed from: r */
    public String f185525r;

    /* renamed from: s */
    public String f185526s;

    /* renamed from: t */
    public String f185527t;

    /* renamed from: u */
    public int f185528u;

    /* renamed from: v */
    public String f185529v;

    /* renamed from: w */
    public int f185530w;

    /* renamed from: x */
    public String f185531x;

    /* renamed from: y */
    public C64320dn3 f185532y;

    /* renamed from: z */
    public String f185533z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64725t83)) {
            return false;
        }
        C64725t83 t832 = (C64725t83) aVar;
        return C46238a.m51546a(this.BaseResponse, t832.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f185514d), Integer.valueOf(t832.f185514d)) && C46238a.m51546a(Integer.valueOf(this.f185515e), Integer.valueOf(t832.f185515e)) && C46238a.m51546a(Integer.valueOf(this.f185516f), Integer.valueOf(t832.f185516f)) && C46238a.m51546a(Long.valueOf(this.f185517g), Long.valueOf(t832.f185517g)) && C46238a.m51546a(Integer.valueOf(this.f185518h), Integer.valueOf(t832.f185518h)) && C46238a.m51546a(Long.valueOf(this.f185519i), Long.valueOf(t832.f185519i)) && C46238a.m51546a(Integer.valueOf(this.f185520j), Integer.valueOf(t832.f185520j)) && C46238a.m51546a(Long.valueOf(this.f185521n), Long.valueOf(t832.f185521n)) && C46238a.m51546a(Integer.valueOf(this.f185522o), Integer.valueOf(t832.f185522o)) && C46238a.m51546a(this.f185523p, t832.f185523p) && C46238a.m51546a(this.f185524q, t832.f185524q) && C46238a.m51546a(this.f185525r, t832.f185525r) && C46238a.m51546a(this.f185526s, t832.f185526s) && C46238a.m51546a(this.f185527t, t832.f185527t) && C46238a.m51546a(Integer.valueOf(this.f185528u), Integer.valueOf(t832.f185528u)) && C46238a.m51546a(this.f185529v, t832.f185529v) && C46238a.m51546a(Integer.valueOf(this.f185530w), Integer.valueOf(t832.f185530w)) && C46238a.m51546a(this.f185531x, t832.f185531x) && C46238a.m51546a(this.f185532y, t832.f185532y) && C46238a.m51546a(this.f185533z, t832.f185533z);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f185514d);
                aVar.mo74318e(3, this.f185515e);
                aVar.mo74318e(4, this.f185516f);
                aVar.mo74321h(5, this.f185517g);
                aVar.mo74318e(6, this.f185518h);
                aVar.mo74321h(7, this.f185519i);
                aVar.mo74318e(8, this.f185520j);
                aVar.mo74321h(9, this.f185521n);
                aVar.mo74318e(10, this.f185522o);
                aVar.mo74320g(11, 8, this.f185523p);
                String str = this.f185524q;
                if (str != null) {
                    aVar.mo74323j(12, str);
                }
                String str2 = this.f185525r;
                if (str2 != null) {
                    aVar.mo74323j(13, str2);
                }
                String str3 = this.f185526s;
                if (str3 != null) {
                    aVar.mo74323j(14, str3);
                }
                String str4 = this.f185527t;
                if (str4 != null) {
                    aVar.mo74323j(15, str4);
                }
                aVar.mo74318e(16, this.f185528u);
                String str5 = this.f185529v;
                if (str5 != null) {
                    aVar.mo74323j(17, str5);
                }
                aVar.mo74318e(18, this.f185530w);
                String str6 = this.f185531x;
                if (str6 != null) {
                    aVar.mo74323j(19, str6);
                }
                C64320dn3 dn32 = this.f185532y;
                if (dn32 != null) {
                    aVar.mo74322i(20, dn32.computeSize());
                    this.f185532y.writeFields(aVar);
                }
                String str7 = this.f185533z;
                if (str7 != null) {
                    aVar.mo74323j(21, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f185514d) + C52418a.m58678e(3, this.f185515e) + C52418a.m58678e(4, this.f185516f) + C52418a.m58681h(5, this.f185517g) + C52418a.m58678e(6, this.f185518h) + C52418a.m58681h(7, this.f185519i) + C52418a.m58678e(8, this.f185520j) + C52418a.m58681h(9, this.f185521n) + C52418a.m58678e(10, this.f185522o) + C52418a.m58680g(11, 8, this.f185523p);
            String str8 = this.f185524q;
            if (str8 != null) {
                e += C52418a.m58683j(12, str8);
            }
            String str9 = this.f185525r;
            if (str9 != null) {
                e += C52418a.m58683j(13, str9);
            }
            String str10 = this.f185526s;
            if (str10 != null) {
                e += C52418a.m58683j(14, str10);
            }
            String str11 = this.f185527t;
            if (str11 != null) {
                e += C52418a.m58683j(15, str11);
            }
            int e2 = e + C52418a.m58678e(16, this.f185528u);
            String str12 = this.f185529v;
            if (str12 != null) {
                e2 += C52418a.m58683j(17, str12);
            }
            int e3 = e2 + C52418a.m58678e(18, this.f185530w);
            String str13 = this.f185531x;
            if (str13 != null) {
                e3 += C52418a.m58683j(19, str13);
            }
            C64320dn3 dn33 = this.f185532y;
            if (dn33 != null) {
                e3 += C52418a.m58682i(20, dn33.computeSize());
            }
            String str14 = this.f185533z;
            return str14 != null ? e3 + C52418a.m58683j(21, str14) : e3;
        } else if (i2 == 2) {
            this.f185523p.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64725t83 t832 = objArr[1];
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
                        t832.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    t832.f185514d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    t832.f185515e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    t832.f185516f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    t832.f185517g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    t832.f185518h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    t832.f185519i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    t832.f185520j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    t832.f185521n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    t832.f185522o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64678re2 re22 = new C64678re2();
                        if (bArr2 != null && bArr2.length > 0) {
                            re22.parseFrom(bArr2);
                        }
                        t832.f185523p.add(re22);
                    }
                    return 0;
                case 12:
                    t832.f185524q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    t832.f185525r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    t832.f185526s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    t832.f185527t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    t832.f185528u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    t832.f185529v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    t832.f185530w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    t832.f185531x = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64320dn3 dn34 = new C64320dn3();
                        if (bArr3 != null && bArr3.length > 0) {
                            dn34.parseFrom(bArr3);
                        }
                        t832.f185532y = dn34;
                    }
                    return 0;
                case 21:
                    t832.f185533z = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
