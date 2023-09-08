package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eq2 */
public class C64347eq2 extends C47465a {

    /* renamed from: d */
    public int f183016d;

    /* renamed from: e */
    public C89349b f183017e;

    /* renamed from: f */
    public String f183018f;

    /* renamed from: g */
    public String f183019g;

    /* renamed from: h */
    public int f183020h;

    /* renamed from: i */
    public String f183021i;

    /* renamed from: j */
    public int f183022j;

    /* renamed from: n */
    public boolean f183023n;

    /* renamed from: o */
    public boolean f183024o;

    /* renamed from: p */
    public String f183025p;

    /* renamed from: q */
    public int f183026q;

    /* renamed from: r */
    public C89349b f183027r;

    /* renamed from: s */
    public int f183028s;

    /* renamed from: t */
    public C52025xv f183029t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64347eq2)) {
            return false;
        }
        C64347eq2 eq22 = (C64347eq2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183016d), Integer.valueOf(eq22.f183016d)) && C46238a.m51546a(this.f183017e, eq22.f183017e) && C46238a.m51546a(this.f183018f, eq22.f183018f) && C46238a.m51546a(this.f183019g, eq22.f183019g) && C46238a.m51546a(Integer.valueOf(this.f183020h), Integer.valueOf(eq22.f183020h)) && C46238a.m51546a(this.f183021i, eq22.f183021i) && C46238a.m51546a(Integer.valueOf(this.f183022j), Integer.valueOf(eq22.f183022j)) && C46238a.m51546a(Boolean.valueOf(this.f183023n), Boolean.valueOf(eq22.f183023n)) && C46238a.m51546a(Boolean.valueOf(this.f183024o), Boolean.valueOf(eq22.f183024o)) && C46238a.m51546a(this.f183025p, eq22.f183025p) && C46238a.m51546a(Integer.valueOf(this.f183026q), Integer.valueOf(eq22.f183026q)) && C46238a.m51546a(this.f183027r, eq22.f183027r) && C46238a.m51546a(Integer.valueOf(this.f183028s), Integer.valueOf(eq22.f183028s)) && C46238a.m51546a(this.f183029t, eq22.f183029t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183016d);
            C89349b bVar = this.f183017e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str = this.f183018f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f183019g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f183020h);
            String str3 = this.f183021i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f183022j);
            aVar.mo74314a(8, this.f183023n);
            aVar.mo74314a(9, this.f183024o);
            String str4 = this.f183025p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            aVar.mo74318e(11, this.f183026q);
            C89349b bVar2 = this.f183027r;
            if (bVar2 != null) {
                aVar.mo74315b(12, bVar2);
            }
            aVar.mo74318e(13, this.f183028s);
            C52025xv xvVar = this.f183029t;
            if (xvVar != null) {
                aVar.mo74322i(14, xvVar.computeSize());
                this.f183029t.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f183016d) + 0;
            C89349b bVar3 = this.f183017e;
            if (bVar3 != null) {
                e += C52418a.m58675b(2, bVar3);
            }
            String str5 = this.f183018f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f183019g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int e2 = e + C52418a.m58678e(5, this.f183020h);
            String str7 = this.f183021i;
            if (str7 != null) {
                e2 += C52418a.m58683j(6, str7);
            }
            int e3 = e2 + C52418a.m58678e(7, this.f183022j) + C52418a.m58674a(8, this.f183023n) + C52418a.m58674a(9, this.f183024o);
            String str8 = this.f183025p;
            if (str8 != null) {
                e3 += C52418a.m58683j(10, str8);
            }
            int e4 = e3 + C52418a.m58678e(11, this.f183026q);
            C89349b bVar4 = this.f183027r;
            if (bVar4 != null) {
                e4 += C52418a.m58675b(12, bVar4);
            }
            int e5 = e4 + C52418a.m58678e(13, this.f183028s);
            C52025xv xvVar2 = this.f183029t;
            return xvVar2 != null ? e5 + C52418a.m58682i(14, xvVar2.computeSize()) : e5;
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
            C64347eq2 eq22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    eq22.f183016d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    eq22.f183017e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    eq22.f183018f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    eq22.f183019g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eq22.f183020h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    eq22.f183021i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    eq22.f183022j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    eq22.f183023n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    eq22.f183024o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    eq22.f183025p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    eq22.f183026q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    eq22.f183027r = aVar3.mo141626d(intValue);
                    return 0;
                case 13:
                    eq22.f183028s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52025xv xvVar3 = new C52025xv();
                        if (bArr != null && bArr.length > 0) {
                            xvVar3.parseFrom(bArr);
                        }
                        eq22.f183029t = xvVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
