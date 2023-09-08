package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class c55 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<j55> f259439d = new LinkedList<>();

    /* renamed from: e */
    public C90447wr3 f259440e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c55)) {
            return false;
        }
        c55 c55 = (c55) aVar;
        return C46238a.m51546a(this.BaseRequest, c55.BaseRequest) && C46238a.m51546a(this.f259439d, c55.f259439d) && C46238a.m51546a(this.f259440e, c55.f259440e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f259439d);
            C90447wr3 wr32 = this.f259440e;
            if (wr32 != null) {
                aVar.mo74322i(3, wr32.computeSize());
                this.f259440e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f259439d);
            C90447wr3 wr33 = this.f259440e;
            return wr33 != null ? g + C52418a.m58682i(3, wr33.computeSize()) : g;
        } else if (i == 2) {
            this.f259439d.clear();
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
            c55 c55 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    c55.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    j55 j55 = new j55();
                    if (bArr2 != null && bArr2.length > 0) {
                        j55.parseFrom(bArr2);
                    }
                    c55.f259439d.add(j55);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C90447wr3 wr34 = new C90447wr3();
                    if (bArr3 != null && bArr3.length > 0) {
                        wr34.parseFrom(bArr3);
                    }
                    c55.f259440e = wr34;
                }
                return 0;
            }
        }
    }
}
