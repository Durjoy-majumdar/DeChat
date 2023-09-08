package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yj0 */
public class C52123yj0 extends C47465a {

    /* renamed from: d */
    public FinderContact f145323d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52123yj0) && C46238a.m51546a(this.f145323d, ((C52123yj0) aVar).f145323d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f145323d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f145323d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f145323d;
            if (finderContact2 != null) {
                return 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            return 0;
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
            C52123yj0 yj02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                FinderContact finderContact3 = new FinderContact();
                if (bArr != null && bArr.length > 0) {
                    finderContact3.parseFrom(bArr);
                }
                yj02.f145323d = finderContact3;
            }
            return 0;
        }
    }
}
