package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z93 */
public class C78022z93 extends C47465a {

    /* renamed from: d */
    public String f228679d;

    /* renamed from: e */
    public String f228680e;

    /* renamed from: f */
    public String f228681f;

    /* renamed from: g */
    public String f228682g;

    /* renamed from: h */
    public String f228683h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78022z93)) {
            return false;
        }
        C78022z93 z932 = (C78022z93) aVar;
        return C46238a.m51546a(this.f228679d, z932.f228679d) && C46238a.m51546a(this.f228680e, z932.f228680e) && C46238a.m51546a(this.f228681f, z932.f228681f) && C46238a.m51546a(this.f228682g, z932.f228682g) && C46238a.m51546a(this.f228683h, z932.f228683h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228679d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f228680e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f228681f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f228682g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f228683h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f228679d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f228680e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f228681f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f228682g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f228683h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C78022z93 z932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                z932.f228679d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                z932.f228680e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                z932.f228681f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                z932.f228682g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                z932.f228683h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
