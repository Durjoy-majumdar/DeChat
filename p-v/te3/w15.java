package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class w15 extends C47465a {

    /* renamed from: d */
    public String f143814d;

    /* renamed from: e */
    public String f143815e;

    /* renamed from: f */
    public boolean f143816f;

    /* renamed from: g */
    public int f143817g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w15)) {
            return false;
        }
        w15 w15 = (w15) aVar;
        return C46238a.m51546a(this.f143814d, w15.f143814d) && C46238a.m51546a(this.f143815e, w15.f143815e) && C46238a.m51546a(Boolean.valueOf(this.f143816f), Boolean.valueOf(w15.f143816f)) && C46238a.m51546a(Integer.valueOf(this.f143817g), Integer.valueOf(w15.f143817g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143814d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f143815e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f143815e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74314a(3, this.f143816f);
                aVar.mo74318e(4, this.f143817g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Text");
            }
        } else if (i == 1) {
            String str3 = this.f143814d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f143815e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f143816f) + C52418a.m58678e(4, this.f143817g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143814d == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f143815e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Text");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            w15 w15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w15.f143814d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                w15.f143815e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                w15.f143816f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                w15.f143817g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
