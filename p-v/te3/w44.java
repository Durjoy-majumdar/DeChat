package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w44 extends C47465a {

    /* renamed from: d */
    public C48714ah2 f143855d;

    /* renamed from: e */
    public u44 f143856e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w44)) {
            return false;
        }
        w44 w44 = (w44) aVar;
        return C46238a.m51546a(this.f143855d, w44.f143855d) && C46238a.m51546a(this.f143856e, w44.f143856e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48714ah2 ah22 = this.f143855d;
            if (ah22 != null) {
                aVar.mo74322i(1, ah22.computeSize());
                this.f143855d.writeFields(aVar);
            }
            u44 u44 = this.f143856e;
            if (u44 != null) {
                aVar.mo74322i(2, u44.computeSize());
                this.f143856e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48714ah2 ah23 = this.f143855d;
            if (ah23 != null) {
                i2 = 0 + C52418a.m58682i(1, ah23.computeSize());
            }
            u44 u442 = this.f143856e;
            return u442 != null ? i2 + C52418a.m58682i(2, u442.computeSize()) : i2;
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
            w44 w44 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48714ah2 ah24 = new C48714ah2();
                    if (bArr != null && bArr.length > 0) {
                        ah24.parseFrom(bArr);
                    }
                    w44.f143855d = ah24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    u44 u443 = new u44();
                    if (bArr2 != null && bArr2.length > 0) {
                        u443.parseFrom(bArr2);
                    }
                    w44.f143856e = u443;
                }
                return 0;
            }
        }
    }
}
