package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jf2 */
public class C49986jf2 extends C101820nt3 {

    /* renamed from: d */
    public C49697hf2 f136098d;

    /* renamed from: e */
    public int f136099e;

    /* renamed from: f */
    public C51018qv3 f136100f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49986jf2)) {
            return false;
        }
        C49986jf2 jf22 = (C49986jf2) aVar;
        return C46238a.m51546a(this.BaseRequest, jf22.BaseRequest) && C46238a.m51546a(this.f136098d, jf22.f136098d) && C46238a.m51546a(Integer.valueOf(this.f136099e), Integer.valueOf(jf22.f136099e)) && C46238a.m51546a(this.f136100f, jf22.f136100f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f136098d == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f136100f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C49697hf2 hf22 = this.f136098d;
                if (hf22 != null) {
                    aVar.mo74322i(2, hf22.computeSize());
                    this.f136098d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f136099e);
                C51018qv3 qv32 = this.f136100f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f136100f.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AuthBuffer");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49697hf2 hf23 = this.f136098d;
            if (hf23 != null) {
                i2 += C52418a.m58682i(2, hf23.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f136099e);
            C51018qv3 qv33 = this.f136100f;
            return qv33 != null ? e + C52418a.m58682i(4, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136098d == null) {
                throw new C52419b("Not all required fields were included: HardDevice");
            } else if (this.f136100f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AuthBuffer");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49986jf2 jf22 = objArr[1];
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
                    jf22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49697hf2 hf24 = new C49697hf2();
                    if (bArr2 != null && bArr2.length > 0) {
                        hf24.parseFrom(bArr2);
                    }
                    jf22.f136098d = hf24;
                }
                return 0;
            } else if (intValue == 3) {
                jf22.f136099e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv34.mo73348f(bArr3);
                    }
                    jf22.f136100f = qv34;
                }
                return 0;
            }
        }
    }
}
