package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wa0 */
public class C51806wa0 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f143945d;

    /* renamed from: e */
    public int f143946e;

    /* renamed from: f */
    public int f143947f;

    /* renamed from: g */
    public int f143948g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51806wa0)) {
            return false;
        }
        C51806wa0 wa02 = (C51806wa0) aVar;
        return C46238a.m51546a(this.BaseRequest, wa02.BaseRequest) && C46238a.m51546a(this.f143945d, wa02.f143945d) && C46238a.m51546a(Integer.valueOf(this.f143946e), Integer.valueOf(wa02.f143946e)) && C46238a.m51546a(Integer.valueOf(this.f143947f), Integer.valueOf(wa02.f143947f)) && C46238a.m51546a(Integer.valueOf(this.f143948g), Integer.valueOf(wa02.f143948g));
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
            C89349b bVar = this.f143945d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f143946e);
            aVar.mo74318e(4, this.f143947f);
            aVar.mo74318e(5, this.f143948g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f143945d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58678e(3, this.f143946e) + C52418a.m58678e(4, this.f143947f) + C52418a.m58678e(5, this.f143948g);
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
            C51806wa0 wa02 = objArr[1];
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
                    wa02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                wa02.f143945d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                wa02.f143946e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                wa02.f143947f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                wa02.f143948g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
