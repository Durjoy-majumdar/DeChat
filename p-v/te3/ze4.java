package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ze4 extends C47465a {

    /* renamed from: d */
    public long f228684d;

    /* renamed from: e */
    public int f228685e;

    /* renamed from: f */
    public String f228686f;

    /* renamed from: g */
    public long f228687g;

    /* renamed from: h */
    public int f228688h;

    /* renamed from: i */
    public int f228689i;

    /* renamed from: j */
    public int f228690j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ze4)) {
            return false;
        }
        ze4 ze4 = (ze4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f228684d), Long.valueOf(ze4.f228684d)) && C46238a.m51546a(Integer.valueOf(this.f228685e), Integer.valueOf(ze4.f228685e)) && C46238a.m51546a(this.f228686f, ze4.f228686f) && C46238a.m51546a(Long.valueOf(this.f228687g), Long.valueOf(ze4.f228687g)) && C46238a.m51546a(Integer.valueOf(this.f228688h), Integer.valueOf(ze4.f228688h)) && C46238a.m51546a(Integer.valueOf(this.f228689i), Integer.valueOf(ze4.f228689i)) && C46238a.m51546a(Integer.valueOf(this.f228690j), Integer.valueOf(ze4.f228690j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f228684d);
            aVar.mo74318e(2, this.f228685e);
            String str = this.f228686f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f228687g);
            aVar.mo74318e(5, this.f228688h);
            aVar.mo74318e(6, this.f228689i);
            aVar.mo74318e(7, this.f228690j);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f228684d) + 0 + C52418a.m58678e(2, this.f228685e);
            String str2 = this.f228686f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58681h(4, this.f228687g) + C52418a.m58678e(5, this.f228688h) + C52418a.m58678e(6, this.f228689i) + C52418a.m58678e(7, this.f228690j);
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
            ze4 ze4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ze4.f228684d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ze4.f228685e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ze4.f228686f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ze4.f228687g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ze4.f228688h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ze4.f228689i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ze4.f228690j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
