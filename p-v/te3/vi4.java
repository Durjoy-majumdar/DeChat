package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class vi4 extends C101820nt3 {

    /* renamed from: d */
    public int f185910d;

    /* renamed from: e */
    public String f185911e;

    /* renamed from: f */
    public C101766ct2 f185912f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vi4)) {
            return false;
        }
        vi4 vi4 = (vi4) aVar;
        return C46238a.m51546a(this.BaseRequest, vi4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f185910d), Integer.valueOf(vi4.f185910d)) && C46238a.m51546a(this.f185911e, vi4.f185911e) && C46238a.m51546a(this.f185912f, vi4.f185912f);
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
            aVar.mo74318e(2, this.f185910d);
            String str = this.f185911e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C101766ct2 ct22 = this.f185912f;
            if (ct22 != null) {
                aVar.mo74322i(4, ct22.computeSize());
                this.f185912f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185910d);
            String str2 = this.f185911e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C101766ct2 ct23 = this.f185912f;
            return ct23 != null ? e + C52418a.m58682i(4, ct23.computeSize()) : e;
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
            vi4 vi4 = objArr[1];
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
                    vi4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                vi4.f185910d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                vi4.f185911e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101766ct2 ct24 = new C101766ct2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ct24.parseFrom(bArr2);
                    }
                    vi4.f185912f = ct24;
                }
                return 0;
            }
        }
    }
}
