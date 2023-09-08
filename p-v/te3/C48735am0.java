package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.am0 */
public class C48735am0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f130625d;

    /* renamed from: e */
    public long f130626e;

    /* renamed from: f */
    public long f130627f;

    /* renamed from: g */
    public C89349b f130628g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48735am0)) {
            return false;
        }
        C48735am0 am02 = (C48735am0) aVar;
        return C46238a.m51546a(this.BaseRequest, am02.BaseRequest) && C46238a.m51546a(this.f130625d, am02.f130625d) && C46238a.m51546a(Long.valueOf(this.f130626e), Long.valueOf(am02.f130626e)) && C46238a.m51546a(Long.valueOf(this.f130627f), Long.valueOf(am02.f130627f)) && C46238a.m51546a(this.f130628g, am02.f130628g);
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
            C49842ig0 ig02 = this.f130625d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f130625d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f130626e);
            aVar.mo74321h(4, this.f130627f);
            C89349b bVar = this.f130628g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f130625d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f130626e) + C52418a.m58681h(4, this.f130627f);
            C89349b bVar2 = this.f130628g;
            return bVar2 != null ? h + C52418a.m58675b(5, bVar2) : h;
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
            C48735am0 am02 = objArr[1];
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
                    am02.BaseRequest = iaVar3;
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
                    am02.f130625d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                am02.f130626e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                am02.f130627f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                am02.f130628g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
