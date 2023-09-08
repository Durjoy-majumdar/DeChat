package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mc3 */
public class C64552mc3 extends C47465a {

    /* renamed from: d */
    public int f184278d;

    /* renamed from: e */
    public String f184279e;

    /* renamed from: f */
    public String f184280f;

    /* renamed from: g */
    public int f184281g;

    /* renamed from: h */
    public String f184282h;

    /* renamed from: i */
    public String f184283i;

    /* renamed from: j */
    public String f184284j;

    /* renamed from: n */
    public int f184285n;

    /* renamed from: o */
    public String f184286o;

    /* renamed from: p */
    public String f184287p;

    /* renamed from: q */
    public long f184288q;

    /* renamed from: r */
    public LinkedList<C48839bc3> f184289r = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64552mc3)) {
            return false;
        }
        C64552mc3 mc32 = (C64552mc3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184278d), Integer.valueOf(mc32.f184278d)) && C46238a.m51546a(this.f184279e, mc32.f184279e) && C46238a.m51546a(this.f184280f, mc32.f184280f) && C46238a.m51546a(Integer.valueOf(this.f184281g), Integer.valueOf(mc32.f184281g)) && C46238a.m51546a(this.f184282h, mc32.f184282h) && C46238a.m51546a(this.f184283i, mc32.f184283i) && C46238a.m51546a(this.f184284j, mc32.f184284j) && C46238a.m51546a(Integer.valueOf(this.f184285n), Integer.valueOf(mc32.f184285n)) && C46238a.m51546a(this.f184286o, mc32.f184286o) && C46238a.m51546a(this.f184287p, mc32.f184287p) && C46238a.m51546a(Long.valueOf(this.f184288q), Long.valueOf(mc32.f184288q)) && C46238a.m51546a(this.f184289r, mc32.f184289r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184278d);
            String str = this.f184279e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184280f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f184281g);
            String str3 = this.f184282h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f184283i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f184284j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f184285n);
            String str6 = this.f184286o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f184287p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74321h(11, this.f184288q);
            aVar.mo74320g(12, 8, this.f184289r);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184278d) + 0;
            String str8 = this.f184279e;
            if (str8 != null) {
                e += C52418a.m58683j(2, str8);
            }
            String str9 = this.f184280f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            int e2 = e + C52418a.m58678e(4, this.f184281g);
            String str10 = this.f184282h;
            if (str10 != null) {
                e2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f184283i;
            if (str11 != null) {
                e2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f184284j;
            if (str12 != null) {
                e2 += C52418a.m58683j(7, str12);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f184285n);
            String str13 = this.f184286o;
            if (str13 != null) {
                e3 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f184287p;
            if (str14 != null) {
                e3 += C52418a.m58683j(10, str14);
            }
            return e3 + C52418a.m58681h(11, this.f184288q) + C52418a.m58680g(12, 8, this.f184289r);
        } else if (i == 2) {
            this.f184289r.clear();
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
            C64552mc3 mc32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mc32.f184278d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    mc32.f184279e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mc32.f184280f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mc32.f184281g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mc32.f184282h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mc32.f184283i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mc32.f184284j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mc32.f184285n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    mc32.f184286o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    mc32.f184287p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    mc32.f184288q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48839bc3 bc32 = new C48839bc3();
                        if (bArr != null && bArr.length > 0) {
                            bc32.parseFrom(bArr);
                        }
                        mc32.f184289r.add(bc32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
