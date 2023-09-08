package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f51 */
public class C49381f51 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133297d;

    /* renamed from: e */
    public String f133298e;

    /* renamed from: f */
    public String f133299f;

    /* renamed from: g */
    public int f133300g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49381f51)) {
            return false;
        }
        C49381f51 f512 = (C49381f51) aVar;
        return C46238a.m51546a(this.BaseRequest, f512.BaseRequest) && C46238a.m51546a(this.f133297d, f512.f133297d) && C46238a.m51546a(this.f133298e, f512.f133298e) && C46238a.m51546a(this.f133299f, f512.f133299f) && C46238a.m51546a(Integer.valueOf(this.f133300g), Integer.valueOf(f512.f133300g));
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
            C49842ig0 ig02 = this.f133297d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133297d.writeFields(aVar);
            }
            String str = this.f133298e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f133299f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f133300g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133297d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f133298e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f133299f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            return i2 + C52418a.m58678e(5, this.f133300g);
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
            C49381f51 f512 = objArr[1];
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
                    f512.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    f512.f133297d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                f512.f133298e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                f512.f133299f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                f512.f133300g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
