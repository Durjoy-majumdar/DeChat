package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: te3.oa */
public class C50652oa extends C101820nt3 {

    /* renamed from: d */
    public int f139054d;

    /* renamed from: e */
    public LinkedList<Integer> f139055e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50652oa)) {
            return false;
        }
        C50652oa oaVar = (C50652oa) aVar;
        return C46238a.m51546a(this.BaseRequest, oaVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139054d), Integer.valueOf(oaVar.f139054d)) && C46238a.m51546a(this.f139055e, oaVar.f139055e);
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
            aVar.mo74318e(2, this.f139054d);
            aVar.mo74324k(3, 2, this.f139055e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f139054d) + C52418a.m58684k(3, 2, this.f139055e);
        } else if (i == 2) {
            this.f139055e.clear();
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
            C50652oa oaVar = objArr[1];
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
                    oaVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                oaVar.f139054d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                byte[] bArr2 = aVar3.mo141626d(intValue).f257327a;
                C102536a aVar4 = new C102536a(bArr2, 0, bArr2.length);
                LinkedList<Integer> linkedList = new LinkedList<>();
                while (aVar4.f301908c < aVar4.f301907b) {
                    linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                }
                oaVar.f139055e = linkedList;
                return 0;
            }
        }
    }
}
