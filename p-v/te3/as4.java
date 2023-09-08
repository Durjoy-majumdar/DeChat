package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class as4 extends C47465a {

    /* renamed from: d */
    public C49118da3 f130754d;

    /* renamed from: e */
    public C51300su2 f130755e;

    /* renamed from: f */
    public int f130756f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof as4)) {
            return false;
        }
        as4 as4 = (as4) aVar;
        return C46238a.m51546a(this.f130754d, as4.f130754d) && C46238a.m51546a(this.f130755e, as4.f130755e) && C46238a.m51546a(Integer.valueOf(this.f130756f), Integer.valueOf(as4.f130756f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49118da3 da32 = this.f130754d;
            if (da32 != null) {
                aVar.mo74322i(1, da32.computeSize());
                this.f130754d.writeFields(aVar);
            }
            C51300su2 su22 = this.f130755e;
            if (su22 != null) {
                aVar.mo74322i(2, su22.computeSize());
                this.f130755e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f130756f);
            return 0;
        } else if (i == 1) {
            C49118da3 da33 = this.f130754d;
            if (da33 != null) {
                i2 = 0 + C52418a.m58682i(1, da33.computeSize());
            }
            C51300su2 su23 = this.f130755e;
            if (su23 != null) {
                i2 += C52418a.m58682i(2, su23.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f130756f);
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
            as4 as4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49118da3 da34 = new C49118da3();
                    if (bArr != null && bArr.length > 0) {
                        da34.parseFrom(bArr);
                    }
                    as4.f130754d = da34;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51300su2 su24 = new C51300su2();
                    if (bArr2 != null && bArr2.length > 0) {
                        su24.parseFrom(bArr2);
                    }
                    as4.f130755e = su24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                as4.f130756f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
