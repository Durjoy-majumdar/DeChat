package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nw4 extends C47465a {

    /* renamed from: d */
    public String f259710d;

    /* renamed from: e */
    public String f259711e;

    /* renamed from: f */
    public String f259712f;

    /* renamed from: g */
    public String f259713g;

    /* renamed from: h */
    public int f259714h;

    /* renamed from: i */
    public float f259715i;

    /* renamed from: j */
    public float f259716j;

    /* renamed from: n */
    public String f259717n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nw4)) {
            return false;
        }
        nw4 nw4 = (nw4) aVar;
        return C46238a.m51546a(this.f259710d, nw4.f259710d) && C46238a.m51546a(this.f259711e, nw4.f259711e) && C46238a.m51546a(this.f259712f, nw4.f259712f) && C46238a.m51546a(this.f259713g, nw4.f259713g) && C46238a.m51546a(Integer.valueOf(this.f259714h), Integer.valueOf(nw4.f259714h)) && C46238a.m51546a(Float.valueOf(this.f259715i), Float.valueOf(nw4.f259715i)) && C46238a.m51546a(Float.valueOf(this.f259716j), Float.valueOf(nw4.f259716j)) && C46238a.m51546a(this.f259717n, nw4.f259717n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259710d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259711e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f259712f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f259713g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f259714h);
            aVar.mo74317d(6, this.f259715i);
            aVar.mo74317d(7, this.f259716j);
            String str5 = this.f259717n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f259710d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f259711e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f259712f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f259713g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f259714h) + C52418a.m58677d(6, this.f259715i) + C52418a.m58677d(7, this.f259716j);
            String str10 = this.f259717n;
            return str10 != null ? e + C52418a.m58683j(8, str10) : e;
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
            nw4 nw4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nw4.f259710d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    nw4.f259711e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nw4.f259712f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nw4.f259713g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nw4.f259714h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nw4.f259715i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    nw4.f259716j = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    nw4.f259717n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
