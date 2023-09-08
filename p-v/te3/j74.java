package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class j74 extends C47465a {

    /* renamed from: d */
    public String f135912d;

    /* renamed from: e */
    public int f135913e;

    /* renamed from: f */
    public C51018qv3 f135914f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j74)) {
            return false;
        }
        j74 j74 = (j74) aVar;
        return C46238a.m51546a(this.f135912d, j74.f135912d) && C46238a.m51546a(Integer.valueOf(this.f135913e), Integer.valueOf(j74.f135913e)) && C46238a.m51546a(this.f135914f, j74.f135914f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135914f != null) {
                String str = this.f135912d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f135913e);
                C51018qv3 qv32 = this.f135914f;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f135914f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: HBBuffer");
        } else if (i == 1) {
            String str2 = this.f135912d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f135913e);
            C51018qv3 qv33 = this.f135914f;
            return qv33 != null ? e + C52418a.m58682i(3, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135914f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: HBBuffer");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            j74 j74 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j74.f135912d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                j74.f135913e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    j74.f135914f = qv34;
                }
                return 0;
            }
        }
    }
}
