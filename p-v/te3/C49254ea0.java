package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ea0 */
public class C49254ea0 extends C47465a {

    /* renamed from: d */
    public String f132821d;

    /* renamed from: e */
    public int f132822e;

    /* renamed from: f */
    public String f132823f;

    /* renamed from: g */
    public int f132824g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49254ea0)) {
            return false;
        }
        C49254ea0 ea02 = (C49254ea0) aVar;
        return C46238a.m51546a(this.f132821d, ea02.f132821d) && C46238a.m51546a(Integer.valueOf(this.f132822e), Integer.valueOf(ea02.f132822e)) && C46238a.m51546a(this.f132823f, ea02.f132823f) && C46238a.m51546a(Integer.valueOf(this.f132824g), Integer.valueOf(ea02.f132824g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132821d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132822e);
            String str2 = this.f132823f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f132824g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f132821d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f132822e);
            String str4 = this.f132823f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f132824g);
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
            C49254ea0 ea02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ea02.f132821d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ea02.f132822e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ea02.f132823f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ea02.f132824g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
