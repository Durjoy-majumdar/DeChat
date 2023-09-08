package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qq1 */
public class C50996qq1 extends C47465a {

    /* renamed from: d */
    public int f140454d;

    /* renamed from: e */
    public C48742ao0 f140455e;

    /* renamed from: f */
    public String f140456f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50996qq1)) {
            return false;
        }
        C50996qq1 qq12 = (C50996qq1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140454d), Integer.valueOf(qq12.f140454d)) && C46238a.m51546a(this.f140455e, qq12.f140455e) && C46238a.m51546a(this.f140456f, qq12.f140456f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140454d);
            C48742ao0 ao02 = this.f140455e;
            if (ao02 != null) {
                aVar.mo74322i(2, ao02.computeSize());
                this.f140455e.writeFields(aVar);
            }
            String str = this.f140456f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140454d) + 0;
            C48742ao0 ao03 = this.f140455e;
            if (ao03 != null) {
                e += C52418a.m58682i(2, ao03.computeSize());
            }
            String str2 = this.f140456f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C50996qq1 qq12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qq12.f140454d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48742ao0 ao04 = new C48742ao0();
                    if (bArr != null && bArr.length > 0) {
                        ao04.parseFrom(bArr);
                    }
                    qq12.f140455e = ao04;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                qq12.f140456f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
