package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bq2 */
public class C64265bq2 extends C47465a {

    /* renamed from: d */
    public int f182312d;

    /* renamed from: e */
    public String f182313e;

    /* renamed from: f */
    public int f182314f;

    /* renamed from: g */
    public int f182315g;

    /* renamed from: h */
    public C89349b f182316h;

    /* renamed from: i */
    public C89349b f182317i;

    /* renamed from: j */
    public C89349b f182318j;

    /* renamed from: n */
    public String f182319n;

    /* renamed from: o */
    public long f182320o;

    /* renamed from: p */
    public long f182321p;

    /* renamed from: q */
    public long f182322q;

    /* renamed from: r */
    public String f182323r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64265bq2)) {
            return false;
        }
        C64265bq2 bq22 = (C64265bq2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182312d), Integer.valueOf(bq22.f182312d)) && C46238a.m51546a(this.f182313e, bq22.f182313e) && C46238a.m51546a(Integer.valueOf(this.f182314f), Integer.valueOf(bq22.f182314f)) && C46238a.m51546a(Integer.valueOf(this.f182315g), Integer.valueOf(bq22.f182315g)) && C46238a.m51546a(this.f182316h, bq22.f182316h) && C46238a.m51546a(this.f182317i, bq22.f182317i) && C46238a.m51546a(this.f182318j, bq22.f182318j) && C46238a.m51546a(this.f182319n, bq22.f182319n) && C46238a.m51546a(Long.valueOf(this.f182320o), Long.valueOf(bq22.f182320o)) && C46238a.m51546a(Long.valueOf(this.f182321p), Long.valueOf(bq22.f182321p)) && C46238a.m51546a(Long.valueOf(this.f182322q), Long.valueOf(bq22.f182322q)) && C46238a.m51546a(this.f182323r, bq22.f182323r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182312d);
            String str = this.f182313e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f182314f);
            aVar.mo74318e(4, this.f182315g);
            C89349b bVar = this.f182316h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            C89349b bVar2 = this.f182317i;
            if (bVar2 != null) {
                aVar.mo74315b(6, bVar2);
            }
            C89349b bVar3 = this.f182318j;
            if (bVar3 != null) {
                aVar.mo74315b(7, bVar3);
            }
            String str2 = this.f182319n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74321h(9, this.f182320o);
            aVar.mo74321h(10, this.f182321p);
            aVar.mo74321h(11, this.f182322q);
            String str3 = this.f182323r;
            if (str3 != null) {
                aVar.mo74323j(12, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182312d) + 0;
            String str4 = this.f182313e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int e2 = e + C52418a.m58678e(3, this.f182314f) + C52418a.m58678e(4, this.f182315g);
            C89349b bVar4 = this.f182316h;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(5, bVar4);
            }
            C89349b bVar5 = this.f182317i;
            if (bVar5 != null) {
                e2 += C52418a.m58675b(6, bVar5);
            }
            C89349b bVar6 = this.f182318j;
            if (bVar6 != null) {
                e2 += C52418a.m58675b(7, bVar6);
            }
            String str5 = this.f182319n;
            if (str5 != null) {
                e2 += C52418a.m58683j(8, str5);
            }
            int h = e2 + C52418a.m58681h(9, this.f182320o) + C52418a.m58681h(10, this.f182321p) + C52418a.m58681h(11, this.f182322q);
            String str6 = this.f182323r;
            return str6 != null ? h + C52418a.m58683j(12, str6) : h;
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
            C64265bq2 bq22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bq22.f182312d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    bq22.f182313e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bq22.f182314f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bq22.f182315g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bq22.f182316h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    bq22.f182317i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    bq22.f182318j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    bq22.f182319n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bq22.f182320o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    bq22.f182321p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    bq22.f182322q = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    bq22.f182323r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
