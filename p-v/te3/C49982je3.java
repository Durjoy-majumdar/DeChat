package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.je3 */
public class C49982je3 extends C47465a {

    /* renamed from: d */
    public String f136052d;

    /* renamed from: e */
    public String f136053e;

    /* renamed from: f */
    public C51233se3 f136054f;

    /* renamed from: g */
    public C51688ve3 f136055g;

    /* renamed from: h */
    public String f136056h;

    /* renamed from: i */
    public String f136057i;

    /* renamed from: j */
    public LinkedList<C50391me3> f136058j = new LinkedList<>();

    /* renamed from: n */
    public float f136059n;

    /* renamed from: o */
    public String f136060o;

    /* renamed from: p */
    public String f136061p;

    /* renamed from: q */
    public String f136062q;

    /* renamed from: r */
    public String f136063r;

    /* renamed from: s */
    public int f136064s;

    /* renamed from: t */
    public String f136065t;

    /* renamed from: u */
    public LinkedList<C49693he3> f136066u = new LinkedList<>();

    /* renamed from: v */
    public String f136067v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49982je3)) {
            return false;
        }
        C49982je3 je32 = (C49982je3) aVar;
        return C46238a.m51546a(this.f136052d, je32.f136052d) && C46238a.m51546a(this.f136053e, je32.f136053e) && C46238a.m51546a(this.f136054f, je32.f136054f) && C46238a.m51546a(this.f136055g, je32.f136055g) && C46238a.m51546a(this.f136056h, je32.f136056h) && C46238a.m51546a(this.f136057i, je32.f136057i) && C46238a.m51546a(this.f136058j, je32.f136058j) && C46238a.m51546a(Float.valueOf(this.f136059n), Float.valueOf(je32.f136059n)) && C46238a.m51546a(this.f136060o, je32.f136060o) && C46238a.m51546a(this.f136061p, je32.f136061p) && C46238a.m51546a(this.f136062q, je32.f136062q) && C46238a.m51546a(this.f136063r, je32.f136063r) && C46238a.m51546a(Integer.valueOf(this.f136064s), Integer.valueOf(je32.f136064s)) && C46238a.m51546a(this.f136065t, je32.f136065t) && C46238a.m51546a(this.f136066u, je32.f136066u) && C46238a.m51546a(this.f136067v, je32.f136067v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136052d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136053e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            C51233se3 se32 = this.f136054f;
            if (se32 != null) {
                aVar.mo74322i(3, se32.computeSize());
                this.f136054f.writeFields(aVar);
            }
            C51688ve3 ve32 = this.f136055g;
            if (ve32 != null) {
                aVar.mo74322i(4, ve32.computeSize());
                this.f136055g.writeFields(aVar);
            }
            String str3 = this.f136056h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f136057i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74320g(7, 8, this.f136058j);
            aVar.mo74317d(8, this.f136059n);
            String str5 = this.f136060o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f136061p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f136062q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            String str8 = this.f136063r;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            aVar.mo74318e(13, this.f136064s);
            String str9 = this.f136065t;
            if (str9 != null) {
                aVar.mo74323j(14, str9);
            }
            aVar.mo74320g(15, 8, this.f136066u);
            String str10 = this.f136067v;
            if (str10 != null) {
                aVar.mo74323j(101, str10);
            }
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f136052d;
            if (str11 != null) {
                i3 = C52418a.m58683j(1, str11) + 0;
            }
            String str12 = this.f136053e;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            C51233se3 se33 = this.f136054f;
            if (se33 != null) {
                i3 += C52418a.m58682i(3, se33.computeSize());
            }
            C51688ve3 ve33 = this.f136055g;
            if (ve33 != null) {
                i3 += C52418a.m58682i(4, ve33.computeSize());
            }
            String str13 = this.f136056h;
            if (str13 != null) {
                i3 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f136057i;
            if (str14 != null) {
                i3 += C52418a.m58683j(6, str14);
            }
            int g = i3 + C52418a.m58680g(7, 8, this.f136058j) + C52418a.m58677d(8, this.f136059n);
            String str15 = this.f136060o;
            if (str15 != null) {
                g += C52418a.m58683j(9, str15);
            }
            String str16 = this.f136061p;
            if (str16 != null) {
                g += C52418a.m58683j(10, str16);
            }
            String str17 = this.f136062q;
            if (str17 != null) {
                g += C52418a.m58683j(11, str17);
            }
            String str18 = this.f136063r;
            if (str18 != null) {
                g += C52418a.m58683j(12, str18);
            }
            int e = g + C52418a.m58678e(13, this.f136064s);
            String str19 = this.f136065t;
            if (str19 != null) {
                e += C52418a.m58683j(14, str19);
            }
            int g2 = e + C52418a.m58680g(15, 8, this.f136066u);
            String str20 = this.f136067v;
            return str20 != null ? g2 + C52418a.m58683j(101, str20) : g2;
        } else if (i2 == 2) {
            this.f136058j.clear();
            this.f136066u.clear();
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
            C49982je3 je32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 101) {
                switch (intValue) {
                    case 1:
                        je32.f136052d = aVar3.mo141633k(intValue);
                        return 0;
                    case 2:
                        je32.f136053e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C51233se3 se34 = new C51233se3();
                            if (bArr != null && bArr.length > 0) {
                                se34.parseFrom(bArr);
                            }
                            je32.f136054f = se34;
                        }
                        return 0;
                    case 4:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C51688ve3 ve34 = new C51688ve3();
                            if (bArr2 != null && bArr2.length > 0) {
                                ve34.parseFrom(bArr2);
                            }
                            je32.f136055g = ve34;
                        }
                        return 0;
                    case 5:
                        je32.f136056h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        je32.f136057i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C50391me3 me32 = new C50391me3();
                            if (bArr3 != null && bArr3.length > 0) {
                                me32.parseFrom(bArr3);
                            }
                            je32.f136058j.add(me32);
                        }
                        return 0;
                    case 8:
                        je32.f136059n = aVar3.mo141628f(intValue);
                        return 0;
                    case 9:
                        je32.f136060o = aVar3.mo141633k(intValue);
                        return 0;
                    case 10:
                        je32.f136061p = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        je32.f136062q = aVar3.mo141633k(intValue);
                        return 0;
                    case 12:
                        je32.f136063r = aVar3.mo141633k(intValue);
                        return 0;
                    case 13:
                        je32.f136064s = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        je32.f136065t = aVar3.mo141633k(intValue);
                        return 0;
                    case 15:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            C49693he3 he32 = new C49693he3();
                            if (bArr4 != null && bArr4.length > 0) {
                                he32.parseFrom(bArr4);
                            }
                            je32.f136066u.add(he32);
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                je32.f136067v = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
