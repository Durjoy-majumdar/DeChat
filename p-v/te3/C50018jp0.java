package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jp0 */
public class C50018jp0 extends C47465a {

    /* renamed from: d */
    public String f136235d;

    /* renamed from: e */
    public db4 f136236e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50018jp0)) {
            return false;
        }
        C50018jp0 jp02 = (C50018jp0) aVar;
        return C46238a.m51546a(this.f136235d, jp02.f136235d) && C46238a.m51546a(this.f136236e, jp02.f136236e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136235d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            db4 db4 = this.f136236e;
            if (db4 != null) {
                aVar.mo74322i(2, db4.computeSize());
                this.f136236e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f136235d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            db4 db42 = this.f136236e;
            return db42 != null ? i2 + C52418a.m58682i(2, db42.computeSize()) : i2;
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
            C50018jp0 jp02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jp02.f136235d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    db4 db43 = new db4();
                    if (bArr != null && bArr.length > 0) {
                        db43.parseFrom(bArr);
                    }
                    jp02.f136236e = db43;
                }
                return 0;
            }
        }
    }
}
