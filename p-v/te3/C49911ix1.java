package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ix1 */
public class C49911ix1 extends C101820nt3 {

    /* renamed from: d */
    public double f135731d;

    /* renamed from: e */
    public double f135732e;

    /* renamed from: f */
    public int f135733f;

    /* renamed from: g */
    public String f135734g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49911ix1)) {
            return false;
        }
        C49911ix1 ix12 = (C49911ix1) aVar;
        return C46238a.m51546a(this.BaseRequest, ix12.BaseRequest) && C46238a.m51546a(Double.valueOf(this.f135731d), Double.valueOf(ix12.f135731d)) && C46238a.m51546a(Double.valueOf(this.f135732e), Double.valueOf(ix12.f135732e)) && C46238a.m51546a(Integer.valueOf(this.f135733f), Integer.valueOf(ix12.f135733f)) && C46238a.m51546a(this.f135734g, ix12.f135734g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74316c(2, this.f135731d);
            aVar.mo74316c(3, this.f135732e);
            aVar.mo74318e(4, this.f135733f);
            String str = this.f135734g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int c = i2 + C52418a.m58676c(2, this.f135731d) + C52418a.m58676c(3, this.f135732e) + C52418a.m58678e(4, this.f135733f);
            String str2 = this.f135734g;
            return str2 != null ? c + C52418a.m58683j(5, str2) : c;
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
            C49911ix1 ix12 = objArr[1];
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
                    ix12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ix12.f135731d = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue == 3) {
                ix12.f135732e = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue == 4) {
                ix12.f135733f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ix12.f135734g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
