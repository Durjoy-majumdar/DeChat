package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ic1 */
public class C49827ic1 extends C47465a {

    /* renamed from: d */
    public String f135204d;

    /* renamed from: e */
    public C64726td1 f135205e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49827ic1)) {
            return false;
        }
        C49827ic1 ic12 = (C49827ic1) aVar;
        return C46238a.m51546a(this.f135204d, ic12.f135204d) && C46238a.m51546a(this.f135205e, ic12.f135205e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135204d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64726td1 td12 = this.f135205e;
            if (td12 != null) {
                aVar.mo74322i(2, td12.computeSize());
                this.f135205e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f135204d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C64726td1 td13 = this.f135205e;
            return td13 != null ? i2 + C52418a.m58682i(2, td13.computeSize()) : i2;
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
            C49827ic1 ic12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ic12.f135204d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64726td1 td14 = new C64726td1();
                    if (bArr != null && bArr.length > 0) {
                        td14.parseFrom(bArr);
                    }
                    ic12.f135205e = td14;
                }
                return 0;
            }
        }
    }
}
