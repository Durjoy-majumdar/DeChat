package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g14 */
public class C49500g14 extends C101820nt3 {

    /* renamed from: d */
    public String f133789d;

    /* renamed from: e */
    public long f133790e;

    /* renamed from: f */
    public long f133791f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49500g14)) {
            return false;
        }
        C49500g14 g142 = (C49500g14) aVar;
        return C46238a.m51546a(this.BaseRequest, g142.BaseRequest) && C46238a.m51546a(this.f133789d, g142.f133789d) && C46238a.m51546a(Long.valueOf(this.f133790e), Long.valueOf(g142.f133790e)) && C46238a.m51546a(Long.valueOf(this.f133791f), Long.valueOf(g142.f133791f));
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
            String str = this.f133789d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f133790e);
            aVar.mo74321h(4, this.f133791f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f133789d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58681h(3, this.f133790e) + C52418a.m58681h(4, this.f133791f);
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
            C49500g14 g142 = objArr[1];
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
                    g142.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                g142.f133789d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                g142.f133790e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                g142.f133791f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
