package bf2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bf2.g */
public class C39764g extends C47465a {

    /* renamed from: d */
    public String f106711d;

    /* renamed from: e */
    public String f106712e;

    /* renamed from: f */
    public String f106713f;

    /* renamed from: g */
    public String f106714g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39764g)) {
            return false;
        }
        C39764g gVar = (C39764g) aVar;
        return C46238a.m51546a(this.f106711d, gVar.f106711d) && C46238a.m51546a(this.f106712e, gVar.f106712e) && C46238a.m51546a(this.f106713f, gVar.f106713f) && C46238a.m51546a(this.f106714g, gVar.f106714g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f106711d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f106712e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f106713f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f106714g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f106711d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f106712e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f106713f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f106714g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            C39764g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gVar.f106711d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gVar.f106712e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gVar.f106713f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                gVar.f106714g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
