package p821rk;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: rk.e */
public class C48032e extends C101820nt3 {

    /* renamed from: d */
    public String f128833d;

    /* renamed from: e */
    public String f128834e;

    /* renamed from: f */
    public int f128835f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48032e)) {
            return false;
        }
        C48032e eVar = (C48032e) aVar;
        return C46238a.m51546a(this.BaseRequest, eVar.BaseRequest) && C46238a.m51546a(this.f128833d, eVar.f128833d) && C46238a.m51546a(this.f128834e, eVar.f128834e) && C46238a.m51546a(Integer.valueOf(this.f128835f), Integer.valueOf(eVar.f128835f));
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
            String str = this.f128833d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f128834e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f128835f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f128833d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f128834e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f128835f);
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
            C48032e eVar = objArr[1];
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
                    eVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eVar.f128833d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                eVar.f128834e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                eVar.f128835f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
