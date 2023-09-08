package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dz0 */
public class C49205dz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f132582d;

    /* renamed from: e */
    public long f132583e;

    /* renamed from: f */
    public long f132584f;

    /* renamed from: g */
    public C89349b f132585g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49205dz0)) {
            return false;
        }
        C49205dz0 dz02 = (C49205dz0) aVar;
        return C46238a.m51546a(this.BaseRequest, dz02.BaseRequest) && C46238a.m51546a(this.f132582d, dz02.f132582d) && C46238a.m51546a(Long.valueOf(this.f132583e), Long.valueOf(dz02.f132583e)) && C46238a.m51546a(Long.valueOf(this.f132584f), Long.valueOf(dz02.f132584f)) && C46238a.m51546a(this.f132585g, dz02.f132585g);
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
            C49842ig0 ig02 = this.f132582d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f132582d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f132583e);
            aVar.mo74321h(4, this.f132584f);
            C89349b bVar = this.f132585g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f132582d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f132583e) + C52418a.m58681h(4, this.f132584f);
            C89349b bVar2 = this.f132585g;
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
            C49205dz0 dz02 = objArr[1];
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
                    dz02.BaseRequest = iaVar3;
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
                    dz02.f132582d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                dz02.f132583e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                dz02.f132584f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                dz02.f132585g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
