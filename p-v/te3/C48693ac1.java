package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ac1 */
public class C48693ac1 extends C47465a {

    /* renamed from: d */
    public C50882pv2 f130427d;

    /* renamed from: e */
    public FinderContact f130428e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48693ac1)) {
            return false;
        }
        C48693ac1 ac12 = (C48693ac1) aVar;
        return C46238a.m51546a(this.f130427d, ac12.f130427d) && C46238a.m51546a(this.f130428e, ac12.f130428e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50882pv2 pv22 = this.f130427d;
            if (pv22 != null) {
                aVar.mo74322i(1, pv22.computeSize());
                this.f130427d.writeFields(aVar);
            }
            FinderContact finderContact = this.f130428e;
            if (finderContact != null) {
                aVar.mo74322i(2, finderContact.computeSize());
                this.f130428e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C50882pv2 pv23 = this.f130427d;
            if (pv23 != null) {
                i2 = 0 + C52418a.m58682i(1, pv23.computeSize());
            }
            FinderContact finderContact2 = this.f130428e;
            return finderContact2 != null ? i2 + C52418a.m58682i(2, finderContact2.computeSize()) : i2;
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
            C48693ac1 ac12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50882pv2 pv24 = new C50882pv2();
                    if (bArr != null && bArr.length > 0) {
                        pv24.parseFrom(bArr);
                    }
                    ac12.f130427d = pv24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContact3.parseFrom(bArr2);
                    }
                    ac12.f130428e = finderContact3;
                }
                return 0;
            }
        }
    }
}
