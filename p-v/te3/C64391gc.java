package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gc */
public class C64391gc extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<p55> f183299d = new LinkedList<>();

    /* renamed from: e */
    public int f183300e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64391gc)) {
            return false;
        }
        C64391gc gcVar = (C64391gc) aVar;
        return C46238a.m51546a(this.BaseRequest, gcVar.BaseRequest) && C46238a.m51546a(this.f183299d, gcVar.f183299d) && C46238a.m51546a(Integer.valueOf(this.f183300e), Integer.valueOf(gcVar.f183300e));
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
            aVar.mo74320g(2, 8, this.f183299d);
            aVar.mo74318e(3, this.f183300e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f183299d) + C52418a.m58678e(3, this.f183300e);
        } else if (i == 2) {
            this.f183299d.clear();
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
            C64391gc gcVar = objArr[1];
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
                    gcVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    p55 p55 = new p55();
                    if (bArr2 != null && bArr2.length > 0) {
                        p55.parseFrom(bArr2);
                    }
                    gcVar.f183299d.add(p55);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                gcVar.f183300e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
