package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vl */
public class C64776vl extends C47465a {

    /* renamed from: d */
    public String f185917d;

    /* renamed from: e */
    public String f185918e;

    /* renamed from: f */
    public long f185919f;

    /* renamed from: g */
    public String f185920g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64776vl)) {
            return false;
        }
        C64776vl vlVar = (C64776vl) aVar;
        return C46238a.m51546a(this.f185917d, vlVar.f185917d) && C46238a.m51546a(this.f185918e, vlVar.f185918e) && C46238a.m51546a(Long.valueOf(this.f185919f), Long.valueOf(vlVar.f185919f)) && C46238a.m51546a(this.f185920g, vlVar.f185920g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185917d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f185918e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74321h(3, this.f185919f);
                String str3 = this.f185920g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: personalpay_order_id");
        } else if (i == 1) {
            String str4 = this.f185917d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f185918e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f185919f);
            String str6 = this.f185920g;
            return str6 != null ? h + C52418a.m58683j(4, str6) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185917d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: personalpay_order_id");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64776vl vlVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vlVar.f185917d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vlVar.f185918e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vlVar.f185919f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                vlVar.f185920g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
