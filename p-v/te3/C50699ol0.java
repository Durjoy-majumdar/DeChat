package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ol0 */
public class C50699ol0 extends C47465a {

    /* renamed from: d */
    public String f139245d;

    /* renamed from: e */
    public String f139246e;

    /* renamed from: f */
    public int f139247f;

    /* renamed from: g */
    public C89349b f139248g;

    /* renamed from: h */
    public String f139249h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50699ol0)) {
            return false;
        }
        C50699ol0 ol02 = (C50699ol0) aVar;
        return C46238a.m51546a(this.f139245d, ol02.f139245d) && C46238a.m51546a(this.f139246e, ol02.f139246e) && C46238a.m51546a(Integer.valueOf(this.f139247f), Integer.valueOf(ol02.f139247f)) && C46238a.m51546a(this.f139248g, ol02.f139248g) && C46238a.m51546a(this.f139249h, ol02.f139249h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139245d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139246e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f139247f);
            C89349b bVar = this.f139248g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            String str3 = this.f139249h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f139245d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f139246e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f139247f);
            C89349b bVar2 = this.f139248g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            String str6 = this.f139249h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C50699ol0 ol02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ol02.f139245d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ol02.f139246e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ol02.f139247f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ol02.f139248g = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ol02.f139249h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
