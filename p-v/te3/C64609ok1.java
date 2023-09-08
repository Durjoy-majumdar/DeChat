package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ok1 */
public class C64609ok1 extends C47465a {

    /* renamed from: d */
    public String f184668d;

    /* renamed from: e */
    public float f184669e;

    /* renamed from: f */
    public float f184670f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64609ok1)) {
            return false;
        }
        C64609ok1 ok12 = (C64609ok1) aVar;
        return C46238a.m51546a(this.f184668d, ok12.f184668d) && C46238a.m51546a(Float.valueOf(this.f184669e), Float.valueOf(ok12.f184669e)) && C46238a.m51546a(Float.valueOf(this.f184670f), Float.valueOf(ok12.f184670f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184668d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74317d(2, this.f184669e);
            aVar.mo74317d(3, this.f184670f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f184668d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58677d(2, this.f184669e) + C52418a.m58677d(3, this.f184670f);
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
            C64609ok1 ok12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ok12.f184668d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ok12.f184669e = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ok12.f184670f = aVar3.mo141628f(intValue);
                return 0;
            }
        }
    }
}
