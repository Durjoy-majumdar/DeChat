package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t41 */
public class C51343t41 extends C47465a {

    /* renamed from: d */
    public C64674r41 f141953d;

    /* renamed from: e */
    public String f141954e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51343t41)) {
            return false;
        }
        C51343t41 t412 = (C51343t41) aVar;
        return C46238a.m51546a(this.f141953d, t412.f141953d) && C46238a.m51546a(this.f141954e, t412.f141954e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64674r41 r412 = this.f141953d;
            if (r412 != null) {
                aVar.mo74322i(1, r412.computeSize());
                this.f141953d.writeFields(aVar);
            }
            String str = this.f141954e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C64674r41 r413 = this.f141953d;
            if (r413 != null) {
                i2 = 0 + C52418a.m58682i(1, r413.computeSize());
            }
            String str2 = this.f141954e;
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
            C51343t41 t412 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64674r41 r414 = new C64674r41();
                    if (bArr != null && bArr.length > 0) {
                        r414.parseFrom(bArr);
                    }
                    t412.f141953d = r414;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                t412.f141954e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
