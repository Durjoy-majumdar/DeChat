package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uk2 */
public class C51560uk2 extends C47465a {

    /* renamed from: d */
    public String f142913d;

    /* renamed from: e */
    public int f142914e;

    /* renamed from: f */
    public C50868ps1 f142915f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51560uk2)) {
            return false;
        }
        C51560uk2 uk22 = (C51560uk2) aVar;
        return C46238a.m51546a(this.f142913d, uk22.f142913d) && C46238a.m51546a(Integer.valueOf(this.f142914e), Integer.valueOf(uk22.f142914e)) && C46238a.m51546a(this.f142915f, uk22.f142915f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142913d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f142914e);
            C50868ps1 ps12 = this.f142915f;
            if (ps12 != null) {
                aVar.mo74322i(3, ps12.computeSize());
                this.f142915f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f142913d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f142914e);
            C50868ps1 ps13 = this.f142915f;
            return ps13 != null ? e + C52418a.m58682i(3, ps13.computeSize()) : e;
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
            C51560uk2 uk22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uk22.f142913d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                uk22.f142914e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50868ps1 ps14 = new C50868ps1();
                    if (bArr != null && bArr.length > 0) {
                        ps14.parseFrom(bArr);
                    }
                    uk22.f142915f = ps14;
                }
                return 0;
            }
        }
    }
}
