package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ix2 */
public class C64457ix2 extends C47465a {

    /* renamed from: d */
    public C64405gx2 f183747d;

    /* renamed from: e */
    public String f183748e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64457ix2)) {
            return false;
        }
        C64457ix2 ix22 = (C64457ix2) aVar;
        return C46238a.m51546a(this.f183747d, ix22.f183747d) && C46238a.m51546a(this.f183748e, ix22.f183748e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64405gx2 gx22 = this.f183747d;
            if (gx22 != null) {
                aVar.mo74322i(1, gx22.computeSize());
                this.f183747d.writeFields(aVar);
            }
            String str = this.f183748e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C64405gx2 gx23 = this.f183747d;
            if (gx23 != null) {
                i2 = 0 + C52418a.m58682i(1, gx23.computeSize());
            }
            String str2 = this.f183748e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C64457ix2 ix22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64405gx2 gx24 = new C64405gx2();
                    if (bArr != null && bArr.length > 0) {
                        gx24.parseFrom(bArr);
                    }
                    ix22.f183747d = gx24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ix22.f183748e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
