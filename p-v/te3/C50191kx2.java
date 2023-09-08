package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kx2 */
public class C50191kx2 extends C47465a {

    /* renamed from: d */
    public String f137081d;

    /* renamed from: e */
    public String f137082e;

    /* renamed from: f */
    public int f137083f;

    /* renamed from: g */
    public String f137084g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50191kx2)) {
            return false;
        }
        C50191kx2 kx22 = (C50191kx2) aVar;
        return C46238a.m51546a(this.f137081d, kx22.f137081d) && C46238a.m51546a(this.f137082e, kx22.f137082e) && C46238a.m51546a(Integer.valueOf(this.f137083f), Integer.valueOf(kx22.f137083f)) && C46238a.m51546a(this.f137084g, kx22.f137084g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137081d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137082e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f137083f);
            String str3 = this.f137084g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f137081d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f137082e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f137083f);
            String str6 = this.f137084g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            C50191kx2 kx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kx22.f137081d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                kx22.f137082e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                kx22.f137083f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                kx22.f137084g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
