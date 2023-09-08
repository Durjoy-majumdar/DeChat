package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qg2 */
public class C50957qg2 extends C47465a {

    /* renamed from: d */
    public String f140296d;

    /* renamed from: e */
    public String f140297e;

    /* renamed from: f */
    public long f140298f;

    /* renamed from: g */
    public int f140299g;

    /* renamed from: h */
    public String f140300h;

    /* renamed from: i */
    public int f140301i;

    /* renamed from: j */
    public C49546gd3 f140302j;

    /* renamed from: n */
    public int f140303n;

    /* renamed from: o */
    public int f140304o;

    /* renamed from: p */
    public int f140305p;

    /* renamed from: q */
    public int f140306q;

    /* renamed from: r */
    public String f140307r;

    /* renamed from: s */
    public String f140308s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50957qg2)) {
            return false;
        }
        C50957qg2 qg22 = (C50957qg2) aVar;
        return C46238a.m51546a(this.f140296d, qg22.f140296d) && C46238a.m51546a(this.f140297e, qg22.f140297e) && C46238a.m51546a(Long.valueOf(this.f140298f), Long.valueOf(qg22.f140298f)) && C46238a.m51546a(Integer.valueOf(this.f140299g), Integer.valueOf(qg22.f140299g)) && C46238a.m51546a(this.f140300h, qg22.f140300h) && C46238a.m51546a(Integer.valueOf(this.f140301i), Integer.valueOf(qg22.f140301i)) && C46238a.m51546a(this.f140302j, qg22.f140302j) && C46238a.m51546a(Integer.valueOf(this.f140303n), Integer.valueOf(qg22.f140303n)) && C46238a.m51546a(Integer.valueOf(this.f140304o), Integer.valueOf(qg22.f140304o)) && C46238a.m51546a(Integer.valueOf(this.f140305p), Integer.valueOf(qg22.f140305p)) && C46238a.m51546a(Integer.valueOf(this.f140306q), Integer.valueOf(qg22.f140306q)) && C46238a.m51546a(this.f140307r, qg22.f140307r) && C46238a.m51546a(this.f140308s, qg22.f140308s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140296d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140297e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f140298f);
            aVar.mo74318e(4, this.f140299g);
            String str3 = this.f140300h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f140301i);
            C49546gd3 gd32 = this.f140302j;
            if (gd32 != null) {
                aVar.mo74322i(7, gd32.computeSize());
                this.f140302j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f140303n);
            aVar.mo74318e(9, this.f140304o);
            aVar.mo74318e(10, this.f140305p);
            aVar.mo74318e(11, this.f140306q);
            String str4 = this.f140307r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            String str5 = this.f140308s;
            if (str5 == null) {
                return 0;
            }
            aVar.mo74323j(13, str5);
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f140296d;
            int j = str6 != null ? 0 + C52418a.m58683j(1, str6) : 0;
            String str7 = this.f140297e;
            if (str7 != null) {
                j += C52418a.m58683j(2, str7);
            }
            int h = j + C52418a.m58681h(3, this.f140298f) + C52418a.m58678e(4, this.f140299g);
            String str8 = this.f140300h;
            if (str8 != null) {
                h += C52418a.m58683j(5, str8);
            }
            int e = h + C52418a.m58678e(6, this.f140301i);
            C49546gd3 gd33 = this.f140302j;
            if (gd33 != null) {
                e += C52418a.m58682i(7, gd33.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f140303n) + C52418a.m58678e(9, this.f140304o) + C52418a.m58678e(10, this.f140305p) + C52418a.m58678e(11, this.f140306q);
            String str9 = this.f140307r;
            if (str9 != null) {
                e2 += C52418a.m58683j(12, str9);
            }
            String str10 = this.f140308s;
            return str10 != null ? e2 + C52418a.m58683j(13, str10) : e2;
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
            C50957qg2 qg22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qg22.f140296d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qg22.f140297e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qg22.f140298f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    qg22.f140299g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qg22.f140300h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    qg22.f140301i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C49546gd3 gd34 = new C49546gd3();
                        if (bArr != null && bArr.length > 0) {
                            gd34.parseFrom(bArr);
                        }
                        qg22.f140302j = gd34;
                    }
                    return 0;
                case 8:
                    qg22.f140303n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    qg22.f140304o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    qg22.f140305p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    qg22.f140306q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    qg22.f140307r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    qg22.f140308s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
