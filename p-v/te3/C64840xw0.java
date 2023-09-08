package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xw0 */
public class C64840xw0 extends C47465a {

    /* renamed from: d */
    public int f186401d;

    /* renamed from: e */
    public String f186402e;

    /* renamed from: f */
    public int f186403f;

    /* renamed from: g */
    public String f186404g;

    /* renamed from: h */
    public String f186405h;

    /* renamed from: i */
    public String f186406i;

    /* renamed from: j */
    public String f186407j;

    /* renamed from: n */
    public C64436i61 f186408n;

    /* renamed from: o */
    public LinkedList<C64436i61> f186409o = new LinkedList<>();

    /* renamed from: p */
    public int f186410p;

    /* renamed from: q */
    public int f186411q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64840xw0)) {
            return false;
        }
        C64840xw0 xw02 = (C64840xw0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186401d), Integer.valueOf(xw02.f186401d)) && C46238a.m51546a(this.f186402e, xw02.f186402e) && C46238a.m51546a(Integer.valueOf(this.f186403f), Integer.valueOf(xw02.f186403f)) && C46238a.m51546a(this.f186404g, xw02.f186404g) && C46238a.m51546a(this.f186405h, xw02.f186405h) && C46238a.m51546a(this.f186406i, xw02.f186406i) && C46238a.m51546a(this.f186407j, xw02.f186407j) && C46238a.m51546a(this.f186408n, xw02.f186408n) && C46238a.m51546a(this.f186409o, xw02.f186409o) && C46238a.m51546a(Integer.valueOf(this.f186410p), Integer.valueOf(xw02.f186410p)) && C46238a.m51546a(Integer.valueOf(this.f186411q), Integer.valueOf(xw02.f186411q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186401d);
            String str = this.f186402e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f186403f);
            String str2 = this.f186404g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f186405h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f186406i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f186407j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            C64436i61 i612 = this.f186408n;
            if (i612 != null) {
                aVar.mo74322i(8, i612.computeSize());
                this.f186408n.writeFields(aVar);
            }
            aVar.mo74320g(9, 8, this.f186409o);
            aVar.mo74318e(10, this.f186410p);
            aVar.mo74318e(11, this.f186411q);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186401d) + 0;
            String str6 = this.f186402e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            int e2 = e + C52418a.m58678e(3, this.f186403f);
            String str7 = this.f186404g;
            if (str7 != null) {
                e2 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f186405h;
            if (str8 != null) {
                e2 += C52418a.m58683j(5, str8);
            }
            String str9 = this.f186406i;
            if (str9 != null) {
                e2 += C52418a.m58683j(6, str9);
            }
            String str10 = this.f186407j;
            if (str10 != null) {
                e2 += C52418a.m58683j(7, str10);
            }
            C64436i61 i613 = this.f186408n;
            if (i613 != null) {
                e2 += C52418a.m58682i(8, i613.computeSize());
            }
            return e2 + C52418a.m58680g(9, 8, this.f186409o) + C52418a.m58678e(10, this.f186410p) + C52418a.m58678e(11, this.f186411q);
        } else if (i == 2) {
            this.f186409o.clear();
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
            C64840xw0 xw02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xw02.f186401d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    xw02.f186402e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xw02.f186403f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    xw02.f186404g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xw02.f186405h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xw02.f186406i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    xw02.f186407j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64436i61 i614 = new C64436i61();
                        if (bArr != null && bArr.length > 0) {
                            i614.parseFrom(bArr);
                        }
                        xw02.f186408n = i614;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64436i61 i615 = new C64436i61();
                        if (bArr2 != null && bArr2.length > 0) {
                            i615.parseFrom(bArr2);
                        }
                        xw02.f186409o.add(i615);
                    }
                    return 0;
                case 10:
                    xw02.f186410p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    xw02.f186411q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
