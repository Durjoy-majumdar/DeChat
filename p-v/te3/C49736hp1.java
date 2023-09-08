package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hp1 */
public class C49736hp1 extends C47465a {

    /* renamed from: d */
    public FinderContact f134805d;

    /* renamed from: e */
    public int f134806e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49736hp1)) {
            return false;
        }
        C49736hp1 hp12 = (C49736hp1) aVar;
        return C46238a.m51546a(this.f134805d, hp12.f134805d) && C46238a.m51546a(Integer.valueOf(this.f134806e), Integer.valueOf(hp12.f134806e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f134805d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f134805d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f134806e);
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f134805d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f134806e);
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
            C49736hp1 hp12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr != null && bArr.length > 0) {
                        finderContact3.parseFrom(bArr);
                    }
                    hp12.f134805d = finderContact3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                hp12.f134806e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
