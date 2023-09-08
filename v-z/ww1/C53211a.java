package ww1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ww1.a */
public class C53211a extends C101820nt3 {

    /* renamed from: d */
    public C53216f f148437d;

    /* renamed from: e */
    public String f148438e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53211a)) {
            return false;
        }
        C53211a aVar2 = (C53211a) aVar;
        return C46238a.m51546a(this.BaseRequest, aVar2.BaseRequest) && C46238a.m51546a(this.f148437d, aVar2.f148437d) && C46238a.m51546a(this.f148438e, aVar2.f148438e);
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
            C53216f fVar = this.f148437d;
            if (fVar != null) {
                aVar.mo74322i(2, fVar.computeSize());
                this.f148437d.writeFields(aVar);
            }
            String str = this.f148438e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C53216f fVar2 = this.f148437d;
            if (fVar2 != null) {
                i2 += C52418a.m58682i(2, fVar2.computeSize());
            }
            String str2 = this.f148438e;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C53211a aVar4 = objArr[1];
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
                    aVar4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C53216f fVar3 = new C53216f();
                    if (bArr2 != null && bArr2.length > 0) {
                        fVar3.parseFrom(bArr2);
                    }
                    aVar4.f148437d = fVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                aVar4.f148438e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
