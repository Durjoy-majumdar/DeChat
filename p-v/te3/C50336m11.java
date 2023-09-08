package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m11 */
public class C50336m11 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51006qs1> f137744d = new LinkedList<>();

    /* renamed from: e */
    public C48779ay0 f137745e;

    /* renamed from: f */
    public int f137746f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50336m11)) {
            return false;
        }
        C50336m11 m112 = (C50336m11) aVar;
        return C46238a.m51546a(this.BaseResponse, m112.BaseResponse) && C46238a.m51546a(this.f137744d, m112.f137744d) && C46238a.m51546a(this.f137745e, m112.f137745e) && C46238a.m51546a(Integer.valueOf(this.f137746f), Integer.valueOf(m112.f137746f));
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
            aVar.mo74320g(2, 8, this.f137744d);
            C48779ay0 ay02 = this.f137745e;
            if (ay02 != null) {
                aVar.mo74322i(3, ay02.computeSize());
                this.f137745e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f137746f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f137744d);
            C48779ay0 ay03 = this.f137745e;
            if (ay03 != null) {
                g += C52418a.m58682i(3, ay03.computeSize());
            }
            return g + C52418a.m58678e(4, this.f137746f);
        } else if (i == 2) {
            this.f137744d.clear();
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
            C50336m11 m112 = objArr[1];
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
                    m112.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51006qs1 qs12 = new C51006qs1();
                    if (bArr2 != null && bArr2.length > 0) {
                        qs12.parseFrom(bArr2);
                    }
                    m112.f137744d.add(qs12);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C48779ay0 ay04 = new C48779ay0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ay04.parseFrom(bArr3);
                    }
                    m112.f137745e = ay04;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                m112.f137746f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
