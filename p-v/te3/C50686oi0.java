package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oi0 */
public class C50686oi0 extends C47465a {

    /* renamed from: d */
    public FinderContact f139194d;

    /* renamed from: e */
    public String f139195e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50686oi0)) {
            return false;
        }
        C50686oi0 oi02 = (C50686oi0) aVar;
        return C46238a.m51546a(this.f139194d, oi02.f139194d) && C46238a.m51546a(this.f139195e, oi02.f139195e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f139194d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f139194d.writeFields(aVar);
            }
            String str = this.f139195e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f139194d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            String str2 = this.f139195e;
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
            C50686oi0 oi02 = objArr[1];
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
                    oi02.f139194d = finderContact3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                oi02.f139195e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
