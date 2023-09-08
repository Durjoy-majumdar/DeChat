package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class e94 extends C47465a {

    /* renamed from: d */
    public String f182942d;

    /* renamed from: e */
    public String f182943e;

    /* renamed from: f */
    public String f182944f;

    /* renamed from: g */
    public long f182945g;

    /* renamed from: h */
    public long f182946h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e94)) {
            return false;
        }
        e94 e94 = (e94) aVar;
        return C46238a.m51546a(this.f182942d, e94.f182942d) && C46238a.m51546a(this.f182943e, e94.f182943e) && C46238a.m51546a(this.f182944f, e94.f182944f) && C46238a.m51546a(Long.valueOf(this.f182945g), Long.valueOf(e94.f182945g)) && C46238a.m51546a(Long.valueOf(this.f182946h), Long.valueOf(e94.f182946h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182942d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182943e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f182944f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f182945g);
            aVar.mo74321h(5, this.f182946h);
            return 0;
        } else if (i == 1) {
            String str4 = this.f182942d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f182943e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f182944f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f182945g) + C52418a.m58681h(5, this.f182946h);
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
            e94 e94 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e94.f182942d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e94.f182943e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                e94.f182944f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                e94.f182945g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                e94.f182946h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
