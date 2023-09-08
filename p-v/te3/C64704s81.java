package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s81 */
public class C64704s81 extends C47465a {

    /* renamed from: d */
    public long f185374d;

    /* renamed from: e */
    public C64620p2 f185375e;

    /* renamed from: f */
    public String f185376f;

    /* renamed from: g */
    public String f185377g;

    /* renamed from: h */
    public String f185378h;

    /* renamed from: i */
    public String f185379i;

    /* renamed from: j */
    public String f185380j;

    /* renamed from: n */
    public int f185381n;

    /* renamed from: o */
    public String f185382o;

    /* renamed from: p */
    public int f185383p;

    /* renamed from: q */
    public int f185384q;

    /* renamed from: r */
    public long f185385r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64704s81)) {
            return false;
        }
        C64704s81 s812 = (C64704s81) aVar;
        return C46238a.m51546a(Long.valueOf(this.f185374d), Long.valueOf(s812.f185374d)) && C46238a.m51546a(this.f185375e, s812.f185375e) && C46238a.m51546a(this.f185376f, s812.f185376f) && C46238a.m51546a(this.f185377g, s812.f185377g) && C46238a.m51546a(this.f185378h, s812.f185378h) && C46238a.m51546a(this.f185379i, s812.f185379i) && C46238a.m51546a(this.f185380j, s812.f185380j) && C46238a.m51546a(Integer.valueOf(this.f185381n), Integer.valueOf(s812.f185381n)) && C46238a.m51546a(this.f185382o, s812.f185382o) && C46238a.m51546a(Integer.valueOf(this.f185383p), Integer.valueOf(s812.f185383p)) && C46238a.m51546a(Integer.valueOf(this.f185384q), Integer.valueOf(s812.f185384q)) && C46238a.m51546a(Long.valueOf(this.f185385r), Long.valueOf(s812.f185385r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f185374d);
            C64620p2 p2Var = this.f185375e;
            if (p2Var != null) {
                aVar.mo74322i(2, p2Var.computeSize());
                this.f185375e.writeFields(aVar);
            }
            String str = this.f185376f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f185377g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f185378h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f185379i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f185380j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f185381n);
            String str6 = this.f185382o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            aVar.mo74318e(10, this.f185383p);
            aVar.mo74318e(13, this.f185384q);
            aVar.mo74321h(14, this.f185385r);
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f185374d) + 0;
            C64620p2 p2Var2 = this.f185375e;
            if (p2Var2 != null) {
                h += C52418a.m58682i(2, p2Var2.computeSize());
            }
            String str7 = this.f185376f;
            if (str7 != null) {
                h += C52418a.m58683j(3, str7);
            }
            String str8 = this.f185377g;
            if (str8 != null) {
                h += C52418a.m58683j(4, str8);
            }
            String str9 = this.f185378h;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            String str10 = this.f185379i;
            if (str10 != null) {
                h += C52418a.m58683j(6, str10);
            }
            String str11 = this.f185380j;
            if (str11 != null) {
                h += C52418a.m58683j(7, str11);
            }
            int e = h + C52418a.m58678e(8, this.f185381n);
            String str12 = this.f185382o;
            if (str12 != null) {
                e += C52418a.m58683j(9, str12);
            }
            return e + C52418a.m58678e(10, this.f185383p) + C52418a.m58678e(13, this.f185384q) + C52418a.m58681h(14, this.f185385r);
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
            C64704s81 s812 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s812.f185374d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64620p2 p2Var3 = new C64620p2();
                        if (bArr != null && bArr.length > 0) {
                            p2Var3.parseFrom(bArr);
                        }
                        s812.f185375e = p2Var3;
                    }
                    return 0;
                case 3:
                    s812.f185376f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s812.f185377g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    s812.f185378h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    s812.f185379i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    s812.f185380j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    s812.f185381n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    s812.f185382o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    s812.f185383p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    s812.f185384q = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    s812.f185385r = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
