package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.p */
public class C100966p extends C47465a {

    /* renamed from: d */
    public String f295655d;

    /* renamed from: e */
    public String f295656e;

    /* renamed from: f */
    public String f295657f;

    /* renamed from: g */
    public String f295658g;

    /* renamed from: h */
    public String f295659h;

    /* renamed from: i */
    public int f295660i;

    /* renamed from: j */
    public long f295661j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C100966p)) {
            return false;
        }
        C100966p pVar = (C100966p) aVar;
        return C46238a.m51546a(this.f295655d, pVar.f295655d) && C46238a.m51546a(this.f295656e, pVar.f295656e) && C46238a.m51546a(this.f295657f, pVar.f295657f) && C46238a.m51546a(this.f295658g, pVar.f295658g) && C46238a.m51546a(this.f295659h, pVar.f295659h) && C46238a.m51546a(Integer.valueOf(this.f295660i), Integer.valueOf(pVar.f295660i)) && C46238a.m51546a(Long.valueOf(this.f295661j), Long.valueOf(pVar.f295661j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f295655d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: DeviceID");
            } else if (this.f295656e == null) {
                throw new C52419b("Not all required fields were included: DeviceName");
            } else if (this.f295657f == null) {
                throw new C52419b("Not all required fields were included: Model");
            } else if (this.f295658g == null) {
                throw new C52419b("Not all required fields were included: SystemName");
            } else if (this.f295659h != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f295656e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f295657f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f295658g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f295659h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                aVar.mo74318e(6, this.f295660i);
                aVar.mo74321h(7, this.f295661j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SystemVersion");
            }
        } else if (i == 1) {
            String str6 = this.f295655d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f295656e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f295657f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f295658g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f295659h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58678e(6, this.f295660i) + C52418a.m58681h(7, this.f295661j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f295655d == null) {
                throw new C52419b("Not all required fields were included: DeviceID");
            } else if (this.f295656e == null) {
                throw new C52419b("Not all required fields were included: DeviceName");
            } else if (this.f295657f == null) {
                throw new C52419b("Not all required fields were included: Model");
            } else if (this.f295658g == null) {
                throw new C52419b("Not all required fields were included: SystemName");
            } else if (this.f295659h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SystemVersion");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C100966p pVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pVar.f295655d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pVar.f295656e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pVar.f295657f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pVar.f295658g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pVar.f295659h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pVar.f295660i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pVar.f295661j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
