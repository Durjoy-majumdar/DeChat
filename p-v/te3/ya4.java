package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ya4 extends C47465a {

    /* renamed from: d */
    public int f299934d;

    /* renamed from: e */
    public int f299935e;

    /* renamed from: f */
    public int f299936f;

    /* renamed from: g */
    public long f299937g;

    /* renamed from: h */
    public int f299938h;

    /* renamed from: i */
    public int f299939i;

    /* renamed from: j */
    public String f299940j;

    /* renamed from: n */
    public String f299941n;

    /* renamed from: o */
    public String f299942o;

    /* renamed from: p */
    public String f299943p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ya4)) {
            return false;
        }
        ya4 ya4 = (ya4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299934d), Integer.valueOf(ya4.f299934d)) && C46238a.m51546a(Integer.valueOf(this.f299935e), Integer.valueOf(ya4.f299935e)) && C46238a.m51546a(Integer.valueOf(this.f299936f), Integer.valueOf(ya4.f299936f)) && C46238a.m51546a(Long.valueOf(this.f299937g), Long.valueOf(ya4.f299937g)) && C46238a.m51546a(Integer.valueOf(this.f299938h), Integer.valueOf(ya4.f299938h)) && C46238a.m51546a(Integer.valueOf(this.f299939i), Integer.valueOf(ya4.f299939i)) && C46238a.m51546a(this.f299940j, ya4.f299940j) && C46238a.m51546a(this.f299941n, ya4.f299941n) && C46238a.m51546a(this.f299942o, ya4.f299942o) && C46238a.m51546a(this.f299943p, ya4.f299943p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299940j == null) {
                throw new C52419b("Not all required fields were included: StatusDesc1");
            } else if (this.f299941n == null) {
                throw new C52419b("Not all required fields were included: StatusDesc2");
            } else if (this.f299942o == null) {
                throw new C52419b("Not all required fields were included: DataFlowSourceInfo");
            } else if (this.f299943p != null) {
                aVar.mo74318e(1, this.f299934d);
                aVar.mo74318e(2, this.f299935e);
                aVar.mo74318e(3, this.f299936f);
                aVar.mo74321h(4, this.f299937g);
                aVar.mo74318e(5, this.f299938h);
                aVar.mo74318e(6, this.f299939i);
                String str = this.f299940j;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                String str2 = this.f299941n;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                String str3 = this.f299942o;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                String str4 = this.f299943p;
                if (str4 != null) {
                    aVar.mo74323j(10, str4);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DataFlowResultInfo");
            }
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f299934d) + 0 + C52418a.m58678e(2, this.f299935e) + C52418a.m58678e(3, this.f299936f) + C52418a.m58681h(4, this.f299937g) + C52418a.m58678e(5, this.f299938h) + C52418a.m58678e(6, this.f299939i);
            String str5 = this.f299940j;
            if (str5 != null) {
                e += C52418a.m58683j(7, str5);
            }
            String str6 = this.f299941n;
            if (str6 != null) {
                e += C52418a.m58683j(8, str6);
            }
            String str7 = this.f299942o;
            if (str7 != null) {
                e += C52418a.m58683j(9, str7);
            }
            String str8 = this.f299943p;
            return str8 != null ? e + C52418a.m58683j(10, str8) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299940j == null) {
                throw new C52419b("Not all required fields were included: StatusDesc1");
            } else if (this.f299941n == null) {
                throw new C52419b("Not all required fields were included: StatusDesc2");
            } else if (this.f299942o == null) {
                throw new C52419b("Not all required fields were included: DataFlowSourceInfo");
            } else if (this.f299943p != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DataFlowResultInfo");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ya4 ya4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ya4.f299934d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ya4.f299935e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ya4.f299936f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ya4.f299937g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ya4.f299938h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ya4.f299939i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ya4.f299940j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ya4.f299941n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ya4.f299942o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ya4.f299943p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
