package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f61 */
public class C49386f61 extends C47465a {

    /* renamed from: d */
    public int f133309d;

    /* renamed from: e */
    public int f133310e;

    /* renamed from: f */
    public String f133311f;

    /* renamed from: g */
    public String f133312g;

    /* renamed from: h */
    public String f133313h;

    /* renamed from: i */
    public String f133314i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49386f61)) {
            return false;
        }
        C49386f61 f612 = (C49386f61) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133309d), Integer.valueOf(f612.f133309d)) && C46238a.m51546a(Integer.valueOf(this.f133310e), Integer.valueOf(f612.f133310e)) && C46238a.m51546a(this.f133311f, f612.f133311f) && C46238a.m51546a(this.f133312g, f612.f133312g) && C46238a.m51546a(this.f133313h, f612.f133313h) && C46238a.m51546a(this.f133314i, f612.f133314i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133309d);
            aVar.mo74318e(2, this.f133310e);
            String str = this.f133311f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f133312g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f133313h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f133314i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133309d) + 0 + C52418a.m58678e(2, this.f133310e);
            String str5 = this.f133311f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f133312g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f133313h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f133314i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C49386f61 f612 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    f612.f133309d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    f612.f133310e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    f612.f133311f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    f612.f133312g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    f612.f133313h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    f612.f133314i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
