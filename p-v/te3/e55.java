package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e55 extends C47465a {

    /* renamed from: d */
    public String f132708d;

    /* renamed from: e */
    public int f132709e;

    /* renamed from: f */
    public int f132710f;

    /* renamed from: g */
    public long f132711g;

    /* renamed from: h */
    public boolean f132712h;

    /* renamed from: i */
    public String f132713i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e55)) {
            return false;
        }
        e55 e55 = (e55) aVar;
        return C46238a.m51546a(this.f132708d, e55.f132708d) && C46238a.m51546a(Integer.valueOf(this.f132709e), Integer.valueOf(e55.f132709e)) && C46238a.m51546a(Integer.valueOf(this.f132710f), Integer.valueOf(e55.f132710f)) && C46238a.m51546a(Long.valueOf(this.f132711g), Long.valueOf(e55.f132711g)) && C46238a.m51546a(Boolean.valueOf(this.f132712h), Boolean.valueOf(e55.f132712h)) && C46238a.m51546a(this.f132713i, e55.f132713i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132708d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132709e);
            aVar.mo74318e(3, this.f132710f);
            aVar.mo74321h(4, this.f132711g);
            aVar.mo74314a(5, this.f132712h);
            String str2 = this.f132713i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f132708d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f132709e) + C52418a.m58678e(3, this.f132710f) + C52418a.m58681h(4, this.f132711g) + C52418a.m58674a(5, this.f132712h);
            String str4 = this.f132713i;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
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
            e55 e55 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e55.f132708d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e55.f132709e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e55.f132710f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e55.f132711g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    e55.f132712h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    e55.f132713i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
