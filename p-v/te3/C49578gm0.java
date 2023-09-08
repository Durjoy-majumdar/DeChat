package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gm0 */
public class C49578gm0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f134123d;

    /* renamed from: e */
    public String f134124e;

    /* renamed from: f */
    public C89349b f134125f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49578gm0)) {
            return false;
        }
        C49578gm0 gm02 = (C49578gm0) aVar;
        return C46238a.m51546a(this.BaseRequest, gm02.BaseRequest) && C46238a.m51546a(this.f134123d, gm02.f134123d) && C46238a.m51546a(this.f134124e, gm02.f134124e) && C46238a.m51546a(this.f134125f, gm02.f134125f);
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
            C49842ig0 ig02 = this.f134123d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134123d.writeFields(aVar);
            }
            String str = this.f134124e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f134125f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f134123d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f134124e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f134125f;
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
            C49578gm0 gm02 = objArr[1];
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
                    gm02.BaseRequest = iaVar3;
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
                    gm02.f134123d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                gm02.f134124e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                gm02.f134125f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
