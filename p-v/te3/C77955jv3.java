package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jv3 */
public class C77955jv3 extends C47465a {

    /* renamed from: d */
    public String f227698d;

    /* renamed from: e */
    public String f227699e;

    /* renamed from: f */
    public String f227700f;

    /* renamed from: g */
    public int f227701g;

    /* renamed from: h */
    public C89349b f227702h;

    /* renamed from: i */
    public String f227703i;

    /* renamed from: j */
    public String f227704j;

    /* renamed from: n */
    public long f227705n;

    /* renamed from: o */
    public String f227706o;

    /* renamed from: p */
    public String f227707p;

    /* renamed from: q */
    public String f227708q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77955jv3)) {
            return false;
        }
        C77955jv3 jv32 = (C77955jv3) aVar;
        return C46238a.m51546a(this.f227698d, jv32.f227698d) && C46238a.m51546a(this.f227699e, jv32.f227699e) && C46238a.m51546a(this.f227700f, jv32.f227700f) && C46238a.m51546a(Integer.valueOf(this.f227701g), Integer.valueOf(jv32.f227701g)) && C46238a.m51546a(this.f227702h, jv32.f227702h) && C46238a.m51546a(this.f227703i, jv32.f227703i) && C46238a.m51546a(this.f227704j, jv32.f227704j) && C46238a.m51546a(Long.valueOf(this.f227705n), Long.valueOf(jv32.f227705n)) && C46238a.m51546a(this.f227706o, jv32.f227706o) && C46238a.m51546a(this.f227707p, jv32.f227707p) && C46238a.m51546a(this.f227708q, jv32.f227708q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227698d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227699e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227700f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f227701g);
            C89349b bVar = this.f227702h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str4 = this.f227703i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f227704j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74321h(8, this.f227705n);
            String str6 = this.f227706o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f227707p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f227708q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f227698d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f227699e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f227700f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            int e = i2 + C52418a.m58678e(4, this.f227701g);
            C89349b bVar2 = this.f227702h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            String str12 = this.f227703i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f227704j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            int h = e + C52418a.m58681h(8, this.f227705n);
            String str14 = this.f227706o;
            if (str14 != null) {
                h += C52418a.m58683j(9, str14);
            }
            String str15 = this.f227707p;
            if (str15 != null) {
                h += C52418a.m58683j(10, str15);
            }
            String str16 = this.f227708q;
            return str16 != null ? h + C52418a.m58683j(11, str16) : h;
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
            C77955jv3 jv32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jv32.f227698d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    jv32.f227699e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jv32.f227700f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jv32.f227701g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    jv32.f227702h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    jv32.f227703i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jv32.f227704j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jv32.f227705n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    jv32.f227706o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jv32.f227707p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    jv32.f227708q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
