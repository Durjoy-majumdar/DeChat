package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class wb4 extends C47465a {

    /* renamed from: d */
    public String f299726d;

    /* renamed from: e */
    public String f299727e;

    /* renamed from: f */
    public String f299728f;

    /* renamed from: g */
    public String f299729g;

    /* renamed from: h */
    public String f299730h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wb4)) {
            return false;
        }
        wb4 wb4 = (wb4) aVar;
        return C46238a.m51546a(this.f299726d, wb4.f299726d) && C46238a.m51546a(this.f299727e, wb4.f299727e) && C46238a.m51546a(this.f299728f, wb4.f299728f) && C46238a.m51546a(this.f299729g, wb4.f299729g) && C46238a.m51546a(this.f299730h, wb4.f299730h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299726d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f299727e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f299728f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f299729g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f299730h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: videoFileMD5");
        } else if (i == 1) {
            String str6 = this.f299726d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f299727e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f299728f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f299729g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f299730h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299726d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: videoFileMD5");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            wb4 wb4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wb4.f299726d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wb4.f299727e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wb4.f299728f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                wb4.f299729g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                wb4.f299730h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
