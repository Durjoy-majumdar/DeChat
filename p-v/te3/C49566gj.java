package te3;

import com.tencent.p014mm.storage.C72996z1;
import if0.C46238a;
import p248ug.C52558c;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gj */
public class C49566gj extends C47465a {

    /* renamed from: d */
    public String f134062d;

    /* renamed from: e */
    public C72996z1 f134063e;

    /* renamed from: f */
    public C52558c f134064f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49566gj)) {
            return false;
        }
        C49566gj gjVar = (C49566gj) aVar;
        return C46238a.m51546a(this.f134062d, gjVar.f134062d) && C46238a.m51546a(this.f134063e, gjVar.f134063e) && C46238a.m51546a(this.f134064f, gjVar.f134064f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134062d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: userName");
        } else if (i == 1) {
            String str2 = this.f134062d;
            if (str2 != null) {
                return 0 + C52418a.m58683j(1, str2);
            }
            return 0;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134062d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: userName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49566gj gjVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            gjVar.f134062d = aVar3.mo141633k(intValue);
            return 0;
        }
    }
}
