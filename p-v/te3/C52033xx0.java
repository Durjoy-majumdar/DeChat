package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xx0 */
public class C52033xx0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48682a91> f145011d = new LinkedList<>();

    /* renamed from: e */
    public C50497n51 f145012e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52033xx0)) {
            return false;
        }
        C52033xx0 xx02 = (C52033xx0) aVar;
        return C46238a.m51546a(this.BaseResponse, xx02.BaseResponse) && C46238a.m51546a(this.f145011d, xx02.f145011d) && C46238a.m51546a(this.f145012e, xx02.f145012e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f145011d);
            C50497n51 n512 = this.f145012e;
            if (n512 != null) {
                aVar.mo74322i(3, n512.computeSize());
                this.f145012e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f145011d);
            C50497n51 n513 = this.f145012e;
            return n513 != null ? g + C52418a.m58682i(3, n513.computeSize()) : g;
        } else if (i == 2) {
            this.f145011d.clear();
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
            C52033xx0 xx02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    xx02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48682a91 a912 = new C48682a91();
                    if (bArr2 != null && bArr2.length > 0) {
                        a912.parseFrom(bArr2);
                    }
                    xx02.f145011d.add(a912);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50497n51 n514 = new C50497n51();
                    if (bArr3 != null && bArr3.length > 0) {
                        n514.parseFrom(bArr3);
                    }
                    xx02.f145012e = n514;
                }
                return 0;
            }
        }
    }
}
