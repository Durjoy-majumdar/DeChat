package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dw */
public class C64330dw extends C47465a {

    /* renamed from: d */
    public int f182865d;

    /* renamed from: e */
    public String f182866e;

    /* renamed from: f */
    public int f182867f;

    /* renamed from: g */
    public int f182868g;

    /* renamed from: h */
    public LinkedList<C64610ol2> f182869h = new LinkedList<>();

    /* renamed from: i */
    public String f182870i;

    /* renamed from: j */
    public String f182871j;

    /* renamed from: n */
    public String f182872n;

    /* renamed from: o */
    public String f182873o;

    /* renamed from: p */
    public int f182874p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64330dw)) {
            return false;
        }
        C64330dw dwVar = (C64330dw) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182865d), Integer.valueOf(dwVar.f182865d)) && C46238a.m51546a(this.f182866e, dwVar.f182866e) && C46238a.m51546a(Integer.valueOf(this.f182867f), Integer.valueOf(dwVar.f182867f)) && C46238a.m51546a(Integer.valueOf(this.f182868g), Integer.valueOf(dwVar.f182868g)) && C46238a.m51546a(this.f182869h, dwVar.f182869h) && C46238a.m51546a(this.f182870i, dwVar.f182870i) && C46238a.m51546a(this.f182871j, dwVar.f182871j) && C46238a.m51546a(this.f182872n, dwVar.f182872n) && C46238a.m51546a(this.f182873o, dwVar.f182873o) && C46238a.m51546a(Integer.valueOf(this.f182874p), Integer.valueOf(dwVar.f182874p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182865d);
            String str = this.f182866e;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(2, this.f182867f);
            aVar.mo74318e(3, this.f182868g);
            aVar.mo74320g(4, 8, this.f182869h);
            String str2 = this.f182870i;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f182871j;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f182872n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f182873o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f182874p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182865d) + 0;
            String str6 = this.f182866e;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            int e2 = e + C52418a.m58678e(2, this.f182867f) + C52418a.m58678e(3, this.f182868g) + C52418a.m58680g(4, 8, this.f182869h);
            String str7 = this.f182870i;
            if (str7 != null) {
                e2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f182871j;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f182872n;
            if (str9 != null) {
                e2 += C52418a.m58683j(8, str9);
            }
            String str10 = this.f182873o;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            return e2 + C52418a.m58678e(10, this.f182874p);
        } else if (i == 2) {
            this.f182869h.clear();
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
            C64330dw dwVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dwVar.f182865d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    dwVar.f182867f = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dwVar.f182868g = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64610ol2 ol22 = new C64610ol2();
                        if (bArr != null && bArr.length > 0) {
                            ol22.parseFrom(bArr);
                        }
                        dwVar.f182869h.add(ol22);
                    }
                    return 0;
                case 5:
                    dwVar.f182870i = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dwVar.f182871j = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dwVar.f182866e = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dwVar.f182872n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    dwVar.f182873o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    dwVar.f182874p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
