package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.si0 */
public class C51248si0 extends C47465a {

    /* renamed from: d */
    public FinderContact f141536d;

    /* renamed from: e */
    public LinkedList<String> f141537e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51248si0)) {
            return false;
        }
        C51248si0 si02 = (C51248si0) aVar;
        return C46238a.m51546a(this.f141536d, si02.f141536d) && C46238a.m51546a(this.f141537e, si02.f141537e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f141536d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f141536d.writeFields(aVar);
            }
            aVar.mo74320g(2, 1, this.f141537e);
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f141536d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 1, this.f141537e);
        } else if (i == 2) {
            this.f141537e.clear();
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
            C51248si0 si02 = objArr[1];
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
                    si02.f141536d = finderContact3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                si02.f141537e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
