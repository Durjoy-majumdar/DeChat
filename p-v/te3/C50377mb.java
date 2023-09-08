package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mb */
public class C50377mb extends C101820nt3 {

    /* renamed from: d */
    public int f137932d;

    /* renamed from: e */
    public LinkedList<C50194ky2> f137933e = new LinkedList<>();

    /* renamed from: f */
    public int f137934f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50377mb)) {
            return false;
        }
        C50377mb mbVar = (C50377mb) aVar;
        return C46238a.m51546a(this.BaseRequest, mbVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f137932d), Integer.valueOf(mbVar.f137932d)) && C46238a.m51546a(this.f137933e, mbVar.f137933e) && C46238a.m51546a(Integer.valueOf(this.f137934f), Integer.valueOf(mbVar.f137934f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f137932d);
            aVar.mo74320g(3, 8, this.f137933e);
            aVar.mo74318e(4, this.f137934f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f137932d) + C52418a.m58680g(3, 8, this.f137933e) + C52418a.m58678e(4, this.f137934f);
        } else if (i == 2) {
            this.f137933e.clear();
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
            C50377mb mbVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    mbVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mbVar.f137932d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50194ky2 ky22 = new C50194ky2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ky22.parseFrom(bArr2);
                    }
                    mbVar.f137933e.add(ky22);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                mbVar.f137934f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
