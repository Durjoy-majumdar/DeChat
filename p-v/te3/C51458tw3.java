package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tw3 */
public class C51458tw3 extends C47465a {

    /* renamed from: d */
    public String f142456d;

    /* renamed from: e */
    public C51608uw3 f142457e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51458tw3)) {
            return false;
        }
        C51458tw3 tw32 = (C51458tw3) aVar;
        return C46238a.m51546a(this.f142456d, tw32.f142456d) && C46238a.m51546a(this.f142457e, tw32.f142457e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142456d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51608uw3 uw32 = this.f142457e;
            if (uw32 != null) {
                aVar.mo74322i(2, uw32.computeSize());
                this.f142457e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f142456d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C51608uw3 uw33 = this.f142457e;
            return uw33 != null ? i2 + C52418a.m58682i(2, uw33.computeSize()) : i2;
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
            C51458tw3 tw32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tw32.f142456d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51608uw3 uw34 = new C51608uw3();
                    if (bArr != null && bArr.length > 0) {
                        uw34.parseFrom(bArr);
                    }
                    tw32.f142457e = uw34;
                }
                return 0;
            }
        }
    }
}
