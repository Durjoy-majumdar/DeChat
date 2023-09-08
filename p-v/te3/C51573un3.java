package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.un3 */
public class C51573un3 extends C47465a {

    /* renamed from: d */
    public g84 f142966d;

    /* renamed from: e */
    public C51163rv3 f142967e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51573un3)) {
            return false;
        }
        C51573un3 un32 = (C51573un3) aVar;
        return C46238a.m51546a(this.f142966d, un32.f142966d) && C46238a.m51546a(this.f142967e, un32.f142967e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            g84 g84 = this.f142966d;
            if (g84 != null) {
                if (g84 != null) {
                    aVar.mo74322i(1, g84.computeSize());
                    this.f142966d.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f142967e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f142967e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsRecommendObject");
        } else if (i == 1) {
            g84 g842 = this.f142966d;
            if (g842 != null) {
                i2 = 0 + C52418a.m58682i(1, g842.computeSize());
            }
            C51163rv3 rv33 = this.f142967e;
            return rv33 != null ? i2 + C52418a.m58682i(2, rv33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142966d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SnsRecommendObject");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51573un3 un32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    g84 g843 = new g84();
                    if (bArr != null && bArr.length > 0) {
                        g843.parseFrom(bArr);
                    }
                    un32.f142966d = g843;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv34.mo73356d(bArr2);
                    }
                    un32.f142967e = rv34;
                }
                return 0;
            }
        }
    }
}
