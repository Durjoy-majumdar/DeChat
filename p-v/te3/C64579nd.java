package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nd */
public class C64579nd extends C47465a {

    /* renamed from: d */
    public String f184462d;

    /* renamed from: e */
    public String f184463e;

    /* renamed from: f */
    public String f184464f;

    /* renamed from: g */
    public int f184465g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64579nd)) {
            return false;
        }
        C64579nd ndVar = (C64579nd) aVar;
        return C46238a.m51546a(this.f184462d, ndVar.f184462d) && C46238a.m51546a(this.f184463e, ndVar.f184463e) && C46238a.m51546a(this.f184464f, ndVar.f184464f) && C46238a.m51546a(Integer.valueOf(this.f184465g), Integer.valueOf(ndVar.f184465g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184462d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184463e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184464f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f184465g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f184462d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f184463e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f184464f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f184465g);
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
            C64579nd ndVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ndVar.f184462d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ndVar.f184463e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ndVar.f184464f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ndVar.f184465g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
