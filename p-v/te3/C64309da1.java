package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.da1 */
public class C64309da1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f182657d;

    /* renamed from: e */
    public C64281ca1 f182658e;

    /* renamed from: f */
    public C89349b f182659f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64309da1)) {
            return false;
        }
        C64309da1 da12 = (C64309da1) aVar;
        return C46238a.m51546a(this.BaseRequest, da12.BaseRequest) && C46238a.m51546a(this.f182657d, da12.f182657d) && C46238a.m51546a(this.f182658e, da12.f182658e) && C46238a.m51546a(this.f182659f, da12.f182659f);
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
            C49842ig0 ig02 = this.f182657d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f182657d.writeFields(aVar);
            }
            C64281ca1 ca12 = this.f182658e;
            if (ca12 != null) {
                aVar.mo74322i(3, ca12.computeSize());
                this.f182658e.writeFields(aVar);
            }
            C89349b bVar = this.f182659f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f182657d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C64281ca1 ca13 = this.f182658e;
            if (ca13 != null) {
                i2 += C52418a.m58682i(3, ca13.computeSize());
            }
            C89349b bVar2 = this.f182659f;
            return bVar2 != null ? i2 + C52418a.m58675b(4, bVar2) : i2;
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
            C64309da1 da12 = objArr[1];
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
                    da12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    da12.f182657d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64281ca1 ca14 = new C64281ca1();
                    if (bArr3 != null && bArr3.length > 0) {
                        ca14.parseFrom(bArr3);
                    }
                    da12.f182658e = ca14;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                da12.f182659f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
