package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u5 */
public class C101848u5 extends C47465a {

    /* renamed from: d */
    public String f299572d;

    /* renamed from: e */
    public String f299573e;

    /* renamed from: f */
    public int f299574f;

    /* renamed from: g */
    public String f299575g;

    /* renamed from: h */
    public int f299576h;

    /* renamed from: i */
    public String f299577i;

    /* renamed from: j */
    public int f299578j;

    /* renamed from: n */
    public String f299579n;

    /* renamed from: o */
    public C51018qv3 f299580o;

    /* renamed from: p */
    public int f299581p;

    /* renamed from: q */
    public int f299582q;

    /* renamed from: r */
    public String f299583r;

    /* renamed from: s */
    public String f299584s;

    /* renamed from: t */
    public String f299585t;

    /* renamed from: u */
    public String f299586u;

    /* renamed from: v */
    public int f299587v;

    /* renamed from: w */
    public String f299588w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101848u5)) {
            return false;
        }
        C101848u5 u5Var = (C101848u5) aVar;
        return C46238a.m51546a(this.f299572d, u5Var.f299572d) && C46238a.m51546a(this.f299573e, u5Var.f299573e) && C46238a.m51546a(Integer.valueOf(this.f299574f), Integer.valueOf(u5Var.f299574f)) && C46238a.m51546a(this.f299575g, u5Var.f299575g) && C46238a.m51546a(Integer.valueOf(this.f299576h), Integer.valueOf(u5Var.f299576h)) && C46238a.m51546a(this.f299577i, u5Var.f299577i) && C46238a.m51546a(Integer.valueOf(this.f299578j), Integer.valueOf(u5Var.f299578j)) && C46238a.m51546a(this.f299579n, u5Var.f299579n) && C46238a.m51546a(this.f299580o, u5Var.f299580o) && C46238a.m51546a(Integer.valueOf(this.f299581p), Integer.valueOf(u5Var.f299581p)) && C46238a.m51546a(Integer.valueOf(this.f299582q), Integer.valueOf(u5Var.f299582q)) && C46238a.m51546a(this.f299583r, u5Var.f299583r) && C46238a.m51546a(this.f299584s, u5Var.f299584s) && C46238a.m51546a(this.f299585t, u5Var.f299585t) && C46238a.m51546a(this.f299586u, u5Var.f299586u) && C46238a.m51546a(Integer.valueOf(this.f299587v), Integer.valueOf(u5Var.f299587v)) && C46238a.m51546a(this.f299588w, u5Var.f299588w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299572d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299573e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f299574f);
            String str3 = this.f299575g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f299576h);
            String str4 = this.f299577i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f299578j);
            String str5 = this.f299579n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            C51018qv3 qv32 = this.f299580o;
            if (qv32 != null) {
                aVar.mo74322i(9, qv32.computeSize());
                this.f299580o.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f299581p);
            aVar.mo74318e(11, this.f299582q);
            String str6 = this.f299583r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            String str7 = this.f299584s;
            if (str7 != null) {
                aVar.mo74323j(13, str7);
            }
            String str8 = this.f299585t;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            String str9 = this.f299586u;
            if (str9 != null) {
                aVar.mo74323j(15, str9);
            }
            aVar.mo74318e(16, this.f299587v);
            String str10 = this.f299588w;
            if (str10 != null) {
                aVar.mo74323j(17, str10);
            }
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f299572d;
            if (str11 != null) {
                i3 = C52418a.m58683j(1, str11) + 0;
            }
            String str12 = this.f299573e;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            int e = i3 + C52418a.m58678e(3, this.f299574f);
            String str13 = this.f299575g;
            if (str13 != null) {
                e += C52418a.m58683j(4, str13);
            }
            int e2 = e + C52418a.m58678e(5, this.f299576h);
            String str14 = this.f299577i;
            if (str14 != null) {
                e2 += C52418a.m58683j(6, str14);
            }
            int e3 = e2 + C52418a.m58678e(7, this.f299578j);
            String str15 = this.f299579n;
            if (str15 != null) {
                e3 += C52418a.m58683j(8, str15);
            }
            C51018qv3 qv33 = this.f299580o;
            if (qv33 != null) {
                e3 += C52418a.m58682i(9, qv33.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(10, this.f299581p) + C52418a.m58678e(11, this.f299582q);
            String str16 = this.f299583r;
            if (str16 != null) {
                e4 += C52418a.m58683j(12, str16);
            }
            String str17 = this.f299584s;
            if (str17 != null) {
                e4 += C52418a.m58683j(13, str17);
            }
            String str18 = this.f299585t;
            if (str18 != null) {
                e4 += C52418a.m58683j(14, str18);
            }
            String str19 = this.f299586u;
            if (str19 != null) {
                e4 += C52418a.m58683j(15, str19);
            }
            int e5 = e4 + C52418a.m58678e(16, this.f299587v);
            String str20 = this.f299588w;
            return str20 != null ? e5 + C52418a.m58683j(17, str20) : e5;
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
            C101848u5 u5Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u5Var.f299572d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    u5Var.f299573e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    u5Var.f299574f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    u5Var.f299575g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    u5Var.f299576h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    u5Var.f299577i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    u5Var.f299578j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    u5Var.f299579n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        u5Var.f299580o = qv34;
                    }
                    return 0;
                case 10:
                    u5Var.f299581p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    u5Var.f299582q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    u5Var.f299583r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    u5Var.f299584s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    u5Var.f299585t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    u5Var.f299586u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    u5Var.f299587v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    u5Var.f299588w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
