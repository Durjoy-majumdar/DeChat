package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a21 */
public class C48654a21 extends C47465a {

    /* renamed from: d */
    public String f130230d;

    /* renamed from: e */
    public String f130231e;

    /* renamed from: f */
    public int f130232f;

    /* renamed from: g */
    public float f130233g;

    /* renamed from: h */
    public float f130234h;

    /* renamed from: i */
    public int f130235i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48654a21)) {
            return false;
        }
        C48654a21 a212 = (C48654a21) aVar;
        return C46238a.m51546a(this.f130230d, a212.f130230d) && C46238a.m51546a(this.f130231e, a212.f130231e) && C46238a.m51546a(Integer.valueOf(this.f130232f), Integer.valueOf(a212.f130232f)) && C46238a.m51546a(Float.valueOf(this.f130233g), Float.valueOf(a212.f130233g)) && C46238a.m51546a(Float.valueOf(this.f130234h), Float.valueOf(a212.f130234h)) && C46238a.m51546a(Integer.valueOf(this.f130235i), Integer.valueOf(a212.f130235i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130230d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130231e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f130232f);
            aVar.mo74317d(4, this.f130233g);
            aVar.mo74317d(5, this.f130234h);
            aVar.mo74318e(6, this.f130235i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f130230d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f130231e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f130232f) + C52418a.m58677d(4, this.f130233g) + C52418a.m58677d(5, this.f130234h) + C52418a.m58678e(6, this.f130235i);
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
            C48654a21 a212 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a212.f130230d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    a212.f130231e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a212.f130232f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    a212.f130233g = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    a212.f130234h = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    a212.f130235i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
