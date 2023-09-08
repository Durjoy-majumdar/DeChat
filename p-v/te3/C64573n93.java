package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n93 */
public class C64573n93 extends C47465a {

    /* renamed from: d */
    public C64346ep3 f184446d;

    /* renamed from: e */
    public int f184447e;

    /* renamed from: f */
    public int f184448f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64573n93)) {
            return false;
        }
        C64573n93 n932 = (C64573n93) aVar;
        return C46238a.m51546a(this.f184446d, n932.f184446d) && C46238a.m51546a(Integer.valueOf(this.f184447e), Integer.valueOf(n932.f184447e)) && C46238a.m51546a(Integer.valueOf(this.f184448f), Integer.valueOf(n932.f184448f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64346ep3 ep32 = this.f184446d;
            if (ep32 != null) {
                aVar.mo74322i(1, ep32.computeSize());
                this.f184446d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f184447e);
            aVar.mo74318e(3, this.f184448f);
            return 0;
        } else if (i == 1) {
            C64346ep3 ep33 = this.f184446d;
            if (ep33 != null) {
                i2 = 0 + C52418a.m58682i(1, ep33.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f184447e) + C52418a.m58678e(3, this.f184448f);
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
            C64573n93 n932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64346ep3 ep34 = new C64346ep3();
                    if (bArr != null && bArr.length > 0) {
                        ep34.parseFrom(bArr);
                    }
                    n932.f184446d = ep34;
                }
                return 0;
            } else if (intValue == 2) {
                n932.f184447e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                n932.f184448f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
