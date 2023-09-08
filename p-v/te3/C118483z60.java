package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z60 */
public class C118483z60 extends C47465a {

    /* renamed from: d */
    public String f354616d;

    /* renamed from: e */
    public int f354617e;

    /* renamed from: f */
    public int f354618f;

    /* renamed from: g */
    public int f354619g;

    /* renamed from: h */
    public LinkedList<C64746u60> f354620h = new LinkedList<>();

    /* renamed from: i */
    public int f354621i;

    /* renamed from: j */
    public int f354622j;

    /* renamed from: n */
    public String f354623n;

    /* renamed from: o */
    public String f354624o;

    /* renamed from: p */
    public int f354625p;

    /* renamed from: q */
    public int f354626q;

    /* renamed from: r */
    public String f354627r;

    /* renamed from: s */
    public int f354628s;

    /* renamed from: t */
    public String f354629t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118483z60)) {
            return false;
        }
        C118483z60 z602 = (C118483z60) aVar;
        return C46238a.m51546a(this.f354616d, z602.f354616d) && C46238a.m51546a(Integer.valueOf(this.f354617e), Integer.valueOf(z602.f354617e)) && C46238a.m51546a(Integer.valueOf(this.f354618f), Integer.valueOf(z602.f354618f)) && C46238a.m51546a(Integer.valueOf(this.f354619g), Integer.valueOf(z602.f354619g)) && C46238a.m51546a(this.f354620h, z602.f354620h) && C46238a.m51546a(Integer.valueOf(this.f354621i), Integer.valueOf(z602.f354621i)) && C46238a.m51546a(Integer.valueOf(this.f354622j), Integer.valueOf(z602.f354622j)) && C46238a.m51546a(this.f354623n, z602.f354623n) && C46238a.m51546a(this.f354624o, z602.f354624o) && C46238a.m51546a(Integer.valueOf(this.f354625p), Integer.valueOf(z602.f354625p)) && C46238a.m51546a(Integer.valueOf(this.f354626q), Integer.valueOf(z602.f354626q)) && C46238a.m51546a(this.f354627r, z602.f354627r) && C46238a.m51546a(Integer.valueOf(this.f354628s), Integer.valueOf(z602.f354628s)) && C46238a.m51546a(this.f354629t, z602.f354629t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354616d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f354617e);
            aVar.mo74318e(3, this.f354618f);
            aVar.mo74318e(4, this.f354619g);
            aVar.mo74320g(5, 8, this.f354620h);
            aVar.mo74318e(6, this.f354621i);
            aVar.mo74318e(7, this.f354622j);
            String str2 = this.f354623n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f354624o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.f354625p);
            aVar.mo74318e(11, this.f354626q);
            String str4 = this.f354627r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            aVar.mo74318e(13, this.f354628s);
            String str5 = this.f354629t;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f354616d;
            if (str6 != null) {
                i3 = C52418a.m58683j(1, str6) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f354617e) + C52418a.m58678e(3, this.f354618f) + C52418a.m58678e(4, this.f354619g) + C52418a.m58680g(5, 8, this.f354620h) + C52418a.m58678e(6, this.f354621i) + C52418a.m58678e(7, this.f354622j);
            String str7 = this.f354623n;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            String str8 = this.f354624o;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            int e2 = e + C52418a.m58678e(10, this.f354625p) + C52418a.m58678e(11, this.f354626q);
            String str9 = this.f354627r;
            if (str9 != null) {
                e2 += C52418a.m58683j(12, str9);
            }
            int e3 = e2 + C52418a.m58678e(13, this.f354628s);
            String str10 = this.f354629t;
            return str10 != null ? e3 + C52418a.m58683j(14, str10) : e3;
        } else if (i2 == 2) {
            this.f354620h.clear();
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
            C118483z60 z602 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    z602.f354616d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    z602.f354617e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    z602.f354618f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    z602.f354619g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64746u60 u602 = new C64746u60();
                        if (bArr != null && bArr.length > 0) {
                            u602.parseFrom(bArr);
                        }
                        z602.f354620h.add(u602);
                    }
                    return 0;
                case 6:
                    z602.f354621i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    z602.f354622j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    z602.f354623n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    z602.f354624o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    z602.f354625p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    z602.f354626q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    z602.f354627r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    z602.f354628s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    z602.f354629t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
