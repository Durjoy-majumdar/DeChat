package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.io3 */
public class C90419io3 extends C47465a {

    /* renamed from: d */
    public int f259583d;

    /* renamed from: e */
    public int f259584e;

    /* renamed from: f */
    public String f259585f;

    /* renamed from: g */
    public String f259586g;

    /* renamed from: h */
    public String f259587h;

    /* renamed from: i */
    public String f259588i;

    /* renamed from: j */
    public String f259589j;

    /* renamed from: n */
    public String f259590n;

    /* renamed from: o */
    public String f259591o;

    /* renamed from: p */
    public double f259592p;

    /* renamed from: q */
    public String f259593q;

    /* renamed from: r */
    public String f259594r;

    /* renamed from: s */
    public C64826xd2 f259595s;

    /* renamed from: t */
    public String f259596t;

    /* renamed from: u */
    public String f259597u;

    /* renamed from: v */
    public String f259598v;

    /* renamed from: w */
    public String f259599w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90419io3)) {
            return false;
        }
        C90419io3 io32 = (C90419io3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f259583d), Integer.valueOf(io32.f259583d)) && C46238a.m51546a(Integer.valueOf(this.f259584e), Integer.valueOf(io32.f259584e)) && C46238a.m51546a(this.f259585f, io32.f259585f) && C46238a.m51546a(this.f259586g, io32.f259586g) && C46238a.m51546a(this.f259587h, io32.f259587h) && C46238a.m51546a(this.f259588i, io32.f259588i) && C46238a.m51546a(this.f259589j, io32.f259589j) && C46238a.m51546a(this.f259590n, io32.f259590n) && C46238a.m51546a(this.f259591o, io32.f259591o) && C46238a.m51546a(Double.valueOf(this.f259592p), Double.valueOf(io32.f259592p)) && C46238a.m51546a(this.f259593q, io32.f259593q) && C46238a.m51546a(this.f259594r, io32.f259594r) && C46238a.m51546a(this.f259595s, io32.f259595s) && C46238a.m51546a(this.f259596t, io32.f259596t) && C46238a.m51546a(this.f259597u, io32.f259597u) && C46238a.m51546a(this.f259598v, io32.f259598v) && C46238a.m51546a(this.f259599w, io32.f259599w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f259583d);
            aVar.mo74318e(2, this.f259584e);
            String str = this.f259585f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f259586g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f259587h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f259588i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f259589j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f259590n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f259591o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            aVar.mo74316c(10, this.f259592p);
            String str8 = this.f259593q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f259594r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            C64826xd2 xd22 = this.f259595s;
            if (xd22 != null) {
                aVar.mo74322i(14, xd22.computeSize());
                this.f259595s.writeFields(aVar);
            }
            String str10 = this.f259596t;
            if (str10 != null) {
                aVar.mo74323j(15, str10);
            }
            String str11 = this.f259597u;
            if (str11 != null) {
                aVar.mo74323j(16, str11);
            }
            String str12 = this.f259598v;
            if (str12 != null) {
                aVar.mo74323j(17, str12);
            }
            String str13 = this.f259599w;
            if (str13 != null) {
                aVar.mo74323j(18, str13);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f259583d) + 0 + C52418a.m58678e(2, this.f259584e);
            String str14 = this.f259585f;
            if (str14 != null) {
                e += C52418a.m58683j(3, str14);
            }
            String str15 = this.f259586g;
            if (str15 != null) {
                e += C52418a.m58683j(4, str15);
            }
            String str16 = this.f259587h;
            if (str16 != null) {
                e += C52418a.m58683j(5, str16);
            }
            String str17 = this.f259588i;
            if (str17 != null) {
                e += C52418a.m58683j(6, str17);
            }
            String str18 = this.f259589j;
            if (str18 != null) {
                e += C52418a.m58683j(7, str18);
            }
            String str19 = this.f259590n;
            if (str19 != null) {
                e += C52418a.m58683j(8, str19);
            }
            String str20 = this.f259591o;
            if (str20 != null) {
                e += C52418a.m58683j(9, str20);
            }
            int c = e + C52418a.m58676c(10, this.f259592p);
            String str21 = this.f259593q;
            if (str21 != null) {
                c += C52418a.m58683j(11, str21);
            }
            String str22 = this.f259594r;
            if (str22 != null) {
                c += C52418a.m58683j(12, str22);
            }
            C64826xd2 xd23 = this.f259595s;
            if (xd23 != null) {
                c += C52418a.m58682i(14, xd23.computeSize());
            }
            String str23 = this.f259596t;
            if (str23 != null) {
                c += C52418a.m58683j(15, str23);
            }
            String str24 = this.f259597u;
            if (str24 != null) {
                c += C52418a.m58683j(16, str24);
            }
            String str25 = this.f259598v;
            if (str25 != null) {
                c += C52418a.m58683j(17, str25);
            }
            String str26 = this.f259599w;
            return str26 != null ? c + C52418a.m58683j(18, str26) : c;
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
            C90419io3 io32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    io32.f259583d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    io32.f259584e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    io32.f259585f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    io32.f259586g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    io32.f259587h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    io32.f259588i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    io32.f259589j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    io32.f259590n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    io32.f259591o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    io32.f259592p = aVar3.mo141627e(intValue);
                    return 0;
                case 11:
                    io32.f259593q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    io32.f259594r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64826xd2 xd24 = new C64826xd2();
                        if (bArr != null && bArr.length > 0) {
                            xd24.parseFrom(bArr);
                        }
                        io32.f259595s = xd24;
                    }
                    return 0;
                case 15:
                    io32.f259596t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    io32.f259597u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    io32.f259598v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    io32.f259599w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
