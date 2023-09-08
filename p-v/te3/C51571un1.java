package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.un1 */
public class C51571un1 extends C47465a {

    /* renamed from: d */
    public C51270sn1 f142961d;

    /* renamed from: e */
    public String f142962e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51571un1)) {
            return false;
        }
        C51571un1 un12 = (C51571un1) aVar;
        return C46238a.m51546a(this.f142961d, un12.f142961d) && C46238a.m51546a(this.f142962e, un12.f142962e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51270sn1 sn12 = this.f142961d;
            if (sn12 != null) {
                aVar.mo74322i(1, sn12.computeSize());
                this.f142961d.writeFields(aVar);
            }
            String str = this.f142962e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C51270sn1 sn13 = this.f142961d;
            if (sn13 != null) {
                i2 = 0 + C52418a.m58682i(1, sn13.computeSize());
            }
            String str2 = this.f142962e;
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
            C51571un1 un12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51270sn1 sn14 = new C51270sn1();
                    if (bArr != null && bArr.length > 0) {
                        sn14.parseFrom(bArr);
                    }
                    un12.f142961d = sn14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                un12.f142962e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
