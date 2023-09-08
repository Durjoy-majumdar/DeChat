package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e73 */
public class C49243e73 extends C47465a {

    /* renamed from: d */
    public String f132753d;

    /* renamed from: e */
    public String f132754e;

    /* renamed from: f */
    public String f132755f;

    /* renamed from: g */
    public String f132756g;

    /* renamed from: h */
    public String f132757h;

    /* renamed from: i */
    public String f132758i;

    /* renamed from: j */
    public String f132759j;

    /* renamed from: n */
    public String f132760n;

    /* renamed from: o */
    public int f132761o;

    /* renamed from: p */
    public C48819b73 f132762p;

    /* renamed from: q */
    public String f132763q;

    /* renamed from: r */
    public C49957j73 f132764r;

    /* renamed from: s */
    public String f132765s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49243e73)) {
            return false;
        }
        C49243e73 e732 = (C49243e73) aVar;
        return C46238a.m51546a(this.f132753d, e732.f132753d) && C46238a.m51546a(this.f132754e, e732.f132754e) && C46238a.m51546a(this.f132755f, e732.f132755f) && C46238a.m51546a(this.f132756g, e732.f132756g) && C46238a.m51546a(this.f132757h, e732.f132757h) && C46238a.m51546a(this.f132758i, e732.f132758i) && C46238a.m51546a(this.f132759j, e732.f132759j) && C46238a.m51546a(this.f132760n, e732.f132760n) && C46238a.m51546a(Integer.valueOf(this.f132761o), Integer.valueOf(e732.f132761o)) && C46238a.m51546a(this.f132762p, e732.f132762p) && C46238a.m51546a(this.f132763q, e732.f132763q) && C46238a.m51546a(this.f132764r, e732.f132764r) && C46238a.m51546a(this.f132765s, e732.f132765s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132753d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132754e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132755f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f132756g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f132757h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f132758i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f132759j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f132760n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            aVar.mo74318e(9, this.f132761o);
            C48819b73 b732 = this.f132762p;
            if (b732 != null) {
                aVar.mo74322i(10, b732.computeSize());
                this.f132762p.writeFields(aVar);
            }
            String str9 = this.f132763q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            C49957j73 j732 = this.f132764r;
            if (j732 != null) {
                aVar.mo74322i(12, j732.computeSize());
                this.f132764r.writeFields(aVar);
            }
            String str10 = this.f132765s;
            if (str10 == null) {
                return 0;
            }
            aVar.mo74323j(13, str10);
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f132753d;
            int j = str11 != null ? 0 + C52418a.m58683j(1, str11) : 0;
            String str12 = this.f132754e;
            if (str12 != null) {
                j += C52418a.m58683j(2, str12);
            }
            String str13 = this.f132755f;
            if (str13 != null) {
                j += C52418a.m58683j(3, str13);
            }
            String str14 = this.f132756g;
            if (str14 != null) {
                j += C52418a.m58683j(4, str14);
            }
            String str15 = this.f132757h;
            if (str15 != null) {
                j += C52418a.m58683j(5, str15);
            }
            String str16 = this.f132758i;
            if (str16 != null) {
                j += C52418a.m58683j(6, str16);
            }
            String str17 = this.f132759j;
            if (str17 != null) {
                j += C52418a.m58683j(7, str17);
            }
            String str18 = this.f132760n;
            if (str18 != null) {
                j += C52418a.m58683j(8, str18);
            }
            int e = j + C52418a.m58678e(9, this.f132761o);
            C48819b73 b733 = this.f132762p;
            if (b733 != null) {
                e += C52418a.m58682i(10, b733.computeSize());
            }
            String str19 = this.f132763q;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            C49957j73 j733 = this.f132764r;
            if (j733 != null) {
                e += C52418a.m58682i(12, j733.computeSize());
            }
            String str20 = this.f132765s;
            return str20 != null ? e + C52418a.m58683j(13, str20) : e;
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
            C49243e73 e732 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e732.f132753d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e732.f132754e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    e732.f132755f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e732.f132756g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    e732.f132757h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e732.f132758i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e732.f132759j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    e732.f132760n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    e732.f132761o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C48819b73 b734 = new C48819b73();
                        if (bArr != null && bArr.length > 0) {
                            b734.parseFrom(bArr);
                        }
                        e732.f132762p = b734;
                    }
                    return 0;
                case 11:
                    e732.f132763q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C49957j73 j734 = new C49957j73();
                        if (bArr2 != null && bArr2.length > 0) {
                            j734.parseFrom(bArr2);
                        }
                        e732.f132764r = j734;
                    }
                    return 0;
                case 13:
                    e732.f132765s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
