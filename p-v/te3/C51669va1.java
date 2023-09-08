package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.va1 */
public class C51669va1 extends C47465a {

    /* renamed from: d */
    public String f143406d;

    /* renamed from: e */
    public String f143407e;

    /* renamed from: f */
    public String f143408f;

    /* renamed from: g */
    public long f143409g;

    /* renamed from: h */
    public int f143410h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51669va1)) {
            return false;
        }
        C51669va1 va12 = (C51669va1) aVar;
        return C46238a.m51546a(this.f143406d, va12.f143406d) && C46238a.m51546a(this.f143407e, va12.f143407e) && C46238a.m51546a(this.f143408f, va12.f143408f) && C46238a.m51546a(Long.valueOf(this.f143409g), Long.valueOf(va12.f143409g)) && C46238a.m51546a(Integer.valueOf(this.f143410h), Integer.valueOf(va12.f143410h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143406d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143407e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143408f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f143409g);
            aVar.mo74318e(5, this.f143410h);
            return 0;
        } else if (i == 1) {
            String str4 = this.f143406d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f143407e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143408f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f143409g) + C52418a.m58678e(5, this.f143410h);
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
            C51669va1 va12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                va12.f143406d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                va12.f143407e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                va12.f143408f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                va12.f143409g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                va12.f143410h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
