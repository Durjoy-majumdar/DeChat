package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m50 */
public class C50354m50 extends C101820nt3 {

    /* renamed from: d */
    public C52089y93 f137838d;

    /* renamed from: e */
    public int f137839e;

    /* renamed from: f */
    public int f137840f;

    /* renamed from: g */
    public int f137841g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50354m50)) {
            return false;
        }
        C50354m50 m502 = (C50354m50) aVar;
        return C46238a.m51546a(this.BaseRequest, m502.BaseRequest) && C46238a.m51546a(this.f137838d, m502.f137838d) && C46238a.m51546a(Integer.valueOf(this.f137839e), Integer.valueOf(m502.f137839e)) && C46238a.m51546a(Integer.valueOf(this.f137840f), Integer.valueOf(m502.f137840f)) && C46238a.m51546a(Integer.valueOf(this.f137841g), Integer.valueOf(m502.f137841g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137838d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C52089y93 y932 = this.f137838d;
                if (y932 != null) {
                    aVar.mo74322i(2, y932.computeSize());
                    this.f137838d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f137839e);
                aVar.mo74318e(4, this.f137840f);
                aVar.mo74318e(5, this.f137841g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Package");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C52089y93 y933 = this.f137838d;
            if (y933 != null) {
                i2 += C52418a.m58682i(2, y933.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f137839e) + C52418a.m58678e(4, this.f137840f) + C52418a.m58678e(5, this.f137841g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137838d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Package");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50354m50 m502 = objArr[1];
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
                    m502.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52089y93 y934 = new C52089y93();
                    if (bArr2 != null && bArr2.length > 0) {
                        y934.parseFrom(bArr2);
                    }
                    m502.f137838d = y934;
                }
                return 0;
            } else if (intValue == 3) {
                m502.f137839e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                m502.f137840f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                m502.f137841g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
