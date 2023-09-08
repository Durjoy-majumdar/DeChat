package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ka3 */
public class C22505ka3 extends C47465a {

    /* renamed from: d */
    public String f64087d;

    /* renamed from: e */
    public long f64088e = 0;

    /* renamed from: f */
    public int f64089f = 0;

    /* renamed from: g */
    public String f64090g;

    /* renamed from: h */
    public int f64091h = -1;

    /* renamed from: i */
    public long f64092i = 0;

    /* renamed from: j */
    public long f64093j = 0;

    /* renamed from: n */
    public C118433ga3 f64094n;

    /* renamed from: o */
    public String f64095o = "";

    /* renamed from: p */
    public boolean f64096p = false;

    /* renamed from: q */
    public String f64097q = "";

    /* renamed from: r */
    public String f64098r = "";

    /* renamed from: s */
    public int f64099s = -1;

    /* renamed from: t */
    public boolean f64100t = false;

    /* renamed from: u */
    public int f64101u = 0;

    /* renamed from: v */
    public String f64102v = "";

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22505ka3)) {
            return false;
        }
        C22505ka3 ka32 = (C22505ka3) aVar;
        return C46238a.m51546a(this.f64087d, ka32.f64087d) && C46238a.m51546a(Long.valueOf(this.f64088e), Long.valueOf(ka32.f64088e)) && C46238a.m51546a(Integer.valueOf(this.f64089f), Integer.valueOf(ka32.f64089f)) && C46238a.m51546a(this.f64090g, ka32.f64090g) && C46238a.m51546a(Integer.valueOf(this.f64091h), Integer.valueOf(ka32.f64091h)) && C46238a.m51546a(Long.valueOf(this.f64092i), Long.valueOf(ka32.f64092i)) && C46238a.m51546a(Long.valueOf(this.f64093j), Long.valueOf(ka32.f64093j)) && C46238a.m51546a(this.f64094n, ka32.f64094n) && C46238a.m51546a(this.f64095o, ka32.f64095o) && C46238a.m51546a(Boolean.valueOf(this.f64096p), Boolean.valueOf(ka32.f64096p)) && C46238a.m51546a(this.f64097q, ka32.f64097q) && C46238a.m51546a(this.f64098r, ka32.f64098r) && C46238a.m51546a(Integer.valueOf(this.f64099s), Integer.valueOf(ka32.f64099s)) && C46238a.m51546a(Boolean.valueOf(this.f64100t), Boolean.valueOf(ka32.f64100t)) && C46238a.m51546a(Integer.valueOf(this.f64101u), Integer.valueOf(ka32.f64101u)) && C46238a.m51546a(this.f64102v, ka32.f64102v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64087d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f64088e);
            aVar.mo74318e(3, this.f64089f);
            String str2 = this.f64090g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f64091h);
            aVar.mo74321h(6, this.f64092i);
            aVar.mo74321h(7, this.f64093j);
            C118433ga3 ga32 = this.f64094n;
            if (ga32 != null) {
                aVar.mo74322i(8, ga32.computeSize());
                this.f64094n.writeFields(aVar);
            }
            String str3 = this.f64095o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74314a(10, this.f64096p);
            String str4 = this.f64097q;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            String str5 = this.f64098r;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            aVar.mo74318e(13, this.f64099s);
            aVar.mo74314a(14, this.f64100t);
            aVar.mo74318e(15, this.f64101u);
            String str6 = this.f64102v;
            if (str6 != null) {
                aVar.mo74323j(16, str6);
            }
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f64087d;
            if (str7 != null) {
                i3 = C52418a.m58683j(1, str7) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f64088e) + C52418a.m58678e(3, this.f64089f);
            String str8 = this.f64090g;
            if (str8 != null) {
                h += C52418a.m58683j(4, str8);
            }
            int e = h + C52418a.m58678e(5, this.f64091h) + C52418a.m58681h(6, this.f64092i) + C52418a.m58681h(7, this.f64093j);
            C118433ga3 ga33 = this.f64094n;
            if (ga33 != null) {
                e += C52418a.m58682i(8, ga33.computeSize());
            }
            String str9 = this.f64095o;
            if (str9 != null) {
                e += C52418a.m58683j(9, str9);
            }
            int a = e + C52418a.m58674a(10, this.f64096p);
            String str10 = this.f64097q;
            if (str10 != null) {
                a += C52418a.m58683j(11, str10);
            }
            String str11 = this.f64098r;
            if (str11 != null) {
                a += C52418a.m58683j(12, str11);
            }
            int e2 = a + C52418a.m58678e(13, this.f64099s) + C52418a.m58674a(14, this.f64100t) + C52418a.m58678e(15, this.f64101u);
            String str12 = this.f64102v;
            return str12 != null ? e2 + C52418a.m58683j(16, str12) : e2;
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
            C22505ka3 ka32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ka32.f64087d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ka32.f64088e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ka32.f64089f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ka32.f64090g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ka32.f64091h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ka32.f64092i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ka32.f64093j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C118433ga3 ga34 = new C118433ga3();
                        if (bArr != null && bArr.length > 0) {
                            ga34.parseFrom(bArr);
                        }
                        ka32.f64094n = ga34;
                    }
                    return 0;
                case 9:
                    ka32.f64095o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ka32.f64096p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    ka32.f64097q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ka32.f64098r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    ka32.f64099s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    ka32.f64100t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    ka32.f64101u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    ka32.f64102v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
