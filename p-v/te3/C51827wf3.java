package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wf3 */
public class C51827wf3 extends C47465a {

    /* renamed from: d */
    public String f144020d;

    /* renamed from: e */
    public String f144021e;

    /* renamed from: f */
    public String f144022f;

    /* renamed from: g */
    public int f144023g;

    /* renamed from: h */
    public String f144024h;

    /* renamed from: i */
    public String f144025i;

    /* renamed from: j */
    public String f144026j;

    /* renamed from: n */
    public String f144027n;

    /* renamed from: o */
    public String f144028o;

    /* renamed from: p */
    public String f144029p;

    /* renamed from: q */
    public String f144030q;

    /* renamed from: r */
    public String f144031r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51827wf3)) {
            return false;
        }
        C51827wf3 wf32 = (C51827wf3) aVar;
        return C46238a.m51546a(this.f144020d, wf32.f144020d) && C46238a.m51546a(this.f144021e, wf32.f144021e) && C46238a.m51546a(this.f144022f, wf32.f144022f) && C46238a.m51546a(Integer.valueOf(this.f144023g), Integer.valueOf(wf32.f144023g)) && C46238a.m51546a(this.f144024h, wf32.f144024h) && C46238a.m51546a(this.f144025i, wf32.f144025i) && C46238a.m51546a(this.f144026j, wf32.f144026j) && C46238a.m51546a(this.f144027n, wf32.f144027n) && C46238a.m51546a(this.f144028o, wf32.f144028o) && C46238a.m51546a(this.f144029p, wf32.f144029p) && C46238a.m51546a(this.f144030q, wf32.f144030q) && C46238a.m51546a(this.f144031r, wf32.f144031r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144020d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144021e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f144022f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f144023g);
            String str4 = this.f144024h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f144025i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f144026j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f144027n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f144028o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f144029p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            String str10 = this.f144030q;
            if (str10 != null) {
                aVar.mo74323j(11, str10);
            }
            String str11 = this.f144031r;
            if (str11 != null) {
                aVar.mo74323j(12, str11);
            }
            return 0;
        } else if (i == 1) {
            String str12 = this.f144020d;
            if (str12 != null) {
                i2 = 0 + C52418a.m58683j(1, str12);
            }
            String str13 = this.f144021e;
            if (str13 != null) {
                i2 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f144022f;
            if (str14 != null) {
                i2 += C52418a.m58683j(3, str14);
            }
            int e = i2 + C52418a.m58678e(4, this.f144023g);
            String str15 = this.f144024h;
            if (str15 != null) {
                e += C52418a.m58683j(5, str15);
            }
            String str16 = this.f144025i;
            if (str16 != null) {
                e += C52418a.m58683j(6, str16);
            }
            String str17 = this.f144026j;
            if (str17 != null) {
                e += C52418a.m58683j(7, str17);
            }
            String str18 = this.f144027n;
            if (str18 != null) {
                e += C52418a.m58683j(8, str18);
            }
            String str19 = this.f144028o;
            if (str19 != null) {
                e += C52418a.m58683j(9, str19);
            }
            String str20 = this.f144029p;
            if (str20 != null) {
                e += C52418a.m58683j(10, str20);
            }
            String str21 = this.f144030q;
            if (str21 != null) {
                e += C52418a.m58683j(11, str21);
            }
            String str22 = this.f144031r;
            return str22 != null ? e + C52418a.m58683j(12, str22) : e;
        } else if (i == 2) {
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
            C51827wf3 wf32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wf32.f144020d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wf32.f144021e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wf32.f144022f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wf32.f144023g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wf32.f144024h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wf32.f144025i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    wf32.f144026j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wf32.f144027n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wf32.f144028o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    wf32.f144029p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    wf32.f144030q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    wf32.f144031r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
