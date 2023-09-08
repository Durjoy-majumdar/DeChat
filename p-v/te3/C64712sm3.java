package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sm3 */
public class C64712sm3 extends C47465a {

    /* renamed from: d */
    public int f185430d;

    /* renamed from: e */
    public LinkedList<C118470tm3> f185431e = new LinkedList<>();

    /* renamed from: f */
    public int f185432f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64712sm3)) {
            return false;
        }
        C64712sm3 sm32 = (C64712sm3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185430d), Integer.valueOf(sm32.f185430d)) && C46238a.m51546a(this.f185431e, sm32.f185431e) && C46238a.m51546a(Integer.valueOf(this.f185432f), Integer.valueOf(sm32.f185432f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185430d);
            aVar.mo74320g(2, 8, this.f185431e);
            aVar.mo74318e(3, this.f185432f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f185430d) + 0 + C52418a.m58680g(2, 8, this.f185431e) + C52418a.m58678e(3, this.f185432f);
        } else {
            if (i == 2) {
                this.f185431e.clear();
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
                C64712sm3 sm32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    sm32.f185430d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C118470tm3 tm32 = new C118470tm3();
                        if (bArr != null && bArr.length > 0) {
                            tm32.parseFrom(bArr);
                        }
                        sm32.f185431e.add(tm32);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    sm32.f185432f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
