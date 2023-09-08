package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oq0 */
public class C50716oq0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139310d;

    /* renamed from: e */
    public int f139311e;

    /* renamed from: f */
    public C89349b f139312f;

    /* renamed from: g */
    public C89349b f139313g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50716oq0)) {
            return false;
        }
        C50716oq0 oq02 = (C50716oq0) aVar;
        return C46238a.m51546a(this.BaseRequest, oq02.BaseRequest) && C46238a.m51546a(this.f139310d, oq02.f139310d) && C46238a.m51546a(Integer.valueOf(this.f139311e), Integer.valueOf(oq02.f139311e)) && C46238a.m51546a(this.f139312f, oq02.f139312f) && C46238a.m51546a(this.f139313g, oq02.f139313g);
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
            C49842ig0 ig02 = this.f139310d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139310d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f139311e);
            C89349b bVar = this.f139312f;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            C89349b bVar2 = this.f139313g;
            if (bVar2 != null) {
                aVar.mo74315b(6, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139310d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f139311e);
            C89349b bVar3 = this.f139312f;
            if (bVar3 != null) {
                e += C52418a.m58675b(5, bVar3);
            }
            C89349b bVar4 = this.f139313g;
            return bVar4 != null ? e + C52418a.m58675b(6, bVar4) : e;
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
            C50716oq0 oq02 = objArr[1];
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
                    oq02.BaseRequest = iaVar3;
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
                    oq02.f139310d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                oq02.f139311e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                oq02.f139312f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                oq02.f139313g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
