package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zf1 */
public class C52256zf1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f145859d;

    /* renamed from: e */
    public long f145860e;

    /* renamed from: f */
    public long f145861f;

    /* renamed from: g */
    public long f145862g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52256zf1)) {
            return false;
        }
        C52256zf1 zf12 = (C52256zf1) aVar;
        return C46238a.m51546a(this.BaseRequest, zf12.BaseRequest) && C46238a.m51546a(this.f145859d, zf12.f145859d) && C46238a.m51546a(Long.valueOf(this.f145860e), Long.valueOf(zf12.f145860e)) && C46238a.m51546a(Long.valueOf(this.f145861f), Long.valueOf(zf12.f145861f)) && C46238a.m51546a(Long.valueOf(this.f145862g), Long.valueOf(zf12.f145862g));
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
            C49842ig0 ig02 = this.f145859d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f145859d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f145860e);
            aVar.mo74321h(4, this.f145861f);
            aVar.mo74321h(5, this.f145862g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f145859d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            return i2 + C52418a.m58681h(3, this.f145860e) + C52418a.m58681h(4, this.f145861f) + C52418a.m58681h(5, this.f145862g);
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
            C52256zf1 zf12 = objArr[1];
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
                    zf12.BaseRequest = iaVar3;
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
                    zf12.f145859d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                zf12.f145860e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                zf12.f145861f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                zf12.f145862g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
