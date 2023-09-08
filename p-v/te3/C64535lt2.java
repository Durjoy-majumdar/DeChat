package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lt2 */
public class C64535lt2 extends C47465a {

    /* renamed from: d */
    public String f184154d;

    /* renamed from: e */
    public boolean f184155e;

    /* renamed from: f */
    public int f184156f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64535lt2)) {
            return false;
        }
        C64535lt2 lt22 = (C64535lt2) aVar;
        return C46238a.m51546a(this.f184154d, lt22.f184154d) && C46238a.m51546a(Boolean.valueOf(this.f184155e), Boolean.valueOf(lt22.f184155e)) && C46238a.m51546a(Integer.valueOf(this.f184156f), Integer.valueOf(lt22.f184156f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184154d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f184155e);
            aVar.mo74318e(3, this.f184156f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f184154d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58674a(2, this.f184155e) + C52418a.m58678e(3, this.f184156f);
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
            C64535lt2 lt22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lt22.f184154d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lt22.f184155e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                lt22.f184156f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
