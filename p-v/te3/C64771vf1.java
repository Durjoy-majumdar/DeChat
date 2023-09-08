package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vf1 */
public class C64771vf1 extends C47465a {

    /* renamed from: d */
    public String f185881d;

    /* renamed from: e */
    public boolean f185882e;

    /* renamed from: f */
    public boolean f185883f;

    /* renamed from: g */
    public float f185884g;

    /* renamed from: h */
    public float f185885h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64771vf1)) {
            return false;
        }
        C64771vf1 vf12 = (C64771vf1) aVar;
        return C46238a.m51546a(this.f185881d, vf12.f185881d) && C46238a.m51546a(Boolean.valueOf(this.f185882e), Boolean.valueOf(vf12.f185882e)) && C46238a.m51546a(Boolean.valueOf(this.f185883f), Boolean.valueOf(vf12.f185883f)) && C46238a.m51546a(Float.valueOf(this.f185884g), Float.valueOf(vf12.f185884g)) && C46238a.m51546a(Float.valueOf(this.f185885h), Float.valueOf(vf12.f185885h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185881d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f185882e);
            aVar.mo74314a(3, this.f185883f);
            aVar.mo74317d(4, this.f185884g);
            aVar.mo74317d(5, this.f185885h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f185881d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58674a(2, this.f185882e) + C52418a.m58674a(3, this.f185883f) + C52418a.m58677d(4, this.f185884g) + C52418a.m58677d(5, this.f185885h);
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
            C64771vf1 vf12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vf12.f185881d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vf12.f185882e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                vf12.f185883f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 4) {
                vf12.f185884g = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                vf12.f185885h = aVar3.mo141628f(intValue);
                return 0;
            }
        }
    }
}
