package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v03 */
public class C64763v03 extends C47465a {

    /* renamed from: d */
    public String f185815d;

    /* renamed from: e */
    public String f185816e;

    /* renamed from: f */
    public String f185817f;

    /* renamed from: g */
    public long f185818g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64763v03)) {
            return false;
        }
        C64763v03 v032 = (C64763v03) aVar;
        return C46238a.m51546a(this.f185815d, v032.f185815d) && C46238a.m51546a(this.f185816e, v032.f185816e) && C46238a.m51546a(this.f185817f, v032.f185817f) && C46238a.m51546a(Long.valueOf(this.f185818g), Long.valueOf(v032.f185818g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185815d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185816e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185817f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f185818g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f185815d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f185816e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f185817f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f185818g);
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
            C64763v03 v032 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v032.f185815d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                v032.f185816e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                v032.f185817f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                v032.f185818g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
