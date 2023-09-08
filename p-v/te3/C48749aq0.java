package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aq0 */
public class C48749aq0 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<String> f130720d = new LinkedList<>();

    /* renamed from: e */
    public C49842ig0 f130721e;

    /* renamed from: f */
    public LinkedList<String> f130722f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48749aq0)) {
            return false;
        }
        C48749aq0 aq02 = (C48749aq0) aVar;
        return C46238a.m51546a(this.BaseRequest, aq02.BaseRequest) && C46238a.m51546a(this.f130720d, aq02.f130720d) && C46238a.m51546a(this.f130721e, aq02.f130721e) && C46238a.m51546a(this.f130722f, aq02.f130722f);
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
            aVar.mo74320g(2, 1, this.f130720d);
            C49842ig0 ig02 = this.f130721e;
            if (ig02 != null) {
                aVar.mo74322i(3, ig02.computeSize());
                this.f130721e.writeFields(aVar);
            }
            aVar.mo74320g(4, 1, this.f130722f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f130720d);
            C49842ig0 ig03 = this.f130721e;
            if (ig03 != null) {
                g += C52418a.m58682i(3, ig03.computeSize());
            }
            return g + C52418a.m58680g(4, 1, this.f130722f);
        } else if (i == 2) {
            this.f130720d.clear();
            this.f130722f.clear();
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
            C48749aq0 aq02 = objArr[1];
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
                    aq02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                aq02.f130720d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    aq02.f130721e = ig04;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                aq02.f130722f.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
