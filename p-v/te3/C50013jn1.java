package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jn1 */
public class C50013jn1 extends C47465a {

    /* renamed from: d */
    public String f136208d;

    /* renamed from: e */
    public int f136209e;

    /* renamed from: f */
    public C89349b f136210f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50013jn1)) {
            return false;
        }
        C50013jn1 jn12 = (C50013jn1) aVar;
        return C46238a.m51546a(this.f136208d, jn12.f136208d) && C46238a.m51546a(Integer.valueOf(this.f136209e), Integer.valueOf(jn12.f136209e)) && C46238a.m51546a(this.f136210f, jn12.f136210f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136208d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f136209e);
            C89349b bVar = this.f136210f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f136208d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f136209e);
            C89349b bVar2 = this.f136210f;
            return bVar2 != null ? e + C52418a.m58675b(3, bVar2) : e;
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
            C50013jn1 jn12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jn12.f136208d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                jn12.f136209e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                jn12.f136210f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
