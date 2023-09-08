package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ur3 */
public class C51588ur3 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f143049d;

    /* renamed from: e */
    public int f143050e;

    /* renamed from: f */
    public C51018qv3 f143051f;

    /* renamed from: g */
    public long f143052g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51588ur3)) {
            return false;
        }
        C51588ur3 ur32 = (C51588ur3) aVar;
        return C46238a.m51546a(this.BaseRequest, ur32.BaseRequest) && C46238a.m51546a(this.f143049d, ur32.f143049d) && C46238a.m51546a(Integer.valueOf(this.f143050e), Integer.valueOf(ur32.f143050e)) && C46238a.m51546a(this.f143051f, ur32.f143051f) && C46238a.m51546a(Long.valueOf(this.f143052g), Long.valueOf(ur32.f143052g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f143049d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C89349b bVar = this.f143049d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74318e(3, this.f143050e);
                C51018qv3 qv32 = this.f143051f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f143051f.writeFields(aVar);
                }
                aVar.mo74321h(5, this.f143052g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: clientCheckData");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f143049d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            int e = i2 + C52418a.m58678e(3, this.f143050e);
            C51018qv3 qv33 = this.f143051f;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            return e + C52418a.m58681h(5, this.f143052g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143049d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: clientCheckData");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51588ur3 ur32 = objArr[1];
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
                    ur32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ur32.f143049d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                ur32.f143050e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    ur32.f143051f = qv34;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ur32.f143052g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
