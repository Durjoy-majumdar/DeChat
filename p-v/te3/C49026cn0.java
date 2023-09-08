package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cn0 */
public class C49026cn0 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f131834d;

    /* renamed from: e */
    public String f131835e;

    /* renamed from: f */
    public C49842ig0 f131836f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49026cn0)) {
            return false;
        }
        C49026cn0 cn02 = (C49026cn0) aVar;
        return C46238a.m51546a(this.BaseRequest, cn02.BaseRequest) && C46238a.m51546a(this.f131834d, cn02.f131834d) && C46238a.m51546a(this.f131835e, cn02.f131835e) && C46238a.m51546a(this.f131836f, cn02.f131836f);
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
            C89349b bVar = this.f131834d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            String str = this.f131835e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C49842ig0 ig02 = this.f131836f;
            if (ig02 != null) {
                aVar.mo74322i(4, ig02.computeSize());
                this.f131836f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f131834d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            String str2 = this.f131835e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C49842ig0 ig03 = this.f131836f;
            return ig03 != null ? i2 + C52418a.m58682i(4, ig03.computeSize()) : i2;
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
            C49026cn0 cn02 = objArr[1];
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
                    cn02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                cn02.f131834d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                cn02.f131835e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    cn02.f131836f = ig04;
                }
                return 0;
            }
        }
    }
}
