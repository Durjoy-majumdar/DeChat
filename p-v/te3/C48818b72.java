package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b72 */
public class C48818b72 extends C101820nt3 {

    /* renamed from: d */
    public String f130991d;

    /* renamed from: e */
    public String f130992e;

    /* renamed from: f */
    public int f130993f;

    /* renamed from: g */
    public int f130994g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48818b72)) {
            return false;
        }
        C48818b72 b722 = (C48818b72) aVar;
        return C46238a.m51546a(this.BaseRequest, b722.BaseRequest) && C46238a.m51546a(this.f130991d, b722.f130991d) && C46238a.m51546a(this.f130992e, b722.f130992e) && C46238a.m51546a(Integer.valueOf(this.f130993f), Integer.valueOf(b722.f130993f)) && C46238a.m51546a(Integer.valueOf(this.f130994g), Integer.valueOf(b722.f130994g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f130991d == null) {
                throw new C52419b("Not all required fields were included: URL");
            } else if (this.f130992e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f130991d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f130992e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f130993f);
                aVar.mo74318e(5, this.f130994g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: UserAgent");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f130991d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f130992e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f130993f) + C52418a.m58678e(5, this.f130994g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130991d == null) {
                throw new C52419b("Not all required fields were included: URL");
            } else if (this.f130992e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: UserAgent");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48818b72 b722 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    b722.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                b722.f130991d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                b722.f130992e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                b722.f130993f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                b722.f130994g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
