package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class e44 extends C101820nt3 {

    /* renamed from: d */
    public String f132688d;

    /* renamed from: e */
    public int f132689e;

    /* renamed from: f */
    public int f132690f;

    /* renamed from: g */
    public LinkedList<Integer> f132691g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof e44)) {
            return false;
        }
        e44 e44 = (e44) aVar;
        return C46238a.m51546a(this.BaseRequest, e44.BaseRequest) && C46238a.m51546a(this.f132688d, e44.f132688d) && C46238a.m51546a(Integer.valueOf(this.f132689e), Integer.valueOf(e44.f132689e)) && C46238a.m51546a(Integer.valueOf(this.f132690f), Integer.valueOf(e44.f132690f)) && C46238a.m51546a(this.f132691g, e44.f132691g);
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
            String str = this.f132688d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f132689e);
            aVar.mo74318e(4, this.f132690f);
            aVar.mo74324k(5, 2, this.f132691g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f132688d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f132689e) + C52418a.m58678e(4, this.f132690f) + C52418a.m58684k(5, 2, this.f132691g);
        } else if (i == 2) {
            this.f132691g.clear();
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
            e44 e44 = objArr[1];
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
                    e44.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                e44.f132688d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                e44.f132689e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                e44.f132690f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                LinkedList<Integer> linkedList = new LinkedList<>();
                while (aVar4.f301908c < aVar4.f301907b) {
                    linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                }
                e44.f132691g = linkedList;
                return 0;
            }
        }
    }
}
