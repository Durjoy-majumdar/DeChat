package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ha0 */
public class C49679ha0 extends C101820nt3 {

    /* renamed from: d */
    public int f134523d;

    /* renamed from: e */
    public int f134524e;

    /* renamed from: f */
    public int f134525f;

    /* renamed from: g */
    public String f134526g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49679ha0)) {
            return false;
        }
        C49679ha0 ha02 = (C49679ha0) aVar;
        return C46238a.m51546a(this.BaseRequest, ha02.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f134523d), Integer.valueOf(ha02.f134523d)) && C46238a.m51546a(Integer.valueOf(this.f134524e), Integer.valueOf(ha02.f134524e)) && C46238a.m51546a(Integer.valueOf(this.f134525f), Integer.valueOf(ha02.f134525f)) && C46238a.m51546a(this.f134526g, ha02.f134526g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f134526g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f134523d);
                aVar.mo74318e(3, this.f134524e);
                aVar.mo74318e(4, this.f134525f);
                String str = this.f134526g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Content");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134523d) + C52418a.m58678e(3, this.f134524e) + C52418a.m58678e(4, this.f134525f);
            String str2 = this.f134526g;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134526g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Content");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49679ha0 ha02 = objArr[1];
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
                    ha02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ha02.f134523d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ha02.f134524e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ha02.f134525f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ha02.f134526g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
