package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.p */
public class C67038p extends C47465a {

    /* renamed from: d */
    public int f192574d;

    /* renamed from: e */
    public String f192575e;

    /* renamed from: f */
    public String f192576f;

    /* renamed from: g */
    public int f192577g;

    /* renamed from: h */
    public String f192578h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C67038p)) {
            return false;
        }
        C67038p pVar = (C67038p) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f192574d), Integer.valueOf(pVar.f192574d)) && C46238a.m51546a(this.f192575e, pVar.f192575e) && C46238a.m51546a(this.f192576f, pVar.f192576f) && C46238a.m51546a(Integer.valueOf(this.f192577g), Integer.valueOf(pVar.f192577g)) && C46238a.m51546a(this.f192578h, pVar.f192578h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f192575e == null) {
                throw new C52419b("Not all required fields were included: name");
            } else if (this.f192576f != null) {
                aVar.mo74318e(1, this.f192574d);
                String str = this.f192575e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f192576f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f192577g);
                String str3 = this.f192578h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: addr");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f192574d) + 0;
            String str4 = this.f192575e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f192576f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f192577g);
            String str6 = this.f192578h;
            return str6 != null ? e2 + C52418a.m58683j(5, str6) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f192575e == null) {
                throw new C52419b("Not all required fields were included: name");
            } else if (this.f192576f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: addr");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C67038p pVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pVar.f192574d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pVar.f192575e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pVar.f192576f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                pVar.f192577g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                pVar.f192578h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
