package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rh0 */
public class C51108rh0 extends C47465a {

    /* renamed from: d */
    public long f140917d;

    /* renamed from: e */
    public String f140918e;

    /* renamed from: f */
    public String f140919f;

    /* renamed from: g */
    public String f140920g;

    /* renamed from: h */
    public int f140921h;

    /* renamed from: i */
    public int f140922i;

    /* renamed from: j */
    public int f140923j;

    /* renamed from: n */
    public int f140924n;

    /* renamed from: o */
    public long f140925o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51108rh0)) {
            return false;
        }
        C51108rh0 rh02 = (C51108rh0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140917d), Long.valueOf(rh02.f140917d)) && C46238a.m51546a(this.f140918e, rh02.f140918e) && C46238a.m51546a(this.f140919f, rh02.f140919f) && C46238a.m51546a(this.f140920g, rh02.f140920g) && C46238a.m51546a(Integer.valueOf(this.f140921h), Integer.valueOf(rh02.f140921h)) && C46238a.m51546a(Integer.valueOf(this.f140922i), Integer.valueOf(rh02.f140922i)) && C46238a.m51546a(Integer.valueOf(this.f140923j), Integer.valueOf(rh02.f140923j)) && C46238a.m51546a(Integer.valueOf(this.f140924n), Integer.valueOf(rh02.f140924n)) && C46238a.m51546a(Long.valueOf(this.f140925o), Long.valueOf(rh02.f140925o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140917d);
            String str = this.f140918e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140919f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f140920g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f140921h);
            aVar.mo74318e(6, this.f140922i);
            aVar.mo74318e(7, this.f140923j);
            aVar.mo74318e(8, this.f140924n);
            aVar.mo74321h(9, this.f140925o);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f140917d) + 0;
            String str4 = this.f140918e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            String str5 = this.f140919f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f140920g;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            return h + C52418a.m58678e(5, this.f140921h) + C52418a.m58678e(6, this.f140922i) + C52418a.m58678e(7, this.f140923j) + C52418a.m58678e(8, this.f140924n) + C52418a.m58681h(9, this.f140925o);
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
            C51108rh0 rh02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rh02.f140917d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    rh02.f140918e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rh02.f140919f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rh02.f140920g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rh02.f140921h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rh02.f140922i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    rh02.f140923j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rh02.f140924n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    rh02.f140925o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
