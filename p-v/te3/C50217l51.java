package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l51 */
public class C50217l51 extends C47465a {

    /* renamed from: d */
    public C52294zq0 f137181d;

    /* renamed from: e */
    public C51828wg0 f137182e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50217l51)) {
            return false;
        }
        C50217l51 l512 = (C50217l51) aVar;
        return C46238a.m51546a(this.f137181d, l512.f137181d) && C46238a.m51546a(this.f137182e, l512.f137182e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52294zq0 zq02 = this.f137181d;
            if (zq02 != null) {
                aVar.mo74322i(1, zq02.computeSize());
                this.f137181d.writeFields(aVar);
            }
            C51828wg0 wg02 = this.f137182e;
            if (wg02 != null) {
                aVar.mo74322i(2, wg02.computeSize());
                this.f137182e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C52294zq0 zq03 = this.f137181d;
            if (zq03 != null) {
                i2 = 0 + C52418a.m58682i(1, zq03.computeSize());
            }
            C51828wg0 wg03 = this.f137182e;
            return wg03 != null ? i2 + C52418a.m58682i(2, wg03.computeSize()) : i2;
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
            C50217l51 l512 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52294zq0 zq04 = new C52294zq0();
                    if (bArr != null && bArr.length > 0) {
                        zq04.parseFrom(bArr);
                    }
                    l512.f137181d = zq04;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51828wg0 wg04 = new C51828wg0();
                    if (bArr2 != null && bArr2.length > 0) {
                        wg04.parseFrom(bArr2);
                    }
                    l512.f137182e = wg04;
                }
                return 0;
            }
        }
    }
}
