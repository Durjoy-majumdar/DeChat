package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ib3 */
public class C77946ib3 extends C47465a {

    /* renamed from: d */
    public String f227607d;

    /* renamed from: e */
    public String f227608e;

    /* renamed from: f */
    public String f227609f;

    /* renamed from: g */
    public long f227610g;

    /* renamed from: h */
    public int f227611h;

    /* renamed from: i */
    public long f227612i;

    /* renamed from: j */
    public int f227613j;

    /* renamed from: n */
    public int f227614n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77946ib3)) {
            return false;
        }
        C77946ib3 ib32 = (C77946ib3) aVar;
        return C46238a.m51546a(this.f227607d, ib32.f227607d) && C46238a.m51546a(this.f227608e, ib32.f227608e) && C46238a.m51546a(this.f227609f, ib32.f227609f) && C46238a.m51546a(Long.valueOf(this.f227610g), Long.valueOf(ib32.f227610g)) && C46238a.m51546a(Integer.valueOf(this.f227611h), Integer.valueOf(ib32.f227611h)) && C46238a.m51546a(Long.valueOf(this.f227612i), Long.valueOf(ib32.f227612i)) && C46238a.m51546a(Integer.valueOf(this.f227613j), Integer.valueOf(ib32.f227613j)) && C46238a.m51546a(Integer.valueOf(this.f227614n), Integer.valueOf(ib32.f227614n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227607d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227608e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227609f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f227610g);
            aVar.mo74318e(5, this.f227611h);
            aVar.mo74321h(6, this.f227612i);
            aVar.mo74318e(7, this.f227613j);
            aVar.mo74318e(8, this.f227614n);
            return 0;
        } else if (i == 1) {
            String str4 = this.f227607d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f227608e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f227609f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f227610g) + C52418a.m58678e(5, this.f227611h) + C52418a.m58681h(6, this.f227612i) + C52418a.m58678e(7, this.f227613j) + C52418a.m58678e(8, this.f227614n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77946ib3 ib32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ib32.f227607d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ib32.f227608e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ib32.f227609f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ib32.f227610g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ib32.f227611h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ib32.f227612i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ib32.f227613j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ib32.f227614n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
