package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s60 */
public class C64701s60 extends C47465a {

    /* renamed from: d */
    public String f185352d;

    /* renamed from: e */
    public long f185353e;

    /* renamed from: f */
    public String f185354f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64701s60)) {
            return false;
        }
        C64701s60 s602 = (C64701s60) aVar;
        return C46238a.m51546a(this.f185352d, s602.f185352d) && C46238a.m51546a(Long.valueOf(this.f185353e), Long.valueOf(s602.f185353e)) && C46238a.m51546a(this.f185354f, s602.f185354f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185352d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f185353e);
            String str2 = this.f185354f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f185352d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f185353e);
            String str4 = this.f185354f;
            return str4 != null ? h + C52418a.m58683j(3, str4) : h;
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
            C64701s60 s602 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s602.f185352d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                s602.f185353e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                s602.f185354f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
