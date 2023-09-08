package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kw3 */
public class C64502kw3 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<String> f183989d = new LinkedList<>();

    /* renamed from: e */
    public boolean f183990e;

    /* renamed from: f */
    public C64852yd f183991f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64502kw3)) {
            return false;
        }
        C64502kw3 kw32 = (C64502kw3) aVar;
        return C46238a.m51546a(this.BaseRequest, kw32.BaseRequest) && C46238a.m51546a(this.f183989d, kw32.f183989d) && C46238a.m51546a(Boolean.valueOf(this.f183990e), Boolean.valueOf(kw32.f183990e)) && C46238a.m51546a(this.f183991f, kw32.f183991f);
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
            aVar.mo74320g(2, 1, this.f183989d);
            aVar.mo74314a(3, this.f183990e);
            C64852yd ydVar = this.f183991f;
            if (ydVar != null) {
                aVar.mo74322i(4, ydVar.computeSize());
                this.f183991f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f183989d) + C52418a.m58674a(3, this.f183990e);
            C64852yd ydVar2 = this.f183991f;
            return ydVar2 != null ? g + C52418a.m58682i(4, ydVar2.computeSize()) : g;
        } else if (i == 2) {
            this.f183989d.clear();
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
            C64502kw3 kw32 = objArr[1];
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
                    kw32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                kw32.f183989d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                kw32.f183990e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64852yd ydVar3 = new C64852yd();
                    if (bArr2 != null && bArr2.length > 0) {
                        ydVar3.parseFrom(bArr2);
                    }
                    kw32.f183991f = ydVar3;
                }
                return 0;
            }
        }
    }
}
