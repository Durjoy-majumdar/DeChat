package se3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: se3.a */
public class C77683a extends C47465a {

    /* renamed from: d */
    public int f226451d;

    /* renamed from: e */
    public int f226452e;

    /* renamed from: f */
    public String f226453f;

    /* renamed from: g */
    public String f226454g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77683a)) {
            return false;
        }
        C77683a aVar2 = (C77683a) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f226451d), Integer.valueOf(aVar2.f226451d)) && C46238a.m51546a(Integer.valueOf(this.f226452e), Integer.valueOf(aVar2.f226452e)) && C46238a.m51546a(this.f226453f, aVar2.f226453f) && C46238a.m51546a(this.f226454g, aVar2.f226454g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f226453f != null) {
                aVar.mo74318e(1, this.f226451d);
                aVar.mo74318e(2, this.f226452e);
                String str = this.f226453f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f226454g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: btnStr");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f226451d) + 0 + C52418a.m58678e(2, this.f226452e);
            String str3 = this.f226453f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f226454g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f226453f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: btnStr");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77683a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                aVar4.f226451d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                aVar4.f226452e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                aVar4.f226453f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                aVar4.f226454g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
