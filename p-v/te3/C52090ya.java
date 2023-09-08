package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ya */
public class C52090ya extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C50289lo> f145200d = new LinkedList<>();

    /* renamed from: e */
    public xa4 f145201e;

    /* renamed from: f */
    public int f145202f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52090ya)) {
            return false;
        }
        C52090ya yaVar = (C52090ya) aVar;
        return C46238a.m51546a(this.BaseRequest, yaVar.BaseRequest) && C46238a.m51546a(this.f145200d, yaVar.f145200d) && C46238a.m51546a(this.f145201e, yaVar.f145201e) && C46238a.m51546a(Integer.valueOf(this.f145202f), Integer.valueOf(yaVar.f145202f));
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
            aVar.mo74320g(2, 8, this.f145200d);
            xa4 xa4 = this.f145201e;
            if (xa4 != null) {
                aVar.mo74322i(3, xa4.computeSize());
                this.f145201e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f145202f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f145200d);
            xa4 xa42 = this.f145201e;
            if (xa42 != null) {
                g += C52418a.m58682i(3, xa42.computeSize());
            }
            return g + C52418a.m58678e(4, this.f145202f);
        } else if (i == 2) {
            this.f145200d.clear();
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
            C52090ya yaVar = objArr[1];
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
                    yaVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50289lo loVar = new C50289lo();
                    if (bArr2 != null && bArr2.length > 0) {
                        loVar.parseFrom(bArr2);
                    }
                    yaVar.f145200d.add(loVar);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    xa4 xa43 = new xa4();
                    if (bArr3 != null && bArr3.length > 0) {
                        xa43.parseFrom(bArr3);
                    }
                    yaVar.f145201e = xa43;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                yaVar.f145202f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
