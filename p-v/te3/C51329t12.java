package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t12 */
public class C51329t12 extends C101820nt3 {

    /* renamed from: d */
    public String f141899d;

    /* renamed from: e */
    public C118476wb3 f141900e;

    /* renamed from: f */
    public boolean f141901f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51329t12)) {
            return false;
        }
        C51329t12 t122 = (C51329t12) aVar;
        return C46238a.m51546a(this.BaseRequest, t122.BaseRequest) && C46238a.m51546a(this.f141899d, t122.f141899d) && C46238a.m51546a(this.f141900e, t122.f141900e) && C46238a.m51546a(Boolean.valueOf(this.f141901f), Boolean.valueOf(t122.f141901f));
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
            String str = this.f141899d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C118476wb3 wb32 = this.f141900e;
            if (wb32 != null) {
                aVar.mo74322i(3, wb32.computeSize());
                this.f141900e.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f141901f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f141899d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C118476wb3 wb33 = this.f141900e;
            if (wb33 != null) {
                i2 += C52418a.m58682i(3, wb33.computeSize());
            }
            return i2 + C52418a.m58674a(4, this.f141901f);
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
            C51329t12 t122 = objArr[1];
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
                    t122.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                t122.f141899d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C118476wb3 wb34 = new C118476wb3();
                    if (bArr2 != null && bArr2.length > 0) {
                        wb34.parseFrom(bArr2);
                    }
                    t122.f141900e = wb34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                t122.f141901f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
