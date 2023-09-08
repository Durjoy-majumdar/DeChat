package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mr3 */
public class C64563mr3 extends C47465a {

    /* renamed from: d */
    public String f184380d;

    /* renamed from: e */
    public String f184381e;

    /* renamed from: f */
    public int f184382f;

    /* renamed from: g */
    public LinkedList<String> f184383g = new LinkedList<>();

    /* renamed from: h */
    public int f184384h;

    /* renamed from: i */
    public LinkedList<C64563mr3> f184385i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<String> f184386j = new LinkedList<>();

    /* renamed from: n */
    public int f184387n;

    /* renamed from: o */
    public String f184388o;

    /* renamed from: p */
    public String f184389p;

    /* renamed from: q */
    public String f184390q;

    /* renamed from: r */
    public int f184391r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64563mr3)) {
            return false;
        }
        C64563mr3 mr32 = (C64563mr3) aVar;
        return C46238a.m51546a(this.f184380d, mr32.f184380d) && C46238a.m51546a(this.f184381e, mr32.f184381e) && C46238a.m51546a(Integer.valueOf(this.f184382f), Integer.valueOf(mr32.f184382f)) && C46238a.m51546a(this.f184383g, mr32.f184383g) && C46238a.m51546a(Integer.valueOf(this.f184384h), Integer.valueOf(mr32.f184384h)) && C46238a.m51546a(this.f184385i, mr32.f184385i) && C46238a.m51546a(this.f184386j, mr32.f184386j) && C46238a.m51546a(Integer.valueOf(this.f184387n), Integer.valueOf(mr32.f184387n)) && C46238a.m51546a(this.f184388o, mr32.f184388o) && C46238a.m51546a(this.f184389p, mr32.f184389p) && C46238a.m51546a(this.f184390q, mr32.f184390q) && C46238a.m51546a(Integer.valueOf(this.f184391r), Integer.valueOf(mr32.f184391r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184380d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184381e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f184382f);
            aVar.mo74320g(4, 1, this.f184383g);
            aVar.mo74318e(5, this.f184384h);
            aVar.mo74320g(6, 8, this.f184385i);
            aVar.mo74320g(7, 1, this.f184386j);
            aVar.mo74318e(8, this.f184387n);
            String str3 = this.f184388o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            String str4 = this.f184389p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            String str5 = this.f184390q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            aVar.mo74318e(12, this.f184391r);
            return 0;
        } else if (i == 1) {
            String str6 = this.f184380d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f184381e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f184382f) + C52418a.m58680g(4, 1, this.f184383g) + C52418a.m58678e(5, this.f184384h) + C52418a.m58680g(6, 8, this.f184385i) + C52418a.m58680g(7, 1, this.f184386j) + C52418a.m58678e(8, this.f184387n);
            String str8 = this.f184388o;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            String str9 = this.f184389p;
            if (str9 != null) {
                e += C52418a.m58683j(10, str9);
            }
            String str10 = this.f184390q;
            if (str10 != null) {
                e += C52418a.m58683j(11, str10);
            }
            return e + C52418a.m58678e(12, this.f184391r);
        } else if (i == 2) {
            this.f184383g.clear();
            this.f184385i.clear();
            this.f184386j.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64563mr3 mr32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mr32.f184380d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    mr32.f184381e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mr32.f184382f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    mr32.f184383g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    mr32.f184384h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64563mr3 mr33 = new C64563mr3();
                        if (bArr != null && bArr.length > 0) {
                            mr33.parseFrom(bArr);
                        }
                        mr32.f184385i.add(mr33);
                    }
                    return 0;
                case 7:
                    mr32.f184386j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    mr32.f184387n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    mr32.f184388o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    mr32.f184389p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    mr32.f184390q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    mr32.f184391r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
