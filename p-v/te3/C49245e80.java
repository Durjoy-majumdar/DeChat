package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e80 */
public class C49245e80 extends C47465a {

    /* renamed from: d */
    public String f132773d;

    /* renamed from: e */
    public String f132774e;

    /* renamed from: f */
    public String f132775f;

    /* renamed from: g */
    public String f132776g;

    /* renamed from: h */
    public String f132777h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49245e80)) {
            return false;
        }
        C49245e80 e802 = (C49245e80) aVar;
        return C46238a.m51546a(this.f132773d, e802.f132773d) && C46238a.m51546a(this.f132774e, e802.f132774e) && C46238a.m51546a(this.f132775f, e802.f132775f) && C46238a.m51546a(this.f132776g, e802.f132776g) && C46238a.m51546a(this.f132777h, e802.f132777h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132773d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f132774e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f132775f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f132776g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f132777h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f132773d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f132774e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f132775f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f132776g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f132777h;
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
            C49245e80 e802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e802.f132773d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e802.f132774e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                e802.f132775f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                e802.f132776g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                e802.f132777h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
