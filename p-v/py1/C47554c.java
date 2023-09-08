package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.c */
public class C47554c extends C47465a {

    /* renamed from: d */
    public String f127609d;

    /* renamed from: e */
    public String f127610e;

    /* renamed from: f */
    public String f127611f;

    /* renamed from: g */
    public String f127612g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47554c)) {
            return false;
        }
        C47554c cVar = (C47554c) aVar;
        return C46238a.m51546a(this.f127609d, cVar.f127609d) && C46238a.m51546a(this.f127610e, cVar.f127610e) && C46238a.m51546a(this.f127611f, cVar.f127611f) && C46238a.m51546a(this.f127612g, cVar.f127612g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127609d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127610e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127611f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f127612g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i == 1) {
            String str5 = this.f127609d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f127610e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f127611f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f127612g;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127609d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47554c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cVar.f127609d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                cVar.f127610e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cVar.f127611f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                cVar.f127612g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
