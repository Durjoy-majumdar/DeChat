package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ct4 extends C101820nt3 {

    /* renamed from: d */
    public String f131955d;

    /* renamed from: e */
    public C89349b f131956e;

    /* renamed from: f */
    public et4 f131957f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ct4)) {
            return false;
        }
        ct4 ct4 = (ct4) aVar;
        return C46238a.m51546a(this.BaseRequest, ct4.BaseRequest) && C46238a.m51546a(this.f131955d, ct4.f131955d) && C46238a.m51546a(this.f131956e, ct4.f131956e) && C46238a.m51546a(this.f131957f, ct4.f131957f);
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
            String str = this.f131955d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f131956e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            et4 et4 = this.f131957f;
            if (et4 != null) {
                aVar.mo74322i(4, et4.computeSize());
                this.f131957f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f131955d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f131956e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            et4 et42 = this.f131957f;
            return et42 != null ? i2 + C52418a.m58682i(4, et42.computeSize()) : i2;
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
            ct4 ct4 = objArr[1];
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
                    ct4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ct4.f131955d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ct4.f131956e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    et4 et43 = new et4();
                    if (bArr2 != null && bArr2.length > 0) {
                        et43.parseFrom(bArr2);
                    }
                    ct4.f131957f = et43;
                }
                return 0;
            }
        }
    }
}
