package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o03 */
public class C64598o03 extends C47465a {

    /* renamed from: d */
    public String f184601d;

    /* renamed from: e */
    public int f184602e;

    /* renamed from: f */
    public String f184603f;

    /* renamed from: g */
    public int f184604g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64598o03)) {
            return false;
        }
        C64598o03 o032 = (C64598o03) aVar;
        return C46238a.m51546a(this.f184601d, o032.f184601d) && C46238a.m51546a(Integer.valueOf(this.f184602e), Integer.valueOf(o032.f184602e)) && C46238a.m51546a(this.f184603f, o032.f184603f) && C46238a.m51546a(Integer.valueOf(this.f184604g), Integer.valueOf(o032.f184604g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184601d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f184602e);
            String str2 = this.f184603f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f184604g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f184601d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f184602e);
            String str4 = this.f184603f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f184604g);
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
            C64598o03 o032 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o032.f184601d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                o032.f184602e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                o032.f184603f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                o032.f184604g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
