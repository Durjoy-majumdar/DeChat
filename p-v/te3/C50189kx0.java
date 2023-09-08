package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kx0 */
public class C50189kx0 extends C49335eu3 {

    /* renamed from: d */
    public C52204z21 f137077d;

    /* renamed from: e */
    public C48779ay0 f137078e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50189kx0)) {
            return false;
        }
        C50189kx0 kx02 = (C50189kx0) aVar;
        return C46238a.m51546a(this.BaseResponse, kx02.BaseResponse) && C46238a.m51546a(this.f137077d, kx02.f137077d) && C46238a.m51546a(this.f137078e, kx02.f137078e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C52204z21 z212 = this.f137077d;
            if (z212 != null) {
                aVar.mo74322i(2, z212.computeSize());
                this.f137077d.writeFields(aVar);
            }
            C48779ay0 ay02 = this.f137078e;
            if (ay02 != null) {
                aVar.mo74322i(3, ay02.computeSize());
                this.f137078e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C52204z21 z213 = this.f137077d;
            if (z213 != null) {
                i2 += C52418a.m58682i(2, z213.computeSize());
            }
            C48779ay0 ay03 = this.f137078e;
            return ay03 != null ? i2 + C52418a.m58682i(3, ay03.computeSize()) : i2;
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
            C50189kx0 kx02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    kx02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52204z21 z214 = new C52204z21();
                    if (bArr2 != null && bArr2.length > 0) {
                        z214.parseFrom(bArr2);
                    }
                    kx02.f137077d = z214;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C48779ay0 ay04 = new C48779ay0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ay04.parseFrom(bArr3);
                    }
                    kx02.f137078e = ay04;
                }
                return 0;
            }
        }
    }
}
