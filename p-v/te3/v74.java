package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v74 extends C47465a {

    /* renamed from: d */
    public int f143378d;

    /* renamed from: e */
    public C51163rv3 f143379e;

    /* renamed from: f */
    public int f143380f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v74)) {
            return false;
        }
        v74 v74 = (v74) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143378d), Integer.valueOf(v74.f143378d)) && C46238a.m51546a(this.f143379e, v74.f143379e) && C46238a.m51546a(Integer.valueOf(this.f143380f), Integer.valueOf(v74.f143380f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143378d);
            C51163rv3 rv32 = this.f143379e;
            if (rv32 != null) {
                aVar.mo74322i(2, rv32.computeSize());
                this.f143379e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f143380f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143378d) + 0;
            C51163rv3 rv33 = this.f143379e;
            if (rv33 != null) {
                e += C52418a.m58682i(2, rv33.computeSize());
            }
            return e + C52418a.m58678e(3, this.f143380f);
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
            v74 v74 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                v74.f143378d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    v74.f143379e = rv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                v74.f143380f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
