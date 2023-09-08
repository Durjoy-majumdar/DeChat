package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lp3 */
public class C22509lp3 extends C47465a {

    /* renamed from: d */
    public C64289cj f64186d;

    /* renamed from: e */
    public C22538zi2 f64187e;

    /* renamed from: f */
    public int f64188f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22509lp3)) {
            return false;
        }
        C22509lp3 lp32 = (C22509lp3) aVar;
        return C46238a.m51546a(this.f64186d, lp32.f64186d) && C46238a.m51546a(this.f64187e, lp32.f64187e) && C46238a.m51546a(Integer.valueOf(this.f64188f), Integer.valueOf(lp32.f64188f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64289cj cjVar = this.f64186d;
            if (cjVar != null) {
                aVar.mo74322i(1, cjVar.computeSize());
                this.f64186d.writeFields(aVar);
            }
            C22538zi2 zi22 = this.f64187e;
            if (zi22 != null) {
                aVar.mo74322i(2, zi22.computeSize());
                this.f64187e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f64188f);
            return 0;
        } else if (i == 1) {
            C64289cj cjVar2 = this.f64186d;
            if (cjVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, cjVar2.computeSize());
            }
            C22538zi2 zi23 = this.f64187e;
            if (zi23 != null) {
                i2 += C52418a.m58682i(2, zi23.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f64188f);
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
            C22509lp3 lp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64289cj cjVar3 = new C64289cj();
                    if (bArr != null && bArr.length > 0) {
                        cjVar3.parseFrom(bArr);
                    }
                    lp32.f64186d = cjVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C22538zi2 zi24 = new C22538zi2();
                    if (bArr2 != null && bArr2.length > 0) {
                        zi24.parseFrom(bArr2);
                    }
                    lp32.f64187e = zi24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                lp32.f64188f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
