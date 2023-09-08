package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ee1 */
public class C49272ee1 extends C47465a {

    /* renamed from: d */
    public LinkedList<FinderContact> f132884d = new LinkedList<>();

    /* renamed from: e */
    public String f132885e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49272ee1)) {
            return false;
        }
        C49272ee1 ee12 = (C49272ee1) aVar;
        return C46238a.m51546a(this.f132884d, ee12.f132884d) && C46238a.m51546a(this.f132885e, ee12.f132885e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f132884d);
            String str = this.f132885e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f132884d) + 0;
            String str2 = this.f132885e;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.f132884d.clear();
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
            C49272ee1 ee12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderContact finderContact = new FinderContact();
                    if (bArr != null && bArr.length > 0) {
                        finderContact.parseFrom(bArr);
                    }
                    ee12.f132884d.add(finderContact);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ee12.f132885e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
