package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z53 */
public class C118482z53 extends C47465a {

    /* renamed from: d */
    public fh4 f354614d;

    /* renamed from: e */
    public int f354615e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118482z53)) {
            return false;
        }
        C118482z53 z532 = (C118482z53) aVar;
        return C46238a.m51546a(this.f354614d, z532.f354614d) && C46238a.m51546a(Integer.valueOf(this.f354615e), Integer.valueOf(z532.f354615e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            fh4 fh4 = this.f354614d;
            if (fh4 != null) {
                aVar.mo74322i(1, fh4.computeSize());
                this.f354614d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f354615e);
            return 0;
        } else if (i == 1) {
            fh4 fh42 = this.f354614d;
            if (fh42 != null) {
                i2 = 0 + C52418a.m58682i(1, fh42.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f354615e);
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
            C118482z53 z532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    fh4 fh43 = new fh4();
                    if (bArr != null && bArr.length > 0) {
                        fh43.parseFrom(bArr);
                    }
                    z532.f354614d = fh43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                z532.f354615e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
