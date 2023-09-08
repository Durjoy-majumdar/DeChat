package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tu0 */
public class C51447tu0 extends C47465a {

    /* renamed from: d */
    public String f142412d;

    /* renamed from: e */
    public String f142413e;

    /* renamed from: f */
    public String f142414f;

    /* renamed from: g */
    public String f142415g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51447tu0)) {
            return false;
        }
        C51447tu0 tu02 = (C51447tu0) aVar;
        return C46238a.m51546a(this.f142412d, tu02.f142412d) && C46238a.m51546a(this.f142413e, tu02.f142413e) && C46238a.m51546a(this.f142414f, tu02.f142414f) && C46238a.m51546a(this.f142415g, tu02.f142415g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142412d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f142413e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f142414f;
            if (str3 != null) {
                aVar.mo74323j(101, str3);
            }
            String str4 = this.f142415g;
            if (str4 != null) {
                aVar.mo74323j(102, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f142412d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f142413e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f142414f;
            if (str7 != null) {
                i2 += C52418a.m58683j(101, str7);
            }
            String str8 = this.f142415g;
            return str8 != null ? i2 + C52418a.m58683j(102, str8) : i2;
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
            C51447tu0 tu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tu02.f142412d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                tu02.f142413e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 101) {
                tu02.f142414f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 102) {
                return -1;
            } else {
                tu02.f142415g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
