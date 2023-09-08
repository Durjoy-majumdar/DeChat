package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g24 */
public class C49506g24 extends C101820nt3 {

    /* renamed from: d */
    public int f133809d;

    /* renamed from: e */
    public int f133810e;

    /* renamed from: f */
    public C50122kf f133811f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49506g24)) {
            return false;
        }
        C49506g24 g242 = (C49506g24) aVar;
        return C46238a.m51546a(this.BaseRequest, g242.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f133809d), Integer.valueOf(g242.f133809d)) && C46238a.m51546a(Integer.valueOf(this.f133810e), Integer.valueOf(g242.f133810e)) && C46238a.m51546a(this.f133811f, g242.f133811f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133811f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f133809d);
                aVar.mo74318e(3, this.f133810e);
                C50122kf kfVar = this.f133811f;
                if (kfVar != null) {
                    aVar.mo74322i(4, kfVar.computeSize());
                    this.f133811f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: attr");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133809d) + C52418a.m58678e(3, this.f133810e);
            C50122kf kfVar2 = this.f133811f;
            return kfVar2 != null ? e + C52418a.m58682i(4, kfVar2.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133811f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: attr");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49506g24 g242 = objArr[1];
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
                    g242.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                g242.f133809d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                g242.f133810e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50122kf kfVar3 = new C50122kf();
                    if (bArr2 != null && bArr2.length > 0) {
                        kfVar3.parseFrom(bArr2);
                    }
                    g242.f133811f = kfVar3;
                }
                return 0;
            }
        }
    }
}
