package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r41 */
public class C64674r41 extends C47465a {

    /* renamed from: d */
    public String f185124d;

    /* renamed from: e */
    public String f185125e;

    /* renamed from: f */
    public String f185126f;

    /* renamed from: g */
    public int f185127g;

    /* renamed from: h */
    public String f185128h;

    /* renamed from: i */
    public long f185129i;

    /* renamed from: j */
    public String f185130j;

    /* renamed from: n */
    public int f185131n;

    /* renamed from: o */
    public C49765hx0 f185132o;

    /* renamed from: p */
    public String f185133p;

    /* renamed from: q */
    public C89349b f185134q;

    /* renamed from: r */
    public C49765hx0 f185135r;

    /* renamed from: s */
    public int f185136s;

    /* renamed from: t */
    public int f185137t;

    /* renamed from: u */
    public int f185138u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64674r41)) {
            return false;
        }
        C64674r41 r412 = (C64674r41) aVar;
        return C46238a.m51546a(this.f185124d, r412.f185124d) && C46238a.m51546a(this.f185125e, r412.f185125e) && C46238a.m51546a(this.f185126f, r412.f185126f) && C46238a.m51546a(Integer.valueOf(this.f185127g), Integer.valueOf(r412.f185127g)) && C46238a.m51546a(this.f185128h, r412.f185128h) && C46238a.m51546a(Long.valueOf(this.f185129i), Long.valueOf(r412.f185129i)) && C46238a.m51546a(this.f185130j, r412.f185130j) && C46238a.m51546a(Integer.valueOf(this.f185131n), Integer.valueOf(r412.f185131n)) && C46238a.m51546a(this.f185132o, r412.f185132o) && C46238a.m51546a(this.f185133p, r412.f185133p) && C46238a.m51546a(this.f185134q, r412.f185134q) && C46238a.m51546a(this.f185135r, r412.f185135r) && C46238a.m51546a(Integer.valueOf(this.f185136s), Integer.valueOf(r412.f185136s)) && C46238a.m51546a(Integer.valueOf(this.f185137t), Integer.valueOf(r412.f185137t)) && C46238a.m51546a(Integer.valueOf(this.f185138u), Integer.valueOf(r412.f185138u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185124d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185125e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185126f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f185127g);
            String str4 = this.f185128h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74321h(6, this.f185129i);
            String str5 = this.f185130j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f185131n);
            C49765hx0 hx02 = this.f185132o;
            if (hx02 != null) {
                aVar.mo74322i(9, hx02.computeSize());
                this.f185132o.writeFields(aVar);
            }
            String str6 = this.f185133p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            C89349b bVar = this.f185134q;
            if (bVar != null) {
                aVar.mo74315b(11, bVar);
            }
            C49765hx0 hx03 = this.f185135r;
            if (hx03 != null) {
                aVar.mo74322i(12, hx03.computeSize());
                this.f185135r.writeFields(aVar);
            }
            aVar.mo74318e(13, this.f185136s);
            aVar.mo74318e(14, this.f185137t);
            aVar.mo74318e(1000, this.f185138u);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f185124d;
            if (str7 != null) {
                i3 = C52418a.m58683j(1, str7) + 0;
            }
            String str8 = this.f185125e;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f185126f;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            int e = i3 + C52418a.m58678e(4, this.f185127g);
            String str10 = this.f185128h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            int h = e + C52418a.m58681h(6, this.f185129i);
            String str11 = this.f185130j;
            if (str11 != null) {
                h += C52418a.m58683j(7, str11);
            }
            int e2 = h + C52418a.m58678e(8, this.f185131n);
            C49765hx0 hx04 = this.f185132o;
            if (hx04 != null) {
                e2 += C52418a.m58682i(9, hx04.computeSize());
            }
            String str12 = this.f185133p;
            if (str12 != null) {
                e2 += C52418a.m58683j(10, str12);
            }
            C89349b bVar2 = this.f185134q;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(11, bVar2);
            }
            C49765hx0 hx05 = this.f185135r;
            if (hx05 != null) {
                e2 += C52418a.m58682i(12, hx05.computeSize());
            }
            return e2 + C52418a.m58678e(13, this.f185136s) + C52418a.m58678e(14, this.f185137t) + C52418a.m58678e(1000, this.f185138u);
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
            C64674r41 r412 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1000) {
                switch (intValue) {
                    case 1:
                        r412.f185124d = aVar3.mo141633k(intValue);
                        return 0;
                    case 2:
                        r412.f185125e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        r412.f185126f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        r412.f185127g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        r412.f185128h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        r412.f185129i = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        r412.f185130j = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        r412.f185131n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C49765hx0 hx06 = new C49765hx0();
                            if (bArr != null && bArr.length > 0) {
                                hx06.parseFrom(bArr);
                            }
                            r412.f185132o = hx06;
                        }
                        return 0;
                    case 10:
                        r412.f185133p = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        r412.f185134q = aVar3.mo141626d(intValue);
                        return 0;
                    case 12:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C49765hx0 hx07 = new C49765hx0();
                            if (bArr2 != null && bArr2.length > 0) {
                                hx07.parseFrom(bArr2);
                            }
                            r412.f185135r = hx07;
                        }
                        return 0;
                    case 13:
                        r412.f185136s = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        r412.f185137t = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                r412.f185138u = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
