package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mc4 extends C47465a {

    /* renamed from: d */
    public long f298799d;

    /* renamed from: e */
    public String f298800e;

    /* renamed from: f */
    public String f298801f;

    /* renamed from: g */
    public String f298802g;

    /* renamed from: h */
    public String f298803h;

    /* renamed from: i */
    public String f298804i;

    /* renamed from: j */
    public int f298805j;

    /* renamed from: n */
    public int f298806n;

    /* renamed from: o */
    public int f298807o;

    /* renamed from: p */
    public int f298808p;

    /* renamed from: q */
    public int f298809q;

    /* renamed from: r */
    public String f298810r;

    /* renamed from: s */
    public hc4 f298811s;

    /* renamed from: t */
    public int f298812t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mc4)) {
            return false;
        }
        mc4 mc4 = (mc4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f298799d), Long.valueOf(mc4.f298799d)) && C46238a.m51546a(this.f298800e, mc4.f298800e) && C46238a.m51546a(this.f298801f, mc4.f298801f) && C46238a.m51546a(this.f298802g, mc4.f298802g) && C46238a.m51546a(this.f298803h, mc4.f298803h) && C46238a.m51546a(this.f298804i, mc4.f298804i) && C46238a.m51546a(Integer.valueOf(this.f298805j), Integer.valueOf(mc4.f298805j)) && C46238a.m51546a(Integer.valueOf(this.f298806n), Integer.valueOf(mc4.f298806n)) && C46238a.m51546a(Integer.valueOf(this.f298807o), Integer.valueOf(mc4.f298807o)) && C46238a.m51546a(Integer.valueOf(this.f298808p), Integer.valueOf(mc4.f298808p)) && C46238a.m51546a(Integer.valueOf(this.f298809q), Integer.valueOf(mc4.f298809q)) && C46238a.m51546a(this.f298810r, mc4.f298810r) && C46238a.m51546a(this.f298811s, mc4.f298811s) && C46238a.m51546a(Integer.valueOf(this.f298812t), Integer.valueOf(mc4.f298812t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f298799d);
            String str = this.f298800e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f298801f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f298802g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298803h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f298804i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f298805j);
            aVar.mo74318e(8, this.f298806n);
            aVar.mo74318e(9, this.f298807o);
            aVar.mo74318e(10, this.f298808p);
            aVar.mo74318e(11, this.f298809q);
            String str6 = this.f298810r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            hc4 hc4 = this.f298811s;
            if (hc4 != null) {
                aVar.mo74322i(13, hc4.computeSize());
                this.f298811s.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f298812t);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f298799d) + 0;
            String str7 = this.f298800e;
            if (str7 != null) {
                h += C52418a.m58683j(2, str7);
            }
            String str8 = this.f298801f;
            if (str8 != null) {
                h += C52418a.m58683j(3, str8);
            }
            String str9 = this.f298802g;
            if (str9 != null) {
                h += C52418a.m58683j(4, str9);
            }
            String str10 = this.f298803h;
            if (str10 != null) {
                h += C52418a.m58683j(5, str10);
            }
            String str11 = this.f298804i;
            if (str11 != null) {
                h += C52418a.m58683j(6, str11);
            }
            int e = h + C52418a.m58678e(7, this.f298805j) + C52418a.m58678e(8, this.f298806n) + C52418a.m58678e(9, this.f298807o) + C52418a.m58678e(10, this.f298808p) + C52418a.m58678e(11, this.f298809q);
            String str12 = this.f298810r;
            if (str12 != null) {
                e += C52418a.m58683j(12, str12);
            }
            hc4 hc42 = this.f298811s;
            if (hc42 != null) {
                e += C52418a.m58682i(13, hc42.computeSize());
            }
            return e + C52418a.m58678e(14, this.f298812t);
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
            mc4 mc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mc4.f298799d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    mc4.f298800e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mc4.f298801f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mc4.f298802g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mc4.f298803h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mc4.f298804i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mc4.f298805j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    mc4.f298806n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    mc4.f298807o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    mc4.f298808p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    mc4.f298809q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    mc4.f298810r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        hc4 hc43 = new hc4();
                        if (bArr != null && bArr.length > 0) {
                            hc43.parseFrom(bArr);
                        }
                        mc4.f298811s = hc43;
                    }
                    return 0;
                case 14:
                    mc4.f298812t = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
