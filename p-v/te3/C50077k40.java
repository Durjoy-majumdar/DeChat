package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k40 */
public class C50077k40 extends C47465a {

    /* renamed from: d */
    public k45 f136540d;

    /* renamed from: e */
    public String f136541e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50077k40)) {
            return false;
        }
        C50077k40 k402 = (C50077k40) aVar;
        return C46238a.m51546a(this.f136540d, k402.f136540d) && C46238a.m51546a(this.f136541e, k402.f136541e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            k45 k45 = this.f136540d;
            if (k45 != null) {
                aVar.mo74322i(1, k45.computeSize());
                this.f136540d.writeFields(aVar);
            }
            String str = this.f136541e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            k45 k452 = this.f136540d;
            if (k452 != null) {
                i2 = 0 + C52418a.m58682i(1, k452.computeSize());
            }
            String str2 = this.f136541e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C50077k40 k402 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    k45 k453 = new k45();
                    if (bArr != null && bArr.length > 0) {
                        k453.parseFrom(bArr);
                    }
                    k402.f136540d = k453;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                k402.f136541e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
