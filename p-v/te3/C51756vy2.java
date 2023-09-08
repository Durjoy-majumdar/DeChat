package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vy2 */
public class C51756vy2 extends C47465a {

    /* renamed from: d */
    public C49697hf2 f143770d;

    /* renamed from: e */
    public C49840if2 f143771e;

    /* renamed from: f */
    public int f143772f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51756vy2)) {
            return false;
        }
        C51756vy2 vy22 = (C51756vy2) aVar;
        return C46238a.m51546a(this.f143770d, vy22.f143770d) && C46238a.m51546a(this.f143771e, vy22.f143771e) && C46238a.m51546a(Integer.valueOf(this.f143772f), Integer.valueOf(vy22.f143772f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49697hf2 hf22 = this.f143770d;
            if (hf22 != null) {
                if (hf22 != null) {
                    aVar.mo74322i(1, hf22.computeSize());
                    this.f143770d.writeFields(aVar);
                }
                C49840if2 if22 = this.f143771e;
                if (if22 != null) {
                    aVar.mo74322i(2, if22.computeSize());
                    this.f143771e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f143772f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: HardDevice");
        } else if (i == 1) {
            C49697hf2 hf23 = this.f143770d;
            if (hf23 != null) {
                i2 = 0 + C52418a.m58682i(1, hf23.computeSize());
            }
            C49840if2 if23 = this.f143771e;
            if (if23 != null) {
                i2 += C52418a.m58682i(2, if23.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f143772f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f143770d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: HardDevice");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51756vy2 vy22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49697hf2 hf24 = new C49697hf2();
                    if (bArr != null && bArr.length > 0) {
                        hf24.parseFrom(bArr);
                    }
                    vy22.f143770d = hf24;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49840if2 if24 = new C49840if2();
                    if (bArr2 != null && bArr2.length > 0) {
                        if24.parseFrom(bArr2);
                    }
                    vy22.f143771e = if24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vy22.f143772f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
