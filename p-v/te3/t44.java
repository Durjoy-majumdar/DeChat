package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class t44 extends C47465a {

    /* renamed from: d */
    public String f185485d;

    /* renamed from: e */
    public int f185486e;

    /* renamed from: f */
    public C50019jp1 f185487f;

    /* renamed from: g */
    public C64498ko2 f185488g;

    /* renamed from: h */
    public LinkedList<r44> f185489h = new LinkedList<>();

    /* renamed from: i */
    public int f185490i;

    /* renamed from: j */
    public int f185491j;

    /* renamed from: n */
    public String f185492n;

    /* renamed from: o */
    public String f185493o;

    /* renamed from: p */
    public String f185494p;

    /* renamed from: q */
    public String f185495q;

    /* renamed from: r */
    public int f185496r;

    /* renamed from: s */
    public String f185497s;

    /* renamed from: t */
    public String f185498t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t44)) {
            return false;
        }
        t44 t44 = (t44) aVar;
        return C46238a.m51546a(this.f185485d, t44.f185485d) && C46238a.m51546a(Integer.valueOf(this.f185486e), Integer.valueOf(t44.f185486e)) && C46238a.m51546a(this.f185487f, t44.f185487f) && C46238a.m51546a(this.f185488g, t44.f185488g) && C46238a.m51546a(this.f185489h, t44.f185489h) && C46238a.m51546a(Integer.valueOf(this.f185490i), Integer.valueOf(t44.f185490i)) && C46238a.m51546a(Integer.valueOf(this.f185491j), Integer.valueOf(t44.f185491j)) && C46238a.m51546a(this.f185492n, t44.f185492n) && C46238a.m51546a(this.f185493o, t44.f185493o) && C46238a.m51546a(this.f185494p, t44.f185494p) && C46238a.m51546a(this.f185495q, t44.f185495q) && C46238a.m51546a(Integer.valueOf(this.f185496r), Integer.valueOf(t44.f185496r)) && C46238a.m51546a(this.f185497s, t44.f185497s) && C46238a.m51546a(this.f185498t, t44.f185498t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185485d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f185486e);
            C50019jp1 jp12 = this.f185487f;
            if (jp12 != null) {
                aVar.mo74322i(3, jp12.computeSize());
                this.f185487f.writeFields(aVar);
            }
            C64498ko2 ko22 = this.f185488g;
            if (ko22 != null) {
                aVar.mo74322i(4, ko22.computeSize());
                this.f185488g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f185489h);
            aVar.mo74318e(10, this.f185490i);
            aVar.mo74318e(11, this.f185491j);
            String str2 = this.f185492n;
            if (str2 != null) {
                aVar.mo74323j(12, str2);
            }
            String str3 = this.f185493o;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            String str4 = this.f185494p;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            String str5 = this.f185495q;
            if (str5 != null) {
                aVar.mo74323j(15, str5);
            }
            aVar.mo74318e(30, this.f185496r);
            String str6 = this.f185497s;
            if (str6 != null) {
                aVar.mo74323j(31, str6);
            }
            String str7 = this.f185498t;
            if (str7 != null) {
                aVar.mo74323j(32, str7);
            }
            return 0;
        } else if (i2 == 1) {
            String str8 = this.f185485d;
            if (str8 != null) {
                i3 = C52418a.m58683j(1, str8) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f185486e);
            C50019jp1 jp13 = this.f185487f;
            if (jp13 != null) {
                e += C52418a.m58682i(3, jp13.computeSize());
            }
            C64498ko2 ko23 = this.f185488g;
            if (ko23 != null) {
                e += C52418a.m58682i(4, ko23.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f185489h) + C52418a.m58678e(10, this.f185490i) + C52418a.m58678e(11, this.f185491j);
            String str9 = this.f185492n;
            if (str9 != null) {
                g += C52418a.m58683j(12, str9);
            }
            String str10 = this.f185493o;
            if (str10 != null) {
                g += C52418a.m58683j(13, str10);
            }
            String str11 = this.f185494p;
            if (str11 != null) {
                g += C52418a.m58683j(14, str11);
            }
            String str12 = this.f185495q;
            if (str12 != null) {
                g += C52418a.m58683j(15, str12);
            }
            int e2 = g + C52418a.m58678e(30, this.f185496r);
            String str13 = this.f185497s;
            if (str13 != null) {
                e2 += C52418a.m58683j(31, str13);
            }
            String str14 = this.f185498t;
            return str14 != null ? e2 + C52418a.m58683j(32, str14) : e2;
        } else if (i2 == 2) {
            this.f185489h.clear();
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
            t44 t44 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t44.f185485d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                t44.f185486e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = j.get(i4);
                    C50019jp1 jp14 = new C50019jp1();
                    if (bArr != null && bArr.length > 0) {
                        jp14.parseFrom(bArr);
                    }
                    t44.f185487f = jp14;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    byte[] bArr2 = j2.get(i5);
                    C64498ko2 ko24 = new C64498ko2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ko24.parseFrom(bArr2);
                    }
                    t44.f185488g = ko24;
                }
                return 0;
            } else if (intValue != 5) {
                switch (intValue) {
                    case 10:
                        t44.f185490i = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        t44.f185491j = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        t44.f185492n = aVar3.mo141633k(intValue);
                        return 0;
                    case 13:
                        t44.f185493o = aVar3.mo141633k(intValue);
                        return 0;
                    case 14:
                        t44.f185494p = aVar3.mo141633k(intValue);
                        return 0;
                    case 15:
                        t44.f185495q = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 30:
                                t44.f185496r = aVar3.mo141629g(intValue);
                                return 0;
                            case 31:
                                t44.f185497s = aVar3.mo141633k(intValue);
                                return 0;
                            case 32:
                                t44.f185498t = aVar3.mo141633k(intValue);
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    byte[] bArr3 = j3.get(i6);
                    r44 r44 = new r44();
                    if (bArr3 != null && bArr3.length > 0) {
                        r44.parseFrom(bArr3);
                    }
                    t44.f185489h.add(r44);
                }
                return 0;
            }
        }
    }
}
